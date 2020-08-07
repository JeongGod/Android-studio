package com.example.stage_7_3;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class MainActivity extends AppCompatActivity {
    private static final String ACTION_CUSTOM_BROADCAST = BuildConfig.APPLICATION_ID + ".ACTION_CUSTOM_BROADCAST";

    private CustomReceiver mReceiver = new CustomReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter = new IntentFilter();
        // 전원 케이블 연결/해제
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        this.registerReceiver(mReceiver, filter);
        // 버튼 클릭시 
        LocalBroadcastManager.getInstance(this).registerReceiver(mReceiver, new IntentFilter(ACTION_CUSTOM_BROADCAST));
    }

    @Override
    protected void onDestroy() {
        this.unregisterReceiver(mReceiver);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mReceiver);
        super.onDestroy();
    }

    public void sendCustomBroadcast(View view) {
        Intent customBroadcastIntent = new Intent(ACTION_CUSTOM_BROADCAST);
        LocalBroadcastManager.getInstance(this).sendBroadcast(customBroadcastIntent);
    }
}