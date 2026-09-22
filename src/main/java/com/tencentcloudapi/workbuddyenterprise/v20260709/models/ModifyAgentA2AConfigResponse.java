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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentA2AConfigResponse extends AbstractModel {

    /**
    * <p>Agent 业务 ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Agent 名称</p>
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * <p>Agent 描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>头像 URL</p>
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * <p>是否调试 Agent</p>
    */
    @SerializedName("IsDebug")
    @Expose
    private Boolean IsDebug;

    /**
    * <p>创建时间（RFC3339）</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>更新时间（RFC3339）</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）</p>
    */
    @SerializedName("RoutingSet")
    @Expose
    private RoutingItem [] RoutingSet;

    /**
    * <p>A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）</p>
    */
    @SerializedName("A2AConfig")
    @Expose
    private A2AConfig A2AConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Agent 业务 ID</p> 
     * @return AgentId <p>Agent 业务 ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent 业务 ID</p>
     * @param AgentId <p>Agent 业务 ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Agent 名称</p> 
     * @return AgentName <p>Agent 名称</p>
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set <p>Agent 名称</p>
     * @param AgentName <p>Agent 名称</p>
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get <p>Agent 描述</p> 
     * @return Description <p>Agent 描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Agent 描述</p>
     * @param Description <p>Agent 描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>头像 URL</p> 
     * @return AvatarUrl <p>头像 URL</p>
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set <p>头像 URL</p>
     * @param AvatarUrl <p>头像 URL</p>
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get <p>是否调试 Agent</p> 
     * @return IsDebug <p>是否调试 Agent</p>
     */
    public Boolean getIsDebug() {
        return this.IsDebug;
    }

    /**
     * Set <p>是否调试 Agent</p>
     * @param IsDebug <p>是否调试 Agent</p>
     */
    public void setIsDebug(Boolean IsDebug) {
        this.IsDebug = IsDebug;
    }

    /**
     * Get <p>创建时间（RFC3339）</p> 
     * @return CreatedTime <p>创建时间（RFC3339）</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间（RFC3339）</p>
     * @param CreatedTime <p>创建时间（RFC3339）</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间（RFC3339）</p> 
     * @return ModifiedTime <p>更新时间（RFC3339）</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>更新时间（RFC3339）</p>
     * @param ModifiedTime <p>更新时间（RFC3339）</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）</p> 
     * @return RoutingSet <p>流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）</p>
     */
    public RoutingItem [] getRoutingSet() {
        return this.RoutingSet;
    }

    /**
     * Set <p>流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）</p>
     * @param RoutingSet <p>流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）</p>
     */
    public void setRoutingSet(RoutingItem [] RoutingSet) {
        this.RoutingSet = RoutingSet;
    }

    /**
     * Get <p>A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）</p> 
     * @return A2AConfig <p>A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）</p>
     */
    public A2AConfig getA2AConfig() {
        return this.A2AConfig;
    }

    /**
     * Set <p>A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）</p>
     * @param A2AConfig <p>A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）</p>
     */
    public void setA2AConfig(A2AConfig A2AConfig) {
        this.A2AConfig = A2AConfig;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyAgentA2AConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentA2AConfigResponse(ModifyAgentA2AConfigResponse source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AvatarUrl != null) {
            this.AvatarUrl = new String(source.AvatarUrl);
        }
        if (source.IsDebug != null) {
            this.IsDebug = new Boolean(source.IsDebug);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.RoutingSet != null) {
            this.RoutingSet = new RoutingItem[source.RoutingSet.length];
            for (int i = 0; i < source.RoutingSet.length; i++) {
                this.RoutingSet[i] = new RoutingItem(source.RoutingSet[i]);
            }
        }
        if (source.A2AConfig != null) {
            this.A2AConfig = new A2AConfig(source.A2AConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);
        this.setParamSimple(map, prefix + "IsDebug", this.IsDebug);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamArrayObj(map, prefix + "RoutingSet.", this.RoutingSet);
        this.setParamObj(map, prefix + "A2AConfig.", this.A2AConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

