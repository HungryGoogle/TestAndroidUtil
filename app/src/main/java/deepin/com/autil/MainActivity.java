package deepin.com.autil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

import deepin.com.autil.UtilActivitys.TestAppActivity;
import deepin.com.autil.UtilActivitys.TestPopupDialogActivity;
import deepin.com.autil.UtilActivitys.TestVoiceActivity;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> list=new ArrayList<String>();
        list.add("voice");
        list.add("popup_dialog");
        list.add("app");

        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (list.get(i)) {
                    case "voice":
                        startActivity(new Intent(getApplication(), TestVoiceActivity.class));
                        break;
                    case "popup_dialog":
                        startActivity(new Intent(getApplication(), TestPopupDialogActivity.class));
                        break;
                    case "app":
                        startActivity(new Intent(getApplication(), TestAppActivity.class));
                        break;
                    default:break;

                }
            }
        });


    }
}
