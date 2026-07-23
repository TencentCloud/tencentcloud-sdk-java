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

public class CreateMcpServerRequest extends AbstractModel {

    /**
    * <p>模式：proxy代理模式； wrap封装模式；</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>版本号：2024-11-05 2025-03-26</p>
    */
    @SerializedName("McpVersion")
    @Expose
    private String McpVersion;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>封装服务列表</p>
    */
    @SerializedName("WrapServices")
    @Expose
    private String [] WrapServices;

    /**
    * <p>负载方式，robin random consistentHash</p>
    */
    @SerializedName("TargetSelect")
    @Expose
    private String TargetSelect;

    /**
    * <p>目标服务器</p>
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * <p>后端协议：http https</p>
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * <p>证书检查</p>
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * <p>目标路径</p>
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>流量控制开启状态</p>
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * <p>流量控制配置</p>
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * <p>IP白名单开启状态</p>
    */
    @SerializedName("IpWhiteStatus")
    @Expose
    private Boolean IpWhiteStatus;

    /**
    * <p>IP白名单配置</p>
    */
    @SerializedName("IpWhiteConfig")
    @Expose
    private IpConfig IpWhiteConfig;

    /**
    * <p>IP黑名单开启状态</p>
    */
    @SerializedName("IpBlackStatus")
    @Expose
    private Boolean IpBlackStatus;

    /**
    * <p>IP黑名单配置</p>
    */
    @SerializedName("IpBlackConfig")
    @Expose
    private IpConfig IpBlackConfig;

    /**
    * <p>自定义host</p>
    */
    @SerializedName("CustomHttpHost")
    @Expose
    private String CustomHttpHost;

    /**
    * <p>Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host；  customHost 自定义host</p>
    */
    @SerializedName("HttpHostType")
    @Expose
    private String HttpHostType;

    /**
    * <p>请求的超时时间</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>安全规则集</p>
    */
    @SerializedName("McpSecurityRules")
    @Expose
    private McpSecurityRule [] McpSecurityRules;

    /**
    * <p>工具集配置（openapi时或许用的是）</p>
    */
    @SerializedName("ToolConfigs")
    @Expose
    private ToolConfigDTO [] ToolConfigs;

    /**
    * <p>封装的API分组ID</p>
    */
    @SerializedName("WrapPaasID")
    @Expose
    private String WrapPaasID;

    /**
    * <p>插件配置</p>
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
    * <p>是否忽略健康检查</p>
    */
    @SerializedName("IgnoreHealthCheck")
    @Expose
    private Boolean IgnoreHealthCheck;

    /**
     * Get <p>模式：proxy代理模式； wrap封装模式；</p> 
     * @return Mode <p>模式：proxy代理模式； wrap封装模式；</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>模式：proxy代理模式； wrap封装模式；</p>
     * @param Mode <p>模式：proxy代理模式； wrap封装模式；</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>版本号：2024-11-05 2025-03-26</p> 
     * @return McpVersion <p>版本号：2024-11-05 2025-03-26</p>
     */
    public String getMcpVersion() {
        return this.McpVersion;
    }

