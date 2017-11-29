package com.google.analytics.module;

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

    private Tracker mTracker;

    private final static class TrackerSingleInstanceImpl{
        final static TrackerSingleInstance INSTANCE = new TrackerSingleInstance();
    }

    public static Tracker getTrackerInstance(Context context, String trackingId){
        return TrackerSingleInstanceImpl.INSTANCE.getTracker(context.getApplicationContext(), trackingId);
    }

    private Tracker getTracker(Context context, String trackingId){
        if(null == mTracker){
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(context);
            mTracker = analytics.newTracker(trackingId);
        }
        return mTracker;
    }

}
