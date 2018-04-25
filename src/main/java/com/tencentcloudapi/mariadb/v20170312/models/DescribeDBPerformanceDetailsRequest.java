package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBPerformanceDetailsRequest  extends AbstractModel{


    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 开始日期，格式yyyy-mm-dd
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;
    

    /**
    * 结束日期，格式yyyy-mm-dd
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;
    

    /**
     * 获取实例 ID，形如：tdsql-ow728lmc。
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取开始日期，格式yyyy-mm-dd
     * @return StartTime 开始日期，格式yyyy-mm-dd
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始日期，格式yyyy-mm-dd
     * @param StartTime 开始日期，格式yyyy-mm-dd
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束日期，格式yyyy-mm-dd
     * @return EndTime 结束日期，格式yyyy-mm-dd
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束日期，格式yyyy-mm-dd
     * @param EndTime 结束日期，格式yyyy-mm-dd
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

