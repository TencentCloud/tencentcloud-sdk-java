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

public class ModifyConditionsTemplateRequestCondition extends AbstractModel {

    /**
    * <p>统计周期</p>
    */
    @SerializedName("CalcPeriod")
    @Expose
    private String CalcPeriod;

    /**
    * <p>统计方式</p>
    */
    @SerializedName("CalcType")
    @Expose
    private String CalcType;

    /**
    * <p>持续周期</p>
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private String ContinuePeriod;

    /**
    * <p>指标ID</p>
    */
    @SerializedName("MetricID")
    @Expose
    private Long MetricID;

    /**
    * <p>统计值</p>
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * <p>告警通知周期</p>
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private String AlarmNotifyPeriod;

    /**
    * <p>告警通知方式</p>
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
     * Get <p>统计周期</p> 
     * @return CalcPeriod <p>统计周期</p>
     */
    public String getCalcPeriod() {
        return this.CalcPeriod;
    }

    /**
     * Set <p>统计周期</p>
     * @param CalcPeriod <p>统计周期</p>
     */
    public void setCalcPeriod(String CalcPeriod) {
        this.CalcPeriod = CalcPeriod;
    }

    /**
     * Get <p>统计方式</p> 
     * @return CalcType <p>统计方式</p>
     */
    public String getCalcType() {
        return this.CalcType;
    }

    /**
     * Set <p>统计方式</p>
     * @param CalcType <p>统计方式</p>
     */
    public void setCalcType(String CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get <p>持续周期</p> 
     * @return ContinuePeriod <p>持续周期</p>
     */
    public String getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set <p>持续周期</p>
     * @param ContinuePeriod <p>持续周期</p>
     */
    public void setContinuePeriod(String ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    /**
     * Get <p>指标ID</p> 
     * @return MetricID <p>指标ID</p>
     */
    public Long getMetricID() {
        return this.MetricID;
    }

    /**
     * Set <p>指标ID</p>
     * @param MetricID <p>指标ID</p>
     */
    public void setMetricID(Long MetricID) {
        this.MetricID = MetricID;
    }

    /**
     * Get <p>统计值</p> 
     * @return CalcValue <p>统计值</p>
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set <p>统计值</p>
     * @param CalcValue <p>统计值</p>
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get <p>告警通知周期</p> 
     * @return AlarmNotifyPeriod <p>告警通知周期</p>
     */
    public String getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set <p>告警通知周期</p>
     * @param AlarmNotifyPeriod <p>告警通知周期</p>
     */
    public void setAlarmNotifyPeriod(String AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get <p>告警通知方式</p> 
     * @return AlarmNotifyType <p>告警通知方式</p>
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set <p>告警通知方式</p>
     * @param AlarmNotifyType <p>告警通知方式</p>
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get <p>规则ID</p> 
     * @return RuleID <p>规则ID</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>规则ID</p>
     * @param RuleID <p>规则ID</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    public ModifyConditionsTemplateRequestCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConditionsTemplateRequestCondition(ModifyConditionsTemplateRequestCondition source) {
        if (source.CalcPeriod != null) {
            this.CalcPeriod = new String(source.CalcPeriod);
        }
        if (source.CalcType != null) {
            this.CalcType = new String(source.CalcType);
        }
        if (source.ContinuePeriod != null) {
            this.ContinuePeriod = new String(source.ContinuePeriod);
        }
        if (source.MetricID != null) {
            this.MetricID = new Long(source.MetricID);
        }
        if (source.CalcValue != null) {
            this.CalcValue = new String(source.CalcValue);
        }
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new String(source.AlarmNotifyPeriod);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new Long(source.AlarmNotifyType);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CalcPeriod", this.CalcPeriod);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "ContinuePeriod", this.ContinuePeriod);
        this.setParamSimple(map, prefix + "MetricID", this.MetricID);
        this.setParamSimple(map, prefix + "CalcValue", this.CalcValue);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);

    }
}

