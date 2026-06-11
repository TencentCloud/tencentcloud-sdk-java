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

public class VpcFwInstanceInfo extends AbstractModel {

    /**
    * <p>VPC防火墙实例名称</p>
    */
    @SerializedName("FwInsName")
    @Expose
    private String FwInsName;

    /**
    * <p>VPC防火墙实例ID</p>
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * <p>VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙</p>
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * <p>VPC防火墙接入网络实例个数</p>
    */
    @SerializedName("JoinInsNum")
    @Expose
    private Long JoinInsNum;

    /**
    * <p>VPC防火墙开关个数</p>
    */
    @SerializedName("FwSwitchNum")
    @Expose
    private Long FwSwitchNum;

    /**
    * <p>VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>VPC防火墙创建时间</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>VPC 相关云联网ID列表</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String [] CcnId;

    /**
    * <p>VPC 相关云联网名称列表</p>
    */
    @SerializedName("CcnName")
    @Expose
    private String [] CcnName;

    /**
    * <p>VPC 相关对等连接ID列表</p>
    */
    @SerializedName("PeerConnectionId")
    @Expose
    private String [] PeerConnectionId;

    /**
    * <p>VPC 相关对等连接名称列表</p>
    */
    @SerializedName("PeerConnectionName")
    @Expose
    private String [] PeerConnectionName;

    /**
    * <p>VPC防火墙CVM的列表</p>
    */
    @SerializedName("FwCvmLst")
    @Expose
    private VpcFwCvmInsInfo [] FwCvmLst;

    /**
    * <p>VPC防火墙接入网络实例类型列表</p>
    */
    @SerializedName("JoinInsLst")
    @Expose
    private VpcFwJoinInstanceType [] JoinInsLst;

    /**
    * <p>防火墙网关信息</p>
    */
    @SerializedName("FwGateway")
    @Expose
    private FwGateway [] FwGateway;

    /**
    * <p>防火墙(组)ID</p>
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * <p>已使用规则数</p>
    */
    @SerializedName("RuleUsed")
    @Expose
    private Long RuleUsed;

    /**
    * <p>最大规则数</p>
    */
    @SerializedName("RuleMax")
    @Expose
    private Long RuleMax;

    /**
    * <p>防火墙实例带宽</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>用户VPC墙总带宽</p>
    */
    @SerializedName("UserVpcWidth")
    @Expose
    private Long UserVpcWidth;

    /**
    * <p>接入的vpc列表</p>
    */
    @SerializedName("JoinInsIdLst")
    @Expose
    private String [] JoinInsIdLst;

    /**
    * <p>内网间峰值带宽 (单位 bps )</p>
    */
    @SerializedName("FlowMax")
    @Expose
    private Long FlowMax;

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
    * <p>引擎运行模式，Normal:正常, OnlyRoute:透明模式</p>
    */
    @SerializedName("TrafficMode")
    @Expose
    private String TrafficMode;

    /**
    * <p>引擎预约升级时间</p>
    */
    @SerializedName("ReserveTime")
    @Expose
    private String ReserveTime;

    /**
    * <p>预约引擎升级版本</p>
    */
    @SerializedName("ReserveVersion")
    @Expose
    private String ReserveVersion;

    /**
    * <p>引擎预约升级版本状态</p>
    */
    @SerializedName("ReserveVersionState")
    @Expose
    private String ReserveVersionState;

    /**
    * <p>弹性开关 1打开 0关闭</p>
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
    * <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
    */
    @SerializedName("ElasticTrafficSwitch")
    @Expose
    private Long ElasticTrafficSwitch;

    /**
     * Get <p>VPC防火墙实例名称</p> 
     * @return FwInsName <p>VPC防火墙实例名称</p>
     */
    public String getFwInsName() {
        return this.FwInsName;
    }

    /**
     * Set <p>VPC防火墙实例名称</p>
     * @param FwInsName <p>VPC防火墙实例名称</p>
     */
    public void setFwInsName(String FwInsName) {
        this.FwInsName = FwInsName;
    }

    /**
     * Get <p>VPC防火墙实例ID</p> 
     * @return FwInsId <p>VPC防火墙实例ID</p>
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set <p>VPC防火墙实例ID</p>
     * @param FwInsId <p>VPC防火墙实例ID</p>
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get <p>VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙</p> 
     * @return FwMode <p>VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙</p>
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set <p>VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙</p>
     * @param FwMode <p>VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙</p>
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get <p>VPC防火墙接入网络实例个数</p> 
     * @return JoinInsNum <p>VPC防火墙接入网络实例个数</p>
     */
    public Long getJoinInsNum() {
        return this.JoinInsNum;
    }

