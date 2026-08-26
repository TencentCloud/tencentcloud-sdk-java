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

public class DescribeAlarmHistoryShieldResponse extends AbstractModel {

    /**
    * 告警屏蔽规则的ID
    */
    @SerializedName("ShieldId")
    @Expose
    private String ShieldId;

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 屏蔽策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否开启 1=开启 0=关闭
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 监控类型展示名称
    */
    @SerializedName("MonitorTypeShowName")
    @Expose
    private String MonitorTypeShowName;

    /**
    * 命名空间即策略类型
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * 策略类型展示名称
    */
    @SerializedName("NameSpaceShowName")
    @Expose
    private String NameSpaceShowName;

    /**
    * 屏蔽对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShieldObject")
    @Expose
    private String [] ShieldObject;

    /**
    * 屏蔽指标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShieldMetric")
    @Expose
    private ShieldMetric [] ShieldMetric;

    /**
    * 屏蔽时间类型 FOREVER_SHIELD:永久屏蔽 PERIOD_SHIELD:绝对时间范围屏蔽 LOOP_SHIELD:相对时间范围屏蔽
    */
    @SerializedName("ShieldTimeType")
    @Expose
    private String ShieldTimeType;

    /**
    * 开始时间 10:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间 20:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 循环开始日期 2022/04/01
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoopStartDate")
    @Expose
    private Long LoopStartDate;

    /**
    * 循环结束日期 2022/04/05
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoopEndDate")
    @Expose
    private Long LoopEndDate;

    /**
    * NOT_TRIGGERED:未生效 TRIGGERING:生效中 EXPIRED:已过期
    */
    @SerializedName("CurrentStatus")
    @Expose
    private String CurrentStatus;

    /**
    * 需要屏蔽的策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShieldPolicyId")
    @Expose
    private String ShieldPolicyId;

    /**
    * 需要屏蔽的告警等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShieldAlarmLevel")
    @Expose
    private String [] ShieldAlarmLevel;

    /**
    * 屏蔽类型，1为维度屏蔽，0为实例名称屏蔽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShieldTag")
    @Expose
    private String ShieldTag;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private Float TimeZone;

    /**
    * 告警历史会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 告警屏蔽规则的ID 
     * @return ShieldId 告警屏蔽规则的ID
     */
    public String getShieldId() {
        return this.ShieldId;
    }

