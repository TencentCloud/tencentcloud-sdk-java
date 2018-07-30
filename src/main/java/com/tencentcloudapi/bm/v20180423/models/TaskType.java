package com.tencentcloudapi.bm.v20180423.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TaskType  extends AbstractModel{


    /**
    * 故障类ID
    */
    @SerializedName("TypeId")
    @Expose
    private Integer TypeId;

    /**
    * 故障类中文名
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 故障类型父类
    */
    @SerializedName("TaskSubType")
    @Expose
    private String TaskSubType;

    /**
     * 获取故障类ID
     * @return TypeId 故障类ID
     */
    public Integer getTypeId() {
        return this.TypeId;
    }

    /**
     * 设置故障类ID
     * @param TypeId 故障类ID
     */
    public void setTypeId(Integer TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * 获取故障类中文名
     * @return TypeName 故障类中文名
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * 设置故障类中文名
     * @param TypeName 故障类中文名
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * 获取故障类型父类
     * @return TaskSubType 故障类型父类
     */
    public String getTaskSubType() {
        return this.TaskSubType;
    }

    /**
     * 设置故障类型父类
     * @param TaskSubType 故障类型父类
     */
    public void setTaskSubType(String TaskSubType) {
        this.TaskSubType = TaskSubType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "TaskSubType", this.TaskSubType);

    }
}

