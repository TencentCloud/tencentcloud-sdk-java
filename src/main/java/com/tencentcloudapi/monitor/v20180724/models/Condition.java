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
    * 告警通知频率
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * 检测方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcType")
    @Expose
    private String CalcType;

    /**
    * 检测值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * 持续时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinueTime")
    @Expose
    private String ContinueTime;

    /**
    * 指标ID
    */
    @SerializedName("MetricID")
    @Expose
    private Long MetricID;

    /**
    * 指标展示名称（对外）
    */
    @SerializedName("MetricDisplayName")
    @Expose
    private String MetricDisplayName;

    /**
    * 周期
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 指标单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 是否为高级指标，0：否；1：是
    */
    @SerializedName("IsAdvanced")
    @Expose
    private Long IsAdvanced;

    /**
    * 是否开通高级指标，0：否；1：是
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
    * 产品ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 告警分级阈值配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HierarchicalValue")
    @Expose
    private AlarmHierarchicalValue HierarchicalValue;

    /**
    * 指标类型，用于区分动态指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
     * Get 告警通知频率 
     * @return AlarmNotifyPeriod 告警通知频率
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set 告警通知频率
     * @param AlarmNotifyPeriod 告警通知频率
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警） 
     * @return AlarmNotifyType 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
     * @param AlarmNotifyType 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get 检测方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcType 检测方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcType() {
        return this.CalcType;
    }

    /**
     * Set 检测方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcType 检测方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcType(String CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get 检测值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcValue 检测值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set 检测值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcValue 检测值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get 持续时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinueTime 持续时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set 持续时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinueTime 持续时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinueTime(String ContinueTime) {
        this.ContinueTime = ContinueTime;
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
     * Get 指标展示名称（对外） 
     * @return MetricDisplayName 指标展示名称（对外）
     */
    public String getMetricDisplayName() {
        return this.MetricDisplayName;
    }

    /**
     * Set 指标展示名称（对外）
     * @param MetricDisplayName 指标展示名称（对外）
     */
    public void setMetricDisplayName(String MetricDisplayName) {
        this.MetricDisplayName = MetricDisplayName;
    }

    /**
     * Get 周期 
     * @return Period 周期
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 周期
     * @param Period 周期
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
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
     * Get 是否为高级指标，0：否；1：是 
     * @return IsAdvanced 是否为高级指标，0：否；1：是
     */
    public Long getIsAdvanced() {
        return this.IsAdvanced;
    }

    /**
     * Set 是否为高级指标，0：否；1：是
     * @param IsAdvanced 是否为高级指标，0：否；1：是
     */
    public void setIsAdvanced(Long IsAdvanced) {
        this.IsAdvanced = IsAdvanced;
    }

    /**
     * Get 是否开通高级指标，0：否；1：是 
     * @return IsOpen 是否开通高级指标，0：否；1：是
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set 是否开通高级指标，0：否；1：是
     * @param IsOpen 是否开通高级指标，0：否；1：是
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get 产品ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 告警分级阈值配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HierarchicalValue 告警分级阈值配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmHierarchicalValue getHierarchicalValue() {
        return this.HierarchicalValue;
    }

    /**
     * Set 告警分级阈值配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HierarchicalValue 告警分级阈值配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHierarchicalValue(AlarmHierarchicalValue HierarchicalValue) {
        this.HierarchicalValue = HierarchicalValue;
    }

    /**
     * Get 指标类型，用于区分动态指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 指标类型，用于区分动态指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 指标类型，用于区分动态指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 指标类型，用于区分动态指标
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

