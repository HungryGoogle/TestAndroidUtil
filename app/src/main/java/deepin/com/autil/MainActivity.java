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

import deepin.com.autil.TestActivitys.TestAppActivity;
import deepin.com.autil.TestActivitys.TestDisplayUtils;
import deepin.com.autil.TestActivitys.TestPackageUtils;
import deepin.com.autil.TestActivitys.TestPopupDialogActivity;
import deepin.com.autil.TestActivitys.TestRandomUtils;
import deepin.com.autil.TestActivitys.TestSystemUtils;
import deepin.com.autil.TestActivitys.TestVerifyUtils;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final List<String> list=new ArrayList<String>();
        list.add("SystemUtils");
        list.add("DisplayUtils");
        list.add("VerifyUtil");
        list.add("PackageUtils");
        list.add("RandomUtils");

        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (list.get(i)) {
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
                    default:break;

                }
            }
        });


    }
}
