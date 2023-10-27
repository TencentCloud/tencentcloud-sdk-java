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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcFwInstanceInfo extends AbstractModel {

    /**
    * VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwInsName")
    @Expose
    private String FwInsName;

    /**
    * VPC防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * VPC防火墙接入网络实例个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinInsNum")
    @Expose
    private Long JoinInsNum;

    /**
    * VPC防火墙开关个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwSwitchNum")
    @Expose
    private Long FwSwitchNum;

    /**
    * VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * VPC防火墙创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * VPC 相关云联网ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnId")
    @Expose
    private String [] CcnId;

    /**
    * VPC 相关云联网名称列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnName")
    @Expose
    private String [] CcnName;

    /**
    * VPC 相关对等连接ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerConnectionId")
    @Expose
    private String [] PeerConnectionId;

    /**
    * VPC 相关对等连接名称列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerConnectionName")
    @Expose
    private String [] PeerConnectionName;

    /**
    * VPC防火墙CVM的列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwCvmLst")
    @Expose
    private VpcFwCvmInsInfo [] FwCvmLst;

    /**
    * VPC防火墙接入网络实例类型列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinInsLst")
    @Expose
    private VpcFwJoinInstanceType [] JoinInsLst;

    /**
    * 防火墙网关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwGateway")
    @Expose
    private FwGateway [] FwGateway;

    /**
    * 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 已使用规则数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleUsed")
    @Expose
    private Long RuleUsed;

    /**
    * 最大规则数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleMax")
    @Expose
    private Long RuleMax;

    /**
    * 防火墙实例带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 用户VPC墙总带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVpcWidth")
    @Expose
    private Long UserVpcWidth;

    /**
    * 接入的vpc列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinInsIdLst")
    @Expose
    private String [] JoinInsIdLst;

    /**
    * 内网间峰值带宽 (单位 bps )
    */
    @SerializedName("FlowMax")
    @Expose
    private Long FlowMax;

    /**
    * 实例引擎版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 引擎是否可升级：0，不可升级；1，可升级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateEnable")
    @Expose
    private Long UpdateEnable;

    /**
    * 引擎运行模式，Normal:正常, OnlyRoute:透明模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrafficMode")
    @Expose
    private String TrafficMode;

    /**
     * Get VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwInsName VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwInsName() {
        return this.FwInsName;
    }

    /**
     * Set VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwInsName VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwInsName(String FwInsName) {
        this.FwInsName = FwInsName;
    }

    /**
     * Get VPC防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwInsId VPC防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set VPC防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwInsId VPC防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwMode VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwMode VPC防火墙实例模式 0: 旧VPC模式防火墙 1: CCN模式防火墙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get VPC防火墙接入网络实例个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinInsNum VPC防火墙接入网络实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJoinInsNum() {
        return this.JoinInsNum;
    }

    /**
     * Set VPC防火墙接入网络实例个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinInsNum VPC防火墙接入网络实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinInsNum(Long JoinInsNum) {
        this.JoinInsNum = JoinInsNum;
    }

    /**
     * Get VPC防火墙开关个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwSwitchNum VPC防火墙开关个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFwSwitchNum() {
        return this.FwSwitchNum;
    }

    /**
     * Set VPC防火墙开关个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwSwitchNum VPC防火墙开关个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwSwitchNum(Long FwSwitchNum) {
        this.FwSwitchNum = FwSwitchNum;
    }

    /**
     * Get VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status VPC防火墙状态 0:正常 ， 1：创建中 2: 变更中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get VPC防火墙创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time VPC防火墙创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set VPC防火墙创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time VPC防火墙创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get VPC 相关云联网ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId VPC 相关云联网ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCcnId() {
        return this.CcnId;
    }

    /**
     * Set VPC 相关云联网ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId VPC 相关云联网ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnId(String [] CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get VPC 相关云联网名称列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnName VPC 相关云联网名称列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCcnName() {
        return this.CcnName;
    }

    /**
     * Set VPC 相关云联网名称列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnName VPC 相关云联网名称列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnName(String [] CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get VPC 相关对等连接ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerConnectionId VPC 相关对等连接ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPeerConnectionId() {
        return this.PeerConnectionId;
    }

    /**
     * Set VPC 相关对等连接ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerConnectionId VPC 相关对等连接ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerConnectionId(String [] PeerConnectionId) {
        this.PeerConnectionId = PeerConnectionId;
    }

    /**
     * Get VPC 相关对等连接名称列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerConnectionName VPC 相关对等连接名称列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPeerConnectionName() {
        return this.PeerConnectionName;
    }

    /**
     * Set VPC 相关对等连接名称列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerConnectionName VPC 相关对等连接名称列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerConnectionName(String [] PeerConnectionName) {
        this.PeerConnectionName = PeerConnectionName;
    }

    /**
     * Get VPC防火墙CVM的列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwCvmLst VPC防火墙CVM的列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcFwCvmInsInfo [] getFwCvmLst() {
        return this.FwCvmLst;
    }

    /**
     * Set VPC防火墙CVM的列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwCvmLst VPC防火墙CVM的列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwCvmLst(VpcFwCvmInsInfo [] FwCvmLst) {
        this.FwCvmLst = FwCvmLst;
    }

    /**
     * Get VPC防火墙接入网络实例类型列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinInsLst VPC防火墙接入网络实例类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcFwJoinInstanceType [] getJoinInsLst() {
        return this.JoinInsLst;
    }

    /**
     * Set VPC防火墙接入网络实例类型列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinInsLst VPC防火墙接入网络实例类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinInsLst(VpcFwJoinInstanceType [] JoinInsLst) {
        this.JoinInsLst = JoinInsLst;
    }

    /**
     * Get 防火墙网关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwGateway 防火墙网关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FwGateway [] getFwGateway() {
        return this.FwGateway;
    }

    /**
     * Set 防火墙网关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwGateway 防火墙网关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwGateway(FwGateway [] FwGateway) {
        this.FwGateway = FwGateway;
    }

    /**
     * Get 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwGroupId 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwGroupId 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 已使用规则数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleUsed 已使用规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleUsed() {
        return this.RuleUsed;
    }

    /**
     * Set 已使用规则数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleUsed 已使用规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleUsed(Long RuleUsed) {
        this.RuleUsed = RuleUsed;
    }

    /**
     * Get 最大规则数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleMax 最大规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleMax() {
        return this.RuleMax;
    }

    /**
     * Set 最大规则数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleMax 最大规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleMax(Long RuleMax) {
        this.RuleMax = RuleMax;
    }

    /**
     * Get 防火墙实例带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 防火墙实例带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 防火墙实例带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 防火墙实例带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 用户VPC墙总带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVpcWidth 用户VPC墙总带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserVpcWidth() {
        return this.UserVpcWidth;
    }

    /**
     * Set 用户VPC墙总带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVpcWidth 用户VPC墙总带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVpcWidth(Long UserVpcWidth) {
        this.UserVpcWidth = UserVpcWidth;
    }

    /**
     * Get 接入的vpc列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinInsIdLst 接入的vpc列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getJoinInsIdLst() {
        return this.JoinInsIdLst;
    }

    /**
     * Set 接入的vpc列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinInsIdLst 接入的vpc列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinInsIdLst(String [] JoinInsIdLst) {
        this.JoinInsIdLst = JoinInsIdLst;
    }

    /**
     * Get 内网间峰值带宽 (单位 bps ) 
     * @return FlowMax 内网间峰值带宽 (单位 bps )
     */
    public Long getFlowMax() {
        return this.FlowMax;
    }

    /**
     * Set 内网间峰值带宽 (单位 bps )
     * @param FlowMax 内网间峰值带宽 (单位 bps )
     */
    public void setFlowMax(Long FlowMax) {
        this.FlowMax = FlowMax;
    }

    /**
     * Get 实例引擎版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineVersion 实例引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 实例引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineVersion 实例引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 引擎是否可升级：0，不可升级；1，可升级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateEnable 引擎是否可升级：0，不可升级；1，可升级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateEnable() {
        return this.UpdateEnable;
    }

    /**
     * Set 引擎是否可升级：0，不可升级；1，可升级
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateEnable 引擎是否可升级：0，不可升级；1，可升级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateEnable(Long UpdateEnable) {
        this.UpdateEnable = UpdateEnable;
    }

    /**
     * Get 引擎运行模式，Normal:正常, OnlyRoute:透明模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrafficMode 引擎运行模式，Normal:正常, OnlyRoute:透明模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrafficMode() {
        return this.TrafficMode;
    }

    /**
     * Set 引擎运行模式，Normal:正常, OnlyRoute:透明模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrafficMode 引擎运行模式，Normal:正常, OnlyRoute:透明模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrafficMode(String TrafficMode) {
        this.TrafficMode = TrafficMode;
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

    }
}

