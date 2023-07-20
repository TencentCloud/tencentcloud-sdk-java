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

public class DescribeEventCasesRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件实例目录
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数目
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 事件分割类型
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 事件广播类型
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * 事件实例状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 事件实例最小创建时间
    */
    @SerializedName("CreationTimeStart")
    @Expose
    private String CreationTimeStart;

    /**
    * 事件实例最大创建时间
    */
    @SerializedName("CreationTimeEnd")
    @Expose
    private String CreationTimeEnd;

    /**
    * 事件实例最小触发时间
    */
    @SerializedName("EventTriggeredTimeStart")
    @Expose
    private String EventTriggeredTimeStart;

    /**
    * 事件实例最大触发时间
    */
    @SerializedName("EventTriggeredTimeEnd")
    @Expose
    private String EventTriggeredTimeEnd;

    /**
    * 事件实例最小消费时间
    */
    @SerializedName("LogTimeStart")
    @Expose
    private String LogTimeStart;

    /**
    * 事件实例最大消费时间
    */
    @SerializedName("LogTimeEnd")
    @Expose
    private String LogTimeEnd;

    /**
    * 事件实例数据时间
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

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
     * Get 事件实例目录 
     * @return Category 事件实例目录
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 事件实例目录
     * @param Category 事件实例目录
     */
    public void setCategory(String Category) {
        this.Category = Category;
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
     * Get 每页数目 
     * @return PageSize 每页数目
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目
     * @param PageSize 每页数目
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 事件名称 
     * @return EventName 事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
     * @param EventName 事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件分割类型 
     * @return EventSubType 事件分割类型
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件分割类型
     * @param EventSubType 事件分割类型
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 事件广播类型 
     * @return EventBroadcastType 事件广播类型
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set 事件广播类型
     * @param EventBroadcastType 事件广播类型
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get 事件实例状态 
     * @return Status 事件实例状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 事件实例状态
     * @param Status 事件实例状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 事件实例最小创建时间 
     * @return CreationTimeStart 事件实例最小创建时间
     */
    public String getCreationTimeStart() {
        return this.CreationTimeStart;
    }

    /**
     * Set 事件实例最小创建时间
     * @param CreationTimeStart 事件实例最小创建时间
     */
    public void setCreationTimeStart(String CreationTimeStart) {
        this.CreationTimeStart = CreationTimeStart;
    }

    /**
     * Get 事件实例最大创建时间 
     * @return CreationTimeEnd 事件实例最大创建时间
     */
    public String getCreationTimeEnd() {
        return this.CreationTimeEnd;
    }

    /**
     * Set 事件实例最大创建时间
     * @param CreationTimeEnd 事件实例最大创建时间
     */
    public void setCreationTimeEnd(String CreationTimeEnd) {
        this.CreationTimeEnd = CreationTimeEnd;
    }

    /**
     * Get 事件实例最小触发时间 
     * @return EventTriggeredTimeStart 事件实例最小触发时间
     */
    public String getEventTriggeredTimeStart() {
        return this.EventTriggeredTimeStart;
    }

    /**
     * Set 事件实例最小触发时间
     * @param EventTriggeredTimeStart 事件实例最小触发时间
     */
    public void setEventTriggeredTimeStart(String EventTriggeredTimeStart) {
        this.EventTriggeredTimeStart = EventTriggeredTimeStart;
    }

    /**
     * Get 事件实例最大触发时间 
     * @return EventTriggeredTimeEnd 事件实例最大触发时间
     */
    public String getEventTriggeredTimeEnd() {
        return this.EventTriggeredTimeEnd;
    }

    /**
     * Set 事件实例最大触发时间
     * @param EventTriggeredTimeEnd 事件实例最大触发时间
     */
    public void setEventTriggeredTimeEnd(String EventTriggeredTimeEnd) {
        this.EventTriggeredTimeEnd = EventTriggeredTimeEnd;
    }

    /**
     * Get 事件实例最小消费时间 
     * @return LogTimeStart 事件实例最小消费时间
     */
    public String getLogTimeStart() {
        return this.LogTimeStart;
    }

    /**
     * Set 事件实例最小消费时间
     * @param LogTimeStart 事件实例最小消费时间
     */
    public void setLogTimeStart(String LogTimeStart) {
        this.LogTimeStart = LogTimeStart;
    }

    /**
     * Get 事件实例最大消费时间 
     * @return LogTimeEnd 事件实例最大消费时间
     */
    public String getLogTimeEnd() {
        return this.LogTimeEnd;
    }

    /**
     * Set 事件实例最大消费时间
     * @param LogTimeEnd 事件实例最大消费时间
     */
    public void setLogTimeEnd(String LogTimeEnd) {
        this.LogTimeEnd = LogTimeEnd;
    }

    /**
     * Get 事件实例数据时间 
     * @return Dimension 事件实例数据时间
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 事件实例数据时间
     * @param Dimension 事件实例数据时间
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    public DescribeEventCasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventCasesRequest(DescribeEventCasesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreationTimeStart != null) {
            this.CreationTimeStart = new String(source.CreationTimeStart);
        }
        if (source.CreationTimeEnd != null) {
            this.CreationTimeEnd = new String(source.CreationTimeEnd);
        }
        if (source.EventTriggeredTimeStart != null) {
            this.EventTriggeredTimeStart = new String(source.EventTriggeredTimeStart);
        }
        if (source.EventTriggeredTimeEnd != null) {
            this.EventTriggeredTimeEnd = new String(source.EventTriggeredTimeEnd);
        }
        if (source.LogTimeStart != null) {
            this.LogTimeStart = new String(source.LogTimeStart);
        }
        if (source.LogTimeEnd != null) {
            this.LogTimeEnd = new String(source.LogTimeEnd);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreationTimeStart", this.CreationTimeStart);
        this.setParamSimple(map, prefix + "CreationTimeEnd", this.CreationTimeEnd);
        this.setParamSimple(map, prefix + "EventTriggeredTimeStart", this.EventTriggeredTimeStart);
        this.setParamSimple(map, prefix + "EventTriggeredTimeEnd", this.EventTriggeredTimeEnd);
        this.setParamSimple(map, prefix + "LogTimeStart", this.LogTimeStart);
        this.setParamSimple(map, prefix + "LogTimeEnd", this.LogTimeEnd);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);

    }
}

