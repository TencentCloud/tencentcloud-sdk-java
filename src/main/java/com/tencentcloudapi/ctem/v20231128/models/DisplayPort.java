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

public class DisplayPort extends AbstractModel {

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
    * IP或域名地址
    */
    @SerializedName("Asset")
    @Expose
    private String Asset;

    /**
    * 解析的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 是否高危
    */
    @SerializedName("IsHighRisk")
    @Expose
    private Boolean IsHighRisk;

    /**
    * 组件名称
    */
    @SerializedName("App")
    @Expose
    private String App;

    /**
    * 服务名称
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 端口响应详情
    */
    @SerializedName("Banner")
    @Expose
    private String Banner;

    /**
    * 上次检测时间
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * 状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get IP或域名地址 
     * @return Asset IP或域名地址
     */
    public String getAsset() {
        return this.Asset;
    }

    /**
     * Set IP或域名地址
     * @param Asset IP或域名地址
     */
    public void setAsset(String Asset) {
        this.Asset = Asset;
    }

    /**
     * Get 解析的IP 
     * @return Ip 解析的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 解析的IP
     * @param Ip 解析的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 是否高危 
     * @return IsHighRisk 是否高危
     */
    public Boolean getIsHighRisk() {
        return this.IsHighRisk;
    }

    /**
     * Set 是否高危
     * @param IsHighRisk 是否高危
     */
    public void setIsHighRisk(Boolean IsHighRisk) {
        this.IsHighRisk = IsHighRisk;
    }

    /**
     * Get 组件名称 
     * @return App 组件名称
     */
    public String getApp() {
        return this.App;
    }

    /**
     * Set 组件名称
     * @param App 组件名称
     */
    public void setApp(String App) {
        this.App = App;
    }

    /**
     * Get 服务名称 
     * @return Service 服务名称
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务名称
     * @param Service 服务名称
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 端口响应详情 
     * @return Banner 端口响应详情
     */
    public String getBanner() {
        return this.Banner;
    }

    /**
     * Set 端口响应详情
     * @param Banner 端口响应详情
     */
    public void setBanner(String Banner) {
        this.Banner = Banner;
    }

    /**
     * Get 上次检测时间 
     * @return LastCheckTime 上次检测时间
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 上次检测时间
     * @param LastCheckTime 上次检测时间
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get 状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略 
     * @return Status 状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略
     * @param Status 状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DisplayPort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayPort(DisplayPort source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Asset != null) {
            this.Asset = new String(source.Asset);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.IsHighRisk != null) {
            this.IsHighRisk = new Boolean(source.IsHighRisk);
        }
        if (source.App != null) {
            this.App = new String(source.App);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Banner != null) {
            this.Banner = new String(source.Banner);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Asset", this.Asset);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "IsHighRisk", this.IsHighRisk);
        this.setParamSimple(map, prefix + "App", this.App);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Banner", this.Banner);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

