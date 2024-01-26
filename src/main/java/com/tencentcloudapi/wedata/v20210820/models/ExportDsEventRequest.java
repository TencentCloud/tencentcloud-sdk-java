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

public class ExportDsEventRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * cos地址
    */
    @SerializedName("OriginDomain")
    @Expose
    private String OriginDomain;

    /**
    * 事件范围 ALL、PUBLISH、PARTIAL
    */
    @SerializedName("Range")
    @Expose
    private String Range;

    /**
    * 事件名称列表,用于发布管理导出
    */
    @SerializedName("EventNames")
    @Expose
    private String [] EventNames;

    /**
    * 事件列表
    */
    @SerializedName("Events")
    @Expose
    private EventDsDto [] Events;

    /**
    * 增量发布事件
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 文件标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

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
     * Get cos地址 
     * @return OriginDomain cos地址
     */
    public String getOriginDomain() {
        return this.OriginDomain;
    }

    /**
     * Set cos地址
     * @param OriginDomain cos地址
     */
    public void setOriginDomain(String OriginDomain) {
        this.OriginDomain = OriginDomain;
    }

    /**
     * Get 事件范围 ALL、PUBLISH、PARTIAL 
     * @return Range 事件范围 ALL、PUBLISH、PARTIAL
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set 事件范围 ALL、PUBLISH、PARTIAL
     * @param Range 事件范围 ALL、PUBLISH、PARTIAL
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    /**
     * Get 事件名称列表,用于发布管理导出 
     * @return EventNames 事件名称列表,用于发布管理导出
     */
    public String [] getEventNames() {
        return this.EventNames;
    }

    /**
     * Set 事件名称列表,用于发布管理导出
     * @param EventNames 事件名称列表,用于发布管理导出
     */
    public void setEventNames(String [] EventNames) {
        this.EventNames = EventNames;
    }

    /**
     * Get 事件列表 
     * @return Events 事件列表
     */
    public EventDsDto [] getEvents() {
        return this.Events;
    }

    /**
     * Set 事件列表
     * @param Events 事件列表
     */
    public void setEvents(EventDsDto [] Events) {
        this.Events = Events;
    }

    /**
     * Get 增量发布事件 
     * @return PublishTime 增量发布事件
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 增量发布事件
     * @param PublishTime 增量发布事件
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 文件标题 
     * @return Title 文件标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 文件标题
     * @param Title 文件标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public ExportDsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportDsEventRequest(ExportDsEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.OriginDomain != null) {
            this.OriginDomain = new String(source.OriginDomain);
        }
        if (source.Range != null) {
            this.Range = new String(source.Range);
        }
        if (source.EventNames != null) {
            this.EventNames = new String[source.EventNames.length];
            for (int i = 0; i < source.EventNames.length; i++) {
                this.EventNames[i] = new String(source.EventNames[i]);
            }
        }
        if (source.Events != null) {
            this.Events = new EventDsDto[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new EventDsDto(source.Events[i]);
            }
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OriginDomain", this.OriginDomain);
        this.setParamSimple(map, prefix + "Range", this.Range);
        this.setParamArraySimple(map, prefix + "EventNames.", this.EventNames);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