    /**
     * Set 告警屏蔽规则的ID
     * @param ShieldId 告警屏蔽规则的ID
     */
    public void setShieldId(String ShieldId) {
        this.ShieldId = ShieldId;
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
     * Get 是否开启 1=开启 0=关闭 
     * @return Enable 是否开启 1=开启 0=关闭
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启 1=开启 0=关闭
     * @param Enable 是否开启 1=开启 0=关闭
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 监控类型展示名称 
     * @return MonitorTypeShowName 监控类型展示名称
     */
    public String getMonitorTypeShowName() {
        return this.MonitorTypeShowName;
    }

    /**
     * Set 监控类型展示名称
     * @param MonitorTypeShowName 监控类型展示名称
     */
    public void setMonitorTypeShowName(String MonitorTypeShowName) {
        this.MonitorTypeShowName = MonitorTypeShowName;
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
     * Get 策略类型展示名称 
     * @return NameSpaceShowName 策略类型展示名称
     */
    public String getNameSpaceShowName() {
        return this.NameSpaceShowName;
    }

    /**
     * Set 策略类型展示名称
     * @param NameSpaceShowName 策略类型展示名称
     */
    public void setNameSpaceShowName(String NameSpaceShowName) {
        this.NameSpaceShowName = NameSpaceShowName;
    }

    /**
     * Get 屏蔽对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShieldObject 屏蔽对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getShieldObject() {
        return this.ShieldObject;
    }

    /**
     * Set 屏蔽对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShieldObject 屏蔽对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShieldObject(String [] ShieldObject) {
        this.ShieldObject = ShieldObject;
    }

    /**
     * Get 屏蔽指标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShieldMetric 屏蔽指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ShieldMetric [] getShieldMetric() {
        return this.ShieldMetric;
    }

    /**
     * Set 屏蔽指标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShieldMetric 屏蔽指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShieldMetric(ShieldMetric [] ShieldMetric) {
        this.ShieldMetric = ShieldMetric;
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
     * Get 开始时间 10:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间 10:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间 10:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间 10:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 20:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间 20:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间 20:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间 20:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 循环开始日期 2022/04/01
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoopStartDate 循环开始日期 2022/04/01
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLoopStartDate() {
        return this.LoopStartDate;
    }

    /**
     * Set 循环开始日期 2022/04/01
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoopStartDate 循环开始日期 2022/04/01
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoopStartDate(Long LoopStartDate) {
        this.LoopStartDate = LoopStartDate;
    }

    /**
     * Get 循环结束日期 2022/04/05
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoopEndDate 循环结束日期 2022/04/05
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLoopEndDate() {
        return this.LoopEndDate;
    }

    /**
     * Set 循环结束日期 2022/04/05
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoopEndDate 循环结束日期 2022/04/05
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoopEndDate(Long LoopEndDate) {
        this.LoopEndDate = LoopEndDate;
    }

    /**
     * Get NOT_TRIGGERED:未生效 TRIGGERING:生效中 EXPIRED:已过期 
     * @return CurrentStatus NOT_TRIGGERED:未生效 TRIGGERING:生效中 EXPIRED:已过期
     */
    public String getCurrentStatus() {
        return this.CurrentStatus;
    }

    /**
     * Set NOT_TRIGGERED:未生效 TRIGGERING:生效中 EXPIRED:已过期
     * @param CurrentStatus NOT_TRIGGERED:未生效 TRIGGERING:生效中 EXPIRED:已过期
     */
    public void setCurrentStatus(String CurrentStatus) {
        this.CurrentStatus = CurrentStatus;
    }

    /**
     * Get 需要屏蔽的策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShieldPolicyId 需要屏蔽的策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShieldPolicyId() {
        return this.ShieldPolicyId;
    }

    /**
     * Set 需要屏蔽的策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShieldPolicyId 需要屏蔽的策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShieldPolicyId(String ShieldPolicyId) {
        this.ShieldPolicyId = ShieldPolicyId;
    }

    /**
     * Get 需要屏蔽的告警等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShieldAlarmLevel 需要屏蔽的告警等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getShieldAlarmLevel() {
        return this.ShieldAlarmLevel;
    }

    /**
     * Set 需要屏蔽的告警等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShieldAlarmLevel 需要屏蔽的告警等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShieldAlarmLevel(String [] ShieldAlarmLevel) {
        this.ShieldAlarmLevel = ShieldAlarmLevel;
    }

    /**
     * Get 屏蔽类型，1为维度屏蔽，0为实例名称屏蔽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShieldTag 屏蔽类型，1为维度屏蔽，0为实例名称屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShieldTag() {
        return this.ShieldTag;
    }

    /**
     * Set 屏蔽类型，1为维度屏蔽，0为实例名称屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShieldTag 屏蔽类型，1为维度屏蔽，0为实例名称屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShieldTag(String ShieldTag) {
        this.ShieldTag = ShieldTag;
    }

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeZone(Float TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 告警历史会话ID 
     * @return SessionId 告警历史会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 告警历史会话ID
     * @param SessionId 告警历史会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAlarmHistoryShieldResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmHistoryShieldResponse(DescribeAlarmHistoryShieldResponse source) {
        if (source.ShieldId != null) {
            this.ShieldId = new String(source.ShieldId);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.MonitorTypeShowName != null) {
            this.MonitorTypeShowName = new String(source.MonitorTypeShowName);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.NameSpaceShowName != null) {
            this.NameSpaceShowName = new String(source.NameSpaceShowName);
        }
        if (source.ShieldObject != null) {
            this.ShieldObject = new String[source.ShieldObject.length];
            for (int i = 0; i < source.ShieldObject.length; i++) {
                this.ShieldObject[i] = new String(source.ShieldObject[i]);
            }
        }
        if (source.ShieldMetric != null) {
            this.ShieldMetric = new ShieldMetric[source.ShieldMetric.length];
            for (int i = 0; i < source.ShieldMetric.length; i++) {
                this.ShieldMetric[i] = new ShieldMetric(source.ShieldMetric[i]);
            }
        }
        if (source.ShieldTimeType != null) {
            this.ShieldTimeType = new String(source.ShieldTimeType);
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
        if (source.CurrentStatus != null) {
            this.CurrentStatus = new String(source.CurrentStatus);
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
        if (source.ShieldTag != null) {
            this.ShieldTag = new String(source.ShieldTag);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new Float(source.TimeZone);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShieldId", this.ShieldId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "MonitorTypeShowName", this.MonitorTypeShowName);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "NameSpaceShowName", this.NameSpaceShowName);
        this.setParamArraySimple(map, prefix + "ShieldObject.", this.ShieldObject);
        this.setParamArrayObj(map, prefix + "ShieldMetric.", this.ShieldMetric);
        this.setParamSimple(map, prefix + "ShieldTimeType", this.ShieldTimeType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LoopStartDate", this.LoopStartDate);
        this.setParamSimple(map, prefix + "LoopEndDate", this.LoopEndDate);
        this.setParamSimple(map, prefix + "CurrentStatus", this.CurrentStatus);
        this.setParamSimple(map, prefix + "ShieldPolicyId", this.ShieldPolicyId);
        this.setParamArraySimple(map, prefix + "ShieldAlarmLevel.", this.ShieldAlarmLevel);
        this.setParamSimple(map, prefix + "ShieldTag", this.ShieldTag);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

