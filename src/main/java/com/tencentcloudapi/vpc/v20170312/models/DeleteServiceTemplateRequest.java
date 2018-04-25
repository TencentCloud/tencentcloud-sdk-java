package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteServiceTemplateRequest  extends AbstractModel{


    /**
    * 协议端口模板实例ID，例如：ppm-e6dy460g。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;
    

    /**
     * 获取协议端口模板实例ID，例如：ppm-e6dy460g。
     * @return ServiceTemplateId 协议端口模板实例ID，例如：ppm-e6dy460g。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * 设置协议端口模板实例ID，例如：ppm-e6dy460g。
     * @param ServiceTemplateId 协议端口模板实例ID，例如：ppm-e6dy460g。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);

    }
}

