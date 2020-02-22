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

public class DescribeDeviceInventoryRequest extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 设备型号
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * CpuId，自定义机型时需传入
    */
    @SerializedName("CpuId")
    @Expose
    private Long CpuId;

    /**
    * 硬盘类型，自定义机型时需传入
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 单块硬盘大小，自定义机型时需传入
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 硬盘数量，自定义机型时需传入
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * 内存总大小，自定义机型时需传入
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 是否支持raid，自定义机型时需传入
    */
    @SerializedName("HaveRaidCard")
    @Expose
    private Long HaveRaidCard;

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
     * Get 设备型号 
     * @return DeviceClassCode 设备型号
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * Set 设备型号
     * @param DeviceClassCode 设备型号
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get CpuId，自定义机型时需传入 
     * @return CpuId CpuId，自定义机型时需传入
     */
    public Long getCpuId() {
        return this.CpuId;
    }

    /**
     * Set CpuId，自定义机型时需传入
     * @param CpuId CpuId，自定义机型时需传入
     */
    public void setCpuId(Long CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * Get 硬盘类型，自定义机型时需传入 
     * @return DiskType 硬盘类型，自定义机型时需传入
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 硬盘类型，自定义机型时需传入
     * @param DiskType 硬盘类型，自定义机型时需传入
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 单块硬盘大小，自定义机型时需传入 
     * @return DiskSize 单块硬盘大小，自定义机型时需传入
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 单块硬盘大小，自定义机型时需传入
     * @param DiskSize 单块硬盘大小，自定义机型时需传入
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 硬盘数量，自定义机型时需传入 
     * @return DiskNum 硬盘数量，自定义机型时需传入
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set 硬盘数量，自定义机型时需传入
     * @param DiskNum 硬盘数量，自定义机型时需传入
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get 内存总大小，自定义机型时需传入 
     * @return Mem 内存总大小，自定义机型时需传入
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存总大小，自定义机型时需传入
     * @param Mem 内存总大小，自定义机型时需传入
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 是否支持raid，自定义机型时需传入 
     * @return HaveRaidCard 是否支持raid，自定义机型时需传入
     */
    public Long getHaveRaidCard() {
        return this.HaveRaidCard;
    }

    /**
     * Set 是否支持raid，自定义机型时需传入
     * @param HaveRaidCard 是否支持raid，自定义机型时需传入
     */
    public void setHaveRaidCard(Long HaveRaidCard) {
        this.HaveRaidCard = HaveRaidCard;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CpuId", this.CpuId);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskNum", this.DiskNum);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "HaveRaidCard", this.HaveRaidCard);

    }
}

