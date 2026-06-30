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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogTagValueRequest extends AbstractModel {

    /**
    * <p>起始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>事件集ID</p>
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * <p>聚合字段,取值范围如下：Source(事件源),RuleIds(命中规则),Subject(实例ID),Region(地域)</p>
    */
    @SerializedName("GroupField")
    @Expose
    private String GroupField;

    /**
    * <p>页数</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页数据大小</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>筛选条件</p>
    */
    @SerializedName("Filter")
    @Expose
    private LogFilter [] Filter;

    /**
     * Get <p>起始时间</p> 
     * @return StartTime <p>起始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间</p>
     * @param StartTime <p>起始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>事件集ID</p> 
     * @return EventBusId <p>事件集ID</p>
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set <p>事件集ID</p>
     * @param EventBusId <p>事件集ID</p>
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get <p>聚合字段,取值范围如下：Source(事件源),RuleIds(命中规则),Subject(实例ID),Region(地域)</p> 
     * @return GroupField <p>聚合字段,取值范围如下：Source(事件源),RuleIds(命中规则),Subject(实例ID),Region(地域)</p>
     */
    public String getGroupField() {
        return this.GroupField;
    }

    /**
     * Set <p>聚合字段,取值范围如下：Source(事件源),RuleIds(命中规则),Subject(实例ID),Region(地域)</p>
     * @param GroupField <p>聚合字段,取值范围如下：Source(事件源),RuleIds(命中规则),Subject(实例ID),Region(地域)</p>
     */
    public void setGroupField(String GroupField) {
        this.GroupField = GroupField;
    }

    /**
     * Get <p>页数</p> 
     * @return Page <p>页数</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页数</p>
     * @param Page <p>页数</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页数据大小</p> 
     * @return Limit <p>每页数据大小</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数据大小</p>
     * @param Limit <p>每页数据大小</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>筛选条件</p> 
     * @return Filter <p>筛选条件</p>
     */
    public LogFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>筛选条件</p>
     * @param Filter <p>筛选条件</p>
     */
    public void setFilter(LogFilter [] Filter) {
        this.Filter = Filter;
    }

    public DescribeLogTagValueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogTagValueRequest(DescribeLogTagValueRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.GroupField != null) {
            this.GroupField = new String(source.GroupField);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "GroupField", this.GroupField);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);

    }
}

