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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddAlarmPolicyRequest extends AbstractModel {

    /**
    * <p>告警策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>事件类型 1：资源不合规事件</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>事件范围  1：当前账号  2：多账号</p>
    */
    @SerializedName("EventScope")
    @Expose
    private Long [] EventScope;

    /**
    * <p>风险等级 1：高风险  2：中风险 3：低风险</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * <p>通知时间段</p>
    */
    @SerializedName("NoticeTime")
    @Expose
    private String NoticeTime;

    /**
    * <p>通知机制</p>
    */
    @SerializedName("NotificationMechanism")
    @Expose
    private String NotificationMechanism;

    /**
    * <p>状态 1：启用 2：停用</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>通知周期</p>
    */
    @SerializedName("NoticePeriod")
    @Expose
    private Long [] NoticePeriod;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>告警策略名</p> 
     * @return Name <p>告警策略名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>告警策略名</p>
     * @param Name <p>告警策略名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>事件类型 1：资源不合规事件</p> 
     * @return Type <p>事件类型 1：资源不合规事件</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>事件类型 1：资源不合规事件</p>
     * @param Type <p>事件类型 1：资源不合规事件</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>事件范围  1：当前账号  2：多账号</p> 
     * @return EventScope <p>事件范围  1：当前账号  2：多账号</p>
     */
    public Long [] getEventScope() {
        return this.EventScope;
    }

    /**
     * Set <p>事件范围  1：当前账号  2：多账号</p>
     * @param EventScope <p>事件范围  1：当前账号  2：多账号</p>
     */
    public void setEventScope(Long [] EventScope) {
        this.EventScope = EventScope;
    }

    /**
     * Get <p>风险等级 1：高风险  2：中风险 3：低风险</p> 
     * @return RiskLevel <p>风险等级 1：高风险  2：中风险 3：低风险</p>
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级 1：高风险  2：中风险 3：低风险</p>
     * @param RiskLevel <p>风险等级 1：高风险  2：中风险 3：低风险</p>
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>通知时间段</p> 
     * @return NoticeTime <p>通知时间段</p>
     */
    public String getNoticeTime() {
        return this.NoticeTime;
    }

    /**
     * Set <p>通知时间段</p>
     * @param NoticeTime <p>通知时间段</p>
     */
    public void setNoticeTime(String NoticeTime) {
        this.NoticeTime = NoticeTime;
    }

    /**
     * Get <p>通知机制</p> 
     * @return NotificationMechanism <p>通知机制</p>
     */
    public String getNotificationMechanism() {
        return this.NotificationMechanism;
    }

    /**
     * Set <p>通知机制</p>
     * @param NotificationMechanism <p>通知机制</p>
     */
    public void setNotificationMechanism(String NotificationMechanism) {
        this.NotificationMechanism = NotificationMechanism;
    }

    /**
     * Get <p>状态 1：启用 2：停用</p> 
     * @return Status <p>状态 1：启用 2：停用</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态 1：启用 2：停用</p>
     * @param Status <p>状态 1：启用 2：停用</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>通知周期</p> 
     * @return NoticePeriod <p>通知周期</p>
     */
    public Long [] getNoticePeriod() {
        return this.NoticePeriod;
    }

    /**
     * Set <p>通知周期</p>
     * @param NoticePeriod <p>通知周期</p>
     */
    public void setNoticePeriod(Long [] NoticePeriod) {
        this.NoticePeriod = NoticePeriod;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AddAlarmPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAlarmPolicyRequest(AddAlarmPolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.EventScope != null) {
            this.EventScope = new Long[source.EventScope.length];
            for (int i = 0; i < source.EventScope.length; i++) {
                this.EventScope[i] = new Long(source.EventScope[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long[source.RiskLevel.length];
            for (int i = 0; i < source.RiskLevel.length; i++) {
                this.RiskLevel[i] = new Long(source.RiskLevel[i]);
            }
        }
        if (source.NoticeTime != null) {
            this.NoticeTime = new String(source.NoticeTime);
        }
        if (source.NotificationMechanism != null) {
            this.NotificationMechanism = new String(source.NotificationMechanism);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NoticePeriod != null) {
            this.NoticePeriod = new Long[source.NoticePeriod.length];
            for (int i = 0; i < source.NoticePeriod.length; i++) {
                this.NoticePeriod[i] = new Long(source.NoticePeriod[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "EventScope.", this.EventScope);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamSimple(map, prefix + "NoticeTime", this.NoticeTime);
        this.setParamSimple(map, prefix + "NotificationMechanism", this.NotificationMechanism);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "NoticePeriod.", this.NoticePeriod);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

