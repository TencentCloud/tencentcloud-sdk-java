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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineListRequest extends AbstractModel {

    /**
    * 分页参数 最大100条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件 <li>StrategyId- Uint64 - 基线策略id</li> <li>Status - Uint64 - 处理状态 1-已通过 0-未通过</li> <li>Level - Uint64 - 威胁等级 1-低危 2-中危 3-高危 4-严重</li> <li>BaselineName  - String - 基线名称</li> <li>Quuid- String - 主机quuid</li> <li>Uuid- String - 主机uuid</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 分页参数 最大100条 
     * @return Limit 分页参数 最大100条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数 最大100条
     * @param Limit 分页参数 最大100条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件 <li>StrategyId- Uint64 - 基线策略id</li> <li>Status - Uint64 - 处理状态 1-已通过 0-未通过</li> <li>Level - Uint64 - 威胁等级 1-低危 2-中危 3-高危 4-严重</li> <li>BaselineName  - String - 基线名称</li> <li>Quuid- String - 主机quuid</li> <li>Uuid- String - 主机uuid</li> 
     * @return Filters 过滤条件 <li>StrategyId- Uint64 - 基线策略id</li> <li>Status - Uint64 - 处理状态 1-已通过 0-未通过</li> <li>Level - Uint64 - 威胁等级 1-低危 2-中危 3-高危 4-严重</li> <li>BaselineName  - String - 基线名称</li> <li>Quuid- String - 主机quuid</li> <li>Uuid- String - 主机uuid</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件 <li>StrategyId- Uint64 - 基线策略id</li> <li>Status - Uint64 - 处理状态 1-已通过 0-未通过</li> <li>Level - Uint64 - 威胁等级 1-低危 2-中危 3-高危 4-严重</li> <li>BaselineName  - String - 基线名称</li> <li>Quuid- String - 主机quuid</li> <li>Uuid- String - 主机uuid</li>
     * @param Filters 过滤条件 <li>StrategyId- Uint64 - 基线策略id</li> <li>Status - Uint64 - 处理状态 1-已通过 0-未通过</li> <li>Level - Uint64 - 威胁等级 1-低危 2-中危 3-高危 4-严重</li> <li>BaselineName  - String - 基线名称</li> <li>Quuid- String - 主机quuid</li> <li>Uuid- String - 主机uuid</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBaselineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineListRequest(DescribeBaselineListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

