/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceTemplateGroupRequest extends AbstractModel{

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
     * Get 协议端口模板集合名称 
     * @return ServiceTemplateGroupName 协议端口模板集合名称
     */
    public String getServiceTemplateGroupName() {
        return this.ServiceTemplateGroupName;
    }

    /**
     * Set 协议端口模板集合名称
     * @param ServiceTemplateGroupName 协议端口模板集合名称
     */
    public void setServiceTemplateGroupName(String ServiceTemplateGroupName) {
        this.ServiceTemplateGroupName = ServiceTemplateGroupName;
    }

    /**
     * Get 协议端口模板实例ID，例如：ppm-4dw6agho。 
     * @return ServiceTemplateIds 协议端口模板实例ID，例如：ppm-4dw6agho。
     */
    public String [] getServiceTemplateIds() {
        return this.ServiceTemplateIds;
    }

    /**
     * Set 协议端口模板实例ID，例如：ppm-4dw6agho。
     * @param ServiceTemplateIds 协议端口模板实例ID，例如：ppm-4dw6agho。
     */
    public void setServiceTemplateIds(String [] ServiceTemplateIds) {
        this.ServiceTemplateIds = ServiceTemplateIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateGroupName", this.ServiceTemplateGroupName);
        this.setParamArraySimple(map, prefix + "ServiceTemplateIds.", this.ServiceTemplateIds);

    }
}

