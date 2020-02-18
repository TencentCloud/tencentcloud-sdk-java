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

public class DevicePartition extends AbstractModel{

    /**
    * 系统盘大小
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * 数据盘大小
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

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
    private Long SysRootSpace;

    /**
    * Swaporuefi分区大小
    */
    @SerializedName("SysSwaporuefiSpace")
    @Expose
    private Long SysSwaporuefiSpace;

    /**
    * Usrlocal分区大小
    */
    @SerializedName("SysUsrlocalSpace")
    @Expose
    private Long SysUsrlocalSpace;

    /**
    * data分区大小
    */
    @SerializedName("SysDataSpace")
    @Expose
    private Long SysDataSpace;

    /**
    * 硬盘大小详情
    */
    @SerializedName("DeviceDiskSizeInfoSet")
    @Expose
    private DeviceDiskSizeInfo [] DeviceDiskSizeInfoSet;

    /**
     * Get 系统盘大小 
     * @return SystemDiskSize 系统盘大小
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set 系统盘大小
     * @param SystemDiskSize 系统盘大小
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get 数据盘大小 
     * @return DataDiskSize 数据盘大小
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set 数据盘大小
     * @param DataDiskSize 数据盘大小
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get 是否兼容Uefi 
     * @return SysIsUefiType 是否兼容Uefi
     */
    public Boolean getSysIsUefiType() {
        return this.SysIsUefiType;
    }

    /**
     * Set 是否兼容Uefi
     * @param SysIsUefiType 是否兼容Uefi
     */
    public void setSysIsUefiType(Boolean SysIsUefiType) {
        this.SysIsUefiType = SysIsUefiType;
    }

    /**
     * Get root分区大小 
     * @return SysRootSpace root分区大小
     */
    public Long getSysRootSpace() {
        return this.SysRootSpace;
    }

    /**
     * Set root分区大小
     * @param SysRootSpace root分区大小
     */
    public void setSysRootSpace(Long SysRootSpace) {
        this.SysRootSpace = SysRootSpace;
    }

    /**
     * Get Swaporuefi分区大小 
     * @return SysSwaporuefiSpace Swaporuefi分区大小
     */
    public Long getSysSwaporuefiSpace() {
        return this.SysSwaporuefiSpace;
    }

    /**
     * Set Swaporuefi分区大小
     * @param SysSwaporuefiSpace Swaporuefi分区大小
     */
    public void setSysSwaporuefiSpace(Long SysSwaporuefiSpace) {
        this.SysSwaporuefiSpace = SysSwaporuefiSpace;
    }

    /**
     * Get Usrlocal分区大小 
     * @return SysUsrlocalSpace Usrlocal分区大小
     */
    public Long getSysUsrlocalSpace() {
        return this.SysUsrlocalSpace;
    }

    /**
     * Set Usrlocal分区大小
     * @param SysUsrlocalSpace Usrlocal分区大小
     */
    public void setSysUsrlocalSpace(Long SysUsrlocalSpace) {
        this.SysUsrlocalSpace = SysUsrlocalSpace;
    }

    /**
     * Get data分区大小 
     * @return SysDataSpace data分区大小
     */
    public Long getSysDataSpace() {
        return this.SysDataSpace;
    }

    /**
     * Set data分区大小
     * @param SysDataSpace data分区大小
     */
    public void setSysDataSpace(Long SysDataSpace) {
        this.SysDataSpace = SysDataSpace;
    }

    /**
     * Get 硬盘大小详情 
     * @return DeviceDiskSizeInfoSet 硬盘大小详情
     */
    public DeviceDiskSizeInfo [] getDeviceDiskSizeInfoSet() {
        return this.DeviceDiskSizeInfoSet;
    }

    /**
     * Set 硬盘大小详情
     * @param DeviceDiskSizeInfoSet 硬盘大小详情
     */
    public void setDeviceDiskSizeInfoSet(DeviceDiskSizeInfo [] DeviceDiskSizeInfoSet) {
        this.DeviceDiskSizeInfoSet = DeviceDiskSizeInfoSet;
    }

    /**
     * Internal implementation, normal users should not use it.
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

