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

public class DescribeModelServiceResponseVO extends AbstractModel {

    /**
    * <p>腾讯云AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>腾讯云Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>模型ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>模型名称</p>
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
    * <p>访问路径</p>
    */
    @SerializedName("PubPath")
    @Expose
    private String PubPath;

    /**
    * <p>路径匹配方式：absolute，prefix，regex</p>
    */
    @SerializedName("PathMatchType")
    @Expose
    private String PathMatchType;

    /**
    * <p>目标模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetModels")
    @Expose
    private TargetModelDTO [] TargetModels;

    /**
    * <p>模板模型的名称列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelNames")
    @Expose
    private String [] ModelNames;

    /**
    * <p>是否开启限流</p>
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * <p>限流配置</p>
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后修改时间</p>
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * <p>是否开启token控制</p>
    */
    @SerializedName("TokenLimitStatus")
    @Expose
    private Boolean TokenLimitStatus;

    /**
    * <p>token控制</p>
    */
    @SerializedName("TokenLimitConfig")
    @Expose
    private TokenLimitConfigDTO TokenLimitConfig;

    /**
    * <p>是否开启tms配置</p>
    */
    @SerializedName("TmsStatus")
    @Expose
    private Boolean TmsStatus;

    /**
    * <p>tms配置</p>
    */
    @SerializedName("TmsConfig")
    @Expose
    private TmsConfigDTO TmsConfig;

    /**
    * <p>是否开启IP白名单</p>
    */
    @SerializedName("IpWhiteStatus")
    @Expose
    private Boolean IpWhiteStatus;

    /**
    * <p>IP白名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * <p>是否开启IP黑名单</p>
    */
    @SerializedName("IpBlackStatus")
    @Expose
    private Boolean IpBlackStatus;

    /**
    * <p>IP黑名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpBlackList")
    @Expose
    private String [] IpBlackList;

    /**
    * <p>插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
    * <p>超时配置，单位秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>状态：normal，disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>关联应用数</p>
    */
    @SerializedName("RelateAgentAppNum")
    @Expose
    private Long RelateAgentAppNum;

    /**
    * <p>请求路径</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>是否开启提示词安全检测</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptModerateStatus")
    @Expose
    private Boolean PromptModerateStatus;

    /**
    * <p>提示词安全检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptModerateConfig")
    @Expose
    private PromptModerateConfigDTO PromptModerateConfig;

    /**
    * <p>是否开启敏感数据检测</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveDataCheckStatus")
    @Expose
    private Boolean SensitiveDataCheckStatus;

    /**
    * <p>敏感数据检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveDataCheckConfig")
    @Expose
    private SensitiveDataCheckConfigDTO SensitiveDataCheckConfig;

    /**
    * <p>负载方式</p><p>枚举值：</p><ul><li>random： 随机</li><li>consistentHash： 会话保持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSelect")
    @Expose
    private String TargetSelect;

    /**
    * <p>会话判断方式</p><p>枚举值：</p><ul><li>fromClientIP： 从客户端IP判断</li><li>fromHeader： 从请求header判断</li><li>autoDetect： 自动探测</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FindHostKeyMethod")
    @Expose
    private String FindHostKeyMethod;

    /**
    * <p>会话判断header名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostKeyHeaderName")
    @Expose
    private String HostKeyHeaderName;

    /**
    * <p>是否开启备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FallbackStatus")
    @Expose
    private Boolean FallbackStatus;

    /**
    * <p>备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FallbackModels")
    @Expose
    private TargetModelDTO [] FallbackModels;

    /**
     * Get <p>腾讯云AppID</p> 
     * @return AppID <p>腾讯云AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>腾讯云AppID</p>
     * @param AppID <p>腾讯云AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>腾讯云Uin</p> 
     * @return Uin <p>腾讯云Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>腾讯云Uin</p>
     * @param Uin <p>腾讯云Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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
     * Get <p>模型ID</p> 
     * @return ID <p>模型ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>模型ID</p>
     * @param ID <p>模型ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>模型名称</p> 
     * @return Name <p>模型名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型名称</p>
     * @param Name <p>模型名称</p>
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
     * Get <p>访问路径</p> 
     * @return PubPath <p>访问路径</p>
     */
    public String getPubPath() {
        return this.PubPath;
    }

