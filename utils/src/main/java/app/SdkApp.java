package app;

import android.app.Application;
import android.content.Context;

/**
 * Created by Li on 2017/11/18.
 */

public class SdkApp extends Application {
    public static Context mContext;
    public static SdkApp sdkApp;
    public void init(Context context){
        mContext = context;
    }

    public static SdkApp getIns(){
        if(sdkApp == null){
            synchronized (SdkApp.class){
                if(sdkApp == null) {
                    sdkApp = new SdkApp();
                }
            }
        }

        return sdkApp;
    }
}
