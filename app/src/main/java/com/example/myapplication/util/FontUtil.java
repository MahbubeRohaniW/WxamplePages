package com.example.myapplication.util;

import android.content.Context;
import android.graphics.Typeface;

public class FontUtil {
    private static FontUtil ourInstance;
    private Typeface font_regular;
    private Typeface font_bold;
    private Context context;

    private FontUtil(Context context) {
        this.context = context;
        font_regular = Typeface.createFromAsset(this.context.getAssets(), getPathYekanRegularFont());
        font_bold = Typeface.createFromAsset(this.context.getAssets(), getPathYekaBoldFont());
    }

    public static FontUtil getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new FontUtil(context);
        }
        return ourInstance;
    }

    public Typeface getYekanRegularFont() {
        return font_regular;
    }

    public Typeface getYekanBoldFont() {
        return font_bold;
    }

    public String getPathYekanRegularFont(){
        return "font/IRANYekanRegularMobile.ttf";
    }

    public String getPathYekaBoldFont(){
        return "font/IRANYekanMobileBold.ttf";
    }


    // ----- IRANSans font

    public Typeface getIranSansRegularFont() {
        return font_regular;
    }

    public Typeface getIranSansBoldFont() {
        return font_bold;
    }

    public String getPathIranSansRegularFont(){
        return "font/IRANSansMobile_Medium.ttf";
    }

    public String getPathIranSansBoldFont(){
        return "font/IRANSansMobile_Bold.ttf";
    }
}
