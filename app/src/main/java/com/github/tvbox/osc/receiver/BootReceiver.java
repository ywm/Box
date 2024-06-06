package com.github.tvbox.osc.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.github.tvbox.osc.ui.activity.HomeActivity;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Intent.ACTION_BOOT_COMPLETED.equals(action) ||
                Intent.ACTION_USER_PRESENT.equals(action) ||
                Intent.ACTION_SCREEN_ON.equals(action)
        ) {

            Intent start = new Intent(context, HomeActivity.class);
            start.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(start);
        }
    }
}
