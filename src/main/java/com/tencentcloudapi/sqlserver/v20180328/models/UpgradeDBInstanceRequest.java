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

public class UpgradeDBInstanceRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 代金券ID，目前单个订单只能使用一张代金券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 实例升级后的CPU核心数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构
    */
    @SerializedName("HAType")
    @Expose
    private String HAType;

    /**
    * 修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为夸可用区
    */
    @SerializedName("MultiZones")
    @Expose
    private String MultiZones;

    /**
    * 执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
     * Get 实例ID，形如mssql-j8kv137v 
     * @return InstanceId 实例ID，形如mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-j8kv137v
     * @param InstanceId 实例ID，形如mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例升级后内存大小，单位GB，其值不能小于当前实例内存大小 
     * @return Memory 实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
     * @param Memory 实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小 
     * @return Storage 实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
     * @param Storage 实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0 
     * @return AutoVoucher 是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
     * @param AutoVoucher 是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID，目前单个订单只能使用一张代金券 
     * @return VoucherIds 代金券ID，目前单个订单只能使用一张代金券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID，目前单个订单只能使用一张代金券
     * @param VoucherIds 代金券ID，目前单个订单只能使用一张代金券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 实例升级后的CPU核心数 
     * @return Cpu 实例升级后的CPU核心数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例升级后的CPU核心数
     * @param Cpu 实例升级后的CPU核心数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本 
     * @return DBVersion 升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本
     * @param DBVersion 升级sqlserver的版本，目前支持：2008R2（SQL Server 2008 Enterprise），2012SP3（SQL Server 2012 Enterprise）版本等。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息，版本不支持降级，不填则不修改版本
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构 
     * @return HAType 升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构
     */
    public String getHAType() {
        return this.HAType;
    }

    /**
     * Set 升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构
     * @param HAType 升级sqlserver的高可用架构,从镜像容灾升级到always on集群容灾，仅支持2017及以上版本且支持always on高可用的实例，不支持降级到镜像方式容灾，CLUSTER-升级为always on容灾，不填则不修改高可用架构
     */
    public void setHAType(String HAType) {
        this.HAType = HAType;
    }

    /**
     * Get 修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为夸可用区 
     * @return MultiZones 修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为夸可用区
     */
    public String getMultiZones() {
        return this.MultiZones;
    }

    /**
     * Set 修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为夸可用区
     * @param MultiZones 修改实例是否为跨可用区容灾，SameZones-修改为同可用区 MultiZones-修改为夸可用区
     */
    public void setMultiZones(String MultiZones) {
        this.MultiZones = MultiZones;
    }

    /**
     * Get 执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行 
     * @return WaitSwitch 执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set 执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行
     * @param WaitSwitch 执行变配的方式，默认为 1。支持值包括：0 - 立刻执行，1 - 维护时间窗执行
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
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

    }
}

