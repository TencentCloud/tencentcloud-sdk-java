package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AccountAttribute  extends AbstractModel{


    /**
    * 属性名
    */
    @SerializedName("AttributeName")
    @Expose
    private String AttributeName;

    /**
    * 属性值
    */
    @SerializedName("AttributeValues")
    @Expose
    private String [] AttributeValues;

    /**
     * 获取属性名
     * @return AttributeName 属性名
     */
    public String getAttributeName() {
        return this.AttributeName;
    }

    /**
     * 设置属性名
     * @param AttributeName 属性名
     */
    public void setAttributeName(String AttributeName) {
        this.AttributeName = AttributeName;
    }

    /**
     * 获取属性值
     * @return AttributeValues 属性值
     */
    public String [] getAttributeValues() {
        return this.AttributeValues;
    }

    /**
     * 设置属性值
     * @param AttributeValues 属性值
     */
    public void setAttributeValues(String [] AttributeValues) {
        this.AttributeValues = AttributeValues;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributeName", this.AttributeName);
        this.setParamArraySimple(map, prefix + "AttributeValues.", this.AttributeValues);

    }
}

