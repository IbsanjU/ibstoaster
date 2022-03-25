package com.ibsanju.toast;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void show(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