    /**
     * Set <p>访问路径</p>
     * @param PubPath <p>访问路径</p>
     */
    public void setPubPath(String PubPath) {
        this.PubPath = PubPath;
    }

    /**
     * Get <p>路径匹配方式：absolute，prefix，regex</p> 
     * @return PathMatchType <p>路径匹配方式：absolute，prefix，regex</p>
     */
    public String getPathMatchType() {
        return this.PathMatchType;
    }

    /**
     * Set <p>路径匹配方式：absolute，prefix，regex</p>
     * @param PathMatchType <p>路径匹配方式：absolute，prefix，regex</p>
     */
    public void setPathMatchType(String PathMatchType) {
        this.PathMatchType = PathMatchType;
    }

    /**
     * Get <p>目标模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetModels <p>目标模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetModelDTO [] getTargetModels() {
        return this.TargetModels;
    }

    /**
     * Set <p>目标模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetModels <p>目标模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetModels(TargetModelDTO [] TargetModels) {
        this.TargetModels = TargetModels;
    }

    /**
     * Get <p>模板模型的名称列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelNames <p>模板模型的名称列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getModelNames() {
        return this.ModelNames;
    }

    /**
     * Set <p>模板模型的名称列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelNames <p>模板模型的名称列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelNames(String [] ModelNames) {
        this.ModelNames = ModelNames;
    }

    /**
     * Get <p>是否开启限流</p> 
     * @return InvokeLimitConfigStatus <p>是否开启限流</p>
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set <p>是否开启限流</p>
     * @param InvokeLimitConfigStatus <p>是否开启限流</p>
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get <p>限流配置</p> 
     * @return InvokeLimitConfig <p>限流配置</p>
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set <p>限流配置</p>
     * @param InvokeLimitConfig <p>限流配置</p>
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
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
     * Get <p>最后修改时间</p> 
     * @return LastUpdateTime <p>最后修改时间</p>
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set <p>最后修改时间</p>
     * @param LastUpdateTime <p>最后修改时间</p>
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get <p>是否开启token控制</p> 
     * @return TokenLimitStatus <p>是否开启token控制</p>
     */
    public Boolean getTokenLimitStatus() {
        return this.TokenLimitStatus;
    }

    /**
     * Set <p>是否开启token控制</p>
     * @param TokenLimitStatus <p>是否开启token控制</p>
     */
    public void setTokenLimitStatus(Boolean TokenLimitStatus) {
        this.TokenLimitStatus = TokenLimitStatus;
    }

    /**
     * Get <p>token控制</p> 
     * @return TokenLimitConfig <p>token控制</p>
     */
    public TokenLimitConfigDTO getTokenLimitConfig() {
        return this.TokenLimitConfig;
    }

    /**
     * Set <p>token控制</p>
     * @param TokenLimitConfig <p>token控制</p>
     */
    public void setTokenLimitConfig(TokenLimitConfigDTO TokenLimitConfig) {
        this.TokenLimitConfig = TokenLimitConfig;
    }

    /**
     * Get <p>是否开启tms配置</p> 
     * @return TmsStatus <p>是否开启tms配置</p>
     */
    public Boolean getTmsStatus() {
        return this.TmsStatus;
    }

    /**
     * Set <p>是否开启tms配置</p>
     * @param TmsStatus <p>是否开启tms配置</p>
     */
    public void setTmsStatus(Boolean TmsStatus) {
        this.TmsStatus = TmsStatus;
    }

    /**
     * Get <p>tms配置</p> 
     * @return TmsConfig <p>tms配置</p>
     */
    public TmsConfigDTO getTmsConfig() {
        return this.TmsConfig;
    }

    /**
     * Set <p>tms配置</p>
     * @param TmsConfig <p>tms配置</p>
     */
    public void setTmsConfig(TmsConfigDTO TmsConfig) {
        this.TmsConfig = TmsConfig;
    }

    /**
     * Get <p>是否开启IP白名单</p> 
     * @return IpWhiteStatus <p>是否开启IP白名单</p>
     */
    public Boolean getIpWhiteStatus() {
        return this.IpWhiteStatus;
    }

