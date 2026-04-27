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
    * <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。<br><strong>注意</strong>：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p><ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>(已废弃) 请使用ResizeOplog独立接口完成。</p><p>实例配置变更后 Oplog 的大小。</p><ul><li>单位：GB。</li><li>默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。</li></ul>
    */
    @SerializedName("OplogSize")
    @Expose
    private Long OplogSize;

    /**
    * <p>实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。</p><ul><li>副本集节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。</li><li>分片集群每个分片节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。<br><strong>说明</strong>：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。</li></ul>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>实例变更后的分片数。</p><ul><li>请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 接口返回的参数<strong>MinReplicateSetNum</strong>与<strong>MaxReplicateSetNum</strong>获取实例分片数取值范围。</li><li>实例分片数量只允许增加不允许减少。</li></ul>
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * <p>实例配置变更的切换时间。</p><ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。<br><strong>说明</strong>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul>
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
    * <p>分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p>
    */
    @SerializedName("MongosMemory")
    @Expose
    private String MongosMemory;

    /**
    * <p>新增节点列表，节点类型及可用区信息。</p>
    */
    @SerializedName("AddNodeList")
    @Expose
    private AddNodeList [] AddNodeList;

    /**
    * <p>删除节点列表。<br><strong>注意</strong>：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。</p>
    */
    @SerializedName("RemoveNodeList")
    @Expose
    private RemoveNodeList [] RemoveNodeList;

    /**
    * <p>实例配置变更后的CPU大小。单位：C。该参数为空值时，默认取实例当前的 CPU 大小。当前所支持的CPU规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>实例配置变更后的产品规格类型。该参数为空值时，默认取实例当前的产品规格类型。<br>当前支持的产品规格类型如下：<br>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：</p><ol><li>白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</li><li>通用 I 型不能变更到白名单规格类型</li></ol>
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
     * Get <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。<br><strong>注意</strong>：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</p> 
     * @return Memory <p>实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。<br><strong>注意</strong>：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。<br><strong>注意</strong>：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</p>
     * @param Memory <p>实例配置变更后的内存大小。单位：GB。该参数为空值时，默认取实例当前的内存大小。当前所支持的内存规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。<br><strong>注意</strong>：内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p><ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul> 
     * @return Volume <p>实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p><ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p><ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul>
     * @param Volume <p>实例配置变更后的硬盘大小，单位：GB。该参数为空值时，默认取当前实例的磁盘大小。当前所支持的磁盘容量，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p><ul><li>内存和磁盘必须同时升配或同时降配，即 Memory 与 Volume 需同时配置变更。</li><li>降配时，变更后的磁盘容量必须大于已用磁盘容量的1.2倍。</li></ul>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>(已废弃) 请使用ResizeOplog独立接口完成。</p><p>实例配置变更后 Oplog 的大小。</p><ul><li>单位：GB。</li><li>默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。</li></ul> 
     * @return OplogSize <p>(已废弃) 请使用ResizeOplog独立接口完成。</p><p>实例配置变更后 Oplog 的大小。</p><ul><li>单位：GB。</li><li>默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。</li></ul>
     * @deprecated
     */
    @Deprecated
    public Long getOplogSize() {
        return this.OplogSize;
    }

    /**
     * Set <p>(已废弃) 请使用ResizeOplog独立接口完成。</p><p>实例配置变更后 Oplog 的大小。</p><ul><li>单位：GB。</li><li>默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。</li></ul>
     * @param OplogSize <p>(已废弃) 请使用ResizeOplog独立接口完成。</p><p>实例配置变更后 Oplog 的大小。</p><ul><li>单位：GB。</li><li>默认 Oplog 占用容量为磁盘空间的10%。系统允许设置的 Oplog 容量范围为磁盘空间的[10%,90%]。</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * Get <p>实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。</p><ul><li>副本集节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。</li><li>分片集群每个分片节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。<br><strong>说明</strong>：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。</li></ul> 
     * @return NodeNum <p>实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。</p><ul><li>副本集节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。</li><li>分片集群每个分片节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。<br><strong>说明</strong>：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。</li></ul>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。</p><ul><li>副本集节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。</li><li>分片集群每个分片节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。<br><strong>说明</strong>：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。</li></ul>
     * @param NodeNum <p>实例变更后 mongod 的节点数（不包含 readonly 只读节点数）。</p><ul><li>副本集节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinNodeNum 与 MaxNodeNum 获取节点数量取值范围。</li><li>分片集群每个分片节点数：请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo </a>接口返回的参数 MinReplicateSetNodeNum 与 MaxReplicateSetNodeNum 获取节点数量取值范围。<br><strong>说明</strong>：变更 mongod 或 mongos 的 CPU 与内存规格时，该参数可以不配置或者输入当前 mongod 或 mongos（不包含readonly）节点数量。</li></ul>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>实例变更后的分片数。</p><ul><li>请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 接口返回的参数<strong>MinReplicateSetNum</strong>与<strong>MaxReplicateSetNum</strong>获取实例分片数取值范围。</li><li>实例分片数量只允许增加不允许减少。</li></ul> 
     * @return ReplicateSetNum <p>实例变更后的分片数。</p><ul><li>请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 接口返回的参数<strong>MinReplicateSetNum</strong>与<strong>MaxReplicateSetNum</strong>获取实例分片数取值范围。</li><li>实例分片数量只允许增加不允许减少。</li></ul>
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set <p>实例变更后的分片数。</p><ul><li>请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 接口返回的参数<strong>MinReplicateSetNum</strong>与<strong>MaxReplicateSetNum</strong>获取实例分片数取值范围。</li><li>实例分片数量只允许增加不允许减少。</li></ul>
     * @param ReplicateSetNum <p>实例变更后的分片数。</p><ul><li>请通过 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 接口返回的参数<strong>MinReplicateSetNum</strong>与<strong>MaxReplicateSetNum</strong>获取实例分片数取值范围。</li><li>实例分片数量只允许增加不允许减少。</li></ul>
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get <p>实例配置变更的切换时间。</p><ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。<br><strong>说明</strong>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul> 
     * @return InMaintenance <p>实例配置变更的切换时间。</p><ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。<br><strong>说明</strong>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul>
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set <p>实例配置变更的切换时间。</p><ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。<br><strong>说明</strong>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul>
     * @param InMaintenance <p>实例配置变更的切换时间。</p><ul><li>0：调整完成时，立即执行变配任务。默认为0。</li><li>1：在维护时间窗内，执行变配任务。<br><strong>说明</strong>：调整节点数和分片数不支持在<b>维护时间窗内</b>变更。</li></ul>
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    /**
     * Get <p>分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p> 
     * @return MongosMemory <p>分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p>
     */
    public String getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set <p>分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p>
     * @param MongosMemory <p>分片实例配置变更后的 mongos 内存大小。单位：GB。实例支持的规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p>
     */
    public void setMongosMemory(String MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get <p>新增节点列表，节点类型及可用区信息。</p> 
     * @return AddNodeList <p>新增节点列表，节点类型及可用区信息。</p>
     */
    public AddNodeList [] getAddNodeList() {
        return this.AddNodeList;
    }

    /**
     * Set <p>新增节点列表，节点类型及可用区信息。</p>
     * @param AddNodeList <p>新增节点列表，节点类型及可用区信息。</p>
     */
    public void setAddNodeList(AddNodeList [] AddNodeList) {
        this.AddNodeList = AddNodeList;
    }

    /**
     * Get <p>删除节点列表。<br><strong>注意</strong>：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。</p> 
     * @return RemoveNodeList <p>删除节点列表。<br><strong>注意</strong>：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。</p>
     */
    public RemoveNodeList [] getRemoveNodeList() {
        return this.RemoveNodeList;
    }

    /**
     * Set <p>删除节点列表。<br><strong>注意</strong>：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。</p>
     * @param RemoveNodeList <p>删除节点列表。<br><strong>注意</strong>：基于分片实例各片节点的一致性原则，删除分片实例节点时，只需指定0分片对应的节点即可，如：cmgo-9nl1czif_0-node-readonly0 将删除每个分片的第1个只读节点。</p>
     */
    public void setRemoveNodeList(RemoveNodeList [] RemoveNodeList) {
        this.RemoveNodeList = RemoveNodeList;
    }

    /**
     * Get <p>实例配置变更后的CPU大小。单位：C。该参数为空值时，默认取实例当前的 CPU 大小。当前所支持的CPU规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p> 
     * @return Cpu <p>实例配置变更后的CPU大小。单位：C。该参数为空值时，默认取实例当前的 CPU 大小。当前所支持的CPU规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例配置变更后的CPU大小。单位：C。该参数为空值时，默认取实例当前的 CPU 大小。当前所支持的CPU规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p>
     * @param Cpu <p>实例配置变更后的CPU大小。单位：C。该参数为空值时，默认取实例当前的 CPU 大小。当前所支持的CPU规格，请参见<a href="https://cloud.tencent.com/document/product/240/64125">产品规格</a>。</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>实例配置变更后的产品规格类型。该参数为空值时，默认取实例当前的产品规格类型。<br>当前支持的产品规格类型如下：<br>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：</p><ol><li>白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</li><li>通用 I 型不能变更到白名单规格类型</li></ol> 
     * @return MachineCode <p>实例配置变更后的产品规格类型。该参数为空值时，默认取实例当前的产品规格类型。<br>当前支持的产品规格类型如下：<br>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：</p><ol><li>白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</li><li>通用 I 型不能变更到白名单规格类型</li></ol>
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set <p>实例配置变更后的产品规格类型。该参数为空值时，默认取实例当前的产品规格类型。<br>当前支持的产品规格类型如下：<br>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：</p><ol><li>白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</li><li>通用 I 型不能变更到白名单规格类型</li></ol>
     * @param MachineCode <p>实例配置变更后的产品规格类型。该参数为空值时，默认取实例当前的产品规格类型。<br>当前支持的产品规格类型如下：<br>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：</p><ol><li>白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</li><li>通用 I 型不能变更到白名单规格类型</li></ol>
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
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
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
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
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);

    }
}

