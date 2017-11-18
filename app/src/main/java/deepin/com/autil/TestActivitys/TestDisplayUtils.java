package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.DisplayUtils;

public class TestDisplayUtils extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final List<String> list=new ArrayList<String>();
        list.add("isPortrait = " + DisplayUtils.isPortrait(getApplicationContext()));
        list.add("isLandscape = " + DisplayUtils.isLandscape(getApplicationContext()));
        list.add("getScreenWidth = " + DisplayUtils.getScreenWidth(getApplicationContext()));
        list.add("getScreenHeight = " + DisplayUtils.getScreenHeight(getApplicationContext()));
        list.add("getScreenDensity = " + DisplayUtils.getScreenDensity(getApplicationContext()));
        list.add("getScreenDensityDPI = " + DisplayUtils.getScreenDensityDPI(getApplicationContext()));
        list.add("getStatusBarHeight = " + DisplayUtils.getStatusBarHeight(TestDisplayUtils.this));
        list.add("dp2px 10dp = " + DisplayUtils.dp2px(getApplicationContext(), 10));
        list.add("px2dp 100px = " + DisplayUtils.px2dp(getApplicationContext(), 100));
        list.add("px2sp 100px = " + DisplayUtils.px2sp(getApplicationContext(), 100));
        list.add("sp2px 10sp = " + DisplayUtils.px2sp(getApplicationContext(), 10));

        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);

    }
}
