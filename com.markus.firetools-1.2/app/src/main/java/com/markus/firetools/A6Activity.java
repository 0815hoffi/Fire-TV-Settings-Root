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

//  Bildschirmschoner  am start -a com.amazon.ftv.screensaver -n com.amazon.ftv.screensaver/.app.settings.ScreensaverActivity

public class A6Activity extends Activity {

    Intent intent = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        Intent localIntent = new Intent();
        localIntent.setPackage("com.amazon.ftv.screensaver");
        localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.ftv.screensaver/.app.settings.ScreensaverActivity"));
        localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(localIntent);

        finish();
        super.onCreate(savedInstanceState);
    }

}