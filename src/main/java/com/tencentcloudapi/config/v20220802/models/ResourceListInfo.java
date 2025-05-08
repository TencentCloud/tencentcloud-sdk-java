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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceListInfo extends AbstractModel {

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源状态
    */
    @SerializedName("ResourceStatus")
    @Expose
    private String ResourceStatus;

    /**
    * 1 :已删除 2：未删除
    */
    @SerializedName("ResourceDelete")
    @Expose
    private Long ResourceDelete;

    /**
    * 资源创建时间
    */
    @SerializedName("ResourceCreateTime")
    @Expose
    private String ResourceCreateTime;

    /**
    * 标签信息
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 可用区
    */
    @SerializedName("ResourceZone")
    @Expose
    private String ResourceZone;

    /**
    * 合规状态
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 地域 
     * @return ResourceRegion 地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 地域
     * @param ResourceRegion 地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源状态 
     * @return ResourceStatus 资源状态
     */
    public String getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 资源状态
     * @param ResourceStatus 资源状态
     */
    public void setResourceStatus(String ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get 1 :已删除 2：未删除 
     * @return ResourceDelete 1 :已删除 2：未删除
     */
    public Long getResourceDelete() {
        return this.ResourceDelete;
    }

    /**
     * Set 1 :已删除 2：未删除
     * @param ResourceDelete 1 :已删除 2：未删除
     */
    public void setResourceDelete(Long ResourceDelete) {
        this.ResourceDelete = ResourceDelete;
    }

    /**
     * Get 资源创建时间 
     * @return ResourceCreateTime 资源创建时间
     */
    public String getResourceCreateTime() {
        return this.ResourceCreateTime;
    }

    /**
     * Set 资源创建时间
     * @param ResourceCreateTime 资源创建时间
     */
    public void setResourceCreateTime(String ResourceCreateTime) {
        this.ResourceCreateTime = ResourceCreateTime;
    }

    /**
     * Get 标签信息 
     * @return Tags 标签信息
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
     * @param Tags 标签信息
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 可用区 
     * @return ResourceZone 可用区
     */
    public String getResourceZone() {
        return this.ResourceZone;
    }

    /**
     * Set 可用区
     * @param ResourceZone 可用区
     */
    public void setResourceZone(String ResourceZone) {
        this.ResourceZone = ResourceZone;
    }

    /**
     * Get 合规状态 
     * @return ComplianceResult 合规状态
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set 合规状态
     * @param ComplianceResult 合规状态
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    public ResourceListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceListInfo(ResourceListInfo source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new String(source.ResourceStatus);
        }
        if (source.ResourceDelete != null) {
            this.ResourceDelete = new Long(source.ResourceDelete);
        }
        if (source.ResourceCreateTime != null) {
            this.ResourceCreateTime = new String(source.ResourceCreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ResourceZone != null) {
            this.ResourceZone = new String(source.ResourceZone);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String(source.ComplianceResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "ResourceDelete", this.ResourceDelete);
        this.setParamSimple(map, prefix + "ResourceCreateTime", this.ResourceCreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ResourceZone", this.ResourceZone);
        this.setParamSimple(map, prefix + "ComplianceResult", this.ComplianceResult);

    }
}

