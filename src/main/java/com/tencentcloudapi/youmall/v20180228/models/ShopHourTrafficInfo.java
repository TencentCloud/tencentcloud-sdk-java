package com.tencentcloudapi.youmall.v20180228.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ShopHourTrafficInfo  extends AbstractModel{


    /**
    * 日期，格式yyyy-MM-dd
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 分时客流详细信息
    */
    @SerializedName("HourTrafficInfoDetailSet")
    @Expose
    private HourTrafficInfoDetail [] HourTrafficInfoDetailSet;

    /**
     * 获取日期，格式yyyy-MM-dd
     * @return Date 日期，格式yyyy-MM-dd
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置日期，格式yyyy-MM-dd
     * @param Date 日期，格式yyyy-MM-dd
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取分时客流详细信息
     * @return HourTrafficInfoDetailSet 分时客流详细信息
     */
    public HourTrafficInfoDetail [] getHourTrafficInfoDetailSet() {
        return this.HourTrafficInfoDetailSet;
    }

    /**
     * 设置分时客流详细信息
     * @param HourTrafficInfoDetailSet 分时客流详细信息
     */
    public void setHourTrafficInfoDetailSet(HourTrafficInfoDetail [] HourTrafficInfoDetailSet) {
        this.HourTrafficInfoDetailSet = HourTrafficInfoDetailSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamArrayObj(map, prefix + "HourTrafficInfoDetailSet.", this.HourTrafficInfoDetailSet);

    }
}

