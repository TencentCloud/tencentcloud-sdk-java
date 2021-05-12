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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecInfo extends AbstractModel{

    /**
    * 实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
    */
    @SerializedName("SpecId")
    @Expose
    private Long SpecId;

    /**
    * 机型ID
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 机型中文名称
    */
    @SerializedName("MachineTypeName")
    @Expose
    private String MachineTypeName;

    /**
    * 数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version字段对应的版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 内存大小，单位GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * CPU核数
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 此规格下最小的磁盘大小，单位GB
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * 此规格下最大的磁盘大小，单位GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 此规格对应的QPS大小
    */
    @SerializedName("QPS")
    @Expose
    private Long QPS;

    /**
    * 此规格的中文描述信息
    */
    @SerializedName("SuitInfo")
    @Expose
    private String SuitInfo;

    /**
    * 此规格对应的包年包月Pid
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostPid")
    @Expose
    private Long [] PostPid;

    /**
    * 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
    */
    @SerializedName("PayModeStatus")
    @Expose
    private String PayModeStatus;

    /**
    * 产品类型，HA-高可用型(包括双机高可用，alwaysOn集群)，RO-只读副本型，SI-基础版本型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有
    */
    @SerializedName("MultiZonesStatus")
    @Expose
    private String MultiZonesStatus;

    /**
     * Get 实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例 
     * @return SpecId 实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
     */
    public Long getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
     * @param SpecId 实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
     */
    public void setSpecId(Long SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 机型ID 
     * @return MachineType 机型ID
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机型ID
     * @param MachineType 机型ID
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 机型中文名称 
     * @return MachineTypeName 机型中文名称
     */
    public String getMachineTypeName() {
        return this.MachineTypeName;
    }

    /**
     * Set 机型中文名称
     * @param MachineTypeName 机型中文名称
     */
    public void setMachineTypeName(String MachineTypeName) {
        this.MachineTypeName = MachineTypeName;
    }

    /**
     * Get 数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1） 
     * @return Version 数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     * @param Version 数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version字段对应的版本名称 
     * @return VersionName Version字段对应的版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Version字段对应的版本名称
     * @param VersionName Version字段对应的版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 内存大小，单位GB 
     * @return Memory 内存大小，单位GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位GB
     * @param Memory 内存大小，单位GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CPU核数 
     * @return CPU CPU核数
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数
     * @param CPU CPU核数
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 此规格下最小的磁盘大小，单位GB 
     * @return MinStorage 此规格下最小的磁盘大小，单位GB
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set 此规格下最小的磁盘大小，单位GB
     * @param MinStorage 此规格下最小的磁盘大小，单位GB
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get 此规格下最大的磁盘大小，单位GB 
     * @return MaxStorage 此规格下最大的磁盘大小，单位GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 此规格下最大的磁盘大小，单位GB
     * @param MaxStorage 此规格下最大的磁盘大小，单位GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 此规格对应的QPS大小 
     * @return QPS 此规格对应的QPS大小
     */
    public Long getQPS() {
        return this.QPS;
    }

    /**
     * Set 此规格对应的QPS大小
     * @param QPS 此规格对应的QPS大小
     */
    public void setQPS(Long QPS) {
        this.QPS = QPS;
    }

    /**
     * Get 此规格的中文描述信息 
     * @return SuitInfo 此规格的中文描述信息
     */
    public String getSuitInfo() {
        return this.SuitInfo;
    }

    /**
     * Set 此规格的中文描述信息
     * @param SuitInfo 此规格的中文描述信息
     */
    public void setSuitInfo(String SuitInfo) {
        this.SuitInfo = SuitInfo;
    }

    /**
     * Get 此规格对应的包年包月Pid 
     * @return Pid 此规格对应的包年包月Pid
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 此规格对应的包年包月Pid
     * @param Pid 此规格对应的包年包月Pid
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostPid 此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPostPid() {
        return this.PostPid;
    }

    /**
     * Set 此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostPid 此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostPid(Long [] PostPid) {
        this.PostPid = PostPid;
    }

    /**
     * Get 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有 
     * @return PayModeStatus 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     */
    public String getPayModeStatus() {
        return this.PayModeStatus;
    }

    /**
     * Set 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     * @param PayModeStatus 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     */
    public void setPayModeStatus(String PayModeStatus) {
        this.PayModeStatus = PayModeStatus;
    }

    /**
     * Get 产品类型，HA-高可用型(包括双机高可用，alwaysOn集群)，RO-只读副本型，SI-基础版本型 
     * @return InstanceType 产品类型，HA-高可用型(包括双机高可用，alwaysOn集群)，RO-只读副本型，SI-基础版本型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 产品类型，HA-高可用型(包括双机高可用，alwaysOn集群)，RO-只读副本型，SI-基础版本型
     * @param InstanceType 产品类型，HA-高可用型(包括双机高可用，alwaysOn集群)，RO-只读副本型，SI-基础版本型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有 
     * @return MultiZonesStatus 跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有
     */
    public String getMultiZonesStatus() {
        return this.MultiZonesStatus;
    }

    /**
     * Set 跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有
     * @param MultiZonesStatus 跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有
     */
    public void setMultiZonesStatus(String MultiZonesStatus) {
        this.MultiZonesStatus = MultiZonesStatus;
    }

    public SpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecInfo(SpecInfo source) {
        if (source.SpecId != null) {
            this.SpecId = new Long(source.SpecId);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineTypeName != null) {
            this.MachineTypeName = new String(source.MachineTypeName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.MinStorage != null) {
            this.MinStorage = new Long(source.MinStorage);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.QPS != null) {
            this.QPS = new Long(source.QPS);
        }
        if (source.SuitInfo != null) {
            this.SuitInfo = new String(source.SuitInfo);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.PostPid != null) {
            this.PostPid = new Long[source.PostPid.length];
            for (int i = 0; i < source.PostPid.length; i++) {
                this.PostPid[i] = new Long(source.PostPid[i]);
            }
        }
        if (source.PayModeStatus != null) {
            this.PayModeStatus = new String(source.PayModeStatus);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MultiZonesStatus != null) {
            this.MultiZonesStatus = new String(source.MultiZonesStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineTypeName", this.MachineTypeName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "QPS", this.QPS);
        this.setParamSimple(map, prefix + "SuitInfo", this.SuitInfo);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamArraySimple(map, prefix + "PostPid.", this.PostPid);
        this.setParamSimple(map, prefix + "PayModeStatus", this.PayModeStatus);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MultiZonesStatus", this.MultiZonesStatus);

    }
}

