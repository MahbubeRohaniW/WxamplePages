package com.example.myapplication.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.util.FontUtil;

public class YEKANRegularTextView extends androidx.appcompat.widget.AppCompatTextView {

    public YEKANRegularTextView(@NonNull Context context) {

        super(context);  setTypeface(FontUtil.getInstance(context).getYekanRegularFont());

    }

    public YEKANRegularTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
         setTypeface(FontUtil.getInstance(context).getYekanRegularFont());
    }

    public YEKANRegularTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontUtil.getInstance(context).getYekanRegularFont());

    }
}
