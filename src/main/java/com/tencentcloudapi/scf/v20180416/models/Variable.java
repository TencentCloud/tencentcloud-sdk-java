package com.tencentcloudapi.scf.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Variable  extends AbstractModel{


    /**
    * 变量的名称
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 变量的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * 获取变量的名称
     * @return Key 变量的名称
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * 设置变量的名称
     * @param Key 变量的名称
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * 获取变量的值
     * @return Value 变量的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置变量的值
     * @param Value 变量的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

