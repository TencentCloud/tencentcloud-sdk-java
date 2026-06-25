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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWMCPServer extends AbstractModel {

    /**
    * <p>MCP Server ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>MCP Server名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>MCP Server类型，取值：MCP/Rest2MCP</p>
    */
    @SerializedName("ServerType")
    @Expose
    private String ServerType;

    /**
    * <p>协议类型，取值: StreamableHttp</p>
    */
    @SerializedName("Transport")
    @Expose
    private String Transport;

    /**
    * <p>服务类型：</p><ul><li>Registry  </li><li>HostIP</li></ul>
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * <p>展示名字</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>MCP提供给客户端的Endpoint</p>
    */
    @SerializedName("MCPEndpoint")
    @Expose
    private String MCPEndpoint;

    /**
    * <p>注册中心来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamInfo")
    @Expose
    private AIGWMCPUpstreamInfoDetail UpstreamInfo;

    /**
    * <p>会话配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionConfig")
    @Expose
    private AIGWMCPSessionConfig SessionConfig;

    /**
    * <p>超时时间，单位ms</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>失败重试次数</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>运行状态</p><p>枚举值：</p><ul><li>Online： 在线</li><li>Offline： 离线</li><li>Error： 错误</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否启用健康检查</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheck")
    @Expose
    private AIGWHealthCheckSetting HealthCheck;

    /**
    * <p>Tool分组内工具数量限制</p>
    */
    @SerializedName("ToolCountLimit")
    @Expose
    private Long ToolCountLimit;

    /**
    * <p>Tool分组内工具命名冲突策略</p><p>枚举值：</p><ul><li>AutoPrefix： 自动前缀</li><li>Reject： 拒绝</li></ul>
    */
    @SerializedName("ConflictStrategy")
    @Expose
    private String ConflictStrategy;

    /**
    * <p>MCP 市场发布状态</p><p>枚举值：</p><ul><li>None： 未发布</li><li>Published： 已发布</li></ul>
    */
    @SerializedName("MarketStatus")
    @Expose
    private String MarketStatus;

    /**
     * Get <p>MCP Server ID</p> 
     * @return ServerId <p>MCP Server ID</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MCP Server ID</p>
     * @param ServerId <p>MCP Server ID</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>MCP Server名称</p> 
     * @return Name <p>MCP Server名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>MCP Server名称</p>
     * @param Name <p>MCP Server名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>MCP Server类型，取值：MCP/Rest2MCP</p> 
     * @return ServerType <p>MCP Server类型，取值：MCP/Rest2MCP</p>
     */
    public String getServerType() {
        return this.ServerType;
    }

    /**
     * Set <p>MCP Server类型，取值：MCP/Rest2MCP</p>
     * @param ServerType <p>MCP Server类型，取值：MCP/Rest2MCP</p>
     */
    public void setServerType(String ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get <p>协议类型，取值: StreamableHttp</p> 
     * @return Transport <p>协议类型，取值: StreamableHttp</p>
     */
    public String getTransport() {
        return this.Transport;
    }

    /**
     * Set <p>协议类型，取值: StreamableHttp</p>
     * @param Transport <p>协议类型，取值: StreamableHttp</p>
     */
    public void setTransport(String Transport) {
        this.Transport = Transport;
    }

    /**
     * Get <p>服务类型：</p><ul><li>Registry  </li><li>HostIP</li></ul> 
     * @return UpstreamType <p>服务类型：</p><ul><li>Registry  </li><li>HostIP</li></ul>
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set <p>服务类型：</p><ul><li>Registry  </li><li>HostIP</li></ul>
     * @param UpstreamType <p>服务类型：</p><ul><li>Registry  </li><li>HostIP</li></ul>
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get <p>展示名字</p> 
     * @return DisplayName <p>展示名字</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>展示名字</p>
     * @param DisplayName <p>展示名字</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>MCP提供给客户端的Endpoint</p> 
     * @return MCPEndpoint <p>MCP提供给客户端的Endpoint</p>
     */
    public String getMCPEndpoint() {
        return this.MCPEndpoint;
    }

    /**
     * Set <p>MCP提供给客户端的Endpoint</p>
     * @param MCPEndpoint <p>MCP提供给客户端的Endpoint</p>
     */
    public void setMCPEndpoint(String MCPEndpoint) {
        this.MCPEndpoint = MCPEndpoint;
    }

    /**
     * Get <p>注册中心来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamInfo <p>注册中心来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AIGWMCPUpstreamInfoDetail getUpstreamInfo() {
        return this.UpstreamInfo;
    }

    /**
     * Set <p>注册中心来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamInfo <p>注册中心来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamInfo(AIGWMCPUpstreamInfoDetail UpstreamInfo) {
        this.UpstreamInfo = UpstreamInfo;
    }

    /**
     * Get <p>会话配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionConfig <p>会话配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AIGWMCPSessionConfig getSessionConfig() {
        return this.SessionConfig;
    }

    /**
     * Set <p>会话配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionConfig <p>会话配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionConfig(AIGWMCPSessionConfig SessionConfig) {
        this.SessionConfig = SessionConfig;
    }

    /**
     * Get <p>超时时间，单位ms</p> 
     * @return Timeout <p>超时时间，单位ms</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间，单位ms</p>
     * @param Timeout <p>超时时间，单位ms</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>失败重试次数</p> 
     * @return RetryCount <p>失败重试次数</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>失败重试次数</p>
     * @param RetryCount <p>失败重试次数</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>运行状态</p><p>枚举值：</p><ul><li>Online： 在线</li><li>Offline： 离线</li><li>Error： 错误</li></ul> 
     * @return Status <p>运行状态</p><p>枚举值：</p><ul><li>Online： 在线</li><li>Offline： 离线</li><li>Error： 错误</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>运行状态</p><p>枚举值：</p><ul><li>Online： 在线</li><li>Offline： 离线</li><li>Error： 错误</li></ul>
     * @param Status <p>运行状态</p><p>枚举值：</p><ul><li>Online： 在线</li><li>Offline： 离线</li><li>Error： 错误</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否启用健康检查</p> 
     * @return EnableHealthCheck <p>是否启用健康检查</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>是否启用健康检查</p>
     * @param EnableHealthCheck <p>是否启用健康检查</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheck <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AIGWHealthCheckSetting getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheck <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheck(AIGWHealthCheckSetting HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>Tool分组内工具数量限制</p> 
     * @return ToolCountLimit <p>Tool分组内工具数量限制</p>
     */
    public Long getToolCountLimit() {
        return this.ToolCountLimit;
    }

    /**
     * Set <p>Tool分组内工具数量限制</p>
     * @param ToolCountLimit <p>Tool分组内工具数量限制</p>
     */
    public void setToolCountLimit(Long ToolCountLimit) {
        this.ToolCountLimit = ToolCountLimit;
    }

    /**
     * Get <p>Tool分组内工具命名冲突策略</p><p>枚举值：</p><ul><li>AutoPrefix： 自动前缀</li><li>Reject： 拒绝</li></ul> 
     * @return ConflictStrategy <p>Tool分组内工具命名冲突策略</p><p>枚举值：</p><ul><li>AutoPrefix： 自动前缀</li><li>Reject： 拒绝</li></ul>
     */
    public String getConflictStrategy() {
        return this.ConflictStrategy;
    }

    /**
     * Set <p>Tool分组内工具命名冲突策略</p><p>枚举值：</p><ul><li>AutoPrefix： 自动前缀</li><li>Reject： 拒绝</li></ul>
     * @param ConflictStrategy <p>Tool分组内工具命名冲突策略</p><p>枚举值：</p><ul><li>AutoPrefix： 自动前缀</li><li>Reject： 拒绝</li></ul>
     */
    public void setConflictStrategy(String ConflictStrategy) {
        this.ConflictStrategy = ConflictStrategy;
    }

    /**
     * Get <p>MCP 市场发布状态</p><p>枚举值：</p><ul><li>None： 未发布</li><li>Published： 已发布</li></ul> 
     * @return MarketStatus <p>MCP 市场发布状态</p><p>枚举值：</p><ul><li>None： 未发布</li><li>Published： 已发布</li></ul>
     */
    public String getMarketStatus() {
        return this.MarketStatus;
    }

    /**
     * Set <p>MCP 市场发布状态</p><p>枚举值：</p><ul><li>None： 未发布</li><li>Published： 已发布</li></ul>
     * @param MarketStatus <p>MCP 市场发布状态</p><p>枚举值：</p><ul><li>None： 未发布</li><li>Published： 已发布</li></ul>
     */
    public void setMarketStatus(String MarketStatus) {
        this.MarketStatus = MarketStatus;
    }

    public AIGWMCPServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWMCPServer(AIGWMCPServer source) {
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ServerType != null) {
            this.ServerType = new String(source.ServerType);
        }
        if (source.Transport != null) {
            this.Transport = new String(source.Transport);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.MCPEndpoint != null) {
            this.MCPEndpoint = new String(source.MCPEndpoint);
        }
        if (source.UpstreamInfo != null) {
            this.UpstreamInfo = new AIGWMCPUpstreamInfoDetail(source.UpstreamInfo);
        }
        if (source.SessionConfig != null) {
            this.SessionConfig = new AIGWMCPSessionConfig(source.SessionConfig);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new AIGWHealthCheckSetting(source.HealthCheck);
        }
        if (source.ToolCountLimit != null) {
            this.ToolCountLimit = new Long(source.ToolCountLimit);
        }
        if (source.ConflictStrategy != null) {
            this.ConflictStrategy = new String(source.ConflictStrategy);
        }
        if (source.MarketStatus != null) {
            this.MarketStatus = new String(source.MarketStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "Transport", this.Transport);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "MCPEndpoint", this.MCPEndpoint);
        this.setParamObj(map, prefix + "UpstreamInfo.", this.UpstreamInfo);
        this.setParamObj(map, prefix + "SessionConfig.", this.SessionConfig);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "ToolCountLimit", this.ToolCountLimit);
        this.setParamSimple(map, prefix + "ConflictStrategy", this.ConflictStrategy);
        this.setParamSimple(map, prefix + "MarketStatus", this.MarketStatus);

    }
}

