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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAclRuleRequest extends AbstractModel {

    /**
    * <p>每页条数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移值</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>需要查询的索引，特定场景使用，可不填</p>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>过滤条件组合</p>
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * <p>检索的起始时间，可不传</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>检索的截止时间，可不传</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值，默认为asc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序所用到的字段，默认为sequence</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>每页条数</p> 
     * @return Limit <p>每页条数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条数</p>
     * @param Limit <p>每页条数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移值</p> 
     * @return Offset <p>偏移值</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移值</p>
     * @param Offset <p>偏移值</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>需要查询的索引，特定场景使用，可不填</p> 
     * @return Index <p>需要查询的索引，特定场景使用，可不填</p>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>需要查询的索引，特定场景使用，可不填</p>
     * @param Index <p>需要查询的索引，特定场景使用，可不填</p>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>过滤条件组合</p> 
     * @return Filters <p>过滤条件组合</p>
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件组合</p>
     * @param Filters <p>过滤条件组合</p>
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>检索的起始时间，可不传</p> 
     * @return StartTime <p>检索的起始时间，可不传</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>检索的起始时间，可不传</p>
     * @param StartTime <p>检索的起始时间，可不传</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>检索的截止时间，可不传</p> 
     * @return EndTime <p>检索的截止时间，可不传</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>检索的截止时间，可不传</p>
     * @param EndTime <p>检索的截止时间，可不传</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值，默认为asc</p> 
     * @return Order <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值，默认为asc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值，默认为asc</p>
     * @param Order <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值，默认为asc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序所用到的字段，默认为sequence</p> 
     * @return By <p>排序所用到的字段，默认为sequence</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序所用到的字段，默认为sequence</p>
     * @param By <p>排序所用到的字段，默认为sequence</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAclRuleRequest(DescribeAclRuleRequest source) {
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

