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

public class AlarmPolicyRule extends AbstractModel {

    /**
    * <p>指标名或事件名，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询 。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>秒数 统计周期，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>英文运算符<br>intelligent=无阈值智能检测<br>eq=等于<br>ge=大于等于<br>gt=大于<br>le=小于等于<br>lt=小于<br>ne=不等于<br>day_increase=天同比增长<br>day_decrease=天同比下降<br>day_wave=天同比波动<br>week_increase=周同比增长<br>week_decrease=周同比下降<br>week_wave=周同比波动<br>cycle_increase=环比增长<br>cycle_decrease=环比下降<br>cycle_wave=环比波动<br>re=正则匹配<br>支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>阈值，支持的范围可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>周期数 持续通知周期 1=持续1个周期 2=持续2个周期...，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long ContinuePeriod;

    /**
    * <p>秒数 告警间隔  0=不重复 300=每5分钟告警一次 600=每10分钟告警一次 900=每15分钟告警一次 1800=每30分钟告警一次 3600=每1小时告警一次 7200=每2小时告警一次 10800=每3小时告警一次 21600=每6小时告警一次 43200=每12小时告警一次 86400=每1天告警一次</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeFrequency")
    @Expose
    private Long NoticeFrequency;

    /**
    * <p>告警频率是否指数增长 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPowerNotice")
    @Expose
    private Long IsPowerNotice;

    /**
    * <p>对于单个触发规则的过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Filter")
    @Expose
    private AlarmPolicyFilter Filter;

    /**
    * <p>指标展示名，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>单位，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态阈值。创建或编辑策略时，如不填则默认为 STATIC。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>是否为高级指标，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAdvanced")
    @Expose
    private Long IsAdvanced;

    /**
    * <p>高级指标是否开通，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
    * <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueMax")
    @Expose
    private Float ValueMax;

    /**
    * <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueMin")
    @Expose
    private Float ValueMin;

    /**
    * <p>告警分级阈值配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HierarchicalValue")
    @Expose
    private AlarmHierarchicalValue HierarchicalValue;

    /**
    * <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLatenessMetric")
    @Expose
    private Long IsLatenessMetric;

    /**
     * Get <p>指标名或事件名，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询 。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName <p>指标名或事件名，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询 。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名或事件名，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询 。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName <p>指标名或事件名，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询 。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>秒数 统计周期，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period <p>秒数 统计周期，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>秒数 统计周期，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period <p>秒数 统计周期，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>英文运算符<br>intelligent=无阈值智能检测<br>eq=等于<br>ge=大于等于<br>gt=大于<br>le=小于等于<br>lt=小于<br>ne=不等于<br>day_increase=天同比增长<br>day_decrease=天同比下降<br>day_wave=天同比波动<br>week_increase=周同比增长<br>week_decrease=周同比下降<br>week_wave=周同比波动<br>cycle_increase=环比增长<br>cycle_decrease=环比下降<br>cycle_wave=环比波动<br>re=正则匹配<br>支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator <p>英文运算符<br>intelligent=无阈值智能检测<br>eq=等于<br>ge=大于等于<br>gt=大于<br>le=小于等于<br>lt=小于<br>ne=不等于<br>day_increase=天同比增长<br>day_decrease=天同比下降<br>day_wave=天同比波动<br>week_increase=周同比增长<br>week_decrease=周同比下降<br>week_wave=周同比波动<br>cycle_increase=环比增长<br>cycle_decrease=环比下降<br>cycle_wave=环比波动<br>re=正则匹配<br>支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>英文运算符<br>intelligent=无阈值智能检测<br>eq=等于<br>ge=大于等于<br>gt=大于<br>le=小于等于<br>lt=小于<br>ne=不等于<br>day_increase=天同比增长<br>day_decrease=天同比下降<br>day_wave=天同比波动<br>week_increase=周同比增长<br>week_decrease=周同比下降<br>week_wave=周同比波动<br>cycle_increase=环比增长<br>cycle_decrease=环比下降<br>cycle_wave=环比波动<br>re=正则匹配<br>支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator <p>英文运算符<br>intelligent=无阈值智能检测<br>eq=等于<br>ge=大于等于<br>gt=大于<br>le=小于等于<br>lt=小于<br>ne=不等于<br>day_increase=天同比增长<br>day_decrease=天同比下降<br>day_wave=天同比波动<br>week_increase=周同比增长<br>week_decrease=周同比下降<br>week_wave=周同比波动<br>cycle_increase=环比增长<br>cycle_decrease=环比下降<br>cycle_wave=环比波动<br>re=正则匹配<br>支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>阈值，支持的范围可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>阈值，支持的范围可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>阈值，支持的范围可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>阈值，支持的范围可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>周期数 持续通知周期 1=持续1个周期 2=持续2个周期...，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinuePeriod <p>周期数 持续通知周期 1=持续1个周期 2=持续2个周期...，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set <p>周期数 持续通知周期 1=持续1个周期 2=持续2个周期...，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinuePeriod <p>周期数 持续通知周期 1=持续1个周期 2=持续2个周期...，支持的值可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinuePeriod(Long ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    /**
     * Get <p>秒数 告警间隔  0=不重复 300=每5分钟告警一次 600=每10分钟告警一次 900=每15分钟告警一次 1800=每30分钟告警一次 3600=每1小时告警一次 7200=每2小时告警一次 10800=每3小时告警一次 21600=每6小时告警一次 43200=每12小时告警一次 86400=每1天告警一次</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeFrequency <p>秒数 告警间隔  0=不重复 300=每5分钟告警一次 600=每10分钟告警一次 900=每15分钟告警一次 1800=每30分钟告警一次 3600=每1小时告警一次 7200=每2小时告警一次 10800=每3小时告警一次 21600=每6小时告警一次 43200=每12小时告警一次 86400=每1天告警一次</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNoticeFrequency() {
        return this.NoticeFrequency;
    }

    /**
     * Set <p>秒数 告警间隔  0=不重复 300=每5分钟告警一次 600=每10分钟告警一次 900=每15分钟告警一次 1800=每30分钟告警一次 3600=每1小时告警一次 7200=每2小时告警一次 10800=每3小时告警一次 21600=每6小时告警一次 43200=每12小时告警一次 86400=每1天告警一次</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeFrequency <p>秒数 告警间隔  0=不重复 300=每5分钟告警一次 600=每10分钟告警一次 900=每15分钟告警一次 1800=每30分钟告警一次 3600=每1小时告警一次 7200=每2小时告警一次 10800=每3小时告警一次 21600=每6小时告警一次 43200=每12小时告警一次 86400=每1天告警一次</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeFrequency(Long NoticeFrequency) {
        this.NoticeFrequency = NoticeFrequency;
    }

    /**
     * Get <p>告警频率是否指数增长 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPowerNotice <p>告警频率是否指数增长 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPowerNotice() {
        return this.IsPowerNotice;
    }

    /**
     * Set <p>告警频率是否指数增长 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPowerNotice <p>告警频率是否指数增长 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPowerNotice(Long IsPowerNotice) {
        this.IsPowerNotice = IsPowerNotice;
    }

    /**
     * Get <p>对于单个触发规则的过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Filter <p>对于单个触发规则的过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>对于单个触发规则的过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Filter <p>对于单个触发规则的过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilter(AlarmPolicyFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>指标展示名，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>指标展示名，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>指标展示名，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>指标展示名，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>单位，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit <p>单位，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>单位，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit <p>单位，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态阈值。创建或编辑策略时，如不填则默认为 STATIC。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态阈值。创建或编辑策略时，如不填则默认为 STATIC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态阈值。创建或编辑策略时，如不填则默认为 STATIC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态阈值。创建或编辑策略时，如不填则默认为 STATIC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>是否为高级指标，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAdvanced <p>是否为高级指标，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAdvanced() {
        return this.IsAdvanced;
    }

    /**
     * Set <p>是否为高级指标，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAdvanced <p>是否为高级指标，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAdvanced(Long IsAdvanced) {
        this.IsAdvanced = IsAdvanced;
    }

    /**
     * Get <p>高级指标是否开通，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOpen <p>高级指标是否开通，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set <p>高级指标是否开通，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOpen <p>高级指标是否开通，0否，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueMax <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValueMax() {
        return this.ValueMax;
    }

    /**
     * Set <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueMax <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueMax(Float ValueMax) {
        this.ValueMax = ValueMax;
    }

    /**
     * Get <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueMin <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValueMin() {
        return this.ValueMin;
    }

    /**
     * Set <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueMin <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueMin(Float ValueMin) {
        this.ValueMin = ValueMin;
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
     * Get <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLatenessMetric <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsLatenessMetric() {
        return this.IsLatenessMetric;
    }

    /**
     * Set <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLatenessMetric <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLatenessMetric(Long IsLatenessMetric) {
        this.IsLatenessMetric = IsLatenessMetric;
    }

    public AlarmPolicyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicyRule(AlarmPolicyRule source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ContinuePeriod != null) {
            this.ContinuePeriod = new Long(source.ContinuePeriod);
        }
        if (source.NoticeFrequency != null) {
            this.NoticeFrequency = new Long(source.NoticeFrequency);
        }
        if (source.IsPowerNotice != null) {
            this.IsPowerNotice = new Long(source.IsPowerNotice);
        }
        if (source.Filter != null) {
            this.Filter = new AlarmPolicyFilter(source.Filter);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
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
        if (source.ValueMax != null) {
            this.ValueMax = new Float(source.ValueMax);
        }
        if (source.ValueMin != null) {
            this.ValueMin = new Float(source.ValueMin);
        }
        if (source.HierarchicalValue != null) {
            this.HierarchicalValue = new AlarmHierarchicalValue(source.HierarchicalValue);
        }
        if (source.IsLatenessMetric != null) {
            this.IsLatenessMetric = new Long(source.IsLatenessMetric);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ContinuePeriod", this.ContinuePeriod);
        this.setParamSimple(map, prefix + "NoticeFrequency", this.NoticeFrequency);
        this.setParamSimple(map, prefix + "IsPowerNotice", this.IsPowerNotice);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "IsAdvanced", this.IsAdvanced);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ValueMax", this.ValueMax);
        this.setParamSimple(map, prefix + "ValueMin", this.ValueMin);
        this.setParamObj(map, prefix + "HierarchicalValue.", this.HierarchicalValue);
        this.setParamSimple(map, prefix + "IsLatenessMetric", this.IsLatenessMetric);

    }
}

