package com.github.axet.bookreader.widgets;

import android.content.Context;
import android.support.v7.preference.SwitchPreferenceCompat;
import android.util.AttributeSet;

import com.github.axet.bookreader.R;
import com.github.axet.bookreader.app.BookApplication;

public class WhiteBackgroundPreferenceCompat extends SwitchPreferenceCompat {
    public WhiteBackgroundPreferenceCompat(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public WhiteBackgroundPreferenceCompat(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public WhiteBackgroundPreferenceCompat(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WhiteBackgroundPreferenceCompat(Context context) {
        super(context);
    }

    public boolean isEnabled() {
        return getContext().getString(R.string.Theme_Light).equals(getSharedPreferences().getString(BookApplication.PREFERENCE_THEME, ""));
    }

    public void onResume() {
        setVisible(isEnabled());
    }
}