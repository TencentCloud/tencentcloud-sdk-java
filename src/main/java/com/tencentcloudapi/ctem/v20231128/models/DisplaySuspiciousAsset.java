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
    * Api
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
    * 来源类型
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 来源值
    */
    @SerializedName("SourceValue")
    @Expose
    private String SourceValue;

    /**
    * 是否信任
    */
    @SerializedName("Trusted")
    @Expose
    private Boolean Trusted;

    /**
    * 所属者
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 根域名
    */
    @SerializedName("RootDomain")
    @Expose
    private String RootDomain;

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
     * Get Api 
     * @return Api Api
     */
    public String getApi() {
        return this.Api;
    }

    /**
     * Set Api
     * @param Api Api
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
     * Get 来源类型 
     * @return SourceType 来源类型
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 来源类型
     * @param SourceType 来源类型
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 来源值 
     * @return SourceValue 来源值
     */
    public String getSourceValue() {
        return this.SourceValue;
    }

    /**
     * Set 来源值
     * @param SourceValue 来源值
     */
    public void setSourceValue(String SourceValue) {
        this.SourceValue = SourceValue;
    }

    /**
     * Get 是否信任 
     * @return Trusted 是否信任
     */
    public Boolean getTrusted() {
        return this.Trusted;
    }

    /**
     * Set 是否信任
     * @param Trusted 是否信任
     */
    public void setTrusted(Boolean Trusted) {
        this.Trusted = Trusted;
    }

    /**
     * Get 所属者 
     * @return Owner 所属者
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 所属者
     * @param Owner 所属者
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 根域名 
     * @return RootDomain 根域名
     */
    public String getRootDomain() {
        return this.RootDomain;
    }

    /**
     * Set 根域名
     * @param RootDomain 根域名
     */
    public void setRootDomain(String RootDomain) {
        this.RootDomain = RootDomain;
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

    }
}

