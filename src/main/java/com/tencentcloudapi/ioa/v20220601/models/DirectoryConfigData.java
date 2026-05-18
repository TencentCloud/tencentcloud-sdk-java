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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DirectoryConfigData extends AbstractModel {

    /**
    * <p>企业目录 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>目录对应身份源类型</p><p>枚举值：</p><ul><li>WeCom： 企业微信</li><li>Lark： 飞书</li><li>DingTalk： 钉钉</li><li>MicrosoftEntraID： 微软 AAD</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>企业目录名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>使用 JSON 字符串表示的配置信息</p>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * <p>是否开启了定时同步</p>
    */
    @SerializedName("SyncEnable")
    @Expose
    private Boolean SyncEnable;

    /**
    * <p>定时同步的策略</p><p>枚举值：</p><ul><li>4hours： 按创建时间开始的每 4 小时</li><li>daily： 每日</li><li>weekly： 每周</li></ul>
    */
    @SerializedName("SyncPolicy")
    @Expose
    private String SyncPolicy;

    /**
    * <p>JSON 字符串，针对不同类型的同步策略，提取对应不同的值</p>
    */
    @SerializedName("SyncPolicyParams")
    @Expose
    private String SyncPolicyParams;

    /**
    * <p>是否配置了同步创建认证配置</p>
    */
    @SerializedName("CreateAuthConfig")
    @Expose
    private Boolean CreateAuthConfig;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>对应 Config 的配置 ID</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>是否在登录页展示</p>
    */
    @SerializedName("DisplayOnLoginPage")
    @Expose
    private Boolean DisplayOnLoginPage;

    /**
     * Get <p>企业目录 ID</p> 
     * @return Id <p>企业目录 ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>企业目录 ID</p>
     * @param Id <p>企业目录 ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>目录对应身份源类型</p><p>枚举值：</p><ul><li>WeCom： 企业微信</li><li>Lark： 飞书</li><li>DingTalk： 钉钉</li><li>MicrosoftEntraID： 微软 AAD</li></ul> 
     * @return Type <p>目录对应身份源类型</p><p>枚举值：</p><ul><li>WeCom： 企业微信</li><li>Lark： 飞书</li><li>DingTalk： 钉钉</li><li>MicrosoftEntraID： 微软 AAD</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>目录对应身份源类型</p><p>枚举值：</p><ul><li>WeCom： 企业微信</li><li>Lark： 飞书</li><li>DingTalk： 钉钉</li><li>MicrosoftEntraID： 微软 AAD</li></ul>
     * @param Type <p>目录对应身份源类型</p><p>枚举值：</p><ul><li>WeCom： 企业微信</li><li>Lark： 飞书</li><li>DingTalk： 钉钉</li><li>MicrosoftEntraID： 微软 AAD</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>企业目录名称</p> 
     * @return Name <p>企业目录名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>企业目录名称</p>
     * @param Name <p>企业目录名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>使用 JSON 字符串表示的配置信息</p> 
     * @return Config <p>使用 JSON 字符串表示的配置信息</p>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>使用 JSON 字符串表示的配置信息</p>
     * @param Config <p>使用 JSON 字符串表示的配置信息</p>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get <p>是否开启了定时同步</p> 
     * @return SyncEnable <p>是否开启了定时同步</p>
     */
    public Boolean getSyncEnable() {
        return this.SyncEnable;
    }

    /**
     * Set <p>是否开启了定时同步</p>
     * @param SyncEnable <p>是否开启了定时同步</p>
     */
    public void setSyncEnable(Boolean SyncEnable) {
        this.SyncEnable = SyncEnable;
    }

    /**
     * Get <p>定时同步的策略</p><p>枚举值：</p><ul><li>4hours： 按创建时间开始的每 4 小时</li><li>daily： 每日</li><li>weekly： 每周</li></ul> 
     * @return SyncPolicy <p>定时同步的策略</p><p>枚举值：</p><ul><li>4hours： 按创建时间开始的每 4 小时</li><li>daily： 每日</li><li>weekly： 每周</li></ul>
     */
    public String getSyncPolicy() {
        return this.SyncPolicy;
    }

    /**
     * Set <p>定时同步的策略</p><p>枚举值：</p><ul><li>4hours： 按创建时间开始的每 4 小时</li><li>daily： 每日</li><li>weekly： 每周</li></ul>
     * @param SyncPolicy <p>定时同步的策略</p><p>枚举值：</p><ul><li>4hours： 按创建时间开始的每 4 小时</li><li>daily： 每日</li><li>weekly： 每周</li></ul>
     */
    public void setSyncPolicy(String SyncPolicy) {
        this.SyncPolicy = SyncPolicy;
    }

    /**
     * Get <p>JSON 字符串，针对不同类型的同步策略，提取对应不同的值</p> 
     * @return SyncPolicyParams <p>JSON 字符串，针对不同类型的同步策略，提取对应不同的值</p>
     */
    public String getSyncPolicyParams() {
        return this.SyncPolicyParams;
    }

    /**
     * Set <p>JSON 字符串，针对不同类型的同步策略，提取对应不同的值</p>
     * @param SyncPolicyParams <p>JSON 字符串，针对不同类型的同步策略，提取对应不同的值</p>
     */
    public void setSyncPolicyParams(String SyncPolicyParams) {
        this.SyncPolicyParams = SyncPolicyParams;
    }

    /**
     * Get <p>是否配置了同步创建认证配置</p> 
     * @return CreateAuthConfig <p>是否配置了同步创建认证配置</p>
     */
    public Boolean getCreateAuthConfig() {
        return this.CreateAuthConfig;
    }

    /**
     * Set <p>是否配置了同步创建认证配置</p>
     * @param CreateAuthConfig <p>是否配置了同步创建认证配置</p>
     */
    public void setCreateAuthConfig(Boolean CreateAuthConfig) {
        this.CreateAuthConfig = CreateAuthConfig;
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
     * Get <p>对应 Config 的配置 ID</p> 
     * @return SourceId <p>对应 Config 的配置 ID</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>对应 Config 的配置 ID</p>
     * @param SourceId <p>对应 Config 的配置 ID</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>是否在登录页展示</p> 
     * @return DisplayOnLoginPage <p>是否在登录页展示</p>
     */
    public Boolean getDisplayOnLoginPage() {
        return this.DisplayOnLoginPage;
    }

    /**
     * Set <p>是否在登录页展示</p>
     * @param DisplayOnLoginPage <p>是否在登录页展示</p>
     */
    public void setDisplayOnLoginPage(Boolean DisplayOnLoginPage) {
        this.DisplayOnLoginPage = DisplayOnLoginPage;
    }

    public DirectoryConfigData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectoryConfigData(DirectoryConfigData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.SyncEnable != null) {
            this.SyncEnable = new Boolean(source.SyncEnable);
        }
        if (source.SyncPolicy != null) {
            this.SyncPolicy = new String(source.SyncPolicy);
        }
        if (source.SyncPolicyParams != null) {
            this.SyncPolicyParams = new String(source.SyncPolicyParams);
        }
        if (source.CreateAuthConfig != null) {
            this.CreateAuthConfig = new Boolean(source.CreateAuthConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.DisplayOnLoginPage != null) {
            this.DisplayOnLoginPage = new Boolean(source.DisplayOnLoginPage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "SyncEnable", this.SyncEnable);
        this.setParamSimple(map, prefix + "SyncPolicy", this.SyncPolicy);
        this.setParamSimple(map, prefix + "SyncPolicyParams", this.SyncPolicyParams);
        this.setParamSimple(map, prefix + "CreateAuthConfig", this.CreateAuthConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "DisplayOnLoginPage", this.DisplayOnLoginPage);

    }
}

