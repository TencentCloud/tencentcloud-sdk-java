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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDsEventRequest extends AbstractModel {

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件名称/项目名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 事件类型GENERAL、TIME_SERIES
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 事件子类型SECOND、MIN、HOUR、DAY
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 日期格式
    */
    @SerializedName("DatetimeFormat")
    @Expose
    private String DatetimeFormat;

    /**
    * 创建开始时间
    */
    @SerializedName("CreationTimeStart")
    @Expose
    private String CreationTimeStart;

    /**
    * 创建结束时间
    */
    @SerializedName("CreationTimeEnd")
    @Expose
    private String CreationTimeEnd;

    /**
    * 排序参数
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 责任人筛选
    */
    @SerializedName("OwnerNameList")
    @Expose
    private String [] OwnerNameList;

    /**
    * 任务周期筛选
    */
    @SerializedName("TaskCycleType")
    @Expose
    private String TaskCycleType;

    /**
    * 0表示自定义，其他的表示固定参数，单位为天
    */
    @SerializedName("TimeToLive")
    @Expose
    private Long [] TimeToLive;

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 事件名称/项目名称 
     * @return EventName 事件名称/项目名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称/项目名称
     * @param EventName 事件名称/项目名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件类型GENERAL、TIME_SERIES 
     * @return EventType 事件类型GENERAL、TIME_SERIES
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型GENERAL、TIME_SERIES
     * @param EventType 事件类型GENERAL、TIME_SERIES
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件子类型SECOND、MIN、HOUR、DAY 
     * @return EventSubType 事件子类型SECOND、MIN、HOUR、DAY
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件子类型SECOND、MIN、HOUR、DAY
     * @param EventSubType 事件子类型SECOND、MIN、HOUR、DAY
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 日期格式 
     * @return DatetimeFormat 日期格式
     */
    public String getDatetimeFormat() {
        return this.DatetimeFormat;
    }

    /**
     * Set 日期格式
     * @param DatetimeFormat 日期格式
     */
    public void setDatetimeFormat(String DatetimeFormat) {
        this.DatetimeFormat = DatetimeFormat;
    }

    /**
     * Get 创建开始时间 
     * @return CreationTimeStart 创建开始时间
     */
    public String getCreationTimeStart() {
        return this.CreationTimeStart;
    }

    /**
     * Set 创建开始时间
     * @param CreationTimeStart 创建开始时间
     */
    public void setCreationTimeStart(String CreationTimeStart) {
        this.CreationTimeStart = CreationTimeStart;
    }

    /**
     * Get 创建结束时间 
     * @return CreationTimeEnd 创建结束时间
     */
    public String getCreationTimeEnd() {
        return this.CreationTimeEnd;
    }

    /**
     * Set 创建结束时间
     * @param CreationTimeEnd 创建结束时间
     */
    public void setCreationTimeEnd(String CreationTimeEnd) {
        this.CreationTimeEnd = CreationTimeEnd;
    }

    /**
     * Get 排序参数 
     * @return OrderFields 排序参数
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序参数
     * @param OrderFields 排序参数
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 责任人筛选 
     * @return OwnerNameList 责任人筛选
     */
    public String [] getOwnerNameList() {
        return this.OwnerNameList;
    }

    /**
     * Set 责任人筛选
     * @param OwnerNameList 责任人筛选
     */
    public void setOwnerNameList(String [] OwnerNameList) {
        this.OwnerNameList = OwnerNameList;
    }

    /**
     * Get 任务周期筛选 
     * @return TaskCycleType 任务周期筛选
     */
    public String getTaskCycleType() {
        return this.TaskCycleType;
    }

    /**
     * Set 任务周期筛选
     * @param TaskCycleType 任务周期筛选
     */
    public void setTaskCycleType(String TaskCycleType) {
        this.TaskCycleType = TaskCycleType;
    }

    /**
     * Get 0表示自定义，其他的表示固定参数，单位为天 
     * @return TimeToLive 0表示自定义，其他的表示固定参数，单位为天
     */
    public Long [] getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set 0表示自定义，其他的表示固定参数，单位为天
     * @param TimeToLive 0表示自定义，其他的表示固定参数，单位为天
     */
    public void setTimeToLive(Long [] TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    public DescribeDsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDsEventRequest(DescribeDsEventRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.DatetimeFormat != null) {
            this.DatetimeFormat = new String(source.DatetimeFormat);
        }
        if (source.CreationTimeStart != null) {
            this.CreationTimeStart = new String(source.CreationTimeStart);
        }
        if (source.CreationTimeEnd != null) {
            this.CreationTimeEnd = new String(source.CreationTimeEnd);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.OwnerNameList != null) {
            this.OwnerNameList = new String[source.OwnerNameList.length];
            for (int i = 0; i < source.OwnerNameList.length; i++) {
                this.OwnerNameList[i] = new String(source.OwnerNameList[i]);
            }
        }
        if (source.TaskCycleType != null) {
            this.TaskCycleType = new String(source.TaskCycleType);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new Long[source.TimeToLive.length];
            for (int i = 0; i < source.TimeToLive.length; i++) {
                this.TimeToLive[i] = new Long(source.TimeToLive[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "DatetimeFormat", this.DatetimeFormat);
        this.setParamSimple(map, prefix + "CreationTimeStart", this.CreationTimeStart);
        this.setParamSimple(map, prefix + "CreationTimeEnd", this.CreationTimeEnd);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamArraySimple(map, prefix + "OwnerNameList.", this.OwnerNameList);
        this.setParamSimple(map, prefix + "TaskCycleType", this.TaskCycleType);
        this.setParamArraySimple(map, prefix + "TimeToLive.", this.TimeToLive);

    }
}

