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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTagsRequest extends AbstractModel {

    /**
    * <p>从上一页的响应中获取的下一页的Token值。如果是第一次请求，设置为空。</p>
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * <p>每一页返回的数据最大条数，最大1000。缺省值：50。</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>标签键。返回所有标签键列表对应的标签。最大长度：20</p>
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get <p>从上一页的响应中获取的下一页的Token值。如果是第一次请求，设置为空。</p> 
     * @return PaginationToken <p>从上一页的响应中获取的下一页的Token值。如果是第一次请求，设置为空。</p>
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set <p>从上一页的响应中获取的下一页的Token值。如果是第一次请求，设置为空。</p>
     * @param PaginationToken <p>从上一页的响应中获取的下一页的Token值。如果是第一次请求，设置为空。</p>
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get <p>每一页返回的数据最大条数，最大1000。缺省值：50。</p> 
     * @return MaxResults <p>每一页返回的数据最大条数，最大1000。缺省值：50。</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>每一页返回的数据最大条数，最大1000。缺省值：50。</p>
     * @param MaxResults <p>每一页返回的数据最大条数，最大1000。缺省值：50。</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>标签键。返回所有标签键列表对应的标签。最大长度：20</p> 
     * @return TagKeys <p>标签键。返回所有标签键列表对应的标签。最大长度：20</p>
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set <p>标签键。返回所有标签键列表对应的标签。最大长度：20</p>
     * @param TagKeys <p>标签键。返回所有标签键列表对应的标签。最大长度：20</p>
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p> 
     * @return Category <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p>
     * @param Category <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public GetTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTagsRequest(GetTagsRequest source) {
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaginationToken", this.PaginationToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

