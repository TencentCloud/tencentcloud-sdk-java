package com.tencentcloudapi.youmall.v20180228.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GenderAgeTrafficDetail  extends AbstractModel{


    /**
    * 性别: 0男1女
    */
    @SerializedName("Gender")
    @Expose
    private Integer Gender;

    /**
    * 年龄区间，枚举值：0-17、18-23、24-30、31-40、41-50、51-60、>60
    */
    @SerializedName("AgeGap")
    @Expose
    private String AgeGap;

    /**
    * 客流量
    */
    @SerializedName("TrafficCount")
    @Expose
    private Integer TrafficCount;

    /**
     * 获取性别: 0男1女
     * @return Gender 性别: 0男1女
     */
    public Integer getGender() {
        return this.Gender;
    }

    /**
     * 设置性别: 0男1女
     * @param Gender 性别: 0男1女
     */
    public void setGender(Integer Gender) {
        this.Gender = Gender;
    }

    /**
     * 获取年龄区间，枚举值：0-17、18-23、24-30、31-40、41-50、51-60、>60
     * @return AgeGap 年龄区间，枚举值：0-17、18-23、24-30、31-40、41-50、51-60、>60
     */
    public String getAgeGap() {
        return this.AgeGap;
    }

    /**
     * 设置年龄区间，枚举值：0-17、18-23、24-30、31-40、41-50、51-60、>60
     * @param AgeGap 年龄区间，枚举值：0-17、18-23、24-30、31-40、41-50、51-60、>60
     */
    public void setAgeGap(String AgeGap) {
        this.AgeGap = AgeGap;
    }

    /**
     * 获取客流量
     * @return TrafficCount 客流量
     */
    public Integer getTrafficCount() {
        return this.TrafficCount;
    }

    /**
     * 设置客流量
     * @param TrafficCount 客流量
     */
    public void setTrafficCount(Integer TrafficCount) {
        this.TrafficCount = TrafficCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "AgeGap", this.AgeGap);
        this.setParamSimple(map, prefix + "TrafficCount", this.TrafficCount);

    }
}

