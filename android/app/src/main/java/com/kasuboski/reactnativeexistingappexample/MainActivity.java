package com.kasuboski.reactnativeexistingappexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private static final int OVERLAY_PERMISSION_REQ_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btReactView1 = (Button) findViewById(R.id.btReactView1);
        btReactView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go to react view
                Intent intent = ActivityOne.createIntent(MainActivity.this);
                startActivity(intent);
            }
        });

        Button btReactView2 = (Button) findViewById(R.id.btReactView2);
        btReactView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go to react view
                Intent intent = ActivityTwo.createIntent(MainActivity.this);
                startActivity(intent);
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                        Uri.parse("package:" + getPackageName()));
                startActivityForResult(intent, OVERLAY_PERMISSION_REQ_CODE);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == OVERLAY_PERMISSION_REQ_CODE) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (!Settings.canDrawOverlays(this)) {
                    // SYSTEM_ALERT_WINDOW permission not granted...
                }
            }
        }
    }
}
