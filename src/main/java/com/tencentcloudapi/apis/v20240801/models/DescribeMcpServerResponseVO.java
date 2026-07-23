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

public class DescribeMcpServerResponseVO extends AbstractModel {

    /**
    * <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelIDs")
    @Expose
    private String [] LabelIDs;

    /**
    * <p>目录ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryIDs")
    @Expose
    private String [] CategoryIDs;

    /**
    * <p>负载方式，robin random consistentHash</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSelect")
    @Expose
    private String TargetSelect;

    /**
    * <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * <p>后端协议：http https</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>流量控制状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * <p>流量控制配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * <p>IP白名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpWhiteStatus")
    @Expose
    private Boolean IpWhiteStatus;

    /**
    * <p>IP白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpWhiteConfig")
    @Expose
    private IpConfig IpWhiteConfig;

    /**
    * <p>IP黑名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpBlackStatus")
    @Expose
    private Boolean IpBlackStatus;

    /**
    * <p>IP黑名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpBlackConfig")
    @Expose
    private IpConfig IpBlackConfig;

    /**
    * <p>mcp server ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>应用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("App")
    @Expose
    private IDNameVO App;

    /**
    * <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalogs")
    @Expose
    private IDNameVO [] Catalogs;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private IDNameVO [] Labels;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * <p>用户appID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomHttpHost")
    @Expose
    private String CustomHttpHost;

    /**
    * <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpHostType")
    @Expose
    private String HttpHostType;

    /**
    * <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>mcp server模式</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>mcp version</p>
    */
    @SerializedName("McpVersion")
    @Expose
    private String McpVersion;

    /**
    * <p>封装模式下绑定的服务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WrapServices")
    @Expose
    private String [] WrapServices;

    /**
    * <p>工具数量</p>
    */
    @SerializedName("ToolNum")
    @Expose
    private Long ToolNum;

    /**
    * <p>安全规则集响应</p>
    */
    @SerializedName("McpSecurityRulesVO")
    @Expose
    private McpSecurityRulesVO [] McpSecurityRulesVO;

    /**
    * <p>真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolConfigs")
    @Expose
    private ToolConfigVO [] ToolConfigs;

    /**
    * <p>访问URL</p>
    */
    @SerializedName("UrlObj")
    @Expose
    private McpUrlObj UrlObj;

    /**
    * <p>后端mcp服务是否正常</p>
    */
    @SerializedName("ToolMessage")
    @Expose
    private String ToolMessage;

    /**
    * <p>后端mcp服务的工具列表</p>
    */
    @SerializedName("Tools")
    @Expose
    private McpTool [] Tools;

    /**
    * <p>封装的API分组ID</p>
    */
    @SerializedName("WrapPaasID")
    @Expose
    private String WrapPaasID;

    /**
    * <p>关联的agentApp数量</p>
    */
    @SerializedName("RelateAgentAppNum")
    @Expose
    private Long RelateAgentAppNum;

