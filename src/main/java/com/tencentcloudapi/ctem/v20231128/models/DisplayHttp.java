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
    * Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 报文长度
    */
    @SerializedName("ContentLength")
    @Expose
    private Long ContentLength;

    /**
    * 报文内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 截图缩略图URL
    */
    @SerializedName("ScreenshotThumbUrl")
    @Expose
    private String ScreenshotThumbUrl;

    /**
    * 截图URL
    */
    @SerializedName("ScreenshotUrl")
    @Expose
    private String ScreenshotUrl;

    /**
    * 状态码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Api地址
    */
    @SerializedName("Api")
    @Expose
    private String Api;

    /**
    * 解析的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 证书信息
    */
    @SerializedName("Ssl")
    @Expose
    private String Ssl;

    /**
    * ssl证书过期时间
    */
    @SerializedName("SslExpiredTime")
    @Expose
    private String SslExpiredTime;

    /**
    * 资产是否发生变动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsChange")
    @Expose
    private Boolean IsChange;

    /**
    * 是否为云资产：0-非云资产 1-是云资产
    */
    @SerializedName("IsCloudAsset")
    @Expose
    private Long IsCloudAsset;

    /**
    * 云资产是否下线：-1-已下线 0-正常
    */
    @SerializedName("CloudAssetStatus")
    @Expose
    private Long CloudAssetStatus;

    /**
    * 可用率（百分比）
    */
    @SerializedName("AvailabilityRate")
    @Expose
    private Long AvailabilityRate;

    /**
    * 可用状态 1:异常 0:正常
    */
    @SerializedName("AvailabilityState")
    @Expose
    private Long AvailabilityState;

    /**
    * 平均响应时间：单位ms
    */
    @SerializedName("ResponseTime")
    @Expose
    private Long ResponseTime;

    /**
    * 域名解析状态 1:异常 0:正常
    */
    @SerializedName("AnalysisState")
    @Expose
    private Long AnalysisState;

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
     * Get Url 
     * @return Url Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Url
     * @param Url Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 报文长度 
     * @return ContentLength 报文长度
     */
    public Long getContentLength() {
        return this.ContentLength;
    }

    /**
     * Set 报文长度
     * @param ContentLength 报文长度
     */
    public void setContentLength(Long ContentLength) {
        this.ContentLength = ContentLength;
    }

    /**
     * Get 报文内容 
     * @return Content 报文内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 报文内容
     * @param Content 报文内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 截图缩略图URL 
     * @return ScreenshotThumbUrl 截图缩略图URL
     */
    public String getScreenshotThumbUrl() {
        return this.ScreenshotThumbUrl;
    }

    /**
     * Set 截图缩略图URL
     * @param ScreenshotThumbUrl 截图缩略图URL
     */
    public void setScreenshotThumbUrl(String ScreenshotThumbUrl) {
        this.ScreenshotThumbUrl = ScreenshotThumbUrl;
    }

    /**
     * Get 截图URL 
     * @return ScreenshotUrl 截图URL
     */
    public String getScreenshotUrl() {
        return this.ScreenshotUrl;
    }

    /**
     * Set 截图URL
     * @param ScreenshotUrl 截图URL
     */
    public void setScreenshotUrl(String ScreenshotUrl) {
        this.ScreenshotUrl = ScreenshotUrl;
    }

    /**
     * Get 状态码 
     * @return Code 状态码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态码
     * @param Code 状态码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Api地址 
     * @return Api Api地址
     */
    public String getApi() {
        return this.Api;
    }

    /**
     * Set Api地址
     * @param Api Api地址
     */
    public void setApi(String Api) {
        this.Api = Api;
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
     * Get 证书信息 
     * @return Ssl 证书信息
     */
    public String getSsl() {
        return this.Ssl;
    }

    /**
     * Set 证书信息
     * @param Ssl 证书信息
     */
    public void setSsl(String Ssl) {
        this.Ssl = Ssl;
    }

    /**
     * Get ssl证书过期时间 
     * @return SslExpiredTime ssl证书过期时间
     */
    public String getSslExpiredTime() {
        return this.SslExpiredTime;
    }

    /**
     * Set ssl证书过期时间
     * @param SslExpiredTime ssl证书过期时间
     */
    public void setSslExpiredTime(String SslExpiredTime) {
        this.SslExpiredTime = SslExpiredTime;
    }

    /**
     * Get 资产是否发生变动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsChange 资产是否发生变动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsChange() {
        return this.IsChange;
    }

    /**
     * Set 资产是否发生变动
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsChange 资产是否发生变动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsChange(Boolean IsChange) {
        this.IsChange = IsChange;
    }

    /**
     * Get 是否为云资产：0-非云资产 1-是云资产 
     * @return IsCloudAsset 是否为云资产：0-非云资产 1-是云资产
     */
    public Long getIsCloudAsset() {
        return this.IsCloudAsset;
    }

    /**
     * Set 是否为云资产：0-非云资产 1-是云资产
     * @param IsCloudAsset 是否为云资产：0-非云资产 1-是云资产
     */
    public void setIsCloudAsset(Long IsCloudAsset) {
        this.IsCloudAsset = IsCloudAsset;
    }

    /**
     * Get 云资产是否下线：-1-已下线 0-正常 
     * @return CloudAssetStatus 云资产是否下线：-1-已下线 0-正常
     */
    public Long getCloudAssetStatus() {
        return this.CloudAssetStatus;
    }

    /**
     * Set 云资产是否下线：-1-已下线 0-正常
     * @param CloudAssetStatus 云资产是否下线：-1-已下线 0-正常
     */
    public void setCloudAssetStatus(Long CloudAssetStatus) {
        this.CloudAssetStatus = CloudAssetStatus;
    }

    /**
     * Get 可用率（百分比） 
     * @return AvailabilityRate 可用率（百分比）
     */
    public Long getAvailabilityRate() {
        return this.AvailabilityRate;
    }

    /**
     * Set 可用率（百分比）
     * @param AvailabilityRate 可用率（百分比）
     */
    public void setAvailabilityRate(Long AvailabilityRate) {
        this.AvailabilityRate = AvailabilityRate;
    }

    /**
     * Get 可用状态 1:异常 0:正常 
     * @return AvailabilityState 可用状态 1:异常 0:正常
     */
    public Long getAvailabilityState() {
        return this.AvailabilityState;
    }

    /**
     * Set 可用状态 1:异常 0:正常
     * @param AvailabilityState 可用状态 1:异常 0:正常
     */
    public void setAvailabilityState(Long AvailabilityState) {
        this.AvailabilityState = AvailabilityState;
    }

    /**
     * Get 平均响应时间：单位ms 
     * @return ResponseTime 平均响应时间：单位ms
     */
    public Long getResponseTime() {
        return this.ResponseTime;
    }

    /**
     * Set 平均响应时间：单位ms
     * @param ResponseTime 平均响应时间：单位ms
     */
    public void setResponseTime(Long ResponseTime) {
        this.ResponseTime = ResponseTime;
    }

    /**
     * Get 域名解析状态 1:异常 0:正常 
     * @return AnalysisState 域名解析状态 1:异常 0:正常
     */
    public Long getAnalysisState() {
        return this.AnalysisState;
    }

    /**
     * Set 域名解析状态 1:异常 0:正常
     * @param AnalysisState 域名解析状态 1:异常 0:正常
     */
    public void setAnalysisState(Long AnalysisState) {
        this.AnalysisState = AnalysisState;
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

    }
}

