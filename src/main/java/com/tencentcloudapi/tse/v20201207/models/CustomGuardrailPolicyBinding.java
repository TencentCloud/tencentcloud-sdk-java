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

public class CustomGuardrailPolicyBinding extends AbstractModel {

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
    * <p>资源访问路径</p>
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
    * <p>底层 Kong Route ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * <p>绑定 Route 上的 cngw-ai-custom-guardrail 插件实例 ID；未投影、禁用或同步失败时可能不存在。</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * <p>最近一次同步错误摘要</p>
    */
    @SerializedName("SyncError")
    @Expose
    private String SyncError;

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
     * Get <p>资源访问路径</p> 
     * @return Path <p>资源访问路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>资源访问路径</p>
     * @param Path <p>资源访问路径</p>
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
     * Get <p>底层 Kong Route ID</p> 
     * @return RouteId <p>底层 Kong Route ID</p>
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>底层 Kong Route ID</p>
     * @param RouteId <p>底层 Kong Route ID</p>
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>绑定 Route 上的 cngw-ai-custom-guardrail 插件实例 ID；未投影、禁用或同步失败时可能不存在。</p> 
     * @return PluginId <p>绑定 Route 上的 cngw-ai-custom-guardrail 插件实例 ID；未投影、禁用或同步失败时可能不存在。</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>绑定 Route 上的 cngw-ai-custom-guardrail 插件实例 ID；未投影、禁用或同步失败时可能不存在。</p>
     * @param PluginId <p>绑定 Route 上的 cngw-ai-custom-guardrail 插件实例 ID；未投影、禁用或同步失败时可能不存在。</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p> 
     * @return SyncStatus <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     * @param SyncStatus <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>最近一次同步错误摘要</p> 
     * @return SyncError <p>最近一次同步错误摘要</p>
     */
    public String getSyncError() {
        return this.SyncError;
    }

    /**
     * Set <p>最近一次同步错误摘要</p>
     * @param SyncError <p>最近一次同步错误摘要</p>
     */
    public void setSyncError(String SyncError) {
        this.SyncError = SyncError;
    }

    public CustomGuardrailPolicyBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailPolicyBinding(CustomGuardrailPolicyBinding source) {
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
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.SyncError != null) {
            this.SyncError = new String(source.SyncError);
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
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncError", this.SyncError);

    }
}

