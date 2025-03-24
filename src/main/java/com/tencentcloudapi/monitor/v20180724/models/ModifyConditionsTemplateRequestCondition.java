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

public class ModifyConditionsTemplateRequestCondition extends AbstractModel {

    /**
    * 统计周期
    */
    @SerializedName("CalcPeriod")
    @Expose
    private String CalcPeriod;

    /**
    * 统计方式
    */
    @SerializedName("CalcType")
    @Expose
    private String CalcType;

    /**
    * 持续周期
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private String ContinuePeriod;

    /**
    * 指标ID
    */
    @SerializedName("MetricID")
    @Expose
    private Long MetricID;

    /**
    * 统计值
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * 告警通知周期
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private String AlarmNotifyPeriod;

    /**
    * 告警通知方式
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * 规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
     * Get 统计周期 
     * @return CalcPeriod 统计周期
     */
    public String getCalcPeriod() {
        return this.CalcPeriod;
    }

    /**
     * Set 统计周期
     * @param CalcPeriod 统计周期
     */
    public void setCalcPeriod(String CalcPeriod) {
        this.CalcPeriod = CalcPeriod;
    }

    /**
     * Get 统计方式 
     * @return CalcType 统计方式
     */
    public String getCalcType() {
        return this.CalcType;
    }

    /**
     * Set 统计方式
     * @param CalcType 统计方式
     */
    public void setCalcType(String CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get 持续周期 
     * @return ContinuePeriod 持续周期
     */
    public String getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set 持续周期
     * @param ContinuePeriod 持续周期
     */
    public void setContinuePeriod(String ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    /**
     * Get 指标ID 
     * @return MetricID 指标ID
     */
    public Long getMetricID() {
        return this.MetricID;
    }

    /**
     * Set 指标ID
     * @param MetricID 指标ID
     */
    public void setMetricID(Long MetricID) {
        this.MetricID = MetricID;
    }

    /**
     * Get 统计值 
     * @return CalcValue 统计值
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set 统计值
     * @param CalcValue 统计值
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get 告警通知周期 
     * @return AlarmNotifyPeriod 告警通知周期
     */
    public String getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set 告警通知周期
     * @param AlarmNotifyPeriod 告警通知周期
     */
    public void setAlarmNotifyPeriod(String AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get 告警通知方式 
     * @return AlarmNotifyType 告警通知方式
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set 告警通知方式
     * @param AlarmNotifyType 告警通知方式
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get 规则ID 
     * @return RuleID 规则ID
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则ID
     * @param RuleID 规则ID
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

