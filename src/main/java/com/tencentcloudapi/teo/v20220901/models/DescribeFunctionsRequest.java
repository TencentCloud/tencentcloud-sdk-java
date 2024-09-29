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

public class DescribeFunctionsRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 按照函数 ID 列表过滤。
    */
    @SerializedName("FunctionIds")
    @Expose
    private String [] FunctionIds;

    /**
    * 过滤条件列表，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>name：按照【函数名称】进行模糊匹配。</li>
<li>remark：按照【函数描述】进行模糊匹配。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页查询偏移量。默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目。默认值：20，最大值：200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 按照函数 ID 列表过滤。 
     * @return FunctionIds 按照函数 ID 列表过滤。
     */
    public String [] getFunctionIds() {
        return this.FunctionIds;
    }

    /**
     * Set 按照函数 ID 列表过滤。
     * @param FunctionIds 按照函数 ID 列表过滤。
     */
    public void setFunctionIds(String [] FunctionIds) {
        this.FunctionIds = FunctionIds;
    }

    /**
     * Get 过滤条件列表，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>name：按照【函数名称】进行模糊匹配。</li>
<li>remark：按照【函数描述】进行模糊匹配。</li> 
     * @return Filters 过滤条件列表，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>name：按照【函数名称】进行模糊匹配。</li>
<li>remark：按照【函数描述】进行模糊匹配。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件列表，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>name：按照【函数名称】进行模糊匹配。</li>
<li>remark：按照【函数描述】进行模糊匹配。</li>
     * @param Filters 过滤条件列表，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：
<li>name：按照【函数名称】进行模糊匹配。</li>
<li>remark：按照【函数描述】进行模糊匹配。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页查询偏移量。默认值：0。 
     * @return Offset 分页查询偏移量。默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量。默认值：0。
     * @param Offset 分页查询偏移量。默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目。默认值：20，最大值：200。 
     * @return Limit 分页查询限制数目。默认值：20，最大值：200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目。默认值：20，最大值：200。
     * @param Limit 分页查询限制数目。默认值：20，最大值：200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeFunctionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFunctionsRequest(DescribeFunctionsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionIds != null) {
            this.FunctionIds = new String[source.FunctionIds.length];
            for (int i = 0; i < source.FunctionIds.length; i++) {
                this.FunctionIds[i] = new String(source.FunctionIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "FunctionIds.", this.FunctionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

