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

public class CreateCompanyDirectoryConfigRequest extends AbstractModel {

    /**
    * <p>企业目录类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>企业目录名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>配置是通过 SM2 加密再 Hex 之后的数据</p>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * <p>是否开启定时同步</p>
    */
    @SerializedName("SyncEnable")
    @Expose
    private Boolean SyncEnable;

    /**
    * <p>定时同步的策略，枚举值：支持每4小时（4hours）/每日定时（daily）/每周定时（weekly）</p>
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
    * <p>是否同步创建认证源</p>
    */
    @SerializedName("CreateAuthConfig")
    @Expose
    private Boolean CreateAuthConfig;

    /**
    * <p>是否在登录页展示</p>
    */
    @SerializedName("DisplayOnLoginPage")
    @Expose
    private Boolean DisplayOnLoginPage;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>使用场景：API 创建，快速上手，普通配置等</p>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
     * Get <p>企业目录类型</p> 
     * @return Type <p>企业目录类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>企业目录类型</p>
     * @param Type <p>企业目录类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>企业目录名</p> 
     * @return Name <p>企业目录名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>企业目录名</p>
     * @param Name <p>企业目录名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>配置是通过 SM2 加密再 Hex 之后的数据</p> 
     * @return Config <p>配置是通过 SM2 加密再 Hex 之后的数据</p>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>配置是通过 SM2 加密再 Hex 之后的数据</p>
     * @param Config <p>配置是通过 SM2 加密再 Hex 之后的数据</p>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get <p>是否开启定时同步</p> 
     * @return SyncEnable <p>是否开启定时同步</p>
     */
    public Boolean getSyncEnable() {
        return this.SyncEnable;
    }

    /**
     * Set <p>是否开启定时同步</p>
     * @param SyncEnable <p>是否开启定时同步</p>
     */
    public void setSyncEnable(Boolean SyncEnable) {
        this.SyncEnable = SyncEnable;
    }

    /**
     * Get <p>定时同步的策略，枚举值：支持每4小时（4hours）/每日定时（daily）/每周定时（weekly）</p> 
     * @return SyncPolicy <p>定时同步的策略，枚举值：支持每4小时（4hours）/每日定时（daily）/每周定时（weekly）</p>
     */
    public String getSyncPolicy() {
        return this.SyncPolicy;
    }

    /**
     * Set <p>定时同步的策略，枚举值：支持每4小时（4hours）/每日定时（daily）/每周定时（weekly）</p>
     * @param SyncPolicy <p>定时同步的策略，枚举值：支持每4小时（4hours）/每日定时（daily）/每周定时（weekly）</p>
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
     * Get <p>是否同步创建认证源</p> 
     * @return CreateAuthConfig <p>是否同步创建认证源</p>
     */
    public Boolean getCreateAuthConfig() {
        return this.CreateAuthConfig;
    }

    /**
     * Set <p>是否同步创建认证源</p>
     * @param CreateAuthConfig <p>是否同步创建认证源</p>
     */
    public void setCreateAuthConfig(Boolean CreateAuthConfig) {
        this.CreateAuthConfig = CreateAuthConfig;
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
     * Get <p>使用场景：API 创建，快速上手，普通配置等</p> 
     * @return Scene <p>使用场景：API 创建，快速上手，普通配置等</p>
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>使用场景：API 创建，快速上手，普通配置等</p>
     * @param Scene <p>使用场景：API 创建，快速上手，普通配置等</p>
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    public CreateCompanyDirectoryConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCompanyDirectoryConfigRequest(CreateCompanyDirectoryConfigRequest source) {
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
        if (source.DisplayOnLoginPage != null) {
            this.DisplayOnLoginPage = new Boolean(source.DisplayOnLoginPage);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "SyncEnable", this.SyncEnable);
        this.setParamSimple(map, prefix + "SyncPolicy", this.SyncPolicy);
        this.setParamSimple(map, prefix + "SyncPolicyParams", this.SyncPolicyParams);
        this.setParamSimple(map, prefix + "CreateAuthConfig", this.CreateAuthConfig);
        this.setParamSimple(map, prefix + "DisplayOnLoginPage", this.DisplayOnLoginPage);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Scene", this.Scene);

    }
}

