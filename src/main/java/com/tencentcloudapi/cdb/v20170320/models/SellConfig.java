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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SellConfig extends AbstractModel{

    /**
    * 设备类型（废弃）
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * 售卖规格描述（废弃）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例类型（废弃）
    */
    @SerializedName("CdbType")
    @Expose
    private String CdbType;

    /**
    * 内存大小，单位为MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * CPU核心数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 磁盘最小规格，单位为GB
    */
    @SerializedName("VolumeMin")
    @Expose
    private Long VolumeMin;

    /**
    * 磁盘最大规格，单位为GB
    */
    @SerializedName("VolumeMax")
    @Expose
    private Long VolumeMax;

    /**
    * 磁盘步长，单位为GB
    */
    @SerializedName("VolumeStep")
    @Expose
    private Long VolumeStep;

    /**
    * 链接数
    */
    @SerializedName("Connection")
    @Expose
    private Long Connection;

    /**
    * 每秒查询数量
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 每秒IO数量
    */
    @SerializedName("Iops")
    @Expose
    private Long Iops;

    /**
    * 应用场景描述
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 状态值，0 表示该规格对外售卖
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 标签值（废弃）
    */
    @SerializedName("Tag")
    @Expose
    private Long Tag;

    /**
    * 实例类型，可能的取值范围有：UNIVERSAL (通用型), EXCLUSIVE (独享型), BASIC (基础型)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 实例类型描述，可能的取值范围有：通用型， 独享型， 基础型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceTypeName")
    @Expose
    private String DeviceTypeName;

    /**
    * 引擎类型描述，可能的取值范围有：Innodb，RocksDB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get 设备类型（废弃） 
     * @return Device 设备类型（废弃）
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set 设备类型（废弃）
     * @param Device 设备类型（废弃）
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get 售卖规格描述（废弃） 
     * @return Type 售卖规格描述（废弃）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 售卖规格描述（废弃）
     * @param Type 售卖规格描述（废弃）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例类型（废弃） 
     * @return CdbType 实例类型（废弃）
     */
    public String getCdbType() {
        return this.CdbType;
    }

    /**
     * Set 实例类型（废弃）
     * @param CdbType 实例类型（废弃）
     */
    public void setCdbType(String CdbType) {
        this.CdbType = CdbType;
    }

    /**
     * Get 内存大小，单位为MB 
     * @return Memory 内存大小，单位为MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位为MB
     * @param Memory 内存大小，单位为MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CPU核心数 
     * @return Cpu CPU核心数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核心数
     * @param Cpu CPU核心数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 磁盘最小规格，单位为GB 
     * @return VolumeMin 磁盘最小规格，单位为GB
     */
    public Long getVolumeMin() {
        return this.VolumeMin;
    }

    /**
     * Set 磁盘最小规格，单位为GB
     * @param VolumeMin 磁盘最小规格，单位为GB
     */
    public void setVolumeMin(Long VolumeMin) {
        this.VolumeMin = VolumeMin;
    }

    /**
     * Get 磁盘最大规格，单位为GB 
     * @return VolumeMax 磁盘最大规格，单位为GB
     */
    public Long getVolumeMax() {
        return this.VolumeMax;
    }

    /**
     * Set 磁盘最大规格，单位为GB
     * @param VolumeMax 磁盘最大规格，单位为GB
     */
    public void setVolumeMax(Long VolumeMax) {
        this.VolumeMax = VolumeMax;
    }

    /**
     * Get 磁盘步长，单位为GB 
     * @return VolumeStep 磁盘步长，单位为GB
     */
    public Long getVolumeStep() {
        return this.VolumeStep;
    }

    /**
     * Set 磁盘步长，单位为GB
     * @param VolumeStep 磁盘步长，单位为GB
     */
    public void setVolumeStep(Long VolumeStep) {
        this.VolumeStep = VolumeStep;
    }

    /**
     * Get 链接数 
     * @return Connection 链接数
     */
    public Long getConnection() {
        return this.Connection;
    }

    /**
     * Set 链接数
     * @param Connection 链接数
     */
    public void setConnection(Long Connection) {
        this.Connection = Connection;
    }

    /**
     * Get 每秒查询数量 
     * @return Qps 每秒查询数量
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 每秒查询数量
     * @param Qps 每秒查询数量
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 每秒IO数量 
     * @return Iops 每秒IO数量
     */
    public Long getIops() {
        return this.Iops;
    }

    /**
     * Set 每秒IO数量
     * @param Iops 每秒IO数量
     */
    public void setIops(Long Iops) {
        this.Iops = Iops;
    }

    /**
     * Get 应用场景描述 
     * @return Info 应用场景描述
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 应用场景描述
     * @param Info 应用场景描述
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 状态值，0 表示该规格对外售卖 
     * @return Status 状态值，0 表示该规格对外售卖
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值，0 表示该规格对外售卖
     * @param Status 状态值，0 表示该规格对外售卖
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 标签值（废弃） 
     * @return Tag 标签值（废弃）
     */
    public Long getTag() {
        return this.Tag;
    }

    /**
     * Set 标签值（废弃）
     * @param Tag 标签值（废弃）
     */
    public void setTag(Long Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 实例类型，可能的取值范围有：UNIVERSAL (通用型), EXCLUSIVE (独享型), BASIC (基础型)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceType 实例类型，可能的取值范围有：UNIVERSAL (通用型), EXCLUSIVE (独享型), BASIC (基础型)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 实例类型，可能的取值范围有：UNIVERSAL (通用型), EXCLUSIVE (独享型), BASIC (基础型)
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceType 实例类型，可能的取值范围有：UNIVERSAL (通用型), EXCLUSIVE (独享型), BASIC (基础型)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 实例类型描述，可能的取值范围有：通用型， 独享型， 基础型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceTypeName 实例类型描述，可能的取值范围有：通用型， 独享型， 基础型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceTypeName() {
        return this.DeviceTypeName;
    }

    /**
     * Set 实例类型描述，可能的取值范围有：通用型， 独享型， 基础型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceTypeName 实例类型描述，可能的取值范围有：通用型， 独享型， 基础型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceTypeName(String DeviceTypeName) {
        this.DeviceTypeName = DeviceTypeName;
    }

    /**
     * Get 引擎类型描述，可能的取值范围有：Innodb，RocksDB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineType 引擎类型描述，可能的取值范围有：Innodb，RocksDB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎类型描述，可能的取值范围有：Innodb，RocksDB
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineType 引擎类型描述，可能的取值范围有：Innodb，RocksDB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public SellConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SellConfig(SellConfig source) {
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CdbType != null) {
            this.CdbType = new String(source.CdbType);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.VolumeMin != null) {
            this.VolumeMin = new Long(source.VolumeMin);
        }
        if (source.VolumeMax != null) {
            this.VolumeMax = new Long(source.VolumeMax);
        }
        if (source.VolumeStep != null) {
            this.VolumeStep = new Long(source.VolumeStep);
        }
        if (source.Connection != null) {
            this.Connection = new Long(source.Connection);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Iops != null) {
            this.Iops = new Long(source.Iops);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tag != null) {
            this.Tag = new Long(source.Tag);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.DeviceTypeName != null) {
            this.DeviceTypeName = new String(source.DeviceTypeName);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CdbType", this.CdbType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "VolumeMin", this.VolumeMin);
        this.setParamSimple(map, prefix + "VolumeMax", this.VolumeMax);
        this.setParamSimple(map, prefix + "VolumeStep", this.VolumeStep);
        this.setParamSimple(map, prefix + "Connection", this.Connection);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Iops", this.Iops);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "DeviceTypeName", this.DeviceTypeName);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

