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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MarketComponentInfo extends AbstractModel {

    /**
    * 组件ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 组件名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 发布者
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 发布时间
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * 组件简介
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * 指向详细描述的url
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 图标链接
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 组件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 组件可视化信息
    */
    @SerializedName("WorkloadVisualConfig")
    @Expose
    private String WorkloadVisualConfig;

    /**
    * 无
    */
    @SerializedName("DetailUrl")
    @Expose
    private String DetailUrl;

    /**
    * 无
    */
    @SerializedName("Installed")
    @Expose
    private Boolean Installed;

    /**
     * Get 组件ID 
     * @return ID 组件ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 组件ID
     * @param ID 组件ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 组件名称 
     * @return AppName 组件名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 组件名称
     * @param AppName 组件名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 发布者 
     * @return Author 发布者
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 发布者
     * @param Author 发布者
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 发布时间 
     * @return ReleaseTime 发布时间
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 发布时间
     * @param ReleaseTime 发布时间
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get 组件简介 
     * @return Outline 组件简介
     */
    public String getOutline() {
        return this.Outline;
    }

    /**
     * Set 组件简介
     * @param Outline 组件简介
     */
    public void setOutline(String Outline) {
        this.Outline = Outline;
    }

    /**
     * Get 指向详细描述的url 
     * @return Detail 指向详细描述的url
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 指向详细描述的url
     * @param Detail 指向详细描述的url
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 图标链接 
     * @return Icon 图标链接
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 图标链接
     * @param Icon 图标链接
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 组件版本 
     * @return Version 组件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 组件版本
     * @param Version 组件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 组件可视化信息 
     * @return WorkloadVisualConfig 组件可视化信息
     */
    public String getWorkloadVisualConfig() {
        return this.WorkloadVisualConfig;
    }

    /**
     * Set 组件可视化信息
     * @param WorkloadVisualConfig 组件可视化信息
     */
    public void setWorkloadVisualConfig(String WorkloadVisualConfig) {
        this.WorkloadVisualConfig = WorkloadVisualConfig;
    }

    /**
     * Get 无 
     * @return DetailUrl 无
     */
    public String getDetailUrl() {
        return this.DetailUrl;
    }

    /**
     * Set 无
     * @param DetailUrl 无
     */
    public void setDetailUrl(String DetailUrl) {
        this.DetailUrl = DetailUrl;
    }

    /**
     * Get 无 
     * @return Installed 无
     */
    public Boolean getInstalled() {
        return this.Installed;
    }

    /**
     * Set 无
     * @param Installed 无
     */
    public void setInstalled(Boolean Installed) {
        this.Installed = Installed;
    }

    public MarketComponentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MarketComponentInfo(MarketComponentInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.Outline != null) {
            this.Outline = new String(source.Outline);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.WorkloadVisualConfig != null) {
            this.WorkloadVisualConfig = new String(source.WorkloadVisualConfig);
        }
        if (source.DetailUrl != null) {
            this.DetailUrl = new String(source.DetailUrl);
        }
        if (source.Installed != null) {
            this.Installed = new Boolean(source.Installed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "Outline", this.Outline);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "WorkloadVisualConfig", this.WorkloadVisualConfig);
        this.setParamSimple(map, prefix + "DetailUrl", this.DetailUrl);
        this.setParamSimple(map, prefix + "Installed", this.Installed);

    }
}

