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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatInstanceInfo extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EipAddress")
    @Expose
    private String [] EipAddress;

    /**
    * 内外使用ip数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcIp")
    @Expose
    private String [] VpcIp;

    /**
    * 实例关联子网数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subnets")
    @Expose
    private String [] Subnets;

    /**
    * 0 :正常 1：正在初始化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EipAddress 公网ip数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEipAddress() {
        return this.EipAddress;
    }

    /**
     * Set 公网ip数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param EipAddress 公网ip数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEipAddress(String [] EipAddress) {
        this.EipAddress = EipAddress;
    }

    /**
     * Get 内外使用ip数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcIp 内外使用ip数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getVpcIp() {
        return this.VpcIp;
    }

    /**
     * Set 内外使用ip数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcIp 内外使用ip数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcIp(String [] VpcIp) {
        this.VpcIp = VpcIp;
    }

    /**
     * Get 实例关联子网数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subnets 实例关联子网数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set 实例关联子网数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subnets 实例关联子网数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnets(String [] Subnets) {
        this.Subnets = Subnets;
    }

    /**
     * Get 0 :正常 1：正在初始化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 0 :正常 1：正在初始化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 :正常 1：正在初始化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 0 :正常 1：正在初始化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    }
}

