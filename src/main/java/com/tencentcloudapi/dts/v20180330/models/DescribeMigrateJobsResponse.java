package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeMigrateJobsResponse  extends AbstractModel{


    /**
    * 任务数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 任务详情数组
    */
    @SerializedName("JobList")
    @Expose
    private MigrateJobInfo [] JobList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务数目
     * @return TotalCount 任务数目
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置任务数目
     * @param TotalCount 任务数目
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取任务详情数组
     * @return JobList 任务详情数组
     */
    public MigrateJobInfo [] getJobList() {
        return this.JobList;
    }

    /**
     * 设置任务详情数组
     * @param JobList 任务详情数组
     */
    public void setJobList(MigrateJobInfo [] JobList) {
        this.JobList = JobList;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "JobList.", this.JobList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

