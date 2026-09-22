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

public class ModifyAgentResponse extends AbstractModel {

    /**
    * Agent 业务 ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Agent 名称
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * Agent 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 头像 URL
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * 是否调试 Agent
    */
    @SerializedName("IsDebug")
    @Expose
    private Boolean IsDebug;

    /**
    * 创建时间（RFC3339）
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间（RFC3339）
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）
    */
    @SerializedName("RoutingSet")
    @Expose
    private RoutingItem [] RoutingSet;

    /**
    * A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）
    */
    @SerializedName("A2AConfig")
    @Expose
    private A2AConfig A2AConfig;

    /**
    * 绑定的 OneID 企业账号 ID。允许为空：未绑定的存量与新建 Agent 该字段缺省，绑定后回显绑定值
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Agent 业务 ID 
     * @return AgentId Agent 业务 ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent 业务 ID
     * @param AgentId Agent 业务 ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Agent 名称 
     * @return AgentName Agent 名称
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Agent 名称
     * @param AgentName Agent 名称
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get Agent 描述 
     * @return Description Agent 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Agent 描述
     * @param Description Agent 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 头像 URL 
     * @return AvatarUrl 头像 URL
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 头像 URL
     * @param AvatarUrl 头像 URL
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get 是否调试 Agent 
     * @return IsDebug 是否调试 Agent
     */
    public Boolean getIsDebug() {
        return this.IsDebug;
    }

    /**
     * Set 是否调试 Agent
     * @param IsDebug 是否调试 Agent
     */
    public void setIsDebug(Boolean IsDebug) {
        this.IsDebug = IsDebug;
    }

    /**
     * Get 创建时间（RFC3339） 
     * @return CreatedTime 创建时间（RFC3339）
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间（RFC3339）
     * @param CreatedTime 创建时间（RFC3339）
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间（RFC3339） 
     * @return ModifiedTime 更新时间（RFC3339）
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 更新时间（RFC3339）
     * @param ModifiedTime 更新时间（RFC3339）
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 流量路由配置（VersionId 恒为字符串，防 JS 精度丢失） 
     * @return RoutingSet 流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）
     */
    public RoutingItem [] getRoutingSet() {
        return this.RoutingSet;
    }

    /**
     * Set 流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）
     * @param RoutingSet 流量路由配置（VersionId 恒为字符串，防 JS 精度丢失）
     */
    public void setRoutingSet(RoutingItem [] RoutingSet) {
        this.RoutingSet = RoutingSet;
    }

    /**
     * Get A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构） 
     * @return A2AConfig A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）
     */
    public A2AConfig getA2AConfig() {
        return this.A2AConfig;
    }

    /**
     * Set A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）
     * @param A2AConfig A2A 对外互通配置与注册态（只读回显；原四个平铺字段收进结构）
     */
    public void setA2AConfig(A2AConfig A2AConfig) {
        this.A2AConfig = A2AConfig;
    }

    /**
     * Get 绑定的 OneID 企业账号 ID。允许为空：未绑定的存量与新建 Agent 该字段缺省，绑定后回显绑定值 
     * @return AccountId 绑定的 OneID 企业账号 ID。允许为空：未绑定的存量与新建 Agent 该字段缺省，绑定后回显绑定值
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 绑定的 OneID 企业账号 ID。允许为空：未绑定的存量与新建 Agent 该字段缺省，绑定后回显绑定值
     * @param AccountId 绑定的 OneID 企业账号 ID。允许为空：未绑定的存量与新建 Agent 该字段缺省，绑定后回显绑定值
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
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

    public ModifyAgentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentResponse(ModifyAgentResponse source) {
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
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
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
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

