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

public class DeviceHardwareInfo  extends AbstractModel{

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
    private Integer IsElastic;

    /**
    * 机型计费模式，1 为预付费，2 为后付费
    */
    @SerializedName("CpmPayMode")
    @Expose
    private Integer CpmPayMode;

    /**
    * 自定义机型，CPU 型号 ID（非自定义机型返回0）
    */
    @SerializedName("CpuId")
    @Expose
    private Integer CpuId;

    /**
    * 自定义机型，内存大小, 单位 GB（非自定义机型返回0）
    */
    @SerializedName("Mem")
    @Expose
    private Integer Mem;

    /**
    * 是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
    */
    @SerializedName("ContainRaidCard")
    @Expose
    private Integer ContainRaidCard;

    /**
    * 自定义机型系统盘类型ID（若没有则返回0）
    */
    @SerializedName("SystemDiskTypeId")
    @Expose
    private Integer SystemDiskTypeId;

    /**
    * 自定义机型系统盘数量（若没有则返回0）
    */
    @SerializedName("SystemDiskCount")
    @Expose
    private Integer SystemDiskCount;

    /**
    * 自定义机型数据盘类型 ID（若没有则返回0）
    */
    @SerializedName("DataDiskTypeId")
    @Expose
    private Integer DataDiskTypeId;

    /**
    * 自定义机型数据盘数量（若没有则返回0）
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Integer DataDiskCount;

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
     * 获取设备实例 ID
     * @return InstanceId 设备实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置设备实例 ID
     * @param InstanceId 设备实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取是否自定义机型
     * @return IsElastic 是否自定义机型
     */
    public Integer getIsElastic() {
        return this.IsElastic;
    }

    /**
     * 设置是否自定义机型
     * @param IsElastic 是否自定义机型
     */
    public void setIsElastic(Integer IsElastic) {
        this.IsElastic = IsElastic;
    }

    /**
     * 获取机型计费模式，1 为预付费，2 为后付费
     * @return CpmPayMode 机型计费模式，1 为预付费，2 为后付费
     */
    public Integer getCpmPayMode() {
        return this.CpmPayMode;
    }

    /**
     * 设置机型计费模式，1 为预付费，2 为后付费
     * @param CpmPayMode 机型计费模式，1 为预付费，2 为后付费
     */
    public void setCpmPayMode(Integer CpmPayMode) {
        this.CpmPayMode = CpmPayMode;
    }

    /**
     * 获取自定义机型，CPU 型号 ID（非自定义机型返回0）
     * @return CpuId 自定义机型，CPU 型号 ID（非自定义机型返回0）
     */
    public Integer getCpuId() {
        return this.CpuId;
    }

