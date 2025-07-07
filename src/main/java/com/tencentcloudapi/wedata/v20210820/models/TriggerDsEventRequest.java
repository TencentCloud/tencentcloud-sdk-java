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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerDsEventRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件实例信息
    */
    @SerializedName("EventCaseList")
    @Expose
    private EventCaseDTO [] EventCaseList;

    /**
    * 事件实例信息(连续时间)
    */
    @SerializedName("EventBatchCaseList")
    @Expose
    private EventBatchCaseDTO [] EventBatchCaseList;

    /**
    * 触发时区
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

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
     * Get 事件实例信息 
     * @return EventCaseList 事件实例信息
     */
    public EventCaseDTO [] getEventCaseList() {
        return this.EventCaseList;
    }

    /**
     * Set 事件实例信息
     * @param EventCaseList 事件实例信息
     */
    public void setEventCaseList(EventCaseDTO [] EventCaseList) {
        this.EventCaseList = EventCaseList;
    }

    /**
     * Get 事件实例信息(连续时间) 
     * @return EventBatchCaseList 事件实例信息(连续时间)
     */
    public EventBatchCaseDTO [] getEventBatchCaseList() {
        return this.EventBatchCaseList;
    }

    /**
     * Set 事件实例信息(连续时间)
     * @param EventBatchCaseList 事件实例信息(连续时间)
     */
    public void setEventBatchCaseList(EventBatchCaseDTO [] EventBatchCaseList) {
        this.EventBatchCaseList = EventBatchCaseList;
    }

    /**
     * Get 触发时区 
     * @return ScheduleTimeZone 触发时区
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 触发时区
     * @param ScheduleTimeZone 触发时区
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    public TriggerDsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerDsEventRequest(TriggerDsEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EventCaseList != null) {
            this.EventCaseList = new EventCaseDTO[source.EventCaseList.length];
            for (int i = 0; i < source.EventCaseList.length; i++) {
                this.EventCaseList[i] = new EventCaseDTO(source.EventCaseList[i]);
            }
        }
        if (source.EventBatchCaseList != null) {
            this.EventBatchCaseList = new EventBatchCaseDTO[source.EventBatchCaseList.length];
            for (int i = 0; i < source.EventBatchCaseList.length; i++) {
                this.EventBatchCaseList[i] = new EventBatchCaseDTO(source.EventBatchCaseList[i]);
            }
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "EventCaseList.", this.EventCaseList);
        this.setParamArrayObj(map, prefix + "EventBatchCaseList.", this.EventBatchCaseList);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);

    }
}

