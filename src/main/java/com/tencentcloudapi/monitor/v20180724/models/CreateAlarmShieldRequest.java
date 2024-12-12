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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmShieldRequest extends AbstractModel {

    /**
    * 模块名，这里填“monitor”
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 屏蔽策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 命名空间即策略类型
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * 屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽
    */
    @SerializedName("ShieldTimeType")
    @Expose
    private String ShieldTimeType;

    /**
    * 屏蔽对象
    */
    @SerializedName("ShieldObject")
    @Expose
    private String [] ShieldObject;

    /**
    * 屏蔽指标 为空则为全部指标
    */
    @SerializedName("ShieldMetric")
    @Expose
    private String [] ShieldMetric;

    /**
    * 开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 循环开始日期 2022/04/01 缺省:0
    */
    @SerializedName("LoopStartDate")
    @Expose
    private Long LoopStartDate;

    /**
    * 循环结束日期 2022/04/05 缺省:0
    */
    @SerializedName("LoopEndDate")
    @Expose
    private Long LoopEndDate;

    /**
    * 需要屏蔽的策略ID
    */
    @SerializedName("ShieldPolicyId")
    @Expose
    private String ShieldPolicyId;

    /**
    * 需要屏蔽的告警等级，取值范围Warn,Remind,Serious
    */
    @SerializedName("ShieldAlarmLevel")
    @Expose
    private String [] ShieldAlarmLevel;

    /**
    * 屏蔽类型，为OBJNAME是老版本实例名屏蔽，为POLICY是新版本维度匹配
    */
    @SerializedName("VersionTag")
    @Expose
    private String VersionTag;

    /**
    * 屏蔽规则的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    *  时区，东八区+8，西八区减8，以此类推

    */
    @SerializedName("TimeZone")
    @Expose
    private Float TimeZone;

    /**
    * 屏蔽事件 为空则为全部指标
    */
    @SerializedName("ShieldEvent")
    @Expose
    private String [] ShieldEvent;

    /**
    * 是否对指标屏蔽 1=是 0=否
    */
    @SerializedName("ShieldMetricFlag")
    @Expose
    private Long ShieldMetricFlag;

    /**
    * 是否对事件屏蔽 1=是 0=否
    */
    @SerializedName("ShieldEventFlag")
    @Expose
    private Long ShieldEventFlag;

    /**
     * Get 模块名，这里填“monitor” 
     * @return Module 模块名，这里填“monitor”
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，这里填“monitor”
     * @param Module 模块名，这里填“monitor”
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 屏蔽策略名称 
     * @return Name 屏蔽策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 屏蔽策略名称
     * @param Name 屏蔽策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 监控类型 
     * @return MonitorType 监控类型
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型
     * @param MonitorType 监控类型
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 命名空间即策略类型 
     * @return NameSpace 命名空间即策略类型
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set 命名空间即策略类型
     * @param NameSpace 命名空间即策略类型
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get 屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽 
     * @return ShieldTimeType 屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽
     */
    public String getShieldTimeType() {
        return this.ShieldTimeType;
    }

    /**
     * Set 屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽
     * @param ShieldTimeType 屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽
     */
    public void setShieldTimeType(String ShieldTimeType) {
        this.ShieldTimeType = ShieldTimeType;
    }

    /**
     * Get 屏蔽对象 
     * @return ShieldObject 屏蔽对象
     */
    public String [] getShieldObject() {
        return this.ShieldObject;
    }

    /**
     * Set 屏蔽对象
     * @param ShieldObject 屏蔽对象
     */
    public void setShieldObject(String [] ShieldObject) {
        this.ShieldObject = ShieldObject;
    }

    /**
     * Get 屏蔽指标 为空则为全部指标 
     * @return ShieldMetric 屏蔽指标 为空则为全部指标
     */
    public String [] getShieldMetric() {
        return this.ShieldMetric;
    }

    /**
     * Set 屏蔽指标 为空则为全部指标
     * @param ShieldMetric 屏蔽指标 为空则为全部指标
     */
    public void setShieldMetric(String [] ShieldMetric) {
        this.ShieldMetric = ShieldMetric;
    }

    /**
     * Get 开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0 
     * @return StartTime 开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0
     * @param StartTime 开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0 
     * @return EndTime 结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0
     * @param EndTime 结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 循环开始日期 2022/04/01 缺省:0 
     * @return LoopStartDate 循环开始日期 2022/04/01 缺省:0
     */
    public Long getLoopStartDate() {
        return this.LoopStartDate;
    }

    /**
     * Set 循环开始日期 2022/04/01 缺省:0
     * @param LoopStartDate 循环开始日期 2022/04/01 缺省:0
     */
    public void setLoopStartDate(Long LoopStartDate) {
        this.LoopStartDate = LoopStartDate;
    }

    /**
     * Get 循环结束日期 2022/04/05 缺省:0 
     * @return LoopEndDate 循环结束日期 2022/04/05 缺省:0
     */
    public Long getLoopEndDate() {
        return this.LoopEndDate;
    }

    /**
     * Set 循环结束日期 2022/04/05 缺省:0
     * @param LoopEndDate 循环结束日期 2022/04/05 缺省:0
     */
    public void setLoopEndDate(Long LoopEndDate) {
        this.LoopEndDate = LoopEndDate;
    }

    /**
     * Get 需要屏蔽的策略ID 
     * @return ShieldPolicyId 需要屏蔽的策略ID
     */
    public String getShieldPolicyId() {
        return this.ShieldPolicyId;
    }

    /**
     * Set 需要屏蔽的策略ID
     * @param ShieldPolicyId 需要屏蔽的策略ID
     */
    public void setShieldPolicyId(String ShieldPolicyId) {
        this.ShieldPolicyId = ShieldPolicyId;
    }

    /**
     * Get 需要屏蔽的告警等级，取值范围Warn,Remind,Serious 
     * @return ShieldAlarmLevel 需要屏蔽的告警等级，取值范围Warn,Remind,Serious
     */
    public String [] getShieldAlarmLevel() {
        return this.ShieldAlarmLevel;
    }

    /**
     * Set 需要屏蔽的告警等级，取值范围Warn,Remind,Serious
     * @param ShieldAlarmLevel 需要屏蔽的告警等级，取值范围Warn,Remind,Serious
     */
    public void setShieldAlarmLevel(String [] ShieldAlarmLevel) {
        this.ShieldAlarmLevel = ShieldAlarmLevel;
    }

    /**
     * Get 屏蔽类型，为OBJNAME是老版本实例名屏蔽，为POLICY是新版本维度匹配 
     * @return VersionTag 屏蔽类型，为OBJNAME是老版本实例名屏蔽，为POLICY是新版本维度匹配
     */
    public String getVersionTag() {
        return this.VersionTag;
    }

    /**
     * Set 屏蔽类型，为OBJNAME是老版本实例名屏蔽，为POLICY是新版本维度匹配
     * @param VersionTag 屏蔽类型，为OBJNAME是老版本实例名屏蔽，为POLICY是新版本维度匹配
     */
    public void setVersionTag(String VersionTag) {
        this.VersionTag = VersionTag;
    }

    /**
     * Get 屏蔽规则的描述 
     * @return Description 屏蔽规则的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 屏蔽规则的描述
     * @param Description 屏蔽规则的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  时区，东八区+8，西八区减8，以此类推
 
     * @return TimeZone  时区，东八区+8，西八区减8，以此类推

     */
    public Float getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set  时区，东八区+8，西八区减8，以此类推

     * @param TimeZone  时区，东八区+8，西八区减8，以此类推

     */
    public void setTimeZone(Float TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 屏蔽事件 为空则为全部指标 
     * @return ShieldEvent 屏蔽事件 为空则为全部指标
     */
    public String [] getShieldEvent() {
        return this.ShieldEvent;
    }

    /**
     * Set 屏蔽事件 为空则为全部指标
     * @param ShieldEvent 屏蔽事件 为空则为全部指标
     */
    public void setShieldEvent(String [] ShieldEvent) {
        this.ShieldEvent = ShieldEvent;
    }

    /**
     * Get 是否对指标屏蔽 1=是 0=否 
     * @return ShieldMetricFlag 是否对指标屏蔽 1=是 0=否
     */
    public Long getShieldMetricFlag() {
        return this.ShieldMetricFlag;
    }

    /**
     * Set 是否对指标屏蔽 1=是 0=否
     * @param ShieldMetricFlag 是否对指标屏蔽 1=是 0=否
     */
    public void setShieldMetricFlag(Long ShieldMetricFlag) {
        this.ShieldMetricFlag = ShieldMetricFlag;
    }

    /**
     * Get 是否对事件屏蔽 1=是 0=否 
     * @return ShieldEventFlag 是否对事件屏蔽 1=是 0=否
     */
    public Long getShieldEventFlag() {
        return this.ShieldEventFlag;
    }

    /**
     * Set 是否对事件屏蔽 1=是 0=否
     * @param ShieldEventFlag 是否对事件屏蔽 1=是 0=否
     */
    public void setShieldEventFlag(Long ShieldEventFlag) {
        this.ShieldEventFlag = ShieldEventFlag;
    }

    public CreateAlarmShieldRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmShieldRequest(CreateAlarmShieldRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.ShieldTimeType != null) {
            this.ShieldTimeType = new String(source.ShieldTimeType);
        }
        if (source.ShieldObject != null) {
            this.ShieldObject = new String[source.ShieldObject.length];
            for (int i = 0; i < source.ShieldObject.length; i++) {
                this.ShieldObject[i] = new String(source.ShieldObject[i]);
            }
        }
        if (source.ShieldMetric != null) {
            this.ShieldMetric = new String[source.ShieldMetric.length];
            for (int i = 0; i < source.ShieldMetric.length; i++) {
                this.ShieldMetric[i] = new String(source.ShieldMetric[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.LoopStartDate != null) {
            this.LoopStartDate = new Long(source.LoopStartDate);
        }
        if (source.LoopEndDate != null) {
            this.LoopEndDate = new Long(source.LoopEndDate);
        }
        if (source.ShieldPolicyId != null) {
            this.ShieldPolicyId = new String(source.ShieldPolicyId);
        }
        if (source.ShieldAlarmLevel != null) {
            this.ShieldAlarmLevel = new String[source.ShieldAlarmLevel.length];
            for (int i = 0; i < source.ShieldAlarmLevel.length; i++) {
                this.ShieldAlarmLevel[i] = new String(source.ShieldAlarmLevel[i]);
            }
        }
        if (source.VersionTag != null) {
            this.VersionTag = new String(source.VersionTag);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new Float(source.TimeZone);
        }
        if (source.ShieldEvent != null) {
            this.ShieldEvent = new String[source.ShieldEvent.length];
            for (int i = 0; i < source.ShieldEvent.length; i++) {
                this.ShieldEvent[i] = new String(source.ShieldEvent[i]);
            }
        }
        if (source.ShieldMetricFlag != null) {
            this.ShieldMetricFlag = new Long(source.ShieldMetricFlag);
        }
        if (source.ShieldEventFlag != null) {
            this.ShieldEventFlag = new Long(source.ShieldEventFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "ShieldTimeType", this.ShieldTimeType);
        this.setParamArraySimple(map, prefix + "ShieldObject.", this.ShieldObject);
        this.setParamArraySimple(map, prefix + "ShieldMetric.", this.ShieldMetric);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LoopStartDate", this.LoopStartDate);
        this.setParamSimple(map, prefix + "LoopEndDate", this.LoopEndDate);
        this.setParamSimple(map, prefix + "ShieldPolicyId", this.ShieldPolicyId);
        this.setParamArraySimple(map, prefix + "ShieldAlarmLevel.", this.ShieldAlarmLevel);
        this.setParamSimple(map, prefix + "VersionTag", this.VersionTag);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArraySimple(map, prefix + "ShieldEvent.", this.ShieldEvent);
        this.setParamSimple(map, prefix + "ShieldMetricFlag", this.ShieldMetricFlag);
        this.setParamSimple(map, prefix + "ShieldEventFlag", this.ShieldEventFlag);

    }
}

