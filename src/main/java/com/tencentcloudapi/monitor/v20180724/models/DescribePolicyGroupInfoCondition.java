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
    private Integer Period;

    /**
    * 指标id
    */
    @SerializedName("MetricId")
    @Expose
    private Integer MetricId;

    /**
    * 阈值规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Integer RuleId;

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
    private Integer AlarmNotifyType;

    /**
    * 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Integer AlarmNotifyPeriod;

    /**
    * 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
    */
    @SerializedName("CalcType")
    @Expose
    private Integer CalcType;

    /**
    * 检测阈值
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * 持续多长时间触发规则会告警(单位秒)
    */
    @SerializedName("ContinueTime")
    @Expose
    private Integer ContinueTime;

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
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * Set 数据聚合周期(单位秒)
     * @param Period 数据聚合周期(单位秒)
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * Get 指标id 
     * @return MetricId 指标id
     */
    public Integer getMetricId() {
        return this.MetricId;
    }

    /**
     * Set 指标id
     * @param MetricId 指标id
     */
    public void setMetricId(Integer MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get 阈值规则id 
     * @return RuleId 阈值规则id
     */
    public Integer getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 阈值规则id
     * @param RuleId 阈值规则id
     */
    public void setRuleId(Integer RuleId) {
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
    public Integer getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set 告警发送收敛类型。0连续告警，1指数告警
     * @param AlarmNotifyType 告警发送收敛类型。0连续告警，1指数告警
     */
    public void setAlarmNotifyType(Integer AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次 
     * @return AlarmNotifyPeriod 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     */
    public Integer getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     * @param AlarmNotifyPeriod 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     */
    public void setAlarmNotifyPeriod(Integer AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降 
     * @return CalcType 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
     */
    public Integer getCalcType() {
        return this.CalcType;
    }

    /**
     * Set 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
     * @param CalcType 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等，7表示日同比上涨，8表示日同比下降，9表示周同比上涨，10表示周同比下降，11表示周期环比上涨，12表示周期环比下降
     */
    public void setCalcType(Integer CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get 检测阈值 
     * @return CalcValue 检测阈值
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set 检测阈值
     * @param CalcValue 检测阈值
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get 持续多长时间触发规则会告警(单位秒) 
     * @return ContinueTime 持续多长时间触发规则会告警(单位秒)
     */
    public Integer getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set 持续多长时间触发规则会告警(单位秒)
     * @param ContinueTime 持续多长时间触发规则会告警(单位秒)
     */
    public void setContinueTime(Integer ContinueTime) {
        this.ContinueTime = ContinueTime;
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

    }
}

