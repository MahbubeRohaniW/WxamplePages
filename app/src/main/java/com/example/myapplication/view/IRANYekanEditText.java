package com.example.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;

import com.example.myapplication.util.FontUtil;

import androidx.appcompat.widget.AppCompatEditText;

public class IRANYekanEditText extends AppCompatEditText {



    public IRANYekanEditText(Context context) {
        super(context);
        setTypeface(FontUtil.getInstance(context).getYekanRegularFont());
    }

    public IRANYekanEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontUtil.getInstance(context).getYekanRegularFont());
    }

    public IRANYekanEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontUtil.getInstance(context).getYekanRegularFont());
    }
}
