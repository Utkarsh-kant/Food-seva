// Generated by view binder compiler. Do not edit!
package com.utkarsh.foodseva.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.utkarsh.foodseva.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCookedFoodBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnCookedPost;

  @NonNull
  public final TextView heading;

  @NonNull
  public final CircleImageView imgBreakfast;

  @NonNull
  public final CircleImageView imgDinner;

  @NonNull
  public final CircleImageView imgLunch;

  @NonNull
  public final LinearLayout llFoodGroup;

  @NonNull
  public final LinearLayout llTxtTime;

  @NonNull
  public final RadioButton radioBtnBreakfast;

  @NonNull
  public final RadioButton radioBtnDinner;

  @NonNull
  public final RadioButton radioBtnLunch;

  @NonNull
  public final RadioButton radioBtnNonveg;

  @NonNull
  public final RadioButton radioBtnVeg;

  @NonNull
  public final RadioGroup radioGroup1;

  @NonNull
  public final RadioGroup radioGroup2;

  @NonNull
  public final SeekBar seekbarQuantity;

  @NonNull
  public final SeekBar seekbarTime;

  @NonNull
  public final TextView txtDonate;

  @NonNull
  public final TextView txtQuantity;

  @NonNull
  public final TextView txtSeekbarQuantity;

  private FragmentCookedFoodBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnCookedPost, @NonNull TextView heading,
      @NonNull CircleImageView imgBreakfast, @NonNull CircleImageView imgDinner,
      @NonNull CircleImageView imgLunch, @NonNull LinearLayout llFoodGroup,
      @NonNull LinearLayout llTxtTime, @NonNull RadioButton radioBtnBreakfast,
      @NonNull RadioButton radioBtnDinner, @NonNull RadioButton radioBtnLunch,
      @NonNull RadioButton radioBtnNonveg, @NonNull RadioButton radioBtnVeg,
      @NonNull RadioGroup radioGroup1, @NonNull RadioGroup radioGroup2,
      @NonNull SeekBar seekbarQuantity, @NonNull SeekBar seekbarTime, @NonNull TextView txtDonate,
      @NonNull TextView txtQuantity, @NonNull TextView txtSeekbarQuantity) {
    this.rootView = rootView;
    this.btnCookedPost = btnCookedPost;
    this.heading = heading;
    this.imgBreakfast = imgBreakfast;
    this.imgDinner = imgDinner;
    this.imgLunch = imgLunch;
    this.llFoodGroup = llFoodGroup;
    this.llTxtTime = llTxtTime;
    this.radioBtnBreakfast = radioBtnBreakfast;
    this.radioBtnDinner = radioBtnDinner;
    this.radioBtnLunch = radioBtnLunch;
    this.radioBtnNonveg = radioBtnNonveg;
    this.radioBtnVeg = radioBtnVeg;
    this.radioGroup1 = radioGroup1;
    this.radioGroup2 = radioGroup2;
    this.seekbarQuantity = seekbarQuantity;
    this.seekbarTime = seekbarTime;
    this.txtDonate = txtDonate;
    this.txtQuantity = txtQuantity;
    this.txtSeekbarQuantity = txtSeekbarQuantity;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCookedFoodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCookedFoodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_cooked_food, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCookedFoodBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cooked_post;
      MaterialButton btnCookedPost = ViewBindings.findChildViewById(rootView, id);
      if (btnCookedPost == null) {
        break missingId;
      }

      id = R.id.heading;
      TextView heading = ViewBindings.findChildViewById(rootView, id);
      if (heading == null) {
        break missingId;
      }

      id = R.id.img_breakfast;
      CircleImageView imgBreakfast = ViewBindings.findChildViewById(rootView, id);
      if (imgBreakfast == null) {
        break missingId;
      }

      id = R.id.img_dinner;
      CircleImageView imgDinner = ViewBindings.findChildViewById(rootView, id);
      if (imgDinner == null) {
        break missingId;
      }

      id = R.id.img_lunch;
      CircleImageView imgLunch = ViewBindings.findChildViewById(rootView, id);
      if (imgLunch == null) {
        break missingId;
      }

      id = R.id.ll_food_group;
      LinearLayout llFoodGroup = ViewBindings.findChildViewById(rootView, id);
      if (llFoodGroup == null) {
        break missingId;
      }

      id = R.id.ll_txt_time;
      LinearLayout llTxtTime = ViewBindings.findChildViewById(rootView, id);
      if (llTxtTime == null) {
        break missingId;
      }

      id = R.id.radio_btn_breakfast;
      RadioButton radioBtnBreakfast = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnBreakfast == null) {
        break missingId;
      }

      id = R.id.radio_btn_dinner;
      RadioButton radioBtnDinner = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnDinner == null) {
        break missingId;
      }

      id = R.id.radio_btn_lunch;
      RadioButton radioBtnLunch = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnLunch == null) {
        break missingId;
      }

      id = R.id.radio_btn_nonveg;
      RadioButton radioBtnNonveg = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnNonveg == null) {
        break missingId;
      }

      id = R.id.radio_btn_veg;
      RadioButton radioBtnVeg = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnVeg == null) {
        break missingId;
      }

      id = R.id.radio_group1;
      RadioGroup radioGroup1 = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup1 == null) {
        break missingId;
      }

      id = R.id.radio_group2;
      RadioGroup radioGroup2 = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup2 == null) {
        break missingId;
      }

      id = R.id.seekbar_quantity;
      SeekBar seekbarQuantity = ViewBindings.findChildViewById(rootView, id);
      if (seekbarQuantity == null) {
        break missingId;
      }

      id = R.id.seekbar_time;
      SeekBar seekbarTime = ViewBindings.findChildViewById(rootView, id);
      if (seekbarTime == null) {
        break missingId;
      }

      id = R.id.txt_donate;
      TextView txtDonate = ViewBindings.findChildViewById(rootView, id);
      if (txtDonate == null) {
        break missingId;
      }

      id = R.id.txt_quantity;
      TextView txtQuantity = ViewBindings.findChildViewById(rootView, id);
      if (txtQuantity == null) {
        break missingId;
      }

      id = R.id.txt_seekbar_quantity;
      TextView txtSeekbarQuantity = ViewBindings.findChildViewById(rootView, id);
      if (txtSeekbarQuantity == null) {
        break missingId;
      }

      return new FragmentCookedFoodBinding((ConstraintLayout) rootView, btnCookedPost, heading,
          imgBreakfast, imgDinner, imgLunch, llFoodGroup, llTxtTime, radioBtnBreakfast,
          radioBtnDinner, radioBtnLunch, radioBtnNonveg, radioBtnVeg, radioGroup1, radioGroup2,
          seekbarQuantity, seekbarTime, txtDonate, txtQuantity, txtSeekbarQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}