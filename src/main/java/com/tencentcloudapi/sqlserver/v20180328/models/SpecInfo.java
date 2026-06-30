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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecInfo extends AbstractModel {

    /**
    * <p>实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例</p>
    */
    @SerializedName("SpecId")
    @Expose
    private Long SpecId;

    /**
    * <p>机型ID</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>机型中文名称</p>
    */
    @SerializedName("MachineTypeName")
    @Expose
    private String MachineTypeName;

    /**
    * <p>数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Version字段对应的版本名称</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>内存大小，单位GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>CPU核数</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>此规格下最小的磁盘大小，单位GB</p>
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * <p>此规格下最大的磁盘大小，单位GB</p>
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * <p>此规格对应的QPS大小</p>
    */
    @SerializedName("QPS")
    @Expose
    private Long QPS;

    /**
    * <p>此规格的中文描述信息</p>
    */
    @SerializedName("SuitInfo")
    @Expose
    private String SuitInfo;

    /**
    * <p>此规格对应的包年包月Pid</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>此规格对应的按量计费Pid列表</p>
    */
    @SerializedName("PostPid")
    @Expose
    private Long [] PostPid;

    /**
    * <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p>
    */
    @SerializedName("PayModeStatus")
    @Expose
    private String PayModeStatus;

    /**
    * <p>购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点<br>示例值：HA</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p>
    */
    @SerializedName("MultiZonesStatus")
    @Expose
    private String MultiZonesStatus;

    /**
    * <p>最小磁盘容量时的基准</p><p>单位：IOPS</p>
    */
    @SerializedName("MinBaselineIOPS")
    @Expose
    private Long MinBaselineIOPS;

    /**
    * <p>最大磁盘容量时的基准</p><p>单位：IOPS</p>
    */
    @SerializedName("MaxBaselineIOPS")
    @Expose
    private Long MaxBaselineIOPS;

    /**
    * <p>最小磁盘容量时的基准吞吐量</p><p>单位：MB/s</p>
    */
    @SerializedName("MinBaselineThroughput")
    @Expose
    private Long MinBaselineThroughput;

    /**
    * <p>最大磁盘容量时的基准吞吐量</p><p>单位：MB/s</p>
    */
    @SerializedName("MaxBaselineThroughput")
    @Expose
    private Long MaxBaselineThroughput;

    /**
    * <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul>
    */
    @SerializedName("ExtraIOSupported")
    @Expose
    private Boolean ExtraIOSupported;

    /**
    * <p>额外 IO 最大吞吐量</p><p>单位：MB/s</p>
    */
    @SerializedName("MaxExtraThroughput")
    @Expose
    private Long MaxExtraThroughput;

    /**
    * <p>支持额外 IO 的最小磁盘容量</p><p>单位： GB</p><p>默认值：460</p>
    */
    @SerializedName("MinDiskSizeForExtraIO")
    @Expose
    private Long MinDiskSizeForExtraIO;

    /**
     * Get <p>实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例</p> 
     * @return SpecId <p>实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例</p>
     */
    public Long getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例</p>
     * @param SpecId <p>实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例</p>
     */
    public void setSpecId(Long SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>机型ID</p> 
     * @return MachineType <p>机型ID</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>机型ID</p>
     * @param MachineType <p>机型ID</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>机型中文名称</p> 
     * @return MachineTypeName <p>机型中文名称</p>
     */
    public String getMachineTypeName() {
        return this.MachineTypeName;
    }

    /**
     * Set <p>机型中文名称</p>
     * @param MachineTypeName <p>机型中文名称</p>
     */
    public void setMachineTypeName(String MachineTypeName) {
        this.MachineTypeName = MachineTypeName;
    }

    /**
     * Get <p>数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）</p> 
     * @return Version <p>数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）</p>
     * @param Version <p>数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Version字段对应的版本名称</p> 
     * @return VersionName <p>Version字段对应的版本名称</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>Version字段对应的版本名称</p>
     * @param VersionName <p>Version字段对应的版本名称</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>内存大小，单位GB</p> 
     * @return Memory <p>内存大小，单位GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小，单位GB</p>
     * @param Memory <p>内存大小，单位GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>CPU核数</p> 
     * @return CPU <p>CPU核数</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>CPU核数</p>
     * @param CPU <p>CPU核数</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>此规格下最小的磁盘大小，单位GB</p> 
     * @return MinStorage <p>此规格下最小的磁盘大小，单位GB</p>
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set <p>此规格下最小的磁盘大小，单位GB</p>
     * @param MinStorage <p>此规格下最小的磁盘大小，单位GB</p>
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get <p>此规格下最大的磁盘大小，单位GB</p> 
     * @return MaxStorage <p>此规格下最大的磁盘大小，单位GB</p>
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set <p>此规格下最大的磁盘大小，单位GB</p>
     * @param MaxStorage <p>此规格下最大的磁盘大小，单位GB</p>
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get <p>此规格对应的QPS大小</p> 
     * @return QPS <p>此规格对应的QPS大小</p>
     */
    public Long getQPS() {
        return this.QPS;
    }

    /**
     * Set <p>此规格对应的QPS大小</p>
     * @param QPS <p>此规格对应的QPS大小</p>
     */
    public void setQPS(Long QPS) {
        this.QPS = QPS;
    }

    /**
     * Get <p>此规格的中文描述信息</p> 
     * @return SuitInfo <p>此规格的中文描述信息</p>
     */
    public String getSuitInfo() {
        return this.SuitInfo;
    }

    /**
     * Set <p>此规格的中文描述信息</p>
     * @param SuitInfo <p>此规格的中文描述信息</p>
     */
    public void setSuitInfo(String SuitInfo) {
        this.SuitInfo = SuitInfo;
    }

    /**
     * Get <p>此规格对应的包年包月Pid</p> 
     * @return Pid <p>此规格对应的包年包月Pid</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>此规格对应的包年包月Pid</p>
     * @param Pid <p>此规格对应的包年包月Pid</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>此规格对应的按量计费Pid列表</p> 
     * @return PostPid <p>此规格对应的按量计费Pid列表</p>
     */
    public Long [] getPostPid() {
        return this.PostPid;
    }

    /**
     * Set <p>此规格对应的按量计费Pid列表</p>
     * @param PostPid <p>此规格对应的按量计费Pid列表</p>
     */
    public void setPostPid(Long [] PostPid) {
        this.PostPid = PostPid;
    }

    /**
     * Get <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p> 
     * @return PayModeStatus <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p>
     */
    public String getPayModeStatus() {
        return this.PayModeStatus;
    }

    /**
     * Set <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p>
     * @param PayModeStatus <p>此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有</p>
     */
    public void setPayModeStatus(String PayModeStatus) {
        this.PayModeStatus = PayModeStatus;
    }

    /**
     * Get <p>购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点<br>示例值：HA</p> 
     * @return InstanceType <p>购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点<br>示例值：HA</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点<br>示例值：HA</p>
     * @param InstanceType <p>购买实例的类型 HA-本地盘高可用(包括双机高可用，alwaysOn集群)，RO-本地盘只读副本，SI-云盘版单节点,BI-商业智能服务，cvmHA-云盘版高可用，cvmRO-云盘版只读副本，MultiHA-多节点，cvmMultiHA-云盘多节点<br>示例值：HA</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p> 
     * @return MultiZonesStatus <p>跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p>
     */
    public String getMultiZonesStatus() {
        return this.MultiZonesStatus;
    }

    /**
     * Set <p>跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p>
     * @param MultiZonesStatus <p>跨可用区类型，MultiZones-只支持跨可用区，SameZones-只支持同可用区，ALL-支持所有</p>
     */
    public void setMultiZonesStatus(String MultiZonesStatus) {
        this.MultiZonesStatus = MultiZonesStatus;
    }

    /**
     * Get <p>最小磁盘容量时的基准</p><p>单位：IOPS</p> 
     * @return MinBaselineIOPS <p>最小磁盘容量时的基准</p><p>单位：IOPS</p>
     */
    public Long getMinBaselineIOPS() {
        return this.MinBaselineIOPS;
    }

    /**
     * Set <p>最小磁盘容量时的基准</p><p>单位：IOPS</p>
     * @param MinBaselineIOPS <p>最小磁盘容量时的基准</p><p>单位：IOPS</p>
     */
    public void setMinBaselineIOPS(Long MinBaselineIOPS) {
        this.MinBaselineIOPS = MinBaselineIOPS;
    }

    /**
     * Get <p>最大磁盘容量时的基准</p><p>单位：IOPS</p> 
     * @return MaxBaselineIOPS <p>最大磁盘容量时的基准</p><p>单位：IOPS</p>
     */
    public Long getMaxBaselineIOPS() {
        return this.MaxBaselineIOPS;
    }

    /**
     * Set <p>最大磁盘容量时的基准</p><p>单位：IOPS</p>
     * @param MaxBaselineIOPS <p>最大磁盘容量时的基准</p><p>单位：IOPS</p>
     */
    public void setMaxBaselineIOPS(Long MaxBaselineIOPS) {
        this.MaxBaselineIOPS = MaxBaselineIOPS;
    }

    /**
     * Get <p>最小磁盘容量时的基准吞吐量</p><p>单位：MB/s</p> 
     * @return MinBaselineThroughput <p>最小磁盘容量时的基准吞吐量</p><p>单位：MB/s</p>
     */
    public Long getMinBaselineThroughput() {
        return this.MinBaselineThroughput;
    }

    /**
     * Set <p>最小磁盘容量时的基准吞吐量</p><p>单位：MB/s</p>
     * @param MinBaselineThroughput <p>最小磁盘容量时的基准吞吐量</p><p>单位：MB/s</p>
     */
    public void setMinBaselineThroughput(Long MinBaselineThroughput) {
        this.MinBaselineThroughput = MinBaselineThroughput;
    }

    /**
     * Get <p>最大磁盘容量时的基准吞吐量</p><p>单位：MB/s</p> 
     * @return MaxBaselineThroughput <p>最大磁盘容量时的基准吞吐量</p><p>单位：MB/s</p>
     */
    public Long getMaxBaselineThroughput() {
        return this.MaxBaselineThroughput;
    }

    /**
     * Set <p>最大磁盘容量时的基准吞吐量</p><p>单位：MB/s</p>
     * @param MaxBaselineThroughput <p>最大磁盘容量时的基准吞吐量</p><p>单位：MB/s</p>
     */
    public void setMaxBaselineThroughput(Long MaxBaselineThroughput) {
        this.MaxBaselineThroughput = MaxBaselineThroughput;
    }

    /**
     * Get <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul> 
     * @return ExtraIOSupported <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul>
     */
    public Boolean getExtraIOSupported() {
        return this.ExtraIOSupported;
    }

    /**
     * Set <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul>
     * @param ExtraIOSupported <p>是否支持额外 IO 性能</p><p>枚举值：</p><ul><li>TRUE： 支持额外 IO 性能</li><li>FALSE： 不支持额外 IO 性能</li></ul>
     */
    public void setExtraIOSupported(Boolean ExtraIOSupported) {
        this.ExtraIOSupported = ExtraIOSupported;
    }

    /**
     * Get <p>额外 IO 最大吞吐量</p><p>单位：MB/s</p> 
     * @return MaxExtraThroughput <p>额外 IO 最大吞吐量</p><p>单位：MB/s</p>
     */
    public Long getMaxExtraThroughput() {
        return this.MaxExtraThroughput;
    }

    /**
     * Set <p>额外 IO 最大吞吐量</p><p>单位：MB/s</p>
     * @param MaxExtraThroughput <p>额外 IO 最大吞吐量</p><p>单位：MB/s</p>
     */
    public void setMaxExtraThroughput(Long MaxExtraThroughput) {
        this.MaxExtraThroughput = MaxExtraThroughput;
    }

    /**
     * Get <p>支持额外 IO 的最小磁盘容量</p><p>单位： GB</p><p>默认值：460</p> 
     * @return MinDiskSizeForExtraIO <p>支持额外 IO 的最小磁盘容量</p><p>单位： GB</p><p>默认值：460</p>
     */
    public Long getMinDiskSizeForExtraIO() {
        return this.MinDiskSizeForExtraIO;
    }

    /**
     * Set <p>支持额外 IO 的最小磁盘容量</p><p>单位： GB</p><p>默认值：460</p>
     * @param MinDiskSizeForExtraIO <p>支持额外 IO 的最小磁盘容量</p><p>单位： GB</p><p>默认值：460</p>
     */
    public void setMinDiskSizeForExtraIO(Long MinDiskSizeForExtraIO) {
        this.MinDiskSizeForExtraIO = MinDiskSizeForExtraIO;
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
        if (source.MinBaselineIOPS != null) {
            this.MinBaselineIOPS = new Long(source.MinBaselineIOPS);
        }
        if (source.MaxBaselineIOPS != null) {
            this.MaxBaselineIOPS = new Long(source.MaxBaselineIOPS);
        }
        if (source.MinBaselineThroughput != null) {
            this.MinBaselineThroughput = new Long(source.MinBaselineThroughput);
        }
        if (source.MaxBaselineThroughput != null) {
            this.MaxBaselineThroughput = new Long(source.MaxBaselineThroughput);
        }
        if (source.ExtraIOSupported != null) {
            this.ExtraIOSupported = new Boolean(source.ExtraIOSupported);
        }
        if (source.MaxExtraThroughput != null) {
            this.MaxExtraThroughput = new Long(source.MaxExtraThroughput);
        }
        if (source.MinDiskSizeForExtraIO != null) {
            this.MinDiskSizeForExtraIO = new Long(source.MinDiskSizeForExtraIO);
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
        this.setParamSimple(map, prefix + "MinBaselineIOPS", this.MinBaselineIOPS);
        this.setParamSimple(map, prefix + "MaxBaselineIOPS", this.MaxBaselineIOPS);
        this.setParamSimple(map, prefix + "MinBaselineThroughput", this.MinBaselineThroughput);
        this.setParamSimple(map, prefix + "MaxBaselineThroughput", this.MaxBaselineThroughput);
        this.setParamSimple(map, prefix + "ExtraIOSupported", this.ExtraIOSupported);
        this.setParamSimple(map, prefix + "MaxExtraThroughput", this.MaxExtraThroughput);
        this.setParamSimple(map, prefix + "MinDiskSizeForExtraIO", this.MinDiskSizeForExtraIO);

    }
}

