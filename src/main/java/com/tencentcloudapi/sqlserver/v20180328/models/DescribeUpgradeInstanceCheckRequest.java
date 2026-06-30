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

public class DescribeUpgradeInstanceCheckRequest extends AbstractModel {

    /**
    * <p>数据库实例ID，形如mssql-njj2mtpl</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例变配后的CPU核心数，不填则不修改</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>实例变配后内存大小，单位GB，不填则不修改</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例变配后磁盘大小，单位GB，不填则不修改</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>实例版本，不填则不修改</p>
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>实例变配后的类型，可选值：CLUSTER-集群，不填则不修改</p>
    */
    @SerializedName("HAType")
    @Expose
    private String HAType;

    /**
    * <p>实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改</p>
    */
    @SerializedName("MultiZones")
    @Expose
    private String MultiZones;

    /**
    * <p>多节点架构实例的备节点可用区，默认为空。如果需要在变配的同时修改指定备节点的可用区时必传，当MultiZones = MultiZones时主节点和备节点可用区不能全部相同。备机可用区集合最小为2个，最大不超过5个。</p>
    */
    @SerializedName("DrZones")
    @Expose
    private DrZoneInfo [] DrZones;

    /**
    * <p>额外磁盘IO吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p><p>不传-保持原值不变；0-取消额外IO；&gt;0-设为新值</p>
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
     * Get <p>数据库实例ID，形如mssql-njj2mtpl</p> 
     * @return InstanceId <p>数据库实例ID，形如mssql-njj2mtpl</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>数据库实例ID，形如mssql-njj2mtpl</p>
     * @param InstanceId <p>数据库实例ID，形如mssql-njj2mtpl</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例变配后的CPU核心数，不填则不修改</p> 
     * @return Cpu <p>实例变配后的CPU核心数，不填则不修改</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例变配后的CPU核心数，不填则不修改</p>
     * @param Cpu <p>实例变配后的CPU核心数，不填则不修改</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>实例变配后内存大小，单位GB，不填则不修改</p> 
     * @return Memory <p>实例变配后内存大小，单位GB，不填则不修改</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例变配后内存大小，单位GB，不填则不修改</p>
     * @param Memory <p>实例变配后内存大小，单位GB，不填则不修改</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例变配后磁盘大小，单位GB，不填则不修改</p> 
     * @return Storage <p>实例变配后磁盘大小，单位GB，不填则不修改</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例变配后磁盘大小，单位GB，不填则不修改</p>
     * @param Storage <p>实例变配后磁盘大小，单位GB，不填则不修改</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>实例版本，不填则不修改</p> 
     * @return DBVersion <p>实例版本，不填则不修改</p>
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>实例版本，不填则不修改</p>
     * @param DBVersion <p>实例版本，不填则不修改</p>
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>实例变配后的类型，可选值：CLUSTER-集群，不填则不修改</p> 
     * @return HAType <p>实例变配后的类型，可选值：CLUSTER-集群，不填则不修改</p>
     */
    public String getHAType() {
        return this.HAType;
    }

    /**
     * Set <p>实例变配后的类型，可选值：CLUSTER-集群，不填则不修改</p>
     * @param HAType <p>实例变配后的类型，可选值：CLUSTER-集群，不填则不修改</p>
     */
    public void setHAType(String HAType) {
        this.HAType = HAType;
    }

    /**
     * Get <p>实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改</p> 
     * @return MultiZones <p>实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改</p>
     */
    public String getMultiZones() {
        return this.MultiZones;
    }

    /**
     * Set <p>实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改</p>
     * @param MultiZones <p>实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改</p>
     */
    public void setMultiZones(String MultiZones) {
        this.MultiZones = MultiZones;
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
     * Get <p>额外磁盘IO吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p><p>不传-保持原值不变；0-取消额外IO；&gt;0-设为新值</p> 
     * @return ThroughputPerformance <p>额外磁盘IO吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p><p>不传-保持原值不变；0-取消额外IO；&gt;0-设为新值</p>
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set <p>额外磁盘IO吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p><p>不传-保持原值不变；0-取消额外IO；&gt;0-设为新值</p>
     * @param ThroughputPerformance <p>额外磁盘IO吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p><p>不传-保持原值不变；0-取消额外IO；&gt;0-设为新值</p>
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    public DescribeUpgradeInstanceCheckRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradeInstanceCheckRequest(DescribeUpgradeInstanceCheckRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
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
        if (source.DrZones != null) {
            this.DrZones = new DrZoneInfo[source.DrZones.length];
            for (int i = 0; i < source.DrZones.length; i++) {
                this.DrZones[i] = new DrZoneInfo(source.DrZones[i]);
            }
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
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "HAType", this.HAType);
        this.setParamSimple(map, prefix + "MultiZones", this.MultiZones);
        this.setParamArrayObj(map, prefix + "DrZones.", this.DrZones);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

