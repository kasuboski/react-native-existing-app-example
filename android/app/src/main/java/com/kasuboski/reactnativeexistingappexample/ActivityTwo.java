package com.kasuboski.reactnativeexistingappexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class ActivityTwo extends BaseReactActivity {
    public static Intent createIntent(Context context) {
        return new Intent(context, ActivityTwo.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startReactView("ScreenTwo");
    }
}
