package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class MonitorData  extends AbstractModel{


    /**
    * 起始时间，形如 2018-03-24 23:59:59
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;
    

    /**
    * 结束时间，形如 2018-03-24 23:59:59
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;
    

    /**
    * 监控数据
    */
    @SerializedName("Data")
    @Expose
    private Float [] Data;
    

    /**
     * 获取起始时间，形如 2018-03-24 23:59:59
     * @return StartTime 起始时间，形如 2018-03-24 23:59:59
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置起始时间，形如 2018-03-24 23:59:59
     * @param StartTime 起始时间，形如 2018-03-24 23:59:59
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，形如 2018-03-24 23:59:59
     * @return EndTime 结束时间，形如 2018-03-24 23:59:59
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，形如 2018-03-24 23:59:59
     * @param EndTime 结束时间，形如 2018-03-24 23:59:59
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取监控数据
     * @return Data 监控数据
     */
    public Float [] getData() {
        return this.Data;
    }

    /**
     * 设置监控数据
     * @param Data 监控数据
     */
    public void setData(Float [] Data) {
        this.Data = Data;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);

    }
}

