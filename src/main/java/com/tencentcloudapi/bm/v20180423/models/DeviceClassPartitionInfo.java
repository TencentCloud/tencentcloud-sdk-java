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

public class DeviceClassPartitionInfo  extends AbstractModel{

    /**
    * RAID类型ID
    */
    @SerializedName("RaidId")
    @Expose
    private Integer RaidId;

    /**
    * RAID名称
    */
    @SerializedName("Raid")
    @Expose
    private String Raid;

    /**
    * RAID名称（前台展示用）
    */
    @SerializedName("RaidDisplay")
    @Expose
    private String RaidDisplay;

    /**
    * 系统盘总大小（单位GiB）
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Integer SystemDiskSize;

    /**
    * 系统盘/分区默认大小（单位GiB）
    */
    @SerializedName("SysRootSpace")
    @Expose
    private Integer SysRootSpace;

    /**
    * 系统盘swap分区默认大小（单位GiB）
    */
    @SerializedName("SysSwaporuefiSpace")
    @Expose
    private Integer SysSwaporuefiSpace;

    /**
    * 系统盘/usr/local分区默认大小（单位GiB）
    */
    @SerializedName("SysUsrlocalSpace")
    @Expose
    private Integer SysUsrlocalSpace;

    /**
    * 系统盘/data分区默认大小（单位GiB）
    */
    @SerializedName("SysDataSpace")
    @Expose
    private Integer SysDataSpace;

    /**
    * 设备是否是uefi启动方式。0:legacy启动; 1:uefi启动
    */
    @SerializedName("SysIsUefiType")
    @Expose
    private Integer SysIsUefiType;

    /**
    * 数据盘总大小
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Integer DataDiskSize;

    /**
    * 硬盘列表
    */
    @SerializedName("DeviceDiskSizeInfoSet")
    @Expose
    private DeviceDiskSizeInfo [] DeviceDiskSizeInfoSet;

    /**
     * 获取RAID类型ID
     * @return RaidId RAID类型ID
     */
    public Integer getRaidId() {
        return this.RaidId;
    }

    /**
     * 设置RAID类型ID
     * @param RaidId RAID类型ID
     */
    public void setRaidId(Integer RaidId) {
        this.RaidId = RaidId;
    }

    /**
     * 获取RAID名称
     * @return Raid RAID名称
     */
    public String getRaid() {
        return this.Raid;
    }

    /**
     * 设置RAID名称
     * @param Raid RAID名称
     */
    public void setRaid(String Raid) {
        this.Raid = Raid;
    }

    /**
     * 获取RAID名称（前台展示用）
     * @return RaidDisplay RAID名称（前台展示用）
     */
    public String getRaidDisplay() {
        return this.RaidDisplay;
    }

    /**
     * 设置RAID名称（前台展示用）
     * @param RaidDisplay RAID名称（前台展示用）
     */
    public void setRaidDisplay(String RaidDisplay) {
        this.RaidDisplay = RaidDisplay;
    }

