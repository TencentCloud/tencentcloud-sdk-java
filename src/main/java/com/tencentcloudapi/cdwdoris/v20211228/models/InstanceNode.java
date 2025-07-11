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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNode extends AbstractModel {

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 机型，如 S1
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * cpu核数
    */
    @SerializedName("Core")
    @Expose
    private Long Core;

    /**
    * 内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 磁盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 所属clickhouse cluster名称
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * rip
    */
    @SerializedName("Rip")
    @Expose
    private String Rip;

    /**
    * FE节点角色
    */
    @SerializedName("FeRole")
    @Expose
    private String FeRole;

    /**
    * UUID
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 虚拟可用区
    */
    @SerializedName("VirtualZone")
    @Expose
    private String VirtualZone;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 计算组ID
    */
    @SerializedName("ComputeGroupId")
    @Expose
    private String ComputeGroupId;

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 机型，如 S1 
     * @return Spec 机型，如 S1
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 机型，如 S1
     * @param Spec 机型，如 S1
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get cpu核数 
     * @return Core cpu核数
     */
    public Long getCore() {
        return this.Core;
    }

    /**
     * Set cpu核数
     * @param Core cpu核数
     */
    public void setCore(Long Core) {
        this.Core = Core;
    }

    /**
     * Get 内存大小 
     * @return Memory 内存大小
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小
     * @param Memory 内存大小
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘类型 
     * @return DiskType 磁盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型
     * @param DiskType 磁盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘大小 
     * @return DiskSize 磁盘大小
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小
     * @param DiskSize 磁盘大小
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 所属clickhouse cluster名称 
     * @return Role 所属clickhouse cluster名称
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 所属clickhouse cluster名称
     * @param Role 所属clickhouse cluster名称
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get rip 
     * @return Rip rip
     */
    public String getRip() {
        return this.Rip;
    }

    /**
     * Set rip
     * @param Rip rip
     */
    public void setRip(String Rip) {
        this.Rip = Rip;
    }

    /**
     * Get FE节点角色 
     * @return FeRole FE节点角色
     */
    public String getFeRole() {
        return this.FeRole;
    }

    /**
     * Set FE节点角色
     * @param FeRole FE节点角色
     */
    public void setFeRole(String FeRole) {
        this.FeRole = FeRole;
    }

    /**
     * Get UUID 
     * @return UUID UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set UUID
     * @param UUID UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 虚拟可用区 
     * @return VirtualZone 虚拟可用区
     */
    public String getVirtualZone() {
        return this.VirtualZone;
    }

    /**
     * Set 虚拟可用区
     * @param VirtualZone 虚拟可用区
     */
    public void setVirtualZone(String VirtualZone) {
        this.VirtualZone = VirtualZone;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 计算组ID 
     * @return ComputeGroupId 计算组ID
     */
    public String getComputeGroupId() {
        return this.ComputeGroupId;
    }

    /**
     * Set 计算组ID
     * @param ComputeGroupId 计算组ID
     */
    public void setComputeGroupId(String ComputeGroupId) {
        this.ComputeGroupId = ComputeGroupId;
    }

    public InstanceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNode(InstanceNode source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Core != null) {
            this.Core = new Long(source.Core);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Rip != null) {
            this.Rip = new String(source.Rip);
        }
        if (source.FeRole != null) {
            this.FeRole = new String(source.FeRole);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VirtualZone != null) {
            this.VirtualZone = new String(source.VirtualZone);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ComputeGroupId != null) {
            this.ComputeGroupId = new String(source.ComputeGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Core", this.Core);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Rip", this.Rip);
        this.setParamSimple(map, prefix + "FeRole", this.FeRole);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VirtualZone", this.VirtualZone);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ComputeGroupId", this.ComputeGroupId);

    }
}

