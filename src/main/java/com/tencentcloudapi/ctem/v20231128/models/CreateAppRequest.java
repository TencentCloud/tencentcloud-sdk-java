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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppRequest extends AbstractModel {

    /**
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 移动端名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 图片地址
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * 平台，ios或android
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 下载地址
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 安装包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 开发者
    */
    @SerializedName("Developer")
    @Expose
    private String Developer;

    /**
    * 移动端地址
    */
    @SerializedName("ServerUrl")
    @Expose
    private String ServerUrl;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 子公司ID
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 移动端名称 
     * @return Name 移动端名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 移动端名称
     * @param Name 移动端名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 图片地址 
     * @return Logo 图片地址
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 图片地址
     * @param Logo 图片地址
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 平台，ios或android 
     * @return Platform 平台，ios或android
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台，ios或android
     * @param Platform 平台，ios或android
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 版本 
     * @return AppVersion 版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 版本
     * @param AppVersion 版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 下载地址 
     * @return DownloadUrl 下载地址
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 下载地址
     * @param DownloadUrl 下载地址
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 安装包名 
     * @return PackageName 安装包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 安装包名
     * @param PackageName 安装包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 开发者 
     * @return Developer 开发者
     */
    public String getDeveloper() {
        return this.Developer;
    }

    /**
     * Set 开发者
     * @param Developer 开发者
     */
    public void setDeveloper(String Developer) {
        this.Developer = Developer;
    }

    /**
     * Get 移动端地址 
     * @return ServerUrl 移动端地址
     */
    public String getServerUrl() {
        return this.ServerUrl;
    }

    /**
     * Set 移动端地址
     * @param ServerUrl 移动端地址
     */
    public void setServerUrl(String ServerUrl) {
        this.ServerUrl = ServerUrl;
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
     * Get 子公司ID 
     * @return EnterpriseUid 子公司ID
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司ID
     * @param EnterpriseUid 子公司ID
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    public CreateAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppRequest(CreateAppRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.Developer != null) {
            this.Developer = new String(source.Developer);
        }
        if (source.ServerUrl != null) {
            this.ServerUrl = new String(source.ServerUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Developer", this.Developer);
        this.setParamSimple(map, prefix + "ServerUrl", this.ServerUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);

    }
}

