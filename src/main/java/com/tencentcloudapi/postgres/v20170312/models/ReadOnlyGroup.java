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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadOnlyGroup extends AbstractModel{

    /**
    * 只读组标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 只读组名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 主实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * 最小保留实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinDelayEliminateReserve")
    @Expose
    private Long MinDelayEliminateReserve;

    /**
    * 延迟空间大小阈值
    */
    @SerializedName("MaxReplayLatency")
    @Expose
    private Long MaxReplayLatency;

    /**
    * 延迟大小开关
    */
    @SerializedName("ReplayLatencyEliminate")
    @Expose
    private Long ReplayLatencyEliminate;

    /**
    * 延迟时间大小阈值
    */
    @SerializedName("MaxReplayLag")
    @Expose
    private Float MaxReplayLag;

    /**
    * 延迟时间开关
    */
    @SerializedName("ReplayLagEliminate")
    @Expose
    private Long ReplayLagEliminate;

    /**
    * 虚拟网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 地域id
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地区id
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例详细信息
    */
    @SerializedName("ReadOnlyDBInstanceList")
    @Expose
    private DBInstance [] ReadOnlyDBInstanceList;

    /**
    * 自动负载均衡开关
    */
    @SerializedName("Rebalance")
    @Expose
    private Long Rebalance;

    /**
    * 网络信息
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private DBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * 只读组网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAccessList")
    @Expose
    private NetworkAccess [] NetworkAccessList;

    /**
     * Get 只读组标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnlyGroupId 只读组标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 只读组标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnlyGroupId 只读组标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get 只读组名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnlyGroupName 只读组名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set 只读组名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnlyGroupName 只读组名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 主实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterDBInstanceId 主实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set 主实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterDBInstanceId 主实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get 最小保留实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinDelayEliminateReserve 最小保留实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinDelayEliminateReserve() {
        return this.MinDelayEliminateReserve;
    }

    /**
     * Set 最小保留实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinDelayEliminateReserve 最小保留实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinDelayEliminateReserve(Long MinDelayEliminateReserve) {
        this.MinDelayEliminateReserve = MinDelayEliminateReserve;
    }

    /**
     * Get 延迟空间大小阈值 
     * @return MaxReplayLatency 延迟空间大小阈值
     */
    public Long getMaxReplayLatency() {
        return this.MaxReplayLatency;
    }

    /**
     * Set 延迟空间大小阈值
     * @param MaxReplayLatency 延迟空间大小阈值
     */
    public void setMaxReplayLatency(Long MaxReplayLatency) {
        this.MaxReplayLatency = MaxReplayLatency;
    }

    /**
     * Get 延迟大小开关 
     * @return ReplayLatencyEliminate 延迟大小开关
     */
    public Long getReplayLatencyEliminate() {
        return this.ReplayLatencyEliminate;
    }

    /**
     * Set 延迟大小开关
     * @param ReplayLatencyEliminate 延迟大小开关
     */
    public void setReplayLatencyEliminate(Long ReplayLatencyEliminate) {
        this.ReplayLatencyEliminate = ReplayLatencyEliminate;
    }

    /**
     * Get 延迟时间大小阈值 
     * @return MaxReplayLag 延迟时间大小阈值
     */
    public Float getMaxReplayLag() {
        return this.MaxReplayLag;
    }

    /**
     * Set 延迟时间大小阈值
     * @param MaxReplayLag 延迟时间大小阈值
     */
    public void setMaxReplayLag(Float MaxReplayLag) {
        this.MaxReplayLag = MaxReplayLag;
    }

    /**
     * Get 延迟时间开关 
     * @return ReplayLagEliminate 延迟时间开关
     */
    public Long getReplayLagEliminate() {
        return this.ReplayLagEliminate;
    }

    /**
     * Set 延迟时间开关
     * @param ReplayLagEliminate 延迟时间开关
     */
    public void setReplayLagEliminate(Long ReplayLagEliminate) {
        this.ReplayLagEliminate = ReplayLagEliminate;
    }

    /**
     * Get 虚拟网络id 
     * @return VpcId 虚拟网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 虚拟网络id
     * @param VpcId 虚拟网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 地域id 
     * @return Region 地域id
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域id
     * @param Region 地域id
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地区id 
     * @return Zone 地区id
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地区id
     * @param Zone 地区id
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例详细信息 
     * @return ReadOnlyDBInstanceList 实例详细信息
     */
    public DBInstance [] getReadOnlyDBInstanceList() {
        return this.ReadOnlyDBInstanceList;
    }

    /**
     * Set 实例详细信息
     * @param ReadOnlyDBInstanceList 实例详细信息
     */
    public void setReadOnlyDBInstanceList(DBInstance [] ReadOnlyDBInstanceList) {
        this.ReadOnlyDBInstanceList = ReadOnlyDBInstanceList;
    }

    /**
     * Get 自动负载均衡开关 
     * @return Rebalance 自动负载均衡开关
     */
    public Long getRebalance() {
        return this.Rebalance;
    }

    /**
     * Set 自动负载均衡开关
     * @param Rebalance 自动负载均衡开关
     */
    public void setRebalance(Long Rebalance) {
        this.Rebalance = Rebalance;
    }

    /**
     * Get 网络信息 
     * @return DBInstanceNetInfo 网络信息
     */
    public DBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set 网络信息
     * @param DBInstanceNetInfo 网络信息
     */
    public void setDBInstanceNetInfo(DBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get 只读组网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAccessList 只读组网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkAccess [] getNetworkAccessList() {
        return this.NetworkAccessList;
    }

    /**
     * Set 只读组网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAccessList 只读组网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAccessList(NetworkAccess [] NetworkAccessList) {
        this.NetworkAccessList = NetworkAccessList;
    }

    public ReadOnlyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadOnlyGroup(ReadOnlyGroup source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.MinDelayEliminateReserve != null) {
            this.MinDelayEliminateReserve = new Long(source.MinDelayEliminateReserve);
        }
        if (source.MaxReplayLatency != null) {
            this.MaxReplayLatency = new Long(source.MaxReplayLatency);
        }
        if (source.ReplayLatencyEliminate != null) {
            this.ReplayLatencyEliminate = new Long(source.ReplayLatencyEliminate);
        }
        if (source.MaxReplayLag != null) {
            this.MaxReplayLag = new Float(source.MaxReplayLag);
        }
        if (source.ReplayLagEliminate != null) {
            this.ReplayLagEliminate = new Long(source.ReplayLagEliminate);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ReadOnlyDBInstanceList != null) {
            this.ReadOnlyDBInstanceList = new DBInstance[source.ReadOnlyDBInstanceList.length];
            for (int i = 0; i < source.ReadOnlyDBInstanceList.length; i++) {
                this.ReadOnlyDBInstanceList[i] = new DBInstance(source.ReadOnlyDBInstanceList[i]);
            }
        }
        if (source.Rebalance != null) {
            this.Rebalance = new Long(source.Rebalance);
        }
        if (source.DBInstanceNetInfo != null) {
            this.DBInstanceNetInfo = new DBInstanceNetInfo[source.DBInstanceNetInfo.length];
            for (int i = 0; i < source.DBInstanceNetInfo.length; i++) {
                this.DBInstanceNetInfo[i] = new DBInstanceNetInfo(source.DBInstanceNetInfo[i]);
            }
        }
        if (source.NetworkAccessList != null) {
            this.NetworkAccessList = new NetworkAccess[source.NetworkAccessList.length];
            for (int i = 0; i < source.NetworkAccessList.length; i++) {
                this.NetworkAccessList[i] = new NetworkAccess(source.NetworkAccessList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "MinDelayEliminateReserve", this.MinDelayEliminateReserve);
        this.setParamSimple(map, prefix + "MaxReplayLatency", this.MaxReplayLatency);
        this.setParamSimple(map, prefix + "ReplayLatencyEliminate", this.ReplayLatencyEliminate);
        this.setParamSimple(map, prefix + "MaxReplayLag", this.MaxReplayLag);
        this.setParamSimple(map, prefix + "ReplayLagEliminate", this.ReplayLagEliminate);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ReadOnlyDBInstanceList.", this.ReadOnlyDBInstanceList);
        this.setParamSimple(map, prefix + "Rebalance", this.Rebalance);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);
        this.setParamArrayObj(map, prefix + "NetworkAccessList.", this.NetworkAccessList);

    }
}

