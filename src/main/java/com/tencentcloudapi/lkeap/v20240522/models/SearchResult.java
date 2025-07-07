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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchResult extends AbstractModel {

    /**
    * 索引
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 链接地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 标题
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 摘要
    */
    @SerializedName("Snippet")
    @Expose
    private String Snippet;

    /**
    * 图标
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 站点
    */
    @SerializedName("Site")
    @Expose
    private String Site;

    /**
    * 1740412800
    */
    @SerializedName("PublishedTime")
    @Expose
    private Long PublishedTime;

    /**
     * Get 索引 
     * @return Index 索引
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 索引
     * @param Index 索引
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 链接地址 
     * @return Url 链接地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 链接地址
     * @param Url 链接地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 标题 
     * @return Name 标题
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标题
     * @param Name 标题
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 摘要 
     * @return Snippet 摘要
     */
    public String getSnippet() {
        return this.Snippet;
    }

    /**
     * Set 摘要
     * @param Snippet 摘要
     */
    public void setSnippet(String Snippet) {
        this.Snippet = Snippet;
    }

    /**
     * Get 图标 
     * @return Icon 图标
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 图标
     * @param Icon 图标
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 站点 
     * @return Site 站点
     */
    public String getSite() {
        return this.Site;
    }

    /**
     * Set 站点
     * @param Site 站点
     */
    public void setSite(String Site) {
        this.Site = Site;
    }

    /**
     * Get 1740412800 
     * @return PublishedTime 1740412800
     */
    public Long getPublishedTime() {
        return this.PublishedTime;
    }

    /**
     * Set 1740412800
     * @param PublishedTime 1740412800
     */
    public void setPublishedTime(Long PublishedTime) {
        this.PublishedTime = PublishedTime;
    }

    public SearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchResult(SearchResult source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Snippet != null) {
            this.Snippet = new String(source.Snippet);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.Site != null) {
            this.Site = new String(source.Site);
        }
        if (source.PublishedTime != null) {
            this.PublishedTime = new Long(source.PublishedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Snippet", this.Snippet);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Site", this.Site);
        this.setParamSimple(map, prefix + "PublishedTime", this.PublishedTime);

    }
}

