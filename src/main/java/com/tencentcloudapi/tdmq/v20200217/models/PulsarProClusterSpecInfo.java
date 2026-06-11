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

public class PulsarProClusterSpecInfo extends AbstractModel {

    /**
    * <p>集群规格名称</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>峰值tps</p>
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * <p>峰值带宽。单位：mbps</p>
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * <p>最大命名空间个数</p>
    */
    @SerializedName("MaxNamespaces")
    @Expose
    private Long MaxNamespaces;

    /**
    * <p>可以创建的最大主题数</p>
    */
    @SerializedName("MaxTopics")
    @Expose
    private Long MaxTopics;

    /**
    * <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalableTps")
    @Expose
    private Long ScalableTps;

    /**
    * <p>32或者128<br>当前集群topic的最大分区数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxPartitions")
    @Expose
    private Long MaxPartitions;

    /**
    * <p>最大延迟消息数量。0代表没有限制</p>
    */
    @SerializedName("MaxDelayedMessages")
    @Expose
    private Long MaxDelayedMessages;

    /**
    * <p>可以创建的最大主题分区数</p>
    */
    @SerializedName("MaxTopicsPartitioned")
    @Expose
    private Long MaxTopicsPartitioned;

    /**
    * <p>单broker最大链接数</p>
    */
    @SerializedName("BrokerMaxConnections")
    @Expose
    private Long BrokerMaxConnections;

    /**
    * <p>单IP最大链接数</p>
    */
    @SerializedName("BrokerMaxConnectionsPerIp")
    @Expose
    private Long BrokerMaxConnectionsPerIp;

    /**
    * <p>弹性存储集群最大存储规格；固定存储该值为0</p>
    */
    @SerializedName("MaximumElasticStorage")
    @Expose
    private Long MaximumElasticStorage;

    /**
    * <p>当前集群可使用的全量TPS，包括弹性TPS</p>
    */
    @SerializedName("TotalTps")
    @Expose
    private Long TotalTps;

    /**
     * Get <p>集群规格名称</p> 
     * @return SpecName <p>集群规格名称</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>集群规格名称</p>
     * @param SpecName <p>集群规格名称</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>峰值tps</p> 
     * @return MaxTps <p>峰值tps</p>
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set <p>峰值tps</p>
     * @param MaxTps <p>峰值tps</p>
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get <p>峰值带宽。单位：mbps</p> 
     * @return MaxBandWidth <p>峰值带宽。单位：mbps</p>
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set <p>峰值带宽。单位：mbps</p>
     * @param MaxBandWidth <p>峰值带宽。单位：mbps</p>
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get <p>最大命名空间个数</p> 
     * @return MaxNamespaces <p>最大命名空间个数</p>
     */
    public Long getMaxNamespaces() {
        return this.MaxNamespaces;
    }

    /**
     * Set <p>最大命名空间个数</p>
     * @param MaxNamespaces <p>最大命名空间个数</p>
     */
    public void setMaxNamespaces(Long MaxNamespaces) {
        this.MaxNamespaces = MaxNamespaces;
    }

    /**
     * Get <p>可以创建的最大主题数</p> 
     * @return MaxTopics <p>可以创建的最大主题数</p>
     */
    public Long getMaxTopics() {
        return this.MaxTopics;
    }

    /**
     * Set <p>可以创建的最大主题数</p>
     * @param MaxTopics <p>可以创建的最大主题数</p>
     */
    public void setMaxTopics(Long MaxTopics) {
        this.MaxTopics = MaxTopics;
    }

    /**
     * Get <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalableTps <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScalableTps() {
        return this.ScalableTps;
    }

    /**
     * Set <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalableTps <p>规格外弹性TPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalableTps(Long ScalableTps) {
        this.ScalableTps = ScalableTps;
    }

    /**
     * Get <p>32或者128<br>当前集群topic的最大分区数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxPartitions <p>32或者128<br>当前集群topic的最大分区数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxPartitions() {
        return this.MaxPartitions;
    }

    /**
     * Set <p>32或者128<br>当前集群topic的最大分区数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxPartitions <p>32或者128<br>当前集群topic的最大分区数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxPartitions(Long MaxPartitions) {
        this.MaxPartitions = MaxPartitions;
    }

    /**
     * Get <p>最大延迟消息数量。0代表没有限制</p> 
     * @return MaxDelayedMessages <p>最大延迟消息数量。0代表没有限制</p>
     */
    public Long getMaxDelayedMessages() {
        return this.MaxDelayedMessages;
    }

    /**
     * Set <p>最大延迟消息数量。0代表没有限制</p>
     * @param MaxDelayedMessages <p>最大延迟消息数量。0代表没有限制</p>
     */
    public void setMaxDelayedMessages(Long MaxDelayedMessages) {
        this.MaxDelayedMessages = MaxDelayedMessages;
    }

    /**
     * Get <p>可以创建的最大主题分区数</p> 
     * @return MaxTopicsPartitioned <p>可以创建的最大主题分区数</p>
     */
    public Long getMaxTopicsPartitioned() {
        return this.MaxTopicsPartitioned;
    }

