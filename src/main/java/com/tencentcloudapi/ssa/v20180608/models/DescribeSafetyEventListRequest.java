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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSafetyEventListRequest extends AbstractModel{

    /**
    * 搜索过滤查询参数
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序列名
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序升降：desc-降序 asc-升序
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 开始查询时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束查询时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 是否过滤响应时间
    */
    @SerializedName("IsFilterResponseTime")
    @Expose
    private Boolean IsFilterResponseTime;

    /**
     * Get 搜索过滤查询参数 
     * @return Filter 搜索过滤查询参数
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 搜索过滤查询参数
     * @param Filter 搜索过滤查询参数
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页偏移 
     * @return Offset 页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移
     * @param Offset 页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序列名 
     * @return Order 排序列名
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序列名
     * @param Order 排序列名
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序升降：desc-降序 asc-升序 
     * @return By 排序升降：desc-降序 asc-升序
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序升降：desc-降序 asc-升序
     * @param By 排序升降：desc-降序 asc-升序
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 开始查询时间 
     * @return StartTime 开始查询时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始查询时间
     * @param StartTime 开始查询时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束查询时间 
     * @return EndTime 结束查询时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束查询时间
     * @param EndTime 结束查询时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否过滤响应时间 
     * @return IsFilterResponseTime 是否过滤响应时间
     */
    public Boolean getIsFilterResponseTime() {
        return this.IsFilterResponseTime;
    }

    /**
     * Set 是否过滤响应时间
     * @param IsFilterResponseTime 是否过滤响应时间
     */
    public void setIsFilterResponseTime(Boolean IsFilterResponseTime) {
        this.IsFilterResponseTime = IsFilterResponseTime;
    }

    public DescribeSafetyEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSafetyEventListRequest(DescribeSafetyEventListRequest source) {
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsFilterResponseTime != null) {
            this.IsFilterResponseTime = new Boolean(source.IsFilterResponseTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsFilterResponseTime", this.IsFilterResponseTime);

    }
}

