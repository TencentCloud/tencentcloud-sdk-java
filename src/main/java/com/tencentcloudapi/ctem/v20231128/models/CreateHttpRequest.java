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

public class CreateHttpRequest extends AbstractModel {

    /**
    * 企业Id
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 子公司
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

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
    * 缩略图Url
    */
    @SerializedName("ScreenshotUrl")
    @Expose
    private String ScreenshotUrl;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 状态码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

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
     * Get 企业Id 
     * @return CustomerId 企业Id
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业Id
     * @param CustomerId 企业Id
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
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
     * Get 子公司 
     * @return EnterpriseUid 子公司
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司
     * @param EnterpriseUid 子公司
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
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
     * Get 缩略图Url 
     * @return ScreenshotUrl 缩略图Url
     */
    public String getScreenshotUrl() {
        return this.ScreenshotUrl;
    }

    /**
     * Set 缩略图Url
     * @param ScreenshotUrl 缩略图Url
     */
    public void setScreenshotUrl(String ScreenshotUrl) {
        this.ScreenshotUrl = ScreenshotUrl;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
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

    public CreateHttpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHttpRequest(CreateHttpRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
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
        if (source.ScreenshotUrl != null) {
            this.ScreenshotUrl = new String(source.ScreenshotUrl);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "ContentLength", this.ContentLength);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ScreenshotUrl", this.ScreenshotUrl);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Ssl", this.Ssl);
        this.setParamSimple(map, prefix + "SslExpiredTime", this.SslExpiredTime);

    }
}

