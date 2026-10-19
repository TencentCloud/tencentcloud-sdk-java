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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePreCacheImageListRequest extends AbstractModel {

    /**
    * <p>查询过滤条件。支持 Image, ImageDigest, ImageRegistryType, Status, SourceType；不同 Filter 之间为 AND，同一 Filter 的 Values 之间为 OR。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>返回数据列数</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <p>默认 false；仅控制是否返回精确总数</p>
    */
    @SerializedName("NeedTotalCount")
    @Expose
    private Boolean NeedTotalCount;

    /**
     * Get <p>查询过滤条件。支持 Image, ImageDigest, ImageRegistryType, Status, SourceType；不同 Filter 之间为 AND，同一 Filter 的 Values 之间为 OR。</p> 
     * @return Filters <p>查询过滤条件。支持 Image, ImageDigest, ImageRegistryType, Status, SourceType；不同 Filter 之间为 AND，同一 Filter 的 Values 之间为 OR。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查询过滤条件。支持 Image, ImageDigest, ImageRegistryType, Status, SourceType；不同 Filter 之间为 AND，同一 Filter 的 Values 之间为 OR。</p>
     * @param Filters <p>查询过滤条件。支持 Image, ImageDigest, ImageRegistryType, Status, SourceType；不同 Filter 之间为 AND，同一 Filter 的 Values 之间为 OR。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>返回数据列数</p><p>取值范围：[1, 100]</p><p>默认值：20</p> 
     * @return MaxResults <p>返回数据列数</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>返回数据列数</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     * @param MaxResults <p>返回数据列数</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。</p> 
     * @return NextToken <p>NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。</p>
     * @param NextToken <p>NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <p>默认 false；仅控制是否返回精确总数</p> 
     * @return NeedTotalCount <p>默认 false；仅控制是否返回精确总数</p>
     */
    public Boolean getNeedTotalCount() {
        return this.NeedTotalCount;
    }

    /**
     * Set <p>默认 false；仅控制是否返回精确总数</p>
     * @param NeedTotalCount <p>默认 false；仅控制是否返回精确总数</p>
     */
    public void setNeedTotalCount(Boolean NeedTotalCount) {
        this.NeedTotalCount = NeedTotalCount;
    }

    public DescribePreCacheImageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePreCacheImageListRequest(DescribePreCacheImageListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.NeedTotalCount != null) {
            this.NeedTotalCount = new Boolean(source.NeedTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "NeedTotalCount", this.NeedTotalCount);

    }
}

