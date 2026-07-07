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

public class DescribeKeysRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>过滤列表</p><p>支持：KeyName、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>API Key的ID列表</p>
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>本次查询偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>模型路由实例ID</p> 
     * @return ModelRouterId <p>模型路由实例ID</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID</p>
     * @param ModelRouterId <p>模型路由实例ID</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>过滤列表</p><p>支持：KeyName、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p> 
     * @return Filters <p>过滤列表</p><p>支持：KeyName、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤列表</p><p>支持：KeyName、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p>
     * @param Filters <p>过滤列表</p><p>支持：KeyName、BudgetId、tag-key、tag:&lt;tag-key&gt;。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>API Key的ID列表</p> 
     * @return KeyIds <p>API Key的ID列表</p>
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set <p>API Key的ID列表</p>
     * @param KeyIds <p>API Key的ID列表</p>
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p> 
     * @return Limit <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     * @param Limit <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>本次查询偏移量</p> 
     * @return Offset <p>本次查询偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>本次查询偏移量</p>
     * @param Offset <p>本次查询偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKeysRequest(DescribeKeysRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
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
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