    /**
    * <p>插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelIDs <p>标签ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelIDs() {
        return this.LabelIDs;
    }

    /**
     * Set <p>标签ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelIDs <p>标签ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelIDs(String [] LabelIDs) {
        this.LabelIDs = LabelIDs;
    }

    /**
     * Get <p>目录ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryIDs <p>目录ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCategoryIDs() {
        return this.CategoryIDs;
    }

    /**
     * Set <p>目录ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryIDs <p>目录ID数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryIDs(String [] CategoryIDs) {
        this.CategoryIDs = CategoryIDs;
    }

    /**
     * Get <p>负载方式，robin random consistentHash</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSelect <p>负载方式，robin random consistentHash</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSelect() {
        return this.TargetSelect;
    }

    /**
     * Set <p>负载方式，robin random consistentHash</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSelect <p>负载方式，robin random consistentHash</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSelect(String TargetSelect) {
        this.TargetSelect = TargetSelect;
    }

    /**
     * Get <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHosts <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHosts <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get <p>后端协议：http https</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpProtocolType <p>后端协议：http https</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set <p>后端协议：http https</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpProtocolType <p>后端协议：http https</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckTargetCertsError <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckTargetCertsError <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetPath <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetPath <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>流量控制状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeLimitConfigStatus <p>流量控制状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set <p>流量控制状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeLimitConfigStatus <p>流量控制状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get <p>流量控制配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeLimitConfig <p>流量控制配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set <p>流量控制配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeLimitConfig <p>流量控制配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get <p>IP白名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpWhiteStatus <p>IP白名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIpWhiteStatus() {
        return this.IpWhiteStatus;
    }

    /**
     * Set <p>IP白名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpWhiteStatus <p>IP白名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpWhiteStatus(Boolean IpWhiteStatus) {
        this.IpWhiteStatus = IpWhiteStatus;
    }

    /**
     * Get <p>IP白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpWhiteConfig <p>IP白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpConfig getIpWhiteConfig() {
        return this.IpWhiteConfig;
    }

    /**
     * Set <p>IP白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpWhiteConfig <p>IP白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpWhiteConfig(IpConfig IpWhiteConfig) {
        this.IpWhiteConfig = IpWhiteConfig;
    }

    /**
     * Get <p>IP黑名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpBlackStatus <p>IP黑名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIpBlackStatus() {
        return this.IpBlackStatus;
    }

    /**
     * Set <p>IP黑名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpBlackStatus <p>IP黑名单开启状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpBlackStatus(Boolean IpBlackStatus) {
        this.IpBlackStatus = IpBlackStatus;
    }

    /**
     * Get <p>IP黑名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpBlackConfig <p>IP黑名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpConfig getIpBlackConfig() {
        return this.IpBlackConfig;
    }

    /**
     * Set <p>IP黑名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpBlackConfig <p>IP黑名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpBlackConfig(IpConfig IpBlackConfig) {
        this.IpBlackConfig = IpBlackConfig;
    }

    /**
     * Get <p>mcp server ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID <p>mcp server ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>mcp server ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID <p>mcp server ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>应用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return App <p>应用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO getApp() {
        return this.App;
    }

    /**
     * Set <p>应用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param App <p>应用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApp(IDNameVO App) {
        this.App = App;
    }

    /**
     * Get <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalogs <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO [] getCatalogs() {
        return this.Catalogs;
    }

    /**
     * Set <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalogs <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogs(IDNameVO [] Catalogs) {
        this.Catalogs = Catalogs;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(IDNameVO [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get <p>用户appID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID <p>用户appID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>用户appID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID <p>用户appID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomHttpHost <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomHttpHost() {
        return this.CustomHttpHost;
    }

    /**
     * Set <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomHttpHost <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomHttpHost(String CustomHttpHost) {
        this.CustomHttpHost = CustomHttpHost;
    }

    /**
     * Get <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpHostType <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpHostType() {
        return this.HttpHostType;
    }

    /**
     * Set <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpHostType <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpHostType(String HttpHostType) {
        this.HttpHostType = HttpHostType;
    }

    /**
     * Get <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>mcp server模式</p> 
     * @return Mode <p>mcp server模式</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>mcp server模式</p>
     * @param Mode <p>mcp server模式</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>mcp version</p> 
     * @return McpVersion <p>mcp version</p>
     */
    public String getMcpVersion() {
        return this.McpVersion;
    }

    /**
     * Set <p>mcp version</p>
     * @param McpVersion <p>mcp version</p>
     */
    public void setMcpVersion(String McpVersion) {
        this.McpVersion = McpVersion;
    }

