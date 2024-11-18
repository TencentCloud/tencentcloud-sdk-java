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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvokersRequest extends AbstractModel {

    /**
    * 执行器ID列表。
    */
    @SerializedName("InvokerIds")
    @Expose
    private String [] InvokerIds;

    /**
    * 过滤条件：<li> invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。</li> <li> command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。</li> <li> type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 执行器ID列表。 
     * @return InvokerIds 执行器ID列表。
     */
    public String [] getInvokerIds() {
        return this.InvokerIds;
    }

    /**
     * Set 执行器ID列表。
     * @param InvokerIds 执行器ID列表。
     */
    public void setInvokerIds(String [] InvokerIds) {
        this.InvokerIds = InvokerIds;
    }

    /**
     * Get 过滤条件：<li> invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。</li> <li> command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。</li> <li> type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。</li> 
     * @return Filters 过滤条件：<li> invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。</li> <li> command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。</li> <li> type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：<li> invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。</li> <li> command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。</li> <li> type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。</li>
     * @param Filters 过滤条件：<li> invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。</li> <li> command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。</li> <li> type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeInvokersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvokersRequest(DescribeInvokersRequest source) {
        if (source.InvokerIds != null) {
            this.InvokerIds = new String[source.InvokerIds.length];
            for (int i = 0; i < source.InvokerIds.length; i++) {
                this.InvokerIds[i] = new String(source.InvokerIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InvokerIds.", this.InvokerIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

