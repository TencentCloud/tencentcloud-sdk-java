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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBatchCustomWhiteRulesRequest extends AbstractModel {

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页尺寸，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段"modify_time"-更新时间、"sort_id"-优先级、"id"-规则Id、"create_time"-创建时间，默认为update_time
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序类型desc-降序、asc-升序，默认为desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 筛选列表，支持按照 ID：规则RuleId、Domain：生效的域名、Name：规则名称来筛选、ValidStatus：生效状态、Status：开关状态、TimerType：生效方式
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页尺寸，默认为10 
     * @return Limit 页尺寸，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页尺寸，默认为10
     * @param Limit 页尺寸，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段"modify_time"-更新时间、"sort_id"-优先级、"id"-规则Id、"create_time"-创建时间，默认为update_time 
     * @return By 排序字段"modify_time"-更新时间、"sort_id"-优先级、"id"-规则Id、"create_time"-创建时间，默认为update_time
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段"modify_time"-更新时间、"sort_id"-优先级、"id"-规则Id、"create_time"-创建时间，默认为update_time
     * @param By 排序字段"modify_time"-更新时间、"sort_id"-优先级、"id"-规则Id、"create_time"-创建时间，默认为update_time
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序类型desc-降序、asc-升序，默认为desc 
     * @return Order 排序类型desc-降序、asc-升序，默认为desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序类型desc-降序、asc-升序，默认为desc
     * @param Order 排序类型desc-降序、asc-升序，默认为desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 筛选列表，支持按照 ID：规则RuleId、Domain：生效的域名、Name：规则名称来筛选、ValidStatus：生效状态、Status：开关状态、TimerType：生效方式 
     * @return Filters 筛选列表，支持按照 ID：规则RuleId、Domain：生效的域名、Name：规则名称来筛选、ValidStatus：生效状态、Status：开关状态、TimerType：生效方式
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选列表，支持按照 ID：规则RuleId、Domain：生效的域名、Name：规则名称来筛选、ValidStatus：生效状态、Status：开关状态、TimerType：生效方式
     * @param Filters 筛选列表，支持按照 ID：规则RuleId、Domain：生效的域名、Name：规则名称来筛选、ValidStatus：生效状态、Status：开关状态、TimerType：生效方式
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBatchCustomWhiteRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchCustomWhiteRulesRequest(DescribeBatchCustomWhiteRulesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

