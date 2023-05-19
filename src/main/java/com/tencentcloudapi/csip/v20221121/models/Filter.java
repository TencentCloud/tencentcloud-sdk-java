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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel{

    /**
    * 查询数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序采用升序还是降序 升:asc 降 desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 需排序的字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 过滤的列及内容
    */
    @SerializedName("Filters")
    @Expose
    private WhereFilter [] Filters;

    /**
    * 可填无， 日志使用查询时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 可填无， 日志使用查询时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 查询数量限制 
     * @return Limit 查询数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数量限制
     * @param Limit 查询数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询偏移位置 
     * @return Offset 查询偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移位置
     * @param Offset 查询偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序采用升序还是降序 升:asc 降 desc 
     * @return Order 排序采用升序还是降序 升:asc 降 desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序采用升序还是降序 升:asc 降 desc
     * @param Order 排序采用升序还是降序 升:asc 降 desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 需排序的字段 
     * @return By 需排序的字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 需排序的字段
     * @param By 需排序的字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 过滤的列及内容 
     * @return Filters 过滤的列及内容
     */
    public WhereFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤的列及内容
     * @param Filters 过滤的列及内容
     */
    public void setFilters(WhereFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 可填无， 日志使用查询时间 
     * @return StartTime 可填无， 日志使用查询时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 可填无， 日志使用查询时间
     * @param StartTime 可填无， 日志使用查询时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 可填无， 日志使用查询时间 
     * @return EndTime 可填无， 日志使用查询时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 可填无， 日志使用查询时间
     * @param EndTime 可填无， 日志使用查询时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Filters != null) {
            this.Filters = new WhereFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new WhereFilter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

