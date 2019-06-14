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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskConfig  extends AbstractModel{

    /**
    * 配置是否可用。
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 最大可配置云盘大小，单位GB。
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Integer MaxDiskSize;

    /**
    * 最小可配置云盘大小，单位GB。
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Integer MinDiskSize;

    /**
    * 云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * 实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
     * 获取配置是否可用。
     * @return Available 配置是否可用。
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * 设置配置是否可用。
     * @param Available 配置是否可用。
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * 获取云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     * @return DiskType 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * 设置云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     * @param DiskType 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * 获取云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
     * @return DiskUsage 云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * 设置云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
     * @param DiskUsage 云盘类型。取值范围：<br><li>SYSTEM_DISK：表示系统盘<br><li>DATA_DISK：表示数据盘。
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * 获取付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。
     * @return DiskChargeType 付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * 设置付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。
     * @param DiskChargeType 付费模式。取值范围：<br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费。
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * 获取最大可配置云盘大小，单位GB。
     * @return MaxDiskSize 最大可配置云盘大小，单位GB。
     */
    public Integer getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * 设置最大可配置云盘大小，单位GB。
     * @param MaxDiskSize 最大可配置云盘大小，单位GB。
     */
    public void setMaxDiskSize(Integer MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * 获取最小可配置云盘大小，单位GB。
     * @return MinDiskSize 最小可配置云盘大小，单位GB。
     */
    public Integer getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * 设置最小可配置云盘大小，单位GB。
     * @param MinDiskSize 最小可配置云盘大小，单位GB。
     */
    public void setMinDiskSize(Integer MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * 获取云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
     * @return Zone 云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
     * @param Zone 云硬盘所属的[可用区](/document/product/213/15753#ZoneInfo)。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     * @return DeviceClass 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * 设置实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceClass 实例机型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * 获取实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceFamily 实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * 设置实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceFamily 实例机型系列。详见[实例类型](https://cloud.tencent.com/document/product/213/11518)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);

    }
}

