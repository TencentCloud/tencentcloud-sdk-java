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

public class RegisterDsEventRequest extends AbstractModel {

    /**
    * 项目ID
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
    * 事件周期类型 1、分钟：MIN    2、小时 ：HOUR    3、天：DAY	
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 事件存活时间，值为大于0的整数
    */
    @SerializedName("TimeToLive")
    @Expose
    private String TimeToLive;

    /**
    * 事件存活时间单位	1、天：DAYS    2、分钟：MINUTES
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 事件所属人，账号昵称	
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 事件描述
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
    * 事件消费有效次数
    */
    @SerializedName("ValidConsumeCount")
    @Expose
    private Long ValidConsumeCount;

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
     * Get 事件周期类型 1、分钟：MIN    2、小时 ：HOUR    3、天：DAY	 
     * @return EventSubType 事件周期类型 1、分钟：MIN    2、小时 ：HOUR    3、天：DAY	
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件周期类型 1、分钟：MIN    2、小时 ：HOUR    3、天：DAY	
     * @param EventSubType 事件周期类型 1、分钟：MIN    2、小时 ：HOUR    3、天：DAY	
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 事件存活时间，值为大于0的整数 
     * @return TimeToLive 事件存活时间，值为大于0的整数
     */
    public String getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set 事件存活时间，值为大于0的整数
     * @param TimeToLive 事件存活时间，值为大于0的整数
     */
    public void setTimeToLive(String TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get 事件存活时间单位	1、天：DAYS    2、分钟：MINUTES 
     * @return TimeUnit 事件存活时间单位	1、天：DAYS    2、分钟：MINUTES
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 事件存活时间单位	1、天：DAYS    2、分钟：MINUTES
     * @param TimeUnit 事件存活时间单位	1、天：DAYS    2、分钟：MINUTES
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 事件所属人，账号昵称	 
     * @return Owner 事件所属人，账号昵称	
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 事件所属人，账号昵称	
     * @param Owner 事件所属人，账号昵称	
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 事件描述 
     * @return Description 事件描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件描述
     * @param Description 事件描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 事件类型GENERAL、TIME_SERIES 
     * @return EventType 事件类型GENERAL、TIME_SERIES
     * @deprecated
     */
    @Deprecated
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型GENERAL、TIME_SERIES
     * @param EventType 事件类型GENERAL、TIME_SERIES
     * @deprecated
     */
    @Deprecated
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件广播类型SINGLE、BROADCAST	 
     * @return EventBroadcastType 事件广播类型SINGLE、BROADCAST	
     * @deprecated
     */
    @Deprecated
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set 事件广播类型SINGLE、BROADCAST	
     * @param EventBroadcastType 事件广播类型SINGLE、BROADCAST	
     * @deprecated
     */
    @Deprecated
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get 时间格式	 
     * @return DimensionFormat 时间格式	
     * @deprecated
     */
    @Deprecated
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set 时间格式	
     * @param DimensionFormat 时间格式	
     * @deprecated
     */
    @Deprecated
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    /**
     * Get 事件消费有效次数 
     * @return ValidConsumeCount 事件消费有效次数
     */
    public Long getValidConsumeCount() {
        return this.ValidConsumeCount;
    }

    /**
     * Set 事件消费有效次数
     * @param ValidConsumeCount 事件消费有效次数
     */
    public void setValidConsumeCount(Long ValidConsumeCount) {
        this.ValidConsumeCount = ValidConsumeCount;
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
        if (source.ValidConsumeCount != null) {
            this.ValidConsumeCount = new Long(source.ValidConsumeCount);
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
        this.setParamSimple(map, prefix + "ValidConsumeCount", this.ValidConsumeCount);

    }
}

