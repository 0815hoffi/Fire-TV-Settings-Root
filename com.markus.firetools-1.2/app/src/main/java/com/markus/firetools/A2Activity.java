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

//    Mein Gerät

public class A2Activity extends Activity {

    Intent intent = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        Intent localIntent = new Intent();
        localIntent.setPackage("com.amazon.tv.settings.v2");
        localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings.v2/.tv.device.DeviceActivity"));
        localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(localIntent);

        finish();
        super.onCreate(savedInstanceState);
    }

}