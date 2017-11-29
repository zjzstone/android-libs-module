package com.google.analytics.module.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.analytics.module.demo.utils.tracker.TrackerConsts;
import com.google.analytics.module.demo.utils.tracker.TrackerHelper;

import java.util.Random;

/**
 * Created by zhangjinze on 17-11-28.
 */

public class TestAnalyticsActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_analytics);
    }

    public void click(View view){
        TrackerHelper.sendC_Control(DemoApplication.getAppContext().getTracker());
    }

    public void click2(View view){
        Random random = new Random();
        int value = random.nextInt(100)%(100-1+1) + 1;
        TrackerHelper.sendC_Control2(DemoApplication.getAppContext().getTracker(), value);
    }

}
