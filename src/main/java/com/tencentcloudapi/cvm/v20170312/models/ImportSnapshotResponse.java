package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ImportSnapshotResponse  extends AbstractModel{


    /**
    * 任务ID，可以用于查询任务状态
    */
    @SerializedName("TaskId")
    @Expose
    private String [] TaskId;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取任务ID，可以用于查询任务状态
     * @return TaskId 任务ID，可以用于查询任务状态
     */
    public String [] getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务ID，可以用于查询任务状态
     * @param TaskId 任务ID，可以用于查询任务状态
     */
    public void setTaskId(String [] TaskId) {
        this.TaskId = TaskId;
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
        this.setParamArraySimple(map, prefix + "TaskId.", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

