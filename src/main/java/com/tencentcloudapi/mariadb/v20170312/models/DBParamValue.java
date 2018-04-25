package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DBParamValue  extends AbstractModel{


    /**
    * 参数名称
    */
    @SerializedName("Param")
    @Expose
    private String Param;
    

    /**
    * 参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;
    

    /**
     * 获取参数名称
     * @return Param 参数名称
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * 设置参数名称
     * @param Param 参数名称
     */
    public void setParam(String Param) {
        this.Param = Param;
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
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