    /**
     * Set <p>是否开启IP白名单</p>
     * @param IpWhiteStatus <p>是否开启IP白名单</p>
     */
    public void setIpWhiteStatus(Boolean IpWhiteStatus) {
        this.IpWhiteStatus = IpWhiteStatus;
    }

    /**
     * Get <p>IP白名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpWhiteList <p>IP白名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set <p>IP白名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpWhiteList <p>IP白名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get <p>是否开启IP黑名单</p> 
     * @return IpBlackStatus <p>是否开启IP黑名单</p>
     */
    public Boolean getIpBlackStatus() {
        return this.IpBlackStatus;
    }

    /**
     * Set <p>是否开启IP黑名单</p>
     * @param IpBlackStatus <p>是否开启IP黑名单</p>
     */
    public void setIpBlackStatus(Boolean IpBlackStatus) {
        this.IpBlackStatus = IpBlackStatus;
    }

    /**
     * Get <p>IP黑名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpBlackList <p>IP黑名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpBlackList() {
        return this.IpBlackList;
    }

    /**
     * Set <p>IP黑名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpBlackList <p>IP黑名单列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpBlackList(String [] IpBlackList) {
        this.IpBlackList = IpBlackList;
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
     * Get <p>超时配置，单位秒</p> 
     * @return Timeout <p>超时配置，单位秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时配置，单位秒</p>
     * @param Timeout <p>超时配置，单位秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>状态：normal，disabled</p> 
     * @return Status <p>状态：normal，disabled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：normal，disabled</p>
     * @param Status <p>状态：normal，disabled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>关联应用数</p> 
     * @return RelateAgentAppNum <p>关联应用数</p>
     */
    public Long getRelateAgentAppNum() {
        return this.RelateAgentAppNum;
    }

    /**
     * Set <p>关联应用数</p>
     * @param RelateAgentAppNum <p>关联应用数</p>
     */
    public void setRelateAgentAppNum(Long RelateAgentAppNum) {
        this.RelateAgentAppNum = RelateAgentAppNum;
    }

