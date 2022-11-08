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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmEventsRequest extends AbstractModel{

    /**
    * 过滤条件(key可以是：AlarmLevel,AlarmIndicator,KeyWord)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段（AlarmTime）
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 类型(201表示实时，202表示离线)
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 当前页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页记录数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 过滤条件(key可以是：AlarmLevel,AlarmIndicator,KeyWord) 
     * @return Filters 过滤条件(key可以是：AlarmLevel,AlarmIndicator,KeyWord)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件(key可以是：AlarmLevel,AlarmIndicator,KeyWord)
     * @param Filters 过滤条件(key可以是：AlarmLevel,AlarmIndicator,KeyWord)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段（AlarmTime） 
     * @return OrderFields 排序字段（AlarmTime）
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段（AlarmTime）
     * @param OrderFields 排序字段（AlarmTime）
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 类型(201表示实时，202表示离线) 
     * @return TaskType 类型(201表示实时，202表示离线)
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 类型(201表示实时，202表示离线)
     * @param TaskType 类型(201表示实时，202表示离线)
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 当前页 
     * @return PageNumber 当前页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页
     * @param PageNumber 当前页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页记录数 
     * @return PageSize 每页记录数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页记录数
     * @param PageSize 每页记录数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeAlarmEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmEventsRequest(DescribeAlarmEventsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

