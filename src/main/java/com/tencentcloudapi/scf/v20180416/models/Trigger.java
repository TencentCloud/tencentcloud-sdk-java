package com.tencentcloudapi.scf.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Trigger  extends AbstractModel{


    /**
    * 触发器最后修改时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 触发器类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 触发器详细配置
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * 触发器名称
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发器创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
     * 获取触发器最后修改时间
     * @return ModTime 触发器最后修改时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * 设置触发器最后修改时间
     * @param ModTime 触发器最后修改时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * 获取触发器类型
     * @return Type 触发器类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置触发器类型
     * @param Type 触发器类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取触发器详细配置
     * @return TriggerDesc 触发器详细配置
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * 设置触发器详细配置
     * @param TriggerDesc 触发器详细配置
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * 获取触发器名称
     * @return TriggerName 触发器名称
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * 设置触发器名称
     * @param TriggerName 触发器名称
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * 获取触发器创建时间
     * @return AddTime 触发器创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * 设置触发器创建时间
     * @param AddTime 触发器创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);

    }
}

