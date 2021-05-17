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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourceRequest extends AbstractModel{

    /**
    * 命名空间 Id
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

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
     * Get 命名空间 Id 
     * @return NamespaceId 命名空间 Id
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间 Id
     * @param NamespaceId 命名空间 Id
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
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

    public CreateResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceRequest(CreateResourceRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

