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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogRequest extends AbstractModel{

    /**
    * 起始时间unix 毫秒时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间unix 毫秒时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数据大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 筛选条件
    */
    @SerializedName("Filter")
    @Expose
    private LogFilter [] Filter;

    /**
    * 排序数组
    */
    @SerializedName("OrderFields")
    @Expose
    private String [] OrderFields;

    /**
    * 排序方式，asc 从旧到新，desc 从新到旧
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get 起始时间unix 毫秒时间戳 
     * @return StartTime 起始时间unix 毫秒时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间unix 毫秒时间戳
     * @param StartTime 起始时间unix 毫秒时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间unix 毫秒时间戳 
     * @return EndTime 结束时间unix 毫秒时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间unix 毫秒时间戳
     * @param EndTime 结束时间unix 毫秒时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页数据大小 
     * @return Limit 每页数据大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据大小
     * @param Limit 每页数据大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 筛选条件 
     * @return Filter 筛选条件
     */
    public LogFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 筛选条件
     * @param Filter 筛选条件
     */
    public void setFilter(LogFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 排序数组 
     * @return OrderFields 排序数组
     */
    public String [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序数组
     * @param OrderFields 排序数组
     */
    public void setOrderFields(String [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 排序方式，asc 从旧到新，desc 从新到旧 
     * @return OrderBy 排序方式，asc 从旧到新，desc 从新到旧
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序方式，asc 从旧到新，desc 从新到旧
     * @param OrderBy 排序方式，asc 从旧到新，desc 从新到旧
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public SearchLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogRequest(SearchLogRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new LogFilter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new LogFilter(source.Filter[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new String[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new String(source.OrderFields[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

