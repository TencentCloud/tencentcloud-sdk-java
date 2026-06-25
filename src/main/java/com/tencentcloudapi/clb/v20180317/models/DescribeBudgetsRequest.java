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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBudgetsRequest extends AbstractModel {

    /**
    * <p>Budget ID列表。</p>
    */
    @SerializedName("BudgetIds")
    @Expose
    private String [] BudgetIds;

    /**
    * <p>过滤列表。</p><p>支持：BudgetId、BudgetName、Status。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>本次查询限制的数量。</p><p>取值范围：[1, 100]</p><p>默认值：20。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>本次查询偏移量。</p><p>默认值：0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>Budget ID列表。</p> 
     * @return BudgetIds <p>Budget ID列表。</p>
     */
    public String [] getBudgetIds() {
        return this.BudgetIds;
    }

    /**
     * Set <p>Budget ID列表。</p>
     * @param BudgetIds <p>Budget ID列表。</p>
     */
    public void setBudgetIds(String [] BudgetIds) {
        this.BudgetIds = BudgetIds;
    }

    /**
     * Get <p>过滤列表。</p><p>支持：BudgetId、BudgetName、Status。</p> 
     * @return Filters <p>过滤列表。</p><p>支持：BudgetId、BudgetName、Status。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤列表。</p><p>支持：BudgetId、BudgetName、Status。</p>
     * @param Filters <p>过滤列表。</p><p>支持：BudgetId、BudgetName、Status。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>本次查询限制的数量。</p><p>取值范围：[1, 100]</p><p>默认值：20。</p> 
     * @return Limit <p>本次查询限制的数量。</p><p>取值范围：[1, 100]</p><p>默认值：20。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>本次查询限制的数量。</p><p>取值范围：[1, 100]</p><p>默认值：20。</p>
     * @param Limit <p>本次查询限制的数量。</p><p>取值范围：[1, 100]</p><p>默认值：20。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>本次查询偏移量。</p><p>默认值：0。</p> 
     * @return Offset <p>本次查询偏移量。</p><p>默认值：0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>本次查询偏移量。</p><p>默认值：0。</p>
     * @param Offset <p>本次查询偏移量。</p><p>默认值：0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeBudgetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBudgetsRequest(DescribeBudgetsRequest source) {
        if (source.BudgetIds != null) {
            this.BudgetIds = new String[source.BudgetIds.length];
            for (int i = 0; i < source.BudgetIds.length; i++) {
                this.BudgetIds[i] = new String(source.BudgetIds[i]);
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
        this.setParamArraySimple(map, prefix + "BudgetIds.", this.BudgetIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

