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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourceRequest extends AbstractModel{

    /**
    * 环境 Id
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 资源类型，目前支持文件系统：CFS；日志服务：CLS；注册中心：TSE_SRE
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源 Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 资源来源，目前支持：existing，已有资源；creating，自动创建
    */
    @SerializedName("ResourceFrom")
    @Expose
    private String ResourceFrom;

    /**
    * 设置 resource 的额外配置
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
     * Get 环境 Id 
     * @return EnvironmentId 环境 Id
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境 Id
     * @param EnvironmentId 环境 Id
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 资源类型，目前支持文件系统：CFS；日志服务：CLS；注册中心：TSE_SRE 
     * @return ResourceType 资源类型，目前支持文件系统：CFS；日志服务：CLS；注册中心：TSE_SRE
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，目前支持文件系统：CFS；日志服务：CLS；注册中心：TSE_SRE
     * @param ResourceType 资源类型，目前支持文件系统：CFS；日志服务：CLS；注册中心：TSE_SRE
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源 Id 
     * @return ResourceId 资源 Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 Id
     * @param ResourceId 资源 Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 资源来源，目前支持：existing，已有资源；creating，自动创建 
     * @return ResourceFrom 资源来源，目前支持：existing，已有资源；creating，自动创建
     */
    public String getResourceFrom() {
        return this.ResourceFrom;
    }

    /**
     * Set 资源来源，目前支持：existing，已有资源；creating，自动创建
     * @param ResourceFrom 资源来源，目前支持：existing，已有资源；creating，自动创建
     */
    public void setResourceFrom(String ResourceFrom) {
        this.ResourceFrom = ResourceFrom;
    }

    /**
     * Get 设置 resource 的额外配置 
     * @return ResourceConfig 设置 resource 的额外配置
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set 设置 resource 的额外配置
     * @param ResourceConfig 设置 resource 的额外配置
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    public CreateResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceRequest(CreateResourceRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.ResourceFrom != null) {
            this.ResourceFrom = new String(source.ResourceFrom);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "ResourceFrom", this.ResourceFrom);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);

    }
}

