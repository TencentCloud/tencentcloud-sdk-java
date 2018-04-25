package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ParamInfo  extends AbstractModel{


    /**
    * 参数名
    */
    @SerializedName("Name")
    @Expose
    private String Name;
    

    /**
    * 参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;
    

    /**
     * 获取参数名
     * @return Name 参数名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置参数名
     * @param Name 参数名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取参数值
     * @return Value 参数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置参数值
     * @param Value 参数值
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

