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

public class DisplayApp extends AbstractModel {

    /**
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * APP名称
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
    * 开发者
    */
    @SerializedName("Developer")
    @Expose
    private String Developer;

    /**
    * 下载地址
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 图片
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * 包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 平台
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 服务端地址
    */
    @SerializedName("ServerUrl")
    @Expose
    private String ServerUrl;

    /**
    * app版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get APP名称 
     * @return Name APP名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set APP名称
     * @param Name APP名称
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
     * Get 图片 
     * @return Logo 图片
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 图片
     * @param Logo 图片
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 包名 
     * @return PackageName 包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 包名
     * @param PackageName 包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 平台 
     * @return Platform 平台
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台
     * @param Platform 平台
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 服务端地址 
     * @return ServerUrl 服务端地址
     */
    public String getServerUrl() {
        return this.ServerUrl;
    }

    /**
     * Set 服务端地址
     * @param ServerUrl 服务端地址
     */
    public void setServerUrl(String ServerUrl) {
        this.ServerUrl = ServerUrl;
    }

    /**
     * Get app版本 
     * @return AppVersion app版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set app版本
     * @param AppVersion app版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    public DisplayApp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayApp(DisplayApp source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Developer != null) {
            this.Developer = new String(source.Developer);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ServerUrl != null) {
            this.ServerUrl = new String(source.ServerUrl);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Developer", this.Developer);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ServerUrl", this.ServerUrl);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);

    }
}

