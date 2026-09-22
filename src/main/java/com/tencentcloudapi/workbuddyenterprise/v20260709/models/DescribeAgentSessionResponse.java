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

public class DescribeAgentSessionResponse extends AbstractModel {

    /**
    * 会话 ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

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
    * 版本 ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID）
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 版本状态：DRAFT / ENABLED / DISABLED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建者 Uin
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 连接器来源：ENTERPRISE_AGENT / ASSISTANT
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 可用的聊天接入点列表（详情独有）
    */
    @SerializedName("EndpointSet")
    @Expose
    private ChatEndpoint [] EndpointSet;

    /**
    * 创建时间
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
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 会话 ID 
     * @return SessionId 会话 ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID
     * @param SessionId 会话 ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀 
     * @return SessionName 会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set 会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀
     * @param SessionName 会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

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
     * Get 版本 ID 
     * @return VersionId 版本 ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本 ID
     * @param VersionId 版本 ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID） 
     * @return VersionName 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID）
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID）
     * @param VersionName 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID）
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 版本状态：DRAFT / ENABLED / DISABLED 
     * @return Status 版本状态：DRAFT / ENABLED / DISABLED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态：DRAFT / ENABLED / DISABLED
     * @param Status 版本状态：DRAFT / ENABLED / DISABLED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建者 Uin 
     * @return Creator 创建者 Uin
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者 Uin
     * @param Creator 创建者 Uin
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 连接器来源：ENTERPRISE_AGENT / ASSISTANT 
     * @return Source 连接器来源：ENTERPRISE_AGENT / ASSISTANT
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 连接器来源：ENTERPRISE_AGENT / ASSISTANT
     * @param Source 连接器来源：ENTERPRISE_AGENT / ASSISTANT
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 可用的聊天接入点列表（详情独有） 
     * @return EndpointSet 可用的聊天接入点列表（详情独有）
     */
    public ChatEndpoint [] getEndpointSet() {
        return this.EndpointSet;
    }

    /**
     * Set 可用的聊天接入点列表（详情独有）
     * @param EndpointSet 可用的聊天接入点列表（详情独有）
     */
    public void setEndpointSet(ChatEndpoint [] EndpointSet) {
        this.EndpointSet = EndpointSet;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
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

    public DescribeAgentSessionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentSessionResponse(DescribeAgentSessionResponse source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.EndpointSet != null) {
            this.EndpointSet = new ChatEndpoint[source.EndpointSet.length];
            for (int i = 0; i < source.EndpointSet.length; i++) {
                this.EndpointSet[i] = new ChatEndpoint(source.EndpointSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArrayObj(map, prefix + "EndpointSet.", this.EndpointSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

