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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceUpgradeTypeRequest extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标实例 CPU 的核数。
    */
    @SerializedName("DstCpu")
    @Expose
    private Float DstCpu;

    /**
    * 目标实例内存大小，单位：MB。
    */
    @SerializedName("DstMemory")
    @Expose
    private Long DstMemory;

    /**
    * 目标实例磁盘大小，单位：GB。
    */
    @SerializedName("DstDisk")
    @Expose
    private Long DstDisk;

    /**
    * 目标实例数据库版本。
    */
    @SerializedName("DstVersion")
    @Expose
    private String DstVersion;

    /**
    * 目标实例部署模型。
    */
    @SerializedName("DstDeployMode")
    @Expose
    private Long DstDeployMode;

    /**
    * 目标实例复制类型。
    */
    @SerializedName("DstProtectMode")
    @Expose
    private Long DstProtectMode;

    /**
    * 目标实例备机1可用区。
    */
    @SerializedName("DstSlaveZone")
    @Expose
    private Long DstSlaveZone;

    /**
    * 目标实例备机2可用区。
    */
    @SerializedName("DstBackupZone")
    @Expose
    private Long DstBackupZone;

    /**
    * 目标实例类型。
    */
    @SerializedName("DstCdbType")
    @Expose
    private String DstCdbType;

    /**
    * 目标实例主可用区。
    */
    @SerializedName("DstZoneId")
    @Expose
    private Long DstZoneId;

    /**
    * 独享集群 CDB 实例的节点分布情况。
    */
    @SerializedName("NodeDistribution")
    @Expose
    private NodeDistribution NodeDistribution;

    /**
    * 集群版的节点拓扑配置
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 目标实例 CPU 的核数。 
     * @return DstCpu 目标实例 CPU 的核数。
     */
    public Float getDstCpu() {
        return this.DstCpu;
    }

    /**
     * Set 目标实例 CPU 的核数。
     * @param DstCpu 目标实例 CPU 的核数。
     */
    public void setDstCpu(Float DstCpu) {
        this.DstCpu = DstCpu;
    }

    /**
     * Get 目标实例内存大小，单位：MB。 
     * @return DstMemory 目标实例内存大小，单位：MB。
     */
    public Long getDstMemory() {
        return this.DstMemory;
    }

    /**
     * Set 目标实例内存大小，单位：MB。
     * @param DstMemory 目标实例内存大小，单位：MB。
     */
    public void setDstMemory(Long DstMemory) {
        this.DstMemory = DstMemory;
    }

    /**
     * Get 目标实例磁盘大小，单位：GB。 
     * @return DstDisk 目标实例磁盘大小，单位：GB。
     */
    public Long getDstDisk() {
        return this.DstDisk;
    }

    /**
     * Set 目标实例磁盘大小，单位：GB。
     * @param DstDisk 目标实例磁盘大小，单位：GB。
     */
    public void setDstDisk(Long DstDisk) {
        this.DstDisk = DstDisk;
    }

    /**
     * Get 目标实例数据库版本。 
     * @return DstVersion 目标实例数据库版本。
     */
    public String getDstVersion() {
        return this.DstVersion;
    }

    /**
     * Set 目标实例数据库版本。
     * @param DstVersion 目标实例数据库版本。
     */
    public void setDstVersion(String DstVersion) {
        this.DstVersion = DstVersion;
    }

    /**
     * Get 目标实例部署模型。 
     * @return DstDeployMode 目标实例部署模型。
     */
    public Long getDstDeployMode() {
        return this.DstDeployMode;
    }

    /**
     * Set 目标实例部署模型。
     * @param DstDeployMode 目标实例部署模型。
     */
    public void setDstDeployMode(Long DstDeployMode) {
        this.DstDeployMode = DstDeployMode;
    }

    /**
     * Get 目标实例复制类型。 
     * @return DstProtectMode 目标实例复制类型。
     */
    public Long getDstProtectMode() {
        return this.DstProtectMode;
    }

    /**
     * Set 目标实例复制类型。
     * @param DstProtectMode 目标实例复制类型。
     */
    public void setDstProtectMode(Long DstProtectMode) {
        this.DstProtectMode = DstProtectMode;
    }

    /**
     * Get 目标实例备机1可用区。 
     * @return DstSlaveZone 目标实例备机1可用区。
     */
    public Long getDstSlaveZone() {
        return this.DstSlaveZone;
    }

    /**
     * Set 目标实例备机1可用区。
     * @param DstSlaveZone 目标实例备机1可用区。
     */
    public void setDstSlaveZone(Long DstSlaveZone) {
        this.DstSlaveZone = DstSlaveZone;
    }

    /**
     * Get 目标实例备机2可用区。 
     * @return DstBackupZone 目标实例备机2可用区。
     */
    public Long getDstBackupZone() {
        return this.DstBackupZone;
    }

    /**
     * Set 目标实例备机2可用区。
     * @param DstBackupZone 目标实例备机2可用区。
     */
    public void setDstBackupZone(Long DstBackupZone) {
        this.DstBackupZone = DstBackupZone;
    }

    /**
     * Get 目标实例类型。 
     * @return DstCdbType 目标实例类型。
     */
    public String getDstCdbType() {
        return this.DstCdbType;
    }

    /**
     * Set 目标实例类型。
     * @param DstCdbType 目标实例类型。
     */
    public void setDstCdbType(String DstCdbType) {
        this.DstCdbType = DstCdbType;
    }

    /**
     * Get 目标实例主可用区。 
     * @return DstZoneId 目标实例主可用区。
     */
    public Long getDstZoneId() {
        return this.DstZoneId;
    }

    /**
     * Set 目标实例主可用区。
     * @param DstZoneId 目标实例主可用区。
     */
    public void setDstZoneId(Long DstZoneId) {
        this.DstZoneId = DstZoneId;
    }

    /**
     * Get 独享集群 CDB 实例的节点分布情况。 
     * @return NodeDistribution 独享集群 CDB 实例的节点分布情况。
     */
    public NodeDistribution getNodeDistribution() {
        return this.NodeDistribution;
    }

    /**
     * Set 独享集群 CDB 实例的节点分布情况。
     * @param NodeDistribution 独享集群 CDB 实例的节点分布情况。
     */
    public void setNodeDistribution(NodeDistribution NodeDistribution) {
        this.NodeDistribution = NodeDistribution;
    }

    /**
     * Get 集群版的节点拓扑配置 
     * @return ClusterTopology 集群版的节点拓扑配置
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set 集群版的节点拓扑配置
     * @param ClusterTopology 集群版的节点拓扑配置
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    public DescribeInstanceUpgradeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceUpgradeTypeRequest(DescribeInstanceUpgradeTypeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstCpu != null) {
            this.DstCpu = new Float(source.DstCpu);
        }
        if (source.DstMemory != null) {
            this.DstMemory = new Long(source.DstMemory);
        }
        if (source.DstDisk != null) {
            this.DstDisk = new Long(source.DstDisk);
        }
        if (source.DstVersion != null) {
            this.DstVersion = new String(source.DstVersion);
        }
        if (source.DstDeployMode != null) {
            this.DstDeployMode = new Long(source.DstDeployMode);
        }
        if (source.DstProtectMode != null) {
            this.DstProtectMode = new Long(source.DstProtectMode);
        }
        if (source.DstSlaveZone != null) {
            this.DstSlaveZone = new Long(source.DstSlaveZone);
        }
        if (source.DstBackupZone != null) {
            this.DstBackupZone = new Long(source.DstBackupZone);
        }
        if (source.DstCdbType != null) {
            this.DstCdbType = new String(source.DstCdbType);
        }
        if (source.DstZoneId != null) {
            this.DstZoneId = new Long(source.DstZoneId);
        }
        if (source.NodeDistribution != null) {
            this.NodeDistribution = new NodeDistribution(source.NodeDistribution);
        }
        if (source.ClusterTopology != null) {
            this.ClusterTopology = new ClusterTopology(source.ClusterTopology);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstCpu", this.DstCpu);
        this.setParamSimple(map, prefix + "DstMemory", this.DstMemory);
        this.setParamSimple(map, prefix + "DstDisk", this.DstDisk);
        this.setParamSimple(map, prefix + "DstVersion", this.DstVersion);
        this.setParamSimple(map, prefix + "DstDeployMode", this.DstDeployMode);
        this.setParamSimple(map, prefix + "DstProtectMode", this.DstProtectMode);
        this.setParamSimple(map, prefix + "DstSlaveZone", this.DstSlaveZone);
        this.setParamSimple(map, prefix + "DstBackupZone", this.DstBackupZone);
        this.setParamSimple(map, prefix + "DstCdbType", this.DstCdbType);
        this.setParamSimple(map, prefix + "DstZoneId", this.DstZoneId);
        this.setParamObj(map, prefix + "NodeDistribution.", this.NodeDistribution);
        this.setParamObj(map, prefix + "ClusterTopology.", this.ClusterTopology);

    }
}

