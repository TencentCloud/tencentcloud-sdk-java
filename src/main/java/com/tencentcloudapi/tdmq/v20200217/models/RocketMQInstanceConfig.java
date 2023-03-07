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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQInstanceConfig extends AbstractModel{

    /**
    * 单命名空间TPS上线
    */
    @SerializedName("MaxTpsPerNamespace")
    @Expose
    private Long MaxTpsPerNamespace;

    /**
    * 最大命名空间数量
    */
    @SerializedName("MaxNamespaceNum")
    @Expose
    private Long MaxNamespaceNum;

    /**
    * 已使用命名空间数量
    */
    @SerializedName("UsedNamespaceNum")
    @Expose
    private Long UsedNamespaceNum;

    /**
    * 最大Topic数量
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * 已使用Topic数量
    */
    @SerializedName("UsedTopicNum")
    @Expose
    private Long UsedTopicNum;

    /**
    * 最大Group数量
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * 已使用Group数量
    */
    @SerializedName("UsedGroupNum")
    @Expose
    private Long UsedGroupNum;

    /**
    * 集群类型
    */
    @SerializedName("ConfigDisplay")
    @Expose
    private String ConfigDisplay;

    /**
    * 集群节点数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 节点分布情况
    */
    @SerializedName("NodeDistribution")
    @Expose
    private InstanceNodeDistribution [] NodeDistribution;

    /**
    * topic分布情况
    */
    @SerializedName("TopicDistribution")
    @Expose
    private RocketMQTopicDistribution [] TopicDistribution;

    /**
    * 每个主题最大队列数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxQueuesPerTopic")
    @Expose
    private Long MaxQueuesPerTopic;

    /**
     * Get 单命名空间TPS上线 
     * @return MaxTpsPerNamespace 单命名空间TPS上线
     */
    public Long getMaxTpsPerNamespace() {
        return this.MaxTpsPerNamespace;
    }

    /**
     * Set 单命名空间TPS上线
     * @param MaxTpsPerNamespace 单命名空间TPS上线
     */
    public void setMaxTpsPerNamespace(Long MaxTpsPerNamespace) {
        this.MaxTpsPerNamespace = MaxTpsPerNamespace;
    }

    /**
     * Get 最大命名空间数量 
     * @return MaxNamespaceNum 最大命名空间数量
     */
    public Long getMaxNamespaceNum() {
        return this.MaxNamespaceNum;
    }

    /**
     * Set 最大命名空间数量
     * @param MaxNamespaceNum 最大命名空间数量
     */
    public void setMaxNamespaceNum(Long MaxNamespaceNum) {
        this.MaxNamespaceNum = MaxNamespaceNum;
    }

    /**
     * Get 已使用命名空间数量 
     * @return UsedNamespaceNum 已使用命名空间数量
     */
    public Long getUsedNamespaceNum() {
        return this.UsedNamespaceNum;
    }

    /**
     * Set 已使用命名空间数量
     * @param UsedNamespaceNum 已使用命名空间数量
     */
    public void setUsedNamespaceNum(Long UsedNamespaceNum) {
        this.UsedNamespaceNum = UsedNamespaceNum;
    }

    /**
     * Get 最大Topic数量 
     * @return MaxTopicNum 最大Topic数量
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set 最大Topic数量
     * @param MaxTopicNum 最大Topic数量
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get 已使用Topic数量 
     * @return UsedTopicNum 已使用Topic数量
     */
    public Long getUsedTopicNum() {
        return this.UsedTopicNum;
    }

    /**
     * Set 已使用Topic数量
     * @param UsedTopicNum 已使用Topic数量
     */
    public void setUsedTopicNum(Long UsedTopicNum) {
        this.UsedTopicNum = UsedTopicNum;
    }

    /**
     * Get 最大Group数量 
     * @return MaxGroupNum 最大Group数量
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set 最大Group数量
     * @param MaxGroupNum 最大Group数量
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get 已使用Group数量 
     * @return UsedGroupNum 已使用Group数量
     */
    public Long getUsedGroupNum() {
        return this.UsedGroupNum;
    }

    /**
     * Set 已使用Group数量
     * @param UsedGroupNum 已使用Group数量
     */
    public void setUsedGroupNum(Long UsedGroupNum) {
        this.UsedGroupNum = UsedGroupNum;
    }

    /**
     * Get 集群类型 
     * @return ConfigDisplay 集群类型
     */
    public String getConfigDisplay() {
        return this.ConfigDisplay;
    }

    /**
     * Set 集群类型
     * @param ConfigDisplay 集群类型
     */
    public void setConfigDisplay(String ConfigDisplay) {
        this.ConfigDisplay = ConfigDisplay;
    }

    /**
     * Get 集群节点数 
     * @return NodeCount 集群节点数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 集群节点数
     * @param NodeCount 集群节点数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 节点分布情况 
     * @return NodeDistribution 节点分布情况
     */
    public InstanceNodeDistribution [] getNodeDistribution() {
        return this.NodeDistribution;
    }

    /**
     * Set 节点分布情况
     * @param NodeDistribution 节点分布情况
     */
    public void setNodeDistribution(InstanceNodeDistribution [] NodeDistribution) {
        this.NodeDistribution = NodeDistribution;
    }

    /**
     * Get topic分布情况 
     * @return TopicDistribution topic分布情况
     */
    public RocketMQTopicDistribution [] getTopicDistribution() {
        return this.TopicDistribution;
    }

    /**
     * Set topic分布情况
     * @param TopicDistribution topic分布情况
     */
    public void setTopicDistribution(RocketMQTopicDistribution [] TopicDistribution) {
        this.TopicDistribution = TopicDistribution;
    }

    /**
     * Get 每个主题最大队列数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxQueuesPerTopic 每个主题最大队列数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxQueuesPerTopic() {
        return this.MaxQueuesPerTopic;
    }

    /**
     * Set 每个主题最大队列数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxQueuesPerTopic 每个主题最大队列数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxQueuesPerTopic(Long MaxQueuesPerTopic) {
        this.MaxQueuesPerTopic = MaxQueuesPerTopic;
    }

    public RocketMQInstanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQInstanceConfig(RocketMQInstanceConfig source) {
        if (source.MaxTpsPerNamespace != null) {
            this.MaxTpsPerNamespace = new Long(source.MaxTpsPerNamespace);
        }
        if (source.MaxNamespaceNum != null) {
            this.MaxNamespaceNum = new Long(source.MaxNamespaceNum);
        }
        if (source.UsedNamespaceNum != null) {
            this.UsedNamespaceNum = new Long(source.UsedNamespaceNum);
        }
        if (source.MaxTopicNum != null) {
            this.MaxTopicNum = new Long(source.MaxTopicNum);
        }
        if (source.UsedTopicNum != null) {
            this.UsedTopicNum = new Long(source.UsedTopicNum);
        }
        if (source.MaxGroupNum != null) {
            this.MaxGroupNum = new Long(source.MaxGroupNum);
        }
        if (source.UsedGroupNum != null) {
            this.UsedGroupNum = new Long(source.UsedGroupNum);
        }
        if (source.ConfigDisplay != null) {
            this.ConfigDisplay = new String(source.ConfigDisplay);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.NodeDistribution != null) {
            this.NodeDistribution = new InstanceNodeDistribution[source.NodeDistribution.length];
            for (int i = 0; i < source.NodeDistribution.length; i++) {
                this.NodeDistribution[i] = new InstanceNodeDistribution(source.NodeDistribution[i]);
            }
        }
        if (source.TopicDistribution != null) {
            this.TopicDistribution = new RocketMQTopicDistribution[source.TopicDistribution.length];
            for (int i = 0; i < source.TopicDistribution.length; i++) {
                this.TopicDistribution[i] = new RocketMQTopicDistribution(source.TopicDistribution[i]);
            }
        }
        if (source.MaxQueuesPerTopic != null) {
            this.MaxQueuesPerTopic = new Long(source.MaxQueuesPerTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxTpsPerNamespace", this.MaxTpsPerNamespace);
        this.setParamSimple(map, prefix + "MaxNamespaceNum", this.MaxNamespaceNum);
        this.setParamSimple(map, prefix + "UsedNamespaceNum", this.UsedNamespaceNum);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamSimple(map, prefix + "UsedTopicNum", this.UsedTopicNum);
        this.setParamSimple(map, prefix + "MaxGroupNum", this.MaxGroupNum);
        this.setParamSimple(map, prefix + "UsedGroupNum", this.UsedGroupNum);
        this.setParamSimple(map, prefix + "ConfigDisplay", this.ConfigDisplay);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamArrayObj(map, prefix + "NodeDistribution.", this.NodeDistribution);
        this.setParamArrayObj(map, prefix + "TopicDistribution.", this.TopicDistribution);
        this.setParamSimple(map, prefix + "MaxQueuesPerTopic", this.MaxQueuesPerTopic);

    }
}

