package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeJobResponse  extends AbstractModel{


    /**
    * 训练任务信息
    */
    @SerializedName("Job")
    @Expose
    private Job Job;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取训练任务信息
     * @return Job 训练任务信息
     */
    public Job getJob() {
        return this.Job;
    }

    /**
     * 设置训练任务信息
     * @param Job 训练任务信息
     */
    public void setJob(Job Job) {
        this.Job = Job;
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
        this.setParamObj(map, prefix + "Job.", this.Job);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