    /**
     * 设置自定义机型，CPU 型号 ID（非自定义机型返回0）
     * @param CpuId 自定义机型，CPU 型号 ID（非自定义机型返回0）
     */
    public void setCpuId(Integer CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * 获取自定义机型，内存大小, 单位 GB（非自定义机型返回0）
     * @return Mem 自定义机型，内存大小, 单位 GB（非自定义机型返回0）
     */
    public Integer getMem() {
        return this.Mem;
    }

    /**
     * 设置自定义机型，内存大小, 单位 GB（非自定义机型返回0）
     * @param Mem 自定义机型，内存大小, 单位 GB（非自定义机型返回0）
     */
    public void setMem(Integer Mem) {
        this.Mem = Mem;
    }

    /**
     * 获取是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
     * @return ContainRaidCard 是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
     */
    public Integer getContainRaidCard() {
        return this.ContainRaidCard;
    }

    /**
     * 设置是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
     * @param ContainRaidCard 是否有 RAID 卡，0：没有 RAID 卡； 1：有 RAID 卡
     */
    public void setContainRaidCard(Integer ContainRaidCard) {
        this.ContainRaidCard = ContainRaidCard;
    }

    /**
     * 获取自定义机型系统盘类型ID（若没有则返回0）
     * @return SystemDiskTypeId 自定义机型系统盘类型ID（若没有则返回0）
     */
    public Integer getSystemDiskTypeId() {
        return this.SystemDiskTypeId;
    }

    /**
     * 设置自定义机型系统盘类型ID（若没有则返回0）
     * @param SystemDiskTypeId 自定义机型系统盘类型ID（若没有则返回0）
     */
    public void setSystemDiskTypeId(Integer SystemDiskTypeId) {
        this.SystemDiskTypeId = SystemDiskTypeId;
    }

    /**
     * 获取自定义机型系统盘数量（若没有则返回0）
     * @return SystemDiskCount 自定义机型系统盘数量（若没有则返回0）
     */
    public Integer getSystemDiskCount() {
        return this.SystemDiskCount;
    }

    /**
     * 设置自定义机型系统盘数量（若没有则返回0）
     * @param SystemDiskCount 自定义机型系统盘数量（若没有则返回0）
     */
    public void setSystemDiskCount(Integer SystemDiskCount) {
        this.SystemDiskCount = SystemDiskCount;
    }

    /**
     * 获取自定义机型数据盘类型 ID（若没有则返回0）
     * @return DataDiskTypeId 自定义机型数据盘类型 ID（若没有则返回0）
     */
    public Integer getDataDiskTypeId() {
        return this.DataDiskTypeId;
    }

    /**
     * 设置自定义机型数据盘类型 ID（若没有则返回0）
     * @param DataDiskTypeId 自定义机型数据盘类型 ID（若没有则返回0）
     */
    public void setDataDiskTypeId(Integer DataDiskTypeId) {
        this.DataDiskTypeId = DataDiskTypeId;
    }

    /**
     * 获取自定义机型数据盘数量（若没有则返回0）
     * @return DataDiskCount 自定义机型数据盘数量（若没有则返回0）
     */
    public Integer getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * 设置自定义机型数据盘数量（若没有则返回0）
     * @param DataDiskCount 自定义机型数据盘数量（若没有则返回0）
     */
    public void setDataDiskCount(Integer DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
    }

    /**
     * 获取CPU 型号描述
     * @return CpuDescription CPU 型号描述
     */
    public String getCpuDescription() {
        return this.CpuDescription;
    }

    /**
     * 设置CPU 型号描述
     * @param CpuDescription CPU 型号描述
     */
    public void setCpuDescription(String CpuDescription) {
        this.CpuDescription = CpuDescription;
    }

    /**
     * 获取内存描述
     * @return MemDescription 内存描述
     */
    public String getMemDescription() {
        return this.MemDescription;
    }

    /**
     * 设置内存描述
     * @param MemDescription 内存描述
     */
    public void setMemDescription(String MemDescription) {
        this.MemDescription = MemDescription;
    }

    /**
     * 获取磁盘描述
     * @return DiskDescription 磁盘描述
     */
    public String getDiskDescription() {
        return this.DiskDescription;
    }

    /**
     * 设置磁盘描述
     * @param DiskDescription 磁盘描述
     */
    public void setDiskDescription(String DiskDescription) {
        this.DiskDescription = DiskDescription;
    }

    /**
     * 获取网卡描述
     * @return NicDescription 网卡描述
     */
    public String getNicDescription() {
        return this.NicDescription;
    }

    /**
     * 设置网卡描述
     * @param NicDescription 网卡描述
     */
    public void setNicDescription(String NicDescription) {
        this.NicDescription = NicDescription;
    }

    /**
     * 获取是否支持 RAID 的描述
     * @return RaidDescription 是否支持 RAID 的描述
     */
    public String getRaidDescription() {
        return this.RaidDescription;
    }

    /**
     * 设置是否支持 RAID 的描述
     * @param RaidDescription 是否支持 RAID 的描述
     */
    public void setRaidDescription(String RaidDescription) {
        this.RaidDescription = RaidDescription;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

