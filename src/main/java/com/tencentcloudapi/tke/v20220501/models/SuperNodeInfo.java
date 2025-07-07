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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuperNodeInfo extends AbstractModel {

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自动续费标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 节点的 CPU 规格，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPU")
    @Expose
    private Float CPU;

    /**
    * 节点上 Pod 的 CPU总和，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedCPU")
    @Expose
    private Float UsedCPU;

    /**
    * 节点的内存规格，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 节点上 Pod 的内存总和，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedMemory")
    @Expose
    private Float UsedMemory;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 生效时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveAt")
    @Expose
    private String ActiveAt;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * 可调度的单 Pod 最大 CPU 规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxCPUScheduledPod")
    @Expose
    private Long MaxCPUScheduledPod;

    /**
    * 实例属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAttribute")
    @Expose
    private String InstanceAttribute;

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自动续费标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 节点的 CPU 规格，单位：核。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPU 节点的 CPU 规格，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCPU() {
        return this.CPU;
    }

    /**
     * Set 节点的 CPU 规格，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPU 节点的 CPU 规格，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPU(Float CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 节点上 Pod 的 CPU总和，单位：核。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedCPU 节点上 Pod 的 CPU总和，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUsedCPU() {
        return this.UsedCPU;
    }

    /**
     * Set 节点上 Pod 的 CPU总和，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedCPU 节点上 Pod 的 CPU总和，单位：核。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedCPU(Float UsedCPU) {
        this.UsedCPU = UsedCPU;
    }

    /**
     * Get 节点的内存规格，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 节点的内存规格，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 节点的内存规格，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 节点的内存规格，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 节点上 Pod 的内存总和，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedMemory 节点上 Pod 的内存总和，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUsedMemory() {
        return this.UsedMemory;
    }

    /**
     * Set 节点上 Pod 的内存总和，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedMemory 节点上 Pod 的内存总和，单位：Gi。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedMemory(Float UsedMemory) {
        this.UsedMemory = UsedMemory;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 生效时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveAt 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActiveAt() {
        return this.ActiveAt;
    }

    /**
     * Set 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveAt 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveAt(String ActiveAt) {
        this.ActiveAt = ActiveAt;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireAt 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireAt 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get 可调度的单 Pod 最大 CPU 规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxCPUScheduledPod 可调度的单 Pod 最大 CPU 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxCPUScheduledPod() {
        return this.MaxCPUScheduledPod;
    }

    /**
     * Set 可调度的单 Pod 最大 CPU 规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxCPUScheduledPod 可调度的单 Pod 最大 CPU 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxCPUScheduledPod(Long MaxCPUScheduledPod) {
        this.MaxCPUScheduledPod = MaxCPUScheduledPod;
    }

    /**
     * Get 实例属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceAttribute 实例属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceAttribute() {
        return this.InstanceAttribute;
    }

    /**
     * Set 实例属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAttribute 实例属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAttribute(String InstanceAttribute) {
        this.InstanceAttribute = InstanceAttribute;
    }

    public SuperNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperNodeInfo(SuperNodeInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.CPU != null) {
            this.CPU = new Float(source.CPU);
        }
        if (source.UsedCPU != null) {
            this.UsedCPU = new Float(source.UsedCPU);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.UsedMemory != null) {
            this.UsedMemory = new Float(source.UsedMemory);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ActiveAt != null) {
            this.ActiveAt = new String(source.ActiveAt);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.MaxCPUScheduledPod != null) {
            this.MaxCPUScheduledPod = new Long(source.MaxCPUScheduledPod);
        }
        if (source.InstanceAttribute != null) {
            this.InstanceAttribute = new String(source.InstanceAttribute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "UsedCPU", this.UsedCPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "UsedMemory", this.UsedMemory);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ActiveAt", this.ActiveAt);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "MaxCPUScheduledPod", this.MaxCPUScheduledPod);
        this.setParamSimple(map, prefix + "InstanceAttribute", this.InstanceAttribute);

    }
}

