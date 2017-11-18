package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.SystemUtils;

public class TestSystemUtils extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final List<String> list=new ArrayList<String>();
        list.add("isDalvik = " + SystemUtils.isDalvik());
        list.add("isART = " + SystemUtils.isART());
        list.add("Build.ID = " + SystemUtils.getID());
        list.add("Build.BRAND = " + SystemUtils.getBrand());
        list.add("Build.BOARD = " + SystemUtils.getBoard());
        list.add("Build.MODEL = " + SystemUtils.getModel());
        list.add("Build.VERSION.RELEASE = " + SystemUtils.getVersionRelease());
        list.add("Build.VERSION.SDK_INT = " + SystemUtils.getVersionSDK());
        list.add("Build.FINGERPRINT = " + SystemUtils.getFingerPrint());
        list.add("Build.PRODUCT = " + SystemUtils.getProduct());
        list.add("Build.MANUFACTURER = " + SystemUtils.getManufacturer());
        list.add("Build.DEVICE = " + SystemUtils.getDevice());
        list.add("Build.DISPLAY = " + SystemUtils.getDisplay());


        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);

    }
}