    /**
     * 获取系统盘总大小（单位GiB）
     * @return SystemDiskSize 系统盘总大小（单位GiB）
     */
    public Integer getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * 设置系统盘总大小（单位GiB）
     * @param SystemDiskSize 系统盘总大小（单位GiB）
     */
    public void setSystemDiskSize(Integer SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * 获取系统盘/分区默认大小（单位GiB）
     * @return SysRootSpace 系统盘/分区默认大小（单位GiB）
     */
    public Integer getSysRootSpace() {
        return this.SysRootSpace;
    }

    /**
     * 设置系统盘/分区默认大小（单位GiB）
     * @param SysRootSpace 系统盘/分区默认大小（单位GiB）
     */
    public void setSysRootSpace(Integer SysRootSpace) {
        this.SysRootSpace = SysRootSpace;
    }

    /**
     * 获取系统盘swap分区默认大小（单位GiB）
     * @return SysSwaporuefiSpace 系统盘swap分区默认大小（单位GiB）
     */
    public Integer getSysSwaporuefiSpace() {
        return this.SysSwaporuefiSpace;
    }

    /**
     * 设置系统盘swap分区默认大小（单位GiB）
     * @param SysSwaporuefiSpace 系统盘swap分区默认大小（单位GiB）
     */
    public void setSysSwaporuefiSpace(Integer SysSwaporuefiSpace) {
        this.SysSwaporuefiSpace = SysSwaporuefiSpace;
    }

    /**
     * 获取系统盘/usr/local分区默认大小（单位GiB）
     * @return SysUsrlocalSpace 系统盘/usr/local分区默认大小（单位GiB）
     */
    public Integer getSysUsrlocalSpace() {
        return this.SysUsrlocalSpace;
    }

    /**
     * 设置系统盘/usr/local分区默认大小（单位GiB）
     * @param SysUsrlocalSpace 系统盘/usr/local分区默认大小（单位GiB）
     */
    public void setSysUsrlocalSpace(Integer SysUsrlocalSpace) {
        this.SysUsrlocalSpace = SysUsrlocalSpace;
    }

    /**
     * 获取系统盘/data分区默认大小（单位GiB）
     * @return SysDataSpace 系统盘/data分区默认大小（单位GiB）
     */
    public Integer getSysDataSpace() {
        return this.SysDataSpace;
    }

    /**
     * 设置系统盘/data分区默认大小（单位GiB）
     * @param SysDataSpace 系统盘/data分区默认大小（单位GiB）
     */
    public void setSysDataSpace(Integer SysDataSpace) {
        this.SysDataSpace = SysDataSpace;
    }

    /**
     * 获取设备是否是uefi启动方式。0:legacy启动; 1:uefi启动
     * @return SysIsUefiType 设备是否是uefi启动方式。0:legacy启动; 1:uefi启动
     */
    public Integer getSysIsUefiType() {
        return this.SysIsUefiType;
    }

    /**
     * 设置设备是否是uefi启动方式。0:legacy启动; 1:uefi启动
     * @param SysIsUefiType 设备是否是uefi启动方式。0:legacy启动; 1:uefi启动
     */
    public void setSysIsUefiType(Integer SysIsUefiType) {
        this.SysIsUefiType = SysIsUefiType;
    }

    /**
     * 获取数据盘总大小
     * @return DataDiskSize 数据盘总大小
     */
    public Integer getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * 设置数据盘总大小
     * @param DataDiskSize 数据盘总大小
     */
    public void setDataDiskSize(Integer DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * 获取硬盘列表
     * @return DeviceDiskSizeInfoSet 硬盘列表
     */
    public DeviceDiskSizeInfo [] getDeviceDiskSizeInfoSet() {
        return this.DeviceDiskSizeInfoSet;
    }

    /**
     * 设置硬盘列表
     * @param DeviceDiskSizeInfoSet 硬盘列表
     */
    public void setDeviceDiskSizeInfoSet(DeviceDiskSizeInfo [] DeviceDiskSizeInfoSet) {
        this.DeviceDiskSizeInfoSet = DeviceDiskSizeInfoSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RaidId", this.RaidId);
        this.setParamSimple(map, prefix + "Raid", this.Raid);
        this.setParamSimple(map, prefix + "RaidDisplay", this.RaidDisplay);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "SysRootSpace", this.SysRootSpace);
        this.setParamSimple(map, prefix + "SysSwaporuefiSpace", this.SysSwaporuefiSpace);
        this.setParamSimple(map, prefix + "SysUsrlocalSpace", this.SysUsrlocalSpace);
        this.setParamSimple(map, prefix + "SysDataSpace", this.SysDataSpace);
        this.setParamSimple(map, prefix + "SysIsUefiType", this.SysIsUefiType);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamArrayObj(map, prefix + "DeviceDiskSizeInfoSet.", this.DeviceDiskSizeInfoSet);

    }
}

