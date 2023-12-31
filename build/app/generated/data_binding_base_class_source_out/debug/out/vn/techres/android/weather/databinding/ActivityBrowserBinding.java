// Generated by view binder compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hjq.bar.TitleBar;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.techres.android.weather.R;
import vn.techres.android.weather.widget.BrowserView;
import vn.techres.android.weather.widget.StatusLayout;

public final class ActivityBrowserBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final StatusLayout hlBrowserHint;

  @NonNull
  public final ProgressBar pbBrowserProgress;

  @NonNull
  public final SmartRefreshLayout slBrowserRefresh;

  @NonNull
  public final TitleBar tvTitle;

  @NonNull
  public final BrowserView wvBrowserView;

  private ActivityBrowserBinding(@NonNull LinearLayout rootView,
      @NonNull StatusLayout hlBrowserHint, @NonNull ProgressBar pbBrowserProgress,
      @NonNull SmartRefreshLayout slBrowserRefresh, @NonNull TitleBar tvTitle,
      @NonNull BrowserView wvBrowserView) {
    this.rootView = rootView;
    this.hlBrowserHint = hlBrowserHint;
    this.pbBrowserProgress = pbBrowserProgress;
    this.slBrowserRefresh = slBrowserRefresh;
    this.tvTitle = tvTitle;
    this.wvBrowserView = wvBrowserView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBrowserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBrowserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_browser, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBrowserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.hl_browser_hint;
      StatusLayout hlBrowserHint = ViewBindings.findChildViewById(rootView, id);
      if (hlBrowserHint == null) {
        break missingId;
      }

      id = R.id.pb_browser_progress;
      ProgressBar pbBrowserProgress = ViewBindings.findChildViewById(rootView, id);
      if (pbBrowserProgress == null) {
        break missingId;
      }

      id = R.id.sl_browser_refresh;
      SmartRefreshLayout slBrowserRefresh = ViewBindings.findChildViewById(rootView, id);
      if (slBrowserRefresh == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TitleBar tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.wv_browser_view;
      BrowserView wvBrowserView = ViewBindings.findChildViewById(rootView, id);
      if (wvBrowserView == null) {
        break missingId;
      }

      return new ActivityBrowserBinding((LinearLayout) rootView, hlBrowserHint, pbBrowserProgress,
          slBrowserRefresh, tvTitle, wvBrowserView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
