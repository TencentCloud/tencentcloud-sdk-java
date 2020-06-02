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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupInfoCondition extends AbstractModel{

    /**
    * 指标名称
    */
    @SerializedName("MetricShowName")
    @Expose
    private String MetricShowName;

    /**
    * 数据聚合周期(单位秒)
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 指标id
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * 阈值规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 指标单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 告警发送收敛类型。0连续告警，1指数告警
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcType")
    @Expose
    private Long CalcType;

    /**
    * 检测阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * 持续多长时间触发规则会告警(单位秒)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinueTime")
    @Expose
    private Long ContinueTime;

    /**
    * 告警指标名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get 指标名称 
     * @return MetricShowName 指标名称
     */
    public String getMetricShowName() {
        return this.MetricShowName;
    }

    /**
     * Set 指标名称
     * @param MetricShowName 指标名称
     */
    public void setMetricShowName(String MetricShowName) {
        this.MetricShowName = MetricShowName;
    }

    /**
     * Get 数据聚合周期(单位秒) 
     * @return Period 数据聚合周期(单位秒)
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 数据聚合周期(单位秒)
     * @param Period 数据聚合周期(单位秒)
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 指标id 
     * @return MetricId 指标id
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set 指标id
     * @param MetricId 指标id
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get 阈值规则id 
     * @return RuleId 阈值规则id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 阈值规则id
     * @param RuleId 阈值规则id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 指标单位 
     * @return Unit 指标单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 指标单位
     * @param Unit 指标单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 告警发送收敛类型。0连续告警，1指数告警 
     * @return AlarmNotifyType 告警发送收敛类型。0连续告警，1指数告警
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set 告警发送收敛类型。0连续告警，1指数告警
     * @param AlarmNotifyType 告警发送收敛类型。0连续告警，1指数告警
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次 
     * @return AlarmNotifyPeriod 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     * @param AlarmNotifyPeriod 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcType 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCalcType() {
        return this.CalcType;
    }

    /**
     * Set 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcType 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcType(Long CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get 检测阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcValue 检测阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set 检测阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcValue 检测阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get 持续多长时间触发规则会告警(单位秒)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinueTime 持续多长时间触发规则会告警(单位秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set 持续多长时间触发规则会告警(单位秒)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinueTime 持续多长时间触发规则会告警(单位秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinueTime(Long ContinueTime) {
        this.ContinueTime = ContinueTime;
    }

    /**
     * Get 告警指标名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 告警指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 告警指标名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 告警指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
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

