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

public class DescribeDeviceClassPartitionRequest extends AbstractModel{

    /**
    * 设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * 需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时其余参数失效。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CPU型号ID，查询自定义机型时需要传入
    */
    @SerializedName("CpuId")
    @Expose
    private Long CpuId;

    /**
    * 内存大小，单位为G，查询自定义机型时需要传入
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 是否有RAID卡，取值：1(有) 0(无)。查询自定义机型时需要传入
    */
    @SerializedName("ContainRaidCard")
    @Expose
    private Long ContainRaidCard;

    /**
    * 系统盘类型ID，查询自定义机型时需要传入
    */
    @SerializedName("SystemDiskTypeId")
    @Expose
    private Long SystemDiskTypeId;

    /**
    * 系统盘数量，查询自定义机型时需要传入
    */
    @SerializedName("SystemDiskCount")
    @Expose
    private Long SystemDiskCount;

    /**
    * 数据盘类型ID，查询自定义机型时可传入
    */
    @SerializedName("DataDiskTypeId")
    @Expose
    private Long DataDiskTypeId;

    /**
    * 数据盘数量，查询自定义机型时可传入
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Long DataDiskCount;

    /**
     * Get 设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。 
     * @return DeviceClassCode 设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * Set 设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     * @param DeviceClassCode 设备类型代号。代号通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询。标准机型需要传入此参数。虽是可选参数，但DeviceClassCode和InstanceId参数，必须要填写一个。
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * Get 需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时其余参数失效。 
     * @return InstanceId 需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时其余参数失效。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时其余参数失效。
     * @param InstanceId 需要查询自定义机型RAID信息时，传入自定义机型实例ID。InstanceId存在时其余参数失效。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CPU型号ID，查询自定义机型时需要传入 
     * @return CpuId CPU型号ID，查询自定义机型时需要传入
     */
    public Long getCpuId() {
        return this.CpuId;
    }

    /**
     * Set CPU型号ID，查询自定义机型时需要传入
     * @param CpuId CPU型号ID，查询自定义机型时需要传入
     */
    public void setCpuId(Long CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * Get 内存大小，单位为G，查询自定义机型时需要传入 
     * @return MemSize 内存大小，单位为G，查询自定义机型时需要传入
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存大小，单位为G，查询自定义机型时需要传入
     * @param MemSize 内存大小，单位为G，查询自定义机型时需要传入
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 是否有RAID卡，取值：1(有) 0(无)。查询自定义机型时需要传入 
     * @return ContainRaidCard 是否有RAID卡，取值：1(有) 0(无)。查询自定义机型时需要传入
     */
    public Long getContainRaidCard() {
        return this.ContainRaidCard;
    }

    /**
     * Set 是否有RAID卡，取值：1(有) 0(无)。查询自定义机型时需要传入
     * @param ContainRaidCard 是否有RAID卡，取值：1(有) 0(无)。查询自定义机型时需要传入
     */
    public void setContainRaidCard(Long ContainRaidCard) {
        this.ContainRaidCard = ContainRaidCard;
    }

    /**
     * Get 系统盘类型ID，查询自定义机型时需要传入 
     * @return SystemDiskTypeId 系统盘类型ID，查询自定义机型时需要传入
     */
    public Long getSystemDiskTypeId() {
        return this.SystemDiskTypeId;
    }

    /**
     * Set 系统盘类型ID，查询自定义机型时需要传入
     * @param SystemDiskTypeId 系统盘类型ID，查询自定义机型时需要传入
     */
    public void setSystemDiskTypeId(Long SystemDiskTypeId) {
        this.SystemDiskTypeId = SystemDiskTypeId;
    }

    /**
     * Get 系统盘数量，查询自定义机型时需要传入 
     * @return SystemDiskCount 系统盘数量，查询自定义机型时需要传入
     */
    public Long getSystemDiskCount() {
        return this.SystemDiskCount;
    }

    /**
     * Set 系统盘数量，查询自定义机型时需要传入
     * @param SystemDiskCount 系统盘数量，查询自定义机型时需要传入
     */
    public void setSystemDiskCount(Long SystemDiskCount) {
        this.SystemDiskCount = SystemDiskCount;
    }

    /**
     * Get 数据盘类型ID，查询自定义机型时可传入 
     * @return DataDiskTypeId 数据盘类型ID，查询自定义机型时可传入
     */
    public Long getDataDiskTypeId() {
        return this.DataDiskTypeId;
    }

    /**
     * Set 数据盘类型ID，查询自定义机型时可传入
     * @param DataDiskTypeId 数据盘类型ID，查询自定义机型时可传入
     */
    public void setDataDiskTypeId(Long DataDiskTypeId) {
        this.DataDiskTypeId = DataDiskTypeId;
    }

    /**
     * Get 数据盘数量，查询自定义机型时可传入 
     * @return DataDiskCount 数据盘数量，查询自定义机型时可传入
     */
    public Long getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * Set 数据盘数量，查询自定义机型时可传入
     * @param DataDiskCount 数据盘数量，查询自定义机型时可传入
     */
    public void setDataDiskCount(Long DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CpuId", this.CpuId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "ContainRaidCard", this.ContainRaidCard);
        this.setParamSimple(map, prefix + "SystemDiskTypeId", this.SystemDiskTypeId);
        this.setParamSimple(map, prefix + "SystemDiskCount", this.SystemDiskCount);
        this.setParamSimple(map, prefix + "DataDiskTypeId", this.DataDiskTypeId);
        this.setParamSimple(map, prefix + "DataDiskCount", this.DataDiskCount);

    }
}

