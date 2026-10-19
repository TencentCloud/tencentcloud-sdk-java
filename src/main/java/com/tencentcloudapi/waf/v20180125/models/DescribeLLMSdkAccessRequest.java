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

public class DescribeLLMSdkAccessRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页的起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页行数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤器
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
    * 支持根据ts排序
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * asc或者desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页的起始位置 
     * @return Offset 分页的起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的起始位置
     * @param Offset 分页的起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页行数 
     * @return Limit 每页行数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页行数
     * @param Limit 每页行数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤器 
     * @return Filters 过滤器
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器
     * @param Filters 过滤器
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 支持根据ts排序 
     * @return By 支持根据ts排序
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 支持根据ts排序
     * @param By 支持根据ts排序
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get asc或者desc 
     * @return Order asc或者desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set asc或者desc
     * @param Order asc或者desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeLLMSdkAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMSdkAccessRequest(DescribeLLMSdkAccessRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

