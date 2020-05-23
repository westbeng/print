package com.westbeng.print;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Sk Suraj
 * Email: suraj@westbeng.com
 */

public class Print {

    public static void d(Context context, String functionName, String message) {
        Log.d(context.getClass().getSimpleName(), functionName + " -> " + message);
    }

    public static void d(Context context, String functionName, String message, boolean showToast) {
        Log.d(context.getClass().getSimpleName(), functionName + " -> " + message);
        if (showToast) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }

    public static void e(Context context, String functionName, String message) {
        Log.e(context.getClass().getSimpleName(), functionName + " -> " + message);
    }

    public static void e(Context context, String functionName, String message, boolean showToast) {
        Log.e(context.getClass().getSimpleName(), functionName + " -> " + message);
        if (showToast) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
