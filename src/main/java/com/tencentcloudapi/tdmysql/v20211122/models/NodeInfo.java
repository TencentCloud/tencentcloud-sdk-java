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

public class NodeInfo extends AbstractModel {

    /**
    * <p>节点IP信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * <p>节点类型，如sqlengine，tdstore，mc</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>节点唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点端口信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>节点所属可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>节点所属机器ip</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>节点日志服务信息</p>
    */
    @SerializedName("BinlogInfo")
    @Expose
    private BinlogInfo [] BinlogInfo;

    /**
    * <p>节点cpu个数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>节点mem大小</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>节点磁盘大小</p>
    */
    @SerializedName("DataDisk")
    @Expose
    private Long DataDisk;

    /**
     * Get <p>节点IP信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP <p>节点IP信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set <p>节点IP信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP <p>节点IP信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get <p>节点类型，如sqlengine，tdstore，mc</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>节点类型，如sqlengine，tdstore，mc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>节点类型，如sqlengine，tdstore，mc</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>节点类型，如sqlengine，tdstore，mc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>节点唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId <p>节点唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId <p>节点唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点端口信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port <p>节点端口信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>节点端口信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port <p>节点端口信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>节点所属可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone <p>节点所属可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>节点所属可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone <p>节点所属可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>节点所属机器ip</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host <p>节点所属机器ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>节点所属机器ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host <p>节点所属机器ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>节点日志服务信息</p> 
     * @return BinlogInfo <p>节点日志服务信息</p>
     */
    public BinlogInfo [] getBinlogInfo() {
        return this.BinlogInfo;
    }

    /**
     * Set <p>节点日志服务信息</p>
     * @param BinlogInfo <p>节点日志服务信息</p>
     */
    public void setBinlogInfo(BinlogInfo [] BinlogInfo) {
        this.BinlogInfo = BinlogInfo;
    }

    /**
     * Get <p>节点cpu个数</p> 
     * @return Cpu <p>节点cpu个数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>节点cpu个数</p>
     * @param Cpu <p>节点cpu个数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>节点mem大小</p> 
     * @return Mem <p>节点mem大小</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>节点mem大小</p>
     * @param Mem <p>节点mem大小</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>节点磁盘大小</p> 
     * @return DataDisk <p>节点磁盘大小</p>
     */
    public Long getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set <p>节点磁盘大小</p>
     * @param DataDisk <p>节点磁盘大小</p>
     */
    public void setDataDisk(Long DataDisk) {
        this.DataDisk = DataDisk;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.BinlogInfo != null) {
            this.BinlogInfo = new BinlogInfo[source.BinlogInfo.length];
            for (int i = 0; i < source.BinlogInfo.length; i++) {
                this.BinlogInfo[i] = new BinlogInfo(source.BinlogInfo[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new Long(source.DataDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamArrayObj(map, prefix + "BinlogInfo.", this.BinlogInfo);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "DataDisk", this.DataDisk);

    }
}

