package com.example.kohry.myapplication;

import android.app.ActivityManager;
import android.app.admin.DeviceAdminInfo;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Calendar;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();

        Log.i("TAG", "SERIAL: " + Build.SERIAL);
        Log.i("TAG","MODEL: " + Build.MODEL);
        Log.i("TAG","ID: " + Build.ID);
        Log.i("TAG","Manufacture: " + Build.MANUFACTURER);
        Log.i("TAG","brand: " + Build.BRAND);
        Log.i("TAG","type: " + Build.TYPE);
        Log.i("TAG","user: " + Build.USER);
        Log.i("TAG","BASE: " + Build.VERSION_CODES.BASE);
        Log.i("TAG","INCREMENTAL " + Build.VERSION.INCREMENTAL);
        Log.i("TAG","SDK  " + Build.VERSION.RELEASE);
        Log.i("TAG","BOARD: " + Build.BOARD);
        Log.i("TAG","BRAND " + Build.BRAND);
        Log.i("TAG","HOST " + Build.HOST);
        Log.i("TAG","FINGERPRINT: "+Build.FINGERPRINT);
        Log.i("TAG","Version Code: " + Build.VERSION.RELEASE);

        ConnectivityManager cm = (ConnectivityManager)
        this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo network = cm.getActiveNetworkInfo();
        Log.i("tets", String.format("%s: %s", network.getTypeName(), network.isConnected()));
        Log.i("TAG","getExtraInfo : " + network.getExtraInfo());
        Log.i("TAG","isRoaming : " + network.isRoaming());
        Log.i("TAG","getReason : " + network.getReason());
        Log.i("TAG","getSubtypeName : " + network.getSubtypeName());
        Log.i("TAG","getTypeName : " + network.getTypeName());
        Log.i("TAG","describeContents : " + network.describeContents());
        Log.i("TAG","getDetailedState : " + network.getDetailedState());
        Log.i("TAG","isAvailable : " + network.isAvailable());
        Log.i("TAG","isConnected : " + network.isConnected());
        Log.i("TAG","getState : " + network.getState());
        Log.i("TAG","isConnectedOrConnecting : " + network.isConnectedOrConnecting());
        Log.i("TAG","isFailover : " + network.isFailover());
        Log.i("TAG","toString : " + network.toString());

        Locale.getDefault().getDisplayLanguage();
        TimeZone.getDefault().getID();
        this.getResources().getConfiguration().locale.getCountry();
        Calendar.getInstance().get(Calendar.YEAR);
        Locale.getDefault().getISO3Country();

        Properties p = System.getProperties();
        Log.i("properties",p.toString());

        Log.i("TAG", "os.name : " + System.getProperty("os.name"));
        Log.i("TAG", "os.version : " + System.getProperty("os.version"));

        Log.i("TAG", "Width : " + this.getWindow().getWindowManager().getDefaultDisplay().getWidth());
        Log.i("TAG", "Height : " + this.getWindow().getWindowManager().getDefaultDisplay().getHeight());
        Log.i("TAG", "SD Card : " + Environment.getExternalStorageState());


    }
}
