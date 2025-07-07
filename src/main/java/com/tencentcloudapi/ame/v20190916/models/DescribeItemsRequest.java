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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeItemsRequest extends AbstractModel {

    /**
    * offset (Default = 0)，(当前页-1) * Limit
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 条数，必须大于0，最大值为30
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。
    */
    @SerializedName("CategoryCode")
    @Expose
    private String CategoryCode;

    /**
     * Get offset (Default = 0)，(当前页-1) * Limit 
     * @return Offset offset (Default = 0)，(当前页-1) * Limit
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set offset (Default = 0)，(当前页-1) * Limit
     * @param Offset offset (Default = 0)，(当前页-1) * Limit
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 条数，必须大于0，最大值为30 
     * @return Limit 条数，必须大于0，最大值为30
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数，必须大于0，最大值为30
     * @param Limit 条数，必须大于0，最大值为30
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。 
     * @return CategoryId （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。
     * @param CategoryId （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。 
     * @return CategoryCode （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。
     */
    public String getCategoryCode() {
        return this.CategoryCode;
    }

    /**
     * Set （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。
     * @param CategoryCode （电台/歌单）ID，CategoryId和CategoryCode两个必传1个，可以从<a href="https://cloud.tencent.com/document/product/1155/40109">获取分类内容（Station）列表接口</a>中获取。
     */
    public void setCategoryCode(String CategoryCode) {
        this.CategoryCode = CategoryCode;
    }

    public DescribeItemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeItemsRequest(DescribeItemsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryCode != null) {
            this.CategoryCode = new String(source.CategoryCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryCode", this.CategoryCode);

    }
}

