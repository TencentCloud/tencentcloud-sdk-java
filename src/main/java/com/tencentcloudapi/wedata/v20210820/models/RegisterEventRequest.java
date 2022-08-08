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

public class RegisterEventRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件名称，支持英文、数字和下划线，最长20个字符, 不能以数字下划线开头。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件分割类型，周期类型: DAY，HOUR，MIN，SECOND
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 广播：BROADCAST,单播：SINGLE
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * 周期类型为天和小时为HOURS ，周期类型为分钟 ：MINUTES,周期类型为秒：SECONDS
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * TBDS 事件所属人
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 事件类型，默认值：TIME_SERIES
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 对应day： yyyyMMdd，对应HOUR：yyyyMMddHH，对应MIN：yyyyMMddHHmm，对应SECOND：yyyyMMddHHmmss
    */
    @SerializedName("DimensionFormat")
    @Expose
    private String DimensionFormat;

    /**
    * 存活时间
    */
    @SerializedName("TimeToLive")
    @Expose
    private Long TimeToLive;

    /**
    * 事件描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 事件名称，支持英文、数字和下划线，最长20个字符, 不能以数字下划线开头。 
     * @return Name 事件名称，支持英文、数字和下划线，最长20个字符, 不能以数字下划线开头。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名称，支持英文、数字和下划线，最长20个字符, 不能以数字下划线开头。
     * @param Name 事件名称，支持英文、数字和下划线，最长20个字符, 不能以数字下划线开头。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件分割类型，周期类型: DAY，HOUR，MIN，SECOND 
     * @return EventSubType 事件分割类型，周期类型: DAY，HOUR，MIN，SECOND
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件分割类型，周期类型: DAY，HOUR，MIN，SECOND
     * @param EventSubType 事件分割类型，周期类型: DAY，HOUR，MIN，SECOND
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 广播：BROADCAST,单播：SINGLE 
     * @return EventBroadcastType 广播：BROADCAST,单播：SINGLE
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set 广播：BROADCAST,单播：SINGLE
     * @param EventBroadcastType 广播：BROADCAST,单播：SINGLE
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get 周期类型为天和小时为HOURS ，周期类型为分钟 ：MINUTES,周期类型为秒：SECONDS 
     * @return TimeUnit 周期类型为天和小时为HOURS ，周期类型为分钟 ：MINUTES,周期类型为秒：SECONDS
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 周期类型为天和小时为HOURS ，周期类型为分钟 ：MINUTES,周期类型为秒：SECONDS
     * @param TimeUnit 周期类型为天和小时为HOURS ，周期类型为分钟 ：MINUTES,周期类型为秒：SECONDS
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get TBDS 事件所属人 
     * @return Owner TBDS 事件所属人
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set TBDS 事件所属人
     * @param Owner TBDS 事件所属人
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 事件类型，默认值：TIME_SERIES 
     * @return EventType 事件类型，默认值：TIME_SERIES
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型，默认值：TIME_SERIES
     * @param EventType 事件类型，默认值：TIME_SERIES
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 对应day： yyyyMMdd，对应HOUR：yyyyMMddHH，对应MIN：yyyyMMddHHmm，对应SECOND：yyyyMMddHHmmss 
     * @return DimensionFormat 对应day： yyyyMMdd，对应HOUR：yyyyMMddHH，对应MIN：yyyyMMddHHmm，对应SECOND：yyyyMMddHHmmss
     */
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set 对应day： yyyyMMdd，对应HOUR：yyyyMMddHH，对应MIN：yyyyMMddHHmm，对应SECOND：yyyyMMddHHmmss
     * @param DimensionFormat 对应day： yyyyMMdd，对应HOUR：yyyyMMddHH，对应MIN：yyyyMMddHHmm，对应SECOND：yyyyMMddHHmmss
     */
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    /**
     * Get 存活时间 
     * @return TimeToLive 存活时间
     */
    public Long getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set 存活时间
     * @param TimeToLive 存活时间
     */
    public void setTimeToLive(Long TimeToLive) {
        this.TimeToLive = TimeToLive;
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

    public RegisterEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterEventRequest(RegisterEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.DimensionFormat != null) {
            this.DimensionFormat = new String(source.DimensionFormat);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new Long(source.TimeToLive);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "DimensionFormat", this.DimensionFormat);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

