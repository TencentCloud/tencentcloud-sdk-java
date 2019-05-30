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

public class DevicePartition  extends AbstractModel{

    /**
    * 系统盘大小
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Integer SystemDiskSize;

    /**
    * 数据盘大小
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Integer DataDiskSize;

    /**
    * 是否兼容Uefi
    */
    @SerializedName("SysIsUefiType")
    @Expose
    private Boolean SysIsUefiType;

    /**
    * root分区大小
    */
    @SerializedName("SysRootSpace")
    @Expose
    private Integer SysRootSpace;

    /**
    * Swaporuefi分区大小
    */
    @SerializedName("SysSwaporuefiSpace")
    @Expose
    private Integer SysSwaporuefiSpace;

    /**
    * Usrlocal分区大小
    */
    @SerializedName("SysUsrlocalSpace")
    @Expose
    private Integer SysUsrlocalSpace;

    /**
    * data分区大小
    */
    @SerializedName("SysDataSpace")
    @Expose
    private Integer SysDataSpace;

    /**
    * 硬盘大小详情
    */
    @SerializedName("DeviceDiskSizeInfoSet")
    @Expose
    private DeviceDiskSizeInfo [] DeviceDiskSizeInfoSet;

    /**
     * 获取系统盘大小
     * @return SystemDiskSize 系统盘大小
     */
    public Integer getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * 设置系统盘大小
     * @param SystemDiskSize 系统盘大小
     */
    public void setSystemDiskSize(Integer SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * 获取数据盘大小
     * @return DataDiskSize 数据盘大小
     */
    public Integer getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * 设置数据盘大小
     * @param DataDiskSize 数据盘大小
     */
    public void setDataDiskSize(Integer DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * 获取是否兼容Uefi
     * @return SysIsUefiType 是否兼容Uefi
     */
    public Boolean getSysIsUefiType() {
        return this.SysIsUefiType;
    }

    /**
     * 设置是否兼容Uefi
     * @param SysIsUefiType 是否兼容Uefi
     */
    public void setSysIsUefiType(Boolean SysIsUefiType) {
        this.SysIsUefiType = SysIsUefiType;
    }

    /**
     * 获取root分区大小
     * @return SysRootSpace root分区大小
     */
    public Integer getSysRootSpace() {
        return this.SysRootSpace;
    }

    /**
     * 设置root分区大小
     * @param SysRootSpace root分区大小
     */
    public void setSysRootSpace(Integer SysRootSpace) {
        this.SysRootSpace = SysRootSpace;
    }

    /**
     * 获取Swaporuefi分区大小
     * @return SysSwaporuefiSpace Swaporuefi分区大小
     */
    public Integer getSysSwaporuefiSpace() {
        return this.SysSwaporuefiSpace;
    }

    /**
     * 设置Swaporuefi分区大小
     * @param SysSwaporuefiSpace Swaporuefi分区大小
     */
    public void setSysSwaporuefiSpace(Integer SysSwaporuefiSpace) {
        this.SysSwaporuefiSpace = SysSwaporuefiSpace;
    }

    /**
     * 获取Usrlocal分区大小
     * @return SysUsrlocalSpace Usrlocal分区大小
     */
    public Integer getSysUsrlocalSpace() {
        return this.SysUsrlocalSpace;
    }

    /**
     * 设置Usrlocal分区大小
     * @param SysUsrlocalSpace Usrlocal分区大小
     */
    public void setSysUsrlocalSpace(Integer SysUsrlocalSpace) {
        this.SysUsrlocalSpace = SysUsrlocalSpace;
    }

    /**
     * 获取data分区大小
     * @return SysDataSpace data分区大小
     */
    public Integer getSysDataSpace() {
        return this.SysDataSpace;
    }

    /**
     * 设置data分区大小
     * @param SysDataSpace data分区大小
     */
    public void setSysDataSpace(Integer SysDataSpace) {
        this.SysDataSpace = SysDataSpace;
    }

    /**
     * 获取硬盘大小详情
     * @return DeviceDiskSizeInfoSet 硬盘大小详情
     */
    public DeviceDiskSizeInfo [] getDeviceDiskSizeInfoSet() {
        return this.DeviceDiskSizeInfoSet;
    }

    /**
     * 设置硬盘大小详情
     * @param DeviceDiskSizeInfoSet 硬盘大小详情
     */
    public void setDeviceDiskSizeInfoSet(DeviceDiskSizeInfo [] DeviceDiskSizeInfoSet) {
        this.DeviceDiskSizeInfoSet = DeviceDiskSizeInfoSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamSimple(map, prefix + "SysIsUefiType", this.SysIsUefiType);
        this.setParamSimple(map, prefix + "SysRootSpace", this.SysRootSpace);
        this.setParamSimple(map, prefix + "SysSwaporuefiSpace", this.SysSwaporuefiSpace);
        this.setParamSimple(map, prefix + "SysUsrlocalSpace", this.SysUsrlocalSpace);
        this.setParamSimple(map, prefix + "SysDataSpace", this.SysDataSpace);
        this.setParamArrayObj(map, prefix + "DeviceDiskSizeInfoSet.", this.DeviceDiskSizeInfoSet);

    }
}

