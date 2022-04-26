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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticItem extends AbstractModel{

    /**
    * 封顶类型，累计用量total，瞬时用量moment
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自动解封时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnBlockTime")
    @Expose
    private Long UnBlockTime;

    /**
    * 带宽、流量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BpsThreshold")
    @Expose
    private Long BpsThreshold;

    /**
    * 关闭方式 返回404:RETURN_404, dns回源：RESOLVE_DNS_TO_ORIGIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CounterMeasure")
    @Expose
    private String CounterMeasure;

    /**
    * 触发提醒阈值百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertPercentage")
    @Expose
    private Long AlertPercentage;

    /**
    * 提醒开关 on/off
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertSwitch")
    @Expose
    private String AlertSwitch;

    /**
    * 指标类型，流量flux或带宽bandwidth
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 检测周期，单位分钟，60或1440
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cycle")
    @Expose
    private Long Cycle;

    /**
    * 是否开启该选项，on/off
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 封顶类型，累计用量total，瞬时用量moment
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 封顶类型，累计用量total，瞬时用量moment
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 封顶类型，累计用量total，瞬时用量moment
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 封顶类型，累计用量total，瞬时用量moment
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 自动解封时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnBlockTime 自动解封时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnBlockTime() {
        return this.UnBlockTime;
    }

    /**
     * Set 自动解封时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnBlockTime 自动解封时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnBlockTime(Long UnBlockTime) {
        this.UnBlockTime = UnBlockTime;
    }

    /**
     * Get 带宽、流量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BpsThreshold 带宽、流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBpsThreshold() {
        return this.BpsThreshold;
    }

    /**
     * Set 带宽、流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param BpsThreshold 带宽、流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBpsThreshold(Long BpsThreshold) {
        this.BpsThreshold = BpsThreshold;
    }

    /**
     * Get 关闭方式 返回404:RETURN_404, dns回源：RESOLVE_DNS_TO_ORIGIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CounterMeasure 关闭方式 返回404:RETURN_404, dns回源：RESOLVE_DNS_TO_ORIGIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCounterMeasure() {
        return this.CounterMeasure;
    }

    /**
     * Set 关闭方式 返回404:RETURN_404, dns回源：RESOLVE_DNS_TO_ORIGIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param CounterMeasure 关闭方式 返回404:RETURN_404, dns回源：RESOLVE_DNS_TO_ORIGIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCounterMeasure(String CounterMeasure) {
        this.CounterMeasure = CounterMeasure;
    }

    /**
     * Get 触发提醒阈值百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertPercentage 触发提醒阈值百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlertPercentage() {
        return this.AlertPercentage;
    }

    /**
     * Set 触发提醒阈值百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertPercentage 触发提醒阈值百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertPercentage(Long AlertPercentage) {
        this.AlertPercentage = AlertPercentage;
    }

    /**
     * Get 提醒开关 on/off
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertSwitch 提醒开关 on/off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlertSwitch() {
        return this.AlertSwitch;
    }

    /**
     * Set 提醒开关 on/off
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertSwitch 提醒开关 on/off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertSwitch(String AlertSwitch) {
        this.AlertSwitch = AlertSwitch;
    }

    /**
     * Get 指标类型，流量flux或带宽bandwidth
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metric 指标类型，流量flux或带宽bandwidth
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标类型，流量flux或带宽bandwidth
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metric 指标类型，流量flux或带宽bandwidth
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 检测周期，单位分钟，60或1440
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cycle 检测周期，单位分钟，60或1440
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycle() {
        return this.Cycle;
    }

    /**
     * Set 检测周期，单位分钟，60或1440
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cycle 检测周期，单位分钟，60或1440
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycle(Long Cycle) {
        this.Cycle = Cycle;
    }

    /**
     * Get 是否开启该选项，on/off
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 是否开启该选项，on/off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否开启该选项，on/off
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 是否开启该选项，on/off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public StatisticItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticItem(StatisticItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UnBlockTime != null) {
            this.UnBlockTime = new Long(source.UnBlockTime);
        }
        if (source.BpsThreshold != null) {
            this.BpsThreshold = new Long(source.BpsThreshold);
        }
        if (source.CounterMeasure != null) {
            this.CounterMeasure = new String(source.CounterMeasure);
        }
        if (source.AlertPercentage != null) {
            this.AlertPercentage = new Long(source.AlertPercentage);
        }
        if (source.AlertSwitch != null) {
            this.AlertSwitch = new String(source.AlertSwitch);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Cycle != null) {
            this.Cycle = new Long(source.Cycle);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UnBlockTime", this.UnBlockTime);
        this.setParamSimple(map, prefix + "BpsThreshold", this.BpsThreshold);
        this.setParamSimple(map, prefix + "CounterMeasure", this.CounterMeasure);
        this.setParamSimple(map, prefix + "AlertPercentage", this.AlertPercentage);
        this.setParamSimple(map, prefix + "AlertSwitch", this.AlertSwitch);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Cycle", this.Cycle);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

