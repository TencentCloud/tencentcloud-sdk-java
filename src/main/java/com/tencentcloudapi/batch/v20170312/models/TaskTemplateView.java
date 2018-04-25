package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TaskTemplateView  extends AbstractModel{


    /**
    * 任务模板ID
    */
    @SerializedName("TaskTemplateId")
    @Expose
    private String TaskTemplateId;
    

    /**
    * 任务模板名称
    */
    @SerializedName("TaskTemplateName")
    @Expose
    private String TaskTemplateName;
    

    /**
    * 任务模板描述
    */
    @SerializedName("TaskTemplateDescription")
    @Expose
    private String TaskTemplateDescription;
    

    /**
    * 任务模板信息
    */
    @SerializedName("TaskTemplateInfo")
    @Expose
    private Task TaskTemplateInfo;
    

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;
    

    /**
     * 获取任务模板ID
     * @return TaskTemplateId 任务模板ID
     */
    public String getTaskTemplateId() {
        return this.TaskTemplateId;
    }

    /**
     * 设置任务模板ID
     * @param TaskTemplateId 任务模板ID
     */
    public void setTaskTemplateId(String TaskTemplateId) {
        this.TaskTemplateId = TaskTemplateId;
    }

    /**
     * 获取任务模板名称
     * @return TaskTemplateName 任务模板名称
     */
    public String getTaskTemplateName() {
        return this.TaskTemplateName;
    }

    /**
     * 设置任务模板名称
     * @param TaskTemplateName 任务模板名称
     */
    public void setTaskTemplateName(String TaskTemplateName) {
        this.TaskTemplateName = TaskTemplateName;
    }

    /**
     * 获取任务模板描述
     * @return TaskTemplateDescription 任务模板描述
     */
    public String getTaskTemplateDescription() {
        return this.TaskTemplateDescription;
    }

    /**
     * 设置任务模板描述
     * @param TaskTemplateDescription 任务模板描述
     */
    public void setTaskTemplateDescription(String TaskTemplateDescription) {
        this.TaskTemplateDescription = TaskTemplateDescription;
    }

    /**
     * 获取任务模板信息
     * @return TaskTemplateInfo 任务模板信息
     */
    public Task getTaskTemplateInfo() {
        return this.TaskTemplateInfo;
    }

    /**
     * 设置任务模板信息
     * @param TaskTemplateInfo 任务模板信息
     */
    public void setTaskTemplateInfo(Task TaskTemplateInfo) {
        this.TaskTemplateInfo = TaskTemplateInfo;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTemplateId", this.TaskTemplateId);
        this.setParamSimple(map, prefix + "TaskTemplateName", this.TaskTemplateName);
        this.setParamSimple(map, prefix + "TaskTemplateDescription", this.TaskTemplateDescription);
        this.setParamObj(map, prefix + "TaskTemplateInfo.", this.TaskTemplateInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

