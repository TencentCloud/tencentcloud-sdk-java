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
package com.tencentcloudapi.portal.v20230413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchDocumentItem extends AbstractModel {

    /**
    * <p>文档URL</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>文档标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>文档片段</p>
    */
    @SerializedName("Snippet")
    @Expose
    private String Snippet;

    /**
     * Get <p>文档URL</p> 
     * @return Url <p>文档URL</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>文档URL</p>
     * @param Url <p>文档URL</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>文档标题</p> 
     * @return Title <p>文档标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>文档标题</p>
     * @param Title <p>文档标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>产品名称</p> 
     * @return ProductName <p>产品名称</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>产品名称</p>
     * @param ProductName <p>产品名称</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>文档片段</p> 
     * @return Snippet <p>文档片段</p>
     */
    public String getSnippet() {
        return this.Snippet;
    }

    /**
     * Set <p>文档片段</p>
     * @param Snippet <p>文档片段</p>
     */
    public void setSnippet(String Snippet) {
        this.Snippet = Snippet;
    }

    public SearchDocumentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchDocumentItem(SearchDocumentItem source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Snippet != null) {
            this.Snippet = new String(source.Snippet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Snippet", this.Snippet);

    }
}

