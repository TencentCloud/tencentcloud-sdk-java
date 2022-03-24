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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分片大小 单位 MB。该参数不支持与RedisShardNum或RedisReplicasNum同时输入。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 分片数量，标准架构不需要填写。该参数不支持与RedisReplicasNum或MemSize同时输入。
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 副本数量，多AZ实例修改副本时必须要传入NodeSet。该参数不支持与RedisShardNum或MemSize同时输入。
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 多AZ实例增加副本时的附带信息，非多AZ实例不需要传此参数。多AZ增加副本时此参数为必传参数，传入要增加的副本的信息，包括副本的可用区和副本的类型（NodeType为1）
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分片大小 单位 MB。该参数不支持与RedisShardNum或RedisReplicasNum同时输入。 
     * @return MemSize 分片大小 单位 MB。该参数不支持与RedisShardNum或RedisReplicasNum同时输入。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 分片大小 单位 MB。该参数不支持与RedisShardNum或RedisReplicasNum同时输入。
     * @param MemSize 分片大小 单位 MB。该参数不支持与RedisShardNum或RedisReplicasNum同时输入。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 分片数量，标准架构不需要填写。该参数不支持与RedisReplicasNum或MemSize同时输入。 
     * @return RedisShardNum 分片数量，标准架构不需要填写。该参数不支持与RedisReplicasNum或MemSize同时输入。
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 分片数量，标准架构不需要填写。该参数不支持与RedisReplicasNum或MemSize同时输入。
     * @param RedisShardNum 分片数量，标准架构不需要填写。该参数不支持与RedisReplicasNum或MemSize同时输入。
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 副本数量，多AZ实例修改副本时必须要传入NodeSet。该参数不支持与RedisShardNum或MemSize同时输入。 
     * @return RedisReplicasNum 副本数量，多AZ实例修改副本时必须要传入NodeSet。该参数不支持与RedisShardNum或MemSize同时输入。
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 副本数量，多AZ实例修改副本时必须要传入NodeSet。该参数不支持与RedisShardNum或MemSize同时输入。
     * @param RedisReplicasNum 副本数量，多AZ实例修改副本时必须要传入NodeSet。该参数不支持与RedisShardNum或MemSize同时输入。
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 多AZ实例增加副本时的附带信息，非多AZ实例不需要传此参数。多AZ增加副本时此参数为必传参数，传入要增加的副本的信息，包括副本的可用区和副本的类型（NodeType为1） 
     * @return NodeSet 多AZ实例增加副本时的附带信息，非多AZ实例不需要传此参数。多AZ增加副本时此参数为必传参数，传入要增加的副本的信息，包括副本的可用区和副本的类型（NodeType为1）
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set 多AZ实例增加副本时的附带信息，非多AZ实例不需要传此参数。多AZ增加副本时此参数为必传参数，传入要增加的副本的信息，包括副本的可用区和副本的类型（NodeType为1）
     * @param NodeSet 多AZ实例增加副本时的附带信息，非多AZ实例不需要传此参数。多AZ增加副本时此参数为必传参数，传入要增加的副本的信息，包括副本的可用区和副本的类型（NodeType为1）
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
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

    }
}

