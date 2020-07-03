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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceGroup extends AbstractModel{

    /**
    * 资源组 Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 资源组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("Created")
    @Expose
    private String Created;

    /**
    * 更新时间
    */
    @SerializedName("Updated")
    @Expose
    private String Updated;

    /**
    * 资源组主机数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 使用资源组的服务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 使用资源组的任务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobCount")
    @Expose
    private Long JobCount;

    /**
    * 资源组是否为公共资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Public")
    @Expose
    private Boolean Public;

    /**
    * 机器类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 资源组状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 显卡总张数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 处理器总核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存总量，单位为G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Gpu类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String [] GpuType;

    /**
    * 该资源组下是否有预付费资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasPrepaid")
    @Expose
    private Boolean HasPrepaid;

    /**
    * 资源组是否允许预付费或后付费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
     * Get 资源组 Id 
     * @return Id 资源组 Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源组 Id
     * @param Id 资源组 Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cluster 集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cluster 集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 资源组名称 
     * @return Name 资源组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源组名称
     * @param Name 资源组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 资源组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 资源组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 资源组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间 
     * @return Created 创建时间
     */
    public String getCreated() {
        return this.Created;
    }

    /**
     * Set 创建时间
     * @param Created 创建时间
     */
    public void setCreated(String Created) {
        this.Created = Created;
    }

    /**
     * Get 更新时间 
     * @return Updated 更新时间
     */
    public String getUpdated() {
        return this.Updated;
    }

    /**
     * Set 更新时间
     * @param Updated 更新时间
     */
    public void setUpdated(String Updated) {
        this.Updated = Updated;
    }

    /**
     * Get 资源组主机数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCount 资源组主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 资源组主机数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount 资源组主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 使用资源组的服务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCount 使用资源组的服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 使用资源组的服务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCount 使用资源组的服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get 使用资源组的任务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobCount 使用资源组的任务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobCount() {
        return this.JobCount;
    }

    /**
     * Set 使用资源组的任务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobCount 使用资源组的任务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobCount(Long JobCount) {
        this.JobCount = JobCount;
    }

    /**
     * Get 资源组是否为公共资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Public 资源组是否为公共资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPublic() {
        return this.Public;
    }

    /**
     * Set 资源组是否为公共资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Public 资源组是否为公共资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    /**
     * Get 机器类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 机器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机器类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 机器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 资源组状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源组状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资源组状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源组状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 显卡总张数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gpu 显卡总张数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set 显卡总张数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gpu 显卡总张数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 处理器总核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu 处理器总核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 处理器总核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu 处理器总核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存总量，单位为G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存总量，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存总量，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存总量，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
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
     * Get Gpu类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType Gpu类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGpuType() {
        return this.GpuType;
    }

    /**
     * Set Gpu类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType Gpu类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String [] GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get 该资源组下是否有预付费资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasPrepaid 该资源组下是否有预付费资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasPrepaid() {
        return this.HasPrepaid;
    }

    /**
     * Set 该资源组下是否有预付费资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasPrepaid 该资源组下是否有预付费资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasPrepaid(Boolean HasPrepaid) {
        this.HasPrepaid = HasPrepaid;
    }

    /**
     * Get 资源组是否允许预付费或后付费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 资源组是否允许预付费或后付费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 资源组是否允许预付费或后付费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 资源组是否允许预付费或后付费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamSimple(map, prefix + "Updated", this.Updated);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "JobCount", this.JobCount);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "GpuType.", this.GpuType);
        this.setParamSimple(map, prefix + "HasPrepaid", this.HasPrepaid);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