    /**
     * Set <p>可以创建的最大主题分区数</p>
     * @param MaxTopicsPartitioned <p>可以创建的最大主题分区数</p>
     */
    public void setMaxTopicsPartitioned(Long MaxTopicsPartitioned) {
        this.MaxTopicsPartitioned = MaxTopicsPartitioned;
    }

    /**
     * Get <p>单broker最大链接数</p> 
     * @return BrokerMaxConnections <p>单broker最大链接数</p>
     */
    public Long getBrokerMaxConnections() {
        return this.BrokerMaxConnections;
    }

    /**
     * Set <p>单broker最大链接数</p>
     * @param BrokerMaxConnections <p>单broker最大链接数</p>
     */
    public void setBrokerMaxConnections(Long BrokerMaxConnections) {
        this.BrokerMaxConnections = BrokerMaxConnections;
    }

    /**
     * Get <p>单IP最大链接数</p> 
     * @return BrokerMaxConnectionsPerIp <p>单IP最大链接数</p>
     */
    public Long getBrokerMaxConnectionsPerIp() {
        return this.BrokerMaxConnectionsPerIp;
    }

    /**
     * Set <p>单IP最大链接数</p>
     * @param BrokerMaxConnectionsPerIp <p>单IP最大链接数</p>
     */
    public void setBrokerMaxConnectionsPerIp(Long BrokerMaxConnectionsPerIp) {
        this.BrokerMaxConnectionsPerIp = BrokerMaxConnectionsPerIp;
    }

    /**
     * Get <p>弹性存储集群最大存储规格；固定存储该值为0</p> 
     * @return MaximumElasticStorage <p>弹性存储集群最大存储规格；固定存储该值为0</p>
     */
    public Long getMaximumElasticStorage() {
        return this.MaximumElasticStorage;
    }

    /**
     * Set <p>弹性存储集群最大存储规格；固定存储该值为0</p>
     * @param MaximumElasticStorage <p>弹性存储集群最大存储规格；固定存储该值为0</p>
     */
    public void setMaximumElasticStorage(Long MaximumElasticStorage) {
        this.MaximumElasticStorage = MaximumElasticStorage;
    }

    /**
     * Get <p>当前集群可使用的全量TPS，包括弹性TPS</p> 
     * @return TotalTps <p>当前集群可使用的全量TPS，包括弹性TPS</p>
     */
    public Long getTotalTps() {
        return this.TotalTps;
    }

    /**
     * Set <p>当前集群可使用的全量TPS，包括弹性TPS</p>
     * @param TotalTps <p>当前集群可使用的全量TPS，包括弹性TPS</p>
     */
    public void setTotalTps(Long TotalTps) {
        this.TotalTps = TotalTps;
    }

    public PulsarProClusterSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarProClusterSpecInfo(PulsarProClusterSpecInfo source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxNamespaces != null) {
            this.MaxNamespaces = new Long(source.MaxNamespaces);
        }
        if (source.MaxTopics != null) {
            this.MaxTopics = new Long(source.MaxTopics);
        }
        if (source.ScalableTps != null) {
            this.ScalableTps = new Long(source.ScalableTps);
        }
        if (source.MaxPartitions != null) {
            this.MaxPartitions = new Long(source.MaxPartitions);
        }
        if (source.MaxDelayedMessages != null) {
            this.MaxDelayedMessages = new Long(source.MaxDelayedMessages);
        }
        if (source.MaxTopicsPartitioned != null) {
            this.MaxTopicsPartitioned = new Long(source.MaxTopicsPartitioned);
        }
        if (source.BrokerMaxConnections != null) {
            this.BrokerMaxConnections = new Long(source.BrokerMaxConnections);
        }
        if (source.BrokerMaxConnectionsPerIp != null) {
            this.BrokerMaxConnectionsPerIp = new Long(source.BrokerMaxConnectionsPerIp);
        }
        if (source.MaximumElasticStorage != null) {
            this.MaximumElasticStorage = new Long(source.MaximumElasticStorage);
        }
        if (source.TotalTps != null) {
            this.TotalTps = new Long(source.TotalTps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxNamespaces", this.MaxNamespaces);
        this.setParamSimple(map, prefix + "MaxTopics", this.MaxTopics);
        this.setParamSimple(map, prefix + "ScalableTps", this.ScalableTps);
        this.setParamSimple(map, prefix + "MaxPartitions", this.MaxPartitions);
        this.setParamSimple(map, prefix + "MaxDelayedMessages", this.MaxDelayedMessages);
        this.setParamSimple(map, prefix + "MaxTopicsPartitioned", this.MaxTopicsPartitioned);
        this.setParamSimple(map, prefix + "BrokerMaxConnections", this.BrokerMaxConnections);
        this.setParamSimple(map, prefix + "BrokerMaxConnectionsPerIp", this.BrokerMaxConnectionsPerIp);
        this.setParamSimple(map, prefix + "MaximumElasticStorage", this.MaximumElasticStorage);
        this.setParamSimple(map, prefix + "TotalTps", this.TotalTps);

    }
}

