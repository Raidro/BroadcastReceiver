package com.example.nu4_lab9.broadcast_ex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootBroadcast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Event Received", Toast.LENGTH_SHORT).show();
    }
}
