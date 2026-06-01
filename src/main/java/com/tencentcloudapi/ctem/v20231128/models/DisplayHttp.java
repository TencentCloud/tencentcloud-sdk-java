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

public class DisplayHttp extends AbstractModel {

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
    * <p>Url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>报文长度</p>
    */
    @SerializedName("ContentLength")
    @Expose
    private Long ContentLength;

    /**
    * <p>报文内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>截图缩略图URL</p>
    */
    @SerializedName("ScreenshotThumbUrl")
    @Expose
    private String ScreenshotThumbUrl;

    /**
    * <p>截图URL</p>
    */
    @SerializedName("ScreenshotUrl")
    @Expose
    private String ScreenshotUrl;

    /**
    * <p>状态码</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>Api地址</p>
    */
    @SerializedName("Api")
    @Expose
    private String Api;

    /**
    * <p>解析的IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>证书信息</p>
    */
    @SerializedName("Ssl")
    @Expose
    private String Ssl;

    /**
    * <p>ssl证书过期时间</p>
    */
    @SerializedName("SslExpiredTime")
    @Expose
    private String SslExpiredTime;

    /**
    * <p>资产是否发生变动</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsChange")
    @Expose
    private Boolean IsChange;

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
    * <p>可用率（百分比）</p>
    */
    @SerializedName("AvailabilityRate")
    @Expose
    private Long AvailabilityRate;

    /**
    * <p>可用状态 1:异常 0:正常</p>
    */
    @SerializedName("AvailabilityState")
    @Expose
    private Long AvailabilityState;

    /**
    * <p>平均响应时间：单位ms</p>
    */
    @SerializedName("ResponseTime")
    @Expose
    private Long ResponseTime;

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
     * Get <p>Url</p> 
     * @return Url <p>Url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Url</p>
     * @param Url <p>Url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>标题</p> 
     * @return Title <p>标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>标题</p>
     * @param Title <p>标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>报文长度</p> 
     * @return ContentLength <p>报文长度</p>
     */
    public Long getContentLength() {
        return this.ContentLength;
    }

    /**
     * Set <p>报文长度</p>
     * @param ContentLength <p>报文长度</p>
     */
    public void setContentLength(Long ContentLength) {
        this.ContentLength = ContentLength;
    }

    /**
     * Get <p>报文内容</p> 
     * @return Content <p>报文内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>报文内容</p>
     * @param Content <p>报文内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>截图缩略图URL</p> 
     * @return ScreenshotThumbUrl <p>截图缩略图URL</p>
     */
    public String getScreenshotThumbUrl() {
        return this.ScreenshotThumbUrl;
    }

    /**
     * Set <p>截图缩略图URL</p>
     * @param ScreenshotThumbUrl <p>截图缩略图URL</p>
     */
    public void setScreenshotThumbUrl(String ScreenshotThumbUrl) {
        this.ScreenshotThumbUrl = ScreenshotThumbUrl;
    }

    /**
     * Get <p>截图URL</p> 
     * @return ScreenshotUrl <p>截图URL</p>
     */
    public String getScreenshotUrl() {
        return this.ScreenshotUrl;
    }

    /**
     * Set <p>截图URL</p>
     * @param ScreenshotUrl <p>截图URL</p>
     */
    public void setScreenshotUrl(String ScreenshotUrl) {
        this.ScreenshotUrl = ScreenshotUrl;
    }

    /**
     * Get <p>状态码</p> 
     * @return Code <p>状态码</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>状态码</p>
     * @param Code <p>状态码</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>Api地址</p> 
     * @return Api <p>Api地址</p>
     */
    public String getApi() {
        return this.Api;
    }

