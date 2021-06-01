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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmRequest extends AbstractModel{

    /**
    * 告警策略ID。
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 告警策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 监控任务运行时间点。
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * 触发条件。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * 告警重复的周期。单位是分钟。取值范围是0~1440。
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * 关联的告警通知模板列表。
    */
    @SerializedName("AlarmNoticeIds")
    @Expose
    private String [] AlarmNoticeIds;

    /**
    * 监控对象列表。
    */
    @SerializedName("AlarmTargets")
    @Expose
    private AlarmTarget [] AlarmTargets;

    /**
    * 是否开启告警策略。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get 告警策略ID。 
     * @return AlarmId 告警策略ID。
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警策略ID。
     * @param AlarmId 告警策略ID。
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 告警策略名称 
     * @return Name 告警策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警策略名称
     * @param Name 告警策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 监控任务运行时间点。 
     * @return MonitorTime 监控任务运行时间点。
     */
    public MonitorTime getMonitorTime() {
        return this.MonitorTime;
    }

    /**
     * Set 监控任务运行时间点。
     * @param MonitorTime 监控任务运行时间点。
     */
    public void setMonitorTime(MonitorTime MonitorTime) {
        this.MonitorTime = MonitorTime;
    }

    /**
     * Get 触发条件。 
     * @return Condition 触发条件。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 触发条件。
     * @param Condition 触发条件。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。 
     * @return TriggerCount 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。
     * @param TriggerCount 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get 告警重复的周期。单位是分钟。取值范围是0~1440。 
     * @return AlarmPeriod 告警重复的周期。单位是分钟。取值范围是0~1440。
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set 告警重复的周期。单位是分钟。取值范围是0~1440。
     * @param AlarmPeriod 告警重复的周期。单位是分钟。取值范围是0~1440。
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get 关联的告警通知模板列表。 
     * @return AlarmNoticeIds 关联的告警通知模板列表。
     */
    public String [] getAlarmNoticeIds() {
        return this.AlarmNoticeIds;
    }

    /**
     * Set 关联的告警通知模板列表。
     * @param AlarmNoticeIds 关联的告警通知模板列表。
     */
    public void setAlarmNoticeIds(String [] AlarmNoticeIds) {
        this.AlarmNoticeIds = AlarmNoticeIds;
    }

    /**
     * Get 监控对象列表。 
     * @return AlarmTargets 监控对象列表。
     */
    public AlarmTarget [] getAlarmTargets() {
        return this.AlarmTargets;
    }

    /**
     * Set 监控对象列表。
     * @param AlarmTargets 监控对象列表。
     */
    public void setAlarmTargets(AlarmTarget [] AlarmTargets) {
        this.AlarmTargets = AlarmTargets;
    }

    /**
     * Get 是否开启告警策略。 
     * @return Status 是否开启告警策略。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 是否开启告警策略。
     * @param Status 是否开启告警策略。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public ModifyAlarmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmRequest(ModifyAlarmRequest source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MonitorTime != null) {
            this.MonitorTime = new MonitorTime(source.MonitorTime);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.AlarmPeriod != null) {
            this.AlarmPeriod = new Long(source.AlarmPeriod);
        }
        if (source.AlarmNoticeIds != null) {
            this.AlarmNoticeIds = new String[source.AlarmNoticeIds.length];
            for (int i = 0; i < source.AlarmNoticeIds.length; i++) {
                this.AlarmNoticeIds[i] = new String(source.AlarmNoticeIds[i]);
            }
        }
        if (source.AlarmTargets != null) {
            this.AlarmTargets = new AlarmTarget[source.AlarmTargets.length];
            for (int i = 0; i < source.AlarmTargets.length; i++) {
                this.AlarmTargets[i] = new AlarmTarget(source.AlarmTargets[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "MonitorTime.", this.MonitorTime);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArraySimple(map, prefix + "AlarmNoticeIds.", this.AlarmNoticeIds);
        this.setParamArrayObj(map, prefix + "AlarmTargets.", this.AlarmTargets);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

