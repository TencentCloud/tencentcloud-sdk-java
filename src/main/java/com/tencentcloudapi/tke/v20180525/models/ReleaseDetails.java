/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseDetails extends AbstractModel {

    /**
    * 应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用所在命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 应用当前版本
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 应用状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 应用描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 应用提示
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * 用户自定义参数
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 应用资源详情
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * 应用制品版本
    */
    @SerializedName("ChartVersion")
    @Expose
    private String ChartVersion;

    /**
    * 应用制品名称
    */
    @SerializedName("ChartName")
    @Expose
    private String ChartName;

    /**
    * 应用制品描述
    */
    @SerializedName("ChartDescription")
    @Expose
    private String ChartDescription;

    /**
    * 应用制品app版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 应用首次部署时间
    */
    @SerializedName("FirstDeployedTime")
    @Expose
    private String FirstDeployedTime;

    /**
    * 应用最近部署时间
    */
    @SerializedName("LastDeployedTime")
    @Expose
    private String LastDeployedTime;

    /**
    * 应用参数
    */
    @SerializedName("ComputedValues")
    @Expose
    private String ComputedValues;

    /**
    * chart 的来源， tke-market, others
    */
    @SerializedName("ChartFrom")
    @Expose
    private String ChartFrom;

    /**
    * 第三方chart 的安装地址
    */
    @SerializedName("ChartURL")
    @Expose
    private String ChartURL;

    /**
    * 通过chart 创建的资源
    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
     * Get 应用名称 
     * @return Name 应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
     * @param Name 应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用所在命名空间 
     * @return Namespace 应用所在命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 应用所在命名空间
     * @param Namespace 应用所在命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 应用当前版本 
     * @return Version 应用当前版本
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 应用当前版本
     * @param Version 应用当前版本
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 应用状态 
     * @return Status 应用状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 应用状态
     * @param Status 应用状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 应用描述 
     * @return Description 应用描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 应用描述
     * @param Description 应用描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 应用提示 
     * @return Notes 应用提示
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 应用提示
     * @param Notes 应用提示
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get 用户自定义参数 
     * @return Config 用户自定义参数
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 用户自定义参数
     * @param Config 用户自定义参数
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 应用资源详情 
     * @return Manifest 应用资源详情
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set 应用资源详情
     * @param Manifest 应用资源详情
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get 应用制品版本 
     * @return ChartVersion 应用制品版本
     */
    public String getChartVersion() {
        return this.ChartVersion;
    }

    /**
     * Set 应用制品版本
     * @param ChartVersion 应用制品版本
     */
    public void setChartVersion(String ChartVersion) {
        this.ChartVersion = ChartVersion;
    }

    /**
     * Get 应用制品名称 
     * @return ChartName 应用制品名称
     */
    public String getChartName() {
        return this.ChartName;
    }

    /**
     * Set 应用制品名称
     * @param ChartName 应用制品名称
     */
    public void setChartName(String ChartName) {
        this.ChartName = ChartName;
    }

    /**
     * Get 应用制品描述 
     * @return ChartDescription 应用制品描述
     */
    public String getChartDescription() {
        return this.ChartDescription;
    }

    /**
     * Set 应用制品描述
     * @param ChartDescription 应用制品描述
     */
    public void setChartDescription(String ChartDescription) {
        this.ChartDescription = ChartDescription;
    }

    /**
     * Get 应用制品app版本 
     * @return AppVersion 应用制品app版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 应用制品app版本
     * @param AppVersion 应用制品app版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 应用首次部署时间 
     * @return FirstDeployedTime 应用首次部署时间
     */
    public String getFirstDeployedTime() {
        return this.FirstDeployedTime;
    }

    /**
     * Set 应用首次部署时间
     * @param FirstDeployedTime 应用首次部署时间
     */
    public void setFirstDeployedTime(String FirstDeployedTime) {
        this.FirstDeployedTime = FirstDeployedTime;
    }

    /**
     * Get 应用最近部署时间 
     * @return LastDeployedTime 应用最近部署时间
     */
    public String getLastDeployedTime() {
        return this.LastDeployedTime;
    }

    /**
     * Set 应用最近部署时间
     * @param LastDeployedTime 应用最近部署时间
     */
    public void setLastDeployedTime(String LastDeployedTime) {
        this.LastDeployedTime = LastDeployedTime;
    }

    /**
     * Get 应用参数 
     * @return ComputedValues 应用参数
     */
    public String getComputedValues() {
        return this.ComputedValues;
    }

    /**
     * Set 应用参数
     * @param ComputedValues 应用参数
     */
    public void setComputedValues(String ComputedValues) {
        this.ComputedValues = ComputedValues;
    }

    /**
     * Get chart 的来源， tke-market, others 
     * @return ChartFrom chart 的来源， tke-market, others
     */
    public String getChartFrom() {
        return this.ChartFrom;
    }

    /**
     * Set chart 的来源， tke-market, others
     * @param ChartFrom chart 的来源， tke-market, others
     */
    public void setChartFrom(String ChartFrom) {
        this.ChartFrom = ChartFrom;
    }

    /**
     * Get 第三方chart 的安装地址 
     * @return ChartURL 第三方chart 的安装地址
     */
    public String getChartURL() {
        return this.ChartURL;
    }

    /**
     * Set 第三方chart 的安装地址
     * @param ChartURL 第三方chart 的安装地址
     */
    public void setChartURL(String ChartURL) {
        this.ChartURL = ChartURL;
    }

    /**
     * Get 通过chart 创建的资源 
     * @return Resources 通过chart 创建的资源
     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set 通过chart 创建的资源
     * @param Resources 通过chart 创建的资源
     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    public ReleaseDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseDetails(ReleaseDetails source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.ChartVersion != null) {
            this.ChartVersion = new String(source.ChartVersion);
        }
        if (source.ChartName != null) {
            this.ChartName = new String(source.ChartName);
        }
        if (source.ChartDescription != null) {
            this.ChartDescription = new String(source.ChartDescription);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.FirstDeployedTime != null) {
            this.FirstDeployedTime = new String(source.FirstDeployedTime);
        }
        if (source.LastDeployedTime != null) {
            this.LastDeployedTime = new String(source.LastDeployedTime);
        }
        if (source.ComputedValues != null) {
            this.ComputedValues = new String(source.ComputedValues);
        }
        if (source.ChartFrom != null) {
            this.ChartFrom = new String(source.ChartFrom);
        }
        if (source.ChartURL != null) {
            this.ChartURL = new String(source.ChartURL);
        }
        if (source.Resources != null) {
            this.Resources = new String(source.Resources);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "ChartVersion", this.ChartVersion);
        this.setParamSimple(map, prefix + "ChartName", this.ChartName);
        this.setParamSimple(map, prefix + "ChartDescription", this.ChartDescription);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "FirstDeployedTime", this.FirstDeployedTime);
        this.setParamSimple(map, prefix + "LastDeployedTime", this.LastDeployedTime);
        this.setParamSimple(map, prefix + "ComputedValues", this.ComputedValues);
        this.setParamSimple(map, prefix + "ChartFrom", this.ChartFrom);
        this.setParamSimple(map, prefix + "ChartURL", this.ChartURL);
        this.setParamSimple(map, prefix + "Resources", this.Resources);

    }
}

