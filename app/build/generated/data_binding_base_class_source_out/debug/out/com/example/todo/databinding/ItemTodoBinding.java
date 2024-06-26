// Generated by view binder compiler. Do not edit!
package com.example.todo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todo.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTodoBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final RelativeLayout item;

  @NonNull
  public final TextView textDate;

  @NonNull
  public final TextView textTime;

  @NonNull
  public final TextView txtShowCategory;

  @NonNull
  public final TextView txtShowDate;

  @NonNull
  public final TextView txtShowTime;

  @NonNull
  public final TextView txtShowTitle;

  @NonNull
  public final View viewColorTag;

  private ItemTodoBinding(@NonNull MaterialCardView rootView, @NonNull RelativeLayout item,
      @NonNull TextView textDate, @NonNull TextView textTime, @NonNull TextView txtShowCategory,
      @NonNull TextView txtShowDate, @NonNull TextView txtShowTime, @NonNull TextView txtShowTitle,
      @NonNull View viewColorTag) {
    this.rootView = rootView;
    this.item = item;
    this.textDate = textDate;
    this.textTime = textTime;
    this.txtShowCategory = txtShowCategory;
    this.txtShowDate = txtShowDate;
    this.txtShowTime = txtShowTime;
    this.txtShowTitle = txtShowTitle;
    this.viewColorTag = viewColorTag;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTodoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_todo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTodoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item;
      RelativeLayout item = ViewBindings.findChildViewById(rootView, id);
      if (item == null) {
        break missingId;
      }

      id = R.id.textDate;
      TextView textDate = ViewBindings.findChildViewById(rootView, id);
      if (textDate == null) {
        break missingId;
      }

      id = R.id.textTime;
      TextView textTime = ViewBindings.findChildViewById(rootView, id);
      if (textTime == null) {
        break missingId;
      }

      id = R.id.txtShowCategory;
      TextView txtShowCategory = ViewBindings.findChildViewById(rootView, id);
      if (txtShowCategory == null) {
        break missingId;
      }

      id = R.id.txtShowDate;
      TextView txtShowDate = ViewBindings.findChildViewById(rootView, id);
      if (txtShowDate == null) {
        break missingId;
      }

      id = R.id.txtShowTime;
      TextView txtShowTime = ViewBindings.findChildViewById(rootView, id);
      if (txtShowTime == null) {
        break missingId;
      }

      id = R.id.txtShowTitle;
      TextView txtShowTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtShowTitle == null) {
        break missingId;
      }

      id = R.id.viewColorTag;
      View viewColorTag = ViewBindings.findChildViewById(rootView, id);
      if (viewColorTag == null) {
        break missingId;
      }

      return new ItemTodoBinding((MaterialCardView) rootView, item, textDate, textTime,
          txtShowCategory, txtShowDate, txtShowTime, txtShowTitle, viewColorTag);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
