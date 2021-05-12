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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonthNetwork extends AbstractModel{

    /**
    * 节点zone信息
    */
    @SerializedName("ZoneInfo")
    @Expose
    private ZoneInfo ZoneInfo;

    /**
    * 带宽月份 示例"202103"
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 带宽包id 格式如"bwp-xxxxxxxx"
    */
    @SerializedName("BandwidthPkgId")
    @Expose
    private String BandwidthPkgId;

    /**
    * 运营商简称 取值范围"CUCC;CTCC;CMCC"
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 入网带宽包峰值,取值范围0.0-xxx.xxx
    */
    @SerializedName("TrafficMaxIn")
    @Expose
    private Float TrafficMaxIn;

    /**
    * 出网带宽包峰值,取值范围0.0-xxx.xxx
    */
    @SerializedName("TrafficMaxOut")
    @Expose
    private Float TrafficMaxOut;

    /**
    * 计费带宽,取值范围0.0-xxx.xxx
    */
    @SerializedName("FeeTraffic")
    @Expose
    private Float FeeTraffic;

    /**
    * 月计费带宽起始时间 格式"yyyy-mm-dd HH:mm:ss"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 月计费带宽结束时间 格式"yyyy-mm-dd HH:mm:ss"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 月计费带宽实际有效天数 整形必须大于等于0
    */
    @SerializedName("EffectiveDays")
    @Expose
    private Long EffectiveDays;

    /**
    * 指定月份的实际天数 实例 30
    */
    @SerializedName("MonthDays")
    @Expose
    private Long MonthDays;

    /**
    * 有效天占比 保留小数点后四位0.2134
    */
    @SerializedName("EffectiveDaysRate")
    @Expose
    private Float EffectiveDaysRate;

    /**
    * 计费带宽包类型 实例"Address","LoadBalance","AddressIpv6"
    */
    @SerializedName("BandwidthPkgType")
    @Expose
    private String BandwidthPkgType;

    /**
     * Get 节点zone信息 
     * @return ZoneInfo 节点zone信息
     */
    public ZoneInfo getZoneInfo() {
        return this.ZoneInfo;
    }

    /**
     * Set 节点zone信息
     * @param ZoneInfo 节点zone信息
     */
    public void setZoneInfo(ZoneInfo ZoneInfo) {
        this.ZoneInfo = ZoneInfo;
    }

    /**
     * Get 带宽月份 示例"202103" 
     * @return Month 带宽月份 示例"202103"
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 带宽月份 示例"202103"
     * @param Month 带宽月份 示例"202103"
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 带宽包id 格式如"bwp-xxxxxxxx" 
     * @return BandwidthPkgId 带宽包id 格式如"bwp-xxxxxxxx"
     */
    public String getBandwidthPkgId() {
        return this.BandwidthPkgId;
    }

    /**
     * Set 带宽包id 格式如"bwp-xxxxxxxx"
     * @param BandwidthPkgId 带宽包id 格式如"bwp-xxxxxxxx"
     */
    public void setBandwidthPkgId(String BandwidthPkgId) {
        this.BandwidthPkgId = BandwidthPkgId;
    }

    /**
     * Get 运营商简称 取值范围"CUCC;CTCC;CMCC" 
     * @return Isp 运营商简称 取值范围"CUCC;CTCC;CMCC"
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商简称 取值范围"CUCC;CTCC;CMCC"
     * @param Isp 运营商简称 取值范围"CUCC;CTCC;CMCC"
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 入网带宽包峰值,取值范围0.0-xxx.xxx 
     * @return TrafficMaxIn 入网带宽包峰值,取值范围0.0-xxx.xxx
     */
    public Float getTrafficMaxIn() {
        return this.TrafficMaxIn;
    }

    /**
     * Set 入网带宽包峰值,取值范围0.0-xxx.xxx
     * @param TrafficMaxIn 入网带宽包峰值,取值范围0.0-xxx.xxx
     */
    public void setTrafficMaxIn(Float TrafficMaxIn) {
        this.TrafficMaxIn = TrafficMaxIn;
    }

    /**
     * Get 出网带宽包峰值,取值范围0.0-xxx.xxx 
     * @return TrafficMaxOut 出网带宽包峰值,取值范围0.0-xxx.xxx
     */
    public Float getTrafficMaxOut() {
        return this.TrafficMaxOut;
    }

    /**
     * Set 出网带宽包峰值,取值范围0.0-xxx.xxx
     * @param TrafficMaxOut 出网带宽包峰值,取值范围0.0-xxx.xxx
     */
    public void setTrafficMaxOut(Float TrafficMaxOut) {
        this.TrafficMaxOut = TrafficMaxOut;
    }

    /**
     * Get 计费带宽,取值范围0.0-xxx.xxx 
     * @return FeeTraffic 计费带宽,取值范围0.0-xxx.xxx
     */
    public Float getFeeTraffic() {
        return this.FeeTraffic;
    }

    /**
     * Set 计费带宽,取值范围0.0-xxx.xxx
     * @param FeeTraffic 计费带宽,取值范围0.0-xxx.xxx
     */
    public void setFeeTraffic(Float FeeTraffic) {
        this.FeeTraffic = FeeTraffic;
    }

    /**
     * Get 月计费带宽起始时间 格式"yyyy-mm-dd HH:mm:ss" 
     * @return StartTime 月计费带宽起始时间 格式"yyyy-mm-dd HH:mm:ss"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 月计费带宽起始时间 格式"yyyy-mm-dd HH:mm:ss"
     * @param StartTime 月计费带宽起始时间 格式"yyyy-mm-dd HH:mm:ss"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 月计费带宽结束时间 格式"yyyy-mm-dd HH:mm:ss" 
     * @return EndTime 月计费带宽结束时间 格式"yyyy-mm-dd HH:mm:ss"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 月计费带宽结束时间 格式"yyyy-mm-dd HH:mm:ss"
     * @param EndTime 月计费带宽结束时间 格式"yyyy-mm-dd HH:mm:ss"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 月计费带宽实际有效天数 整形必须大于等于0 
     * @return EffectiveDays 月计费带宽实际有效天数 整形必须大于等于0
     */
    public Long getEffectiveDays() {
        return this.EffectiveDays;
    }

    /**
     * Set 月计费带宽实际有效天数 整形必须大于等于0
     * @param EffectiveDays 月计费带宽实际有效天数 整形必须大于等于0
     */
    public void setEffectiveDays(Long EffectiveDays) {
        this.EffectiveDays = EffectiveDays;
    }

    /**
     * Get 指定月份的实际天数 实例 30 
     * @return MonthDays 指定月份的实际天数 实例 30
     */
    public Long getMonthDays() {
        return this.MonthDays;
    }

    /**
     * Set 指定月份的实际天数 实例 30
     * @param MonthDays 指定月份的实际天数 实例 30
     */
    public void setMonthDays(Long MonthDays) {
        this.MonthDays = MonthDays;
    }

    /**
     * Get 有效天占比 保留小数点后四位0.2134 
     * @return EffectiveDaysRate 有效天占比 保留小数点后四位0.2134
     */
    public Float getEffectiveDaysRate() {
        return this.EffectiveDaysRate;
    }

    /**
     * Set 有效天占比 保留小数点后四位0.2134
     * @param EffectiveDaysRate 有效天占比 保留小数点后四位0.2134
     */
    public void setEffectiveDaysRate(Float EffectiveDaysRate) {
        this.EffectiveDaysRate = EffectiveDaysRate;
    }

    /**
     * Get 计费带宽包类型 实例"Address","LoadBalance","AddressIpv6" 
     * @return BandwidthPkgType 计费带宽包类型 实例"Address","LoadBalance","AddressIpv6"
     */
    public String getBandwidthPkgType() {
        return this.BandwidthPkgType;
    }

    /**
     * Set 计费带宽包类型 实例"Address","LoadBalance","AddressIpv6"
     * @param BandwidthPkgType 计费带宽包类型 实例"Address","LoadBalance","AddressIpv6"
     */
    public void setBandwidthPkgType(String BandwidthPkgType) {
        this.BandwidthPkgType = BandwidthPkgType;
    }

    public MonthNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonthNetwork(MonthNetwork source) {
        if (source.ZoneInfo != null) {
            this.ZoneInfo = new ZoneInfo(source.ZoneInfo);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.BandwidthPkgId != null) {
            this.BandwidthPkgId = new String(source.BandwidthPkgId);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.TrafficMaxIn != null) {
            this.TrafficMaxIn = new Float(source.TrafficMaxIn);
        }
        if (source.TrafficMaxOut != null) {
            this.TrafficMaxOut = new Float(source.TrafficMaxOut);
        }
        if (source.FeeTraffic != null) {
            this.FeeTraffic = new Float(source.FeeTraffic);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.EffectiveDays != null) {
            this.EffectiveDays = new Long(source.EffectiveDays);
        }
        if (source.MonthDays != null) {
            this.MonthDays = new Long(source.MonthDays);
        }
        if (source.EffectiveDaysRate != null) {
            this.EffectiveDaysRate = new Float(source.EffectiveDaysRate);
        }
        if (source.BandwidthPkgType != null) {
            this.BandwidthPkgType = new String(source.BandwidthPkgType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ZoneInfo.", this.ZoneInfo);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "BandwidthPkgId", this.BandwidthPkgId);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "TrafficMaxIn", this.TrafficMaxIn);
        this.setParamSimple(map, prefix + "TrafficMaxOut", this.TrafficMaxOut);
        this.setParamSimple(map, prefix + "FeeTraffic", this.FeeTraffic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EffectiveDays", this.EffectiveDays);
        this.setParamSimple(map, prefix + "MonthDays", this.MonthDays);
        this.setParamSimple(map, prefix + "EffectiveDaysRate", this.EffectiveDaysRate);
        this.setParamSimple(map, prefix + "BandwidthPkgType", this.BandwidthPkgType);

    }
}

