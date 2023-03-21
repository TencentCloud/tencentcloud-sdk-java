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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNetInfo extends AbstractModel{

    /**
    * 网络类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupType")
    @Expose
    private String InstanceGroupType;

    /**
    * 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 网络类型, 0-基础网络, 1-vpc网络, 2-黑石网络
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * 私有网络IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 私有网络端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 外网域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网Ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 外网端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 外网开启状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
     * Get 网络类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupType 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceGroupType() {
        return this.InstanceGroupType;
    }

    /**
     * Set 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupType 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupType(String InstanceGroupType) {
        this.InstanceGroupType = InstanceGroupType;
    }

    /**
     * Get 实例组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupId 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupId 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 网络类型, 0-基础网络, 1-vpc网络, 2-黑石网络
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetType 网络类型, 0-基础网络, 1-vpc网络, 2-黑石网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型, 0-基础网络, 1-vpc网络, 2-黑石网络
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetType 网络类型, 0-基础网络, 1-vpc网络, 2-黑石网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 私有网络IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 私有网络IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 私有网络IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 私有网络IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 私有网络端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vport 私有网络端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 私有网络端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vport 私有网络端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 外网域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanDomain 外网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 外网域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanDomain 外网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 外网Ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIP 外网Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 外网Ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIP 外网Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get 外网端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanPort 外网端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanPort 外网端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 外网开启状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanStatus 外网开启状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网开启状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanStatus 外网开启状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    public InstanceNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNetInfo(InstanceNetInfo source) {
        if (source.InstanceGroupType != null) {
            this.InstanceGroupType = new String(source.InstanceGroupType);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGroupType", this.InstanceGroupType);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);

    }
}