    /**
     * Set <p>VPC防火墙接入网络实例个数</p>
     * @param JoinInsNum <p>VPC防火墙接入网络实例个数</p>
     */
    public void setJoinInsNum(Long JoinInsNum) {
        this.JoinInsNum = JoinInsNum;
    }

    /**
     * Get <p>VPC防火墙开关个数</p> 
     * @return FwSwitchNum <p>VPC防火墙开关个数</p>
     */
    public Long getFwSwitchNum() {
        return this.FwSwitchNum;
    }

    /**
     * Set <p>VPC防火墙开关个数</p>
     * @param FwSwitchNum <p>VPC防火墙开关个数</p>
     */
    public void setFwSwitchNum(Long FwSwitchNum) {
        this.FwSwitchNum = FwSwitchNum;
    }

    /**
     * Get <p>VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中</p> 
     * @return Status <p>VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中</p>
     * @param Status <p>VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>VPC防火墙创建时间</p> 
     * @return Time <p>VPC防火墙创建时间</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>VPC防火墙创建时间</p>
     * @param Time <p>VPC防火墙创建时间</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>VPC 相关云联网ID列表</p> 
     * @return CcnId <p>VPC 相关云联网ID列表</p>
     */
    public String [] getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>VPC 相关云联网ID列表</p>
     * @param CcnId <p>VPC 相关云联网ID列表</p>
     */
    public void setCcnId(String [] CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>VPC 相关云联网名称列表</p> 
     * @return CcnName <p>VPC 相关云联网名称列表</p>
     */
    public String [] getCcnName() {
        return this.CcnName;
    }

    /**
     * Set <p>VPC 相关云联网名称列表</p>
     * @param CcnName <p>VPC 相关云联网名称列表</p>
     */
    public void setCcnName(String [] CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get <p>VPC 相关对等连接ID列表</p> 
     * @return PeerConnectionId <p>VPC 相关对等连接ID列表</p>
     */
    public String [] getPeerConnectionId() {
        return this.PeerConnectionId;
    }

    /**
     * Set <p>VPC 相关对等连接ID列表</p>
     * @param PeerConnectionId <p>VPC 相关对等连接ID列表</p>
     */
    public void setPeerConnectionId(String [] PeerConnectionId) {
        this.PeerConnectionId = PeerConnectionId;
    }

    /**
     * Get <p>VPC 相关对等连接名称列表</p> 
     * @return PeerConnectionName <p>VPC 相关对等连接名称列表</p>
     */
    public String [] getPeerConnectionName() {
        return this.PeerConnectionName;
    }

    /**
     * Set <p>VPC 相关对等连接名称列表</p>
     * @param PeerConnectionName <p>VPC 相关对等连接名称列表</p>
     */
    public void setPeerConnectionName(String [] PeerConnectionName) {
        this.PeerConnectionName = PeerConnectionName;
    }

    /**
     * Get <p>VPC防火墙CVM的列表</p> 
     * @return FwCvmLst <p>VPC防火墙CVM的列表</p>
     */
    public VpcFwCvmInsInfo [] getFwCvmLst() {
        return this.FwCvmLst;
    }

    /**
     * Set <p>VPC防火墙CVM的列表</p>
     * @param FwCvmLst <p>VPC防火墙CVM的列表</p>
     */
    public void setFwCvmLst(VpcFwCvmInsInfo [] FwCvmLst) {
        this.FwCvmLst = FwCvmLst;
    }

    /**
     * Get <p>VPC防火墙接入网络实例类型列表</p> 
     * @return JoinInsLst <p>VPC防火墙接入网络实例类型列表</p>
     */
    public VpcFwJoinInstanceType [] getJoinInsLst() {
        return this.JoinInsLst;
    }

    /**
     * Set <p>VPC防火墙接入网络实例类型列表</p>
     * @param JoinInsLst <p>VPC防火墙接入网络实例类型列表</p>
     */
    public void setJoinInsLst(VpcFwJoinInstanceType [] JoinInsLst) {
        this.JoinInsLst = JoinInsLst;
    }

    /**
     * Get <p>防火墙网关信息</p> 
     * @return FwGateway <p>防火墙网关信息</p>
     */
    public FwGateway [] getFwGateway() {
        return this.FwGateway;
    }

    /**
     * Set <p>防火墙网关信息</p>
     * @param FwGateway <p>防火墙网关信息</p>
     */
    public void setFwGateway(FwGateway [] FwGateway) {
        this.FwGateway = FwGateway;
    }

    /**
     * Get <p>防火墙(组)ID</p> 
     * @return FwGroupId <p>防火墙(组)ID</p>
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set <p>防火墙(组)ID</p>
     * @param FwGroupId <p>防火墙(组)ID</p>
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
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
     * Get <p>最大规则数</p> 
     * @return RuleMax <p>最大规则数</p>
     */
    public Long getRuleMax() {
        return this.RuleMax;
    }

    /**
     * Set <p>最大规则数</p>
     * @param RuleMax <p>最大规则数</p>
     */
    public void setRuleMax(Long RuleMax) {
        this.RuleMax = RuleMax;
    }

    /**
     * Get <p>防火墙实例带宽</p> 
     * @return Width <p>防火墙实例带宽</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>防火墙实例带宽</p>
     * @param Width <p>防火墙实例带宽</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>用户VPC墙总带宽</p> 
     * @return UserVpcWidth <p>用户VPC墙总带宽</p>
     */
    public Long getUserVpcWidth() {
        return this.UserVpcWidth;
    }

    /**
     * Set <p>用户VPC墙总带宽</p>
     * @param UserVpcWidth <p>用户VPC墙总带宽</p>
     */
    public void setUserVpcWidth(Long UserVpcWidth) {
        this.UserVpcWidth = UserVpcWidth;
    }

    /**
     * Get <p>接入的vpc列表</p> 
     * @return JoinInsIdLst <p>接入的vpc列表</p>
     */
    public String [] getJoinInsIdLst() {
        return this.JoinInsIdLst;
    }

    /**
     * Set <p>接入的vpc列表</p>
     * @param JoinInsIdLst <p>接入的vpc列表</p>
     */
    public void setJoinInsIdLst(String [] JoinInsIdLst) {
        this.JoinInsIdLst = JoinInsIdLst;
    }

    /**
     * Get <p>内网间峰值带宽 (单位 bps )</p> 
     * @return FlowMax <p>内网间峰值带宽 (单位 bps )</p>
     */
    public Long getFlowMax() {
        return this.FlowMax;
    }

    /**
     * Set <p>内网间峰值带宽 (单位 bps )</p>
     * @param FlowMax <p>内网间峰值带宽 (单位 bps )</p>
     */
    public void setFlowMax(Long FlowMax) {
        this.FlowMax = FlowMax;
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
     * Get <p>预约引擎升级版本</p> 
     * @return ReserveVersion <p>预约引擎升级版本</p>
     */
    public String getReserveVersion() {
        return this.ReserveVersion;
    }

    /**
     * Set <p>预约引擎升级版本</p>
     * @param ReserveVersion <p>预约引擎升级版本</p>
     */
    public void setReserveVersion(String ReserveVersion) {
        this.ReserveVersion = ReserveVersion;
    }

    /**
     * Get <p>引擎预约升级版本状态</p> 
     * @return ReserveVersionState <p>引擎预约升级版本状态</p>
     */
    public String getReserveVersionState() {
        return this.ReserveVersionState;
    }

    /**
     * Set <p>引擎预约升级版本状态</p>
     * @param ReserveVersionState <p>引擎预约升级版本状态</p>
     */
    public void setReserveVersionState(String ReserveVersionState) {
        this.ReserveVersionState = ReserveVersionState;
    }

    /**
     * Get <p>弹性开关 1打开 0关闭</p> 
     * @return ElasticSwitch <p>弹性开关 1打开 0关闭</p>
     */
    public Long getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set <p>弹性开关 1打开 0关闭</p>
     * @param ElasticSwitch <p>弹性开关 1打开 0关闭</p>
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
     * Get <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p> 
     * @return ElasticTrafficSwitch <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public Long getElasticTrafficSwitch() {
        return this.ElasticTrafficSwitch;
    }

    /**
     * Set <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @param ElasticTrafficSwitch <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public void setElasticTrafficSwitch(Long ElasticTrafficSwitch) {
        this.ElasticTrafficSwitch = ElasticTrafficSwitch;
    }

    public VpcFwInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcFwInstanceInfo(VpcFwInstanceInfo source) {
        if (source.FwInsName != null) {
            this.FwInsName = new String(source.FwInsName);
        }
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.FwMode != null) {
            this.FwMode = new Long(source.FwMode);
        }
        if (source.JoinInsNum != null) {
            this.JoinInsNum = new Long(source.JoinInsNum);
        }
        if (source.FwSwitchNum != null) {
            this.FwSwitchNum = new Long(source.FwSwitchNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.CcnId != null) {
            this.CcnId = new String[source.CcnId.length];
            for (int i = 0; i < source.CcnId.length; i++) {
                this.CcnId[i] = new String(source.CcnId[i]);
            }
        }
        if (source.CcnName != null) {
            this.CcnName = new String[source.CcnName.length];
            for (int i = 0; i < source.CcnName.length; i++) {
                this.CcnName[i] = new String(source.CcnName[i]);
            }
        }
        if (source.PeerConnectionId != null) {
            this.PeerConnectionId = new String[source.PeerConnectionId.length];
            for (int i = 0; i < source.PeerConnectionId.length; i++) {
                this.PeerConnectionId[i] = new String(source.PeerConnectionId[i]);
            }
        }
        if (source.PeerConnectionName != null) {
            this.PeerConnectionName = new String[source.PeerConnectionName.length];
            for (int i = 0; i < source.PeerConnectionName.length; i++) {
                this.PeerConnectionName[i] = new String(source.PeerConnectionName[i]);
            }
        }
        if (source.FwCvmLst != null) {
            this.FwCvmLst = new VpcFwCvmInsInfo[source.FwCvmLst.length];
            for (int i = 0; i < source.FwCvmLst.length; i++) {
                this.FwCvmLst[i] = new VpcFwCvmInsInfo(source.FwCvmLst[i]);
            }
        }
        if (source.JoinInsLst != null) {
            this.JoinInsLst = new VpcFwJoinInstanceType[source.JoinInsLst.length];
            for (int i = 0; i < source.JoinInsLst.length; i++) {
                this.JoinInsLst[i] = new VpcFwJoinInstanceType(source.JoinInsLst[i]);
            }
        }
        if (source.FwGateway != null) {
            this.FwGateway = new FwGateway[source.FwGateway.length];
            for (int i = 0; i < source.FwGateway.length; i++) {
                this.FwGateway[i] = new FwGateway(source.FwGateway[i]);
            }
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.RuleUsed != null) {
            this.RuleUsed = new Long(source.RuleUsed);
        }
        if (source.RuleMax != null) {
            this.RuleMax = new Long(source.RuleMax);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.UserVpcWidth != null) {
            this.UserVpcWidth = new Long(source.UserVpcWidth);
        }
        if (source.JoinInsIdLst != null) {
            this.JoinInsIdLst = new String[source.JoinInsIdLst.length];
            for (int i = 0; i < source.JoinInsIdLst.length; i++) {
                this.JoinInsIdLst[i] = new String(source.JoinInsIdLst[i]);
            }
        }
        if (source.FlowMax != null) {
            this.FlowMax = new Long(source.FlowMax);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.UpdateEnable != null) {
            this.UpdateEnable = new Long(source.UpdateEnable);
        }
        if (source.TrafficMode != null) {
            this.TrafficMode = new String(source.TrafficMode);
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
        this.setParamSimple(map, prefix + "FwInsName", this.FwInsName);
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "FwMode", this.FwMode);
        this.setParamSimple(map, prefix + "JoinInsNum", this.JoinInsNum);
        this.setParamSimple(map, prefix + "FwSwitchNum", this.FwSwitchNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamArraySimple(map, prefix + "CcnId.", this.CcnId);
        this.setParamArraySimple(map, prefix + "CcnName.", this.CcnName);
        this.setParamArraySimple(map, prefix + "PeerConnectionId.", this.PeerConnectionId);
        this.setParamArraySimple(map, prefix + "PeerConnectionName.", this.PeerConnectionName);
        this.setParamArrayObj(map, prefix + "FwCvmLst.", this.FwCvmLst);
        this.setParamArrayObj(map, prefix + "JoinInsLst.", this.JoinInsLst);
        this.setParamArrayObj(map, prefix + "FwGateway.", this.FwGateway);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "RuleUsed", this.RuleUsed);
        this.setParamSimple(map, prefix + "RuleMax", this.RuleMax);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "UserVpcWidth", this.UserVpcWidth);
        this.setParamArraySimple(map, prefix + "JoinInsIdLst.", this.JoinInsIdLst);
        this.setParamSimple(map, prefix + "FlowMax", this.FlowMax);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "UpdateEnable", this.UpdateEnable);
        this.setParamSimple(map, prefix + "TrafficMode", this.TrafficMode);
        this.setParamSimple(map, prefix + "ReserveTime", this.ReserveTime);
        this.setParamSimple(map, prefix + "ReserveVersion", this.ReserveVersion);
        this.setParamSimple(map, prefix + "ReserveVersionState", this.ReserveVersionState);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticBandwidth", this.ElasticBandwidth);
        this.setParamSimple(map, prefix + "IsFirstAfterPay", this.IsFirstAfterPay);
        this.setParamSimple(map, prefix + "ElasticTrafficSwitch", this.ElasticTrafficSwitch);

    }
}

