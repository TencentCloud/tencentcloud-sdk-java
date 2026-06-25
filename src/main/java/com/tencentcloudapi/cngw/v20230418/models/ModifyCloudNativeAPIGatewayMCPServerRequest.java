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

public class ModifyCloudNativeAPIGatewayMCPServerRequest extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>展示名字</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>服务 id</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>后端类型</p><p>枚举值：</p><ul><li>HostIP： 域名 ip</li><li>MCPRegistry： MCP 注册中心</li><li>VirtualMCPServer： 虚拟MCP 服务</li></ul>
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * <p>超时时间，单位ms，最大60000</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>重试次数，最大3次</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>注册中心来源信息</p>
    */
    @SerializedName("UpstreamInfo")
    @Expose
    private AIGWMCPUpstreamInfo UpstreamInfo;

    /**
    * <p>会话配置</p>
    */
    @SerializedName("SessionConfig")
    @Expose
    private AIGWMCPSessionConfig SessionConfig;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否启用健康检查</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>健康检查配置</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private AIGWHealthCheckSetting HealthCheck;

    /**
     * Get <p>实例 ID</p> 
     * @return GatewayId <p>实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param GatewayId <p>实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
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
     * Get <p>服务 id</p> 
     * @return ServerId <p>服务 id</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>服务 id</p>
     * @param ServerId <p>服务 id</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>后端类型</p><p>枚举值：</p><ul><li>HostIP： 域名 ip</li><li>MCPRegistry： MCP 注册中心</li><li>VirtualMCPServer： 虚拟MCP 服务</li></ul> 
     * @return UpstreamType <p>后端类型</p><p>枚举值：</p><ul><li>HostIP： 域名 ip</li><li>MCPRegistry： MCP 注册中心</li><li>VirtualMCPServer： 虚拟MCP 服务</li></ul>
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set <p>后端类型</p><p>枚举值：</p><ul><li>HostIP： 域名 ip</li><li>MCPRegistry： MCP 注册中心</li><li>VirtualMCPServer： 虚拟MCP 服务</li></ul>
     * @param UpstreamType <p>后端类型</p><p>枚举值：</p><ul><li>HostIP： 域名 ip</li><li>MCPRegistry： MCP 注册中心</li><li>VirtualMCPServer： 虚拟MCP 服务</li></ul>
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get <p>超时时间，单位ms，最大60000</p> 
     * @return Timeout <p>超时时间，单位ms，最大60000</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间，单位ms，最大60000</p>
     * @param Timeout <p>超时时间，单位ms，最大60000</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>重试次数，最大3次</p> 
     * @return RetryCount <p>重试次数，最大3次</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>重试次数，最大3次</p>
     * @param RetryCount <p>重试次数，最大3次</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>注册中心来源信息</p> 
     * @return UpstreamInfo <p>注册中心来源信息</p>
     */
    public AIGWMCPUpstreamInfo getUpstreamInfo() {
        return this.UpstreamInfo;
    }

    /**
     * Set <p>注册中心来源信息</p>
     * @param UpstreamInfo <p>注册中心来源信息</p>
     */
    public void setUpstreamInfo(AIGWMCPUpstreamInfo UpstreamInfo) {
        this.UpstreamInfo = UpstreamInfo;
    }

    /**
     * Get <p>会话配置</p> 
     * @return SessionConfig <p>会话配置</p>
     */
    public AIGWMCPSessionConfig getSessionConfig() {
        return this.SessionConfig;
    }

    /**
     * Set <p>会话配置</p>
     * @param SessionConfig <p>会话配置</p>
     */
    public void setSessionConfig(AIGWMCPSessionConfig SessionConfig) {
        this.SessionConfig = SessionConfig;
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
     * @return HealthCheck <p>健康检查配置</p>
     */
    public AIGWHealthCheckSetting getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查配置</p>
     * @param HealthCheck <p>健康检查配置</p>
     */
    public void setHealthCheck(AIGWHealthCheckSetting HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    public ModifyCloudNativeAPIGatewayMCPServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayMCPServerRequest(ModifyCloudNativeAPIGatewayMCPServerRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.UpstreamInfo != null) {
            this.UpstreamInfo = new AIGWMCPUpstreamInfo(source.UpstreamInfo);
        }
        if (source.SessionConfig != null) {
            this.SessionConfig = new AIGWMCPSessionConfig(source.SessionConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new AIGWHealthCheckSetting(source.HealthCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamObj(map, prefix + "UpstreamInfo.", this.UpstreamInfo);
        this.setParamObj(map, prefix + "SessionConfig.", this.SessionConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);

    }
}

