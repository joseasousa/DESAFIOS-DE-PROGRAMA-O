package ufms.cpcx.jose.listagem;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by jose on 16/07/16.
 */
public class Lista extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(
                new FlowConfig.Builder(this).build());
    }
}

