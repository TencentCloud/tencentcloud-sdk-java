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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetMachineBaseInfo extends AbstractModel{

    /**
    * 服务器Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 服务器uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 服务器内网IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 服务器名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 操作系统名称
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * CPU信息
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * 内存容量：单位G
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 内存使用率百分比
    */
    @SerializedName("MemLoad")
    @Expose
    private String MemLoad;

    /**
    * 硬盘容量：单位G
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 硬盘使用率百分比
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * 分区数
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 主机外网IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 业务组ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cpu数量
    */
    @SerializedName("CpuSize")
    @Expose
    private Long CpuSize;

    /**
    * Cpu使用率百分比
    */
    @SerializedName("CpuLoad")
    @Expose
    private String CpuLoad;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 服务器Quuid 
     * @return Quuid 服务器Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器Quuid
     * @param Quuid 服务器Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 服务器uuid 
     * @return Uuid 服务器uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器uuid
     * @param Uuid 服务器uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 服务器内网IP 
     * @return MachineIp 服务器内网IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 服务器内网IP
     * @param MachineIp 服务器内网IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 服务器名称 
     * @return MachineName 服务器名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 服务器名称
     * @param MachineName 服务器名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 操作系统名称 
     * @return OsInfo 操作系统名称
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set 操作系统名称
     * @param OsInfo 操作系统名称
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get CPU信息 
     * @return Cpu CPU信息
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU信息
     * @param Cpu CPU信息
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存容量：单位G 
     * @return MemSize 内存容量：单位G
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存容量：单位G
     * @param MemSize 内存容量：单位G
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 内存使用率百分比 
     * @return MemLoad 内存使用率百分比
     */
    public String getMemLoad() {
        return this.MemLoad;
    }

    /**
     * Set 内存使用率百分比
     * @param MemLoad 内存使用率百分比
     */
    public void setMemLoad(String MemLoad) {
        this.MemLoad = MemLoad;
    }

    /**
     * Get 硬盘容量：单位G 
     * @return DiskSize 硬盘容量：单位G
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘容量：单位G
     * @param DiskSize 硬盘容量：单位G
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 硬盘使用率百分比 
     * @return DiskLoad 硬盘使用率百分比
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set 硬盘使用率百分比
     * @param DiskLoad 硬盘使用率百分比
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get 分区数 
     * @return PartitionCount 分区数
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 分区数
     * @param PartitionCount 分区数
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 主机外网IP 
     * @return MachineWanIp 主机外网IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机外网IP
     * @param MachineWanIp 主机外网IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 业务组ID 
     * @return ProjectId 业务组ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 业务组ID
     * @param ProjectId 业务组ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cpu数量 
     * @return CpuSize Cpu数量
     */
    public Long getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set Cpu数量
     * @param CpuSize Cpu数量
     */
    public void setCpuSize(Long CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get Cpu使用率百分比 
     * @return CpuLoad Cpu使用率百分比
     */
    public String getCpuLoad() {
        return this.CpuLoad;
    }

    /**
     * Set Cpu使用率百分比
     * @param CpuLoad Cpu使用率百分比
     */
    public void setCpuLoad(String CpuLoad) {
        this.CpuLoad = CpuLoad;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetMachineBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetMachineBaseInfo(AssetMachineBaseInfo source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemLoad != null) {
            this.MemLoad = new String(source.MemLoad);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskLoad != null) {
            this.DiskLoad = new String(source.DiskLoad);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Long(source.CpuSize);
        }
        if (source.CpuLoad != null) {
            this.CpuLoad = new String(source.CpuLoad);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemLoad", this.MemLoad);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskLoad", this.DiskLoad);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "CpuLoad", this.CpuLoad);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

