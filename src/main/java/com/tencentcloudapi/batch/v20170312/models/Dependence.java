package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Dependence  extends AbstractModel{


    /**
    * 依赖关系的起点任务名称
    */
    @SerializedName("StartTask")
    @Expose
    private String StartTask;

    /**
    * 依赖关系的终点任务名称
    */
    @SerializedName("EndTask")
    @Expose
    private String EndTask;

    /**
     * 获取依赖关系的起点任务名称
     * @return StartTask 依赖关系的起点任务名称
     */
    public String getStartTask() {
        return this.StartTask;
    }

    /**
     * 设置依赖关系的起点任务名称
     * @param StartTask 依赖关系的起点任务名称
     */
    public void setStartTask(String StartTask) {
        this.StartTask = StartTask;
    }

    /**
     * 获取依赖关系的终点任务名称
     * @return EndTask 依赖关系的终点任务名称
     */
    public String getEndTask() {
        return this.EndTask;
    }

    /**
     * 设置依赖关系的终点任务名称
     * @param EndTask 依赖关系的终点任务名称
     */
    public void setEndTask(String EndTask) {
        this.EndTask = EndTask;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTask", this.StartTask);
        this.setParamSimple(map, prefix + "EndTask", this.EndTask);

    }
}

