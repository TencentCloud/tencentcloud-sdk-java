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
    * CPU型号ID，查询自定义机型时必填
    */
    @SerializedName("CpuId")
    @Expose
    private Long CpuId;

    /**
    * 内存大小，单位为G，查询自定义机型时必填
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 是否有RAID卡，取值：1(有) 0(无)，查询自定义机型时必填
    */
    @SerializedName("ContainRaidCard")
    @Expose
    private Long ContainRaidCard;

    /**
    * 系统盘类型ID，查询自定义机型时必填
    */
    @SerializedName("SystemDiskTypeId")
    @Expose
    private Long SystemDiskTypeId;

    /**
    * 系统盘数量，查询自定义机型时必填
    */
    @SerializedName("SystemDiskCount")
    @Expose
    private Long SystemDiskCount;

    /**
    * 数据盘类型ID，查询自定义机型时可填
    */
    @SerializedName("DataDiskTypeId")
    @Expose
    private Long DataDiskTypeId;

    /**
    * 数据盘数量，查询自定义机型时可填
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Long DataDiskCount;

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
     * Get CPU型号ID，查询自定义机型时必填 
     * @return CpuId CPU型号ID，查询自定义机型时必填
     */
    public Long getCpuId() {
        return this.CpuId;
    }

    /**
     * Set CPU型号ID，查询自定义机型时必填
     * @param CpuId CPU型号ID，查询自定义机型时必填
     */
    public void setCpuId(Long CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * Get 内存大小，单位为G，查询自定义机型时必填 
     * @return MemSize 内存大小，单位为G，查询自定义机型时必填
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存大小，单位为G，查询自定义机型时必填
     * @param MemSize 内存大小，单位为G，查询自定义机型时必填
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 是否有RAID卡，取值：1(有) 0(无)，查询自定义机型时必填 
     * @return ContainRaidCard 是否有RAID卡，取值：1(有) 0(无)，查询自定义机型时必填
     */
    public Long getContainRaidCard() {
        return this.ContainRaidCard;
    }

    /**
     * Set 是否有RAID卡，取值：1(有) 0(无)，查询自定义机型时必填
     * @param ContainRaidCard 是否有RAID卡，取值：1(有) 0(无)，查询自定义机型时必填
     */
    public void setContainRaidCard(Long ContainRaidCard) {
        this.ContainRaidCard = ContainRaidCard;
    }

    /**
     * Get 系统盘类型ID，查询自定义机型时必填 
     * @return SystemDiskTypeId 系统盘类型ID，查询自定义机型时必填
     */
    public Long getSystemDiskTypeId() {
        return this.SystemDiskTypeId;
    }

    /**
     * Set 系统盘类型ID，查询自定义机型时必填
     * @param SystemDiskTypeId 系统盘类型ID，查询自定义机型时必填
     */
    public void setSystemDiskTypeId(Long SystemDiskTypeId) {
        this.SystemDiskTypeId = SystemDiskTypeId;
    }

    /**
     * Get 系统盘数量，查询自定义机型时必填 
     * @return SystemDiskCount 系统盘数量，查询自定义机型时必填
     */
    public Long getSystemDiskCount() {
        return this.SystemDiskCount;
    }

    /**
     * Set 系统盘数量，查询自定义机型时必填
     * @param SystemDiskCount 系统盘数量，查询自定义机型时必填
     */
    public void setSystemDiskCount(Long SystemDiskCount) {
        this.SystemDiskCount = SystemDiskCount;
    }

    /**
     * Get 数据盘类型ID，查询自定义机型时可填 
     * @return DataDiskTypeId 数据盘类型ID，查询自定义机型时可填
     */
    public Long getDataDiskTypeId() {
        return this.DataDiskTypeId;
    }

    /**
     * Set 数据盘类型ID，查询自定义机型时可填
     * @param DataDiskTypeId 数据盘类型ID，查询自定义机型时可填
     */
    public void setDataDiskTypeId(Long DataDiskTypeId) {
        this.DataDiskTypeId = DataDiskTypeId;
    }

    /**
     * Get 数据盘数量，查询自定义机型时可填 
     * @return DataDiskCount 数据盘数量，查询自定义机型时可填
     */
    public Long getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * Set 数据盘数量，查询自定义机型时可填
     * @param DataDiskCount 数据盘数量，查询自定义机型时可填
     */
    public void setDataDiskCount(Long DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
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
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "ContainRaidCard", this.ContainRaidCard);
        this.setParamSimple(map, prefix + "SystemDiskTypeId", this.SystemDiskTypeId);
        this.setParamSimple(map, prefix + "SystemDiskCount", this.SystemDiskCount);
        this.setParamSimple(map, prefix + "DataDiskTypeId", this.DataDiskTypeId);
        this.setParamSimple(map, prefix + "DataDiskCount", this.DataDiskCount);

    }
}

