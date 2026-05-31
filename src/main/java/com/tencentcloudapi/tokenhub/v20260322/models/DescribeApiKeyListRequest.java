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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiKeyListRequest extends AbstractModel {

    /**
    * 平台类型。当前支持填值：maas
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件列表。支持的过滤字段：apikeyId（API 密钥 ID）、apiKeyName（名称）、platform（平台类型）、status（状态）、bindType（绑定类型）。
    */
    @SerializedName("Filters")
    @Expose
    private RequestFilter [] Filters;

    /**
    * 排序条件列表。支持的排序字段：apiKeyName
    */
    @SerializedName("Sorts")
    @Expose
    private RequestSort [] Sorts;

    /**
     * Get 平台类型。当前支持填值：maas 
     * @return Platform 平台类型。当前支持填值：maas
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台类型。当前支持填值：maas
     * @param Platform 平台类型。当前支持填值：maas
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。 
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件列表。支持的过滤字段：apikeyId（API 密钥 ID）、apiKeyName（名称）、platform（平台类型）、status（状态）、bindType（绑定类型）。 
     * @return Filters 过滤条件列表。支持的过滤字段：apikeyId（API 密钥 ID）、apiKeyName（名称）、platform（平台类型）、status（状态）、bindType（绑定类型）。
     */
    public RequestFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件列表。支持的过滤字段：apikeyId（API 密钥 ID）、apiKeyName（名称）、platform（平台类型）、status（状态）、bindType（绑定类型）。
     * @param Filters 过滤条件列表。支持的过滤字段：apikeyId（API 密钥 ID）、apiKeyName（名称）、platform（平台类型）、status（状态）、bindType（绑定类型）。
     */
    public void setFilters(RequestFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序条件列表。支持的排序字段：apiKeyName 
     * @return Sorts 排序条件列表。支持的排序字段：apiKeyName
     */
    public RequestSort [] getSorts() {
        return this.Sorts;
    }

    /**
     * Set 排序条件列表。支持的排序字段：apiKeyName
     * @param Sorts 排序条件列表。支持的排序字段：apiKeyName
     */
    public void setSorts(RequestSort [] Sorts) {
        this.Sorts = Sorts;
    }

    public DescribeApiKeyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiKeyListRequest(DescribeApiKeyListRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new RequestFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RequestFilter(source.Filters[i]);
            }
        }
        if (source.Sorts != null) {
            this.Sorts = new RequestSort[source.Sorts.length];
            for (int i = 0; i < source.Sorts.length; i++) {
                this.Sorts[i] = new RequestSort(source.Sorts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Sorts.", this.Sorts);

    }
}

