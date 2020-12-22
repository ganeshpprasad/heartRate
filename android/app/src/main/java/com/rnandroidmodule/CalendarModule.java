package com.rnandroidmodule;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import com.mcube.ms.sdk.MSSDK;
import com.mcube.ms.sdk.definitions.MSDefinition;
import com.mcube.ms.sdk.interfaces.MSCallbacks;
import com.mcube.ms.sdk.modules.BLEModule;
import com.mcube.ms.sdk.modules.FirmwareModule;
import com.mcube.ms.sdk.modules.OTAModule;
import com.mcube.ms.sdk.modules.SportModule;
import com.mcube.ms.sdk.modules.UserModule;


import java.util.Map;
import java.util.HashMap;

public class CalendarModule extends ReactContextBaseJavaModule implements MSCallbacks{
    CalendarModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "CalendarModule";
    }

    @ReactMethod
    public void createCalendarEvent(String name, String location) {
        Log.d("CalendarModule", "create calendar event method invoked :  eventName ->" + name + " , location -> " + location);
        MSSDK sdk = new MSSDK(MainApplication.getInstance());
        sdk.setDebugEnable(true);
        sdk.setMSCallbacks(this);

    }

    @Override
    public void onConnectionStateChanged(int i) {

    }

    @Override
    public void onServicesDiscovered(int i, boolean b) {

    }

    @Override
    public void onRSSIRead(int i) {

    }

    @Override
    public void onDeviceScanned(BluetoothDevice bluetoothDevice) {

    }

    @Override
    public void onFirmwareVersionRead(String s, boolean b, boolean b1, boolean b2) {

    }

    @Override
    public void onBatteryRead(int i, int i1) {

    }

    @Override
    public void onStateAndStepsChanged(int i, int i1) {

    }

    @Override
    public void onSelfieChanged() {

    }

    @Override
    public void onSedentaryChanged() {

    }

    @Override
    public void onHeartRateChanged(int i) {

    }

    @Override
    public void onBloodPressureChanged(int i, int i1) {

    }

    @Override
    public void onBloodOxygen(int i) {

    }

    @Override
    public void onSyncHistories(String s, int i, int i1, long l) {

    }

    @Override
    public void onSyncCurrentState(String s, int i, int i1, long l, int i2) {

    }

    @Override
    public void onBloodOxygenHistories(String s, int i, long l) {

    }

    @Override
    public void onSyncEnd() {

    }

    @Override
    public void onStartSync() {

    }

    @Override
    public void onHrSyncHistories(String s, int i, long l) {

    }

    @Override
    public void onBpSyncHistories(String s, int i, int i1, long l) {

    }

    @Override
    public void onHrBpSyncEnd() {

    }

    @Override
    public void onVastAlarmNameSet(boolean b) {

    }

    @Override
    public void onVastAlarmTimeSet(boolean b) {

    }

    @Override
    public void onOTAChecked(boolean b) {

    }

    @Override
    public void onOTADownloaded(boolean b) {

    }

    @Override
    public void onOTAStart() {

    }

    @Override
    public void onOTAProcess(float v) {

    }

    @Override
    public void onOTAEnd() {

    }

    @Override
    public void onWeRunConnected(boolean b, String s) {

    }

    @Override
    public void onMedicineSet(boolean b) {

    }
}
