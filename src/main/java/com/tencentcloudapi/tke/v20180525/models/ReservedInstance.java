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

public class ReservedInstance extends AbstractModel{

    /**
    * 预留实例ID
    */
    @SerializedName("ReservedInstanceId")
    @Expose
    private String ReservedInstanceId;

    /**
    * 预留实例名称
    */
    @SerializedName("ReservedInstanceName")
    @Expose
    private String ReservedInstanceName;

    /**
    * 预留券状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 有效期，单位：月
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 抵扣资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源核数
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 资源内存，单位：Gi
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 预留券的范围，默认值region。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 生效时间
    */
    @SerializedName("ActiveAt")
    @Expose
    private String ActiveAt;

    /**
    * 过期时间
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * GPU卡数
    */
    @SerializedName("GpuCount")
    @Expose
    private String GpuCount;

    /**
    * 自动续费标记
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    *  上个周期预留券的抵扣状态，Deduct、NotDeduct
    */
    @SerializedName("DeductStatus")
    @Expose
    private String DeductStatus;

    /**
     * Get 预留实例ID 
     * @return ReservedInstanceId 预留实例ID
     */
    public String getReservedInstanceId() {
        return this.ReservedInstanceId;
    }

    /**
     * Set 预留实例ID
     * @param ReservedInstanceId 预留实例ID
     */
    public void setReservedInstanceId(String ReservedInstanceId) {
        this.ReservedInstanceId = ReservedInstanceId;
    }

    /**
     * Get 预留实例名称 
     * @return ReservedInstanceName 预留实例名称
     */
    public String getReservedInstanceName() {
        return this.ReservedInstanceName;
    }

    /**
     * Set 预留实例名称
     * @param ReservedInstanceName 预留实例名称
     */
    public void setReservedInstanceName(String ReservedInstanceName) {
        this.ReservedInstanceName = ReservedInstanceName;
    }

    /**
     * Get 预留券状态 
     * @return Status 预留券状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 预留券状态
     * @param Status 预留券状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 有效期，单位：月 
     * @return TimeSpan 有效期，单位：月
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 有效期，单位：月
     * @param TimeSpan 有效期，单位：月
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 抵扣资源类型 
     * @return ResourceType 抵扣资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 抵扣资源类型
     * @param ResourceType 抵扣资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源核数 
     * @return Cpu 资源核数
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set 资源核数
     * @param Cpu 资源核数
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 资源内存，单位：Gi 
     * @return Memory 资源内存，单位：Gi
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 资源内存，单位：Gi
     * @param Memory 资源内存，单位：Gi
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 预留券的范围，默认值region。 
     * @return Scope 预留券的范围，默认值region。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 预留券的范围，默认值region。
     * @param Scope 预留券的范围，默认值region。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 生效时间 
     * @return ActiveAt 生效时间
     */
    public String getActiveAt() {
        return this.ActiveAt;
    }

    /**
     * Set 生效时间
     * @param ActiveAt 生效时间
     */
    public void setActiveAt(String ActiveAt) {
        this.ActiveAt = ActiveAt;
    }

    /**
     * Get 过期时间 
     * @return ExpireAt 过期时间
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set 过期时间
     * @param ExpireAt 过期时间
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get GPU卡数 
     * @return GpuCount GPU卡数
     */
    public String getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set GPU卡数
     * @param GpuCount GPU卡数
     */
    public void setGpuCount(String GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get 自动续费标记 
     * @return AutoRenewFlag 自动续费标记
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记
     * @param AutoRenewFlag 自动续费标记
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get  上个周期预留券的抵扣状态，Deduct、NotDeduct 
     * @return DeductStatus  上个周期预留券的抵扣状态，Deduct、NotDeduct
     */
    public String getDeductStatus() {
        return this.DeductStatus;
    }

    /**
     * Set  上个周期预留券的抵扣状态，Deduct、NotDeduct
     * @param DeductStatus  上个周期预留券的抵扣状态，Deduct、NotDeduct
     */
    public void setDeductStatus(String DeductStatus) {
        this.DeductStatus = DeductStatus;
    }

    public ReservedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstance(ReservedInstance source) {
        if (source.ReservedInstanceId != null) {
            this.ReservedInstanceId = new String(source.ReservedInstanceId);
        }
        if (source.ReservedInstanceName != null) {
            this.ReservedInstanceName = new String(source.ReservedInstanceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ActiveAt != null) {
            this.ActiveAt = new String(source.ActiveAt);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.GpuCount != null) {
            this.GpuCount = new String(source.GpuCount);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.DeductStatus != null) {
            this.DeductStatus = new String(source.DeductStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservedInstanceId", this.ReservedInstanceId);
        this.setParamSimple(map, prefix + "ReservedInstanceName", this.ReservedInstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ActiveAt", this.ActiveAt);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "GpuCount", this.GpuCount);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "DeductStatus", this.DeductStatus);

    }
}

