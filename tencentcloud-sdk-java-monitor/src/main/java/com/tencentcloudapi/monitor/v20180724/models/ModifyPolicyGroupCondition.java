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

public class ModifyPolicyGroupCondition extends AbstractModel{

    /**
    * 指标id
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等
    */
    @SerializedName("CalcType")
    @Expose
    private Long CalcType;

    /**
    * 检测阈值
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * 检测指标的数据周期
    */
    @SerializedName("CalcPeriod")
    @Expose
    private Long CalcPeriod;

    /**
    * 持续周期个数
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long ContinuePeriod;

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
    * 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

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
     * Get 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等 
     * @return CalcType 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等
     */
    public Long getCalcType() {
        return this.CalcType;
    }

    /**
     * Set 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等
     * @param CalcType 比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等
     */
    public void setCalcType(Long CalcType) {
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
     * Get 检测指标的数据周期 
     * @return CalcPeriod 检测指标的数据周期
     */
    public Long getCalcPeriod() {
        return this.CalcPeriod;
    }

    /**
     * Set 检测指标的数据周期
     * @param CalcPeriod 检测指标的数据周期
     */
    public void setCalcPeriod(Long CalcPeriod) {
        this.CalcPeriod = CalcPeriod;
    }

    /**
     * Get 持续周期个数 
     * @return ContinuePeriod 持续周期个数
     */
    public Long getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set 持续周期个数
     * @param ContinuePeriod 持续周期个数
     */
    public void setContinuePeriod(Long ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
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
     * Get 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改 
     * @return RuleId 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改
     * @param RuleId 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcValue", this.CalcValue);
        this.setParamSimple(map, prefix + "CalcPeriod", this.CalcPeriod);
        this.setParamSimple(map, prefix + "ContinuePeriod", this.ContinuePeriod);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

