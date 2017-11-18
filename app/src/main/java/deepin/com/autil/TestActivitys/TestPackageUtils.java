package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.PackageUtils;
import deepin.com.utils.VerifyUtils;

public class TestPackageUtils extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final List<String> list=new ArrayList<String>();
//        list.add("getInsatalledPackageInfos = " + PackageUtils.getInsatalledPackageInfos(getApplicationContext()).toString());
        list.add("isInsatalled = " + PackageUtils.isInsatalled(getApplicationContext(), getPackageName()));



        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
    }
}
