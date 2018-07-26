package com.tencentcloudapi.youmall.v20180228.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ShopDayTrafficInfo  extends AbstractModel{


    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 客流量
    */
    @SerializedName("DayTrafficTotalCount")
    @Expose
    private Integer DayTrafficTotalCount;

    /**
    * 性别年龄分组下的客流信息
    */
    @SerializedName("GenderAgeTrafficDetailSet")
    @Expose
    private GenderAgeTrafficDetail [] GenderAgeTrafficDetailSet;

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
     * 获取客流量
     * @return DayTrafficTotalCount 客流量
     */
    public Integer getDayTrafficTotalCount() {
        return this.DayTrafficTotalCount;
    }

    /**
     * 设置客流量
     * @param DayTrafficTotalCount 客流量
     */
    public void setDayTrafficTotalCount(Integer DayTrafficTotalCount) {
        this.DayTrafficTotalCount = DayTrafficTotalCount;
    }

    /**
     * 获取性别年龄分组下的客流信息
     * @return GenderAgeTrafficDetailSet 性别年龄分组下的客流信息
     */
    public GenderAgeTrafficDetail [] getGenderAgeTrafficDetailSet() {
        return this.GenderAgeTrafficDetailSet;
    }

    /**
     * 设置性别年龄分组下的客流信息
     * @param GenderAgeTrafficDetailSet 性别年龄分组下的客流信息
     */
    public void setGenderAgeTrafficDetailSet(GenderAgeTrafficDetail [] GenderAgeTrafficDetailSet) {
        this.GenderAgeTrafficDetailSet = GenderAgeTrafficDetailSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "DayTrafficTotalCount", this.DayTrafficTotalCount);
        this.setParamArrayObj(map, prefix + "GenderAgeTrafficDetailSet.", this.GenderAgeTrafficDetailSet);

    }
}

