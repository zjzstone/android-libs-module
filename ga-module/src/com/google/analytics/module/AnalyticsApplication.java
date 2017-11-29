package com.google.analytics.module;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.analytics.Tracker;

/**
 * Created by zhangjinze on 17-11-28.
 */
public class AnalyticsApplication extends Application {

    private final static String DEFAULT = "default";
    private final static String TRACKING_ID = "TRACKING_ID";

    private static AnalyticsApplication sAppContext;

    private Tracker mTracker;
    private String mTrackingId;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = this;
        mTrackingId = getMetaValue(this, TRACKING_ID);
        mTracker = TrackerSingleInstance.getTrackerInstance(this, getMetaValue(this, TRACKING_ID));
    }


    public static AnalyticsApplication getAppContext() {
        return sAppContext;
    }

    public Tracker getTracker() {
        return mTracker;
    }

    public String getTrackingId() {
        return mTrackingId;
    }

    private String getMetaValue(Context context, String metaKey){
        try {
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            String metaValue = bundle.getString(metaKey);
            return metaValue;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return DEFAULT;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return DEFAULT;
        }
    }
}