    /**
     * Get <p>请求路径</p> 
     * @return Url <p>请求路径</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>请求路径</p>
     * @param Url <p>请求路径</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>是否开启提示词安全检测</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptModerateStatus <p>是否开启提示词安全检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPromptModerateStatus() {
        return this.PromptModerateStatus;
    }

    /**
     * Set <p>是否开启提示词安全检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptModerateStatus <p>是否开启提示词安全检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptModerateStatus(Boolean PromptModerateStatus) {
        this.PromptModerateStatus = PromptModerateStatus;
    }

    /**
     * Get <p>提示词安全检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptModerateConfig <p>提示词安全检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PromptModerateConfigDTO getPromptModerateConfig() {
        return this.PromptModerateConfig;
    }

    /**
     * Set <p>提示词安全检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptModerateConfig <p>提示词安全检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptModerateConfig(PromptModerateConfigDTO PromptModerateConfig) {
        this.PromptModerateConfig = PromptModerateConfig;
    }

    /**
     * Get <p>是否开启敏感数据检测</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveDataCheckStatus <p>是否开启敏感数据检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSensitiveDataCheckStatus() {
        return this.SensitiveDataCheckStatus;
    }

    /**
     * Set <p>是否开启敏感数据检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveDataCheckStatus <p>是否开启敏感数据检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveDataCheckStatus(Boolean SensitiveDataCheckStatus) {
        this.SensitiveDataCheckStatus = SensitiveDataCheckStatus;
    }

    /**
     * Get <p>敏感数据检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveDataCheckConfig <p>敏感数据检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SensitiveDataCheckConfigDTO getSensitiveDataCheckConfig() {
        return this.SensitiveDataCheckConfig;
    }

    /**
     * Set <p>敏感数据检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveDataCheckConfig <p>敏感数据检测配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveDataCheckConfig(SensitiveDataCheckConfigDTO SensitiveDataCheckConfig) {
        this.SensitiveDataCheckConfig = SensitiveDataCheckConfig;
    }

    /**
     * Get <p>负载方式</p><p>枚举值：</p><ul><li>random： 随机</li><li>consistentHash： 会话保持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSelect <p>负载方式</p><p>枚举值：</p><ul><li>random： 随机</li><li>consistentHash： 会话保持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSelect() {
        return this.TargetSelect;
    }

    /**
     * Set <p>负载方式</p><p>枚举值：</p><ul><li>random： 随机</li><li>consistentHash： 会话保持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSelect <p>负载方式</p><p>枚举值：</p><ul><li>random： 随机</li><li>consistentHash： 会话保持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSelect(String TargetSelect) {
        this.TargetSelect = TargetSelect;
    }

    /**
     * Get <p>会话判断方式</p><p>枚举值：</p><ul><li>fromClientIP： 从客户端IP判断</li><li>fromHeader： 从请求header判断</li><li>autoDetect： 自动探测</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FindHostKeyMethod <p>会话判断方式</p><p>枚举值：</p><ul><li>fromClientIP： 从客户端IP判断</li><li>fromHeader： 从请求header判断</li><li>autoDetect： 自动探测</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFindHostKeyMethod() {
        return this.FindHostKeyMethod;
    }

    /**
     * Set <p>会话判断方式</p><p>枚举值：</p><ul><li>fromClientIP： 从客户端IP判断</li><li>fromHeader： 从请求header判断</li><li>autoDetect： 自动探测</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FindHostKeyMethod <p>会话判断方式</p><p>枚举值：</p><ul><li>fromClientIP： 从客户端IP判断</li><li>fromHeader： 从请求header判断</li><li>autoDetect： 自动探测</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFindHostKeyMethod(String FindHostKeyMethod) {
        this.FindHostKeyMethod = FindHostKeyMethod;
    }

    /**
     * Get <p>会话判断header名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostKeyHeaderName <p>会话判断header名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostKeyHeaderName() {
        return this.HostKeyHeaderName;
    }

    /**
     * Set <p>会话判断header名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostKeyHeaderName <p>会话判断header名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostKeyHeaderName(String HostKeyHeaderName) {
        this.HostKeyHeaderName = HostKeyHeaderName;
    }

    /**
     * Get <p>是否开启备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FallbackStatus <p>是否开启备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getFallbackStatus() {
        return this.FallbackStatus;
    }

    /**
     * Set <p>是否开启备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FallbackStatus <p>是否开启备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFallbackStatus(Boolean FallbackStatus) {
        this.FallbackStatus = FallbackStatus;
    }

    /**
     * Get <p>备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FallbackModels <p>备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetModelDTO [] getFallbackModels() {
        return this.FallbackModels;
    }

    /**
     * Set <p>备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FallbackModels <p>备份模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFallbackModels(TargetModelDTO [] FallbackModels) {
        this.FallbackModels = FallbackModels;
    }

    public DescribeModelServiceResponseVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelServiceResponseVO(DescribeModelServiceResponseVO source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PubPath != null) {
            this.PubPath = new String(source.PubPath);
        }
        if (source.PathMatchType != null) {
            this.PathMatchType = new String(source.PathMatchType);
        }
        if (source.TargetModels != null) {
            this.TargetModels = new TargetModelDTO[source.TargetModels.length];
            for (int i = 0; i < source.TargetModels.length; i++) {
                this.TargetModels[i] = new TargetModelDTO(source.TargetModels[i]);
            }
        }
        if (source.ModelNames != null) {
            this.ModelNames = new String[source.ModelNames.length];
            for (int i = 0; i < source.ModelNames.length; i++) {
                this.ModelNames[i] = new String(source.ModelNames[i]);
            }
        }
        if (source.InvokeLimitConfigStatus != null) {
            this.InvokeLimitConfigStatus = new Boolean(source.InvokeLimitConfigStatus);
        }
        if (source.InvokeLimitConfig != null) {
            this.InvokeLimitConfig = new InvokeLimitConfigDTO(source.InvokeLimitConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.TokenLimitStatus != null) {
            this.TokenLimitStatus = new Boolean(source.TokenLimitStatus);
        }
        if (source.TokenLimitConfig != null) {
            this.TokenLimitConfig = new TokenLimitConfigDTO(source.TokenLimitConfig);
        }
        if (source.TmsStatus != null) {
            this.TmsStatus = new Boolean(source.TmsStatus);
        }
        if (source.TmsConfig != null) {
            this.TmsConfig = new TmsConfigDTO(source.TmsConfig);
        }
        if (source.IpWhiteStatus != null) {
            this.IpWhiteStatus = new Boolean(source.IpWhiteStatus);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
        if (source.IpBlackStatus != null) {
            this.IpBlackStatus = new Boolean(source.IpBlackStatus);
        }
        if (source.IpBlackList != null) {
            this.IpBlackList = new String[source.IpBlackList.length];
            for (int i = 0; i < source.IpBlackList.length; i++) {
                this.IpBlackList[i] = new String(source.IpBlackList[i]);
            }
        }
        if (source.PluginConfigs != null) {
            this.PluginConfigs = new PluginConfigDTO[source.PluginConfigs.length];
            for (int i = 0; i < source.PluginConfigs.length; i++) {
                this.PluginConfigs[i] = new PluginConfigDTO(source.PluginConfigs[i]);
            }
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RelateAgentAppNum != null) {
            this.RelateAgentAppNum = new Long(source.RelateAgentAppNum);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PromptModerateStatus != null) {
            this.PromptModerateStatus = new Boolean(source.PromptModerateStatus);
        }
        if (source.PromptModerateConfig != null) {
            this.PromptModerateConfig = new PromptModerateConfigDTO(source.PromptModerateConfig);
        }
        if (source.SensitiveDataCheckStatus != null) {
            this.SensitiveDataCheckStatus = new Boolean(source.SensitiveDataCheckStatus);
        }
        if (source.SensitiveDataCheckConfig != null) {
            this.SensitiveDataCheckConfig = new SensitiveDataCheckConfigDTO(source.SensitiveDataCheckConfig);
        }
        if (source.TargetSelect != null) {
            this.TargetSelect = new String(source.TargetSelect);
        }
        if (source.FindHostKeyMethod != null) {
            this.FindHostKeyMethod = new String(source.FindHostKeyMethod);
        }
        if (source.HostKeyHeaderName != null) {
            this.HostKeyHeaderName = new String(source.HostKeyHeaderName);
        }
        if (source.FallbackStatus != null) {
            this.FallbackStatus = new Boolean(source.FallbackStatus);
        }
        if (source.FallbackModels != null) {
            this.FallbackModels = new TargetModelDTO[source.FallbackModels.length];
            for (int i = 0; i < source.FallbackModels.length; i++) {
                this.FallbackModels[i] = new TargetModelDTO(source.FallbackModels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PubPath", this.PubPath);
        this.setParamSimple(map, prefix + "PathMatchType", this.PathMatchType);
        this.setParamArrayObj(map, prefix + "TargetModels.", this.TargetModels);
        this.setParamArraySimple(map, prefix + "ModelNames.", this.ModelNames);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "TokenLimitStatus", this.TokenLimitStatus);
        this.setParamObj(map, prefix + "TokenLimitConfig.", this.TokenLimitConfig);
        this.setParamSimple(map, prefix + "TmsStatus", this.TmsStatus);
        this.setParamObj(map, prefix + "TmsConfig.", this.TmsConfig);
        this.setParamSimple(map, prefix + "IpWhiteStatus", this.IpWhiteStatus);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamSimple(map, prefix + "IpBlackStatus", this.IpBlackStatus);
        this.setParamArraySimple(map, prefix + "IpBlackList.", this.IpBlackList);
        this.setParamArrayObj(map, prefix + "PluginConfigs.", this.PluginConfigs);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RelateAgentAppNum", this.RelateAgentAppNum);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PromptModerateStatus", this.PromptModerateStatus);
        this.setParamObj(map, prefix + "PromptModerateConfig.", this.PromptModerateConfig);
        this.setParamSimple(map, prefix + "SensitiveDataCheckStatus", this.SensitiveDataCheckStatus);
        this.setParamObj(map, prefix + "SensitiveDataCheckConfig.", this.SensitiveDataCheckConfig);
        this.setParamSimple(map, prefix + "TargetSelect", this.TargetSelect);
        this.setParamSimple(map, prefix + "FindHostKeyMethod", this.FindHostKeyMethod);
        this.setParamSimple(map, prefix + "HostKeyHeaderName", this.HostKeyHeaderName);
        this.setParamSimple(map, prefix + "FallbackStatus", this.FallbackStatus);
        this.setParamArrayObj(map, prefix + "FallbackModels.", this.FallbackModels);

    }
}

