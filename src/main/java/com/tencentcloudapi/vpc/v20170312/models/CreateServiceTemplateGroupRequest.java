package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateServiceTemplateGroupRequest  extends AbstractModel{


    /**
    * 协议端口模板集合名称
    */
    @SerializedName("ServiceTemplateGroupName")
    @Expose
    private String ServiceTemplateGroupName;

    /**
    * 协议端口模板实例ID，例如：ppm-4dw6agho。
    */
    @SerializedName("ServiceTemplateIds")
    @Expose
    private String [] ServiceTemplateIds;

    /**
     * 获取协议端口模板集合名称
     * @return ServiceTemplateGroupName 协议端口模板集合名称
     */
    public String getServiceTemplateGroupName() {
        return this.ServiceTemplateGroupName;
    }

    /**
     * 设置协议端口模板集合名称
     * @param ServiceTemplateGroupName 协议端口模板集合名称
     */
    public void setServiceTemplateGroupName(String ServiceTemplateGroupName) {
        this.ServiceTemplateGroupName = ServiceTemplateGroupName;
    }

    /**
     * 获取协议端口模板实例ID，例如：ppm-4dw6agho。
     * @return ServiceTemplateIds 协议端口模板实例ID，例如：ppm-4dw6agho。
     */
    public String [] getServiceTemplateIds() {
        return this.ServiceTemplateIds;
    }

    /**
     * 设置协议端口模板实例ID，例如：ppm-4dw6agho。
     * @param ServiceTemplateIds 协议端口模板实例ID，例如：ppm-4dw6agho。
     */
    public void setServiceTemplateIds(String [] ServiceTemplateIds) {
        this.ServiceTemplateIds = ServiceTemplateIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateGroupName", this.ServiceTemplateGroupName);
        this.setParamArraySimple(map, prefix + "ServiceTemplateIds.", this.ServiceTemplateIds);

    }
}

