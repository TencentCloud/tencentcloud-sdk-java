package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Parameter  extends AbstractModel{


    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数值
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
     * 获取参数名称
     * @return Name 参数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置参数名称
     * @param Name 参数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取参数值
     * @return CurrentValue 参数值
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * 设置参数值
     * @param CurrentValue 参数值
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);

    }
}

