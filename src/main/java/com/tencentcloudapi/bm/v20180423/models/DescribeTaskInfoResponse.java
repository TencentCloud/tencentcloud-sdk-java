package com.tencentcloudapi.bm.v20180423.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeTaskInfoResponse  extends AbstractModel{


    /**
    * 返回任务总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 任务信息列表
    */
    @SerializedName("TaskInfoSet")
    @Expose
    private TaskInfo [] TaskInfoSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取返回任务总数量
     * @return TotalCount 返回任务总数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置返回任务总数量
     * @param TotalCount 返回任务总数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取任务信息列表
     * @return TaskInfoSet 任务信息列表
     */
    public TaskInfo [] getTaskInfoSet() {
        return this.TaskInfoSet;
    }

    /**
     * 设置任务信息列表
     * @param TaskInfoSet 任务信息列表
     */
    public void setTaskInfoSet(TaskInfo [] TaskInfoSet) {
        this.TaskInfoSet = TaskInfoSet;
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
        this.setParamArrayObj(map, prefix + "TaskInfoSet.", this.TaskInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

