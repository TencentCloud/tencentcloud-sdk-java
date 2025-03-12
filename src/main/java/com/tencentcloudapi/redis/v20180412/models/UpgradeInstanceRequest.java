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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel {

    /**
    * 待变更实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指实例每个分片内存变更后的大小。<ul><li>单位 MB。</li><li>每次只能修改参数MemSize、RedisShardNum和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>缩容时，缩容后的规格务必要大于等于使用容量的1.3倍，否则将执行失败。</li></ul>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 指实例变更后的分片数量。<ul><li>标准架构不需要配置该参数，集群架构为必填参数。</li><li>集群架构，每次只能修改参数RedisShardNum、MemSize和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li></ul>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 指实例变更后的副本数量。<ul><li>每次只能修改参数RedisReplicasNum、MemSize和RedisShardNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>多AZ实例修改副本时必须要传入NodeSet。</li></ul>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 多AZ实例，增加副本时的节点信息，包括副本的 ID 编号及可用区信息。非多AZ实例不需要配置该参数。
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * 切换时间。 
- 1：维护时间窗操作：在设置的维护时间窗内执行操作。请通过接口[DescribeMaintenanceWindow](https://cloud.tencent.com/document/product/239/46336)查询设置的维护时间窗时间段。缩副本、扩缩分片、扩内存均支持在维护时间窗执行操作。
- 2：立即操作：默认切换时刻。操作将立即执行，无需等待维护时间窗。
    */
    @SerializedName("SwitchOption")
    @Expose
    private Long SwitchOption;

    /**
     * Get 待变更实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。 
     * @return InstanceId 待变更实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待变更实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     * @param InstanceId 待变更实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指实例每个分片内存变更后的大小。<ul><li>单位 MB。</li><li>每次只能修改参数MemSize、RedisShardNum和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>缩容时，缩容后的规格务必要大于等于使用容量的1.3倍，否则将执行失败。</li></ul> 
     * @return MemSize 指实例每个分片内存变更后的大小。<ul><li>单位 MB。</li><li>每次只能修改参数MemSize、RedisShardNum和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>缩容时，缩容后的规格务必要大于等于使用容量的1.3倍，否则将执行失败。</li></ul>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 指实例每个分片内存变更后的大小。<ul><li>单位 MB。</li><li>每次只能修改参数MemSize、RedisShardNum和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>缩容时，缩容后的规格务必要大于等于使用容量的1.3倍，否则将执行失败。</li></ul>
     * @param MemSize 指实例每个分片内存变更后的大小。<ul><li>单位 MB。</li><li>每次只能修改参数MemSize、RedisShardNum和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>缩容时，缩容后的规格务必要大于等于使用容量的1.3倍，否则将执行失败。</li></ul>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 指实例变更后的分片数量。<ul><li>标准架构不需要配置该参数，集群架构为必填参数。</li><li>集群架构，每次只能修改参数RedisShardNum、MemSize和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li></ul> 
     * @return RedisShardNum 指实例变更后的分片数量。<ul><li>标准架构不需要配置该参数，集群架构为必填参数。</li><li>集群架构，每次只能修改参数RedisShardNum、MemSize和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li></ul>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 指实例变更后的分片数量。<ul><li>标准架构不需要配置该参数，集群架构为必填参数。</li><li>集群架构，每次只能修改参数RedisShardNum、MemSize和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li></ul>
     * @param RedisShardNum 指实例变更后的分片数量。<ul><li>标准架构不需要配置该参数，集群架构为必填参数。</li><li>集群架构，每次只能修改参数RedisShardNum、MemSize和RedisReplicasNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li></ul>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 指实例变更后的副本数量。<ul><li>每次只能修改参数RedisReplicasNum、MemSize和RedisShardNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>多AZ实例修改副本时必须要传入NodeSet。</li></ul> 
     * @return RedisReplicasNum 指实例变更后的副本数量。<ul><li>每次只能修改参数RedisReplicasNum、MemSize和RedisShardNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>多AZ实例修改副本时必须要传入NodeSet。</li></ul>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 指实例变更后的副本数量。<ul><li>每次只能修改参数RedisReplicasNum、MemSize和RedisShardNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>多AZ实例修改副本时必须要传入NodeSet。</li></ul>
     * @param RedisReplicasNum 指实例变更后的副本数量。<ul><li>每次只能修改参数RedisReplicasNum、MemSize和RedisShardNum其中的一个，不能同时修改。且修改其中一个参数时，其他两个参数需输入实例原有的配置规格。</li><li>多AZ实例修改副本时必须要传入NodeSet。</li></ul>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 多AZ实例，增加副本时的节点信息，包括副本的 ID 编号及可用区信息。非多AZ实例不需要配置该参数。 
     * @return NodeSet 多AZ实例，增加副本时的节点信息，包括副本的 ID 编号及可用区信息。非多AZ实例不需要配置该参数。
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set 多AZ实例，增加副本时的节点信息，包括副本的 ID 编号及可用区信息。非多AZ实例不需要配置该参数。
     * @param NodeSet 多AZ实例，增加副本时的节点信息，包括副本的 ID 编号及可用区信息。非多AZ实例不需要配置该参数。
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get 切换时间。 
- 1：维护时间窗操作：在设置的维护时间窗内执行操作。请通过接口[DescribeMaintenanceWindow](https://cloud.tencent.com/document/product/239/46336)查询设置的维护时间窗时间段。缩副本、扩缩分片、扩内存均支持在维护时间窗执行操作。
- 2：立即操作：默认切换时刻。操作将立即执行，无需等待维护时间窗。 
     * @return SwitchOption 切换时间。 
- 1：维护时间窗操作：在设置的维护时间窗内执行操作。请通过接口[DescribeMaintenanceWindow](https://cloud.tencent.com/document/product/239/46336)查询设置的维护时间窗时间段。缩副本、扩缩分片、扩内存均支持在维护时间窗执行操作。
- 2：立即操作：默认切换时刻。操作将立即执行，无需等待维护时间窗。
     */
    public Long getSwitchOption() {
        return this.SwitchOption;
    }

    /**
     * Set 切换时间。 
- 1：维护时间窗操作：在设置的维护时间窗内执行操作。请通过接口[DescribeMaintenanceWindow](https://cloud.tencent.com/document/product/239/46336)查询设置的维护时间窗时间段。缩副本、扩缩分片、扩内存均支持在维护时间窗执行操作。
- 2：立即操作：默认切换时刻。操作将立即执行，无需等待维护时间窗。
     * @param SwitchOption 切换时间。 
- 1：维护时间窗操作：在设置的维护时间窗内执行操作。请通过接口[DescribeMaintenanceWindow](https://cloud.tencent.com/document/product/239/46336)查询设置的维护时间窗时间段。缩副本、扩缩分片、扩内存均支持在维护时间窗执行操作。
- 2：立即操作：默认切换时刻。操作将立即执行，无需等待维护时间窗。
     */
    public void setSwitchOption(Long SwitchOption) {
        this.SwitchOption = SwitchOption;
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
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.SwitchOption != null) {
            this.SwitchOption = new Long(source.SwitchOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "SwitchOption", this.SwitchOption);

    }
}

