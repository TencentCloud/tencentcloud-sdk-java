package com.tencentcloudapi.msp.v20180319.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeMigrationTaskResponse  extends AbstractModel{


    /**
    * 迁移详情列表
    */
    @SerializedName("TaskStatus")
    @Expose
    private TaskStatus [] TaskStatus;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取迁移详情列表
     * @return TaskStatus 迁移详情列表
     */
    public TaskStatus [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置迁移详情列表
     * @param TaskStatus 迁移详情列表
     */
    public void setTaskStatus(TaskStatus [] TaskStatus) {
        this.TaskStatus = TaskStatus;
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
        this.setParamArrayObj(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

