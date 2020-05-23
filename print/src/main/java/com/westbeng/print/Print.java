package com.westbeng.print;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Sk Suraj
 * Email: suraj@westbeng.com
 */

public class Print {

    // Debug messages
    public static void d(Context context, String message) {
        Log.d(context.getClass().getSimpleName(), message);
    }

    public static void d(Context context, String message, boolean showToast) {
        Log.d(context.getClass().getSimpleName(), message);
        if (showToast) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }

    public static void d(Context context, String message, String functionName) {
        Log.d(context.getClass().getSimpleName(), functionName + " -> " + message);
    }

    public static void d(Context context, String message, String functionName, boolean showToast) {
        Log.d(context.getClass().getSimpleName(), functionName + " -> " + message);
        if (showToast) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }

    // Error messages
    public static void e(Context context, String message) {
        Log.e(context.getClass().getSimpleName(), message);
    }

    public static void e(Context context, String message, boolean showToast) {
        Log.e(context.getClass().getSimpleName(), message);
        if (showToast) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }

    public static void e(Context context, String message, String functionName) {
        Log.e(context.getClass().getSimpleName(), functionName + " -> " + message);
    }

    public static void e(Context context, String message, String functionName, boolean showToast) {
        Log.e(context.getClass().getSimpleName(), functionName + " -> " + message);
        if (showToast) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
