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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListImagesRequest extends AbstractModel {

    /**
    * 关键词搜索（模糊匹配名称或描述）
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 镜像类型过滤（Ray/Workspace）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 页数
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 关键词搜索（模糊匹配名称或描述） 
     * @return Keyword 关键词搜索（模糊匹配名称或描述）
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词搜索（模糊匹配名称或描述）
     * @param Keyword 关键词搜索（模糊匹配名称或描述）
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 镜像类型过滤（Ray/Workspace） 
     * @return Type 镜像类型过滤（Ray/Workspace）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 镜像类型过滤（Ray/Workspace）
     * @param Type 镜像类型过滤（Ray/Workspace）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 页数 
     * @return Page 页数
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页数
     * @param Page 页数
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 数量 
     * @return PageSize 数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 数量
     * @param PageSize 数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListImagesRequest(ListImagesRequest source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

