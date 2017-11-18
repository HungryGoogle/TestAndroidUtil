package deepin.com.autil.TestActivitys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import deepin.com.utils.DisplayUtils;
import deepin.com.utils.VerifyUtils;

public class TestVerifyUtils extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final List<String> list=new ArrayList<String>();
        list.add("isEmail li@qq.com = " + VerifyUtils.isEmail("li@qq.com"));
        list.add("isEmail liqq.com.cn = " + VerifyUtils.isEmail("liqq.com.cn"));
        list.add("isMobileNumber 13511112222 = " + VerifyUtils.isMobileNumber("13511112222"));
        list.add("isMobileNumber 013511112222 = " + VerifyUtils.isMobileNumber("013511112222"));
        list.add("isUrl http://www.baidu.com = " + VerifyUtils.isUrl("http://www.baidu.com"));
        list.add("isUrl www.baidu.com = " + VerifyUtils.isUrl("www.baidu.com"));
        list.add("isNumberAndLetter d323 = " + VerifyUtils.isNumberAndLetter("d323"));
        list.add("isNumberAndLetter 中国 = " + VerifyUtils.isNumberAndLetter("中国"));
        list.add("isNumber 2434535 = " + VerifyUtils.isNumber("2434535"));
        list.add("isNumberAndLetter abc123 = " + VerifyUtils.isNumberAndLetter("abc123"));
        list.add("isNumberAndLetter abc = " + VerifyUtils.isLetter("abc"));
        list.add("isChinese 你好，中国！ = " + VerifyUtils.isChinese("你好，中国！"));
        list.add("isChinese 你好Chinese = " + VerifyUtils.isChinese("你好Chinese"));
        list.add("isContainsChinese 你好Chinese = " + VerifyUtils.isContainsChinese("你好Chinese"));
        list.add("isChineseIdentificationNumber 311111201701011111 = " + VerifyUtils.isContainsChinese("311111201712121111"));
        list.add("isPostCode 310000 = " + VerifyUtils.isPostCode("310000"));
        list.add("isPostCode 12345 = " + VerifyUtils.isPostCode("12345"));



        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        setContentView(listView);
    }
}
