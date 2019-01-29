package com.theyavikteam.aad_certification.utils;

import android.content.Context;
import android.widget.Toast;

public class ContextUtils {
    public static void toastMessage(Context context, String message) {
        if (context != null) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
