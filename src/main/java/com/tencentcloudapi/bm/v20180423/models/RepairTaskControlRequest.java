package com.tencentcloudapi.bm.v20180423.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RepairTaskControlRequest  extends AbstractModel{


    /**
    * 维修任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 操作
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
     * 获取维修任务ID
     * @return TaskId 维修任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置维修任务ID
     * @param TaskId 维修任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取操作
     * @return Operate 操作
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * 设置操作
     * @param Operate 操作
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Operate", this.Operate);

    }
}

