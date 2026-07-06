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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmShieldRequest extends AbstractModel {

    /**
    * <p>模块名，这里填“monitor”</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>屏蔽策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>监控类型</p>
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * <p>命名空间即策略类型</p>
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * <p>屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽</p>
    */
    @SerializedName("ShieldTimeType")
    @Expose
    private String ShieldTimeType;

    /**
    * <p>屏蔽对象</p>
    */
    @SerializedName("ShieldObject")
    @Expose
    private String [] ShieldObject;

    /**
    * <p>屏蔽指标 为空则为全部指标</p>
    */
    @SerializedName("ShieldMetric")
    @Expose
    private String [] ShieldMetric;

    /**
    * <p>开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>循环开始日期 2022/04/01 缺省:0</p>
    */
    @SerializedName("LoopStartDate")
    @Expose
    private Long LoopStartDate;

    /**
    * <p>循环结束日期 2022/04/05 缺省:0</p>
    */
    @SerializedName("LoopEndDate")
    @Expose
    private Long LoopEndDate;

    /**
    * <p>需要屏蔽的策略ID</p>
    */
    @SerializedName("ShieldPolicyId")
    @Expose
    private String ShieldPolicyId;

    /**
    * <p>需要屏蔽的告警等级，取值范围Warn,Remind,Serious</p>
    */
    @SerializedName("ShieldAlarmLevel")
    @Expose
    private String [] ShieldAlarmLevel;

    /**
    * <p>屏蔽类型，为OBJNAME是实例屏蔽，为POLICY是策略屏蔽</p>
    */
    @SerializedName("VersionTag")
    @Expose
    private String VersionTag;

    /**
    * <p>屏蔽规则的描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>时区，东八区+8，西八区减8，以此类推</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private Float TimeZone;

    /**
    * <p>屏蔽事件 为空则为全部指标</p>
    */
    @SerializedName("ShieldEvent")
    @Expose
    private String [] ShieldEvent;

    /**
    * <p>是否对指标屏蔽 1=是 0=否</p>
    */
    @SerializedName("ShieldMetricFlag")
    @Expose
    private Long ShieldMetricFlag;

    /**
    * <p>是否对事件屏蔽 1=是 0=否</p>
    */
    @SerializedName("ShieldEventFlag")
    @Expose
    private Long ShieldEventFlag;

    /**
     * Get <p>模块名，这里填“monitor”</p> 
     * @return Module <p>模块名，这里填“monitor”</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块名，这里填“monitor”</p>
     * @param Module <p>模块名，这里填“monitor”</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>屏蔽策略名称</p> 
     * @return Name <p>屏蔽策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>屏蔽策略名称</p>
     * @param Name <p>屏蔽策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>监控类型</p> 
     * @return MonitorType <p>监控类型</p>
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控类型</p>
     * @param MonitorType <p>监控类型</p>
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>命名空间即策略类型</p> 
     * @return NameSpace <p>命名空间即策略类型</p>
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set <p>命名空间即策略类型</p>
     * @param NameSpace <p>命名空间即策略类型</p>
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get <p>屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽</p> 
     * @return ShieldTimeType <p>屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽</p>
     */
    public String getShieldTimeType() {
        return this.ShieldTimeType;
    }

    /**
     * Set <p>屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽</p>
     * @param ShieldTimeType <p>屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽</p>
     */
    public void setShieldTimeType(String ShieldTimeType) {
        this.ShieldTimeType = ShieldTimeType;
    }

    /**
     * Get <p>屏蔽对象</p> 
     * @return ShieldObject <p>屏蔽对象</p>
     */
    public String [] getShieldObject() {
        return this.ShieldObject;
    }

    /**
     * Set <p>屏蔽对象</p>
     * @param ShieldObject <p>屏蔽对象</p>
     */
    public void setShieldObject(String [] ShieldObject) {
        this.ShieldObject = ShieldObject;
    }

    /**
     * Get <p>屏蔽指标 为空则为全部指标</p> 
     * @return ShieldMetric <p>屏蔽指标 为空则为全部指标</p>
     */
    public String [] getShieldMetric() {
        return this.ShieldMetric;
    }

    /**
     * Set <p>屏蔽指标 为空则为全部指标</p>
     * @param ShieldMetric <p>屏蔽指标 为空则为全部指标</p>
     */
    public void setShieldMetric(String [] ShieldMetric) {
        this.ShieldMetric = ShieldMetric;
    }

    /**
     * Get <p>开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0</p> 
     * @return StartTime <p>开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0</p>
     * @param StartTime <p>开始时间 相对时间范围:36000 绝对时间范围:1648742400 缺省:0</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0</p> 
     * @return EndTime <p>结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0</p>
     * @param EndTime <p>结束时间 相对时间范围:72000 绝对时间范围:1649088000 缺省:0</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>循环开始日期 2022/04/01 缺省:0</p> 
     * @return LoopStartDate <p>循环开始日期 2022/04/01 缺省:0</p>
     */
    public Long getLoopStartDate() {
        return this.LoopStartDate;
    }

    /**
     * Set <p>循环开始日期 2022/04/01 缺省:0</p>
     * @param LoopStartDate <p>循环开始日期 2022/04/01 缺省:0</p>
     */
    public void setLoopStartDate(Long LoopStartDate) {
        this.LoopStartDate = LoopStartDate;
    }

    /**
     * Get <p>循环结束日期 2022/04/05 缺省:0</p> 
     * @return LoopEndDate <p>循环结束日期 2022/04/05 缺省:0</p>
     */
    public Long getLoopEndDate() {
        return this.LoopEndDate;
    }

    /**
     * Set <p>循环结束日期 2022/04/05 缺省:0</p>
     * @param LoopEndDate <p>循环结束日期 2022/04/05 缺省:0</p>
     */
    public void setLoopEndDate(Long LoopEndDate) {
        this.LoopEndDate = LoopEndDate;
    }

    /**
     * Get <p>需要屏蔽的策略ID</p> 
     * @return ShieldPolicyId <p>需要屏蔽的策略ID</p>
     */
    public String getShieldPolicyId() {
        return this.ShieldPolicyId;
    }

    /**
     * Set <p>需要屏蔽的策略ID</p>
     * @param ShieldPolicyId <p>需要屏蔽的策略ID</p>
     */
    public void setShieldPolicyId(String ShieldPolicyId) {
        this.ShieldPolicyId = ShieldPolicyId;
    }

    /**
     * Get <p>需要屏蔽的告警等级，取值范围Warn,Remind,Serious</p> 
     * @return ShieldAlarmLevel <p>需要屏蔽的告警等级，取值范围Warn,Remind,Serious</p>
     */
    public String [] getShieldAlarmLevel() {
        return this.ShieldAlarmLevel;
    }

    /**
     * Set <p>需要屏蔽的告警等级，取值范围Warn,Remind,Serious</p>
     * @param ShieldAlarmLevel <p>需要屏蔽的告警等级，取值范围Warn,Remind,Serious</p>
     */
    public void setShieldAlarmLevel(String [] ShieldAlarmLevel) {
        this.ShieldAlarmLevel = ShieldAlarmLevel;
    }

    /**
     * Get <p>屏蔽类型，为OBJNAME是实例屏蔽，为POLICY是策略屏蔽</p> 
     * @return VersionTag <p>屏蔽类型，为OBJNAME是实例屏蔽，为POLICY是策略屏蔽</p>
     */
    public String getVersionTag() {
        return this.VersionTag;
    }

    /**
     * Set <p>屏蔽类型，为OBJNAME是实例屏蔽，为POLICY是策略屏蔽</p>
     * @param VersionTag <p>屏蔽类型，为OBJNAME是实例屏蔽，为POLICY是策略屏蔽</p>
     */
    public void setVersionTag(String VersionTag) {
        this.VersionTag = VersionTag;
    }

    /**
     * Get <p>屏蔽规则的描述</p> 
     * @return Description <p>屏蔽规则的描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>屏蔽规则的描述</p>
     * @param Description <p>屏蔽规则的描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>时区，东八区+8，西八区减8，以此类推</p> 
     * @return TimeZone <p>时区，东八区+8，西八区减8，以此类推</p>
     */
    public Float getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>时区，东八区+8，西八区减8，以此类推</p>
     * @param TimeZone <p>时区，东八区+8，西八区减8，以此类推</p>
     */
    public void setTimeZone(Float TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>屏蔽事件 为空则为全部指标</p> 
     * @return ShieldEvent <p>屏蔽事件 为空则为全部指标</p>
     */
    public String [] getShieldEvent() {
        return this.ShieldEvent;
    }

    /**
     * Set <p>屏蔽事件 为空则为全部指标</p>
     * @param ShieldEvent <p>屏蔽事件 为空则为全部指标</p>
     */
    public void setShieldEvent(String [] ShieldEvent) {
        this.ShieldEvent = ShieldEvent;
    }

    /**
     * Get <p>是否对指标屏蔽 1=是 0=否</p> 
     * @return ShieldMetricFlag <p>是否对指标屏蔽 1=是 0=否</p>
     */
    public Long getShieldMetricFlag() {
        return this.ShieldMetricFlag;
    }

    /**
     * Set <p>是否对指标屏蔽 1=是 0=否</p>
     * @param ShieldMetricFlag <p>是否对指标屏蔽 1=是 0=否</p>
     */
    public void setShieldMetricFlag(Long ShieldMetricFlag) {
        this.ShieldMetricFlag = ShieldMetricFlag;
    }

    /**
     * Get <p>是否对事件屏蔽 1=是 0=否</p> 
     * @return ShieldEventFlag <p>是否对事件屏蔽 1=是 0=否</p>
     */
    public Long getShieldEventFlag() {
        return this.ShieldEventFlag;
    }

    /**
     * Set <p>是否对事件屏蔽 1=是 0=否</p>
     * @param ShieldEventFlag <p>是否对事件屏蔽 1=是 0=否</p>
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

