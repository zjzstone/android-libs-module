package com.stone.google.analytics.demo.utils;

import com.google.android.gms.analytics.Tracker;

/**
 * Created by stone on 17-11-29.
 */

public abstract class TrackerHelper {

    public static void sendC_APPLICATION(Tracker tracker, String cm_value){
        try {
            tracker.send(new HitBuilders.EventBuilder()
                    .setCategory(TrackerConsts.C_APPLICATION.CATEGORY)
                    .setAction(TrackerConsts.C_APPLICATION.ACTION)
                    .setCustomDimension(TrackerConsts.CUSTOM_DIMENSION_INDEXS.CDI_DAYS_SINCE_INSTALL, cm_value)
                    .build());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void sendC_SEND_BUTTON(Tracker tracker){
        try {
            tracker.send(new HitBuilders.EventBuilder()
                    .setCategory(TrackerConsts.C_SEND_BUTTON.CATEGORY)
                    .setAction(TrackerConsts.C_SEND_BUTTON.ACTION)
                    .build());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
