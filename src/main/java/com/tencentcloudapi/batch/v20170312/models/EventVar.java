package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class EventVar  extends AbstractModel{


    /**
    * 自定义键
    */
    @SerializedName("Name")
    @Expose
    private String Name;
    

    /**
    * 自定义值
    */
    @SerializedName("Value")
    @Expose
    private String Value;
    

    /**
     * 获取自定义键
     * @return Name 自定义键
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置自定义键
     * @param Name 自定义键
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取自定义值
     * @return Value 自定义值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置自定义值
     * @param Value 自定义值
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

