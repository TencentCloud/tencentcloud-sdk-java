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

public class DescribeInstanceUpgradeTypeRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标实例 CPU 的核数。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的 CPU 值范围。
    */
    @SerializedName("DstCpu")
    @Expose
    private Float DstCpu;

    /**
    * 目标实例内存大小，单位：MB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的内存大小范围。
    */
    @SerializedName("DstMemory")
    @Expose
    private Long DstMemory;

    /**
    * 目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的磁盘大小范围。
    */
    @SerializedName("DstDisk")
    @Expose
    private Long DstDisk;

    /**
    * 目标实例数据库版本。可选值：5.6，5.7，8.0。
    */
    @SerializedName("DstVersion")
    @Expose
    private String DstVersion;

    /**
    * 目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。
    */
    @SerializedName("DstDeployMode")
    @Expose
    private Long DstDeployMode;

    /**
    * 目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
    */
    @SerializedName("DstProtectMode")
    @Expose
    private Long DstProtectMode;

    /**
    * 目标实例备机1可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
    */
    @SerializedName("DstSlaveZone")
    @Expose
    private Long DstSlaveZone;

    /**
    * 目标实例备机2可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
    */
    @SerializedName("DstBackupZone")
    @Expose
    private Long DstBackupZone;

    /**
    * 目标实例类型。支持值包括："CUSTOM" - 通用型实例，"EXCLUSIVE" - 独享型实例，"ONTKE" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。
    */
    @SerializedName("DstCdbType")
    @Expose
    private String DstCdbType;

    /**
    * 目标实例主可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
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
    * 集群版的节点拓扑配置。Nodeld信息可通过 [DescribeClusterInfo](https://cloud.tencent.com/document/api/236/105116) 接口获取。
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
     * Get 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 目标实例 CPU 的核数。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的 CPU 值范围。 
     * @return DstCpu 目标实例 CPU 的核数。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的 CPU 值范围。
     */
    public Float getDstCpu() {
        return this.DstCpu;
    }

    /**
     * Set 目标实例 CPU 的核数。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的 CPU 值范围。
     * @param DstCpu 目标实例 CPU 的核数。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的 CPU 值范围。
     */
    public void setDstCpu(Float DstCpu) {
        this.DstCpu = DstCpu;
    }

    /**
     * Get 目标实例内存大小，单位：MB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的内存大小范围。 
     * @return DstMemory 目标实例内存大小，单位：MB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的内存大小范围。
     */
    public Long getDstMemory() {
        return this.DstMemory;
    }

    /**
     * Set 目标实例内存大小，单位：MB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的内存大小范围。
     * @param DstMemory 目标实例内存大小，单位：MB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的内存大小范围。
     */
    public void setDstMemory(Long DstMemory) {
        this.DstMemory = DstMemory;
    }

    /**
     * Get 目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的磁盘大小范围。 
     * @return DstDisk 目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的磁盘大小范围。
     */
    public Long getDstDisk() {
        return this.DstDisk;
    }

    /**
     * Set 目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的磁盘大小范围。
     * @param DstDisk 目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取实例可售卖的磁盘大小范围。
     */
    public void setDstDisk(Long DstDisk) {
        this.DstDisk = DstDisk;
    }

    /**
     * Get 目标实例数据库版本。可选值：5.6，5.7，8.0。 
     * @return DstVersion 目标实例数据库版本。可选值：5.6，5.7，8.0。
     */
    public String getDstVersion() {
        return this.DstVersion;
    }

    /**
     * Set 目标实例数据库版本。可选值：5.6，5.7，8.0。
     * @param DstVersion 目标实例数据库版本。可选值：5.6，5.7，8.0。
     */
    public void setDstVersion(String DstVersion) {
        this.DstVersion = DstVersion;
    }

    /**
     * Get 目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。 
     * @return DstDeployMode 目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。
     */
    public Long getDstDeployMode() {
        return this.DstDeployMode;
    }

    /**
     * Set 目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。
     * @param DstDeployMode 目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。
     */
    public void setDstDeployMode(Long DstDeployMode) {
        this.DstDeployMode = DstDeployMode;
    }

    /**
     * Get 目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。 
     * @return DstProtectMode 目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     */
    public Long getDstProtectMode() {
        return this.DstProtectMode;
    }

    /**
     * Set 目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     * @param DstProtectMode 目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     */
    public void setDstProtectMode(Long DstProtectMode) {
        this.DstProtectMode = DstProtectMode;
    }

    /**
     * Get 目标实例备机1可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。 
     * @return DstSlaveZone 目标实例备机1可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
     */
    public Long getDstSlaveZone() {
        return this.DstSlaveZone;
    }

    /**
     * Set 目标实例备机1可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
     * @param DstSlaveZone 目标实例备机1可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
     */
    public void setDstSlaveZone(Long DstSlaveZone) {
        this.DstSlaveZone = DstSlaveZone;
    }

    /**
     * Get 目标实例备机2可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。 
     * @return DstBackupZone 目标实例备机2可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
     */
    public Long getDstBackupZone() {
        return this.DstBackupZone;
    }

    /**
     * Set 目标实例备机2可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
     * @param DstBackupZone 目标实例备机2可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
     */
    public void setDstBackupZone(Long DstBackupZone) {
        this.DstBackupZone = DstBackupZone;
    }

    /**
     * Get 目标实例类型。支持值包括："CUSTOM" - 通用型实例，"EXCLUSIVE" - 独享型实例，"ONTKE" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。 
     * @return DstCdbType 目标实例类型。支持值包括："CUSTOM" - 通用型实例，"EXCLUSIVE" - 独享型实例，"ONTKE" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。
     */
    public String getDstCdbType() {
        return this.DstCdbType;
    }

    /**
     * Set 目标实例类型。支持值包括："CUSTOM" - 通用型实例，"EXCLUSIVE" - 独享型实例，"ONTKE" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。
     * @param DstCdbType 目标实例类型。支持值包括："CUSTOM" - 通用型实例，"EXCLUSIVE" - 独享型实例，"ONTKE" - ONTKE 单节点实例，"CLOUD_NATIVE_CLUSTER" - 云盘版标准型，"CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - 云盘版加强型。
     */
    public void setDstCdbType(String DstCdbType) {
        this.DstCdbType = DstCdbType;
    }

    /**
     * Get 目标实例主可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。 
     * @return DstZoneId 目标实例主可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
     */
    public Long getDstZoneId() {
        return this.DstZoneId;
    }

    /**
     * Set 目标实例主可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
     * @param DstZoneId 目标实例主可用区 ID。可使用 [DescribeCdbZoneConfig](https://cloud.tencent.com/document/product/236/80281) 获取可用区 ID。
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
     * Get 集群版的节点拓扑配置。Nodeld信息可通过 [DescribeClusterInfo](https://cloud.tencent.com/document/api/236/105116) 接口获取。 
     * @return ClusterTopology 集群版的节点拓扑配置。Nodeld信息可通过 [DescribeClusterInfo](https://cloud.tencent.com/document/api/236/105116) 接口获取。
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set 集群版的节点拓扑配置。Nodeld信息可通过 [DescribeClusterInfo](https://cloud.tencent.com/document/api/236/105116) 接口获取。
     * @param ClusterTopology 集群版的节点拓扑配置。Nodeld信息可通过 [DescribeClusterInfo](https://cloud.tencent.com/document/api/236/105116) 接口获取。
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

