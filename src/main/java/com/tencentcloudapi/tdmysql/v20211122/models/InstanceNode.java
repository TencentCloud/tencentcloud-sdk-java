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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNode extends AbstractModel {

    /**
    * 主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 实例Ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 实例EniIp
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * 实例Port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 实例SpecCode
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * 实例NodeName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 实例Cpu
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例Mem
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 实例Disk
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * 实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 实例地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例LocalDNS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDNS")
    @Expose
    private String LocalDNS;

    /**
    * 实例Region
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例日志盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogDisk")
    @Expose
    private Long LogDisk;

    /**
    * 实例数据盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisk")
    @Expose
    private Long DataDisk;

    /**
    * 实例ZoneID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneID")
    @Expose
    private String ZoneID;

    /**
    * 实例SpecName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 实例Replicas
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 实例Shards
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Shards")
    @Expose
    private Long Shards;

    /**
    * 实例数据副本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataReplicas")
    @Expose
    private Long DataReplicas;

    /**
    * 实例初始化参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 存储介质, CLOUD_PREMIUM:高性能云盘，CLOUD_SSD: SSD 云盘，CLOUD_HSSD: HSSD 云盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get 主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId Node Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId Node Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 实例Ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 实例Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 实例Ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 实例Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 实例EniIp
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EniIp 实例EniIp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set 实例EniIp
注意：此字段可能返回 null，表示取不到有效值。
     * @param EniIp 实例EniIp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get 实例Port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 实例Port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例Port
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 实例Port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 实例SpecCode
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecCode 实例SpecCode
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set 实例SpecCode
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecCode 实例SpecCode
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get 实例NodeName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 实例NodeName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 实例NodeName
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 实例NodeName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 实例Cpu
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu 实例Cpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例Cpu
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu 实例Cpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例Mem
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mem 实例Mem
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 实例Mem
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mem 实例Mem
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 实例Disk
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disk 实例Disk
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set 实例Disk
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disk 实例Disk
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get 实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 实例版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 实例版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 实例版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 实例地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 实例地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 实例地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例LocalDNS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDNS 实例LocalDNS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalDNS() {
        return this.LocalDNS;
    }

    /**
     * Set 实例LocalDNS
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDNS 实例LocalDNS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDNS(String LocalDNS) {
        this.LocalDNS = LocalDNS;
    }

    /**
     * Get 实例Region
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 实例Region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例Region
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 实例Region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例日志盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogDisk 实例日志盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogDisk() {
        return this.LogDisk;
    }

    /**
     * Set 实例日志盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogDisk 实例日志盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogDisk(Long LogDisk) {
        this.LogDisk = LogDisk;
    }

    /**
     * Get 实例数据盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisk 实例数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set 实例数据盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisk 实例数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisk(Long DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get 实例ZoneID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneID 实例ZoneID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set 实例ZoneID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneID 实例ZoneID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneID(String ZoneID) {
        this.ZoneID = ZoneID;
    }

    /**
     * Get 实例SpecName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecName 实例SpecName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 实例SpecName
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName 实例SpecName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 实例Replicas
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas 实例Replicas
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 实例Replicas
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 实例Replicas
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 实例Shards
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Shards 实例Shards
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShards() {
        return this.Shards;
    }

    /**
     * Set 实例Shards
注意：此字段可能返回 null，表示取不到有效值。
     * @param Shards 实例Shards
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShards(Long Shards) {
        this.Shards = Shards;
    }

    /**
     * Get 实例数据副本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataReplicas 实例数据副本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataReplicas() {
        return this.DataReplicas;
    }

    /**
     * Set 实例数据副本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataReplicas 实例数据副本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataReplicas(Long DataReplicas) {
        this.DataReplicas = DataReplicas;
    }

    /**
     * Get 实例初始化参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 实例初始化参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 实例初始化参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 实例初始化参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 存储介质, CLOUD_PREMIUM:高性能云盘，CLOUD_SSD: SSD 云盘，CLOUD_HSSD: HSSD 云盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 存储介质, CLOUD_PREMIUM:高性能云盘，CLOUD_SSD: SSD 云盘，CLOUD_HSSD: HSSD 云盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储介质, CLOUD_PREMIUM:高性能云盘，CLOUD_SSD: SSD 云盘，CLOUD_HSSD: HSSD 云盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 存储介质, CLOUD_PREMIUM:高性能云盘，CLOUD_SSD: SSD 云盘，CLOUD_HSSD: HSSD 云盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public InstanceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNode(InstanceNode source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.EniIp != null) {
            this.EniIp = new String(source.EniIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.LocalDNS != null) {
            this.LocalDNS = new String(source.LocalDNS);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogDisk != null) {
            this.LogDisk = new Long(source.LogDisk);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new Long(source.DataDisk);
        }
        if (source.ZoneID != null) {
            this.ZoneID = new String(source.ZoneID);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.Shards != null) {
            this.Shards = new Long(source.Shards);
        }
        if (source.DataReplicas != null) {
            this.DataReplicas = new Long(source.DataReplicas);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "LocalDNS", this.LocalDNS);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogDisk", this.LogDisk);
        this.setParamSimple(map, prefix + "DataDisk", this.DataDisk);
        this.setParamSimple(map, prefix + "ZoneID", this.ZoneID);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Shards", this.Shards);
        this.setParamSimple(map, prefix + "DataReplicas", this.DataReplicas);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

