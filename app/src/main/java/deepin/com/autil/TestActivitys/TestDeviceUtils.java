package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.DeviceUtils;

public class TestDeviceUtils extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final List<String> list = new ArrayList<String>();
        list.add("getUUID = " + DeviceUtils.getUUID());
        list.add("getScreenBrightnessMode = " + DeviceUtils.getScreenBrightnessMode(this));
        list.add("isScreenBrightnessModeAuto = " + DeviceUtils.isScreenBrightnessModeAuto(this));
        list.add("getScreenBrightness = " + DeviceUtils.getScreenBrightness(this));
        list.add("getScreenDormantTime = " + DeviceUtils.getScreenDormantTime(this));
        list.add("isAirplaneModeOpen = " + DeviceUtils.isAirplaneModeOpen(this));
        list.add("isBluetoothOpen = " + DeviceUtils.isBluetoothOpen());
        list.add("getMediaVolume = " + DeviceUtils.getMediaVolume(this));
        list.add("getRingVolume = " + DeviceUtils.getRingVolume(this));


        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
    }
}
