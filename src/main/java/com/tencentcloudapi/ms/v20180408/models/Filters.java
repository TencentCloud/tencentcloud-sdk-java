package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Filters  extends AbstractModel{


    /**
    * 需要过滤的字段
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 需要过滤字段的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * 获取需要过滤的字段
     * @return Name 需要过滤的字段
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置需要过滤的字段
     * @param Name 需要过滤的字段
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取需要过滤字段的值
     * @return Value 需要过滤字段的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置需要过滤字段的值
     * @param Value 需要过滤字段的值
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

