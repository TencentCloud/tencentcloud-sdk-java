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
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 标签ID数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelIDs")
    @Expose
    private String [] LabelIDs;

    /**
    * 目录ID数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryIDs")
    @Expose
    private String [] CategoryIDs;

    /**
    * 负载方式，robin random consistentHash
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSelect")
    @Expose
    private String TargetSelect;

    /**
    * 目标服务器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * 后端协议：http https
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * 证书检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * 目标路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * 流量控制状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * 流量控制配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * IP白名单开启状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpWhiteStatus")
    @Expose
    private Boolean IpWhiteStatus;

    /**
    * IP白名单配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpWhiteConfig")
    @Expose
    private IpConfig IpWhiteConfig;

    /**
    * IP黑名单开启状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpBlackStatus")
    @Expose
    private Boolean IpBlackStatus;

    /**
    * IP黑名单配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpBlackConfig")
    @Expose
    private IpConfig IpBlackConfig;

    /**
    * mcp server ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 预览地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 应用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("App")
    @Expose
    private IDNameVO App;

    /**
    * 目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalogs")
    @Expose
    private IDNameVO [] Catalogs;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private IDNameVO [] Labels;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 用户appID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 自定义host
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomHttpHost")
    @Expose
    private String CustomHttpHost;

    /**
    *  Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpHostType")
    @Expose
    private String HttpHostType;

    /**
    * 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * mcp server模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * mcp version
    */
    @SerializedName("McpVersion")
    @Expose
    private String McpVersion;

    /**
    * 封装模式下绑定的服务ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WrapServices")
    @Expose
    private String [] WrapServices;

    /**
    * 工具数量
    */
    @SerializedName("ToolNum")
    @Expose
    private Long ToolNum;

    /**
    * 安全规则集响应
    */
    @SerializedName("McpSecurityRulesVO")
    @Expose
    private McpSecurityRulesVO [] McpSecurityRulesVO;

    /**
    * 真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolConfigs")
    @Expose
    private ToolConfigVO [] ToolConfigs;

    /**
    * 访问URL
    */
    @SerializedName("UrlObj")
    @Expose
    private McpUrlObj UrlObj;

    /**
    * 后端mcp服务是否正常
    */
    @SerializedName("ToolMessage")
    @Expose
    private String ToolMessage;

    /**
    * 后端mcp服务的工具列表
    */
    @SerializedName("Tools")
    @Expose
    private McpTool [] Tools;

    /**
    * 封装的API分组ID
    */
    @SerializedName("WrapPaasID")
    @Expose
    private String WrapPaasID;

    /**
    * 关联的agentApp数量
    */
    @SerializedName("RelateAgentAppNum")
    @Expose
    private Long RelateAgentAppNum;

    /**
    * 插件配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 标签ID数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelIDs 标签ID数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelIDs() {
        return this.LabelIDs;
    }

    /**
     * Set 标签ID数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelIDs 标签ID数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelIDs(String [] LabelIDs) {
        this.LabelIDs = LabelIDs;
    }

    /**
     * Get 目录ID数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryIDs 目录ID数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCategoryIDs() {
        return this.CategoryIDs;
    }

    /**
     * Set 目录ID数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryIDs 目录ID数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryIDs(String [] CategoryIDs) {
        this.CategoryIDs = CategoryIDs;
    }

    /**
     * Get 负载方式，robin random consistentHash
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSelect 负载方式，robin random consistentHash
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSelect() {
        return this.TargetSelect;
    }

    /**
     * Set 负载方式，robin random consistentHash
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSelect 负载方式，robin random consistentHash
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSelect(String TargetSelect) {
        this.TargetSelect = TargetSelect;
    }

    /**
     * Get 目标服务器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHosts 目标服务器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set 目标服务器
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHosts 目标服务器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get 后端协议：http https
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpProtocolType 后端协议：http https
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set 后端协议：http https
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpProtocolType 后端协议：http https
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get 证书检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckTargetCertsError 证书检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set 证书检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckTargetCertsError 证书检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get 目标路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetPath 目标路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set 目标路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetPath 目标路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get 流量控制状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeLimitConfigStatus 流量控制状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set 流量控制状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeLimitConfigStatus 流量控制状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get 流量控制配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeLimitConfig 流量控制配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set 流量控制配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeLimitConfig 流量控制配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get IP白名单开启状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpWhiteStatus IP白名单开启状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIpWhiteStatus() {
        return this.IpWhiteStatus;
    }

    /**
     * Set IP白名单开启状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpWhiteStatus IP白名单开启状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpWhiteStatus(Boolean IpWhiteStatus) {
        this.IpWhiteStatus = IpWhiteStatus;
    }

    /**
     * Get IP白名单配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpWhiteConfig IP白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpConfig getIpWhiteConfig() {
        return this.IpWhiteConfig;
    }

    /**
     * Set IP白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpWhiteConfig IP白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpWhiteConfig(IpConfig IpWhiteConfig) {
        this.IpWhiteConfig = IpWhiteConfig;
    }

    /**
     * Get IP黑名单开启状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpBlackStatus IP黑名单开启状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIpBlackStatus() {
        return this.IpBlackStatus;
    }

    /**
     * Set IP黑名单开启状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpBlackStatus IP黑名单开启状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpBlackStatus(Boolean IpBlackStatus) {
        this.IpBlackStatus = IpBlackStatus;
    }

    /**
     * Get IP黑名单配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpBlackConfig IP黑名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpConfig getIpBlackConfig() {
        return this.IpBlackConfig;
    }

    /**
     * Set IP黑名单配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpBlackConfig IP黑名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpBlackConfig(IpConfig IpBlackConfig) {
        this.IpBlackConfig = IpBlackConfig;
    }

    /**
     * Get mcp server ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID mcp server ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set mcp server ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID mcp server ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 预览地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 预览地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 预览地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 预览地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 应用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return App 应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO getApp() {
        return this.App;
    }

    /**
     * Set 应用
注意：此字段可能返回 null，表示取不到有效值。
     * @param App 应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApp(IDNameVO App) {
        this.App = App;
    }

    /**
     * Get 目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalogs 目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO [] getCatalogs() {
        return this.Catalogs;
    }

    /**
     * Set 目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalogs 目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogs(IDNameVO [] Catalogs) {
        this.Catalogs = Catalogs;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(IDNameVO [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 用户appID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID 用户appID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 用户appID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID 用户appID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 自定义host
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomHttpHost 自定义host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomHttpHost() {
        return this.CustomHttpHost;
    }

    /**
     * Set 自定义host
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomHttpHost 自定义host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomHttpHost(String CustomHttpHost) {
        this.CustomHttpHost = CustomHttpHost;
    }

    /**
     * Get  Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpHostType  Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpHostType() {
        return this.HttpHostType;
    }

    /**
     * Set  Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpHostType  Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpHostType(String HttpHostType) {
        this.HttpHostType = HttpHostType;
    }

    /**
     * Get 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get mcp server模式 
     * @return Mode mcp server模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set mcp server模式
     * @param Mode mcp server模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get mcp version 
     * @return McpVersion mcp version
     */
    public String getMcpVersion() {
        return this.McpVersion;
    }

    /**
     * Set mcp version
     * @param McpVersion mcp version
     */
    public void setMcpVersion(String McpVersion) {
        this.McpVersion = McpVersion;
    }

    /**
     * Get 封装模式下绑定的服务ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WrapServices 封装模式下绑定的服务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getWrapServices() {
        return this.WrapServices;
    }

    /**
     * Set 封装模式下绑定的服务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param WrapServices 封装模式下绑定的服务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWrapServices(String [] WrapServices) {
        this.WrapServices = WrapServices;
    }

    /**
     * Get 工具数量 
     * @return ToolNum 工具数量
     */
    public Long getToolNum() {
        return this.ToolNum;
    }

    /**
     * Set 工具数量
     * @param ToolNum 工具数量
     */
    public void setToolNum(Long ToolNum) {
        this.ToolNum = ToolNum;
    }

    /**
     * Get 安全规则集响应 
     * @return McpSecurityRulesVO 安全规则集响应
     */
    public McpSecurityRulesVO [] getMcpSecurityRulesVO() {
        return this.McpSecurityRulesVO;
    }

    /**
     * Set 安全规则集响应
     * @param McpSecurityRulesVO 安全规则集响应
     */
    public void setMcpSecurityRulesVO(McpSecurityRulesVO [] McpSecurityRulesVO) {
        this.McpSecurityRulesVO = McpSecurityRulesVO;
    }

    /**
     * Get 真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolConfigs 真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ToolConfigVO [] getToolConfigs() {
        return this.ToolConfigs;
    }

    /**
     * Set 真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolConfigs 真实工具级别配置，实时拉取了tool/list做渲染的，如果tool/list不通，就拉不到。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolConfigs(ToolConfigVO [] ToolConfigs) {
        this.ToolConfigs = ToolConfigs;
    }

    /**
     * Get 访问URL 
     * @return UrlObj 访问URL
     */
    public McpUrlObj getUrlObj() {
        return this.UrlObj;
    }

    /**
     * Set 访问URL
     * @param UrlObj 访问URL
     */
    public void setUrlObj(McpUrlObj UrlObj) {
        this.UrlObj = UrlObj;
    }

    /**
     * Get 后端mcp服务是否正常 
     * @return ToolMessage 后端mcp服务是否正常
     */
    public String getToolMessage() {
        return this.ToolMessage;
    }

    /**
     * Set 后端mcp服务是否正常
     * @param ToolMessage 后端mcp服务是否正常
     */
    public void setToolMessage(String ToolMessage) {
        this.ToolMessage = ToolMessage;
    }

    /**
     * Get 后端mcp服务的工具列表 
     * @return Tools 后端mcp服务的工具列表
     */
    public McpTool [] getTools() {
        return this.Tools;
    }

    /**
     * Set 后端mcp服务的工具列表
     * @param Tools 后端mcp服务的工具列表
     */
    public void setTools(McpTool [] Tools) {
        this.Tools = Tools;
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
     * Get 关联的agentApp数量 
     * @return RelateAgentAppNum 关联的agentApp数量
     */
    public Long getRelateAgentAppNum() {
        return this.RelateAgentAppNum;
    }

    /**
     * Set 关联的agentApp数量
     * @param RelateAgentAppNum 关联的agentApp数量
     */
    public void setRelateAgentAppNum(Long RelateAgentAppNum) {
        this.RelateAgentAppNum = RelateAgentAppNum;
    }

    /**
     * Get 插件配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginConfigs 插件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PluginConfigDTO [] getPluginConfigs() {
        return this.PluginConfigs;
    }

    /**
     * Set 插件配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginConfigs 插件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPluginConfigs(PluginConfigDTO [] PluginConfigs) {
        this.PluginConfigs = PluginConfigs;
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

    }
}

