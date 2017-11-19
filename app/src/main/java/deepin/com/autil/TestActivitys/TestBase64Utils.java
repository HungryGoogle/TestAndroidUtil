package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.encrypt.Base64Utils;
import deepin.com.utils.encrypt.MD5Utils;
import deepin.com.utils.encrypt.SHA1Utils;

public class TestBase64Utils extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final List<String> list=new ArrayList<String>();
        list.add("encodeBase64 hello = " + Base64Utils.encodeBase64("hello"));
        list.add("decodeBase64 " + Base64Utils.encodeBase64("hello") + " = " + Base64Utils.decodeBase64(Base64Utils.encodeBase64("hello")));
        list.add("encodeMD5 hello = " + MD5Utils.encodeMD5("hello"));
        list.add("encodeMD52 hello = " + MD5Utils.encodeMD52("hello"));
        list.add("SHA1 hello = " + SHA1Utils.SHA1("hello"));




        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
    }
}
