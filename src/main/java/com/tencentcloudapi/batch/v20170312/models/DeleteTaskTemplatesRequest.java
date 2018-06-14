package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteTaskTemplatesRequest  extends AbstractModel{


    /**
    * 用于删除任务模板信息
    */
    @SerializedName("TaskTemplateIds")
    @Expose
    private String [] TaskTemplateIds;

    /**
     * 获取用于删除任务模板信息
     * @return TaskTemplateIds 用于删除任务模板信息
     */
    public String [] getTaskTemplateIds() {
        return this.TaskTemplateIds;
    }

    /**
     * 设置用于删除任务模板信息
     * @param TaskTemplateIds 用于删除任务模板信息
     */
    public void setTaskTemplateIds(String [] TaskTemplateIds) {
        this.TaskTemplateIds = TaskTemplateIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskTemplateIds.", this.TaskTemplateIds);

    }
}

