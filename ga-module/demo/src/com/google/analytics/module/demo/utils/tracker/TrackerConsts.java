package com.google.analytics.module.demo.utils.tracker;

/**
 * Created by stone on 17-11-29.
 */

public interface TrackerConsts {

    interface CATEGORYS{
        String C_CONTROL = "Control";
    }

    interface ACTIONS{
        String A_CLICK = "click";
    }

    interface LEVELS{

    }

    interface VALUES{
    }

    interface CUSTOM_DIMENSION{
        int CD_LONG_CLICK_INDEX = 1;
    }

    interface CUSTOM_METRIC{
        int CM_CLICK_INDEX = 1;
    }


    interface C_CONTROL{
        String CATEGORY = CATEGORYS.C_CONTROL;
        String ACTION = ACTIONS.A_CLICK;
    }

}
