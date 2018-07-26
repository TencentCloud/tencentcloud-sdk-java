package com.tencentcloudapi.youmall.v20180228.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ZoneTrafficInfo  extends AbstractModel{


    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 门店区域客流详细信息
    */
    @SerializedName("ZoneTrafficInfoDetailSet")
    @Expose
    private ZoneTrafficInfoDetail [] ZoneTrafficInfoDetailSet;

    /**
     * 获取日期
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取门店区域客流详细信息
     * @return ZoneTrafficInfoDetailSet 门店区域客流详细信息
     */
    public ZoneTrafficInfoDetail [] getZoneTrafficInfoDetailSet() {
        return this.ZoneTrafficInfoDetailSet;
    }

    /**
     * 设置门店区域客流详细信息
     * @param ZoneTrafficInfoDetailSet 门店区域客流详细信息
     */
    public void setZoneTrafficInfoDetailSet(ZoneTrafficInfoDetail [] ZoneTrafficInfoDetailSet) {
        this.ZoneTrafficInfoDetailSet = ZoneTrafficInfoDetailSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamArrayObj(map, prefix + "ZoneTrafficInfoDetailSet.", this.ZoneTrafficInfoDetailSet);

    }
}

