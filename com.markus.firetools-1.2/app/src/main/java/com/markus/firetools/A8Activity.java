package com.markus.firetools;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Bundle;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.io.IOException;
import java.util.List;

//    Reboot

public class A8Activity extends Activity {

    Intent intent = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        Intent localIntent = new Intent();
        try {
            Runtime.getRuntime().exec("su -c /system/bin/svc power reboot");
        } catch (IOException e) {
            e.printStackTrace();
        }
        startActivity(localIntent);

        finish();
        super.onCreate(savedInstanceState);
    }

}