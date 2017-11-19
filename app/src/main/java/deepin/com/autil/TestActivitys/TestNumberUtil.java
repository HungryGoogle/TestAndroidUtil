package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.CpuUtils;
import deepin.com.utils.NumberUtils;

public class TestNumberUtil extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final List<String> list=new ArrayList<String>();
        list.add("formatOneDecimal = " + NumberUtils.formatOneDecimal(1.1111F));
        list.add("formatTwoDecimal = " + NumberUtils.formatTwoDecimal(1.1111F));
        list.add("formatTwoDecimalPercent = " + NumberUtils.formatTwoDecimalPercent(1.111111F));
        list.add("formatTwoDecimalPercent = " + NumberUtils.formatTwoDecimalPercent(1.111111F));


        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
    }

}
