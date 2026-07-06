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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyRiskAccountProductStatsRequest extends AbstractModel {

    /**
    * 分页大小，按账号分页，默认20，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 筛选条件列表。支持的筛选字段：AccountName（账号名称模糊搜索）、AccountId（账号Uin精确搜索）、OnlyUntreated（仅看待整改，值为1时生效）、OnlyOverdue（仅超时未体检，值为1时生效）
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
     * Get 分页大小，按账号分页，默认20，最大100 
     * @return Limit 分页大小，按账号分页，默认20，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，按账号分页，默认20，最大100
     * @param Limit 分页大小，按账号分页，默认20，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移，默认0 
     * @return Offset 分页偏移，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移，默认0
     * @param Offset 分页偏移，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 筛选条件列表。支持的筛选字段：AccountName（账号名称模糊搜索）、AccountId（账号Uin精确搜索）、OnlyUntreated（仅看待整改，值为1时生效）、OnlyOverdue（仅超时未体检，值为1时生效） 
     * @return Filters 筛选条件列表。支持的筛选字段：AccountName（账号名称模糊搜索）、AccountId（账号Uin精确搜索）、OnlyUntreated（仅看待整改，值为1时生效）、OnlyOverdue（仅超时未体检，值为1时生效）
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件列表。支持的筛选字段：AccountName（账号名称模糊搜索）、AccountId（账号Uin精确搜索）、OnlyUntreated（仅看待整改，值为1时生效）、OnlyOverdue（仅超时未体检，值为1时生效）
     * @param Filters 筛选条件列表。支持的筛选字段：AccountName（账号名称模糊搜索）、AccountId（账号Uin精确搜索）、OnlyUntreated（仅看待整改，值为1时生效）、OnlyOverdue（仅超时未体检，值为1时生效）
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePolicyRiskAccountProductStatsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyRiskAccountProductStatsRequest(DescribePolicyRiskAccountProductStatsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
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

