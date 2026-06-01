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

public class DisplaySuspiciousAsset extends AbstractModel {

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
    * <p>Api</p>
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
    * <p>来源类型</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>来源值</p>
    */
    @SerializedName("SourceValue")
    @Expose
    private String SourceValue;

    /**
    * <p>是否信任</p>
    */
    @SerializedName("Trusted")
    @Expose
    private Boolean Trusted;

    /**
    * <p>所属者</p>
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>根域名</p>
    */
    @SerializedName("RootDomain")
    @Expose
    private String RootDomain;

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
     * Get <p>Api</p> 
     * @return Api <p>Api</p>
     */
    public String getApi() {
        return this.Api;
    }

    /**
     * Set <p>Api</p>
     * @param Api <p>Api</p>
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
     * Get <p>来源类型</p> 
     * @return SourceType <p>来源类型</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>来源类型</p>
     * @param SourceType <p>来源类型</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>来源值</p> 
     * @return SourceValue <p>来源值</p>
     */
    public String getSourceValue() {
        return this.SourceValue;
    }

    /**
     * Set <p>来源值</p>
     * @param SourceValue <p>来源值</p>
     */
    public void setSourceValue(String SourceValue) {
        this.SourceValue = SourceValue;
    }

    /**
     * Get <p>是否信任</p> 
     * @return Trusted <p>是否信任</p>
     */
    public Boolean getTrusted() {
        return this.Trusted;
    }

    /**
     * Set <p>是否信任</p>
     * @param Trusted <p>是否信任</p>
     */
    public void setTrusted(Boolean Trusted) {
        this.Trusted = Trusted;
    }

    /**
     * Get <p>所属者</p> 
     * @return Owner <p>所属者</p>
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>所属者</p>
     * @param Owner <p>所属者</p>
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>根域名</p> 
     * @return RootDomain <p>根域名</p>
     */
    public String getRootDomain() {
        return this.RootDomain;
    }

    /**
     * Set <p>根域名</p>
     * @param RootDomain <p>根域名</p>
     */
    public void setRootDomain(String RootDomain) {
        this.RootDomain = RootDomain;
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

    public DisplaySuspiciousAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplaySuspiciousAsset(DisplaySuspiciousAsset source) {
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
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceValue != null) {
            this.SourceValue = new String(source.SourceValue);
        }
        if (source.Trusted != null) {
            this.Trusted = new Boolean(source.Trusted);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.RootDomain != null) {
            this.RootDomain = new String(source.RootDomain);
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
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceValue", this.SourceValue);
        this.setParamSimple(map, prefix + "Trusted", this.Trusted);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "RootDomain", this.RootDomain);
        this.setParamSimple(map, prefix + "AggregationCount", this.AggregationCount);

    }
}

