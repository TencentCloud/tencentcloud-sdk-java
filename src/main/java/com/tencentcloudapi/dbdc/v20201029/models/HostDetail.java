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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostDetail extends AbstractModel{

    /**
    * 主机Id
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 主机状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 分配DB实例状态,0:可分配,1:不可分配
    */
    @SerializedName("AssignStatus")
    @Expose
    private Long AssignStatus;

    /**
    * 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘
    */
    @SerializedName("HostType")
    @Expose
    private Long HostType;

    /**
    * DB实例数
    */
    @SerializedName("DbNum")
    @Expose
    private Long DbNum;

    /**
    * 主机CPU(单位:核数)
    */
    @SerializedName("CpuSpec")
    @Expose
    private Long CpuSpec;

    /**
    * 已分配CPU(单位:核数)
    */
    @SerializedName("CpuAssigned")
    @Expose
    private Long CpuAssigned;

    /**
    * 可分配CPU(单位:核数)
    */
    @SerializedName("CpuAssignable")
    @Expose
    private Long CpuAssignable;

    /**
    * 主机内存(单位:GB)
    */
    @SerializedName("MemorySpec")
    @Expose
    private Long MemorySpec;

    /**
    * 已分配内存(单位:GB)
    */
    @SerializedName("MemoryAssigned")
    @Expose
    private Long MemoryAssigned;

    /**
    * 可分配内存(单位:GB)
    */
    @SerializedName("MemoryAssignable")
    @Expose
    private Long MemoryAssignable;

    /**
    * 主机磁盘(单位:GB)
    */
    @SerializedName("DiskSpec")
    @Expose
    private Long DiskSpec;

    /**
    * 已分配磁盘(单位:GB)
    */
    @SerializedName("DiskAssigned")
    @Expose
    private Long DiskAssigned;

    /**
    * 可分配磁盘(GB)
    */
    @SerializedName("DiskAssignable")
    @Expose
    private Long DiskAssignable;

    /**
    * CPU分配比
    */
    @SerializedName("CpuRatio")
    @Expose
    private Float CpuRatio;

    /**
    * 内存分配比
    */
    @SerializedName("MemoryRatio")
    @Expose
    private Float MemoryRatio;

    /**
    * 磁盘分配比
    */
    @SerializedName("DiskRatio")
    @Expose
    private Float DiskRatio;

    /**
    * 机型名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 机型类别
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 计费标签
    */
    @SerializedName("PidTag")
    @Expose
    private String PidTag;

    /**
    * 计费ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
     * Get 主机Id 
     * @return HostId 主机Id
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机Id
     * @param HostId 主机Id
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
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
     * Get 主机状态 
     * @return Status 主机状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 主机状态
     * @param Status 主机状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 分配DB实例状态,0:可分配,1:不可分配 
     * @return AssignStatus 分配DB实例状态,0:可分配,1:不可分配
     */
    public Long getAssignStatus() {
        return this.AssignStatus;
    }

    /**
     * Set 分配DB实例状态,0:可分配,1:不可分配
     * @param AssignStatus 分配DB实例状态,0:可分配,1:不可分配
     */
    public void setAssignStatus(Long AssignStatus) {
        this.AssignStatus = AssignStatus;
    }

    /**
     * Get 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘 
     * @return HostType 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘
     */
    public Long getHostType() {
        return this.HostType;
    }

    /**
     * Set 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘
     * @param HostType 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘
     */
    public void setHostType(Long HostType) {
        this.HostType = HostType;
    }

    /**
     * Get DB实例数 
     * @return DbNum DB实例数
     */
    public Long getDbNum() {
        return this.DbNum;
    }

    /**
     * Set DB实例数
     * @param DbNum DB实例数
     */
    public void setDbNum(Long DbNum) {
        this.DbNum = DbNum;
    }

    /**
     * Get 主机CPU(单位:核数) 
     * @return CpuSpec 主机CPU(单位:核数)
     */
    public Long getCpuSpec() {
        return this.CpuSpec;
    }

    /**
     * Set 主机CPU(单位:核数)
     * @param CpuSpec 主机CPU(单位:核数)
     */
    public void setCpuSpec(Long CpuSpec) {
        this.CpuSpec = CpuSpec;
    }

    /**
     * Get 已分配CPU(单位:核数) 
     * @return CpuAssigned 已分配CPU(单位:核数)
     */
    public Long getCpuAssigned() {
        return this.CpuAssigned;
    }

    /**
     * Set 已分配CPU(单位:核数)
     * @param CpuAssigned 已分配CPU(单位:核数)
     */
    public void setCpuAssigned(Long CpuAssigned) {
        this.CpuAssigned = CpuAssigned;
    }

    /**
     * Get 可分配CPU(单位:核数) 
     * @return CpuAssignable 可分配CPU(单位:核数)
     */
    public Long getCpuAssignable() {
        return this.CpuAssignable;
    }

    /**
     * Set 可分配CPU(单位:核数)
     * @param CpuAssignable 可分配CPU(单位:核数)
     */
    public void setCpuAssignable(Long CpuAssignable) {
        this.CpuAssignable = CpuAssignable;
    }

    /**
     * Get 主机内存(单位:GB) 
     * @return MemorySpec 主机内存(单位:GB)
     */
    public Long getMemorySpec() {
        return this.MemorySpec;
    }

    /**
     * Set 主机内存(单位:GB)
     * @param MemorySpec 主机内存(单位:GB)
     */
    public void setMemorySpec(Long MemorySpec) {
        this.MemorySpec = MemorySpec;
    }

    /**
     * Get 已分配内存(单位:GB) 
     * @return MemoryAssigned 已分配内存(单位:GB)
     */
    public Long getMemoryAssigned() {
        return this.MemoryAssigned;
    }

    /**
     * Set 已分配内存(单位:GB)
     * @param MemoryAssigned 已分配内存(单位:GB)
     */
    public void setMemoryAssigned(Long MemoryAssigned) {
        this.MemoryAssigned = MemoryAssigned;
    }

    /**
     * Get 可分配内存(单位:GB) 
     * @return MemoryAssignable 可分配内存(单位:GB)
     */
    public Long getMemoryAssignable() {
        return this.MemoryAssignable;
    }

    /**
     * Set 可分配内存(单位:GB)
     * @param MemoryAssignable 可分配内存(单位:GB)
     */
    public void setMemoryAssignable(Long MemoryAssignable) {
        this.MemoryAssignable = MemoryAssignable;
    }

    /**
     * Get 主机磁盘(单位:GB) 
     * @return DiskSpec 主机磁盘(单位:GB)
     */
    public Long getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set 主机磁盘(单位:GB)
     * @param DiskSpec 主机磁盘(单位:GB)
     */
    public void setDiskSpec(Long DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    /**
     * Get 已分配磁盘(单位:GB) 
     * @return DiskAssigned 已分配磁盘(单位:GB)
     */
    public Long getDiskAssigned() {
        return this.DiskAssigned;
    }

    /**
     * Set 已分配磁盘(单位:GB)
     * @param DiskAssigned 已分配磁盘(单位:GB)
     */
    public void setDiskAssigned(Long DiskAssigned) {
        this.DiskAssigned = DiskAssigned;
    }

    /**
     * Get 可分配磁盘(GB) 
     * @return DiskAssignable 可分配磁盘(GB)
     */
    public Long getDiskAssignable() {
        return this.DiskAssignable;
    }

    /**
     * Set 可分配磁盘(GB)
     * @param DiskAssignable 可分配磁盘(GB)
     */
    public void setDiskAssignable(Long DiskAssignable) {
        this.DiskAssignable = DiskAssignable;
    }

    /**
     * Get CPU分配比 
     * @return CpuRatio CPU分配比
     */
    public Float getCpuRatio() {
        return this.CpuRatio;
    }

    /**
     * Set CPU分配比
     * @param CpuRatio CPU分配比
     */
    public void setCpuRatio(Float CpuRatio) {
        this.CpuRatio = CpuRatio;
    }

    /**
     * Get 内存分配比 
     * @return MemoryRatio 内存分配比
     */
    public Float getMemoryRatio() {
        return this.MemoryRatio;
    }

    /**
     * Set 内存分配比
     * @param MemoryRatio 内存分配比
     */
    public void setMemoryRatio(Float MemoryRatio) {
        this.MemoryRatio = MemoryRatio;
    }

    /**
     * Get 磁盘分配比 
     * @return DiskRatio 磁盘分配比
     */
    public Float getDiskRatio() {
        return this.DiskRatio;
    }

    /**
     * Set 磁盘分配比
     * @param DiskRatio 磁盘分配比
     */
    public void setDiskRatio(Float DiskRatio) {
        this.DiskRatio = DiskRatio;
    }

    /**
     * Get 机型名称 
     * @return MachineName 机型名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机型名称
     * @param MachineName 机型名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 机型类别 
     * @return MachineType 机型类别
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机型类别
     * @param MachineType 机型类别
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 计费标签 
     * @return PidTag 计费标签
     */
    public String getPidTag() {
        return this.PidTag;
    }

    /**
     * Set 计费标签
     * @param PidTag 计费标签
     */
    public void setPidTag(String PidTag) {
        this.PidTag = PidTag;
    }

    /**
     * Get 计费ID 
     * @return Pid 计费ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 计费ID
     * @param Pid 计费ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    public HostDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostDetail(HostDetail source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AssignStatus != null) {
            this.AssignStatus = new Long(source.AssignStatus);
        }
        if (source.HostType != null) {
            this.HostType = new Long(source.HostType);
        }
        if (source.DbNum != null) {
            this.DbNum = new Long(source.DbNum);
        }
        if (source.CpuSpec != null) {
            this.CpuSpec = new Long(source.CpuSpec);
        }
        if (source.CpuAssigned != null) {
            this.CpuAssigned = new Long(source.CpuAssigned);
        }
        if (source.CpuAssignable != null) {
            this.CpuAssignable = new Long(source.CpuAssignable);
        }
        if (source.MemorySpec != null) {
            this.MemorySpec = new Long(source.MemorySpec);
        }
        if (source.MemoryAssigned != null) {
            this.MemoryAssigned = new Long(source.MemoryAssigned);
        }
        if (source.MemoryAssignable != null) {
            this.MemoryAssignable = new Long(source.MemoryAssignable);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new Long(source.DiskSpec);
        }
        if (source.DiskAssigned != null) {
            this.DiskAssigned = new Long(source.DiskAssigned);
        }
        if (source.DiskAssignable != null) {
            this.DiskAssignable = new Long(source.DiskAssignable);
        }
        if (source.CpuRatio != null) {
            this.CpuRatio = new Float(source.CpuRatio);
        }
        if (source.MemoryRatio != null) {
            this.MemoryRatio = new Float(source.MemoryRatio);
        }
        if (source.DiskRatio != null) {
            this.DiskRatio = new Float(source.DiskRatio);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.PidTag != null) {
            this.PidTag = new String(source.PidTag);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AssignStatus", this.AssignStatus);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "DbNum", this.DbNum);
        this.setParamSimple(map, prefix + "CpuSpec", this.CpuSpec);
        this.setParamSimple(map, prefix + "CpuAssigned", this.CpuAssigned);
        this.setParamSimple(map, prefix + "CpuAssignable", this.CpuAssignable);
        this.setParamSimple(map, prefix + "MemorySpec", this.MemorySpec);
        this.setParamSimple(map, prefix + "MemoryAssigned", this.MemoryAssigned);
        this.setParamSimple(map, prefix + "MemoryAssignable", this.MemoryAssignable);
        this.setParamSimple(map, prefix + "DiskSpec", this.DiskSpec);
        this.setParamSimple(map, prefix + "DiskAssigned", this.DiskAssigned);
        this.setParamSimple(map, prefix + "DiskAssignable", this.DiskAssignable);
        this.setParamSimple(map, prefix + "CpuRatio", this.CpuRatio);
        this.setParamSimple(map, prefix + "MemoryRatio", this.MemoryRatio);
        this.setParamSimple(map, prefix + "DiskRatio", this.DiskRatio);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "PidTag", this.PidTag);
        this.setParamSimple(map, prefix + "Pid", this.Pid);

    }
}