    /**
     * Set <p>版本号：2024-11-05 2025-03-26</p>
     * @param McpVersion <p>版本号：2024-11-05 2025-03-26</p>
     */
    public void setMcpVersion(String McpVersion) {
        this.McpVersion = McpVersion;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>封装服务列表</p> 
     * @return WrapServices <p>封装服务列表</p>
     */
    public String [] getWrapServices() {
        return this.WrapServices;
    }

    /**
     * Set <p>封装服务列表</p>
     * @param WrapServices <p>封装服务列表</p>
     */
    public void setWrapServices(String [] WrapServices) {
        this.WrapServices = WrapServices;
    }

    /**
     * Get <p>负载方式，robin random consistentHash</p> 
     * @return TargetSelect <p>负载方式，robin random consistentHash</p>
     */
    public String getTargetSelect() {
        return this.TargetSelect;
    }

    /**
     * Set <p>负载方式，robin random consistentHash</p>
     * @param TargetSelect <p>负载方式，robin random consistentHash</p>
     */
    public void setTargetSelect(String TargetSelect) {
        this.TargetSelect = TargetSelect;
    }

    /**
     * Get <p>目标服务器</p> 
     * @return TargetHosts <p>目标服务器</p>
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set <p>目标服务器</p>
     * @param TargetHosts <p>目标服务器</p>
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get <p>后端协议：http https</p> 
     * @return HttpProtocolType <p>后端协议：http https</p>
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set <p>后端协议：http https</p>
     * @param HttpProtocolType <p>后端协议：http https</p>
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get <p>证书检查</p> 
     * @return CheckTargetCertsError <p>证书检查</p>
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set <p>证书检查</p>
     * @param CheckTargetCertsError <p>证书检查</p>
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get <p>目标路径</p> 
     * @return TargetPath <p>目标路径</p>
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>目标路径</p>
     * @param TargetPath <p>目标路径</p>
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>流量控制开启状态</p> 
     * @return InvokeLimitConfigStatus <p>流量控制开启状态</p>
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set <p>流量控制开启状态</p>
     * @param InvokeLimitConfigStatus <p>流量控制开启状态</p>
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get <p>流量控制配置</p> 
     * @return InvokeLimitConfig <p>流量控制配置</p>
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set <p>流量控制配置</p>
     * @param InvokeLimitConfig <p>流量控制配置</p>
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get <p>IP白名单开启状态</p> 
     * @return IpWhiteStatus <p>IP白名单开启状态</p>
     */
    public Boolean getIpWhiteStatus() {
        return this.IpWhiteStatus;
    }

    /**
     * Set <p>IP白名单开启状态</p>
     * @param IpWhiteStatus <p>IP白名单开启状态</p>
     */
    public void setIpWhiteStatus(Boolean IpWhiteStatus) {
        this.IpWhiteStatus = IpWhiteStatus;
    }

    /**
     * Get <p>IP白名单配置</p> 
     * @return IpWhiteConfig <p>IP白名单配置</p>
     */
    public IpConfig getIpWhiteConfig() {
        return this.IpWhiteConfig;
    }

    /**
     * Set <p>IP白名单配置</p>
     * @param IpWhiteConfig <p>IP白名单配置</p>
     */
    public void setIpWhiteConfig(IpConfig IpWhiteConfig) {
        this.IpWhiteConfig = IpWhiteConfig;
    }

    /**
     * Get <p>IP黑名单开启状态</p> 
     * @return IpBlackStatus <p>IP黑名单开启状态</p>
     */
    public Boolean getIpBlackStatus() {
        return this.IpBlackStatus;
    }

    /**
     * Set <p>IP黑名单开启状态</p>
     * @param IpBlackStatus <p>IP黑名单开启状态</p>
     */
    public void setIpBlackStatus(Boolean IpBlackStatus) {
        this.IpBlackStatus = IpBlackStatus;
    }

    /**
     * Get <p>IP黑名单配置</p> 
     * @return IpBlackConfig <p>IP黑名单配置</p>
     */
    public IpConfig getIpBlackConfig() {
        return this.IpBlackConfig;
    }

    /**
     * Set <p>IP黑名单配置</p>
     * @param IpBlackConfig <p>IP黑名单配置</p>
     */
    public void setIpBlackConfig(IpConfig IpBlackConfig) {
        this.IpBlackConfig = IpBlackConfig;
    }

    /**
     * Get <p>自定义host</p> 
     * @return CustomHttpHost <p>自定义host</p>
     */
    public String getCustomHttpHost() {
        return this.CustomHttpHost;
    }

    /**
     * Set <p>自定义host</p>
     * @param CustomHttpHost <p>自定义host</p>
     */
    public void setCustomHttpHost(String CustomHttpHost) {
        this.CustomHttpHost = CustomHttpHost;
    }

    /**
     * Get <p>Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host；  customHost 自定义host</p> 
     * @return HttpHostType <p>Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host；  customHost 自定义host</p>
     */
    public String getHttpHostType() {
        return this.HttpHostType;
    }

    /**
     * Set <p>Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host；  customHost 自定义host</p>
     * @param HttpHostType <p>Http 请求host类型：useRequestHost 保持源请求；host targetHost 修正为源站host；  customHost 自定义host</p>
     */
    public void setHttpHostType(String HttpHostType) {
        this.HttpHostType = HttpHostType;
    }

    /**
     * Get <p>请求的超时时间</p> 
     * @return Timeout <p>请求的超时时间</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>请求的超时时间</p>
     * @param Timeout <p>请求的超时时间</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>安全规则集</p> 
     * @return McpSecurityRules <p>安全规则集</p>
     */
    public McpSecurityRule [] getMcpSecurityRules() {
        return this.McpSecurityRules;
    }

    /**
     * Set <p>安全规则集</p>
     * @param McpSecurityRules <p>安全规则集</p>
     */
    public void setMcpSecurityRules(McpSecurityRule [] McpSecurityRules) {
        this.McpSecurityRules = McpSecurityRules;
    }

    /**
     * Get <p>工具集配置（openapi时或许用的是）</p> 
     * @return ToolConfigs <p>工具集配置（openapi时或许用的是）</p>
     */
    public ToolConfigDTO [] getToolConfigs() {
        return this.ToolConfigs;
    }

    /**
     * Set <p>工具集配置（openapi时或许用的是）</p>
     * @param ToolConfigs <p>工具集配置（openapi时或许用的是）</p>
     */
    public void setToolConfigs(ToolConfigDTO [] ToolConfigs) {
        this.ToolConfigs = ToolConfigs;
    }

    /**
     * Get <p>封装的API分组ID</p> 
     * @return WrapPaasID <p>封装的API分组ID</p>
     */
    public String getWrapPaasID() {
        return this.WrapPaasID;
    }

    /**
     * Set <p>封装的API分组ID</p>
     * @param WrapPaasID <p>封装的API分组ID</p>
     */
    public void setWrapPaasID(String WrapPaasID) {
        this.WrapPaasID = WrapPaasID;
    }

    /**
     * Get <p>插件配置</p> 
     * @return PluginConfigs <p>插件配置</p>
     */
    public PluginConfigDTO [] getPluginConfigs() {
        return this.PluginConfigs;
    }

    /**
     * Set <p>插件配置</p>
     * @param PluginConfigs <p>插件配置</p>
     */
    public void setPluginConfigs(PluginConfigDTO [] PluginConfigs) {
        this.PluginConfigs = PluginConfigs;
    }

    /**
     * Get <p>是否忽略健康检查</p> 
     * @return IgnoreHealthCheck <p>是否忽略健康检查</p>
     */
    public Boolean getIgnoreHealthCheck() {
        return this.IgnoreHealthCheck;
    }

    /**
     * Set <p>是否忽略健康检查</p>
     * @param IgnoreHealthCheck <p>是否忽略健康检查</p>
     */
    public void setIgnoreHealthCheck(Boolean IgnoreHealthCheck) {
        this.IgnoreHealthCheck = IgnoreHealthCheck;
    }

    public CreateMcpServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMcpServerRequest(CreateMcpServerRequest source) {
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
        if (source.IgnoreHealthCheck != null) {
            this.IgnoreHealthCheck = new Boolean(source.IgnoreHealthCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "CustomHttpHost", this.CustomHttpHost);
        this.setParamSimple(map, prefix + "HttpHostType", this.HttpHostType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArrayObj(map, prefix + "McpSecurityRules.", this.McpSecurityRules);
        this.setParamArrayObj(map, prefix + "ToolConfigs.", this.ToolConfigs);
        this.setParamSimple(map, prefix + "WrapPaasID", this.WrapPaasID);
        this.setParamArrayObj(map, prefix + "PluginConfigs.", this.PluginConfigs);
        this.setParamSimple(map, prefix + "IgnoreHealthCheck", this.IgnoreHealthCheck);

    }
}

