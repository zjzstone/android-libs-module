package com.stone.google.analytics.demo.utils;

/**
 * Created by stone on 17-11-29.
 */

public class TrackerConsts {

    /**
     * All categorys
     */
    final static class CATEGORYS{
        final static String C_APPLICATION = "application";
        final static String C_SEND_BUTTON = "send_button";
    }


    /**
     * All actions
     */
    final static class ACTIONS{
        final static String A_START = "start";
        final static String A_CLICK = "click";
    }


    /**
     * All custom dimensions
     */
    final static class CUSTOM_DIMENSION_INDEXS{
        final static int CDI_DAYS_SINCE_INSTALL = 1;
    }


    /**
     * All custom metrics
     */
    final static class CUSTOM_METRIC_INDEXS{
    }


    /**
     * for application start event
     */
    final static class C_APPLICATION {
        final static String CATEGORY = TrackerConsts.CATEGORYS.C_APPLICATION;
        final static String ACTION = TrackerConsts.ACTIONS.A_START;
        final static int CUSTOM_DIMENSION_INDEX = TrackerConsts.CUSTOM_DIMENSION_INDEXS.CDI_DAYS_SINCE_INSTALL;
    }

    /**
     * for send button click event
     */
    final static class C_SEND_BUTTON{
        final static String CATEGORY = TrackerConsts.CATEGORYS.C_SEND_BUTTON;
        final static String ACTION = TrackerConsts.ACTIONS.A_CLICK;
    }


}
