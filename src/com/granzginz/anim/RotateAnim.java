package com.granzginz.anim;

import android.annotation.TargetApi;
import android.gesture.GestureOverlayView;
import android.os.Build;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.RotateAnimation;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.AdapterViewFlipper;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.DialerFilter;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.SlidingDrawer;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.StackView;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextClock;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.widget.TwoLineListItem;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import android.widget.ZoomButton;
import android.widget.ZoomControls;

public class RotateAnim extends RotateAnimation{
	float fromDegrees;
	float toDegrees;
	public RotateAnim(float fromDegrees, float toDegrees) {
		super(fromDegrees, toDegrees);
	}
	
	/**
	 * Widget
	 * @param uiXML
	 */
	public void setObject(TextView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(Button uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ToggleButton uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(CheckBox uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(RadioButton uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(CheckedTextView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(Spinner uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ProgressBar uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(SeekBar uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(QuickContactBadge uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(RadioGroup uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(RatingBar uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	public void setObject(Switch uiXML){
		uiXML.setAnimation(this);
	}
	

	/**
	 * TextField
	 * @param uiXML
	 */
	public void setObject(EditText uiXML){
		uiXML.setAnimation(this);
	}

	/**
	 * Layout
	 * @param uiXML
	 */
	@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	public void setObject(GridLayout uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(LinearLayout uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(RelativeLayout uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(FrameLayout uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(TableLayout uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(TableRow uiXML){
		uiXML.setAnimation(this);
	}

	/**
	 * space widget
	 * @param uiXML
	 */
	@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	public void setObject(Space uiXML){
		uiXML.setAnimation(this);
	}
	/**
	 * space widget support v4
	 * @param uiXML
	 */
	public void setObject(android.support.v4.widget.Space uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ListView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ExpandableListView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(GridView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ScrollView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(HorizontalScrollView uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void setObject(SearchView uiXML){
		uiXML.setAnimation(this);
	}

	@SuppressWarnings("deprecation")
	public void setObject(SlidingDrawer uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(TabHost uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(TabWidget uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(WebView uiXML){
		uiXML.setAnimation(this);
	}
	/**
	 * Image & Media
	 * @param uiXML
	 */
	public void setObject(ImageView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ImageButton uiXML){
		uiXML.setAnimation(this);
	}

	@SuppressWarnings("deprecation")
	public void setObject(Gallery uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(MediaController uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(VideoView uiXML){
		uiXML.setAnimation(this);
	}
	/**
	 * Time & Date
	 * @param uiXML
	 */
	public void setObject(TimePicker uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(DatePicker uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void setObject(CalendarView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(Chronometer uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(AnalogClock uiXML){
		uiXML.setAnimation(this);
	}

	@SuppressWarnings("deprecation")
	public void setObject(DigitalClock uiXML){
		uiXML.setAnimation(this);
	}
	/**
	 * Transition
	 * @param uiXML
	 */
	public void setObject(ImageSwitcher uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void setObject(AdapterViewFlipper uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void setObject(StackView uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(TextSwitcher uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ViewAnimator uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ViewFlipper uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ViewSwitcher uiXML){
		uiXML.setAnimation(this);
	}
	/**
	 * Advance
	 * @param uiXML
	 */
	public void setObject(View uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ViewStub uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(GestureOverlayView uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	public void setObject(TextureView uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void setObject(SurfaceView uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void setObject(NumberPicker uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ZoomButton uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(ZoomControls uiXML){
		uiXML.setAnimation(this);
	}

	public void setObject(DialerFilter uiXML){
		uiXML.setAnimation(this);
	}

	@SuppressWarnings("deprecation")
	public void setObject(TwoLineListItem uiXML){
		uiXML.setAnimation(this);
	}

	@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
	@SuppressWarnings("deprecation")
	public void setObject(AbsoluteLayout uiXML){
		uiXML.setAnimation(this);
	}
	/**
	 * Other
	 * @param uiXML
	 */
	@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
	public void setObject(TextClock uiXML){
		uiXML.setAnimation(this);
	}
}
