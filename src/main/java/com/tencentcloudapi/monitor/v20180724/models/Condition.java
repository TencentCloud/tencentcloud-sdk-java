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

public class Condition extends AbstractModel {

    /**
    * <p>告警通知频率</p>
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcType")
    @Expose
    private String CalcType;

    /**
    * <p>检测值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * <p>持续时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinueTime")
    @Expose
    private String ContinueTime;

    /**
    * <p>指标ID</p>
    */
    @SerializedName("MetricID")
    @Expose
    private Long MetricID;

    /**
    * <p>指标展示名称（对外）</p>
    */
    @SerializedName("MetricDisplayName")
    @Expose
    private String MetricDisplayName;

    /**
    * <p>周期</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>指标单位</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>是否为高级指标，0：否；1：是</p>
    */
    @SerializedName("IsAdvanced")
    @Expose
    private Long IsAdvanced;

    /**
    * <p>是否开通高级指标，0：否；1：是</p>
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
    * <p>产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>告警分级阈值配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HierarchicalValue")
    @Expose
    private AlarmHierarchicalValue HierarchicalValue;

    /**
    * <p>指标类型，用于区分动态指标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
     * Get <p>告警通知频率</p> 
     * @return AlarmNotifyPeriod <p>告警通知频率</p>
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set <p>告警通知频率</p>
     * @param AlarmNotifyPeriod <p>告警通知频率</p>
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p> 
     * @return AlarmNotifyType <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
     * @param AlarmNotifyType <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcType <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcType() {
        return this.CalcType;
    }

    /**
     * Set <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcType <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcType(String CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get <p>检测值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcValue <p>检测值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set <p>检测值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcValue <p>检测值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get <p>持续时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinueTime <p>持续时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set <p>持续时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinueTime <p>持续时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinueTime(String ContinueTime) {
        this.ContinueTime = ContinueTime;
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
     * Get <p>指标展示名称（对外）</p> 
     * @return MetricDisplayName <p>指标展示名称（对外）</p>
     */
    public String getMetricDisplayName() {
        return this.MetricDisplayName;
    }

    /**
     * Set <p>指标展示名称（对外）</p>
     * @param MetricDisplayName <p>指标展示名称（对外）</p>
     */
    public void setMetricDisplayName(String MetricDisplayName) {
        this.MetricDisplayName = MetricDisplayName;
    }

    /**
     * Get <p>周期</p> 
     * @return Period <p>周期</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>周期</p>
     * @param Period <p>周期</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
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
     * Get <p>是否为高级指标，0：否；1：是</p> 
     * @return IsAdvanced <p>是否为高级指标，0：否；1：是</p>
     */
    public Long getIsAdvanced() {
        return this.IsAdvanced;
    }

    /**
     * Set <p>是否为高级指标，0：否；1：是</p>
     * @param IsAdvanced <p>是否为高级指标，0：否；1：是</p>
     */
    public void setIsAdvanced(Long IsAdvanced) {
        this.IsAdvanced = IsAdvanced;
    }

    /**
     * Get <p>是否开通高级指标，0：否；1：是</p> 
     * @return IsOpen <p>是否开通高级指标，0：否；1：是</p>
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set <p>是否开通高级指标，0：否；1：是</p>
     * @param IsOpen <p>是否开通高级指标，0：否；1：是</p>
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get <p>产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId <p>产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId <p>产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>告警分级阈值配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HierarchicalValue <p>告警分级阈值配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmHierarchicalValue getHierarchicalValue() {
        return this.HierarchicalValue;
    }

    /**
     * Set <p>告警分级阈值配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HierarchicalValue <p>告警分级阈值配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHierarchicalValue(AlarmHierarchicalValue HierarchicalValue) {
        this.HierarchicalValue = HierarchicalValue;
    }

    /**
     * Get <p>指标类型，用于区分动态指标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType <p>指标类型，用于区分动态指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>指标类型，用于区分动态指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType <p>指标类型，用于区分动态指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    public Condition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Condition(Condition source) {
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new Long(source.AlarmNotifyPeriod);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new Long(source.AlarmNotifyType);
        }
        if (source.CalcType != null) {
            this.CalcType = new String(source.CalcType);
        }
        if (source.CalcValue != null) {
            this.CalcValue = new String(source.CalcValue);
        }
        if (source.ContinueTime != null) {
            this.ContinueTime = new String(source.ContinueTime);
        }
        if (source.MetricID != null) {
            this.MetricID = new Long(source.MetricID);
        }
        if (source.MetricDisplayName != null) {
            this.MetricDisplayName = new String(source.MetricDisplayName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.IsAdvanced != null) {
            this.IsAdvanced = new Long(source.IsAdvanced);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Long(source.IsOpen);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.HierarchicalValue != null) {
            this.HierarchicalValue = new AlarmHierarchicalValue(source.HierarchicalValue);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcValue", this.CalcValue);
        this.setParamSimple(map, prefix + "ContinueTime", this.ContinueTime);
        this.setParamSimple(map, prefix + "MetricID", this.MetricID);
        this.setParamSimple(map, prefix + "MetricDisplayName", this.MetricDisplayName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "IsAdvanced", this.IsAdvanced);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamObj(map, prefix + "HierarchicalValue.", this.HierarchicalValue);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

