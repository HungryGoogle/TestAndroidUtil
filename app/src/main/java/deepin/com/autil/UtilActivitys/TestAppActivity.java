package deepin.com.autil.UtilActivitys;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import deepin.com.autil.R;
import deepin.com.utils.AppUtils;

public class TestAppActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_app);

        final List<String> list=new ArrayList<String>();
        list.add("getVersionName");
        list.add("getPackageName");

        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String strResult;
                switch (list.get(i)) {
                    case "getVersionName":
                        strResult = AppUtils.getVersionName(TestAppActivity.this);
                        Toast.makeText(TestAppActivity.this, strResult, Toast.LENGTH_SHORT).show();
                        break;
                    case "getPackageName":
                        strResult = AppUtils.getPackageName(TestAppActivity.this);
                        Toast.makeText(TestAppActivity.this, strResult, Toast.LENGTH_SHORT).show();;
                        break;

                    default:break;

                }
            }
        });
    }
}
