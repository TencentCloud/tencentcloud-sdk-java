package com.tencentcloudapi.bm.v20180423.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeTaskOperationLogResponse  extends AbstractModel{


    /**
    * 操作日志
    */
    @SerializedName("TaskOperationLogSet")
    @Expose
    private TaskOperationLog [] TaskOperationLogSet;

    /**
    * 日志条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取操作日志
     * @return TaskOperationLogSet 操作日志
     */
    public TaskOperationLog [] getTaskOperationLogSet() {
        return this.TaskOperationLogSet;
    }

    /**
     * 设置操作日志
     * @param TaskOperationLogSet 操作日志
     */
    public void setTaskOperationLogSet(TaskOperationLog [] TaskOperationLogSet) {
        this.TaskOperationLogSet = TaskOperationLogSet;
    }

    /**
     * 获取日志条数
     * @return TotalCount 日志条数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置日志条数
     * @param TotalCount 日志条数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "TaskOperationLogSet.", this.TaskOperationLogSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

