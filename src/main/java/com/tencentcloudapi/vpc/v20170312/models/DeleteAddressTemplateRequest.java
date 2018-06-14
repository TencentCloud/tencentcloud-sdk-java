package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteAddressTemplateRequest  extends AbstractModel{


    /**
    * IP地址模板实例ID，例如：ipm-09o5m8kc。
    */
    @SerializedName("AddressTemplateId")
    @Expose
    private String AddressTemplateId;

    /**
     * 获取IP地址模板实例ID，例如：ipm-09o5m8kc。
     * @return AddressTemplateId IP地址模板实例ID，例如：ipm-09o5m8kc。
     */
    public String getAddressTemplateId() {
        return this.AddressTemplateId;
    }

    /**
     * 设置IP地址模板实例ID，例如：ipm-09o5m8kc。
     * @param AddressTemplateId IP地址模板实例ID，例如：ipm-09o5m8kc。
     */
    public void setAddressTemplateId(String AddressTemplateId) {
        this.AddressTemplateId = AddressTemplateId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateId", this.AddressTemplateId);

    }
}

