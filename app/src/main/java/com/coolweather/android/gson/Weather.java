package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;//请求状态
    public Basic basic;//城市基本信息
    public AQI aqi;//当前空气质量
    public Now now;//生活建议
    public Suggestion suggestion;//未来天气

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
