package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.CpuUtils;

public class TestCpuUtils extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final List<String> list=new ArrayList<String>();
        list.add("getCpuMaxFreq(KHZ) = " + CpuUtils.getCpuMaxFreq());
        list.add("getCpuMinFreq(KHZ) = " + CpuUtils.getCpuMinFreq());
        list.add("getCpuCurFreq(KHZ) = " + CpuUtils.getCpuCurFreq());
        list.add("getCpuName = " + CpuUtils.getCpuName());
        list.add("getCpuCores = " + CpuUtils.getCpuCores());

        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
    }

    public static class TestNumberUtils extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            final List<String> list=new ArrayList<String>();
            list.add("getCpuMaxFreq(KHZ) = " + CpuUtils.getCpuMaxFreq());
            list.add("getCpuMinFreq(KHZ) = " + CpuUtils.getCpuMinFreq());
            list.add("getCpuCurFreq(KHZ) = " + CpuUtils.getCpuCurFreq());
            list.add("getCpuName = " + CpuUtils.getCpuName());
            list.add("getCpuCores = " + CpuUtils.getCpuCores());

            ListView listView = new ListView(this);
            listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
            setContentView(listView);
        }
    }
}
