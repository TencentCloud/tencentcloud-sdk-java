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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrefetchOriginLimitRequest extends AbstractModel {

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 分页查询偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目，默认值：20，上限：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>domain-name：按照域名过滤。domain-name 形如：www.qq.com，不支持模糊查询；</li>
<li>area：按照限制加速区域过滤，不支持模糊查询。可选项：<br> Overseas：全球可用区（不含中国大陆）；<br> MainlandChina：中国大陆可用区。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 分页查询偏移量，默认为 0。 
     * @return Offset 分页查询偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为 0。
     * @param Offset 分页查询偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目，默认值：20，上限：100。 
     * @return Limit 分页查询限制数目，默认值：20，上限：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认值：20，上限：100。
     * @param Limit 分页查询限制数目，默认值：20，上限：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>domain-name：按照域名过滤。domain-name 形如：www.qq.com，不支持模糊查询；</li>
<li>area：按照限制加速区域过滤，不支持模糊查询。可选项：<br> Overseas：全球可用区（不含中国大陆）；<br> MainlandChina：中国大陆可用区。</li> 
     * @return Filters 过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>domain-name：按照域名过滤。domain-name 形如：www.qq.com，不支持模糊查询；</li>
<li>area：按照限制加速区域过滤，不支持模糊查询。可选项：<br> Overseas：全球可用区（不含中国大陆）；<br> MainlandChina：中国大陆可用区。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>domain-name：按照域名过滤。domain-name 形如：www.qq.com，不支持模糊查询；</li>
<li>area：按照限制加速区域过滤，不支持模糊查询。可选项：<br> Overseas：全球可用区（不含中国大陆）；<br> MainlandChina：中国大陆可用区。</li>
     * @param Filters 过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>domain-name：按照域名过滤。domain-name 形如：www.qq.com，不支持模糊查询；</li>
<li>area：按照限制加速区域过滤，不支持模糊查询。可选项：<br> Overseas：全球可用区（不含中国大陆）；<br> MainlandChina：中国大陆可用区。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePrefetchOriginLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrefetchOriginLimitRequest(DescribePrefetchOriginLimitRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

