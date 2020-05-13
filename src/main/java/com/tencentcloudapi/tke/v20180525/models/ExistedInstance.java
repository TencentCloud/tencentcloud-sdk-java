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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExistedInstance extends AbstractModel{

    /**
    * 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Usable")
    @Expose
    private Boolean Usable;

    /**
    * 实例不支持加入的原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnusableReason")
    @Expose
    private String UnusableReason;

    /**
    * 实例已经所在的集群ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlreadyInCluster")
    @Expose
    private String AlreadyInCluster;

    /**
    * 实例ID形如：ins-xxxxxxxx。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 实例的CPU核数，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 实例内存容量，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 操作系统名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoscalingGroupId")
    @Expose
    private String AutoscalingGroupId;

    /**
    * 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
     * Get 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Usable 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUsable() {
        return this.Usable;
    }

    /**
     * Set 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Usable 实例是否支持加入集群(TRUE 可以加入 FALSE 不能加入)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsable(Boolean Usable) {
        this.Usable = Usable;
    }

    /**
     * Get 实例不支持加入的原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnusableReason 实例不支持加入的原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnusableReason() {
        return this.UnusableReason;
    }

    /**
     * Set 实例不支持加入的原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnusableReason 实例不支持加入的原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnusableReason(String UnusableReason) {
        this.UnusableReason = UnusableReason;
    }

    /**
     * Get 实例已经所在的集群ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlreadyInCluster 实例已经所在的集群ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlreadyInCluster() {
        return this.AlreadyInCluster;
    }

    /**
     * Set 实例已经所在的集群ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlreadyInCluster 实例已经所在的集群ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlreadyInCluster(String AlreadyInCluster) {
        this.AlreadyInCluster = AlreadyInCluster;
    }

    /**
     * Get 实例ID形如：ins-xxxxxxxx。 
     * @return InstanceId 实例ID形如：ins-xxxxxxxx。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID形如：ins-xxxxxxxx。
     * @param InstanceId 实例ID形如：ins-xxxxxxxx。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 实例的CPU核数，单位：核。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPU 实例的CPU核数，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 实例的CPU核数，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPU 实例的CPU核数，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 实例内存容量，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 实例内存容量，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存容量，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 实例内存容量，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 操作系统名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsName 操作系统名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsName 操作系统名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 实例机型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoscalingGroupId 伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoscalingGroupId() {
        return this.AutoscalingGroupId;
    }

    /**
     * Set 伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoscalingGroupId 伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoscalingGroupId(String AutoscalingGroupId) {
        this.AutoscalingGroupId = AutoscalingGroupId;
    }

    /**
     * Get 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargeType 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargeType 实例计费模式。取值范围： PREPAID：表示预付费，即包年包月 POSTPAID_BY_HOUR：表示后付费，即按量计费 CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
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

    }
}

