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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateClusterRoInfo extends AbstractModel {

    /**
    * 只读实例名称
    */
    @SerializedName("RoInstanceId")
    @Expose
    private String RoInstanceId;

    /**
    * 只读实例CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 只读实例内存大小，单位：MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 只读实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 磁盘类型。 CLOUD_SSD: SSD云硬盘; CLOUD_HSSD: 增强型SSD云硬盘
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 迁移实例类型。支持值包括： "CLOUD_NATIVE_CLUSTER" - 标准型集群版实例， "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 加强型集群版实例。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 只读实例所在ro组，例：cdbrg-xxx
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
    * 实例当前告警策略id数组
    */
    @SerializedName("SrcAlarmPolicyList")
    @Expose
    private Long [] SrcAlarmPolicyList;

    /**
     * Get 只读实例名称 
     * @return RoInstanceId 只读实例名称
     */
    public String getRoInstanceId() {
        return this.RoInstanceId;
    }

    /**
     * Set 只读实例名称
     * @param RoInstanceId 只读实例名称
     */
    public void setRoInstanceId(String RoInstanceId) {
        this.RoInstanceId = RoInstanceId;
    }

    /**
     * Get 只读实例CPU核数 
     * @return Cpu 只读实例CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 只读实例CPU核数
     * @param Cpu 只读实例CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 只读实例内存大小，单位：MB 
     * @return Memory 只读实例内存大小，单位：MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 只读实例内存大小，单位：MB
     * @param Memory 只读实例内存大小，单位：MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 只读实例硬盘大小，单位：GB 
     * @return Volume 只读实例硬盘大小，单位：GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 只读实例硬盘大小，单位：GB
     * @param Volume 只读实例硬盘大小，单位：GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 磁盘类型。 CLOUD_SSD: SSD云硬盘; CLOUD_HSSD: 增强型SSD云硬盘 
     * @return DiskType 磁盘类型。 CLOUD_SSD: SSD云硬盘; CLOUD_HSSD: 增强型SSD云硬盘
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型。 CLOUD_SSD: SSD云硬盘; CLOUD_HSSD: 增强型SSD云硬盘
     * @param DiskType 磁盘类型。 CLOUD_SSD: SSD云硬盘; CLOUD_HSSD: 增强型SSD云硬盘
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

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
     * Get 迁移实例类型。支持值包括： "CLOUD_NATIVE_CLUSTER" - 标准型集群版实例， "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 加强型集群版实例。 
     * @return DeviceType 迁移实例类型。支持值包括： "CLOUD_NATIVE_CLUSTER" - 标准型集群版实例， "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 加强型集群版实例。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 迁移实例类型。支持值包括： "CLOUD_NATIVE_CLUSTER" - 标准型集群版实例， "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 加强型集群版实例。
     * @param DeviceType 迁移实例类型。支持值包括： "CLOUD_NATIVE_CLUSTER" - 标准型集群版实例， "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 加强型集群版实例。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 只读实例所在ro组，例：cdbrg-xxx 
     * @return RoGroupId 只读实例所在ro组，例：cdbrg-xxx
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set 只读实例所在ro组，例：cdbrg-xxx
     * @param RoGroupId 只读实例所在ro组，例：cdbrg-xxx
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * Get 实例当前告警策略id数组 
     * @return SrcAlarmPolicyList 实例当前告警策略id数组
     */
    public Long [] getSrcAlarmPolicyList() {
        return this.SrcAlarmPolicyList;
    }

    /**
     * Set 实例当前告警策略id数组
     * @param SrcAlarmPolicyList 实例当前告警策略id数组
     */
    public void setSrcAlarmPolicyList(Long [] SrcAlarmPolicyList) {
        this.SrcAlarmPolicyList = SrcAlarmPolicyList;
    }

    public MigrateClusterRoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateClusterRoInfo(MigrateClusterRoInfo source) {
        if (source.RoInstanceId != null) {
            this.RoInstanceId = new String(source.RoInstanceId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
        if (source.SrcAlarmPolicyList != null) {
            this.SrcAlarmPolicyList = new Long[source.SrcAlarmPolicyList.length];
            for (int i = 0; i < source.SrcAlarmPolicyList.length; i++) {
                this.SrcAlarmPolicyList[i] = new Long(source.SrcAlarmPolicyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoInstanceId", this.RoInstanceId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);
        this.setParamArraySimple(map, prefix + "SrcAlarmPolicyList.", this.SrcAlarmPolicyList);

    }
}

