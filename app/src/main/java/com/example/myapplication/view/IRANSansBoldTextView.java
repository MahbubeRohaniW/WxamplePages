package com.example.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.util.FontUtil;

public class IRANSansBoldTextView   extends androidx.appcompat.widget.AppCompatTextView {

    public IRANSansBoldTextView(@NonNull Context context) {
        super(context);  setTypeface(FontUtil.getInstance(context).getIranSansBoldFont());

    }

    public IRANSansBoldTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);setTypeface(FontUtil.getInstance(context).getIranSansBoldFont());
    }

    public IRANSansBoldTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr); setTypeface(FontUtil.getInstance(context).getIranSansBoldFont());

    }
}
