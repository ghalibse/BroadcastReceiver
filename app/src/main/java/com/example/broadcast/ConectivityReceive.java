package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class ConectivityReceive extends BroadcastReceiver {
    private static final String TAG ="ReceiverTAG_" ;

    public ConectivityReceive() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: "+this);
        String action = intent.getAction();
        Toast.makeText(context, "YOU DISCONNECTED " + action, Toast.LENGTH_SHORT).show();
    }
}
