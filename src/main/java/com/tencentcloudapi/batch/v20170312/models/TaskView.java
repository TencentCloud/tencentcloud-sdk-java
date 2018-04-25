package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TaskView  extends AbstractModel{


    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;
    

    /**
    * 任务状态
    */
    @SerializedName("TaskState")
    @Expose
    private String TaskState;
    

    /**
    * 开始时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;
    

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;
    

    /**
     * 获取任务名称
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * 设置任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * 获取任务状态
     * @return TaskState 任务状态
     */
    public String getTaskState() {
        return this.TaskState;
    }

    /**
     * 设置任务状态
     * @param TaskState 任务状态
     */
    public void setTaskState(String TaskState) {
        this.TaskState = TaskState;
    }

    /**
     * 获取开始时间
     * @return CreateTime 开始时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置开始时间
     * @param CreateTime 开始时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取结束时间
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

