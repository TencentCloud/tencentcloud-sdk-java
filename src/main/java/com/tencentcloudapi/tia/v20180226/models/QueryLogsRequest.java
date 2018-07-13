package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class QueryLogsRequest  extends AbstractModel{


    /**
    * 任务名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 集群名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 查询日志的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询日志的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 单次要返回的日志条数
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 加载更多使用，透传上次返回的context值，获取后续的日志内容
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * 获取任务名称
     * @return JobName 任务名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * 设置任务名称
     * @param JobName 任务名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * 获取集群名称
     * @return Cluster 集群名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置集群名称
     * @param Cluster 集群名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取查询日志的开始时间
     * @return StartTime 查询日志的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置查询日志的开始时间
     * @param StartTime 查询日志的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取查询日志的结束时间
     * @return EndTime 查询日志的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置查询日志的结束时间
     * @param EndTime 查询日志的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取单次要返回的日志条数
     * @return Limit 单次要返回的日志条数
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次要返回的日志条数
     * @param Limit 单次要返回的日志条数
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取加载更多使用，透传上次返回的context值，获取后续的日志内容
     * @return Context 加载更多使用，透传上次返回的context值，获取后续的日志内容
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * 设置加载更多使用，透传上次返回的context值，获取后续的日志内容
     * @param Context 加载更多使用，透传上次返回的context值，获取后续的日志内容
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

