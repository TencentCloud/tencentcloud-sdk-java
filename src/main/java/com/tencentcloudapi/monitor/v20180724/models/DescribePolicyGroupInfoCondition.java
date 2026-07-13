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

public class DescribePolicyGroupInfoCondition extends AbstractModel {

    /**
    * <p>指标名称</p>
    */
    @SerializedName("MetricShowName")
    @Expose
    private String MetricShowName;

    /**
    * <p>数据聚合周期(单位秒)</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>指标id</p>
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * <p>阈值规则id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>指标单位</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>告警发送收敛类型。0连续告警，1指数告警</p>
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p>
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcType")
    @Expose
    private Long CalcType;

    /**
    * <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * <p>持续多长时间触发规则会告警(单位秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinueTime")
    @Expose
    private Long ContinueTime;

    /**
    * <p>告警指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get <p>指标名称</p> 
     * @return MetricShowName <p>指标名称</p>
     */
    public String getMetricShowName() {
        return this.MetricShowName;
    }

    /**
     * Set <p>指标名称</p>
     * @param MetricShowName <p>指标名称</p>
     */
    public void setMetricShowName(String MetricShowName) {
        this.MetricShowName = MetricShowName;
    }

    /**
     * Get <p>数据聚合周期(单位秒)</p> 
     * @return Period <p>数据聚合周期(单位秒)</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>数据聚合周期(单位秒)</p>
     * @param Period <p>数据聚合周期(单位秒)</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>指标id</p> 
     * @return MetricId <p>指标id</p>
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set <p>指标id</p>
     * @param MetricId <p>指标id</p>
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get <p>阈值规则id</p> 
     * @return RuleId <p>阈值规则id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>阈值规则id</p>
     * @param RuleId <p>阈值规则id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>指标单位</p> 
     * @return Unit <p>指标单位</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>指标单位</p>
     * @param Unit <p>指标单位</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>告警发送收敛类型。0连续告警，1指数告警</p> 
     * @return AlarmNotifyType <p>告警发送收敛类型。0连续告警，1指数告警</p>
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set <p>告警发送收敛类型。0连续告警，1指数告警</p>
     * @param AlarmNotifyType <p>告警发送收敛类型。0连续告警，1指数告警</p>
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p> 
     * @return AlarmNotifyPeriod <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p>
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p>
     * @param AlarmNotifyPeriod <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p>
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcType <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCalcType() {
        return this.CalcType;
    }

    /**
     * Set <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcType <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcType(Long CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcValue <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcValue <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get <p>持续多长时间触发规则会告警(单位秒)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinueTime <p>持续多长时间触发规则会告警(单位秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set <p>持续多长时间触发规则会告警(单位秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinueTime <p>持续多长时间触发规则会告警(单位秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinueTime(Long ContinueTime) {
        this.ContinueTime = ContinueTime;
    }

    /**
     * Get <p>告警指标名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName <p>告警指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>告警指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName <p>告警指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    public DescribePolicyGroupInfoCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupInfoCondition(DescribePolicyGroupInfoCondition source) {
        if (source.MetricShowName != null) {
            this.MetricShowName = new String(source.MetricShowName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new Long(source.AlarmNotifyType);
        }
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new Long(source.AlarmNotifyPeriod);
        }
        if (source.CalcType != null) {
            this.CalcType = new Long(source.CalcType);
        }
        if (source.CalcValue != null) {
            this.CalcValue = new String(source.CalcValue);
        }
        if (source.ContinueTime != null) {
            this.ContinueTime = new Long(source.ContinueTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricShowName", this.MetricShowName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcValue", this.CalcValue);
        this.setParamSimple(map, prefix + "ContinueTime", this.ContinueTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);

    }
}

