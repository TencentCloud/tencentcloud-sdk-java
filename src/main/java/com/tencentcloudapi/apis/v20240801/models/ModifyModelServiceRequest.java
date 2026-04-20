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

public class ModifyModelServiceRequest extends AbstractModel {

    /**
    * <p>实例</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>模型服务ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>模型服务名称</p>
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
    * <p>模板模型列表</p>
    */
    @SerializedName("TargetModels")
    @Expose
    private TargetModelDTO [] TargetModels;

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
    * <p>是否开启内容安全</p>
    */
    @SerializedName("TmsStatus")
    @Expose
    private Boolean TmsStatus;

    /**
    * <p>内容安全配置</p>
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
    * <p>IP白名单</p>
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
    * <p>IP黑名单</p>
    */
    @SerializedName("IpBlackList")
    @Expose
    private String [] IpBlackList;

    /**
    * <p>插件配置</p>
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
    * <p>超时配置，秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>是否开启提示词安全检测配置</p>
    */
    @SerializedName("PromptModerateStatus")
    @Expose
    private Boolean PromptModerateStatus;

    /**
    * <p>提示词安全检测配置</p>
    */
    @SerializedName("PromptModerateConfig")
    @Expose
    private PromptModerateConfigDTO PromptModerateConfig;

    /**
    * <p>是否开启敏感数据检测</p>
    */
    @SerializedName("SensitiveDataCheckStatus")
    @Expose
    private Boolean SensitiveDataCheckStatus;

    /**
    * <p>敏感数据检测配置</p>
    */
    @SerializedName("SensitiveDataCheckConfig")
    @Expose
    private SensitiveDataCheckConfigDTO SensitiveDataCheckConfig;

    /**
     * Get <p>实例</p> 
     * @return InstanceID <p>实例</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例</p>
     * @param InstanceID <p>实例</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>模型服务ID</p> 
     * @return ID <p>模型服务ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>模型服务ID</p>
     * @param ID <p>模型服务ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>模型服务名称</p> 
     * @return Name <p>模型服务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型服务名称</p>
     * @param Name <p>模型服务名称</p>
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
     * Get <p>模板模型列表</p> 
     * @return TargetModels <p>模板模型列表</p>
     */
    public TargetModelDTO [] getTargetModels() {
        return this.TargetModels;
    }

    /**
     * Set <p>模板模型列表</p>
     * @param TargetModels <p>模板模型列表</p>
     */
    public void setTargetModels(TargetModelDTO [] TargetModels) {
        this.TargetModels = TargetModels;
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
     * Get <p>是否开启内容安全</p> 
     * @return TmsStatus <p>是否开启内容安全</p>
     */
    public Boolean getTmsStatus() {
        return this.TmsStatus;
    }

    /**
     * Set <p>是否开启内容安全</p>
     * @param TmsStatus <p>是否开启内容安全</p>
     */
    public void setTmsStatus(Boolean TmsStatus) {
        this.TmsStatus = TmsStatus;
    }

    /**
     * Get <p>内容安全配置</p> 
     * @return TmsConfig <p>内容安全配置</p>
     */
    public TmsConfigDTO getTmsConfig() {
        return this.TmsConfig;
    }

    /**
     * Set <p>内容安全配置</p>
     * @param TmsConfig <p>内容安全配置</p>
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
     * Get <p>IP白名单</p> 
     * @return IpWhiteList <p>IP白名单</p>
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set <p>IP白名单</p>
     * @param IpWhiteList <p>IP白名单</p>
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
     * Get <p>IP黑名单</p> 
     * @return IpBlackList <p>IP黑名单</p>
     */
    public String [] getIpBlackList() {
        return this.IpBlackList;
    }

    /**
     * Set <p>IP黑名单</p>
     * @param IpBlackList <p>IP黑名单</p>
     */
    public void setIpBlackList(String [] IpBlackList) {
        this.IpBlackList = IpBlackList;
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
     * Get <p>超时配置，秒</p> 
     * @return Timeout <p>超时配置，秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时配置，秒</p>
     * @param Timeout <p>超时配置，秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>是否开启提示词安全检测配置</p> 
     * @return PromptModerateStatus <p>是否开启提示词安全检测配置</p>
     */
    public Boolean getPromptModerateStatus() {
        return this.PromptModerateStatus;
    }

    /**
     * Set <p>是否开启提示词安全检测配置</p>
     * @param PromptModerateStatus <p>是否开启提示词安全检测配置</p>
     */
    public void setPromptModerateStatus(Boolean PromptModerateStatus) {
        this.PromptModerateStatus = PromptModerateStatus;
    }

    /**
     * Get <p>提示词安全检测配置</p> 
     * @return PromptModerateConfig <p>提示词安全检测配置</p>
     */
    public PromptModerateConfigDTO getPromptModerateConfig() {
        return this.PromptModerateConfig;
    }

    /**
     * Set <p>提示词安全检测配置</p>
     * @param PromptModerateConfig <p>提示词安全检测配置</p>
     */
    public void setPromptModerateConfig(PromptModerateConfigDTO PromptModerateConfig) {
        this.PromptModerateConfig = PromptModerateConfig;
    }

    /**
     * Get <p>是否开启敏感数据检测</p> 
     * @return SensitiveDataCheckStatus <p>是否开启敏感数据检测</p>
     */
    public Boolean getSensitiveDataCheckStatus() {
        return this.SensitiveDataCheckStatus;
    }

    /**
     * Set <p>是否开启敏感数据检测</p>
     * @param SensitiveDataCheckStatus <p>是否开启敏感数据检测</p>
     */
    public void setSensitiveDataCheckStatus(Boolean SensitiveDataCheckStatus) {
        this.SensitiveDataCheckStatus = SensitiveDataCheckStatus;
    }

    /**
     * Get <p>敏感数据检测配置</p> 
     * @return SensitiveDataCheckConfig <p>敏感数据检测配置</p>
     */
    public SensitiveDataCheckConfigDTO getSensitiveDataCheckConfig() {
        return this.SensitiveDataCheckConfig;
    }

    /**
     * Set <p>敏感数据检测配置</p>
     * @param SensitiveDataCheckConfig <p>敏感数据检测配置</p>
     */
    public void setSensitiveDataCheckConfig(SensitiveDataCheckConfigDTO SensitiveDataCheckConfig) {
        this.SensitiveDataCheckConfig = SensitiveDataCheckConfig;
    }

    public ModifyModelServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModelServiceRequest(ModifyModelServiceRequest source) {
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
        if (source.TargetModels != null) {
            this.TargetModels = new TargetModelDTO[source.TargetModels.length];
            for (int i = 0; i < source.TargetModels.length; i++) {
                this.TargetModels[i] = new TargetModelDTO(source.TargetModels[i]);
            }
        }
        if (source.InvokeLimitConfigStatus != null) {
            this.InvokeLimitConfigStatus = new Boolean(source.InvokeLimitConfigStatus);
        }
        if (source.InvokeLimitConfig != null) {
            this.InvokeLimitConfig = new InvokeLimitConfigDTO(source.InvokeLimitConfig);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "TargetModels.", this.TargetModels);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
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
        this.setParamSimple(map, prefix + "PromptModerateStatus", this.PromptModerateStatus);
        this.setParamObj(map, prefix + "PromptModerateConfig.", this.PromptModerateConfig);
        this.setParamSimple(map, prefix + "SensitiveDataCheckStatus", this.SensitiveDataCheckStatus);
        this.setParamObj(map, prefix + "SensitiveDataCheckConfig.", this.SensitiveDataCheckConfig);

    }
}

