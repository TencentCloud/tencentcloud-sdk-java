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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisksRequest extends AbstractModel {

    /**
    * 可用区。可通过[DescribeZones](https://cloud.tencent.com/document/product/1207/57513)返回值中的Zone获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 云硬盘大小, 单位: GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云硬盘包年包月相关参数设置。
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * 云硬盘名称。最大长度60。
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * 云硬盘个数。取值范围: [1, 30]。默认值: 1。
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 指定云硬盘备份点配额，取值范围: [0, 500]。不传时默认为不带备份点配额。
    */
    @SerializedName("DiskBackupQuota")
    @Expose
    private Long DiskBackupQuota;

    /**
    * 是否自动使用代金券。默认不使用。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * 自动挂载并初始化数据盘。
    */
    @SerializedName("AutoMountConfiguration")
    @Expose
    private AutoMountConfiguration AutoMountConfiguration;

    /**
     * Get 可用区。可通过[DescribeZones](https://cloud.tencent.com/document/product/1207/57513)返回值中的Zone获取。 
     * @return Zone 可用区。可通过[DescribeZones](https://cloud.tencent.com/document/product/1207/57513)返回值中的Zone获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。可通过[DescribeZones](https://cloud.tencent.com/document/product/1207/57513)返回值中的Zone获取。
     * @param Zone 可用区。可通过[DescribeZones](https://cloud.tencent.com/document/product/1207/57513)返回值中的Zone获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 云硬盘大小, 单位: GB。 
     * @return DiskSize 云硬盘大小, 单位: GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云硬盘大小, 单位: GB。
     * @param DiskSize 云硬盘大小, 单位: GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。 
     * @return DiskType 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。
     * @param DiskType 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云硬盘包年包月相关参数设置。 
     * @return DiskChargePrepaid 云硬盘包年包月相关参数设置。
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set 云硬盘包年包月相关参数设置。
     * @param DiskChargePrepaid 云硬盘包年包月相关参数设置。
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get 云硬盘名称。最大长度60。 
     * @return DiskName 云硬盘名称。最大长度60。
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set 云硬盘名称。最大长度60。
     * @param DiskName 云硬盘名称。最大长度60。
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get 云硬盘个数。取值范围: [1, 30]。默认值: 1。 
     * @return DiskCount 云硬盘个数。取值范围: [1, 30]。默认值: 1。
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 云硬盘个数。取值范围: [1, 30]。默认值: 1。
     * @param DiskCount 云硬盘个数。取值范围: [1, 30]。默认值: 1。
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 指定云硬盘备份点配额，取值范围: [0, 500]。不传时默认为不带备份点配额。 
     * @return DiskBackupQuota 指定云硬盘备份点配额，取值范围: [0, 500]。不传时默认为不带备份点配额。
     */
    public Long getDiskBackupQuota() {
        return this.DiskBackupQuota;
    }

    /**
     * Set 指定云硬盘备份点配额，取值范围: [0, 500]。不传时默认为不带备份点配额。
     * @param DiskBackupQuota 指定云硬盘备份点配额，取值范围: [0, 500]。不传时默认为不带备份点配额。
     */
    public void setDiskBackupQuota(Long DiskBackupQuota) {
        this.DiskBackupQuota = DiskBackupQuota;
    }

    /**
     * Get 是否自动使用代金券。默认不使用。 
     * @return AutoVoucher 是否自动使用代金券。默认不使用。
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券。默认不使用。
     * @param AutoVoucher 是否自动使用代金券。默认不使用。
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 自动挂载并初始化数据盘。 
     * @return AutoMountConfiguration 自动挂载并初始化数据盘。
     */
    public AutoMountConfiguration getAutoMountConfiguration() {
        return this.AutoMountConfiguration;
    }

    /**
     * Set 自动挂载并初始化数据盘。
     * @param AutoMountConfiguration 自动挂载并初始化数据盘。
     */
    public void setAutoMountConfiguration(AutoMountConfiguration AutoMountConfiguration) {
        this.AutoMountConfiguration = AutoMountConfiguration;
    }

    public CreateDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisksRequest(CreateDisksRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.AutoMountConfiguration != null) {
            this.AutoMountConfiguration = new AutoMountConfiguration(source.AutoMountConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamObj(map, prefix + "AutoMountConfiguration.", this.AutoMountConfiguration);

    }
}

