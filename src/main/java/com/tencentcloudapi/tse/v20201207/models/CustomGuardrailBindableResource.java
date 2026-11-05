/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailBindableResource extends AbstractModel {

    /**
    * <p>业务资源类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>业务资源 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>业务资源名称</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>业务资源访问路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>数据面解析协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>该业务资源对应的全部 Kong Route ID，仅用于关联/排查；创建 Scope.Resources 时仍填业务 ResourceId。</p>
    */
    @SerializedName("RouteIds")
    @Expose
    private String [] RouteIds;

    /**
    * <p>对应任一 Route 是否被其他自定义护栏策略占用；查询时传 PolicyId 可排除自身占用。</p>
    */
    @SerializedName("Occupied")
    @Expose
    private Boolean Occupied;

    /**
    * <p>占用策略的可读名称及 ID，格式为 策略名称 (策略ID)，多个以逗号分隔；名称不可用时回退 ID，不应按此展示字段解析策略主键。</p>
    */
    @SerializedName("OccupiedBy")
    @Expose
    private String OccupiedBy;

    /**
    * <p>资源当前是否可解析为受支持的绑定目标；与 Occupied 独立，选择时同时检查 Supported=true 且 Occupied=false。</p>
    */
    @SerializedName("Supported")
    @Expose
    private Boolean Supported;

    /**
    * <p>不支持绑定的原因</p>
    */
    @SerializedName("UnsupportedReason")
    @Expose
    private String UnsupportedReason;

    /**
     * Get <p>业务资源类型</p> 
     * @return ResourceType <p>业务资源类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>业务资源类型</p>
     * @param ResourceType <p>业务资源类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>业务资源 ID</p> 
     * @return ResourceId <p>业务资源 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>业务资源 ID</p>
     * @param ResourceId <p>业务资源 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>业务资源名称</p> 
     * @return ResourceName <p>业务资源名称</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>业务资源名称</p>
     * @param ResourceName <p>业务资源名称</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>业务资源访问路径</p> 
     * @return Path <p>业务资源访问路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>业务资源访问路径</p>
     * @param Path <p>业务资源访问路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>数据面解析协议</p> 
     * @return Protocol <p>数据面解析协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>数据面解析协议</p>
     * @param Protocol <p>数据面解析协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>该业务资源对应的全部 Kong Route ID，仅用于关联/排查；创建 Scope.Resources 时仍填业务 ResourceId。</p> 
     * @return RouteIds <p>该业务资源对应的全部 Kong Route ID，仅用于关联/排查；创建 Scope.Resources 时仍填业务 ResourceId。</p>
     */
    public String [] getRouteIds() {
        return this.RouteIds;
    }

    /**
     * Set <p>该业务资源对应的全部 Kong Route ID，仅用于关联/排查；创建 Scope.Resources 时仍填业务 ResourceId。</p>
     * @param RouteIds <p>该业务资源对应的全部 Kong Route ID，仅用于关联/排查；创建 Scope.Resources 时仍填业务 ResourceId。</p>
     */
    public void setRouteIds(String [] RouteIds) {
        this.RouteIds = RouteIds;
    }

    /**
     * Get <p>对应任一 Route 是否被其他自定义护栏策略占用；查询时传 PolicyId 可排除自身占用。</p> 
     * @return Occupied <p>对应任一 Route 是否被其他自定义护栏策略占用；查询时传 PolicyId 可排除自身占用。</p>
     */
    public Boolean getOccupied() {
        return this.Occupied;
    }

    /**
     * Set <p>对应任一 Route 是否被其他自定义护栏策略占用；查询时传 PolicyId 可排除自身占用。</p>
     * @param Occupied <p>对应任一 Route 是否被其他自定义护栏策略占用；查询时传 PolicyId 可排除自身占用。</p>
     */
    public void setOccupied(Boolean Occupied) {
        this.Occupied = Occupied;
    }

    /**
     * Get <p>占用策略的可读名称及 ID，格式为 策略名称 (策略ID)，多个以逗号分隔；名称不可用时回退 ID，不应按此展示字段解析策略主键。</p> 
     * @return OccupiedBy <p>占用策略的可读名称及 ID，格式为 策略名称 (策略ID)，多个以逗号分隔；名称不可用时回退 ID，不应按此展示字段解析策略主键。</p>
     */
    public String getOccupiedBy() {
        return this.OccupiedBy;
    }

    /**
     * Set <p>占用策略的可读名称及 ID，格式为 策略名称 (策略ID)，多个以逗号分隔；名称不可用时回退 ID，不应按此展示字段解析策略主键。</p>
     * @param OccupiedBy <p>占用策略的可读名称及 ID，格式为 策略名称 (策略ID)，多个以逗号分隔；名称不可用时回退 ID，不应按此展示字段解析策略主键。</p>
     */
    public void setOccupiedBy(String OccupiedBy) {
        this.OccupiedBy = OccupiedBy;
    }

    /**
     * Get <p>资源当前是否可解析为受支持的绑定目标；与 Occupied 独立，选择时同时检查 Supported=true 且 Occupied=false。</p> 
     * @return Supported <p>资源当前是否可解析为受支持的绑定目标；与 Occupied 独立，选择时同时检查 Supported=true 且 Occupied=false。</p>
     */
    public Boolean getSupported() {
        return this.Supported;
    }

    /**
     * Set <p>资源当前是否可解析为受支持的绑定目标；与 Occupied 独立，选择时同时检查 Supported=true 且 Occupied=false。</p>
     * @param Supported <p>资源当前是否可解析为受支持的绑定目标；与 Occupied 独立，选择时同时检查 Supported=true 且 Occupied=false。</p>
     */
    public void setSupported(Boolean Supported) {
        this.Supported = Supported;
    }

    /**
     * Get <p>不支持绑定的原因</p> 
     * @return UnsupportedReason <p>不支持绑定的原因</p>
     */
    public String getUnsupportedReason() {
        return this.UnsupportedReason;
    }

    /**
     * Set <p>不支持绑定的原因</p>
     * @param UnsupportedReason <p>不支持绑定的原因</p>
     */
    public void setUnsupportedReason(String UnsupportedReason) {
        this.UnsupportedReason = UnsupportedReason;
    }

    public CustomGuardrailBindableResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailBindableResource(CustomGuardrailBindableResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RouteIds != null) {
            this.RouteIds = new String[source.RouteIds.length];
            for (int i = 0; i < source.RouteIds.length; i++) {
                this.RouteIds[i] = new String(source.RouteIds[i]);
            }
        }
        if (source.Occupied != null) {
            this.Occupied = new Boolean(source.Occupied);
        }
        if (source.OccupiedBy != null) {
            this.OccupiedBy = new String(source.OccupiedBy);
        }
        if (source.Supported != null) {
            this.Supported = new Boolean(source.Supported);
        }
        if (source.UnsupportedReason != null) {
            this.UnsupportedReason = new String(source.UnsupportedReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "RouteIds.", this.RouteIds);
        this.setParamSimple(map, prefix + "Occupied", this.Occupied);
        this.setParamSimple(map, prefix + "OccupiedBy", this.OccupiedBy);
        this.setParamSimple(map, prefix + "Supported", this.Supported);
        this.setParamSimple(map, prefix + "UnsupportedReason", this.UnsupportedReason);

    }
}

