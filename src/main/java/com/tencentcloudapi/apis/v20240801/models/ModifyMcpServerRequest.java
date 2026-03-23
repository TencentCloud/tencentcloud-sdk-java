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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMcpServerRequest extends AbstractModel {

    /**
    * mcp server ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 模式：proxy代理模式； wrap封装模式；
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 版本号：2024-11-05 2025-03-26
    */
    @SerializedName("McpVersion")
    @Expose
    private String McpVersion;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 封装服务列表
    */
    @SerializedName("WrapServices")
    @Expose
    private String [] WrapServices;

    /**
    * 负载方式，robin random consistentHash
    */
    @SerializedName("TargetSelect")
    @Expose
    private String TargetSelect;

    /**
    * 目标服务器
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * 后端协议：http https
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * 证书检查
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * 目标路径
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * 流量控制开启状态
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * 流量控制配置
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * IP白名单开启状态
    */
    @SerializedName("IpWhiteStatus")
    @Expose
    private Boolean IpWhiteStatus;

    /**
    * IP白名单配置
    */
    @SerializedName("IpWhiteConfig")
    @Expose
    private IpConfig IpWhiteConfig;

    /**
    * IP黑名单开启状态
    */
    @SerializedName("IpBlackStatus")
    @Expose
    private Boolean IpBlackStatus;

    /**
    * IP黑名单配置
    */
    @SerializedName("IpBlackConfig")
    @Expose
    private IpConfig IpBlackConfig;

    /**
    * 目标Host类型 0 默认 1 vpc
    */
    @SerializedName("TargetHostType")
    @Expose
    private Long TargetHostType;

    /**
    * 自定义host
    */
    @SerializedName("CustomHttpHost")
    @Expose
    private String CustomHttpHost;

    /**
    * Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host； customHost 自定义host
    */
    @SerializedName("HttpHostType")
    @Expose
    private String HttpHostType;

    /**
    * 请求的超时时间
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 安全规则集
    */
    @SerializedName("McpSecurityRules")
    @Expose
    private McpSecurityRule [] McpSecurityRules;

    /**
    * 工具集配置（openapi可能会用到）
    */
    @SerializedName("ToolConfigs")
    @Expose
    private ToolConfigDTO [] ToolConfigs;

    /**
    * 封装的API分组ID
    */
    @SerializedName("WrapPaasID")
    @Expose
    private String WrapPaasID;

    /**
    * 插件配置
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
     * Get mcp server ID 
     * @return ID mcp server ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set mcp server ID
     * @param ID mcp server ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 模式：proxy代理模式； wrap封装模式； 
     * @return Mode 模式：proxy代理模式； wrap封装模式；
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 模式：proxy代理模式； wrap封装模式；
     * @param Mode 模式：proxy代理模式； wrap封装模式；
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 版本号：2024-11-05 2025-03-26 
     * @return McpVersion 版本号：2024-11-05 2025-03-26
     */
    public String getMcpVersion() {
        return this.McpVersion;
    }

    /**
     * Set 版本号：2024-11-05 2025-03-26
     * @param McpVersion 版本号：2024-11-05 2025-03-26
     */
    public void setMcpVersion(String McpVersion) {
        this.McpVersion = McpVersion;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 封装服务列表 
     * @return WrapServices 封装服务列表
     */
    public String [] getWrapServices() {
        return this.WrapServices;
    }

    /**
     * Set 封装服务列表
     * @param WrapServices 封装服务列表
     */
    public void setWrapServices(String [] WrapServices) {
        this.WrapServices = WrapServices;
    }

    /**
     * Get 负载方式，robin random consistentHash 
     * @return TargetSelect 负载方式，robin random consistentHash
     */
    public String getTargetSelect() {
        return this.TargetSelect;
    }

    /**
     * Set 负载方式，robin random consistentHash
     * @param TargetSelect 负载方式，robin random consistentHash
     */
    public void setTargetSelect(String TargetSelect) {
        this.TargetSelect = TargetSelect;
    }

    /**
     * Get 目标服务器 
     * @return TargetHosts 目标服务器
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set 目标服务器
     * @param TargetHosts 目标服务器
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get 后端协议：http https 
     * @return HttpProtocolType 后端协议：http https
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set 后端协议：http https
     * @param HttpProtocolType 后端协议：http https
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get 证书检查 
     * @return CheckTargetCertsError 证书检查
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set 证书检查
     * @param CheckTargetCertsError 证书检查
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get 目标路径 
     * @return TargetPath 目标路径
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set 目标路径
     * @param TargetPath 目标路径
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get 流量控制开启状态 
     * @return InvokeLimitConfigStatus 流量控制开启状态
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set 流量控制开启状态
     * @param InvokeLimitConfigStatus 流量控制开启状态
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get 流量控制配置 
     * @return InvokeLimitConfig 流量控制配置
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set 流量控制配置
     * @param InvokeLimitConfig 流量控制配置
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get IP白名单开启状态 
     * @return IpWhiteStatus IP白名单开启状态
     */
    public Boolean getIpWhiteStatus() {
        return this.IpWhiteStatus;
    }

    /**
     * Set IP白名单开启状态
     * @param IpWhiteStatus IP白名单开启状态
     */
    public void setIpWhiteStatus(Boolean IpWhiteStatus) {
        this.IpWhiteStatus = IpWhiteStatus;
    }

    /**
     * Get IP白名单配置 
     * @return IpWhiteConfig IP白名单配置
     */
    public IpConfig getIpWhiteConfig() {
        return this.IpWhiteConfig;
    }

    /**
     * Set IP白名单配置
     * @param IpWhiteConfig IP白名单配置
     */
    public void setIpWhiteConfig(IpConfig IpWhiteConfig) {
        this.IpWhiteConfig = IpWhiteConfig;
    }

    /**
     * Get IP黑名单开启状态 
     * @return IpBlackStatus IP黑名单开启状态
     */
    public Boolean getIpBlackStatus() {
        return this.IpBlackStatus;
    }

    /**
     * Set IP黑名单开启状态
     * @param IpBlackStatus IP黑名单开启状态
     */
    public void setIpBlackStatus(Boolean IpBlackStatus) {
        this.IpBlackStatus = IpBlackStatus;
    }

    /**
     * Get IP黑名单配置 
     * @return IpBlackConfig IP黑名单配置
     */
    public IpConfig getIpBlackConfig() {
        return this.IpBlackConfig;
    }

    /**
     * Set IP黑名单配置
     * @param IpBlackConfig IP黑名单配置
     */
    public void setIpBlackConfig(IpConfig IpBlackConfig) {
        this.IpBlackConfig = IpBlackConfig;
    }

    /**
     * Get 目标Host类型 0 默认 1 vpc 
     * @return TargetHostType 目标Host类型 0 默认 1 vpc
     */
    public Long getTargetHostType() {
        return this.TargetHostType;
    }

    /**
     * Set 目标Host类型 0 默认 1 vpc
     * @param TargetHostType 目标Host类型 0 默认 1 vpc
     */
    public void setTargetHostType(Long TargetHostType) {
        this.TargetHostType = TargetHostType;
    }

    /**
     * Get 自定义host 
     * @return CustomHttpHost 自定义host
     */
    public String getCustomHttpHost() {
        return this.CustomHttpHost;
    }

    /**
     * Set 自定义host
     * @param CustomHttpHost 自定义host
     */
    public void setCustomHttpHost(String CustomHttpHost) {
        this.CustomHttpHost = CustomHttpHost;
    }

    /**
     * Get Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host； customHost 自定义host 
     * @return HttpHostType Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host； customHost 自定义host
     */
    public String getHttpHostType() {
        return this.HttpHostType;
    }

    /**
     * Set Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host； customHost 自定义host
     * @param HttpHostType Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host； customHost 自定义host
     */
    public void setHttpHostType(String HttpHostType) {
        this.HttpHostType = HttpHostType;
    }

    /**
     * Get 请求的超时时间 
     * @return Timeout 请求的超时时间
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 请求的超时时间
     * @param Timeout 请求的超时时间
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 安全规则集 
     * @return McpSecurityRules 安全规则集
     */
    public McpSecurityRule [] getMcpSecurityRules() {
        return this.McpSecurityRules;
    }

    /**
     * Set 安全规则集
     * @param McpSecurityRules 安全规则集
     */
    public void setMcpSecurityRules(McpSecurityRule [] McpSecurityRules) {
        this.McpSecurityRules = McpSecurityRules;
    }

    /**
     * Get 工具集配置（openapi可能会用到） 
     * @return ToolConfigs 工具集配置（openapi可能会用到）
     */
    public ToolConfigDTO [] getToolConfigs() {
        return this.ToolConfigs;
    }

    /**
     * Set 工具集配置（openapi可能会用到）
     * @param ToolConfigs 工具集配置（openapi可能会用到）
     */
    public void setToolConfigs(ToolConfigDTO [] ToolConfigs) {
        this.ToolConfigs = ToolConfigs;
    }

    /**
     * Get 封装的API分组ID 
     * @return WrapPaasID 封装的API分组ID
     */
    public String getWrapPaasID() {
        return this.WrapPaasID;
    }

    /**
     * Set 封装的API分组ID
     * @param WrapPaasID 封装的API分组ID
     */
    public void setWrapPaasID(String WrapPaasID) {
        this.WrapPaasID = WrapPaasID;
    }

    /**
     * Get 插件配置 
     * @return PluginConfigs 插件配置
     */
    public PluginConfigDTO [] getPluginConfigs() {
        return this.PluginConfigs;
    }

    /**
     * Set 插件配置
     * @param PluginConfigs 插件配置
     */
    public void setPluginConfigs(PluginConfigDTO [] PluginConfigs) {
        this.PluginConfigs = PluginConfigs;
    }

    public ModifyMcpServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMcpServerRequest(ModifyMcpServerRequest source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.McpVersion != null) {
            this.McpVersion = new String(source.McpVersion);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WrapServices != null) {
            this.WrapServices = new String[source.WrapServices.length];
            for (int i = 0; i < source.WrapServices.length; i++) {
                this.WrapServices[i] = new String(source.WrapServices[i]);
            }
        }
        if (source.TargetSelect != null) {
            this.TargetSelect = new String(source.TargetSelect);
        }
        if (source.TargetHosts != null) {
            this.TargetHosts = new TargetHostDTO[source.TargetHosts.length];
            for (int i = 0; i < source.TargetHosts.length; i++) {
                this.TargetHosts[i] = new TargetHostDTO(source.TargetHosts[i]);
            }
        }
        if (source.HttpProtocolType != null) {
            this.HttpProtocolType = new String(source.HttpProtocolType);
        }
        if (source.CheckTargetCertsError != null) {
            this.CheckTargetCertsError = new Boolean(source.CheckTargetCertsError);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.InvokeLimitConfigStatus != null) {
            this.InvokeLimitConfigStatus = new Boolean(source.InvokeLimitConfigStatus);
        }
        if (source.InvokeLimitConfig != null) {
            this.InvokeLimitConfig = new InvokeLimitConfigDTO(source.InvokeLimitConfig);
        }
        if (source.IpWhiteStatus != null) {
            this.IpWhiteStatus = new Boolean(source.IpWhiteStatus);
        }
        if (source.IpWhiteConfig != null) {
            this.IpWhiteConfig = new IpConfig(source.IpWhiteConfig);
        }
        if (source.IpBlackStatus != null) {
            this.IpBlackStatus = new Boolean(source.IpBlackStatus);
        }
        if (source.IpBlackConfig != null) {
            this.IpBlackConfig = new IpConfig(source.IpBlackConfig);
        }
        if (source.TargetHostType != null) {
            this.TargetHostType = new Long(source.TargetHostType);
        }
        if (source.CustomHttpHost != null) {
            this.CustomHttpHost = new String(source.CustomHttpHost);
        }
        if (source.HttpHostType != null) {
            this.HttpHostType = new String(source.HttpHostType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.McpSecurityRules != null) {
            this.McpSecurityRules = new McpSecurityRule[source.McpSecurityRules.length];
            for (int i = 0; i < source.McpSecurityRules.length; i++) {
                this.McpSecurityRules[i] = new McpSecurityRule(source.McpSecurityRules[i]);
            }
        }
        if (source.ToolConfigs != null) {
            this.ToolConfigs = new ToolConfigDTO[source.ToolConfigs.length];
            for (int i = 0; i < source.ToolConfigs.length; i++) {
                this.ToolConfigs[i] = new ToolConfigDTO(source.ToolConfigs[i]);
            }
        }
        if (source.WrapPaasID != null) {
            this.WrapPaasID = new String(source.WrapPaasID);
        }
        if (source.PluginConfigs != null) {
            this.PluginConfigs = new PluginConfigDTO[source.PluginConfigs.length];
            for (int i = 0; i < source.PluginConfigs.length; i++) {
                this.PluginConfigs[i] = new PluginConfigDTO(source.PluginConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "McpVersion", this.McpVersion);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "WrapServices.", this.WrapServices);
        this.setParamSimple(map, prefix + "TargetSelect", this.TargetSelect);
        this.setParamArrayObj(map, prefix + "TargetHosts.", this.TargetHosts);
        this.setParamSimple(map, prefix + "HttpProtocolType", this.HttpProtocolType);
        this.setParamSimple(map, prefix + "CheckTargetCertsError", this.CheckTargetCertsError);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
        this.setParamSimple(map, prefix + "IpWhiteStatus", this.IpWhiteStatus);
        this.setParamObj(map, prefix + "IpWhiteConfig.", this.IpWhiteConfig);
        this.setParamSimple(map, prefix + "IpBlackStatus", this.IpBlackStatus);
        this.setParamObj(map, prefix + "IpBlackConfig.", this.IpBlackConfig);
        this.setParamSimple(map, prefix + "TargetHostType", this.TargetHostType);
        this.setParamSimple(map, prefix + "CustomHttpHost", this.CustomHttpHost);
        this.setParamSimple(map, prefix + "HttpHostType", this.HttpHostType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArrayObj(map, prefix + "McpSecurityRules.", this.McpSecurityRules);
        this.setParamArrayObj(map, prefix + "ToolConfigs.", this.ToolConfigs);
        this.setParamSimple(map, prefix + "WrapPaasID", this.WrapPaasID);
        this.setParamArrayObj(map, prefix + "PluginConfigs.", this.PluginConfigs);

    }
}

