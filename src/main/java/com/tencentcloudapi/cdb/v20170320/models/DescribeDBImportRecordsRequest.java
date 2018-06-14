package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBImportRecordsRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，时间格式如：2016-01-01 00:00:01。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，时间格式如：2016-01-01 23:59:59。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页参数 , 偏移量 , 默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 分页参数 , 单次请求返回的数量 , 默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取开始时间，时间格式如：2016-01-01 00:00:01。
     * @return StartTime 开始时间，时间格式如：2016-01-01 00:00:01。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间，时间格式如：2016-01-01 00:00:01。
     * @param StartTime 开始时间，时间格式如：2016-01-01 00:00:01。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，时间格式如：2016-01-01 23:59:59。
     * @return EndTime 结束时间，时间格式如：2016-01-01 23:59:59。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，时间格式如：2016-01-01 23:59:59。
     * @param EndTime 结束时间，时间格式如：2016-01-01 23:59:59。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取分页参数 , 偏移量 , 默认值为0。
     * @return Offset 分页参数 , 偏移量 , 默认值为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页参数 , 偏移量 , 默认值为0。
     * @param Offset 分页参数 , 偏移量 , 默认值为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页参数 , 单次请求返回的数量 , 默认值为20。
     * @return Limit 分页参数 , 单次请求返回的数量 , 默认值为20。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页参数 , 单次请求返回的数量 , 默认值为20。
     * @param Limit 分页参数 , 单次请求返回的数量 , 默认值为20。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

