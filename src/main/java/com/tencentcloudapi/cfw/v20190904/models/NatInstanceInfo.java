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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatInstanceInfo extends AbstractModel {

    /**
    * nat实例id
    */
    @SerializedName("NatinsId")
    @Expose
    private String NatinsId;

    /**
    * nat实例名称
    */
    @SerializedName("NatinsName")
    @Expose
    private String NatinsName;

    /**
    * 实例所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 0: 新增模式，1:接入模式
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * 实例带宽大小 Mbps
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 入向带宽峰值 bps
    */
    @SerializedName("InFlowMax")
    @Expose
    private Long InFlowMax;

    /**
    * 出向带宽峰值 bps
    */
    @SerializedName("OutFlowMax")
    @Expose
    private Long OutFlowMax;

    /**
    * 地域中文信息
    */
    @SerializedName("RegionZh")
    @Expose
    private String RegionZh;

    /**
    * 公网ip数组
    */
    @SerializedName("EipAddress")
    @Expose
    private String [] EipAddress;

    /**
    * 内外使用ip数组
    */
    @SerializedName("VpcIp")
    @Expose
    private String [] VpcIp;

    /**
    * 实例关联子网数组
    */
    @SerializedName("Subnets")
    @Expose
    private String [] Subnets;

    /**
    * 0 :正常 1：正在初始化
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 地域区域信息
    */
    @SerializedName("RegionDetail")
    @Expose
    private String RegionDetail;

    /**
    * 实例所在可用区
    */
    @SerializedName("ZoneZh")
    @Expose
    private String ZoneZh;

    /**
    * 实例所在可用区
    */
    @SerializedName("ZoneZhBak")
    @Expose
    private String ZoneZhBak;

    /**
    * 已使用规则数
    */
    @SerializedName("RuleUsed")
    @Expose
    private Long RuleUsed;

    /**
    * 实例的规则限制最大规格数
    */
    @SerializedName("RuleMax")
    @Expose
    private Long RuleMax;

    /**
    * 实例引擎版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 引擎是否可升级：0，不可升级；1，可升级
    */
    @SerializedName("UpdateEnable")
    @Expose
    private Long UpdateEnable;

    /**
    * 是的需要升级引擎 支持 nat拨测 1需要 0不需要
    */
    @SerializedName("NeedProbeEngineUpdate")
    @Expose
    private Long NeedProbeEngineUpdate;

    /**
    * 引擎运行模式，Normal:正常, OnlyRoute:透明模式
    */
    @SerializedName("TrafficMode")
    @Expose
    private String TrafficMode;

    /**
    * 实例主所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例备所在可用区
    */
    @SerializedName("ZoneBak")
    @Expose
    private String ZoneBak;

    /**
    * 引擎预约升级时间
    */
    @SerializedName("ReserveTime")
    @Expose
    private String ReserveTime;

    /**
    * 引擎预约升级版本
    */
    @SerializedName("ReserveVersion")
    @Expose
    private String ReserveVersion;

    /**
    * 引擎预约升级版本状态 stable:稳定版；previewed:预览版
    */
    @SerializedName("ReserveVersionState")
    @Expose
    private String ReserveVersionState;

    /**
    * 弹性开关
1 打开
0 关闭
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Long ElasticSwitch;

    /**
    * 弹性带宽，单位Mbps
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
    * 是否首次开通按量付费
1 是
0 不是
    */
    @SerializedName("IsFirstAfterPay")
    @Expose
    private Long IsFirstAfterPay;

    /**
     * Get nat实例id 
     * @return NatinsId nat实例id
     */
    public String getNatinsId() {
        return this.NatinsId;
    }

    /**
     * Set nat实例id
     * @param NatinsId nat实例id
     */
    public void setNatinsId(String NatinsId) {
        this.NatinsId = NatinsId;
    }

    /**
     * Get nat实例名称 
     * @return NatinsName nat实例名称
     */
    public String getNatinsName() {
        return this.NatinsName;
    }

    /**
     * Set nat实例名称
     * @param NatinsName nat实例名称
     */
    public void setNatinsName(String NatinsName) {
        this.NatinsName = NatinsName;
    }

    /**
     * Get 实例所在地域 
     * @return Region 实例所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域
     * @param Region 实例所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 0: 新增模式，1:接入模式 
     * @return FwMode 0: 新增模式，1:接入模式
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set 0: 新增模式，1:接入模式
     * @param FwMode 0: 新增模式，1:接入模式
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get 实例带宽大小 Mbps 
     * @return BandWidth 实例带宽大小 Mbps
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 实例带宽大小 Mbps
     * @param BandWidth 实例带宽大小 Mbps
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 入向带宽峰值 bps 
     * @return InFlowMax 入向带宽峰值 bps
     */
    public Long getInFlowMax() {
        return this.InFlowMax;
    }

    /**
     * Set 入向带宽峰值 bps
     * @param InFlowMax 入向带宽峰值 bps
     */
    public void setInFlowMax(Long InFlowMax) {
        this.InFlowMax = InFlowMax;
    }

    /**
     * Get 出向带宽峰值 bps 
     * @return OutFlowMax 出向带宽峰值 bps
     */
    public Long getOutFlowMax() {
        return this.OutFlowMax;
    }

    /**
     * Set 出向带宽峰值 bps
     * @param OutFlowMax 出向带宽峰值 bps
     */
    public void setOutFlowMax(Long OutFlowMax) {
        this.OutFlowMax = OutFlowMax;
    }

    /**
     * Get 地域中文信息 
     * @return RegionZh 地域中文信息
     */
    public String getRegionZh() {
        return this.RegionZh;
    }

    /**
     * Set 地域中文信息
     * @param RegionZh 地域中文信息
     */
    public void setRegionZh(String RegionZh) {
        this.RegionZh = RegionZh;
    }

    /**
     * Get 公网ip数组 
     * @return EipAddress 公网ip数组
     */
    public String [] getEipAddress() {
        return this.EipAddress;
    }

    /**
     * Set 公网ip数组
     * @param EipAddress 公网ip数组
     */
    public void setEipAddress(String [] EipAddress) {
        this.EipAddress = EipAddress;
    }

    /**
     * Get 内外使用ip数组 
     * @return VpcIp 内外使用ip数组
     */
    public String [] getVpcIp() {
        return this.VpcIp;
    }

    /**
     * Set 内外使用ip数组
     * @param VpcIp 内外使用ip数组
     */
    public void setVpcIp(String [] VpcIp) {
        this.VpcIp = VpcIp;
    }

    /**
     * Get 实例关联子网数组 
     * @return Subnets 实例关联子网数组
     */
    public String [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set 实例关联子网数组
     * @param Subnets 实例关联子网数组
     */
    public void setSubnets(String [] Subnets) {
        this.Subnets = Subnets;
    }

    /**
     * Get 0 :正常 1：正在初始化 
     * @return Status 0 :正常 1：正在初始化
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 :正常 1：正在初始化
     * @param Status 0 :正常 1：正在初始化
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 地域区域信息 
     * @return RegionDetail 地域区域信息
     */
    public String getRegionDetail() {
        return this.RegionDetail;
    }

    /**
     * Set 地域区域信息
     * @param RegionDetail 地域区域信息
     */
    public void setRegionDetail(String RegionDetail) {
        this.RegionDetail = RegionDetail;
    }

    /**
     * Get 实例所在可用区 
     * @return ZoneZh 实例所在可用区
     */
    public String getZoneZh() {
        return this.ZoneZh;
    }

    /**
     * Set 实例所在可用区
     * @param ZoneZh 实例所在可用区
     */
    public void setZoneZh(String ZoneZh) {
        this.ZoneZh = ZoneZh;
    }

    /**
     * Get 实例所在可用区 
     * @return ZoneZhBak 实例所在可用区
     */
    public String getZoneZhBak() {
        return this.ZoneZhBak;
    }

    /**
     * Set 实例所在可用区
     * @param ZoneZhBak 实例所在可用区
     */
    public void setZoneZhBak(String ZoneZhBak) {
        this.ZoneZhBak = ZoneZhBak;
    }

    /**
     * Get 已使用规则数 
     * @return RuleUsed 已使用规则数
     */
    public Long getRuleUsed() {
        return this.RuleUsed;
    }

    /**
     * Set 已使用规则数
     * @param RuleUsed 已使用规则数
     */
    public void setRuleUsed(Long RuleUsed) {
        this.RuleUsed = RuleUsed;
    }

    /**
     * Get 实例的规则限制最大规格数 
     * @return RuleMax 实例的规则限制最大规格数
     */
    public Long getRuleMax() {
        return this.RuleMax;
    }

    /**
     * Set 实例的规则限制最大规格数
     * @param RuleMax 实例的规则限制最大规格数
     */
    public void setRuleMax(Long RuleMax) {
        this.RuleMax = RuleMax;
    }

    /**
     * Get 实例引擎版本 
     * @return EngineVersion 实例引擎版本
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 实例引擎版本
     * @param EngineVersion 实例引擎版本
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 引擎是否可升级：0，不可升级；1，可升级 
     * @return UpdateEnable 引擎是否可升级：0，不可升级；1，可升级
     */
    public Long getUpdateEnable() {
        return this.UpdateEnable;
    }

    /**
     * Set 引擎是否可升级：0，不可升级；1，可升级
     * @param UpdateEnable 引擎是否可升级：0，不可升级；1，可升级
     */
    public void setUpdateEnable(Long UpdateEnable) {
        this.UpdateEnable = UpdateEnable;
    }

    /**
     * Get 是的需要升级引擎 支持 nat拨测 1需要 0不需要 
     * @return NeedProbeEngineUpdate 是的需要升级引擎 支持 nat拨测 1需要 0不需要
     */
    public Long getNeedProbeEngineUpdate() {
        return this.NeedProbeEngineUpdate;
    }

    /**
     * Set 是的需要升级引擎 支持 nat拨测 1需要 0不需要
     * @param NeedProbeEngineUpdate 是的需要升级引擎 支持 nat拨测 1需要 0不需要
     */
    public void setNeedProbeEngineUpdate(Long NeedProbeEngineUpdate) {
        this.NeedProbeEngineUpdate = NeedProbeEngineUpdate;
    }

    /**
     * Get 引擎运行模式，Normal:正常, OnlyRoute:透明模式 
     * @return TrafficMode 引擎运行模式，Normal:正常, OnlyRoute:透明模式
     */
    public String getTrafficMode() {
        return this.TrafficMode;
    }

    /**
     * Set 引擎运行模式，Normal:正常, OnlyRoute:透明模式
     * @param TrafficMode 引擎运行模式，Normal:正常, OnlyRoute:透明模式
     */
    public void setTrafficMode(String TrafficMode) {
        this.TrafficMode = TrafficMode;
    }

    /**
     * Get 实例主所在可用区 
     * @return Zone 实例主所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例主所在可用区
     * @param Zone 实例主所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例备所在可用区 
     * @return ZoneBak 实例备所在可用区
     */
    public String getZoneBak() {
        return this.ZoneBak;
    }

    /**
     * Set 实例备所在可用区
     * @param ZoneBak 实例备所在可用区
     */
    public void setZoneBak(String ZoneBak) {
        this.ZoneBak = ZoneBak;
    }

    /**
     * Get 引擎预约升级时间 
     * @return ReserveTime 引擎预约升级时间
     */
    public String getReserveTime() {
        return this.ReserveTime;
    }

    /**
     * Set 引擎预约升级时间
     * @param ReserveTime 引擎预约升级时间
     */
    public void setReserveTime(String ReserveTime) {
        this.ReserveTime = ReserveTime;
    }

    /**
     * Get 引擎预约升级版本 
     * @return ReserveVersion 引擎预约升级版本
     */
    public String getReserveVersion() {
        return this.ReserveVersion;
    }

    /**
     * Set 引擎预约升级版本
     * @param ReserveVersion 引擎预约升级版本
     */
    public void setReserveVersion(String ReserveVersion) {
        this.ReserveVersion = ReserveVersion;
    }

    /**
     * Get 引擎预约升级版本状态 stable:稳定版；previewed:预览版 
     * @return ReserveVersionState 引擎预约升级版本状态 stable:稳定版；previewed:预览版
     */
    public String getReserveVersionState() {
        return this.ReserveVersionState;
    }

    /**
     * Set 引擎预约升级版本状态 stable:稳定版；previewed:预览版
     * @param ReserveVersionState 引擎预约升级版本状态 stable:稳定版；previewed:预览版
     */
    public void setReserveVersionState(String ReserveVersionState) {
        this.ReserveVersionState = ReserveVersionState;
    }

    /**
     * Get 弹性开关
1 打开
0 关闭 
     * @return ElasticSwitch 弹性开关
1 打开
0 关闭
     */
    public Long getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set 弹性开关
1 打开
0 关闭
     * @param ElasticSwitch 弹性开关
1 打开
0 关闭
     */
    public void setElasticSwitch(Long ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get 弹性带宽，单位Mbps 
     * @return ElasticBandwidth 弹性带宽，单位Mbps
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set 弹性带宽，单位Mbps
     * @param ElasticBandwidth 弹性带宽，单位Mbps
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    /**
     * Get 是否首次开通按量付费
1 是
0 不是 
     * @return IsFirstAfterPay 是否首次开通按量付费
1 是
0 不是
     */
    public Long getIsFirstAfterPay() {
        return this.IsFirstAfterPay;
    }

    /**
     * Set 是否首次开通按量付费
1 是
0 不是
     * @param IsFirstAfterPay 是否首次开通按量付费
1 是
0 不是
     */
    public void setIsFirstAfterPay(Long IsFirstAfterPay) {
        this.IsFirstAfterPay = IsFirstAfterPay;
    }

    public NatInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatInstanceInfo(NatInstanceInfo source) {
        if (source.NatinsId != null) {
            this.NatinsId = new String(source.NatinsId);
        }
        if (source.NatinsName != null) {
            this.NatinsName = new String(source.NatinsName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FwMode != null) {
            this.FwMode = new Long(source.FwMode);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.InFlowMax != null) {
            this.InFlowMax = new Long(source.InFlowMax);
        }
        if (source.OutFlowMax != null) {
            this.OutFlowMax = new Long(source.OutFlowMax);
        }
        if (source.RegionZh != null) {
            this.RegionZh = new String(source.RegionZh);
        }
        if (source.EipAddress != null) {
            this.EipAddress = new String[source.EipAddress.length];
            for (int i = 0; i < source.EipAddress.length; i++) {
                this.EipAddress[i] = new String(source.EipAddress[i]);
            }
        }
        if (source.VpcIp != null) {
            this.VpcIp = new String[source.VpcIp.length];
            for (int i = 0; i < source.VpcIp.length; i++) {
                this.VpcIp[i] = new String(source.VpcIp[i]);
            }
        }
        if (source.Subnets != null) {
            this.Subnets = new String[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new String(source.Subnets[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RegionDetail != null) {
            this.RegionDetail = new String(source.RegionDetail);
        }
        if (source.ZoneZh != null) {
            this.ZoneZh = new String(source.ZoneZh);
        }
        if (source.ZoneZhBak != null) {
            this.ZoneZhBak = new String(source.ZoneZhBak);
        }
        if (source.RuleUsed != null) {
            this.RuleUsed = new Long(source.RuleUsed);
        }
        if (source.RuleMax != null) {
            this.RuleMax = new Long(source.RuleMax);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.UpdateEnable != null) {
            this.UpdateEnable = new Long(source.UpdateEnable);
        }
        if (source.NeedProbeEngineUpdate != null) {
            this.NeedProbeEngineUpdate = new Long(source.NeedProbeEngineUpdate);
        }
        if (source.TrafficMode != null) {
            this.TrafficMode = new String(source.TrafficMode);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneBak != null) {
            this.ZoneBak = new String(source.ZoneBak);
        }
        if (source.ReserveTime != null) {
            this.ReserveTime = new String(source.ReserveTime);
        }
        if (source.ReserveVersion != null) {
            this.ReserveVersion = new String(source.ReserveVersion);
        }
        if (source.ReserveVersionState != null) {
            this.ReserveVersionState = new String(source.ReserveVersionState);
        }
        if (source.ElasticSwitch != null) {
            this.ElasticSwitch = new Long(source.ElasticSwitch);
        }
        if (source.ElasticBandwidth != null) {
            this.ElasticBandwidth = new Long(source.ElasticBandwidth);
        }
        if (source.IsFirstAfterPay != null) {
            this.IsFirstAfterPay = new Long(source.IsFirstAfterPay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatinsId", this.NatinsId);
        this.setParamSimple(map, prefix + "NatinsName", this.NatinsName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FwMode", this.FwMode);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "InFlowMax", this.InFlowMax);
        this.setParamSimple(map, prefix + "OutFlowMax", this.OutFlowMax);
        this.setParamSimple(map, prefix + "RegionZh", this.RegionZh);
        this.setParamArraySimple(map, prefix + "EipAddress.", this.EipAddress);
        this.setParamArraySimple(map, prefix + "VpcIp.", this.VpcIp);
        this.setParamArraySimple(map, prefix + "Subnets.", this.Subnets);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RegionDetail", this.RegionDetail);
        this.setParamSimple(map, prefix + "ZoneZh", this.ZoneZh);
        this.setParamSimple(map, prefix + "ZoneZhBak", this.ZoneZhBak);
        this.setParamSimple(map, prefix + "RuleUsed", this.RuleUsed);
        this.setParamSimple(map, prefix + "RuleMax", this.RuleMax);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "UpdateEnable", this.UpdateEnable);
        this.setParamSimple(map, prefix + "NeedProbeEngineUpdate", this.NeedProbeEngineUpdate);
        this.setParamSimple(map, prefix + "TrafficMode", this.TrafficMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneBak", this.ZoneBak);
        this.setParamSimple(map, prefix + "ReserveTime", this.ReserveTime);
        this.setParamSimple(map, prefix + "ReserveVersion", this.ReserveVersion);
        this.setParamSimple(map, prefix + "ReserveVersionState", this.ReserveVersionState);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticBandwidth", this.ElasticBandwidth);
        this.setParamSimple(map, prefix + "IsFirstAfterPay", this.IsFirstAfterPay);

    }
}

