package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Tag  extends AbstractModel{


    /**
    * 标签键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 标签值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * 获取标签键
     * @return Key 标签键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * 设置标签键
     * @param Key 标签键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * 获取标签值
     * @return Value 标签值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置标签值
     * @param Value 标签值
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

