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

public class ModifyPolicyGroupCondition extends AbstractModel {

    /**
    * <p>指标id</p>
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等</p>
    */
    @SerializedName("CalcType")
    @Expose
    private Long CalcType;

    /**
    * <p>检测阈值</p>
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * <p>检测指标的数据周期</p>
    */
    @SerializedName("CalcPeriod")
    @Expose
    private Long CalcPeriod;

    /**
    * <p>持续周期个数</p>
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long ContinuePeriod;

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
    * <p>规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

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
     * Get <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等</p> 
     * @return CalcType <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等</p>
     */
    public Long getCalcType() {
        return this.CalcType;
    }

    /**
     * Set <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等</p>
     * @param CalcType <p>比较类型，1表示大于，2表示大于等于，3表示小于，4表示小于等于，5表示相等，6表示不相等</p>
     */
    public void setCalcType(Long CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get <p>检测阈值</p> 
     * @return CalcValue <p>检测阈值</p>
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set <p>检测阈值</p>
     * @param CalcValue <p>检测阈值</p>
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get <p>检测指标的数据周期</p> 
     * @return CalcPeriod <p>检测指标的数据周期</p>
     */
    public Long getCalcPeriod() {
        return this.CalcPeriod;
    }

    /**
     * Set <p>检测指标的数据周期</p>
     * @param CalcPeriod <p>检测指标的数据周期</p>
     */
    public void setCalcPeriod(Long CalcPeriod) {
        this.CalcPeriod = CalcPeriod;
    }

    /**
     * Get <p>持续周期个数</p> 
     * @return ContinuePeriod <p>持续周期个数</p>
     */
    public Long getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set <p>持续周期个数</p>
     * @param ContinuePeriod <p>持续周期个数</p>
     */
    public void setContinuePeriod(Long ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
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
     * Get <p>规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改</p> 
     * @return RuleId <p>规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改</p>
     * @param RuleId <p>规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public ModifyPolicyGroupCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPolicyGroupCondition(ModifyPolicyGroupCondition source) {
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.CalcType != null) {
            this.CalcType = new Long(source.CalcType);
        }
        if (source.CalcValue != null) {
            this.CalcValue = new String(source.CalcValue);
        }
        if (source.CalcPeriod != null) {
            this.CalcPeriod = new Long(source.CalcPeriod);
        }
        if (source.ContinuePeriod != null) {
            this.ContinuePeriod = new Long(source.ContinuePeriod);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new Long(source.AlarmNotifyType);
        }
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new Long(source.AlarmNotifyPeriod);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
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

