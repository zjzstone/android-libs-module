package com.stone.google.analytics.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by stone on 17-11-29.
 */

public class TrackerSingleInstance {

    private final static String DEFAULT = "default";
    private final static String TRACKING_ID = "TRACKING_ID";

    private Tracker mTracker;

    private final static class TrackerSingleInstanceImpl{
        final static TrackerSingleInstance INSTANCE = new TrackerSingleInstance();
    }

    public static Tracker getTrackerInstance(Context context){
        return TrackerSingleInstanceImpl.INSTANCE.getTracker(context.getApplicationContext());
    }

    private Tracker getTracker(Context context){
        if(null == mTracker){
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(context);
            String trackerId = getMetaValue(context, TRACKING_ID);
            mTracker = analytics.newTracker(trackerId);
        }
        return mTracker;
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