    /**
     * Get <p>封装模式下绑定的服务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WrapServices <p>封装模式下绑定的服务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getWrapServices() {
        return this.WrapServices;
    }

    /**
     * Set <p>封装模式下绑定的服务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WrapServices <p>封装模式下绑定的服务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWrapServices(String [] WrapServices) {
        this.WrapServices = WrapServices;
    }

    /**
     * Get <p>工具数量</p> 
     * @return ToolNum <p>工具数量</p>
     */
    public Long getToolNum() {
        return this.ToolNum;
    }

    /**
     * Set <p>工具数量</p>
     * @param ToolNum <p>工具数量</p>
     */
    public void setToolNum(Long ToolNum) {
        this.ToolNum = ToolNum;
    }

    /**
     * Get <p>安全规则集响应</p> 
     * @return McpSecurityRulesVO <p>安全规则集响应</p>
     */
    public McpSecurityRulesVO [] getMcpSecurityRulesVO() {
        return this.McpSecurityRulesVO;
    }

    /**
     * Set <p>安全规则集响应</p>
     * @param McpSecurityRulesVO <p>安全规则集响应</p>
     */
    public void setMcpSecurityRulesVO(McpSecurityRulesVO [] McpSecurityRulesVO) {
        this.McpSecurityRulesVO = McpSecurityRulesVO;
    }

    /**
     * Get <p>真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolConfigs <p>真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ToolConfigVO [] getToolConfigs() {
        return this.ToolConfigs;
    }

    /**
     * Set <p>真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolConfigs <p>真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolConfigs(ToolConfigVO [] ToolConfigs) {
        this.ToolConfigs = ToolConfigs;
    }

    /**
     * Get <p>访问URL</p> 
     * @return UrlObj <p>访问URL</p>
     */
    public McpUrlObj getUrlObj() {
        return this.UrlObj;
    }

    /**
     * Set <p>访问URL</p>
     * @param UrlObj <p>访问URL</p>
     */
    public void setUrlObj(McpUrlObj UrlObj) {
        this.UrlObj = UrlObj;
    }

    /**
     * Get <p>后端mcp服务是否正常</p> 
     * @return ToolMessage <p>后端mcp服务是否正常</p>
     */
    public String getToolMessage() {
        return this.ToolMessage;
    }

    /**
     * Set <p>后端mcp服务是否正常</p>
     * @param ToolMessage <p>后端mcp服务是否正常</p>
     */
    public void setToolMessage(String ToolMessage) {
        this.ToolMessage = ToolMessage;
    }

    /**
     * Get <p>后端mcp服务的工具列表</p> 
     * @return Tools <p>后端mcp服务的工具列表</p>
     */
    public McpTool [] getTools() {
        return this.Tools;
    }

