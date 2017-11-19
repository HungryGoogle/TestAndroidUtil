package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.AppUtils;

public class TestAppActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final List<String> list=new ArrayList<String>();
        list.add("isAppBackground = " + AppUtils.isAppBackground(this));
        list.add("getVersionName = " + AppUtils.getVersionName(this));
        list.add("getPackageName = " + AppUtils.getVersionCode(this));
        list.add("getAppVersionName = " + AppUtils.getAppVersionName(this, getPackageName()));
        list.add("getAppVersionCode = " + AppUtils.getAppVersionCode(this, getPackageName()));
        list.add("getAppName = " + AppUtils.getAppName(this, getPackageName()));
        list.add("getAppPermission = " + AppUtils.getAppPermission(this, getPackageName()));
        list.add("getAppSignature = " + AppUtils.getAppSignature(this, getPackageName()));
        list.add("isApkDebuggable = " + AppUtils.isApkDebuggable(this));
        list.add("isApkDebugable = " + AppUtils.isApkDebugable(this, getPackageName()));

        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String strResult;
//                switch (list.get(i)) {
//                    case "getVersionName":
//                        strResult = AppUtils.getVersionName(TestAppActivity.this);
//                        Toast.makeText(TestAppActivity.this, strResult, Toast.LENGTH_SHORT).show();
//                        break;
//                    case "getPackageName":
//                        strResult = AppUtils.getPackageName(TestAppActivity.this);
//                        Toast.makeText(TestAppActivity.this, strResult, Toast.LENGTH_SHORT).show();;
//                        break;
//                    case "isAppBackground":
//                        strResult = AppUtils.getPackageName(TestAppActivity.this);
//                        Toast.makeText(TestAppActivity.this, strResult, Toast.LENGTH_SHORT).show();;
//                        break;
//
//                    default:break;
//                }
//            }
//        });
    }
}
