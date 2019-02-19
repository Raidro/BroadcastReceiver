package com.example.nu4_lab9.broadcast_ex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ConnectivityChanged extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.net.conn.CONNECTIVITY_CHANGE") {
            Toast.makeText(context, "Status do Wifi Mudou!", Toast.LENGTH_SHORT).show();
        }
    }
}