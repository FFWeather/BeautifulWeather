package com.beautifulweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linlinshi on 2018/5/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String waetherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
