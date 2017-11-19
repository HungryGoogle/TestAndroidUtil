package deepin.com.autil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import app.SdkApp;
import deepin.com.autil.TestActivitys.TestAppActivity;
import deepin.com.autil.TestActivitys.TestBase64Utils;
import deepin.com.autil.TestActivitys.TestCpuUtils;
import deepin.com.autil.TestActivitys.TestDeviceUtils;
import deepin.com.autil.TestActivitys.TestDisplayUtils;
import deepin.com.autil.TestActivitys.TestNumberUtil;
import deepin.com.autil.TestActivitys.TestPackageUtils;
import deepin.com.autil.TestActivitys.TestPopupDialogActivity;
import deepin.com.autil.TestActivitys.TestRandomUtils;
import deepin.com.autil.TestActivitys.TestSystemUtils;
import deepin.com.autil.TestActivitys.TestVerifyUtils;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SdkApp.getIns().init(this);

        final List<String> list=new ArrayList<String>();
        list.add("AppActivity");
        list.add("SystemUtils");
        list.add("DisplayUtils");
        list.add("VerifyUtil");
        list.add("PackageUtils");
        list.add("RandomUtils");
        list.add("TestEncrpt");
        list.add("TestDeviceUtils");
        list.add("TestCpuUtils");
        list.add("TestNumberUtil");

        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (list.get(i)) {
                    case "AppActivity":
                        startActivity(new Intent(getApplication(), TestAppActivity.class));
                        break;
                    case "SystemUtils":
                        startActivity(new Intent(getApplication(), TestSystemUtils.class));
                        break;
                    case "DisplayUtils":
                        startActivity(new Intent(getApplication(), TestDisplayUtils.class));
                        break;
                    case "VerifyUtil":
                        startActivity(new Intent(getApplication(), TestVerifyUtils.class));
                        break;
                    case "PackageUtils":
                        startActivity(new Intent(getApplication(), TestPackageUtils.class));
                        break;
                    case "RandomUtils":
                        startActivity(new Intent(getApplication(), TestRandomUtils.class));
                        break;
                    case "TestEncrpt":
                        startActivity(new Intent(getApplication(), TestBase64Utils.class));
                        break;
                    case "TestDeviceUtils":
                        startActivity(new Intent(getApplication(), TestDeviceUtils.class));
                        break;
                    case "TestCpuUtils":
                        startActivity(new Intent(getApplication(), TestCpuUtils.class));
                        break;
                    case "TestNumberUtil":
                        startActivity(new Intent(getApplication(), TestNumberUtil.class));
                        break;
                    default:break;

                }
            }
        });


    }
}
