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

public class ServiceTemplate extends AbstractModel{

    /**
    * 协议端口实例ID，例如：ppm-f5n1f8da。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 模板名称。
    */
    @SerializedName("ServiceTemplateName")
    @Expose
    private String ServiceTemplateName;

    /**
    * 协议端口信息。
    */
    @SerializedName("ServiceSet")
    @Expose
    private String [] ServiceSet;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 协议端口实例ID，例如：ppm-f5n1f8da。 
     * @return ServiceTemplateId 协议端口实例ID，例如：ppm-f5n1f8da。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 协议端口实例ID，例如：ppm-f5n1f8da。
     * @param ServiceTemplateId 协议端口实例ID，例如：ppm-f5n1f8da。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get 模板名称。 
     * @return ServiceTemplateName 模板名称。
     */
    public String getServiceTemplateName() {
        return this.ServiceTemplateName;
    }

    /**
     * Set 模板名称。
     * @param ServiceTemplateName 模板名称。
     */
    public void setServiceTemplateName(String ServiceTemplateName) {
        this.ServiceTemplateName = ServiceTemplateName;
    }

    /**
     * Get 协议端口信息。 
     * @return ServiceSet 协议端口信息。
     */
    public String [] getServiceSet() {
        return this.ServiceSet;
    }

    /**
     * Set 协议端口信息。
     * @param ServiceSet 协议端口信息。
     */
    public void setServiceSet(String [] ServiceSet) {
        this.ServiceSet = ServiceSet;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "ServiceTemplateName", this.ServiceTemplateName);
        this.setParamArraySimple(map, prefix + "ServiceSet.", this.ServiceSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

