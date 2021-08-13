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

public class VpcDnsInfo extends AbstractModel{

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc 名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * nat 防火墙模式 0：新增模式， 1: 接入模式
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * vpc ipv4网段范围 CIDR（Classless Inter-Domain Routing，无类域间路由选择）
    */
    @SerializedName("VpcIpv4Cidr")
    @Expose
    private String VpcIpv4Cidr;

    /**
    * 外网弹性ip，防火墙 dns解析地址
    */
    @SerializedName("DNSEip")
    @Expose
    private String DNSEip;

    /**
    * nat网关id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
    * nat网关名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatInsName")
    @Expose
    private String NatInsName;

    /**
    * 0：开关关闭 ， 1: 开关打开
    */
    @SerializedName("SwitchStatus")
    @Expose
    private Long SwitchStatus;

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc 名称 
     * @return VpcName vpc 名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc 名称
     * @param VpcName vpc 名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get nat 防火墙模式 0：新增模式， 1: 接入模式 
     * @return FwMode nat 防火墙模式 0：新增模式， 1: 接入模式
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set nat 防火墙模式 0：新增模式， 1: 接入模式
     * @param FwMode nat 防火墙模式 0：新增模式， 1: 接入模式
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get vpc ipv4网段范围 CIDR（Classless Inter-Domain Routing，无类域间路由选择） 
     * @return VpcIpv4Cidr vpc ipv4网段范围 CIDR（Classless Inter-Domain Routing，无类域间路由选择）
     */
    public String getVpcIpv4Cidr() {
        return this.VpcIpv4Cidr;
    }

    /**
     * Set vpc ipv4网段范围 CIDR（Classless Inter-Domain Routing，无类域间路由选择）
     * @param VpcIpv4Cidr vpc ipv4网段范围 CIDR（Classless Inter-Domain Routing，无类域间路由选择）
     */
    public void setVpcIpv4Cidr(String VpcIpv4Cidr) {
        this.VpcIpv4Cidr = VpcIpv4Cidr;
    }

    /**
     * Get 外网弹性ip，防火墙 dns解析地址 
     * @return DNSEip 外网弹性ip，防火墙 dns解析地址
     */
    public String getDNSEip() {
        return this.DNSEip;
    }

    /**
     * Set 外网弹性ip，防火墙 dns解析地址
     * @param DNSEip 外网弹性ip，防火墙 dns解析地址
     */
    public void setDNSEip(String DNSEip) {
        this.DNSEip = DNSEip;
    }

    /**
     * Get nat网关id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatInsId nat网关id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set nat网关id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatInsId nat网关id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    /**
     * Get nat网关名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatInsName nat网关名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatInsName() {
        return this.NatInsName;
    }

    /**
     * Set nat网关名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatInsName nat网关名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatInsName(String NatInsName) {
        this.NatInsName = NatInsName;
    }

    /**
     * Get 0：开关关闭 ， 1: 开关打开 
     * @return SwitchStatus 0：开关关闭 ， 1: 开关打开
     */
    public Long getSwitchStatus() {
        return this.SwitchStatus;
    }

    /**
     * Set 0：开关关闭 ， 1: 开关打开
     * @param SwitchStatus 0：开关关闭 ， 1: 开关打开
     */
    public void setSwitchStatus(Long SwitchStatus) {
        this.SwitchStatus = SwitchStatus;
    }

    public VpcDnsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcDnsInfo(VpcDnsInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.FwMode != null) {
            this.FwMode = new Long(source.FwMode);
        }
        if (source.VpcIpv4Cidr != null) {
            this.VpcIpv4Cidr = new String(source.VpcIpv4Cidr);
        }
        if (source.DNSEip != null) {
            this.DNSEip = new String(source.DNSEip);
        }
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
        if (source.NatInsName != null) {
            this.NatInsName = new String(source.NatInsName);
        }
        if (source.SwitchStatus != null) {
            this.SwitchStatus = new Long(source.SwitchStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "FwMode", this.FwMode);
        this.setParamSimple(map, prefix + "VpcIpv4Cidr", this.VpcIpv4Cidr);
        this.setParamSimple(map, prefix + "DNSEip", this.DNSEip);
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);
        this.setParamSimple(map, prefix + "NatInsName", this.NatInsName);
        this.setParamSimple(map, prefix + "SwitchStatus", this.SwitchStatus);

    }
}

