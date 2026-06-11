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
    * <p>nat实例id</p>
    */
    @SerializedName("NatinsId")
    @Expose
    private String NatinsId;

    /**
    * <p>nat实例名称</p>
    */
    @SerializedName("NatinsName")
    @Expose
    private String NatinsName;

    /**
    * <p>实例所在地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>0: 新增模式，1:接入模式</p>
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * <p>实例带宽大小 Mbps</p>
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <p>入向带宽峰值 bps</p>
    */
    @SerializedName("InFlowMax")
    @Expose
    private Long InFlowMax;

    /**
    * <p>出向带宽峰值 bps</p>
    */
    @SerializedName("OutFlowMax")
    @Expose
    private Long OutFlowMax;

    /**
    * <p>地域中文信息</p>
    */
    @SerializedName("RegionZh")
    @Expose
    private String RegionZh;

    /**
    * <p>公网ip数组</p>
    */
    @SerializedName("EipAddress")
    @Expose
    private String [] EipAddress;

    /**
    * <p>内外使用ip数组</p>
    */
    @SerializedName("VpcIp")
    @Expose
    private String [] VpcIp;

    /**
    * <p>实例关联子网数组</p>
    */
    @SerializedName("Subnets")
    @Expose
    private String [] Subnets;

    /**
    * <p>0 :正常 1：正在初始化</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>地域区域信息</p>
    */
    @SerializedName("RegionDetail")
    @Expose
    private String RegionDetail;

    /**
    * <p>实例所在可用区</p>
    */
    @SerializedName("ZoneZh")
    @Expose
    private String ZoneZh;

    /**
    * <p>实例所在可用区</p>
    */
    @SerializedName("ZoneZhBak")
    @Expose
    private String ZoneZhBak;

    /**
    * <p>已使用规则数</p>
    */
    @SerializedName("RuleUsed")
    @Expose
    private Long RuleUsed;

    /**
    * <p>实例的规则限制最大规格数</p>
    */
    @SerializedName("RuleMax")
    @Expose
    private Long RuleMax;

    /**
    * <p>实例引擎版本</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>引擎是否可升级：0，不可升级；1，可升级</p>
    */
    @SerializedName("UpdateEnable")
    @Expose
    private Long UpdateEnable;

    /**
    * <p>是的需要升级引擎 支持 nat拨测 1需要 0不需要</p>
    */
    @SerializedName("NeedProbeEngineUpdate")
    @Expose
    private Long NeedProbeEngineUpdate;

    /**
    * <p>引擎运行模式，Normal:正常, OnlyRoute:透明模式</p>
    */
    @SerializedName("TrafficMode")
    @Expose
    private String TrafficMode;

    /**
    * <p>实例主所在可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例备所在可用区</p>
    */
    @SerializedName("ZoneBak")
    @Expose
    private String ZoneBak;

    /**
    * <p>引擎预约升级时间</p>
    */
    @SerializedName("ReserveTime")
    @Expose
    private String ReserveTime;

    /**
    * <p>引擎预约升级版本</p>
    */
    @SerializedName("ReserveVersion")
    @Expose
    private String ReserveVersion;

    /**
    * <p>引擎预约升级版本状态 stable:稳定版；previewed:预览版</p>
    */
    @SerializedName("ReserveVersionState")
    @Expose
    private String ReserveVersionState;

    /**
    * <p>弹性开关<br>1 打开<br>0 关闭</p>
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Long ElasticSwitch;

    /**
    * <p>弹性带宽，单位Mbps</p>
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
    * <p>是否首次开通按量付费<br>1 是<br>0 不是</p>
    */
    @SerializedName("IsFirstAfterPay")
    @Expose
    private Long IsFirstAfterPay;

    /**
    * <p>按流量弹性开关</p><p>默认值：0</p>
    */
    @SerializedName("ElasticTrafficSwitch")
    @Expose
    private Long ElasticTrafficSwitch;

    /**
     * Get <p>nat实例id</p> 
     * @return NatinsId <p>nat实例id</p>
     */
    public String getNatinsId() {
        return this.NatinsId;
    }

    /**
     * Set <p>nat实例id</p>
     * @param NatinsId <p>nat实例id</p>
     */
    public void setNatinsId(String NatinsId) {
        this.NatinsId = NatinsId;
    }

    /**
     * Get <p>nat实例名称</p> 
     * @return NatinsName <p>nat实例名称</p>
     */
    public String getNatinsName() {
        return this.NatinsName;
    }

    /**
     * Set <p>nat实例名称</p>
     * @param NatinsName <p>nat实例名称</p>
     */
    public void setNatinsName(String NatinsName) {
        this.NatinsName = NatinsName;
    }

    /**
     * Get <p>实例所在地域</p> 
     * @return Region <p>实例所在地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所在地域</p>
     * @param Region <p>实例所在地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>0: 新增模式，1:接入模式</p> 
     * @return FwMode <p>0: 新增模式，1:接入模式</p>
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set <p>0: 新增模式，1:接入模式</p>
     * @param FwMode <p>0: 新增模式，1:接入模式</p>
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get <p>实例带宽大小 Mbps</p> 
     * @return BandWidth <p>实例带宽大小 Mbps</p>
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>实例带宽大小 Mbps</p>
     * @param BandWidth <p>实例带宽大小 Mbps</p>
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <p>入向带宽峰值 bps</p> 
     * @return InFlowMax <p>入向带宽峰值 bps</p>
     */
    public Long getInFlowMax() {
        return this.InFlowMax;
    }

    /**
     * Set <p>入向带宽峰值 bps</p>
     * @param InFlowMax <p>入向带宽峰值 bps</p>
     */
    public void setInFlowMax(Long InFlowMax) {
        this.InFlowMax = InFlowMax;
    }

    /**
     * Get <p>出向带宽峰值 bps</p> 
     * @return OutFlowMax <p>出向带宽峰值 bps</p>
     */
    public Long getOutFlowMax() {
        return this.OutFlowMax;
    }

    /**
     * Set <p>出向带宽峰值 bps</p>
     * @param OutFlowMax <p>出向带宽峰值 bps</p>
     */
    public void setOutFlowMax(Long OutFlowMax) {
        this.OutFlowMax = OutFlowMax;
    }

    /**
     * Get <p>地域中文信息</p> 
     * @return RegionZh <p>地域中文信息</p>
     */
    public String getRegionZh() {
        return this.RegionZh;
    }

    /**
     * Set <p>地域中文信息</p>
     * @param RegionZh <p>地域中文信息</p>
     */
    public void setRegionZh(String RegionZh) {
        this.RegionZh = RegionZh;
    }

    /**
     * Get <p>公网ip数组</p> 
     * @return EipAddress <p>公网ip数组</p>
     */
    public String [] getEipAddress() {
        return this.EipAddress;
    }

    /**
     * Set <p>公网ip数组</p>
     * @param EipAddress <p>公网ip数组</p>
     */
    public void setEipAddress(String [] EipAddress) {
        this.EipAddress = EipAddress;
    }

    /**
     * Get <p>内外使用ip数组</p> 
     * @return VpcIp <p>内外使用ip数组</p>
     */
    public String [] getVpcIp() {
        return this.VpcIp;
    }

    /**
     * Set <p>内外使用ip数组</p>
     * @param VpcIp <p>内外使用ip数组</p>
     */
    public void setVpcIp(String [] VpcIp) {
        this.VpcIp = VpcIp;
    }

    /**
     * Get <p>实例关联子网数组</p> 
     * @return Subnets <p>实例关联子网数组</p>
     */
    public String [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set <p>实例关联子网数组</p>
     * @param Subnets <p>实例关联子网数组</p>
     */
    public void setSubnets(String [] Subnets) {
        this.Subnets = Subnets;
    }

    /**
     * Get <p>0 :正常 1：正在初始化</p> 
     * @return Status <p>0 :正常 1：正在初始化</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>0 :正常 1：正在初始化</p>
     * @param Status <p>0 :正常 1：正在初始化</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>地域区域信息</p> 
     * @return RegionDetail <p>地域区域信息</p>
     */
    public String getRegionDetail() {
        return this.RegionDetail;
    }

    /**
     * Set <p>地域区域信息</p>
     * @param RegionDetail <p>地域区域信息</p>
     */
    public void setRegionDetail(String RegionDetail) {
        this.RegionDetail = RegionDetail;
    }

    /**
     * Get <p>实例所在可用区</p> 
     * @return ZoneZh <p>实例所在可用区</p>
     */
    public String getZoneZh() {
        return this.ZoneZh;
    }

    /**
     * Set <p>实例所在可用区</p>
     * @param ZoneZh <p>实例所在可用区</p>
     */
    public void setZoneZh(String ZoneZh) {
        this.ZoneZh = ZoneZh;
    }

    /**
     * Get <p>实例所在可用区</p> 
     * @return ZoneZhBak <p>实例所在可用区</p>
     */
    public String getZoneZhBak() {
        return this.ZoneZhBak;
    }

    /**
     * Set <p>实例所在可用区</p>
     * @param ZoneZhBak <p>实例所在可用区</p>
     */
    public void setZoneZhBak(String ZoneZhBak) {
        this.ZoneZhBak = ZoneZhBak;
    }

    /**
     * Get <p>已使用规则数</p> 
     * @return RuleUsed <p>已使用规则数</p>
     */
    public Long getRuleUsed() {
        return this.RuleUsed;
    }

    /**
     * Set <p>已使用规则数</p>
     * @param RuleUsed <p>已使用规则数</p>
     */
    public void setRuleUsed(Long RuleUsed) {
        this.RuleUsed = RuleUsed;
    }

    /**
     * Get <p>实例的规则限制最大规格数</p> 
     * @return RuleMax <p>实例的规则限制最大规格数</p>
     */
    public Long getRuleMax() {
        return this.RuleMax;
    }

    /**
     * Set <p>实例的规则限制最大规格数</p>
     * @param RuleMax <p>实例的规则限制最大规格数</p>
     */
    public void setRuleMax(Long RuleMax) {
        this.RuleMax = RuleMax;
    }

    /**
     * Get <p>实例引擎版本</p> 
     * @return EngineVersion <p>实例引擎版本</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>实例引擎版本</p>
     * @param EngineVersion <p>实例引擎版本</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>引擎是否可升级：0，不可升级；1，可升级</p> 
     * @return UpdateEnable <p>引擎是否可升级：0，不可升级；1，可升级</p>
     */
    public Long getUpdateEnable() {
        return this.UpdateEnable;
    }

    /**
     * Set <p>引擎是否可升级：0，不可升级；1，可升级</p>
     * @param UpdateEnable <p>引擎是否可升级：0，不可升级；1，可升级</p>
     */
    public void setUpdateEnable(Long UpdateEnable) {
        this.UpdateEnable = UpdateEnable;
    }

    /**
     * Get <p>是的需要升级引擎 支持 nat拨测 1需要 0不需要</p> 
     * @return NeedProbeEngineUpdate <p>是的需要升级引擎 支持 nat拨测 1需要 0不需要</p>
     */
    public Long getNeedProbeEngineUpdate() {
        return this.NeedProbeEngineUpdate;
    }

    /**
     * Set <p>是的需要升级引擎 支持 nat拨测 1需要 0不需要</p>
     * @param NeedProbeEngineUpdate <p>是的需要升级引擎 支持 nat拨测 1需要 0不需要</p>
     */
    public void setNeedProbeEngineUpdate(Long NeedProbeEngineUpdate) {
        this.NeedProbeEngineUpdate = NeedProbeEngineUpdate;
    }

    /**
     * Get <p>引擎运行模式，Normal:正常, OnlyRoute:透明模式</p> 
     * @return TrafficMode <p>引擎运行模式，Normal:正常, OnlyRoute:透明模式</p>
     */
    public String getTrafficMode() {
        return this.TrafficMode;
    }

    /**
     * Set <p>引擎运行模式，Normal:正常, OnlyRoute:透明模式</p>
     * @param TrafficMode <p>引擎运行模式，Normal:正常, OnlyRoute:透明模式</p>
     */
    public void setTrafficMode(String TrafficMode) {
        this.TrafficMode = TrafficMode;
    }

    /**
     * Get <p>实例主所在可用区</p> 
     * @return Zone <p>实例主所在可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例主所在可用区</p>
     * @param Zone <p>实例主所在可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例备所在可用区</p> 
     * @return ZoneBak <p>实例备所在可用区</p>
     */
    public String getZoneBak() {
        return this.ZoneBak;
    }

    /**
     * Set <p>实例备所在可用区</p>
     * @param ZoneBak <p>实例备所在可用区</p>
     */
    public void setZoneBak(String ZoneBak) {
        this.ZoneBak = ZoneBak;
    }

    /**
     * Get <p>引擎预约升级时间</p> 
     * @return ReserveTime <p>引擎预约升级时间</p>
     */
    public String getReserveTime() {
        return this.ReserveTime;
    }

    /**
     * Set <p>引擎预约升级时间</p>
     * @param ReserveTime <p>引擎预约升级时间</p>
     */
    public void setReserveTime(String ReserveTime) {
        this.ReserveTime = ReserveTime;
    }

    /**
     * Get <p>引擎预约升级版本</p> 
     * @return ReserveVersion <p>引擎预约升级版本</p>
     */
    public String getReserveVersion() {
        return this.ReserveVersion;
    }

    /**
     * Set <p>引擎预约升级版本</p>
     * @param ReserveVersion <p>引擎预约升级版本</p>
     */
    public void setReserveVersion(String ReserveVersion) {
        this.ReserveVersion = ReserveVersion;
    }

    /**
     * Get <p>引擎预约升级版本状态 stable:稳定版；previewed:预览版</p> 
     * @return ReserveVersionState <p>引擎预约升级版本状态 stable:稳定版；previewed:预览版</p>
     */
    public String getReserveVersionState() {
        return this.ReserveVersionState;
    }

    /**
     * Set <p>引擎预约升级版本状态 stable:稳定版；previewed:预览版</p>
     * @param ReserveVersionState <p>引擎预约升级版本状态 stable:稳定版；previewed:预览版</p>
     */
    public void setReserveVersionState(String ReserveVersionState) {
        this.ReserveVersionState = ReserveVersionState;
    }

    /**
     * Get <p>弹性开关<br>1 打开<br>0 关闭</p> 
     * @return ElasticSwitch <p>弹性开关<br>1 打开<br>0 关闭</p>
     */
    public Long getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set <p>弹性开关<br>1 打开<br>0 关闭</p>
     * @param ElasticSwitch <p>弹性开关<br>1 打开<br>0 关闭</p>
     */
    public void setElasticSwitch(Long ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get <p>弹性带宽，单位Mbps</p> 
     * @return ElasticBandwidth <p>弹性带宽，单位Mbps</p>
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set <p>弹性带宽，单位Mbps</p>
     * @param ElasticBandwidth <p>弹性带宽，单位Mbps</p>
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    /**
     * Get <p>是否首次开通按量付费<br>1 是<br>0 不是</p> 
     * @return IsFirstAfterPay <p>是否首次开通按量付费<br>1 是<br>0 不是</p>
     */
    public Long getIsFirstAfterPay() {
        return this.IsFirstAfterPay;
    }

    /**
     * Set <p>是否首次开通按量付费<br>1 是<br>0 不是</p>
     * @param IsFirstAfterPay <p>是否首次开通按量付费<br>1 是<br>0 不是</p>
     */
    public void setIsFirstAfterPay(Long IsFirstAfterPay) {
        this.IsFirstAfterPay = IsFirstAfterPay;
    }

    /**
     * Get <p>按流量弹性开关</p><p>默认值：0</p> 
     * @return ElasticTrafficSwitch <p>按流量弹性开关</p><p>默认值：0</p>
     */
    public Long getElasticTrafficSwitch() {
        return this.ElasticTrafficSwitch;
    }

    /**
     * Set <p>按流量弹性开关</p><p>默认值：0</p>
     * @param ElasticTrafficSwitch <p>按流量弹性开关</p><p>默认值：0</p>
     */
    public void setElasticTrafficSwitch(Long ElasticTrafficSwitch) {
        this.ElasticTrafficSwitch = ElasticTrafficSwitch;
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
        if (source.ElasticTrafficSwitch != null) {
            this.ElasticTrafficSwitch = new Long(source.ElasticTrafficSwitch);
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
        this.setParamSimple(map, prefix + "ElasticTrafficSwitch", this.ElasticTrafficSwitch);

    }
}

