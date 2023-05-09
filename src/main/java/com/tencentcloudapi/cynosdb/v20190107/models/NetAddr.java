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

public class NetAddr extends AbstractModel{

    /**
    * 内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 内网端口号
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
    * 外网端口号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 网络类型（ro-只读,rw/ha-读写）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 外网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 外网状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
     * Get 内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 内网端口号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vport 内网端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 内网端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vport 内网端口号
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
     * Get 外网端口号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanPort 外网端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanPort 外网端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 网络类型（ro-只读,rw/ha-读写）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetType 网络类型（ro-只读,rw/ha-读写）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型（ro-只读,rw/ha-读写）
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetType 网络类型（ro-只读,rw/ha-读写）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqSubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqSubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 外网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIP 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIP 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get 外网状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanStatus 外网状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanStatus 外网状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
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

    public NetAddr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAddr(NetAddr source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);

    }
}

