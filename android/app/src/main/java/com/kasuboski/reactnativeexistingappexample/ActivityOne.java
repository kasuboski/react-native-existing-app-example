package com.kasuboski.reactnativeexistingappexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class ActivityOne extends BaseReactActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, ActivityOne.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startReactView("ScreenOne");
    }
}
