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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskConfig extends AbstractModel {

    /**
    * 配置是否可用。
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。</li>
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 云盘介质类型。取值范围：<br>
CLOUD_BASIC：表示普通云硬盘<br>
CLOUD_PREMIUM：表示高性能云硬盘<br>
CLOUD_BSSD：表示通用型SSD云硬盘<br>
CLOUD_SSD：表示SSD云硬盘<br>
CLOUD_HSSD：表示增强型SSD云硬盘<br>
CLOUD_TSSD：表示极速型SSD云硬盘。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云盘大小变化的最小步长，单位GiB。
    */
    @SerializedName("StepSize")
    @Expose
    private Long StepSize;

    /**
    * 额外的性能区间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraPerformanceRange")
    @Expose
    private Long [] ExtraPerformanceRange;

    /**
    * 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * 云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘</li><br><li>DATA_DISK：表示数据盘。</li>
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 最小可配置云盘大小，单位GiB。
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * 最大可配置云盘大小，单位GiB。
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * 描述预付费或后付费云盘的价格。
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
     * Get 配置是否可用。 
     * @return Available 配置是否可用。
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set 配置是否可用。
     * @param Available 配置是否可用。
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get 付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。</li> 
     * @return DiskChargeType 付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。</li>
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set 付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。</li>
     * @param DiskChargeType 付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。</li>
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get 云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。 
     * @return Zone 云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
     * @param Zone 云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceFamily 实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceFamily 实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 云盘介质类型。取值范围：<br>
CLOUD_BASIC：表示普通云硬盘<br>
CLOUD_PREMIUM：表示高性能云硬盘<br>
CLOUD_BSSD：表示通用型SSD云硬盘<br>
CLOUD_SSD：表示SSD云硬盘<br>
CLOUD_HSSD：表示增强型SSD云硬盘<br>
CLOUD_TSSD：表示极速型SSD云硬盘。 
     * @return DiskType 云盘介质类型。取值范围：<br>
CLOUD_BASIC：表示普通云硬盘<br>
CLOUD_PREMIUM：表示高性能云硬盘<br>
CLOUD_BSSD：表示通用型SSD云硬盘<br>
CLOUD_SSD：表示SSD云硬盘<br>
CLOUD_HSSD：表示增强型SSD云硬盘<br>
CLOUD_TSSD：表示极速型SSD云硬盘。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云盘介质类型。取值范围：<br>
CLOUD_BASIC：表示普通云硬盘<br>
CLOUD_PREMIUM：表示高性能云硬盘<br>
CLOUD_BSSD：表示通用型SSD云硬盘<br>
CLOUD_SSD：表示SSD云硬盘<br>
CLOUD_HSSD：表示增强型SSD云硬盘<br>
CLOUD_TSSD：表示极速型SSD云硬盘。
     * @param DiskType 云盘介质类型。取值范围：<br>
CLOUD_BASIC：表示普通云硬盘<br>
CLOUD_PREMIUM：表示高性能云硬盘<br>
CLOUD_BSSD：表示通用型SSD云硬盘<br>
CLOUD_SSD：表示SSD云硬盘<br>
CLOUD_HSSD：表示增强型SSD云硬盘<br>
CLOUD_TSSD：表示极速型SSD云硬盘。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云盘大小变化的最小步长，单位GiB。 
     * @return StepSize 云盘大小变化的最小步长，单位GiB。
     */
    public Long getStepSize() {
        return this.StepSize;
    }

    /**
     * Set 云盘大小变化的最小步长，单位GiB。
     * @param StepSize 云盘大小变化的最小步长，单位GiB。
     */
    public void setStepSize(Long StepSize) {
        this.StepSize = StepSize;
    }

    /**
     * Get 额外的性能区间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraPerformanceRange 额外的性能区间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getExtraPerformanceRange() {
        return this.ExtraPerformanceRange;
    }

    /**
     * Set 额外的性能区间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraPerformanceRange 额外的性能区间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraPerformanceRange(Long [] ExtraPerformanceRange) {
        this.ExtraPerformanceRange = ExtraPerformanceRange;
    }

    /**
     * Get 实例机型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceClass 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceClass 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get 云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘</li><br><li>DATA_DISK：表示数据盘。</li> 
     * @return DiskUsage 云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘</li><br><li>DATA_DISK：表示数据盘。</li>
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘</li><br><li>DATA_DISK：表示数据盘。</li>
     * @param DiskUsage 云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘</li><br><li>DATA_DISK：表示数据盘。</li>
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 最小可配置云盘大小，单位GiB。 
     * @return MinDiskSize 最小可配置云盘大小，单位GiB。
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set 最小可配置云盘大小，单位GiB。
     * @param MinDiskSize 最小可配置云盘大小，单位GiB。
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get 最大可配置云盘大小，单位GiB。 
     * @return MaxDiskSize 最大可配置云盘大小，单位GiB。
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set 最大可配置云盘大小，单位GiB。
     * @param MaxDiskSize 最大可配置云盘大小，单位GiB。
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get 描述预付费或后付费云盘的价格。 
     * @return Price 描述预付费或后付费云盘的价格。
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set 描述预付费或后付费云盘的价格。
     * @param Price 描述预付费或后付费云盘的价格。
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    public DiskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskConfig(DiskConfig source) {
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.StepSize != null) {
            this.StepSize = new Long(source.StepSize);
        }
        if (source.ExtraPerformanceRange != null) {
            this.ExtraPerformanceRange = new Long[source.ExtraPerformanceRange.length];
            for (int i = 0; i < source.ExtraPerformanceRange.length; i++) {
                this.ExtraPerformanceRange[i] = new Long(source.ExtraPerformanceRange[i]);
            }
        }
        if (source.DeviceClass != null) {
            this.DeviceClass = new String(source.DeviceClass);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.MinDiskSize != null) {
            this.MinDiskSize = new Long(source.MinDiskSize);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.Price != null) {
            this.Price = new Price(source.Price);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "StepSize", this.StepSize);
        this.setParamArraySimple(map, prefix + "ExtraPerformanceRange.", this.ExtraPerformanceRange);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamObj(map, prefix + "Price.", this.Price);

    }
}

