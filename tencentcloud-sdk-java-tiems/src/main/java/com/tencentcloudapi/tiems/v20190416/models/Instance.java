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

public class Instance extends AbstractModel{

    /**
    * 节点 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 节点所在地区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 节点充值类型
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Cpu 核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Gpu 核数
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 节点状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 节点故障信息
    */
    @SerializedName("AbnormalReason")
    @Expose
    private String AbnormalReason;

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
    * 到期时间
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 所属资源组 ID
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 自动续费标签
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 节点所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 当前 Cpu 申请使用量
    */
    @SerializedName("CpuRequested")
    @Expose
    private Long CpuRequested;

    /**
    * 当前 Memory 申请使用量
    */
    @SerializedName("MemoryRequested")
    @Expose
    private Long MemoryRequested;

    /**
    * 当前 Gpu 申请使用量
    */
    @SerializedName("GpuRequested")
    @Expose
    private Long GpuRequested;

    /**
    * 节点所在伸缩组 ID
    */
    @SerializedName("RsgAsGroupId")
    @Expose
    private String RsgAsGroupId;

    /**
     * Get 节点 ID 
     * @return Id 节点 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 节点 ID
     * @param Id 节点 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 节点所在地区 
     * @return Zone 节点所在地区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 节点所在地区
     * @param Zone 节点所在地区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 节点类型 
     * @return InstanceType 节点类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 节点类型
     * @param InstanceType 节点类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 节点充值类型 
     * @return InstanceChargeType 节点充值类型
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 节点充值类型
     * @param InstanceChargeType 节点充值类型
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Cpu 核数 
     * @return Cpu Cpu 核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu 核数
     * @param Cpu Cpu 核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Memory 内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
     * @param Memory 内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Gpu 核数 
     * @return Gpu Gpu 核数
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set Gpu 核数
     * @param Gpu Gpu 核数
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 节点状态 
     * @return State 节点状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 节点状态
     * @param State 节点状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 节点故障信息 
     * @return AbnormalReason 节点故障信息
     */
    public String getAbnormalReason() {
        return this.AbnormalReason;
    }

    /**
     * Set 节点故障信息
     * @param AbnormalReason 节点故障信息
     */
    public void setAbnormalReason(String AbnormalReason) {
        this.AbnormalReason = AbnormalReason;
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
     * Get 到期时间 
     * @return DeadlineTime 到期时间
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 到期时间
     * @param DeadlineTime 到期时间
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 所属资源组 ID 
     * @return ResourceGroupId 所属资源组 ID
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 所属资源组 ID
     * @param ResourceGroupId 所属资源组 ID
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 自动续费标签 
     * @return RenewFlag 自动续费标签
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标签
     * @param RenewFlag 自动续费标签
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 节点所在地域 
     * @return Region 节点所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 节点所在地域
     * @param Region 节点所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 当前 Cpu 申请使用量 
     * @return CpuRequested 当前 Cpu 申请使用量
     */
    public Long getCpuRequested() {
        return this.CpuRequested;
    }

    /**
     * Set 当前 Cpu 申请使用量
     * @param CpuRequested 当前 Cpu 申请使用量
     */
    public void setCpuRequested(Long CpuRequested) {
        this.CpuRequested = CpuRequested;
    }

    /**
     * Get 当前 Memory 申请使用量 
     * @return MemoryRequested 当前 Memory 申请使用量
     */
    public Long getMemoryRequested() {
        return this.MemoryRequested;
    }

    /**
     * Set 当前 Memory 申请使用量
     * @param MemoryRequested 当前 Memory 申请使用量
     */
    public void setMemoryRequested(Long MemoryRequested) {
        this.MemoryRequested = MemoryRequested;
    }

    /**
     * Get 当前 Gpu 申请使用量 
     * @return GpuRequested 当前 Gpu 申请使用量
     */
    public Long getGpuRequested() {
        return this.GpuRequested;
    }

    /**
     * Set 当前 Gpu 申请使用量
     * @param GpuRequested 当前 Gpu 申请使用量
     */
    public void setGpuRequested(Long GpuRequested) {
        this.GpuRequested = GpuRequested;
    }

    /**
     * Get 节点所在伸缩组 ID 
     * @return RsgAsGroupId 节点所在伸缩组 ID
     */
    public String getRsgAsGroupId() {
        return this.RsgAsGroupId;
    }

    /**
     * Set 节点所在伸缩组 ID
     * @param RsgAsGroupId 节点所在伸缩组 ID
     */
    public void setRsgAsGroupId(String RsgAsGroupId) {
        this.RsgAsGroupId = RsgAsGroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AbnormalReason", this.AbnormalReason);
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamSimple(map, prefix + "Updated", this.Updated);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CpuRequested", this.CpuRequested);
        this.setParamSimple(map, prefix + "MemoryRequested", this.MemoryRequested);
        this.setParamSimple(map, prefix + "GpuRequested", this.GpuRequested);
        this.setParamSimple(map, prefix + "RsgAsGroupId", this.RsgAsGroupId);

    }
}

