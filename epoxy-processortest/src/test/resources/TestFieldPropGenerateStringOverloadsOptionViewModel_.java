package com.airbnb.epoxy;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.PluralsRes;
import android.support.annotation.StringRes;
import android.view.ViewGroup;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.util.BitSet;

/**
 * Generated file. Do not modify! */
public class TestFieldPropGenerateStringOverloadsOptionViewModel_ extends EpoxyModel<TestFieldPropGenerateStringOverloadsOptionView> implements GeneratedModel<TestFieldPropGenerateStringOverloadsOptionView>, TestFieldPropGenerateStringOverloadsOptionViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(1);

  private OnModelBoundListener<TestFieldPropGenerateStringOverloadsOptionViewModel_, TestFieldPropGenerateStringOverloadsOptionView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<TestFieldPropGenerateStringOverloadsOptionViewModel_, TestFieldPropGenerateStringOverloadsOptionView> onModelUnboundListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  private StringAttributeData value_StringAttributeData =  new StringAttributeData();

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for value");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected TestFieldPropGenerateStringOverloadsOptionView buildView(ViewGroup parent) {
    TestFieldPropGenerateStringOverloadsOptionView v = new TestFieldPropGenerateStringOverloadsOptionView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.WRAP_CONTENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder,
      final TestFieldPropGenerateStringOverloadsOptionView object, int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final TestFieldPropGenerateStringOverloadsOptionView object) {
    super.bind(object);
    object.value = value_StringAttributeData.toString(object.getContext());
  }

  @Override
  public void bind(final TestFieldPropGenerateStringOverloadsOptionView object,
      EpoxyModel previousModel) {
    if (!(previousModel instanceof TestFieldPropGenerateStringOverloadsOptionViewModel_)) {
      bind(object);
      return;
    }
    TestFieldPropGenerateStringOverloadsOptionViewModel_ that = (TestFieldPropGenerateStringOverloadsOptionViewModel_) previousModel;
    super.bind(object);

    if ((value_StringAttributeData != null ? !value_StringAttributeData.equals(that.value_StringAttributeData) : that.value_StringAttributeData != null)) {
      object.value = value_StringAttributeData.toString(object.getContext());
    }
  }

  @Override
  public void handlePostBind(final TestFieldPropGenerateStringOverloadsOptionView object,
      int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
    object.call();
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ onBind(OnModelBoundListener<TestFieldPropGenerateStringOverloadsOptionViewModel_, TestFieldPropGenerateStringOverloadsOptionView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(TestFieldPropGenerateStringOverloadsOptionView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ onUnbind(OnModelUnboundListener<TestFieldPropGenerateStringOverloadsOptionViewModel_, TestFieldPropGenerateStringOverloadsOptionView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  public CharSequence getValue(Context context) {
    return value_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see TestFieldPropGenerateStringOverloadsOptionView#value
   */
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ value(@NonNull CharSequence value) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    if (value == null) {
      throw new IllegalArgumentException("value cannot be null");
    }
    value_StringAttributeData.setValue(value);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see TestFieldPropGenerateStringOverloadsOptionView#value
   */
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ value(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    value_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see TestFieldPropGenerateStringOverloadsOptionView#value
   */
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ value(@StringRes int stringRes,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    value_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see TestFieldPropGenerateStringOverloadsOptionView#value
   */
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ valueQuantityRes(@PluralsRes int pluralRes,
      int quantity, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    value_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ id(Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ id(CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ id(CharSequence key,
      CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ id(CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ layout(@LayoutRes int arg0) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ spanSizeOverride(@Nullable EpoxyModel.SpanSizeOverrideCallback arg0) {
    super.spanSizeOverride(arg0);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public TestFieldPropGenerateStringOverloadsOptionViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.value_StringAttributeData =  new StringAttributeData();
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof TestFieldPropGenerateStringOverloadsOptionViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    TestFieldPropGenerateStringOverloadsOptionViewModel_ that = (TestFieldPropGenerateStringOverloadsOptionViewModel_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((value_StringAttributeData != null ? !value_StringAttributeData.equals(that.value_StringAttributeData) : that.value_StringAttributeData != null)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (value_StringAttributeData != null ? value_StringAttributeData.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TestFieldPropGenerateStringOverloadsOptionViewModel_{" +
        "value_StringAttributeData=" + value_StringAttributeData +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}