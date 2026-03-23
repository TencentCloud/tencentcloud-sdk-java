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

public class CreateModelServiceRequest extends AbstractModel {

    /**
    * 实例
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 模型服务名称
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
    * 模型ID列表
    */
    @SerializedName("TargetModels")
    @Expose
    private TargetModelDTO [] TargetModels;

    /**
    * 路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;
    */
    @SerializedName("PathMatchType")
    @Expose
    private String PathMatchType;

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
    * 是否开启内容安全
    */
    @SerializedName("TmsStatus")
    @Expose
    private Boolean TmsStatus;

    /**
    * 内容安全配置
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
    * IP白名单
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * IP黑名单
    */
    @SerializedName("IpBlackList")
    @Expose
    private String [] IpBlackList;

    /**
    * 插件配置
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
    * 超时配置，秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get 实例 
     * @return InstanceID 实例
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例
     * @param InstanceID 实例
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 模型服务名称 
     * @return Name 模型服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型服务名称
     * @param Name 模型服务名称
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
     * Get 模型ID列表 
     * @return TargetModels 模型ID列表
     */
    public TargetModelDTO [] getTargetModels() {
        return this.TargetModels;
    }

    /**
     * Set 模型ID列表
     * @param TargetModels 模型ID列表
     */
    public void setTargetModels(TargetModelDTO [] TargetModels) {
        this.TargetModels = TargetModels;
    }

    /**
     * Get 路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配; 
     * @return PathMatchType 路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;
     */
    public String getPathMatchType() {
        return this.PathMatchType;
    }

    /**
     * Set 路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;
     * @param PathMatchType 路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;
     */
    public void setPathMatchType(String PathMatchType) {
        this.PathMatchType = PathMatchType;
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
     * Get 是否开启内容安全 
     * @return TmsStatus 是否开启内容安全
     */
    public Boolean getTmsStatus() {
        return this.TmsStatus;
    }

    /**
     * Set 是否开启内容安全
     * @param TmsStatus 是否开启内容安全
     */
    public void setTmsStatus(Boolean TmsStatus) {
        this.TmsStatus = TmsStatus;
    }

    /**
     * Get 内容安全配置 
     * @return TmsConfig 内容安全配置
     */
    public TmsConfigDTO getTmsConfig() {
        return this.TmsConfig;
    }

    /**
     * Set 内容安全配置
     * @param TmsConfig 内容安全配置
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
     * Get IP白名单 
     * @return IpWhiteList IP白名单
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set IP白名单
     * @param IpWhiteList IP白名单
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get IP黑名单 
     * @return IpBlackList IP黑名单
     */
    public String [] getIpBlackList() {
        return this.IpBlackList;
    }

    /**
     * Set IP黑名单
     * @param IpBlackList IP黑名单
     */
    public void setIpBlackList(String [] IpBlackList) {
        this.IpBlackList = IpBlackList;
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

    /**
     * Get 超时配置，秒 
     * @return Timeout 超时配置，秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时配置，秒
     * @param Timeout 超时配置，秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public CreateModelServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelServiceRequest(CreateModelServiceRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
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
        if (source.TargetModels != null) {
            this.TargetModels = new TargetModelDTO[source.TargetModels.length];
            for (int i = 0; i < source.TargetModels.length; i++) {
                this.TargetModels[i] = new TargetModelDTO(source.TargetModels[i]);
            }
        }
        if (source.PathMatchType != null) {
            this.PathMatchType = new String(source.PathMatchType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PubPath", this.PubPath);
        this.setParamArrayObj(map, prefix + "TargetModels.", this.TargetModels);
        this.setParamSimple(map, prefix + "PathMatchType", this.PathMatchType);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
        this.setParamSimple(map, prefix + "TokenLimitStatus", this.TokenLimitStatus);
        this.setParamObj(map, prefix + "TokenLimitConfig.", this.TokenLimitConfig);
        this.setParamSimple(map, prefix + "TmsStatus", this.TmsStatus);
        this.setParamObj(map, prefix + "TmsConfig.", this.TmsConfig);
        this.setParamSimple(map, prefix + "IpWhiteStatus", this.IpWhiteStatus);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamArraySimple(map, prefix + "IpBlackList.", this.IpBlackList);
        this.setParamArrayObj(map, prefix + "PluginConfigs.", this.PluginConfigs);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

