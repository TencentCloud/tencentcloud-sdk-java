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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkOrderListRequest extends AbstractModel {

    /**
    * 过滤条件。支持：service-type、order-type、order-status、order-id
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 通过sn过滤工单，上限10个
    */
    @SerializedName("SnList")
    @Expose
    private String [] SnList;

    /**
    * 起始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 长度
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 过滤条件。支持：service-type、order-type、order-status、order-id 
     * @return Filters 过滤条件。支持：service-type、order-type、order-status、order-id
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。支持：service-type、order-type、order-status、order-id
     * @param Filters 过滤条件。支持：service-type、order-type、order-status、order-id
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 通过sn过滤工单，上限10个 
     * @return SnList 通过sn过滤工单，上限10个
     */
    public String [] getSnList() {
        return this.SnList;
    }

    /**
     * Set 通过sn过滤工单，上限10个
     * @param SnList 通过sn过滤工单，上限10个
     */
    public void setSnList(String [] SnList) {
        this.SnList = SnList;
    }

    /**
     * Get 起始 
     * @return Offset 起始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始
     * @param Offset 起始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 长度 
     * @return Limit 长度
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 长度
     * @param Limit 长度
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeWorkOrderListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkOrderListRequest(DescribeWorkOrderListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SnList != null) {
            this.SnList = new String[source.SnList.length];
            for (int i = 0; i < source.SnList.length; i++) {
                this.SnList[i] = new String(source.SnList[i]);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "SnList.", this.SnList);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