    /**
     * Set <p>Api地址</p>
     * @param Api <p>Api地址</p>
     */
    public void setApi(String Api) {
        this.Api = Api;
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
     * Get <p>证书信息</p> 
     * @return Ssl <p>证书信息</p>
     */
    public String getSsl() {
        return this.Ssl;
    }

    /**
     * Set <p>证书信息</p>
     * @param Ssl <p>证书信息</p>
     */
    public void setSsl(String Ssl) {
        this.Ssl = Ssl;
    }

    /**
     * Get <p>ssl证书过期时间</p> 
     * @return SslExpiredTime <p>ssl证书过期时间</p>
     */
    public String getSslExpiredTime() {
        return this.SslExpiredTime;
    }

    /**
     * Set <p>ssl证书过期时间</p>
     * @param SslExpiredTime <p>ssl证书过期时间</p>
     */
    public void setSslExpiredTime(String SslExpiredTime) {
        this.SslExpiredTime = SslExpiredTime;
    }

    /**
     * Get <p>资产是否发生变动</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsChange <p>资产是否发生变动</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsChange() {
        return this.IsChange;
    }

    /**
     * Set <p>资产是否发生变动</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsChange <p>资产是否发生变动</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsChange(Boolean IsChange) {
        this.IsChange = IsChange;
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
     * Get <p>可用率（百分比）</p> 
     * @return AvailabilityRate <p>可用率（百分比）</p>
     */
    public Long getAvailabilityRate() {
        return this.AvailabilityRate;
    }

    /**
     * Set <p>可用率（百分比）</p>
     * @param AvailabilityRate <p>可用率（百分比）</p>
     */
    public void setAvailabilityRate(Long AvailabilityRate) {
        this.AvailabilityRate = AvailabilityRate;
    }

    /**
     * Get <p>可用状态 1:异常 0:正常</p> 
     * @return AvailabilityState <p>可用状态 1:异常 0:正常</p>
     */
    public Long getAvailabilityState() {
        return this.AvailabilityState;
    }

    /**
     * Set <p>可用状态 1:异常 0:正常</p>
     * @param AvailabilityState <p>可用状态 1:异常 0:正常</p>
     */
    public void setAvailabilityState(Long AvailabilityState) {
        this.AvailabilityState = AvailabilityState;
    }

    /**
     * Get <p>平均响应时间：单位ms</p> 
     * @return ResponseTime <p>平均响应时间：单位ms</p>
     */
    public Long getResponseTime() {
        return this.ResponseTime;
    }

    /**
     * Set <p>平均响应时间：单位ms</p>
     * @param ResponseTime <p>平均响应时间：单位ms</p>
     */
    public void setResponseTime(Long ResponseTime) {
        this.ResponseTime = ResponseTime;
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

    public DisplayHttp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayHttp(DisplayHttp source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.ContentLength != null) {
            this.ContentLength = new Long(source.ContentLength);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ScreenshotThumbUrl != null) {
            this.ScreenshotThumbUrl = new String(source.ScreenshotThumbUrl);
        }
        if (source.ScreenshotUrl != null) {
            this.ScreenshotUrl = new String(source.ScreenshotUrl);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Api != null) {
            this.Api = new String(source.Api);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Ssl != null) {
            this.Ssl = new String(source.Ssl);
        }
        if (source.SslExpiredTime != null) {
            this.SslExpiredTime = new String(source.SslExpiredTime);
        }
        if (source.IsChange != null) {
            this.IsChange = new Boolean(source.IsChange);
        }
        if (source.IsCloudAsset != null) {
            this.IsCloudAsset = new Long(source.IsCloudAsset);
        }
        if (source.CloudAssetStatus != null) {
            this.CloudAssetStatus = new Long(source.CloudAssetStatus);
        }
        if (source.AvailabilityRate != null) {
            this.AvailabilityRate = new Long(source.AvailabilityRate);
        }
        if (source.AvailabilityState != null) {
            this.AvailabilityState = new Long(source.AvailabilityState);
        }
        if (source.ResponseTime != null) {
            this.ResponseTime = new Long(source.ResponseTime);
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
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "ContentLength", this.ContentLength);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ScreenshotThumbUrl", this.ScreenshotThumbUrl);
        this.setParamSimple(map, prefix + "ScreenshotUrl", this.ScreenshotUrl);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Api", this.Api);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Ssl", this.Ssl);
        this.setParamSimple(map, prefix + "SslExpiredTime", this.SslExpiredTime);
        this.setParamSimple(map, prefix + "IsChange", this.IsChange);
        this.setParamSimple(map, prefix + "IsCloudAsset", this.IsCloudAsset);
        this.setParamSimple(map, prefix + "CloudAssetStatus", this.CloudAssetStatus);
        this.setParamSimple(map, prefix + "AvailabilityRate", this.AvailabilityRate);
        this.setParamSimple(map, prefix + "AvailabilityState", this.AvailabilityState);
        this.setParamSimple(map, prefix + "ResponseTime", this.ResponseTime);
        this.setParamSimple(map, prefix + "AnalysisState", this.AnalysisState);
        this.setParamSimple(map, prefix + "AggregationCount", this.AggregationCount);

    }
}

