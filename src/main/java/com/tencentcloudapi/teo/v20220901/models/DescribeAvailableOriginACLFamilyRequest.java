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

public class DescribeAvailableOriginACLFamilyRequest extends AbstractModel {

    /**
    * <p>站点ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用版本。源站防护的 IP 段控制域包含标准控制域和精简控制域。标准控制域和精简控制域主要区别在于提供的回源 IP 网段数量差异，后者数量更少,但是使用上有限制，如需使用请联系技术支持。具体取值说明如下：<br>详细的过滤条件如下：<br>OriginACLFamily：按照控制域进行过滤；</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li><li>plat-specific-gaz：定制版控全球可用区制域；</li><li>plat-specific-mlc：定制版控中国大陆可用区控制域；</li><li>plat-specific-emc：定制版控全球（不含中国大陆）可用区控制域。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>分页查询偏移量，默认为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页查询限制数目，默认值：20，最大值：100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>站点ID。</p> 
     * @return ZoneId <p>站点ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点ID。</p>
     * @param ZoneId <p>站点ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用版本。源站防护的 IP 段控制域包含标准控制域和精简控制域。标准控制域和精简控制域主要区别在于提供的回源 IP 网段数量差异，后者数量更少,但是使用上有限制，如需使用请联系技术支持。具体取值说明如下：<br>详细的过滤条件如下：<br>OriginACLFamily：按照控制域进行过滤；</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li><li>plat-specific-gaz：定制版控全球可用区制域；</li><li>plat-specific-mlc：定制版控中国大陆可用区控制域；</li><li>plat-specific-emc：定制版控全球（不含中国大陆）可用区控制域。</li> 
     * @return Filters <p>过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用版本。源站防护的 IP 段控制域包含标准控制域和精简控制域。标准控制域和精简控制域主要区别在于提供的回源 IP 网段数量差异，后者数量更少,但是使用上有限制，如需使用请联系技术支持。具体取值说明如下：<br>详细的过滤条件如下：<br>OriginACLFamily：按照控制域进行过滤；</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li><li>plat-specific-gaz：定制版控全球可用区制域；</li><li>plat-specific-mlc：定制版控中国大陆可用区控制域；</li><li>plat-specific-emc：定制版控全球（不含中国大陆）可用区控制域。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用版本。源站防护的 IP 段控制域包含标准控制域和精简控制域。标准控制域和精简控制域主要区别在于提供的回源 IP 网段数量差异，后者数量更少,但是使用上有限制，如需使用请联系技术支持。具体取值说明如下：<br>详细的过滤条件如下：<br>OriginACLFamily：按照控制域进行过滤；</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li><li>plat-specific-gaz：定制版控全球可用区制域；</li><li>plat-specific-mlc：定制版控中国大陆可用区控制域；</li><li>plat-specific-emc：定制版控全球（不含中国大陆）可用区控制域。</li>
     * @param Filters <p>过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用版本。源站防护的 IP 段控制域包含标准控制域和精简控制域。标准控制域和精简控制域主要区别在于提供的回源 IP 网段数量差异，后者数量更少,但是使用上有限制，如需使用请联系技术支持。具体取值说明如下：<br>详细的过滤条件如下：<br>OriginACLFamily：按照控制域进行过滤；</p><li>gaz：标准全球可用区控制域；</li><li>mlc：标准中国大陆可用区控制域；</li><li>emc：标准全球(不含中国大陆)可用区控制域；</li><li>plat-gaz：精简全球可用区控制域；</li><li>plat-mlc：精简中国大陆可用区控制域；</li><li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li><li>plat-specific-gaz：定制版控全球可用区制域；</li><li>plat-specific-mlc：定制版控中国大陆可用区控制域；</li><li>plat-specific-emc：定制版控全球（不含中国大陆）可用区控制域。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询偏移量，默认为 0。</p> 
     * @return Offset <p>分页查询偏移量，默认为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移量，默认为 0。</p>
     * @param Offset <p>分页查询偏移量，默认为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页查询限制数目，默认值：20，最大值：100。</p> 
     * @return Limit <p>分页查询限制数目，默认值：20，最大值：100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询限制数目，默认值：20，最大值：100。</p>
     * @param Limit <p>分页查询限制数目，默认值：20，最大值：100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAvailableOriginACLFamilyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableOriginACLFamilyRequest(DescribeAvailableOriginACLFamilyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

