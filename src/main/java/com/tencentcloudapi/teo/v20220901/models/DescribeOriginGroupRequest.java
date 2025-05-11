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

public class DescribeOriginGroupRequest extends AbstractModel {

    /**
    * 站点ID，此参数必填。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 分页查询偏移量，不填默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目，不填默认为20，取值：1-1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>origin-group-id：按照源站组 ID 进行过滤，不支持模糊查询。源站组 ID 形如：origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a；</li><li>origin-group-name： 按照源站组名称进行过滤，使用模糊查询时，仅支持填写一个源站组名称。</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get 站点ID，此参数必填。 
     * @return ZoneId 站点ID，此参数必填。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID，此参数必填。
     * @param ZoneId 站点ID，此参数必填。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 分页查询偏移量，不填默认为0。 
     * @return Offset 分页查询偏移量，不填默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，不填默认为0。
     * @param Offset 分页查询偏移量，不填默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目，不填默认为20，取值：1-1000。 
     * @return Limit 分页查询限制数目，不填默认为20，取值：1-1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，不填默认为20，取值：1-1000。
     * @param Limit 分页查询限制数目，不填默认为20，取值：1-1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>origin-group-id：按照源站组 ID 进行过滤，不支持模糊查询。源站组 ID 形如：origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a；</li><li>origin-group-name： 按照源站组名称进行过滤，使用模糊查询时，仅支持填写一个源站组名称。</li> 
     * @return Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>origin-group-id：按照源站组 ID 进行过滤，不支持模糊查询。源站组 ID 形如：origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a；</li><li>origin-group-name： 按照源站组名称进行过滤，使用模糊查询时，仅支持填写一个源站组名称。</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>origin-group-id：按照源站组 ID 进行过滤，不支持模糊查询。源站组 ID 形如：origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a；</li><li>origin-group-name： 按照源站组名称进行过滤，使用模糊查询时，仅支持填写一个源站组名称。</li>
     * @param Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>origin-group-id：按照源站组 ID 进行过滤，不支持模糊查询。源站组 ID 形如：origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a；</li><li>origin-group-name： 按照源站组名称进行过滤，使用模糊查询时，仅支持填写一个源站组名称。</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginGroupRequest(DescribeOriginGroupRequest source) {
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
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
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

