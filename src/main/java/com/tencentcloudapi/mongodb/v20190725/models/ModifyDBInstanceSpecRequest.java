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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSpecRequest extends AbstractModel {

    /**
    * 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
**注意**：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
- 降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * (已废弃) 请使用ResizeOplog独立接口完成。

实例配置变更后 Oplog 的大小。
- 单位：GB。
- 默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。
    */
    @SerializedName("OplogSize")
    @Expose
    private Long OplogSize;

    /**
    * 实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。
-  副本集节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。
-  分片集群每个分片节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。
**说明**：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 实例变更后的分片数。
- 请通过 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 接口返回的参数**MinReplicateSetNum**与**MaxReplicateSetNum**获取实例分片数取值范围。
- 实例分片数量只允许增加不允许减少。
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * 实例配置变更的切换时间。
- 0：调整完成时，立即执行变配任务。默认为0。
- 1：在维护时间窗内，执行变配任务。
**说明**：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
    * 分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
    */
    @SerializedName("MongosMemory")
    @Expose
    private String MongosMemory;

    /**
    * 新增节点列表，节点类型及可用区信息。
    */
    @SerializedName("AddNodeList")
    @Expose
    private AddNodeList [] AddNodeList;

    /**
    * 删除节点列表。
**注意**：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。
    */
    @SerializedName("RemoveNodeList")
    @Expose
    private RemoveNodeList [] RemoveNodeList;

    /**
     * Get 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
**注意**：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。 
     * @return Memory 实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
**注意**：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
**注意**：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
     * @param Memory 实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
**注意**：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
- 降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。 
     * @return Volume 实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
- 降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
- 降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。
     * @param Volume 实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
- 降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get (已废弃) 请使用ResizeOplog独立接口完成。

实例配置变更后 Oplog 的大小。
- 单位：GB。
- 默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。 
     * @return OplogSize (已废弃) 请使用ResizeOplog独立接口完成。

实例配置变更后 Oplog 的大小。
- 单位：GB。
- 默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。
     * @deprecated
     */
    @Deprecated
    public Long getOplogSize() {
        return this.OplogSize;
    }

    /**
     * Set (已废弃) 请使用ResizeOplog独立接口完成。

实例配置变更后 Oplog 的大小。
- 单位：GB。
- 默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。
     * @param OplogSize (已废弃) 请使用ResizeOplog独立接口完成。

实例配置变更后 Oplog 的大小。
- 单位：GB。
- 默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。
     * @deprecated
     */
    @Deprecated
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * Get 实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。
-  副本集节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。
-  分片集群每个分片节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。
**说明**：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。 
     * @return NodeNum 实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。
-  副本集节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。
-  分片集群每个分片节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。
**说明**：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。
-  副本集节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。
-  分片集群每个分片节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。
**说明**：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。
     * @param NodeNum 实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。
-  副本集节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。
-  分片集群每个分片节点数：请通过 [DescribeSpecInfo ](https://cloud.tencent.com/document/product/240/38567)接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。
**说明**：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 实例变更后的分片数。
- 请通过 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 接口返回的参数**MinReplicateSetNum**与**MaxReplicateSetNum**获取实例分片数取值范围。
- 实例分片数量只允许增加不允许减少。 
     * @return ReplicateSetNum 实例变更后的分片数。
- 请通过 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 接口返回的参数**MinReplicateSetNum**与**MaxReplicateSetNum**获取实例分片数取值范围。
- 实例分片数量只允许增加不允许减少。
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set 实例变更后的分片数。
- 请通过 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 接口返回的参数**MinReplicateSetNum**与**MaxReplicateSetNum**获取实例分片数取值范围。
- 实例分片数量只允许增加不允许减少。
     * @param ReplicateSetNum 实例变更后的分片数。
- 请通过 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 接口返回的参数**MinReplicateSetNum**与**MaxReplicateSetNum**获取实例分片数取值范围。
- 实例分片数量只允许增加不允许减少。
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get 实例配置变更的切换时间。
- 0：调整完成时，立即执行变配任务。默认为0。
- 1：在维护时间窗内，执行变配任务。
**说明**：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。 
     * @return InMaintenance 实例配置变更的切换时间。
- 0：调整完成时，立即执行变配任务。默认为0。
- 1：在维护时间窗内，执行变配任务。
**说明**：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set 实例配置变更的切换时间。
- 0：调整完成时，立即执行变配任务。默认为0。
- 1：在维护时间窗内，执行变配任务。
**说明**：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。
     * @param InMaintenance 实例配置变更的切换时间。
- 0：调整完成时，立即执行变配任务。默认为0。
- 1：在维护时间窗内，执行变配任务。
**说明**：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    /**
     * Get 分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。 
     * @return MongosMemory 分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
     */
    public String getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set 分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
     * @param MongosMemory 分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见[产品规格](https://cloud.tencent.com/document/product/240/64125)。
     */
    public void setMongosMemory(String MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get 新增节点列表，节点类型及可用区信息。 
     * @return AddNodeList 新增节点列表，节点类型及可用区信息。
     */
    public AddNodeList [] getAddNodeList() {
        return this.AddNodeList;
    }

    /**
     * Set 新增节点列表，节点类型及可用区信息。
     * @param AddNodeList 新增节点列表，节点类型及可用区信息。
     */
    public void setAddNodeList(AddNodeList [] AddNodeList) {
        this.AddNodeList = AddNodeList;
    }

    /**
     * Get 删除节点列表。
**注意**：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。 
     * @return RemoveNodeList 删除节点列表。
**注意**：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。
     */
    public RemoveNodeList [] getRemoveNodeList() {
        return this.RemoveNodeList;
    }

    /**
     * Set 删除节点列表。
**注意**：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。
     * @param RemoveNodeList 删除节点列表。
**注意**：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。
     */
    public void setRemoveNodeList(RemoveNodeList [] RemoveNodeList) {
        this.RemoveNodeList = RemoveNodeList;
    }

    public ModifyDBInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSpecRequest(ModifyDBInstanceSpecRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.OplogSize != null) {
            this.OplogSize = new Long(source.OplogSize);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.InMaintenance != null) {
            this.InMaintenance = new Long(source.InMaintenance);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new String(source.MongosMemory);
        }
        if (source.AddNodeList != null) {
            this.AddNodeList = new AddNodeList[source.AddNodeList.length];
            for (int i = 0; i < source.AddNodeList.length; i++) {
                this.AddNodeList[i] = new AddNodeList(source.AddNodeList[i]);
            }
        }
        if (source.RemoveNodeList != null) {
            this.RemoveNodeList = new RemoveNodeList[source.RemoveNodeList.length];
            for (int i = 0; i < source.RemoveNodeList.length; i++) {
                this.RemoveNodeList[i] = new RemoveNodeList(source.RemoveNodeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "OplogSize", this.OplogSize);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "InMaintenance", this.InMaintenance);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamArrayObj(map, prefix + "AddNodeList.", this.AddNodeList);
        this.setParamArrayObj(map, prefix + "RemoveNodeList.", this.RemoveNodeList);

    }
}

