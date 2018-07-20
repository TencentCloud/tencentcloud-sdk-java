package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DateCount  extends AbstractModel{


    /**
    * 统计日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 统计值
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
     * 获取统计日期
     * @return Date 统计日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置统计日期
     * @param Date 统计日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取统计值
     * @return Count 统计值
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置统计值
     * @param Count 统计值
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

