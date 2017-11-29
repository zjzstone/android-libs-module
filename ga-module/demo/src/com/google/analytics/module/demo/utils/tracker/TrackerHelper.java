package com.google.analytics.module.demo.utils.tracker;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by stone on 17-11-29.
 */

public abstract class TrackerHelper {

    public static void sendC_Control(Tracker tracker){
        try {
            tracker.send(new HitBuilders.EventBuilder()
            .setCategory(TrackerConsts.C_CONTROL.CATEGORY)
            .setAction(TrackerConsts.C_CONTROL.ACTION)
            .setCustomMetric(TrackerConsts.CUSTOM_METRIC.CM_CLICK_INDEX, 2)
            /*.setLabel()
            .setValue()
            .setCustomDimension()
            .setCustomMetric()*/
            .build());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void sendC_Control2(Tracker tracker, int value){
        try {
            tracker.send(new HitBuilders.EventBuilder()
                    .setCategory(TrackerConsts.C_CONTROL.CATEGORY)
                    .setAction(TrackerConsts.C_CONTROL.ACTION)
                    .setValue(value)
                    .setCustomDimension(TrackerConsts.CUSTOM_DIMENSION.CD_LONG_CLICK_INDEX, "long_click")
            /*.setLabel()
            .setValue()
            .setCustomDimension()
            .setCustomMetric()*/
                    .build());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
