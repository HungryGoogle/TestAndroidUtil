package app;

import android.app.Application;
import android.content.Context;

/**
 * Created by Li on 2017/11/18.
 */

public class utilApp extends Application {
    Context mContext;
    public void init(Context context){
        mContext = context;
    }
}
