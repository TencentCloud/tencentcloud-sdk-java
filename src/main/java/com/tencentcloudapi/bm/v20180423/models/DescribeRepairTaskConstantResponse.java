package com.tencentcloudapi.bm.v20180423.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeRepairTaskConstantResponse  extends AbstractModel{


    /**
    * 故障类型ID与对应中文名列表
    */
    @SerializedName("TaskTypeList")
    @Expose
    private TaskType [] TaskTypeList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取故障类型ID与对应中文名列表
     * @return TaskTypeList 故障类型ID与对应中文名列表
     */
    public TaskType [] getTaskTypeList() {
        return this.TaskTypeList;
    }

    /**
     * 设置故障类型ID与对应中文名列表
     * @param TaskTypeList 故障类型ID与对应中文名列表
     */
    public void setTaskTypeList(TaskType [] TaskTypeList) {
        this.TaskTypeList = TaskTypeList;
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
        this.setParamArrayObj(map, prefix + "TaskTypeList.", this.TaskTypeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

