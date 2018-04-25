package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteAddressTemplateGroupRequest  extends AbstractModel{


    /**
    * IP地址模板集合实例ID，例如：ipmg-90cex8mq。
    */
    @SerializedName("AddressTemplateGroupId")
    @Expose
    private String AddressTemplateGroupId;
    

    /**
     * 获取IP地址模板集合实例ID，例如：ipmg-90cex8mq。
     * @return AddressTemplateGroupId IP地址模板集合实例ID，例如：ipmg-90cex8mq。
     */
    public String getAddressTemplateGroupId() {
        return this.AddressTemplateGroupId;
    }

    /**
     * 设置IP地址模板集合实例ID，例如：ipmg-90cex8mq。
     * @param AddressTemplateGroupId IP地址模板集合实例ID，例如：ipmg-90cex8mq。
     */
    public void setAddressTemplateGroupId(String AddressTemplateGroupId) {
        this.AddressTemplateGroupId = AddressTemplateGroupId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupId", this.AddressTemplateGroupId);

    }
}

