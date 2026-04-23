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
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>目标实例 CPU 的核数。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的 CPU 值范围。</p>
    */
    @SerializedName("DstCpu")
    @Expose
    private Float DstCpu;

    /**
    * <p>目标实例内存大小，单位：MB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的内存大小范围。</p>
    */
    @SerializedName("DstMemory")
    @Expose
    private Long DstMemory;

    /**
    * <p>目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的磁盘大小范围。</p>
    */
    @SerializedName("DstDisk")
    @Expose
    private Long DstDisk;

    /**
    * <p>目标实例数据库版本。可选值：5.6，5.7，8.0。</p>
    */
    @SerializedName("DstVersion")
    @Expose
    private String DstVersion;

    /**
    * <p>目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p>
    */
    @SerializedName("DstDeployMode")
    @Expose
    private Long DstDeployMode;

    /**
    * <p>目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
    */
    @SerializedName("DstProtectMode")
    @Expose
    private Long DstProtectMode;

    /**
    * <p>目标实例备机1可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
    */
    @SerializedName("DstSlaveZone")
    @Expose
    private Long DstSlaveZone;

    /**
    * <p>目标实例备机2可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
    */
    @SerializedName("DstBackupZone")
    @Expose
    private Long DstBackupZone;

    /**
    * <p>目标实例类型。支持值包括：&quot;CUSTOM&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;ONTKE&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。</p>
    */
    @SerializedName("DstCdbType")
    @Expose
    private String DstCdbType;

    /**
    * <p>目标实例主可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
    */
    @SerializedName("DstZoneId")
    @Expose
    private Long DstZoneId;

    /**
    * <p>独享集群 CDB 实例的节点分布情况。</p>
    */
    @SerializedName("NodeDistribution")
    @Expose
    private NodeDistribution NodeDistribution;

    /**
    * <p>云盘版的节点拓扑配置。Nodeld 信息可通过 <a href="https://cloud.tencent.com/document/api/236/105116">DescribeClusterInfo</a> 接口获取。</p>
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>目标实例 CPU 的核数。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的 CPU 值范围。</p> 
     * @return DstCpu <p>目标实例 CPU 的核数。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的 CPU 值范围。</p>
     */
    public Float getDstCpu() {
        return this.DstCpu;
    }

    /**
     * Set <p>目标实例 CPU 的核数。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的 CPU 值范围。</p>
     * @param DstCpu <p>目标实例 CPU 的核数。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的 CPU 值范围。</p>
     */
    public void setDstCpu(Float DstCpu) {
        this.DstCpu = DstCpu;
    }

    /**
     * Get <p>目标实例内存大小，单位：MB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的内存大小范围。</p> 
     * @return DstMemory <p>目标实例内存大小，单位：MB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的内存大小范围。</p>
     */
    public Long getDstMemory() {
        return this.DstMemory;
    }

    /**
     * Set <p>目标实例内存大小，单位：MB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的内存大小范围。</p>
     * @param DstMemory <p>目标实例内存大小，单位：MB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的内存大小范围。</p>
     */
    public void setDstMemory(Long DstMemory) {
        this.DstMemory = DstMemory;
    }

    /**
     * Get <p>目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的磁盘大小范围。</p> 
     * @return DstDisk <p>目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的磁盘大小范围。</p>
     */
    public Long getDstDisk() {
        return this.DstDisk;
    }

    /**
     * Set <p>目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的磁盘大小范围。</p>
     * @param DstDisk <p>目标实例磁盘大小，单位：GB。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取实例可售卖的磁盘大小范围。</p>
     */
    public void setDstDisk(Long DstDisk) {
        this.DstDisk = DstDisk;
    }

    /**
     * Get <p>目标实例数据库版本。可选值：5.6，5.7，8.0。</p> 
     * @return DstVersion <p>目标实例数据库版本。可选值：5.6，5.7，8.0。</p>
     */
    public String getDstVersion() {
        return this.DstVersion;
    }

    /**
     * Set <p>目标实例数据库版本。可选值：5.6，5.7，8.0。</p>
     * @param DstVersion <p>目标实例数据库版本。可选值：5.6，5.7，8.0。</p>
     */
    public void setDstVersion(String DstVersion) {
        this.DstVersion = DstVersion;
    }

    /**
     * Get <p>目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p> 
     * @return DstDeployMode <p>目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p>
     */
    public Long getDstDeployMode() {
        return this.DstDeployMode;
    }

    /**
     * Set <p>目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p>
     * @param DstDeployMode <p>目标实例部署模型。默认为0，支持值包括：0 - 表示单可用区，1 - 表示多可用区。</p>
     */
    public void setDstDeployMode(Long DstDeployMode) {
        this.DstDeployMode = DstDeployMode;
    }

    /**
     * Get <p>目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p> 
     * @return DstProtectMode <p>目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     */
    public Long getDstProtectMode() {
        return this.DstProtectMode;
    }

    /**
     * Set <p>目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     * @param DstProtectMode <p>目标实例复制类型，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     */
    public void setDstProtectMode(Long DstProtectMode) {
        this.DstProtectMode = DstProtectMode;
    }

    /**
     * Get <p>目标实例备机1可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p> 
     * @return DstSlaveZone <p>目标实例备机1可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     */
    public Long getDstSlaveZone() {
        return this.DstSlaveZone;
    }

    /**
     * Set <p>目标实例备机1可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     * @param DstSlaveZone <p>目标实例备机1可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     */
    public void setDstSlaveZone(Long DstSlaveZone) {
        this.DstSlaveZone = DstSlaveZone;
    }

    /**
     * Get <p>目标实例备机2可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p> 
     * @return DstBackupZone <p>目标实例备机2可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     */
    public Long getDstBackupZone() {
        return this.DstBackupZone;
    }

    /**
     * Set <p>目标实例备机2可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     * @param DstBackupZone <p>目标实例备机2可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     */
    public void setDstBackupZone(Long DstBackupZone) {
        this.DstBackupZone = DstBackupZone;
    }

    /**
     * Get <p>目标实例类型。支持值包括：&quot;CUSTOM&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;ONTKE&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。</p> 
     * @return DstCdbType <p>目标实例类型。支持值包括：&quot;CUSTOM&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;ONTKE&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。</p>
     */
    public String getDstCdbType() {
        return this.DstCdbType;
    }

    /**
     * Set <p>目标实例类型。支持值包括：&quot;CUSTOM&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;ONTKE&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。</p>
     * @param DstCdbType <p>目标实例类型。支持值包括：&quot;CUSTOM&quot; - 通用型实例，&quot;EXCLUSIVE&quot; - 独享型实例，&quot;ONTKE&quot; - ONTKE 单节点实例，&quot;CLOUD_NATIVE_CLUSTER&quot; - 云盘版标准型，&quot;CLOUD_NATIVE_CLUSTER_EXCLUSIVE&quot; - 云盘版加强型。</p>
     */
    public void setDstCdbType(String DstCdbType) {
        this.DstCdbType = DstCdbType;
    }

    /**
     * Get <p>目标实例主可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p> 
     * @return DstZoneId <p>目标实例主可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     */
    public Long getDstZoneId() {
        return this.DstZoneId;
    }

    /**
     * Set <p>目标实例主可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     * @param DstZoneId <p>目标实例主可用区 ID。可使用 <a href="https://cloud.tencent.com/document/product/236/80281">DescribeCdbZoneConfig</a> 获取可用区 ID。</p>
     */
    public void setDstZoneId(Long DstZoneId) {
        this.DstZoneId = DstZoneId;
    }

    /**
     * Get <p>独享集群 CDB 实例的节点分布情况。</p> 
     * @return NodeDistribution <p>独享集群 CDB 实例的节点分布情况。</p>
     */
    public NodeDistribution getNodeDistribution() {
        return this.NodeDistribution;
    }

    /**
     * Set <p>独享集群 CDB 实例的节点分布情况。</p>
     * @param NodeDistribution <p>独享集群 CDB 实例的节点分布情况。</p>
     */
    public void setNodeDistribution(NodeDistribution NodeDistribution) {
        this.NodeDistribution = NodeDistribution;
    }

    /**
     * Get <p>云盘版的节点拓扑配置。Nodeld 信息可通过 <a href="https://cloud.tencent.com/document/api/236/105116">DescribeClusterInfo</a> 接口获取。</p> 
     * @return ClusterTopology <p>云盘版的节点拓扑配置。Nodeld 信息可通过 <a href="https://cloud.tencent.com/document/api/236/105116">DescribeClusterInfo</a> 接口获取。</p>
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set <p>云盘版的节点拓扑配置。Nodeld 信息可通过 <a href="https://cloud.tencent.com/document/api/236/105116">DescribeClusterInfo</a> 接口获取。</p>
     * @param ClusterTopology <p>云盘版的节点拓扑配置。Nodeld 信息可通过 <a href="https://cloud.tencent.com/document/api/236/105116">DescribeClusterInfo</a> 接口获取。</p>
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

