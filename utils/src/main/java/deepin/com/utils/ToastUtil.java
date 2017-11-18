package deepin.com.utils;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import app.SdkApp;

/**
 * Created by Li on 2017/11/18.
 */

public class ToastUtil {
    private static Toast toast;

    public static void showToast(String text) {
        if (toast == null) {
            toast = Toast.makeText(SdkApp.mContext, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }

         // 加载布局
//         ViewGroup viewRoot = (ViewGroup)LayoutInflater.from(SdkApp.mContext).inflate(R.layout.custom_layout, null);
//        toast.setView(viewRoot);


//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
//        toast.setGravity(Gravity.TOP | Gravity.LEFT, 100, 100);

    }


}
