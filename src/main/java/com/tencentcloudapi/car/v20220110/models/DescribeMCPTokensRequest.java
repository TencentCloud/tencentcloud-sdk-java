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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMCPTokensRequest extends AbstractModel {

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单页数量</p><p>取值范围：[0, 200]</p><p>默认值：20</p><p>如果传入 0 会使用默认值</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤器列表</p><p>只支持 TokenId 和 TokenName 过滤，Filters 数量不能超过 10、每个 Filter 的 Values 个数不能超过 20、单个 Value 长度不能超过 64 个字符、不允许同名 Filter 出现</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单页数量</p><p>取值范围：[0, 200]</p><p>默认值：20</p><p>如果传入 0 会使用默认值</p> 
     * @return Limit <p>单页数量</p><p>取值范围：[0, 200]</p><p>默认值：20</p><p>如果传入 0 会使用默认值</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页数量</p><p>取值范围：[0, 200]</p><p>默认值：20</p><p>如果传入 0 会使用默认值</p>
     * @param Limit <p>单页数量</p><p>取值范围：[0, 200]</p><p>默认值：20</p><p>如果传入 0 会使用默认值</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤器列表</p><p>只支持 TokenId 和 TokenName 过滤，Filters 数量不能超过 10、每个 Filter 的 Values 个数不能超过 20、单个 Value 长度不能超过 64 个字符、不允许同名 Filter 出现</p> 
     * @return Filters <p>过滤器列表</p><p>只支持 TokenId 和 TokenName 过滤，Filters 数量不能超过 10、每个 Filter 的 Values 个数不能超过 20、单个 Value 长度不能超过 64 个字符、不允许同名 Filter 出现</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤器列表</p><p>只支持 TokenId 和 TokenName 过滤，Filters 数量不能超过 10、每个 Filter 的 Values 个数不能超过 20、单个 Value 长度不能超过 64 个字符、不允许同名 Filter 出现</p>
     * @param Filters <p>过滤器列表</p><p>只支持 TokenId 和 TokenName 过滤，Filters 数量不能超过 10、每个 Filter 的 Values 个数不能超过 20、单个 Value 长度不能超过 64 个字符、不允许同名 Filter 出现</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeMCPTokensRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMCPTokensRequest(DescribeMCPTokensRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

