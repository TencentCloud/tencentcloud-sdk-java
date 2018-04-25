package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyServiceTemplateAttributeRequest  extends AbstractModel{


    /**
    * 协议端口模板实例ID，例如：ppm-529nwwj8。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;
    

    /**
    * 协议端口模板名称。
    */
    @SerializedName("ServiceTemplateName")
    @Expose
    private String ServiceTemplateName;
    

    /**
    * 支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。
    */
    @SerializedName("Services")
    @Expose
    private String [] Services;
    

    /**
     * 获取协议端口模板实例ID，例如：ppm-529nwwj8。
     * @return ServiceTemplateId 协议端口模板实例ID，例如：ppm-529nwwj8。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * 设置协议端口模板实例ID，例如：ppm-529nwwj8。
     * @param ServiceTemplateId 协议端口模板实例ID，例如：ppm-529nwwj8。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * 获取协议端口模板名称。
     * @return ServiceTemplateName 协议端口模板名称。
     */
    public String getServiceTemplateName() {
        return this.ServiceTemplateName;
    }

    /**
     * 设置协议端口模板名称。
     * @param ServiceTemplateName 协议端口模板名称。
     */
    public void setServiceTemplateName(String ServiceTemplateName) {
        this.ServiceTemplateName = ServiceTemplateName;
    }

    /**
     * 获取支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。
     * @return Services 支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。
     */
    public String [] getServices() {
        return this.Services;
    }

    /**
     * 设置支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。
     * @param Services 支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。
     */
    public void setServices(String [] Services) {
        this.Services = Services;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "ServiceTemplateName", this.ServiceTemplateName);
        this.setParamArraySimple(map, prefix + "Services.", this.Services);

    }
}

