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
    * 腾讯云AppID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 腾讯云Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 模型ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 模型名称
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
    * 访问路径
    */
    @SerializedName("PubPath")
    @Expose
    private String PubPath;

    /**
    * 路径匹配方式：absolute，prefix，regex
    */
    @SerializedName("PathMatchType")
    @Expose
    private String PathMatchType;

    /**
    * 目标模型列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetModels")
    @Expose
    private TargetModelDTO [] TargetModels;

    /**
    * 模板模型的名称列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelNames")
    @Expose
    private String [] ModelNames;

    /**
    * 是否开启限流
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * 限流配置
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后修改时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 是否开启token控制
    */
    @SerializedName("TokenLimitStatus")
    @Expose
    private Boolean TokenLimitStatus;

    /**
    * token控制
    */
    @SerializedName("TokenLimitConfig")
    @Expose
    private TokenLimitConfigDTO TokenLimitConfig;

    /**
    * 是否开启tms配置
    */
    @SerializedName("TmsStatus")
    @Expose
    private Boolean TmsStatus;

    /**
    * tms配置
    */
    @SerializedName("TmsConfig")
    @Expose
    private TmsConfigDTO TmsConfig;

    /**
    * 是否开启IP白名单
    */
    @SerializedName("IpWhiteStatus")
    @Expose
    private Boolean IpWhiteStatus;

    /**
    * IP白名单列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * 是否开启IP黑名单
    */
    @SerializedName("IpBlackStatus")
    @Expose
    private Boolean IpBlackStatus;

    /**
    * IP黑名单列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpBlackList")
    @Expose
    private String [] IpBlackList;

    /**
    * 插件配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
    * 超时配置，单位秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 状态：normal，disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 关联应用数
    */
    @SerializedName("RelateAgentAppNum")
    @Expose
    private Long RelateAgentAppNum;

    /**
    * 请求路径
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 是否开启提示词安全检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptModerateStatus")
    @Expose
    private Boolean PromptModerateStatus;

    /**
    * 提示词安全检测配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptModerateConfig")
    @Expose
    private PromptModerateConfigDTO PromptModerateConfig;

    /**
     * Get 腾讯云AppID 
     * @return AppID 腾讯云AppID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 腾讯云AppID
     * @param AppID 腾讯云AppID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 腾讯云Uin 
     * @return Uin 腾讯云Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云Uin
     * @param Uin 腾讯云Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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
     * Get 模型ID 
     * @return ID 模型ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 模型ID
     * @param ID 模型ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 模型名称 
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型名称
     * @param Name 模型名称
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
     * Get 访问路径 
     * @return PubPath 访问路径
     */
    public String getPubPath() {
        return this.PubPath;
    }

    /**
     * Set 访问路径
     * @param PubPath 访问路径
     */
    public void setPubPath(String PubPath) {
        this.PubPath = PubPath;
    }

    /**
     * Get 路径匹配方式：absolute，prefix，regex 
     * @return PathMatchType 路径匹配方式：absolute，prefix，regex
     */
    public String getPathMatchType() {
        return this.PathMatchType;
    }

    /**
     * Set 路径匹配方式：absolute，prefix，regex
     * @param PathMatchType 路径匹配方式：absolute，prefix，regex
     */
    public void setPathMatchType(String PathMatchType) {
        this.PathMatchType = PathMatchType;
    }

    /**
     * Get 目标模型列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetModels 目标模型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetModelDTO [] getTargetModels() {
        return this.TargetModels;
    }

    /**
     * Set 目标模型列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetModels 目标模型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetModels(TargetModelDTO [] TargetModels) {
        this.TargetModels = TargetModels;
    }

    /**
     * Get 模板模型的名称列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelNames 模板模型的名称列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getModelNames() {
        return this.ModelNames;
    }

    /**
     * Set 模板模型的名称列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelNames 模板模型的名称列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelNames(String [] ModelNames) {
        this.ModelNames = ModelNames;
    }

    /**
     * Get 是否开启限流 
     * @return InvokeLimitConfigStatus 是否开启限流
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set 是否开启限流
     * @param InvokeLimitConfigStatus 是否开启限流
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get 限流配置 
     * @return InvokeLimitConfig 限流配置
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set 限流配置
     * @param InvokeLimitConfig 限流配置
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后修改时间 
     * @return LastUpdateTime 最后修改时间
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后修改时间
     * @param LastUpdateTime 最后修改时间
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 是否开启token控制 
     * @return TokenLimitStatus 是否开启token控制
     */
    public Boolean getTokenLimitStatus() {
        return this.TokenLimitStatus;
    }

    /**
     * Set 是否开启token控制
     * @param TokenLimitStatus 是否开启token控制
     */
    public void setTokenLimitStatus(Boolean TokenLimitStatus) {
        this.TokenLimitStatus = TokenLimitStatus;
    }

    /**
     * Get token控制 
     * @return TokenLimitConfig token控制
     */
    public TokenLimitConfigDTO getTokenLimitConfig() {
        return this.TokenLimitConfig;
    }

    /**
     * Set token控制
     * @param TokenLimitConfig token控制
     */
    public void setTokenLimitConfig(TokenLimitConfigDTO TokenLimitConfig) {
        this.TokenLimitConfig = TokenLimitConfig;
    }

    /**
     * Get 是否开启tms配置 
     * @return TmsStatus 是否开启tms配置
     */
    public Boolean getTmsStatus() {
        return this.TmsStatus;
    }

    /**
     * Set 是否开启tms配置
     * @param TmsStatus 是否开启tms配置
     */
    public void setTmsStatus(Boolean TmsStatus) {
        this.TmsStatus = TmsStatus;
    }

    /**
     * Get tms配置 
     * @return TmsConfig tms配置
     */
    public TmsConfigDTO getTmsConfig() {
        return this.TmsConfig;
    }

    /**
     * Set tms配置
     * @param TmsConfig tms配置
     */
    public void setTmsConfig(TmsConfigDTO TmsConfig) {
        this.TmsConfig = TmsConfig;
    }

    /**
     * Get 是否开启IP白名单 
     * @return IpWhiteStatus 是否开启IP白名单
     */
    public Boolean getIpWhiteStatus() {
        return this.IpWhiteStatus;
    }

    /**
     * Set 是否开启IP白名单
     * @param IpWhiteStatus 是否开启IP白名单
     */
    public void setIpWhiteStatus(Boolean IpWhiteStatus) {
        this.IpWhiteStatus = IpWhiteStatus;
    }

    /**
     * Get IP白名单列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpWhiteList IP白名单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set IP白名单列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpWhiteList IP白名单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get 是否开启IP黑名单 
     * @return IpBlackStatus 是否开启IP黑名单
     */
    public Boolean getIpBlackStatus() {
        return this.IpBlackStatus;
    }

    /**
     * Set 是否开启IP黑名单
     * @param IpBlackStatus 是否开启IP黑名单
     */
    public void setIpBlackStatus(Boolean IpBlackStatus) {
        this.IpBlackStatus = IpBlackStatus;
    }

    /**
     * Get IP黑名单列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpBlackList IP黑名单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpBlackList() {
        return this.IpBlackList;
    }

    /**
     * Set IP黑名单列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpBlackList IP黑名单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpBlackList(String [] IpBlackList) {
        this.IpBlackList = IpBlackList;
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

    /**
     * Get 超时配置，单位秒 
     * @return Timeout 超时配置，单位秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时配置，单位秒
     * @param Timeout 超时配置，单位秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 状态：normal，disabled 
     * @return Status 状态：normal，disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：normal，disabled
     * @param Status 状态：normal，disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 关联应用数 
     * @return RelateAgentAppNum 关联应用数
     */
    public Long getRelateAgentAppNum() {
        return this.RelateAgentAppNum;
    }

    /**
     * Set 关联应用数
     * @param RelateAgentAppNum 关联应用数
     */
    public void setRelateAgentAppNum(Long RelateAgentAppNum) {
        this.RelateAgentAppNum = RelateAgentAppNum;
    }

    /**
     * Get 请求路径 
     * @return Url 请求路径
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求路径
     * @param Url 请求路径
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 是否开启提示词安全检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptModerateStatus 是否开启提示词安全检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPromptModerateStatus() {
        return this.PromptModerateStatus;
    }

    /**
     * Set 是否开启提示词安全检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptModerateStatus 是否开启提示词安全检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptModerateStatus(Boolean PromptModerateStatus) {
        this.PromptModerateStatus = PromptModerateStatus;
    }

    /**
     * Get 提示词安全检测配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptModerateConfig 提示词安全检测配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PromptModerateConfigDTO getPromptModerateConfig() {
        return this.PromptModerateConfig;
    }

    /**
     * Set 提示词安全检测配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptModerateConfig 提示词安全检测配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptModerateConfig(PromptModerateConfigDTO PromptModerateConfig) {
        this.PromptModerateConfig = PromptModerateConfig;
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

    }
}

