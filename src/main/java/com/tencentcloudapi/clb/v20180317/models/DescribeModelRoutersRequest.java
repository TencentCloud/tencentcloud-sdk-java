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

public class DescribeModelRoutersRequest extends AbstractModel {

    /**
    * <p>过滤条件</p><p>支持：ModelRouterName、ModelRouterType、Status、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>每页数量，1-100，默认 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>模型路由实例ID列表</p>
    */
    @SerializedName("ModelRouterIds")
    @Expose
    private String [] ModelRouterIds;

    /**
    * <p>分页偏移量，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>过滤条件</p><p>支持：ModelRouterName、ModelRouterType、Status、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p> 
     * @return Filters <p>过滤条件</p><p>支持：ModelRouterName、ModelRouterType、Status、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p><p>支持：ModelRouterName、ModelRouterType、Status、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p>
     * @param Filters <p>过滤条件</p><p>支持：ModelRouterName、ModelRouterType、Status、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>每页数量，1-100，默认 20</p> 
     * @return Limit <p>每页数量，1-100，默认 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，1-100，默认 20</p>
     * @param Limit <p>每页数量，1-100，默认 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>模型路由实例ID列表</p> 
     * @return ModelRouterIds <p>模型路由实例ID列表</p>
     */
    public String [] getModelRouterIds() {
        return this.ModelRouterIds;
    }

    /**
     * Set <p>模型路由实例ID列表</p>
     * @param ModelRouterIds <p>模型路由实例ID列表</p>
     */
    public void setModelRouterIds(String [] ModelRouterIds) {
        this.ModelRouterIds = ModelRouterIds;
    }

    /**
     * Get <p>分页偏移量，默认 0</p> 
     * @return Offset <p>分页偏移量，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认 0</p>
     * @param Offset <p>分页偏移量，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeModelRoutersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelRoutersRequest(DescribeModelRoutersRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ModelRouterIds != null) {
            this.ModelRouterIds = new String[source.ModelRouterIds.length];
            for (int i = 0; i < source.ModelRouterIds.length; i++) {
                this.ModelRouterIds[i] = new String(source.ModelRouterIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ModelRouterIds.", this.ModelRouterIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

