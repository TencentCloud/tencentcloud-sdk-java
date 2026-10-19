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

public class FwGroupIpFlowStat extends AbstractModel {

    /**
    * IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * VPCID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 峰值流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowMax")
    @Expose
    private Long FlowMax;

    /**
    * 均值带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowAvg")
    @Expose
    private Float FlowAvg;

    /**
    * 限速状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcRuleStatus")
    @Expose
    private Long TcRuleStatus;

    /**
    * 防火墙ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * 0 IPV4 , 1 IPV6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
     * Get IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get VPCID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VPCID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPCID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VPCID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName VPC 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName VPC 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 峰值流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowMax 峰值流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowMax() {
        return this.FlowMax;
    }

    /**
     * Set 峰值流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowMax 峰值流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowMax(Long FlowMax) {
        this.FlowMax = FlowMax;
    }

    /**
     * Get 均值带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowAvg 均值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFlowAvg() {
        return this.FlowAvg;
    }

    /**
     * Set 均值带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowAvg 均值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowAvg(Float FlowAvg) {
        this.FlowAvg = FlowAvg;
    }

    /**
     * Get 限速状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcRuleStatus 限速状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTcRuleStatus() {
        return this.TcRuleStatus;
    }

    /**
     * Set 限速状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcRuleStatus 限速状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcRuleStatus(Long TcRuleStatus) {
        this.TcRuleStatus = TcRuleStatus;
    }

    /**
     * Get 防火墙ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwInsId 防火墙ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set 防火墙ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwInsId 防火墙ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get 0 IPV4 , 1 IPV6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpVersion 0 IPV4 , 1 IPV6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set 0 IPV4 , 1 IPV6
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpVersion 0 IPV4 , 1 IPV6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    public FwGroupIpFlowStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwGroupIpFlowStat(FwGroupIpFlowStat source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.FlowMax != null) {
            this.FlowMax = new Long(source.FlowMax);
        }
        if (source.FlowAvg != null) {
            this.FlowAvg = new Float(source.FlowAvg);
        }
        if (source.TcRuleStatus != null) {
            this.TcRuleStatus = new Long(source.TcRuleStatus);
        }
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "FlowMax", this.FlowMax);
        this.setParamSimple(map, prefix + "FlowAvg", this.FlowAvg);
        this.setParamSimple(map, prefix + "TcRuleStatus", this.TcRuleStatus);
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

