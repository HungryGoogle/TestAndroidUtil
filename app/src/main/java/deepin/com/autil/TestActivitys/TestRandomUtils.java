package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.DisplayUtils;
import deepin.com.utils.RandomUtils;

public class TestRandomUtils extends Activity {

    final List<String> list=new ArrayList<String>();
    ArrayAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 界面显示
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        Button btnRefresh = new Button(this);
        btnRefresh.setText("刷新");
        linearLayout.addView(btnRefresh);
        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeListData();
            }
        });


        // 设置列表数据
        mAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        ListView listView = new ListView(this);
        listView.setAdapter(mAdapter);
        linearLayout.addView(listView);
        setContentView(linearLayout);
        changeListData();
    }

    private void changeListData() {
        list.clear();
        list.add("randomString 5 = " + RandomUtils.randomString(5));
        list.add("randomString 8 = " + RandomUtils.randomString(8));
        list.add("randomBoolean = " + RandomUtils.randomBoolean());
        list.add("randomDouble = " + RandomUtils.randomDouble());
        list.add("randomFloat = " + RandomUtils.randomFloat());
        list.add("randomGaussian = " + RandomUtils.randomGaussian());
        list.add("randomInt = " + RandomUtils.randomInt());
        list.add("randomInt(90, 100) = " + RandomUtils.randomInt(90, 100));
        list.add("randomInt(10) = " + RandomUtils.randomInt(10));
        list.add("randomLong() = " + RandomUtils.randomLong());
        mAdapter.notifyDataSetChanged();
    }
}
