// Generated by view binder compiler. Do not edit!
package vn.techres.android.weather.home.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.techres.android.weather.home.R;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imvSettingLocation;

  @NonNull
  public final LinearLayout llTab;

  @NonNull
  public final Toolbar tbTT;

  @NonNull
  public final TabLayout tbTab;

  @NonNull
  public final ViewPager2 vp2Content;

  private ActivityHomeBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView imvSettingLocation, @NonNull LinearLayout llTab, @NonNull Toolbar tbTT,
      @NonNull TabLayout tbTab, @NonNull ViewPager2 vp2Content) {
    this.rootView = rootView;
    this.imvSettingLocation = imvSettingLocation;
    this.llTab = llTab;
    this.tbTT = tbTT;
    this.tbTab = tbTab;
    this.vp2Content = vp2Content;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imvSettingLocation;
      ImageView imvSettingLocation = ViewBindings.findChildViewById(rootView, id);
      if (imvSettingLocation == null) {
        break missingId;
      }

      id = R.id.llTab;
      LinearLayout llTab = ViewBindings.findChildViewById(rootView, id);
      if (llTab == null) {
        break missingId;
      }

      id = R.id.tbTT;
      Toolbar tbTT = ViewBindings.findChildViewById(rootView, id);
      if (tbTT == null) {
        break missingId;
      }

      id = R.id.tbTab;
      TabLayout tbTab = ViewBindings.findChildViewById(rootView, id);
      if (tbTab == null) {
        break missingId;
      }

      id = R.id.vp2Content;
      ViewPager2 vp2Content = ViewBindings.findChildViewById(rootView, id);
      if (vp2Content == null) {
        break missingId;
      }

      return new ActivityHomeBinding((RelativeLayout) rootView, imvSettingLocation, llTab, tbTT,
          tbTab, vp2Content);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}