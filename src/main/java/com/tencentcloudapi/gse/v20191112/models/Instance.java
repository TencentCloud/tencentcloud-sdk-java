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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel{

    /**
    * 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * dns
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
    * 操作系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatingSystem")
    @Expose
    private String OperatingSystem;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 实例是否保留, 1-保留，0-不保留,默认
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReserveValue")
    @Expose
    private Long ReserveValue;

    /**
    * 实例的私有IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
     * Get 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetId 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetId 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
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
     * Get IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpAddress IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpAddress IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get dns
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DnsName dns
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set dns
注意：此字段可能返回 null，表示取不到有效值。
     * @param DnsName dns
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDnsName(String DnsName) {
        this.DnsName = DnsName;
    }

    /**
     * Get 操作系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatingSystem 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatingSystem() {
        return this.OperatingSystem;
    }

    /**
     * Set 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatingSystem 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 实例权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 实例权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 实例权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 实例是否保留, 1-保留，0-不保留,默认
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReserveValue 实例是否保留, 1-保留，0-不保留,默认
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReserveValue() {
        return this.ReserveValue;
    }

    /**
     * Set 实例是否保留, 1-保留，0-不保留,默认
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReserveValue 实例是否保留, 1-保留，0-不保留,默认
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReserveValue(Long ReserveValue) {
        this.ReserveValue = ReserveValue;
    }

    /**
     * Get 实例的私有IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIpAddress 实例的私有IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set 实例的私有IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIpAddress 实例的私有IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.DnsName != null) {
            this.DnsName = new String(source.DnsName);
        }
        if (source.OperatingSystem != null) {
            this.OperatingSystem = new String(source.OperatingSystem);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.ReserveValue != null) {
            this.ReserveValue = new Long(source.ReserveValue);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamSimple(map, prefix + "OperatingSystem", this.OperatingSystem);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "ReserveValue", this.ReserveValue);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);

    }
}

