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

public class GetTagKeysRequest extends AbstractModel {

    /**
    * 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * 每一页返回的数据最大条数，最大1000。
缺省值：50。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。 
     * @return PaginationToken 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     * @param PaginationToken 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get 每一页返回的数据最大条数，最大1000。
缺省值：50。 
     * @return MaxResults 每一页返回的数据最大条数，最大1000。
缺省值：50。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 每一页返回的数据最大条数，最大1000。
缺省值：50。
     * @param MaxResults 每一页返回的数据最大条数，最大1000。
缺省值：50。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。 
     * @return Category 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
     * @param Category 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public GetTagKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTagKeysRequest(GetTagKeysRequest source) {
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
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
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

