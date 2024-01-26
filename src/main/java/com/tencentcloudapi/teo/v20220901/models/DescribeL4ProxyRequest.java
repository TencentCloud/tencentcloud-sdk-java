/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeL4ProxyRequest extends AbstractModel {

    /**
    * 四层代理实例所属站点的 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 分页查询偏移量，不填写时默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目。默认值：20，最大值：1000。	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有四层代理实例信息。详细的过滤条件如下：
<li>proxy-id：按照四层代理实例 ID 进行过滤；</li>
<li>ddos-protection-type：按照安全防护类型进行过滤。</li>


    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 四层代理实例所属站点的 ID。 
     * @return ZoneId 四层代理实例所属站点的 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 四层代理实例所属站点的 ID。
     * @param ZoneId 四层代理实例所属站点的 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 分页查询偏移量，不填写时默认为 0。 
     * @return Offset 分页查询偏移量，不填写时默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，不填写时默认为 0。
     * @param Offset 分页查询偏移量，不填写时默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目。默认值：20，最大值：1000。	 
     * @return Limit 分页查询限制数目。默认值：20，最大值：1000。	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目。默认值：20，最大值：1000。	
     * @param Limit 分页查询限制数目。默认值：20，最大值：1000。	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有四层代理实例信息。详细的过滤条件如下：
<li>proxy-id：按照四层代理实例 ID 进行过滤；</li>
<li>ddos-protection-type：按照安全防护类型进行过滤。</li>

 
     * @return Filters 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有四层代理实例信息。详细的过滤条件如下：
<li>proxy-id：按照四层代理实例 ID 进行过滤；</li>
<li>ddos-protection-type：按照安全防护类型进行过滤。</li>


     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有四层代理实例信息。详细的过滤条件如下：
<li>proxy-id：按照四层代理实例 ID 进行过滤；</li>
<li>ddos-protection-type：按照安全防护类型进行过滤。</li>


     * @param Filters 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有四层代理实例信息。详细的过滤条件如下：
<li>proxy-id：按照四层代理实例 ID 进行过滤；</li>
<li>ddos-protection-type：按照安全防护类型进行过滤。</li>


     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeL4ProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL4ProxyRequest(DescribeL4ProxyRequest source) {
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

