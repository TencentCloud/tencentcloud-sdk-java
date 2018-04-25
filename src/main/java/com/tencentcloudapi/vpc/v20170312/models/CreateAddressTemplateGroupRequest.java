package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateAddressTemplateGroupRequest  extends AbstractModel{


    /**
    * IP地址模版集合名称。
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;
    

    /**
    * IP地址模版实例ID，例如：ipm-mdunqeb6。
    */
    @SerializedName("AddressTemplateIds")
    @Expose
    private String [] AddressTemplateIds;
    

    /**
     * 获取IP地址模版集合名称。
     * @return AddressTemplateGroupName IP地址模版集合名称。
     */
    public String getAddressTemplateGroupName() {
        return this.AddressTemplateGroupName;
    }

    /**
     * 设置IP地址模版集合名称。
     * @param AddressTemplateGroupName IP地址模版集合名称。
     */
    public void setAddressTemplateGroupName(String AddressTemplateGroupName) {
        this.AddressTemplateGroupName = AddressTemplateGroupName;
    }

    /**
     * 获取IP地址模版实例ID，例如：ipm-mdunqeb6。
     * @return AddressTemplateIds IP地址模版实例ID，例如：ipm-mdunqeb6。
     */
    public String [] getAddressTemplateIds() {
        return this.AddressTemplateIds;
    }

    /**
     * 设置IP地址模版实例ID，例如：ipm-mdunqeb6。
     * @param AddressTemplateIds IP地址模版实例ID，例如：ipm-mdunqeb6。
     */
    public void setAddressTemplateIds(String [] AddressTemplateIds) {
        this.AddressTemplateIds = AddressTemplateIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamArraySimple(map, prefix + "AddressTemplateIds.", this.AddressTemplateIds);

    }
}

