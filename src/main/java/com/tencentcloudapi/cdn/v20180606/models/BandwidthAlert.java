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

public class BandwidthAlert extends AbstractModel{

    /**
    * 用量封顶配置开关
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 用量封顶阈值，带宽单位为bps，流量单位byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BpsThreshold")
    @Expose
    private Long BpsThreshold;

    /**
    * 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CounterMeasure")
    @Expose
    private String CounterMeasure;

    /**
    * 境内区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTriggerTime")
    @Expose
    private String LastTriggerTime;

    /**
    * 用量封顶提醒开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertSwitch")
    @Expose
    private String AlertSwitch;

    /**
    * 用量封顶阈值提醒百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertPercentage")
    @Expose
    private Long AlertPercentage;

    /**
    * 海外区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTriggerTimeOverseas")
    @Expose
    private String LastTriggerTimeOverseas;

    /**
    * 用量阈值触发的维度
带宽：bandwidth
流量：flux
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 累计用量配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticItems")
    @Expose
    private StatisticItem [] StatisticItems;

    /**
     * Get 用量封顶配置开关
on：开启
off：关闭 
     * @return Switch 用量封顶配置开关
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 用量封顶配置开关
on：开启
off：关闭
     * @param Switch 用量封顶配置开关
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 用量封顶阈值，带宽单位为bps，流量单位byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BpsThreshold 用量封顶阈值，带宽单位为bps，流量单位byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBpsThreshold() {
        return this.BpsThreshold;
    }

    /**
     * Set 用量封顶阈值，带宽单位为bps，流量单位byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param BpsThreshold 用量封顶阈值，带宽单位为bps，流量单位byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBpsThreshold(Long BpsThreshold) {
        this.BpsThreshold = BpsThreshold;
    }

    /**
     * Get 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CounterMeasure 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCounterMeasure() {
        return this.CounterMeasure;
    }

    /**
     * Set 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。
     * @param CounterMeasure 达到阈值后的操作
RESOLVE_DNS_TO_ORIGIN：直接回源，仅自有源站域名支持
RETURN_404：全部请求返回 404
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCounterMeasure(String CounterMeasure) {
        this.CounterMeasure = CounterMeasure;
    }

    /**
     * Get 境内区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTriggerTime 境内区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTriggerTime() {
        return this.LastTriggerTime;
    }

    /**
     * Set 境内区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTriggerTime 境内区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTriggerTime(String LastTriggerTime) {
        this.LastTriggerTime = LastTriggerTime;
    }

    /**
     * Get 用量封顶提醒开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertSwitch 用量封顶提醒开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlertSwitch() {
        return this.AlertSwitch;
    }

    /**
     * Set 用量封顶提醒开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertSwitch 用量封顶提醒开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertSwitch(String AlertSwitch) {
        this.AlertSwitch = AlertSwitch;
    }

    /**
     * Get 用量封顶阈值提醒百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertPercentage 用量封顶阈值提醒百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlertPercentage() {
        return this.AlertPercentage;
    }

    /**
     * Set 用量封顶阈值提醒百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertPercentage 用量封顶阈值提醒百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertPercentage(Long AlertPercentage) {
        this.AlertPercentage = AlertPercentage;
    }

    /**
     * Get 海外区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTriggerTimeOverseas 海外区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTriggerTimeOverseas() {
        return this.LastTriggerTimeOverseas;
    }

    /**
     * Set 海外区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTriggerTimeOverseas 海外区域上次触发用量封顶阈值的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTriggerTimeOverseas(String LastTriggerTimeOverseas) {
        this.LastTriggerTimeOverseas = LastTriggerTimeOverseas;
    }

    /**
     * Get 用量阈值触发的维度
带宽：bandwidth
流量：flux
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metric 用量阈值触发的维度
带宽：bandwidth
流量：flux
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 用量阈值触发的维度
带宽：bandwidth
流量：flux
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metric 用量阈值触发的维度
带宽：bandwidth
流量：flux
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 累计用量配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticItems 累计用量配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatisticItem [] getStatisticItems() {
        return this.StatisticItems;
    }

    /**
     * Set 累计用量配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticItems 累计用量配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticItems(StatisticItem [] StatisticItems) {
        this.StatisticItems = StatisticItems;
    }

    public BandwidthAlert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthAlert(BandwidthAlert source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.BpsThreshold != null) {
            this.BpsThreshold = new Long(source.BpsThreshold);
        }
        if (source.CounterMeasure != null) {
            this.CounterMeasure = new String(source.CounterMeasure);
        }
        if (source.LastTriggerTime != null) {
            this.LastTriggerTime = new String(source.LastTriggerTime);
        }
        if (source.AlertSwitch != null) {
            this.AlertSwitch = new String(source.AlertSwitch);
        }
        if (source.AlertPercentage != null) {
            this.AlertPercentage = new Long(source.AlertPercentage);
        }
        if (source.LastTriggerTimeOverseas != null) {
            this.LastTriggerTimeOverseas = new String(source.LastTriggerTimeOverseas);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.StatisticItems != null) {
            this.StatisticItems = new StatisticItem[source.StatisticItems.length];
            for (int i = 0; i < source.StatisticItems.length; i++) {
                this.StatisticItems[i] = new StatisticItem(source.StatisticItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "BpsThreshold", this.BpsThreshold);
        this.setParamSimple(map, prefix + "CounterMeasure", this.CounterMeasure);
        this.setParamSimple(map, prefix + "LastTriggerTime", this.LastTriggerTime);
        this.setParamSimple(map, prefix + "AlertSwitch", this.AlertSwitch);
        this.setParamSimple(map, prefix + "AlertPercentage", this.AlertPercentage);
        this.setParamSimple(map, prefix + "LastTriggerTimeOverseas", this.LastTriggerTimeOverseas);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArrayObj(map, prefix + "StatisticItems.", this.StatisticItems);

    }
}

