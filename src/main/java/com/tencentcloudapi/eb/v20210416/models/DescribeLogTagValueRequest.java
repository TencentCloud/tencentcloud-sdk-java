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

public class DescribeLogTagValueRequest extends AbstractModel{

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
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
    * 聚合字段
    */
    @SerializedName("GroupField")
    @Expose
    private String GroupField;

    /**
    * 页数
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
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
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
     * Get 聚合字段 
     * @return GroupField 聚合字段
     */
    public String getGroupField() {
        return this.GroupField;
    }

    /**
     * Set 聚合字段
     * @param GroupField 聚合字段
     */
    public void setGroupField(String GroupField) {
        this.GroupField = GroupField;
    }

    /**
     * Get 页数 
     * @return Page 页数
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页数
     * @param Page 页数
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

