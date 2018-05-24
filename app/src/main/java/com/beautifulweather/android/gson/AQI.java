package com.beautifulweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linlinshi on 2018/5/24.
 */

public class AQI {
    @SerializedName("city")
    public AQICity aqiCity;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