    /**
     * Set <p>后端mcp服务的工具列表</p>
     * @param Tools <p>后端mcp服务的工具列表</p>
     */
    public void setTools(McpTool [] Tools) {
        this.Tools = Tools;
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
     * Get <p>关联的agentApp数量</p> 
     * @return RelateAgentAppNum <p>关联的agentApp数量</p>
     */
    public Long getRelateAgentAppNum() {
        return this.RelateAgentAppNum;
    }

    /**
     * Set <p>关联的agentApp数量</p>
     * @param RelateAgentAppNum <p>关联的agentApp数量</p>
     */
    public void setRelateAgentAppNum(Long RelateAgentAppNum) {
        this.RelateAgentAppNum = RelateAgentAppNum;
    }

    /**
     * Get <p>插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginConfigs <p>插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PluginConfigDTO [] getPluginConfigs() {
        return this.PluginConfigs;
    }

    /**
     * Set <p>插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginConfigs <p>插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
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

    public DescribeMcpServerResponseVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMcpServerResponseVO(DescribeMcpServerResponseVO source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LabelIDs != null) {
            this.LabelIDs = new String[source.LabelIDs.length];
            for (int i = 0; i < source.LabelIDs.length; i++) {
                this.LabelIDs[i] = new String(source.LabelIDs[i]);
            }
        }
        if (source.CategoryIDs != null) {
            this.CategoryIDs = new String[source.CategoryIDs.length];
            for (int i = 0; i < source.CategoryIDs.length; i++) {
                this.CategoryIDs[i] = new String(source.CategoryIDs[i]);
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
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.App != null) {
            this.App = new IDNameVO(source.App);
        }
        if (source.Catalogs != null) {
            this.Catalogs = new IDNameVO[source.Catalogs.length];
            for (int i = 0; i < source.Catalogs.length; i++) {
                this.Catalogs[i] = new IDNameVO(source.Catalogs[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new IDNameVO[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new IDNameVO(source.Labels[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
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
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.McpVersion != null) {
            this.McpVersion = new String(source.McpVersion);
        }
        if (source.WrapServices != null) {
            this.WrapServices = new String[source.WrapServices.length];
            for (int i = 0; i < source.WrapServices.length; i++) {
                this.WrapServices[i] = new String(source.WrapServices[i]);
            }
        }
        if (source.ToolNum != null) {
            this.ToolNum = new Long(source.ToolNum);
        }
        if (source.McpSecurityRulesVO != null) {
            this.McpSecurityRulesVO = new McpSecurityRulesVO[source.McpSecurityRulesVO.length];
            for (int i = 0; i < source.McpSecurityRulesVO.length; i++) {
                this.McpSecurityRulesVO[i] = new McpSecurityRulesVO(source.McpSecurityRulesVO[i]);
            }
        }
        if (source.ToolConfigs != null) {
            this.ToolConfigs = new ToolConfigVO[source.ToolConfigs.length];
            for (int i = 0; i < source.ToolConfigs.length; i++) {
                this.ToolConfigs[i] = new ToolConfigVO(source.ToolConfigs[i]);
            }
        }
        if (source.UrlObj != null) {
            this.UrlObj = new McpUrlObj(source.UrlObj);
        }
        if (source.ToolMessage != null) {
            this.ToolMessage = new String(source.ToolMessage);
        }
        if (source.Tools != null) {
            this.Tools = new McpTool[source.Tools.length];
            for (int i = 0; i < source.Tools.length; i++) {
                this.Tools[i] = new McpTool(source.Tools[i]);
            }
        }
        if (source.WrapPaasID != null) {
            this.WrapPaasID = new String(source.WrapPaasID);
        }
        if (source.RelateAgentAppNum != null) {
            this.RelateAgentAppNum = new Long(source.RelateAgentAppNum);
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
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "LabelIDs.", this.LabelIDs);
        this.setParamArraySimple(map, prefix + "CategoryIDs.", this.CategoryIDs);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "App.", this.App);
        this.setParamArrayObj(map, prefix + "Catalogs.", this.Catalogs);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CustomHttpHost", this.CustomHttpHost);
        this.setParamSimple(map, prefix + "HttpHostType", this.HttpHostType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "McpVersion", this.McpVersion);
        this.setParamArraySimple(map, prefix + "WrapServices.", this.WrapServices);
        this.setParamSimple(map, prefix + "ToolNum", this.ToolNum);
        this.setParamArrayObj(map, prefix + "McpSecurityRulesVO.", this.McpSecurityRulesVO);
        this.setParamArrayObj(map, prefix + "ToolConfigs.", this.ToolConfigs);
        this.setParamObj(map, prefix + "UrlObj.", this.UrlObj);
        this.setParamSimple(map, prefix + "ToolMessage", this.ToolMessage);
        this.setParamArrayObj(map, prefix + "Tools.", this.Tools);
        this.setParamSimple(map, prefix + "WrapPaasID", this.WrapPaasID);
        this.setParamSimple(map, prefix + "RelateAgentAppNum", this.RelateAgentAppNum);
        this.setParamArrayObj(map, prefix + "PluginConfigs.", this.PluginConfigs);
        this.setParamSimple(map, prefix + "IgnoreHealthCheck", this.IgnoreHealthCheck);

    }
}

