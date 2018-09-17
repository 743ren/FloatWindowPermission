package com.android.permission;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

public class ScreenUtil {

    public static int getScreenWidth(Context context) {
        Point size = new Point();
        ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getSize(size);
        return size.x;
    }

    public static int getScreenHeight(Context context) {
        Point size = new Point();
        ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getSize(size);
        return size.y;
    }

    public static int dp2px(Context context, float dp){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

}
