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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQInstanceConfig extends AbstractModel {

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
    * 最大可设置消息保留时间，小时为单位	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetention")
    @Expose
    private Long MaxRetention;

    /**
    * 最小可设置消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinRetention")
    @Expose
    private Long MinRetention;

    /**
    * 实例消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Retention")
    @Expose
    private Long Retention;

    /**
    * Topic个数最小配额，即免费额度，默认为集群规格单节点最小配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicNumLowerLimit")
    @Expose
    private Long TopicNumLowerLimit;

    /**
    * Topic个数最大配额，默认为集群规格单节点最大配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicNumUpperLimit")
    @Expose
    private Long TopicNumUpperLimit;

    /**
    * 控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

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

    /**
     * Get 最大可设置消息保留时间，小时为单位	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetention 最大可设置消息保留时间，小时为单位	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetention() {
        return this.MaxRetention;
    }

    /**
     * Set 最大可设置消息保留时间，小时为单位	
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetention 最大可设置消息保留时间，小时为单位	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetention(Long MaxRetention) {
        this.MaxRetention = MaxRetention;
    }

    /**
     * Get 最小可设置消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinRetention 最小可设置消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinRetention() {
        return this.MinRetention;
    }

    /**
     * Set 最小可设置消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinRetention 最小可设置消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinRetention(Long MinRetention) {
        this.MinRetention = MinRetention;
    }

    /**
     * Get 实例消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Retention 实例消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetention() {
        return this.Retention;
    }

    /**
     * Set 实例消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Retention 实例消息保留时间，小时为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetention(Long Retention) {
        this.Retention = Retention;
    }

    /**
     * Get Topic个数最小配额，即免费额度，默认为集群规格单节点最小配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicNumLowerLimit Topic个数最小配额，即免费额度，默认为集群规格单节点最小配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicNumLowerLimit() {
        return this.TopicNumLowerLimit;
    }

    /**
     * Set Topic个数最小配额，即免费额度，默认为集群规格单节点最小配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicNumLowerLimit Topic个数最小配额，即免费额度，默认为集群规格单节点最小配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicNumLowerLimit(Long TopicNumLowerLimit) {
        this.TopicNumLowerLimit = TopicNumLowerLimit;
    }

    /**
     * Get Topic个数最大配额，默认为集群规格单节点最大配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicNumUpperLimit Topic个数最大配额，默认为集群规格单节点最大配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicNumUpperLimit() {
        return this.TopicNumUpperLimit;
    }

    /**
     * Set Topic个数最大配额，默认为集群规格单节点最大配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicNumUpperLimit Topic个数最大配额，默认为集群规格单节点最大配额*节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicNumUpperLimit(Long TopicNumUpperLimit) {
        this.TopicNumUpperLimit = TopicNumUpperLimit;
    }

    /**
     * Get 控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5 
     * @return SendReceiveRatio 控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set 控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5
     * @param SendReceiveRatio 控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
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
        if (source.MaxRetention != null) {
            this.MaxRetention = new Long(source.MaxRetention);
        }
        if (source.MinRetention != null) {
            this.MinRetention = new Long(source.MinRetention);
        }
        if (source.Retention != null) {
            this.Retention = new Long(source.Retention);
        }
        if (source.TopicNumLowerLimit != null) {
            this.TopicNumLowerLimit = new Long(source.TopicNumLowerLimit);
        }
        if (source.TopicNumUpperLimit != null) {
            this.TopicNumUpperLimit = new Long(source.TopicNumUpperLimit);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
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
        this.setParamSimple(map, prefix + "MaxRetention", this.MaxRetention);
        this.setParamSimple(map, prefix + "MinRetention", this.MinRetention);
        this.setParamSimple(map, prefix + "Retention", this.Retention);
        this.setParamSimple(map, prefix + "TopicNumLowerLimit", this.TopicNumLowerLimit);
        this.setParamSimple(map, prefix + "TopicNumUpperLimit", this.TopicNumUpperLimit);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);

    }
}

