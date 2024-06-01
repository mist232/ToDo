// Generated by view binder compiler. Do not edit!
package com.example.todo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todo.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTaskBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final TextInputEditText dateEdt;

  @NonNull
  public final ImageView imgAddCategory;

  @NonNull
  public final FloatingActionButton saveBtn;

  @NonNull
  public final Spinner spinnerCategory;

  @NonNull
  public final TextInputEditText timeEdt;

  @NonNull
  public final TextInputLayout timeInptLay;

  @NonNull
  public final TextInputLayout titleInpLay;

  private ActivityTaskBinding(@NonNull LinearLayout rootView, @NonNull AppBarLayout appBarLayout,
      @NonNull TextInputEditText dateEdt, @NonNull ImageView imgAddCategory,
      @NonNull FloatingActionButton saveBtn, @NonNull Spinner spinnerCategory,
      @NonNull TextInputEditText timeEdt, @NonNull TextInputLayout timeInptLay,
      @NonNull TextInputLayout titleInpLay) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.dateEdt = dateEdt;
    this.imgAddCategory = imgAddCategory;
    this.saveBtn = saveBtn;
    this.spinnerCategory = spinnerCategory;
    this.timeEdt = timeEdt;
    this.timeInptLay = timeInptLay;
    this.titleInpLay = titleInpLay;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.dateEdt;
      TextInputEditText dateEdt = ViewBindings.findChildViewById(rootView, id);
      if (dateEdt == null) {
        break missingId;
      }

      id = R.id.imgAddCategory;
      ImageView imgAddCategory = ViewBindings.findChildViewById(rootView, id);
      if (imgAddCategory == null) {
        break missingId;
      }

      id = R.id.saveBtn;
      FloatingActionButton saveBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.spinnerCategory;
      Spinner spinnerCategory = ViewBindings.findChildViewById(rootView, id);
      if (spinnerCategory == null) {
        break missingId;
      }

      id = R.id.timeEdt;
      TextInputEditText timeEdt = ViewBindings.findChildViewById(rootView, id);
      if (timeEdt == null) {
        break missingId;
      }

      id = R.id.timeInptLay;
      TextInputLayout timeInptLay = ViewBindings.findChildViewById(rootView, id);
      if (timeInptLay == null) {
        break missingId;
      }

      id = R.id.titleInpLay;
      TextInputLayout titleInpLay = ViewBindings.findChildViewById(rootView, id);
      if (titleInpLay == null) {
        break missingId;
      }

      return new ActivityTaskBinding((LinearLayout) rootView, appBarLayout, dateEdt, imgAddCategory,
          saveBtn, spinnerCategory, timeEdt, timeInptLay, titleInpLay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}