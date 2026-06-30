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

public class UpgradeDBInstanceRequest extends AbstractModel {

    /**
    * <p>实例ID，形如mssql-j8kv137v</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例升级后内存大小，单位GB，其值不能小于当前实例内存大小</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>代金券ID，目前单个订单只能使用一张代金券</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>实例升级后的CPU核心数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本</p>
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构</p>
    */
    @SerializedName("HAType")
    @Expose
    private String HAType;

    /**
    * <p>修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为跨可用区</p>
    */
    @SerializedName("MultiZones")
    @Expose
    private String MultiZones;

    /**
    * <p>执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行</p>
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * <p>多节点架构实例的备节点可用区，默认为空。如果需要在变配的同时修改指定备节点的可用区时必传，当MultiZones = MultiZones时主节点和备节点可用区不能全部相同。备机可用区集合最小为2个，最大不超过5个。</p>
    */
    @SerializedName("DrZones")
    @Expose
    private DrZoneInfo [] DrZones;

    /**
    * <p>是否自动升级数据库的兼容性级别，默认0。0-否，1-是</p>
    */
    @SerializedName("UpgradeCompatLevel")
    @Expose
    private Long UpgradeCompatLevel;

    /**
    * <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
     * Get <p>实例ID，形如mssql-j8kv137v</p> 
     * @return InstanceId <p>实例ID，形如mssql-j8kv137v</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID，形如mssql-j8kv137v</p>
     * @param InstanceId <p>实例ID，形如mssql-j8kv137v</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例升级后内存大小，单位GB，其值不能小于当前实例内存大小</p> 
     * @return Memory <p>实例升级后内存大小，单位GB，其值不能小于当前实例内存大小</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例升级后内存大小，单位GB，其值不能小于当前实例内存大小</p>
     * @param Memory <p>实例升级后内存大小，单位GB，其值不能小于当前实例内存大小</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小</p> 
     * @return Storage <p>实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小</p>
     * @param Storage <p>实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0</p> 
     * @return AutoVoucher <p>是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0</p>
     * @param AutoVoucher <p>是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>代金券ID，目前单个订单只能使用一张代金券</p> 
     * @return VoucherIds <p>代金券ID，目前单个订单只能使用一张代金券</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>代金券ID，目前单个订单只能使用一张代金券</p>
     * @param VoucherIds <p>代金券ID，目前单个订单只能使用一张代金券</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>实例升级后的CPU核心数</p> 
     * @return Cpu <p>实例升级后的CPU核心数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例升级后的CPU核心数</p>
     * @param Cpu <p>实例升级后的CPU核心数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本</p> 
     * @return DBVersion <p>升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本</p>
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本</p>
     * @param DBVersion <p>升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本</p>
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构</p> 
     * @return HAType <p>升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构</p>
     */
    public String getHAType() {
        return this.HAType;
    }

    /**
     * Set <p>升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构</p>
     * @param HAType <p>升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构</p>
     */
    public void setHAType(String HAType) {
        this.HAType = HAType;
    }

    /**
     * Get <p>修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为跨可用区</p> 
     * @return MultiZones <p>修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为跨可用区</p>
     */
    public String getMultiZones() {
        return this.MultiZones;
    }

    /**
     * Set <p>修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为跨可用区</p>
     * @param MultiZones <p>修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为跨可用区</p>
     */
    public void setMultiZones(String MultiZones) {
        this.MultiZones = MultiZones;
    }

    /**
     * Get <p>执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行</p> 
     * @return WaitSwitch <p>执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行</p>
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set <p>执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行</p>
     * @param WaitSwitch <p>执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行</p>
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get <p>多节点架构实例的备节点可用区，默认为空。如果需要在变配的同时修改指定备节点的可用区时必传，当MultiZones = MultiZones时主节点和备节点可用区不能全部相同。备机可用区集合最小为2个，最大不超过5个。</p> 
     * @return DrZones <p>多节点架构实例的备节点可用区，默认为空。如果需要在变配的同时修改指定备节点的可用区时必传，当MultiZones = MultiZones时主节点和备节点可用区不能全部相同。备机可用区集合最小为2个，最大不超过5个。</p>
     */
    public DrZoneInfo [] getDrZones() {
        return this.DrZones;
    }

    /**
     * Set <p>多节点架构实例的备节点可用区，默认为空。如果需要在变配的同时修改指定备节点的可用区时必传，当MultiZones = MultiZones时主节点和备节点可用区不能全部相同。备机可用区集合最小为2个，最大不超过5个。</p>
     * @param DrZones <p>多节点架构实例的备节点可用区，默认为空。如果需要在变配的同时修改指定备节点的可用区时必传，当MultiZones = MultiZones时主节点和备节点可用区不能全部相同。备机可用区集合最小为2个，最大不超过5个。</p>
     */
    public void setDrZones(DrZoneInfo [] DrZones) {
        this.DrZones = DrZones;
    }

    /**
     * Get <p>是否自动升级数据库的兼容性级别，默认0。0-否，1-是</p> 
     * @return UpgradeCompatLevel <p>是否自动升级数据库的兼容性级别，默认0。0-否，1-是</p>
     */
    public Long getUpgradeCompatLevel() {
        return this.UpgradeCompatLevel;
    }

    /**
     * Set <p>是否自动升级数据库的兼容性级别，默认0。0-否，1-是</p>
     * @param UpgradeCompatLevel <p>是否自动升级数据库的兼容性级别，默认0。0-否，1-是</p>
     */
    public void setUpgradeCompatLevel(Long UpgradeCompatLevel) {
        this.UpgradeCompatLevel = UpgradeCompatLevel;
    }

    /**
     * Get <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p> 
     * @return ThroughputPerformance <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     * @param ThroughputPerformance <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    public UpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceRequest(UpgradeDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.HAType != null) {
            this.HAType = new String(source.HAType);
        }
        if (source.MultiZones != null) {
            this.MultiZones = new String(source.MultiZones);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.DrZones != null) {
            this.DrZones = new DrZoneInfo[source.DrZones.length];
            for (int i = 0; i < source.DrZones.length; i++) {
                this.DrZones[i] = new DrZoneInfo(source.DrZones[i]);
            }
        }
        if (source.UpgradeCompatLevel != null) {
            this.UpgradeCompatLevel = new Long(source.UpgradeCompatLevel);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "HAType", this.HAType);
        this.setParamSimple(map, prefix + "MultiZones", this.MultiZones);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamArrayObj(map, prefix + "DrZones.", this.DrZones);
        this.setParamSimple(map, prefix + "UpgradeCompatLevel", this.UpgradeCompatLevel);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

