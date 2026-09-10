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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel {

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>配置变更后，每个分片持久化内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>CPU 核数，可忽略不传</p>
    */
    @SerializedName("MachineCpu")
    @Expose
    private Long MachineCpu;

    /**
    * <p>实例内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
    */
    @SerializedName("MachineMemory")
    @Expose
    private Long MachineMemory;

    /**
    * <p>配置变更后，分片数量。</p><ul><li>增加后分片的数量务必为增加之前数量的整数倍。分片数量支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * <p>配置变更后，每个分片硬盘的容量。单位：GB。</p><ul><li>每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>配置变更后，副本数量。需要和NodeSet参数一起传递。</p><p>取值范围：[1, 2]</p>
    */
    @SerializedName("ReplicasNum")
    @Expose
    private Long ReplicasNum;

    /**
    * <p>配置变更后，副本节点信息。</p><ul><li>增加副本：可不传NodeId</li><li>删除副本：需传保留节点的NodeId</li></ul>
    */
    @SerializedName("NodeSet")
    @Expose
    private NodeInfo [] NodeSet;

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceId <p>实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceId <p>实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>配置变更后，每个分片持久化内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul> 
     * @return MemSize <p>配置变更后，每个分片持久化内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>配置变更后，每个分片持久化内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     * @param MemSize <p>配置变更后，每个分片持久化内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>CPU 核数，可忽略不传</p> 
     * @return MachineCpu <p>CPU 核数，可忽略不传</p>
     */
    public Long getMachineCpu() {
        return this.MachineCpu;
    }

    /**
     * Set <p>CPU 核数，可忽略不传</p>
     * @param MachineCpu <p>CPU 核数，可忽略不传</p>
     */
    public void setMachineCpu(Long MachineCpu) {
        this.MachineCpu = MachineCpu;
    }

    /**
     * Get <p>实例内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul> 
     * @return MachineMemory <p>实例内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     */
    public Long getMachineMemory() {
        return this.MachineMemory;
    }

    /**
     * Set <p>实例内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     * @param MachineMemory <p>实例内存容量，单位：GB。</p><ul><li>KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     */
    public void setMachineMemory(Long MachineMemory) {
        this.MachineMemory = MachineMemory;
    }

    /**
     * Get <p>配置变更后，分片数量。</p><ul><li>增加后分片的数量务必为增加之前数量的整数倍。分片数量支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul> 
     * @return ShardNum <p>配置变更后，分片数量。</p><ul><li>增加后分片的数量务必为增加之前数量的整数倍。分片数量支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set <p>配置变更后，分片数量。</p><ul><li>增加后分片的数量务必为增加之前数量的整数倍。分片数量支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     * @param ShardNum <p>配置变更后，分片数量。</p><ul><li>增加后分片的数量务必为增加之前数量的整数倍。分片数量支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get <p>配置变更后，每个分片硬盘的容量。单位：GB。</p><ul><li>每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul> 
     * @return DiskSize <p>配置变更后，每个分片硬盘的容量。单位：GB。</p><ul><li>每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>配置变更后，每个分片硬盘的容量。单位：GB。</p><ul><li>每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     * @param DiskSize <p>配置变更后，每个分片硬盘的容量。单位：GB。</p><ul><li>每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见[产品规格](https://cloud.tencent.com/document/product/1520/80808)。</li><li>变更实例内存、持久化内存与磁盘、变更实例的分片数量，每次只能变更一项。</li></ul>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>配置变更后，副本数量。需要和NodeSet参数一起传递。</p><p>取值范围：[1, 2]</p> 
     * @return ReplicasNum <p>配置变更后，副本数量。需要和NodeSet参数一起传递。</p><p>取值范围：[1, 2]</p>
     */
    public Long getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set <p>配置变更后，副本数量。需要和NodeSet参数一起传递。</p><p>取值范围：[1, 2]</p>
     * @param ReplicasNum <p>配置变更后，副本数量。需要和NodeSet参数一起传递。</p><p>取值范围：[1, 2]</p>
     */
    public void setReplicasNum(Long ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
    }

    /**
     * Get <p>配置变更后，副本节点信息。</p><ul><li>增加副本：可不传NodeId</li><li>删除副本：需传保留节点的NodeId</li></ul> 
     * @return NodeSet <p>配置变更后，副本节点信息。</p><ul><li>增加副本：可不传NodeId</li><li>删除副本：需传保留节点的NodeId</li></ul>
     */
    public NodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set <p>配置变更后，副本节点信息。</p><ul><li>增加副本：可不传NodeId</li><li>删除副本：需传保留节点的NodeId</li></ul>
     * @param NodeSet <p>配置变更后，副本节点信息。</p><ul><li>增加副本：可不传NodeId</li><li>删除副本：需传保留节点的NodeId</li></ul>
     */
    public void setNodeSet(NodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    public UpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceRequest(UpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MachineCpu != null) {
            this.MachineCpu = new Long(source.MachineCpu);
        }
        if (source.MachineMemory != null) {
            this.MachineMemory = new Long(source.MachineMemory);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new Long(source.ReplicasNum);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new NodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new NodeInfo(source.NodeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MachineCpu", this.MachineCpu);
        this.setParamSimple(map, prefix + "MachineMemory", this.MachineMemory);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);

    }
}

