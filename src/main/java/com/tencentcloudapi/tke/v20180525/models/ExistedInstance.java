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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExistedInstance extends AbstractModel {

    /**
    * 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
    */
    @SerializedName("Usable")
    @Expose
    private Boolean Usable;

    /**
    * 实例不支持加入的原因。
    */
    @SerializedName("UnusableReason")
    @Expose
    private String UnusableReason;

    /**
    * 实例已经所在的集群ID。
    */
    @SerializedName("AlreadyInCluster")
    @Expose
    private String AlreadyInCluster;

    /**
    * 实例ID形如：ins-e55paxnt。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例主网卡的内网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 实例主网卡的公网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 实例的CPU核数，单位：核。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 实例内存容量，单位：GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 操作系统名称。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoscalingGroupId")
    @Expose
    private String AutoscalingGroupId;

    /**
    * 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Addresses")
    @Expose
    private String [] IPv6Addresses;

    /**
     * Get 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。 
     * @return Usable 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
     */
    public Boolean getUsable() {
        return this.Usable;
    }

    /**
     * Set 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
     * @param Usable 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
     */
    public void setUsable(Boolean Usable) {
        this.Usable = Usable;
    }

    /**
     * Get 实例不支持加入的原因。 
     * @return UnusableReason 实例不支持加入的原因。
     */
    public String getUnusableReason() {
        return this.UnusableReason;
    }

    /**
     * Set 实例不支持加入的原因。
     * @param UnusableReason 实例不支持加入的原因。
     */
    public void setUnusableReason(String UnusableReason) {
        this.UnusableReason = UnusableReason;
    }

    /**
     * Get 实例已经所在的集群ID。 
     * @return AlreadyInCluster 实例已经所在的集群ID。
     */
    public String getAlreadyInCluster() {
        return this.AlreadyInCluster;
    }

    /**
     * Set 实例已经所在的集群ID。
     * @param AlreadyInCluster 实例已经所在的集群ID。
     */
    public void setAlreadyInCluster(String AlreadyInCluster) {
        this.AlreadyInCluster = AlreadyInCluster;
    }

    /**
     * Get 实例ID形如：ins-e55paxnt。 
     * @return InstanceId 实例ID形如：ins-e55paxnt。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID形如：ins-e55paxnt。
     * @param InstanceId 实例ID形如：ins-e55paxnt。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例主网卡的内网IP列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIpAddresses 实例主网卡的内网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 实例主网卡的内网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIpAddresses 实例主网卡的内网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 实例主网卡的公网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpAddresses 实例主网卡的公网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 实例主网卡的公网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpAddresses 实例主网卡的公网IP列表。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。 
     * @return CreatedTime 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     * @param CreatedTime 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 实例的CPU核数，单位：核。 
     * @return CPU 实例的CPU核数，单位：核。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 实例的CPU核数，单位：核。
     * @param CPU 实例的CPU核数，单位：核。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 实例内存容量，单位：GB。 
     * @return Memory 实例内存容量，单位：GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存容量，单位：GB。
     * @param Memory 实例内存容量，单位：GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 操作系统名称。 
     * @return OsName 操作系统名称。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称。
     * @param OsName 操作系统名称。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 实例机型。 
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 伸缩组ID 
     * @return AutoscalingGroupId 伸缩组ID
     */
    public String getAutoscalingGroupId() {
        return this.AutoscalingGroupId;
    }

    /**
     * Set 伸缩组ID
     * @param AutoscalingGroupId 伸缩组ID
     */
    public void setAutoscalingGroupId(String AutoscalingGroupId) {
        this.AutoscalingGroupId = AutoscalingGroupId;
    }

    /**
     * Get 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。 
     * @return InstanceChargeType 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     * @param InstanceChargeType 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Addresses 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIPv6Addresses() {
        return this.IPv6Addresses;
    }

    /**
     * Set 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Addresses 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Addresses(String [] IPv6Addresses) {
        this.IPv6Addresses = IPv6Addresses;
    }

    public ExistedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExistedInstance(ExistedInstance source) {
        if (source.Usable != null) {
            this.Usable = new Boolean(source.Usable);
        }
        if (source.UnusableReason != null) {
            this.UnusableReason = new String(source.UnusableReason);
        }
        if (source.AlreadyInCluster != null) {
            this.AlreadyInCluster = new String(source.AlreadyInCluster);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AutoscalingGroupId != null) {
            this.AutoscalingGroupId = new String(source.AutoscalingGroupId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.IPv6Addresses != null) {
            this.IPv6Addresses = new String[source.IPv6Addresses.length];
            for (int i = 0; i < source.IPv6Addresses.length; i++) {
                this.IPv6Addresses[i] = new String(source.IPv6Addresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Usable", this.Usable);
        this.setParamSimple(map, prefix + "UnusableReason", this.UnusableReason);
        this.setParamSimple(map, prefix + "AlreadyInCluster", this.AlreadyInCluster);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamArraySimple(map, prefix + "IPv6Addresses.", this.IPv6Addresses);

    }
}

