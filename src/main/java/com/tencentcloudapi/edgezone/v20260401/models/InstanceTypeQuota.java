/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeQuota extends AbstractModel {

    /**
    * 可用区代码。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 机型规格。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 机型家族。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 机型族名称
    */
    @SerializedName("InstanceFamilyName")
    @Expose
    private String InstanceFamilyName;

    /**
    * CPU核数。
    */
    @SerializedName("CpuCores")
    @Expose
    private Long CpuCores;

    /**
    * CPU类型。
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * 内存大小（GB）。
    */
    @SerializedName("MemoryGb")
    @Expose
    private Long MemoryGb;

    /**
    * 系统盘类型。
    */
    @SerializedName("SystemDiskType")
    @Expose
    private String SystemDiskType;

    /**
    * 系统盘大小（GB）。
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * 系统盘数量。
    */
    @SerializedName("SystemDiskCount")
    @Expose
    private Long SystemDiskCount;

    /**
    * 数据盘类型。
    */
    @SerializedName("DataDiskType")
    @Expose
    private String DataDiskType;

    /**
    * 数据盘大小（GB）。
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

    /**
    * 数据盘数量。
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Long DataDiskCount;

    /**
    * 第二组数据盘类型
    */
    @SerializedName("SecondaryDataDiskType")
    @Expose
    private String SecondaryDataDiskType;

    /**
    * 第二组数据盘大小(GB)
    */
    @SerializedName("SecondaryDataDiskSize")
    @Expose
    private Long SecondaryDataDiskSize;

    /**
    * 第二组数据盘数量
    */
    @SerializedName("SecondaryDataDiskCount")
    @Expose
    private Long SecondaryDataDiskCount;

    /**
    * 磁盘描述字符串（向后兼容）。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 网络接口类型。
    */
    @SerializedName("NetworkInterfaceType")
    @Expose
    private String NetworkInterfaceType;

    /**
    * GPU类型，无GPU时为空字符串。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * 配额数量
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
     * Get 可用区代码。 
     * @return Zone 可用区代码。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区代码。
     * @param Zone 可用区代码。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 机型规格。 
     * @return InstanceType 机型规格。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机型规格。
     * @param InstanceType 机型规格。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 机型家族。 
     * @return InstanceFamily 机型家族。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 机型家族。
     * @param InstanceFamily 机型家族。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 机型族名称 
     * @return InstanceFamilyName 机型族名称
     */
    public String getInstanceFamilyName() {
        return this.InstanceFamilyName;
    }

    /**
     * Set 机型族名称
     * @param InstanceFamilyName 机型族名称
     */
    public void setInstanceFamilyName(String InstanceFamilyName) {
        this.InstanceFamilyName = InstanceFamilyName;
    }

    /**
     * Get CPU核数。 
     * @return CpuCores CPU核数。
     */
    public Long getCpuCores() {
        return this.CpuCores;
    }

    /**
     * Set CPU核数。
     * @param CpuCores CPU核数。
     */
    public void setCpuCores(Long CpuCores) {
        this.CpuCores = CpuCores;
    }

    /**
     * Get CPU类型。 
     * @return CpuType CPU类型。
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set CPU类型。
     * @param CpuType CPU类型。
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get 内存大小（GB）。 
     * @return MemoryGb 内存大小（GB）。
     */
    public Long getMemoryGb() {
        return this.MemoryGb;
    }

    /**
     * Set 内存大小（GB）。
     * @param MemoryGb 内存大小（GB）。
     */
    public void setMemoryGb(Long MemoryGb) {
        this.MemoryGb = MemoryGb;
    }

    /**
     * Get 系统盘类型。 
     * @return SystemDiskType 系统盘类型。
     */
    public String getSystemDiskType() {
        return this.SystemDiskType;
    }

    /**
     * Set 系统盘类型。
     * @param SystemDiskType 系统盘类型。
     */
    public void setSystemDiskType(String SystemDiskType) {
        this.SystemDiskType = SystemDiskType;
    }

    /**
     * Get 系统盘大小（GB）。 
     * @return SystemDiskSize 系统盘大小（GB）。
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set 系统盘大小（GB）。
     * @param SystemDiskSize 系统盘大小（GB）。
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get 系统盘数量。 
     * @return SystemDiskCount 系统盘数量。
     */
    public Long getSystemDiskCount() {
        return this.SystemDiskCount;
    }

    /**
     * Set 系统盘数量。
     * @param SystemDiskCount 系统盘数量。
     */
    public void setSystemDiskCount(Long SystemDiskCount) {
        this.SystemDiskCount = SystemDiskCount;
    }

    /**
     * Get 数据盘类型。 
     * @return DataDiskType 数据盘类型。
     */
    public String getDataDiskType() {
        return this.DataDiskType;
    }

    /**
     * Set 数据盘类型。
     * @param DataDiskType 数据盘类型。
     */
    public void setDataDiskType(String DataDiskType) {
        this.DataDiskType = DataDiskType;
    }

    /**
     * Get 数据盘大小（GB）。 
     * @return DataDiskSize 数据盘大小（GB）。
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set 数据盘大小（GB）。
     * @param DataDiskSize 数据盘大小（GB）。
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get 数据盘数量。 
     * @return DataDiskCount 数据盘数量。
     */
    public Long getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * Set 数据盘数量。
     * @param DataDiskCount 数据盘数量。
     */
    public void setDataDiskCount(Long DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
    }

    /**
     * Get 第二组数据盘类型 
     * @return SecondaryDataDiskType 第二组数据盘类型
     */
    public String getSecondaryDataDiskType() {
        return this.SecondaryDataDiskType;
    }

    /**
     * Set 第二组数据盘类型
     * @param SecondaryDataDiskType 第二组数据盘类型
     */
    public void setSecondaryDataDiskType(String SecondaryDataDiskType) {
        this.SecondaryDataDiskType = SecondaryDataDiskType;
    }

    /**
     * Get 第二组数据盘大小(GB) 
     * @return SecondaryDataDiskSize 第二组数据盘大小(GB)
     */
    public Long getSecondaryDataDiskSize() {
        return this.SecondaryDataDiskSize;
    }

    /**
     * Set 第二组数据盘大小(GB)
     * @param SecondaryDataDiskSize 第二组数据盘大小(GB)
     */
    public void setSecondaryDataDiskSize(Long SecondaryDataDiskSize) {
        this.SecondaryDataDiskSize = SecondaryDataDiskSize;
    }

    /**
     * Get 第二组数据盘数量 
     * @return SecondaryDataDiskCount 第二组数据盘数量
     */
    public Long getSecondaryDataDiskCount() {
        return this.SecondaryDataDiskCount;
    }

    /**
     * Set 第二组数据盘数量
     * @param SecondaryDataDiskCount 第二组数据盘数量
     */
    public void setSecondaryDataDiskCount(Long SecondaryDataDiskCount) {
        this.SecondaryDataDiskCount = SecondaryDataDiskCount;
    }

    /**
     * Get 磁盘描述字符串（向后兼容）。 
     * @return DiskType 磁盘描述字符串（向后兼容）。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘描述字符串（向后兼容）。
     * @param DiskType 磁盘描述字符串（向后兼容）。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 网络接口类型。 
     * @return NetworkInterfaceType 网络接口类型。
     */
    public String getNetworkInterfaceType() {
        return this.NetworkInterfaceType;
    }

    /**
     * Set 网络接口类型。
     * @param NetworkInterfaceType 网络接口类型。
     */
    public void setNetworkInterfaceType(String NetworkInterfaceType) {
        this.NetworkInterfaceType = NetworkInterfaceType;
    }

    /**
     * Get GPU类型，无GPU时为空字符串。 
     * @return GpuType GPU类型，无GPU时为空字符串。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU类型，无GPU时为空字符串。
     * @param GpuType GPU类型，无GPU时为空字符串。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get 配额数量 
     * @return Quota 配额数量
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set 配额数量
     * @param Quota 配额数量
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    public InstanceTypeQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTypeQuota(InstanceTypeQuota source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.InstanceFamilyName != null) {
            this.InstanceFamilyName = new String(source.InstanceFamilyName);
        }
        if (source.CpuCores != null) {
            this.CpuCores = new Long(source.CpuCores);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.MemoryGb != null) {
            this.MemoryGb = new Long(source.MemoryGb);
        }
        if (source.SystemDiskType != null) {
            this.SystemDiskType = new String(source.SystemDiskType);
        }
        if (source.SystemDiskSize != null) {
            this.SystemDiskSize = new Long(source.SystemDiskSize);
        }
        if (source.SystemDiskCount != null) {
            this.SystemDiskCount = new Long(source.SystemDiskCount);
        }
        if (source.DataDiskType != null) {
            this.DataDiskType = new String(source.DataDiskType);
        }
        if (source.DataDiskSize != null) {
            this.DataDiskSize = new Long(source.DataDiskSize);
        }
        if (source.DataDiskCount != null) {
            this.DataDiskCount = new Long(source.DataDiskCount);
        }
        if (source.SecondaryDataDiskType != null) {
            this.SecondaryDataDiskType = new String(source.SecondaryDataDiskType);
        }
        if (source.SecondaryDataDiskSize != null) {
            this.SecondaryDataDiskSize = new Long(source.SecondaryDataDiskSize);
        }
        if (source.SecondaryDataDiskCount != null) {
            this.SecondaryDataDiskCount = new Long(source.SecondaryDataDiskCount);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.NetworkInterfaceType != null) {
            this.NetworkInterfaceType = new String(source.NetworkInterfaceType);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "InstanceFamilyName", this.InstanceFamilyName);
        this.setParamSimple(map, prefix + "CpuCores", this.CpuCores);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "MemoryGb", this.MemoryGb);
        this.setParamSimple(map, prefix + "SystemDiskType", this.SystemDiskType);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "SystemDiskCount", this.SystemDiskCount);
        this.setParamSimple(map, prefix + "DataDiskType", this.DataDiskType);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamSimple(map, prefix + "DataDiskCount", this.DataDiskCount);
        this.setParamSimple(map, prefix + "SecondaryDataDiskType", this.SecondaryDataDiskType);
        this.setParamSimple(map, prefix + "SecondaryDataDiskSize", this.SecondaryDataDiskSize);
        this.setParamSimple(map, prefix + "SecondaryDataDiskCount", this.SecondaryDataDiskCount);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "NetworkInterfaceType", this.NetworkInterfaceType);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

