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
    * <p>主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>公共字段</p>
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * <p>IP或域名地址</p>
    */
    @SerializedName("Asset")
    @Expose
    private String Asset;

    /**
    * <p>解析的IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>是否高危</p>
    */
    @SerializedName("IsHighRisk")
    @Expose
    private Boolean IsHighRisk;

    /**
    * <p>组件名称</p>
    */
    @SerializedName("App")
    @Expose
    private String App;

    /**
    * <p>服务名称</p>
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * <p>端口响应详情</p>
    */
    @SerializedName("Banner")
    @Expose
    private String Banner;

    /**
    * <p>上次检测时间</p>
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * <p>状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否为云资产：0-非云资产 1-是云资产</p>
    */
    @SerializedName("IsCloudAsset")
    @Expose
    private Long IsCloudAsset;

    /**
    * <p>云资产是否下线：-1-已下线 0-正常</p>
    */
    @SerializedName("CloudAssetStatus")
    @Expose
    private Long CloudAssetStatus;

    /**
    * <p>域名解析状态 1:异常 0:正常</p>
    */
    @SerializedName("AnalysisState")
    @Expose
    private Long AnalysisState;

    /**
    * <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
    */
    @SerializedName("AggregationCount")
    @Expose
    private Long AggregationCount;

    /**
     * Get <p>主键ID</p> 
     * @return Id <p>主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键ID</p>
     * @param Id <p>主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>公共字段</p> 
     * @return DisplayToolCommon <p>公共字段</p>
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set <p>公共字段</p>
     * @param DisplayToolCommon <p>公共字段</p>
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get <p>IP或域名地址</p> 
     * @return Asset <p>IP或域名地址</p>
     */
    public String getAsset() {
        return this.Asset;
    }

    /**
     * Set <p>IP或域名地址</p>
     * @param Asset <p>IP或域名地址</p>
     */
    public void setAsset(String Asset) {
        this.Asset = Asset;
    }

    /**
     * Get <p>解析的IP</p> 
     * @return Ip <p>解析的IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>解析的IP</p>
     * @param Ip <p>解析的IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>端口</p> 
     * @return Port <p>端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口</p>
     * @param Port <p>端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>是否高危</p> 
     * @return IsHighRisk <p>是否高危</p>
     */
    public Boolean getIsHighRisk() {
        return this.IsHighRisk;
    }

    /**
     * Set <p>是否高危</p>
     * @param IsHighRisk <p>是否高危</p>
     */
    public void setIsHighRisk(Boolean IsHighRisk) {
        this.IsHighRisk = IsHighRisk;
    }

    /**
     * Get <p>组件名称</p> 
     * @return App <p>组件名称</p>
     */
    public String getApp() {
        return this.App;
    }

    /**
     * Set <p>组件名称</p>
     * @param App <p>组件名称</p>
     */
    public void setApp(String App) {
        this.App = App;
    }

    /**
     * Get <p>服务名称</p> 
     * @return Service <p>服务名称</p>
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set <p>服务名称</p>
     * @param Service <p>服务名称</p>
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get <p>端口响应详情</p> 
     * @return Banner <p>端口响应详情</p>
     */
    public String getBanner() {
        return this.Banner;
    }

    /**
     * Set <p>端口响应详情</p>
     * @param Banner <p>端口响应详情</p>
     */
    public void setBanner(String Banner) {
        this.Banner = Banner;
    }

    /**
     * Get <p>上次检测时间</p> 
     * @return LastCheckTime <p>上次检测时间</p>
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set <p>上次检测时间</p>
     * @param LastCheckTime <p>上次检测时间</p>
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get <p>状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略</p> 
     * @return Status <p>状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略</p>
     * @param Status <p>状态，close:连接超时，端口可能已关闭，open:端口开放, checking:复测中, ignore:已忽略</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否为云资产：0-非云资产 1-是云资产</p> 
     * @return IsCloudAsset <p>是否为云资产：0-非云资产 1-是云资产</p>
     */
    public Long getIsCloudAsset() {
        return this.IsCloudAsset;
    }

    /**
     * Set <p>是否为云资产：0-非云资产 1-是云资产</p>
     * @param IsCloudAsset <p>是否为云资产：0-非云资产 1-是云资产</p>
     */
    public void setIsCloudAsset(Long IsCloudAsset) {
        this.IsCloudAsset = IsCloudAsset;
    }

    /**
     * Get <p>云资产是否下线：-1-已下线 0-正常</p> 
     * @return CloudAssetStatus <p>云资产是否下线：-1-已下线 0-正常</p>
     */
    public Long getCloudAssetStatus() {
        return this.CloudAssetStatus;
    }

    /**
     * Set <p>云资产是否下线：-1-已下线 0-正常</p>
     * @param CloudAssetStatus <p>云资产是否下线：-1-已下线 0-正常</p>
     */
    public void setCloudAssetStatus(Long CloudAssetStatus) {
        this.CloudAssetStatus = CloudAssetStatus;
    }

    /**
     * Get <p>域名解析状态 1:异常 0:正常</p> 
     * @return AnalysisState <p>域名解析状态 1:异常 0:正常</p>
     */
    public Long getAnalysisState() {
        return this.AnalysisState;
    }

    /**
     * Set <p>域名解析状态 1:异常 0:正常</p>
     * @param AnalysisState <p>域名解析状态 1:异常 0:正常</p>
     */
    public void setAnalysisState(Long AnalysisState) {
        this.AnalysisState = AnalysisState;
    }

    /**
     * Get <p>聚合视角下该组真实子项总数；非聚合视角为 0</p> 
     * @return AggregationCount <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     */
    public Long getAggregationCount() {
        return this.AggregationCount;
    }

    /**
     * Set <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     * @param AggregationCount <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     */
    public void setAggregationCount(Long AggregationCount) {
        this.AggregationCount = AggregationCount;
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
        if (source.IsCloudAsset != null) {
            this.IsCloudAsset = new Long(source.IsCloudAsset);
        }
        if (source.CloudAssetStatus != null) {
            this.CloudAssetStatus = new Long(source.CloudAssetStatus);
        }
        if (source.AnalysisState != null) {
            this.AnalysisState = new Long(source.AnalysisState);
        }
        if (source.AggregationCount != null) {
            this.AggregationCount = new Long(source.AggregationCount);
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
        this.setParamSimple(map, prefix + "IsCloudAsset", this.IsCloudAsset);
        this.setParamSimple(map, prefix + "CloudAssetStatus", this.CloudAssetStatus);
        this.setParamSimple(map, prefix + "AnalysisState", this.AnalysisState);
        this.setParamSimple(map, prefix + "AggregationCount", this.AggregationCount);

    }
}

