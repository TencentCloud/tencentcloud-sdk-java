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

public class CreatePolicyGroupCondition extends AbstractModel{

    /**
    * 指标Id
    */
    @SerializedName("MetricId")
    @Expose
    private Integer MetricId;

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
    * 比较类型，范围0-6，分别对应[>,<,>=,<=,==,!=,!]。如果指标有配置默认比较类型值可以不填。
    */
    @SerializedName("CalcType")
    @Expose
    private Integer CalcType;

    /**
    * 比较的值，如果指标不必须CalcValue可不填
    */
    @SerializedName("CalcValue")
    @Expose
    private Float CalcValue;

    /**
    * Storm检测周期单位秒，若指标有默认值可不填
    */
    @SerializedName("CalcPeriod")
    @Expose
    private Integer CalcPeriod;

    /**
    * 持续几个检测周期触发规则会告警
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Integer ContinuePeriod;

    /**
    * 如果通过模版创建，需要传入模版中该指标的对应RuleId
    */
    @SerializedName("RuleId")
    @Expose
    private Integer RuleId;

    /**
     * Get 指标Id 
     * @return MetricId 指标Id
     */
    public Integer getMetricId() {
        return this.MetricId;
    }

    /**
     * Set 指标Id
     * @param MetricId 指标Id
     */
    public void setMetricId(Integer MetricId) {
        this.MetricId = MetricId;
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
     * Get 比较类型，范围0-6，分别对应[>,<,>=,<=,==,!=,!]。如果指标有配置默认比较类型值可以不填。 
     * @return CalcType 比较类型，范围0-6，分别对应[>,<,>=,<=,==,!=,!]。如果指标有配置默认比较类型值可以不填。
     */
    public Integer getCalcType() {
        return this.CalcType;
    }

    /**
     * Set 比较类型，范围0-6，分别对应[>,<,>=,<=,==,!=,!]。如果指标有配置默认比较类型值可以不填。
     * @param CalcType 比较类型，范围0-6，分别对应[>,<,>=,<=,==,!=,!]。如果指标有配置默认比较类型值可以不填。
     */
    public void setCalcType(Integer CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get 比较的值，如果指标不必须CalcValue可不填 
     * @return CalcValue 比较的值，如果指标不必须CalcValue可不填
     */
    public Float getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set 比较的值，如果指标不必须CalcValue可不填
     * @param CalcValue 比较的值，如果指标不必须CalcValue可不填
     */
    public void setCalcValue(Float CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get Storm检测周期单位秒，若指标有默认值可不填 
     * @return CalcPeriod Storm检测周期单位秒，若指标有默认值可不填
     */
    public Integer getCalcPeriod() {
        return this.CalcPeriod;
    }

    /**
     * Set Storm检测周期单位秒，若指标有默认值可不填
     * @param CalcPeriod Storm检测周期单位秒，若指标有默认值可不填
     */
    public void setCalcPeriod(Integer CalcPeriod) {
        this.CalcPeriod = CalcPeriod;
    }

    /**
     * Get 持续几个检测周期触发规则会告警 
     * @return ContinuePeriod 持续几个检测周期触发规则会告警
     */
    public Integer getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set 持续几个检测周期触发规则会告警
     * @param ContinuePeriod 持续几个检测周期触发规则会告警
     */
    public void setContinuePeriod(Integer ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    /**
     * Get 如果通过模版创建，需要传入模版中该指标的对应RuleId 
     * @return RuleId 如果通过模版创建，需要传入模版中该指标的对应RuleId
     */
    public Integer getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 如果通过模版创建，需要传入模版中该指标的对应RuleId
     * @param RuleId 如果通过模版创建，需要传入模版中该指标的对应RuleId
     */
    public void setRuleId(Integer RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcValue", this.CalcValue);
        this.setParamSimple(map, prefix + "CalcPeriod", this.CalcPeriod);
        this.setParamSimple(map, prefix + "ContinuePeriod", this.ContinuePeriod);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

