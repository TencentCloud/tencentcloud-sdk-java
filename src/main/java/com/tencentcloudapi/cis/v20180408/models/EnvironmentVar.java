package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class EnvironmentVar  extends AbstractModel{


    /**
    * 环境变量名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 环境变量值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * 获取环境变量名
     * @return Name 环境变量名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置环境变量名
     * @param Name 环境变量名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取环境变量值
     * @return Value 环境变量值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置环境变量值
     * @param Value 环境变量值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

