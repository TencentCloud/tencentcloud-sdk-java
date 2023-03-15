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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceRequest extends AbstractModel{

    /**
    * 实例唯一ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 调整clickhouse节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * v_cluster分组，	
新增扩容节点将加入到已选择的v_cluster分组中，提交同步VIP生效.
    */
    @SerializedName("ScaleOutCluster")
    @Expose
    private String ScaleOutCluster;

    /**
    * 子网剩余ip数量，用于判断当前实例子网剩余ip数是否能扩容。需要根据实际填写
    */
    @SerializedName("UserSubnetIPNum")
    @Expose
    private Long UserSubnetIPNum;

    /**
    * 同步元数据节点IP （uip），扩容的时候必填
    */
    @SerializedName("ScaleOutNodeIp")
    @Expose
    private String ScaleOutNodeIp;

    /**
    * 缩容节点shard的节点IP （uip），其中ha集群需要主副节点ip都传入以逗号分隔，缩容的时候必填
    */
    @SerializedName("ReduceShardInfo")
    @Expose
    private String [] ReduceShardInfo;

    /**
     * Get 实例唯一ID 
     * @return InstanceId 实例唯一ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例唯一ID
     * @param InstanceId 实例唯一ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点 
     * @return Type 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点
     * @param Type 节点类型，DATA：clickhouse节点，COMMON：为zookeeper节点
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 调整clickhouse节点数量 
     * @return NodeCount 调整clickhouse节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 调整clickhouse节点数量
     * @param NodeCount 调整clickhouse节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get v_cluster分组，	
新增扩容节点将加入到已选择的v_cluster分组中，提交同步VIP生效. 
     * @return ScaleOutCluster v_cluster分组，	
新增扩容节点将加入到已选择的v_cluster分组中，提交同步VIP生效.
     */
    public String getScaleOutCluster() {
        return this.ScaleOutCluster;
    }

    /**
     * Set v_cluster分组，	
新增扩容节点将加入到已选择的v_cluster分组中，提交同步VIP生效.
     * @param ScaleOutCluster v_cluster分组，	
新增扩容节点将加入到已选择的v_cluster分组中，提交同步VIP生效.
     */
    public void setScaleOutCluster(String ScaleOutCluster) {
        this.ScaleOutCluster = ScaleOutCluster;
    }

    /**
     * Get 子网剩余ip数量，用于判断当前实例子网剩余ip数是否能扩容。需要根据实际填写 
     * @return UserSubnetIPNum 子网剩余ip数量，用于判断当前实例子网剩余ip数是否能扩容。需要根据实际填写
     */
    public Long getUserSubnetIPNum() {
        return this.UserSubnetIPNum;
    }

    /**
     * Set 子网剩余ip数量，用于判断当前实例子网剩余ip数是否能扩容。需要根据实际填写
     * @param UserSubnetIPNum 子网剩余ip数量，用于判断当前实例子网剩余ip数是否能扩容。需要根据实际填写
     */
    public void setUserSubnetIPNum(Long UserSubnetIPNum) {
        this.UserSubnetIPNum = UserSubnetIPNum;
    }

    /**
     * Get 同步元数据节点IP （uip），扩容的时候必填 
     * @return ScaleOutNodeIp 同步元数据节点IP （uip），扩容的时候必填
     */
    public String getScaleOutNodeIp() {
        return this.ScaleOutNodeIp;
    }

    /**
     * Set 同步元数据节点IP （uip），扩容的时候必填
     * @param ScaleOutNodeIp 同步元数据节点IP （uip），扩容的时候必填
     */
    public void setScaleOutNodeIp(String ScaleOutNodeIp) {
        this.ScaleOutNodeIp = ScaleOutNodeIp;
    }

    /**
     * Get 缩容节点shard的节点IP （uip），其中ha集群需要主副节点ip都传入以逗号分隔，缩容的时候必填 
     * @return ReduceShardInfo 缩容节点shard的节点IP （uip），其中ha集群需要主副节点ip都传入以逗号分隔，缩容的时候必填
     */
    public String [] getReduceShardInfo() {
        return this.ReduceShardInfo;
    }

    /**
     * Set 缩容节点shard的节点IP （uip），其中ha集群需要主副节点ip都传入以逗号分隔，缩容的时候必填
     * @param ReduceShardInfo 缩容节点shard的节点IP （uip），其中ha集群需要主副节点ip都传入以逗号分隔，缩容的时候必填
     */
    public void setReduceShardInfo(String [] ReduceShardInfo) {
        this.ReduceShardInfo = ReduceShardInfo;
    }

    public ScaleOutInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutInstanceRequest(ScaleOutInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.ScaleOutCluster != null) {
            this.ScaleOutCluster = new String(source.ScaleOutCluster);
        }
        if (source.UserSubnetIPNum != null) {
            this.UserSubnetIPNum = new Long(source.UserSubnetIPNum);
        }
        if (source.ScaleOutNodeIp != null) {
            this.ScaleOutNodeIp = new String(source.ScaleOutNodeIp);
        }
        if (source.ReduceShardInfo != null) {
            this.ReduceShardInfo = new String[source.ReduceShardInfo.length];
            for (int i = 0; i < source.ReduceShardInfo.length; i++) {
                this.ReduceShardInfo[i] = new String(source.ReduceShardInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "ScaleOutCluster", this.ScaleOutCluster);
        this.setParamSimple(map, prefix + "UserSubnetIPNum", this.UserSubnetIPNum);
        this.setParamSimple(map, prefix + "ScaleOutNodeIp", this.ScaleOutNodeIp);
        this.setParamArraySimple(map, prefix + "ReduceShardInfo.", this.ReduceShardInfo);

    }
}

