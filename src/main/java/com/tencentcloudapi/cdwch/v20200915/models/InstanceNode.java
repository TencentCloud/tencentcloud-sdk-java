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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNode extends AbstractModel {

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 机型，如 S1
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * cpu核数
    */
    @SerializedName("Core")
    @Expose
    private Long Core;

    /**
    * 内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 磁盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 所属clickhouse cluster名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 节点所属的分组信息
    */
    @SerializedName("NodeGroups")
    @Expose
    private GroupInfo [] NodeGroups;

    /**
    * VPC IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rip")
    @Expose
    private String Rip;

    /**
    * ture的时候表示该节点上部署了chproxy进程
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCHProxy")
    @Expose
    private Boolean IsCHProxy;

    /**
    * 节点状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 节点uuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 区描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

    /**
    * 真实资源id
    */
    @SerializedName("RealResourceId")
    @Expose
    private String RealResourceId;

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 机型，如 S1 
     * @return Spec 机型，如 S1
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 机型，如 S1
     * @param Spec 机型，如 S1
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get cpu核数 
     * @return Core cpu核数
     */
    public Long getCore() {
        return this.Core;
    }

    /**
     * Set cpu核数
     * @param Core cpu核数
     */
    public void setCore(Long Core) {
        this.Core = Core;
    }

    /**
     * Get 内存大小 
     * @return Memory 内存大小
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小
     * @param Memory 内存大小
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘类型 
     * @return DiskType 磁盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型
     * @param DiskType 磁盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘大小 
     * @return DiskSize 磁盘大小
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小
     * @param DiskSize 磁盘大小
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 所属clickhouse cluster名称 
     * @return Cluster 所属clickhouse cluster名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 所属clickhouse cluster名称
     * @param Cluster 所属clickhouse cluster名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 节点所属的分组信息 
     * @return NodeGroups 节点所属的分组信息
     */
    public GroupInfo [] getNodeGroups() {
        return this.NodeGroups;
    }

    /**
     * Set 节点所属的分组信息
     * @param NodeGroups 节点所属的分组信息
     */
    public void setNodeGroups(GroupInfo [] NodeGroups) {
        this.NodeGroups = NodeGroups;
    }

    /**
     * Get VPC IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rip VPC IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRip() {
        return this.Rip;
    }

    /**
     * Set VPC IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rip VPC IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRip(String Rip) {
        this.Rip = Rip;
    }

    /**
     * Get ture的时候表示该节点上部署了chproxy进程
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCHProxy ture的时候表示该节点上部署了chproxy进程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCHProxy() {
        return this.IsCHProxy;
    }

    /**
     * Set ture的时候表示该节点上部署了chproxy进程
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCHProxy ture的时候表示该节点上部署了chproxy进程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCHProxy(Boolean IsCHProxy) {
        this.IsCHProxy = IsCHProxy;
    }

    /**
     * Get 节点状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 节点uuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UUID 节点uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 节点uuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param UUID 节点uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 区描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneDesc 区描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set 区描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneDesc 区描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
    }

    /**
     * Get 真实资源id 
     * @return RealResourceId 真实资源id
     */
    public String getRealResourceId() {
        return this.RealResourceId;
    }

    /**
     * Set 真实资源id
     * @param RealResourceId 真实资源id
     */
    public void setRealResourceId(String RealResourceId) {
        this.RealResourceId = RealResourceId;
    }

    public InstanceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNode(InstanceNode source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Core != null) {
            this.Core = new Long(source.Core);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Cluster != null) {
            this.Cluster = new String(source.Cluster);
        }
        if (source.NodeGroups != null) {
            this.NodeGroups = new GroupInfo[source.NodeGroups.length];
            for (int i = 0; i < source.NodeGroups.length; i++) {
                this.NodeGroups[i] = new GroupInfo(source.NodeGroups[i]);
            }
        }
        if (source.Rip != null) {
            this.Rip = new String(source.Rip);
        }
        if (source.IsCHProxy != null) {
            this.IsCHProxy = new Boolean(source.IsCHProxy);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneDesc != null) {
            this.ZoneDesc = new String(source.ZoneDesc);
        }
        if (source.RealResourceId != null) {
            this.RealResourceId = new String(source.RealResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Core", this.Core);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamArrayObj(map, prefix + "NodeGroups.", this.NodeGroups);
        this.setParamSimple(map, prefix + "Rip", this.Rip);
        this.setParamSimple(map, prefix + "IsCHProxy", this.IsCHProxy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneDesc", this.ZoneDesc);
        this.setParamSimple(map, prefix + "RealResourceId", this.RealResourceId);

    }
}

