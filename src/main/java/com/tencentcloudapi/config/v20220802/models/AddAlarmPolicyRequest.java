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
    * 告警策略名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件范围  1：当前账号  2：多账号
    */
    @SerializedName("EventScope")
    @Expose
    private Long [] EventScope;

    /**
    * 风险等级 1：高风险  2：中风险 3：低风险
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * 通知时间段
    */
    @SerializedName("NoticeTime")
    @Expose
    private String NoticeTime;

    /**
    * 通知机制
    */
    @SerializedName("NotificationMechanism")
    @Expose
    private String NotificationMechanism;

    /**
    * 状态 1：启用 2：停用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 通知周期
    */
    @SerializedName("NoticePeriod")
    @Expose
    private Long [] NoticePeriod;

    /**
    * 策略描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 告警策略名 
     * @return Name 告警策略名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警策略名
     * @param Name 告警策略名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件范围  1：当前账号  2：多账号 
     * @return EventScope 事件范围  1：当前账号  2：多账号
     */
    public Long [] getEventScope() {
        return this.EventScope;
    }

    /**
     * Set 事件范围  1：当前账号  2：多账号
     * @param EventScope 事件范围  1：当前账号  2：多账号
     */
    public void setEventScope(Long [] EventScope) {
        this.EventScope = EventScope;
    }

    /**
     * Get 风险等级 1：高风险  2：中风险 3：低风险 
     * @return RiskLevel 风险等级 1：高风险  2：中风险 3：低风险
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级 1：高风险  2：中风险 3：低风险
     * @param RiskLevel 风险等级 1：高风险  2：中风险 3：低风险
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 通知时间段 
     * @return NoticeTime 通知时间段
     */
    public String getNoticeTime() {
        return this.NoticeTime;
    }

    /**
     * Set 通知时间段
     * @param NoticeTime 通知时间段
     */
    public void setNoticeTime(String NoticeTime) {
        this.NoticeTime = NoticeTime;
    }

    /**
     * Get 通知机制 
     * @return NotificationMechanism 通知机制
     */
    public String getNotificationMechanism() {
        return this.NotificationMechanism;
    }

    /**
     * Set 通知机制
     * @param NotificationMechanism 通知机制
     */
    public void setNotificationMechanism(String NotificationMechanism) {
        this.NotificationMechanism = NotificationMechanism;
    }

    /**
     * Get 状态 1：启用 2：停用 
     * @return Status 状态 1：启用 2：停用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 1：启用 2：停用
     * @param Status 状态 1：启用 2：停用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 通知周期 
     * @return NoticePeriod 通知周期
     */
    public Long [] getNoticePeriod() {
        return this.NoticePeriod;
    }

    /**
     * Set 通知周期
     * @param NoticePeriod 通知周期
     */
    public void setNoticePeriod(Long [] NoticePeriod) {
        this.NoticePeriod = NoticePeriod;
    }

    /**
     * Get 策略描述 
     * @return Description 策略描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
     * @param Description 策略描述
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
        this.setParamArraySimple(map, prefix + "EventScope.", this.EventScope);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamSimple(map, prefix + "NoticeTime", this.NoticeTime);
        this.setParamSimple(map, prefix + "NotificationMechanism", this.NotificationMechanism);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "NoticePeriod.", this.NoticePeriod);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

