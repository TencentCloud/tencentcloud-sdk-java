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

public class RegisterDsEventRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件分割类型 SECOND、MIN、HOUR、DAY	
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 存活时间	
    */
    @SerializedName("TimeToLive")
    @Expose
    private String TimeToLive;

    /**
    * 存活时间单位	
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 事件所属人	
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 事件类型GENERAL、TIME_SERIES
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 事件广播类型SINGLE、BROADCAST	
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * 时间格式	
    */
    @SerializedName("DimensionFormat")
    @Expose
    private String DimensionFormat;

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
     * Get 事件名称 
     * @return Name 事件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名称
     * @param Name 事件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件分割类型 SECOND、MIN、HOUR、DAY	 
     * @return EventSubType 事件分割类型 SECOND、MIN、HOUR、DAY	
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件分割类型 SECOND、MIN、HOUR、DAY	
     * @param EventSubType 事件分割类型 SECOND、MIN、HOUR、DAY	
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 存活时间	 
     * @return TimeToLive 存活时间	
     */
    public String getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set 存活时间	
     * @param TimeToLive 存活时间	
     */
    public void setTimeToLive(String TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get 存活时间单位	 
     * @return TimeUnit 存活时间单位	
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 存活时间单位	
     * @param TimeUnit 存活时间单位	
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 事件所属人	 
     * @return Owner 事件所属人	
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 事件所属人	
     * @param Owner 事件所属人	
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 事件广播类型SINGLE、BROADCAST	 
     * @return EventBroadcastType 事件广播类型SINGLE、BROADCAST	
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set 事件广播类型SINGLE、BROADCAST	
     * @param EventBroadcastType 事件广播类型SINGLE、BROADCAST	
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get 时间格式	 
     * @return DimensionFormat 时间格式	
     */
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set 时间格式	
     * @param DimensionFormat 时间格式	
     */
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    public RegisterDsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterDsEventRequest(RegisterDsEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new String(source.TimeToLive);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.DimensionFormat != null) {
            this.DimensionFormat = new String(source.DimensionFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "DimensionFormat", this.DimensionFormat);

    }
}

