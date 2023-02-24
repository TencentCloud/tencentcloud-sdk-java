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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatAcRuleRequest extends AbstractModel{

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 需要查询的索引，特定场景使用，可不填
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 过滤条件组合
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * 检索的起始时间，可不传
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 检索的截止时间，可不传
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序所用到的字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 每页条数 
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移值 
     * @return Offset 偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 需要查询的索引，特定场景使用，可不填 
     * @return Index 需要查询的索引，特定场景使用，可不填
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 需要查询的索引，特定场景使用，可不填
     * @param Index 需要查询的索引，特定场景使用，可不填
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 过滤条件组合 
     * @return Filters 过滤条件组合
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件组合
     * @param Filters 过滤条件组合
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 检索的起始时间，可不传 
     * @return StartTime 检索的起始时间，可不传
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 检索的起始时间，可不传
     * @param StartTime 检索的起始时间，可不传
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 检索的截止时间，可不传 
     * @return EndTime 检索的截止时间，可不传
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 检索的截止时间，可不传
     * @param EndTime 检索的截止时间，可不传
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值 
     * @return Order desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值
     * @param Order desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序所用到的字段 
     * @return By 排序所用到的字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序所用到的字段
     * @param By 排序所用到的字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeNatAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatAcRuleRequest(DescribeNatAcRuleRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

