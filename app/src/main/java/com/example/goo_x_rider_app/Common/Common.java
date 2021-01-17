package com.example.goo_x_rider_app.Common;

import com.example.goo_x_rider_app.Model.RiderModel;

public class Common {
    public static final String RIDER_INFO_REFERENCE = "Riders";
    public static RiderModel currentRider;

    public static String buildWelcomeMessage() {
        if (Common.currentRider != null){
            return new StringBuilder("Welcome ")
                    .append(Common.currentRider.getFirstName())
                    .append(" ")
                    .append(Common.currentRider.getLastName()).toString();
        }
        else{
            return "";
        }
    }

}