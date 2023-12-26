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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSpecRequest extends AbstractModel {

    /**
    * 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例配置变更后的内存大小。
- 单位：GB。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例配置变更后的硬盘大小，单位：GB。<ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul>
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
    * 实例变更后的节点数(mongod节点或mongos节点或readonly节点调整后的节点数，具体类型取决于AddNodeList或RemoveNodeList参数的节点类型)。
<ul><li>副本集：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinNodeNum 与 MaxNodeNum 获取。</li><li>分片集群：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取。</li></ul>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 实例变更后的分片数。<ul><li>取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数MinReplicateSetNum与MaxReplicateSetNum获取。</li><li>该参数只能增加不能减少。</li></ul>
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * 实例配置变更的切换时间。<ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。
<b>说明</b>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul>
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
    * 新增节点属性列表。
    */
    @SerializedName("AddNodeList")
    @Expose
    private AddNodeList [] AddNodeList;

    /**
    * 删除节点属性列表。
    */
    @SerializedName("RemoveNodeList")
    @Expose
    private RemoveNodeList [] RemoveNodeList;

    /**
     * Get 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
 
     * @return InstanceId 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     * @param InstanceId 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例配置变更后的内存大小。
- 单位：GB。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。 
     * @return Memory 实例配置变更后的内存大小。
- 单位：GB。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例配置变更后的内存大小。
- 单位：GB。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
     * @param Memory 实例配置变更后的内存大小。
- 单位：GB。
- 内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例配置变更后的硬盘大小，单位：GB。<ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul> 
     * @return Volume 实例配置变更后的硬盘大小，单位：GB。<ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例配置变更后的硬盘大小，单位：GB。<ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul>
     * @param Volume 实例配置变更后的硬盘大小，单位：GB。<ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul>
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
     */
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
     */
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * Get 实例变更后的节点数(mongod节点或mongos节点或readonly节点调整后的节点数，具体类型取决于AddNodeList或RemoveNodeList参数的节点类型)。
<ul><li>副本集：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinNodeNum 与 MaxNodeNum 获取。</li><li>分片集群：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取。</li></ul> 
     * @return NodeNum 实例变更后的节点数(mongod节点或mongos节点或readonly节点调整后的节点数，具体类型取决于AddNodeList或RemoveNodeList参数的节点类型)。
<ul><li>副本集：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinNodeNum 与 MaxNodeNum 获取。</li><li>分片集群：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取。</li></ul>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 实例变更后的节点数(mongod节点或mongos节点或readonly节点调整后的节点数，具体类型取决于AddNodeList或RemoveNodeList参数的节点类型)。
<ul><li>副本集：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinNodeNum 与 MaxNodeNum 获取。</li><li>分片集群：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取。</li></ul>
     * @param NodeNum 实例变更后的节点数(mongod节点或mongos节点或readonly节点调整后的节点数，具体类型取决于AddNodeList或RemoveNodeList参数的节点类型)。
<ul><li>副本集：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinNodeNum 与 MaxNodeNum 获取。</li><li>分片集群：取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取。</li></ul>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 实例变更后的分片数。<ul><li>取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数MinReplicateSetNum与MaxReplicateSetNum获取。</li><li>该参数只能增加不能减少。</li></ul> 
     * @return ReplicateSetNum 实例变更后的分片数。<ul><li>取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数MinReplicateSetNum与MaxReplicateSetNum获取。</li><li>该参数只能增加不能减少。</li></ul>
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set 实例变更后的分片数。<ul><li>取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数MinReplicateSetNum与MaxReplicateSetNum获取。</li><li>该参数只能增加不能减少。</li></ul>
     * @param ReplicateSetNum 实例变更后的分片数。<ul><li>取值范围请通过云数据库的售卖规格（DescribeSpecInfo）接口返回的参数MinReplicateSetNum与MaxReplicateSetNum获取。</li><li>该参数只能增加不能减少。</li></ul>
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get 实例配置变更的切换时间。<ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。
<b>说明</b>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul> 
     * @return InMaintenance 实例配置变更的切换时间。<ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。
<b>说明</b>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul>
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set 实例配置变更的切换时间。<ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。
<b>说明</b>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul>
     * @param InMaintenance 实例配置变更的切换时间。<ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。
<b>说明</b>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul>
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    /**
     * Get 新增节点属性列表。 
     * @return AddNodeList 新增节点属性列表。
     */
    public AddNodeList [] getAddNodeList() {
        return this.AddNodeList;
    }

    /**
     * Set 新增节点属性列表。
     * @param AddNodeList 新增节点属性列表。
     */
    public void setAddNodeList(AddNodeList [] AddNodeList) {
        this.AddNodeList = AddNodeList;
    }

    /**
     * Get 删除节点属性列表。 
     * @return RemoveNodeList 删除节点属性列表。
     */
    public RemoveNodeList [] getRemoveNodeList() {
        return this.RemoveNodeList;
    }

    /**
     * Set 删除节点属性列表。
     * @param RemoveNodeList 删除节点属性列表。
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
        this.setParamArrayObj(map, prefix + "AddNodeList.", this.AddNodeList);
        this.setParamArrayObj(map, prefix + "RemoveNodeList.", this.RemoveNodeList);

    }
}

