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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrowseEvent extends AbstractModel {

    /**
    * <p>当前浏览网页的类型，例如主页、搜索页等</p>
    */
    @SerializedName("PageType")
    @Expose
    private String PageType;

    /**
    * <p>当前浏览的网页URL</p>
    */
    @SerializedName("PageUrl")
    @Expose
    private String PageUrl;

    /**
    * <p>浏览耗时</p><p>单位：毫秒</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>网页内容类型，例如广告、视频、文章等</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>网页内容ID</p>
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * <p>上一个网页的类型，例如主页、搜索页等</p>
    */
    @SerializedName("ReferPageType")
    @Expose
    private String ReferPageType;

    /**
    * <p>上一个网页URL</p>
    */
    @SerializedName("ReferPageUrl")
    @Expose
    private String ReferPageUrl;

    /**
    * <p>游客账号ID</p>
    */
    @SerializedName("GuestId")
    @Expose
    private String GuestId;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>当前浏览网页的类型，例如主页、搜索页等</p> 
     * @return PageType <p>当前浏览网页的类型，例如主页、搜索页等</p>
     */
    public String getPageType() {
        return this.PageType;
    }

    /**
     * Set <p>当前浏览网页的类型，例如主页、搜索页等</p>
     * @param PageType <p>当前浏览网页的类型，例如主页、搜索页等</p>
     */
    public void setPageType(String PageType) {
        this.PageType = PageType;
    }

    /**
     * Get <p>当前浏览的网页URL</p> 
     * @return PageUrl <p>当前浏览的网页URL</p>
     */
    public String getPageUrl() {
        return this.PageUrl;
    }

    /**
     * Set <p>当前浏览的网页URL</p>
     * @param PageUrl <p>当前浏览的网页URL</p>
     */
    public void setPageUrl(String PageUrl) {
        this.PageUrl = PageUrl;
    }

    /**
     * Get <p>浏览耗时</p><p>单位：毫秒</p> 
     * @return Duration <p>浏览耗时</p><p>单位：毫秒</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>浏览耗时</p><p>单位：毫秒</p>
     * @param Duration <p>浏览耗时</p><p>单位：毫秒</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>网页内容类型，例如广告、视频、文章等</p> 
     * @return ContentType <p>网页内容类型，例如广告、视频、文章等</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>网页内容类型，例如广告、视频、文章等</p>
     * @param ContentType <p>网页内容类型，例如广告、视频、文章等</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>网页内容ID</p> 
     * @return ContentId <p>网页内容ID</p>
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set <p>网页内容ID</p>
     * @param ContentId <p>网页内容ID</p>
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get <p>上一个网页的类型，例如主页、搜索页等</p> 
     * @return ReferPageType <p>上一个网页的类型，例如主页、搜索页等</p>
     */
    public String getReferPageType() {
        return this.ReferPageType;
    }

    /**
     * Set <p>上一个网页的类型，例如主页、搜索页等</p>
     * @param ReferPageType <p>上一个网页的类型，例如主页、搜索页等</p>
     */
    public void setReferPageType(String ReferPageType) {
        this.ReferPageType = ReferPageType;
    }

    /**
     * Get <p>上一个网页URL</p> 
     * @return ReferPageUrl <p>上一个网页URL</p>
     */
    public String getReferPageUrl() {
        return this.ReferPageUrl;
    }

    /**
     * Set <p>上一个网页URL</p>
     * @param ReferPageUrl <p>上一个网页URL</p>
     */
    public void setReferPageUrl(String ReferPageUrl) {
        this.ReferPageUrl = ReferPageUrl;
    }

    /**
     * Get <p>游客账号ID</p> 
     * @return GuestId <p>游客账号ID</p>
     */
    public String getGuestId() {
        return this.GuestId;
    }

    /**
     * Set <p>游客账号ID</p>
     * @param GuestId <p>游客账号ID</p>
     */
    public void setGuestId(String GuestId) {
        this.GuestId = GuestId;
    }

    /**
     * Get <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public BrowseEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrowseEvent(BrowseEvent source) {
        if (source.PageType != null) {
            this.PageType = new String(source.PageType);
        }
        if (source.PageUrl != null) {
            this.PageUrl = new String(source.PageUrl);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.ReferPageType != null) {
            this.ReferPageType = new String(source.ReferPageType);
        }
        if (source.ReferPageUrl != null) {
            this.ReferPageUrl = new String(source.ReferPageUrl);
        }
        if (source.GuestId != null) {
            this.GuestId = new String(source.GuestId);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageType", this.PageType);
        this.setParamSimple(map, prefix + "PageUrl", this.PageUrl);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "ReferPageType", this.ReferPageType);
        this.setParamSimple(map, prefix + "ReferPageUrl", this.ReferPageUrl);
        this.setParamSimple(map, prefix + "GuestId", this.GuestId);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

