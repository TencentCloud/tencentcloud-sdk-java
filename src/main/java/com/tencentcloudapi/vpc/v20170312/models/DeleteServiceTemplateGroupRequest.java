package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteServiceTemplateGroupRequest  extends AbstractModel{


    /**
    * 协议端口模板集合实例ID，例如：ppmg-n17uxvve。
    */
    @SerializedName("ServiceTemplateGroupId")
    @Expose
    private String ServiceTemplateGroupId;

    /**
     * 获取协议端口模板集合实例ID，例如：ppmg-n17uxvve。
     * @return ServiceTemplateGroupId 协议端口模板集合实例ID，例如：ppmg-n17uxvve。
     */
    public String getServiceTemplateGroupId() {
        return this.ServiceTemplateGroupId;
    }

    /**
     * 设置协议端口模板集合实例ID，例如：ppmg-n17uxvve。
     * @param ServiceTemplateGroupId 协议端口模板集合实例ID，例如：ppmg-n17uxvve。
     */
    public void setServiceTemplateGroupId(String ServiceTemplateGroupId) {
        this.ServiceTemplateGroupId = ServiceTemplateGroupId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateGroupId", this.ServiceTemplateGroupId);

    }
}

