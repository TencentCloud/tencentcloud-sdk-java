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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceHardwareInfo extends AbstractModel{

    /**
    * 设备实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否自定义机型
    */
    @SerializedName("IsElastic")
    @Expose
    private Long IsElastic;

    /**
    * 机型计费模式，1 为预付费，2 为后付费
    */
    @SerializedName("CpmPayMode")
    @Expose
    private Long CpmPayMode;

    /**
    * 自定义机型，CPU 型号 ID（非自定义机型返回0）
    */
    @SerializedName("CpuId")
    @Expose
    private Long CpuId;

    /**
    * 自定义机型，内存大小, 单位 GB（非自定义机型返回0）
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
    */
    @SerializedName("ContainRaidCard")
    @Expose
    private Long ContainRaidCard;

    /**
    * 自定义机型系统盘类型ID（若没有则返回0）
    */
    @SerializedName("SystemDiskTypeId")
    @Expose
    private Long SystemDiskTypeId;

    /**
    * 自定义机型系统盘数量（若没有则返回0）
    */
    @SerializedName("SystemDiskCount")
    @Expose
    private Long SystemDiskCount;

    /**
    * 自定义机型数据盘类型 ID（若没有则返回0）
    */
    @SerializedName("DataDiskTypeId")
    @Expose
    private Long DataDiskTypeId;

    /**
    * 自定义机型数据盘数量（若没有则返回0）
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Long DataDiskCount;

    /**
    * CPU 型号描述
    */
    @SerializedName("CpuDescription")
    @Expose
    private String CpuDescription;

    /**
    * 内存描述
    */
    @SerializedName("MemDescription")
    @Expose
    private String MemDescription;

    /**
    * 磁盘描述
    */
    @SerializedName("DiskDescription")
    @Expose
    private String DiskDescription;

    /**
    * 网卡描述
    */
    @SerializedName("NicDescription")
    @Expose
    private String NicDescription;

    /**
    * 是否支持 RAID 的描述
    */
    @SerializedName("RaidDescription")
    @Expose
    private String RaidDescription;

    /**
    * cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get 设备实例 ID 
     * @return InstanceId 设备实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 设备实例 ID
     * @param InstanceId 设备实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否自定义机型 
     * @return IsElastic 是否自定义机型
     */
    public Long getIsElastic() {
        return this.IsElastic;
    }

    /**
     * Set 是否自定义机型
     * @param IsElastic 是否自定义机型
     */
    public void setIsElastic(Long IsElastic) {
        this.IsElastic = IsElastic;
    }

    /**
     * Get 机型计费模式，1 为预付费，2 为后付费 
     * @return CpmPayMode 机型计费模式，1 为预付费，2 为后付费
     */
    public Long getCpmPayMode() {
        return this.CpmPayMode;
    }

    /**
     * Set 机型计费模式，1 为预付费，2 为后付费
     * @param CpmPayMode 机型计费模式，1 为预付费，2 为后付费
     */
    public void setCpmPayMode(Long CpmPayMode) {
        this.CpmPayMode = CpmPayMode;
    }

    /**
     * Get 自定义机型，CPU 型号 ID（非自定义机型返回0） 
     * @return CpuId 自定义机型，CPU 型号 ID（非自定义机型返回0）
     */
    public Long getCpuId() {
        return this.CpuId;
    }

    /**
     * Set 自定义机型，CPU 型号 ID（非自定义机型返回0）
     * @param CpuId 自定义机型，CPU 型号 ID（非自定义机型返回0）
     */
    public void setCpuId(Long CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * Get 自定义机型，内存大小, 单位 GB（非自定义机型返回0） 
     * @return Mem 自定义机型，内存大小, 单位 GB（非自定义机型返回0）
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 自定义机型，内存大小, 单位 GB（非自定义机型返回0）
     * @param Mem 自定义机型，内存大小, 单位 GB（非自定义机型返回0）
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡 
     * @return ContainRaidCard 是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
     */
    public Long getContainRaidCard() {
        return this.ContainRaidCard;
    }

    /**
     * Set 是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
     * @param ContainRaidCard 是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
     */
    public void setContainRaidCard(Long ContainRaidCard) {
        this.ContainRaidCard = ContainRaidCard;
    }

    /**
     * Get 自定义机型系统盘类型ID（若没有则返回0） 
     * @return SystemDiskTypeId 自定义机型系统盘类型ID（若没有则返回0）
     */
    public Long getSystemDiskTypeId() {
        return this.SystemDiskTypeId;
    }

    /**
     * Set 自定义机型系统盘类型ID（若没有则返回0）
     * @param SystemDiskTypeId 自定义机型系统盘类型ID（若没有则返回0）
     */
    public void setSystemDiskTypeId(Long SystemDiskTypeId) {
        this.SystemDiskTypeId = SystemDiskTypeId;
    }

    /**
     * Get 自定义机型系统盘数量（若没有则返回0） 
     * @return SystemDiskCount 自定义机型系统盘数量（若没有则返回0）
     */
    public Long getSystemDiskCount() {
        return this.SystemDiskCount;
    }

    /**
     * Set 自定义机型系统盘数量（若没有则返回0）
     * @param SystemDiskCount 自定义机型系统盘数量（若没有则返回0）
     */
    public void setSystemDiskCount(Long SystemDiskCount) {
        this.SystemDiskCount = SystemDiskCount;
    }

    /**
     * Get 自定义机型数据盘类型 ID（若没有则返回0） 
     * @return DataDiskTypeId 自定义机型数据盘类型 ID（若没有则返回0）
     */
    public Long getDataDiskTypeId() {
        return this.DataDiskTypeId;
    }

    /**
     * Set 自定义机型数据盘类型 ID（若没有则返回0）
     * @param DataDiskTypeId 自定义机型数据盘类型 ID（若没有则返回0）
     */
    public void setDataDiskTypeId(Long DataDiskTypeId) {
        this.DataDiskTypeId = DataDiskTypeId;
    }

    /**
     * Get 自定义机型数据盘数量（若没有则返回0） 
     * @return DataDiskCount 自定义机型数据盘数量（若没有则返回0）
     */
    public Long getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * Set 自定义机型数据盘数量（若没有则返回0）
     * @param DataDiskCount 自定义机型数据盘数量（若没有则返回0）
     */
    public void setDataDiskCount(Long DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
    }

    /**
     * Get CPU 型号描述 
     * @return CpuDescription CPU 型号描述
     */
    public String getCpuDescription() {
        return this.CpuDescription;
    }

    /**
     * Set CPU 型号描述
     * @param CpuDescription CPU 型号描述
     */
    public void setCpuDescription(String CpuDescription) {
        this.CpuDescription = CpuDescription;
    }

    /**
     * Get 内存描述 
     * @return MemDescription 内存描述
     */
    public String getMemDescription() {
        return this.MemDescription;
    }

    /**
     * Set 内存描述
     * @param MemDescription 内存描述
     */
    public void setMemDescription(String MemDescription) {
        this.MemDescription = MemDescription;
    }

    /**
     * Get 磁盘描述 
     * @return DiskDescription 磁盘描述
     */
    public String getDiskDescription() {
        return this.DiskDescription;
    }

    /**
     * Set 磁盘描述
     * @param DiskDescription 磁盘描述
     */
    public void setDiskDescription(String DiskDescription) {
        this.DiskDescription = DiskDescription;
    }

    /**
     * Get 网卡描述 
     * @return NicDescription 网卡描述
     */
    public String getNicDescription() {
        return this.NicDescription;
    }

    /**
     * Set 网卡描述
     * @param NicDescription 网卡描述
     */
    public void setNicDescription(String NicDescription) {
        this.NicDescription = NicDescription;
    }

    /**
     * Get 是否支持 RAID 的描述 
     * @return RaidDescription 是否支持 RAID 的描述
     */
    public String getRaidDescription() {
        return this.RaidDescription;
    }

    /**
     * Set 是否支持 RAID 的描述
     * @param RaidDescription 是否支持 RAID 的描述
     */
    public void setRaidDescription(String RaidDescription) {
        this.RaidDescription = RaidDescription;
    }

    /**
     * Get cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2 
     * @return Cpu cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2
     * @param Cpu cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IsElastic", this.IsElastic);
        this.setParamSimple(map, prefix + "CpmPayMode", this.CpmPayMode);
        this.setParamSimple(map, prefix + "CpuId", this.CpuId);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ContainRaidCard", this.ContainRaidCard);
        this.setParamSimple(map, prefix + "SystemDiskTypeId", this.SystemDiskTypeId);
        this.setParamSimple(map, prefix + "SystemDiskCount", this.SystemDiskCount);
        this.setParamSimple(map, prefix + "DataDiskTypeId", this.DataDiskTypeId);
        this.setParamSimple(map, prefix + "DataDiskCount", this.DataDiskCount);
        this.setParamSimple(map, prefix + "CpuDescription", this.CpuDescription);
        this.setParamSimple(map, prefix + "MemDescription", this.MemDescription);
        this.setParamSimple(map, prefix + "DiskDescription", this.DiskDescription);
        this.setParamSimple(map, prefix + "NicDescription", this.NicDescription);
        this.setParamSimple(map, prefix + "RaidDescription", this.RaidDescription);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

