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
    * 集群规格名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 峰值tps
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * 峰值带宽。单位：mbps
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 最大命名空间个数
    */
    @SerializedName("MaxNamespaces")
    @Expose
    private Long MaxNamespaces;

    /**
    * 可以创建的最大主题数
    */
    @SerializedName("MaxTopics")
    @Expose
    private Long MaxTopics;

    /**
    * 规格外弹性TPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalableTps")
    @Expose
    private Long ScalableTps;

    /**
    * 32或者128
当前集群topic的最大分区数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxPartitions")
    @Expose
    private Long MaxPartitions;

    /**
    * 最大延迟消息数量。0代表没有限制	
    */
    @SerializedName("MaxDelayedMessages")
    @Expose
    private Long MaxDelayedMessages;

    /**
    * 可以创建的最大主题分区数
    */
    @SerializedName("MaxTopicsPartitioned")
    @Expose
    private Long MaxTopicsPartitioned;

    /**
    * 单broker最大链接数
    */
    @SerializedName("BrokerMaxConnections")
    @Expose
    private Long BrokerMaxConnections;

    /**
    * 单IP最大链接数
    */
    @SerializedName("BrokerMaxConnectionsPerIp")
    @Expose
    private Long BrokerMaxConnectionsPerIp;

    /**
    * 弹性存储集群最大存储规格；固定存储该值为0
    */
    @SerializedName("MaximumElasticStorage")
    @Expose
    private Long MaximumElasticStorage;

    /**
     * Get 集群规格名称 
     * @return SpecName 集群规格名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 集群规格名称
     * @param SpecName 集群规格名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 峰值tps 
     * @return MaxTps 峰值tps
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set 峰值tps
     * @param MaxTps 峰值tps
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get 峰值带宽。单位：mbps 
     * @return MaxBandWidth 峰值带宽。单位：mbps
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 峰值带宽。单位：mbps
     * @param MaxBandWidth 峰值带宽。单位：mbps
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get 最大命名空间个数 
     * @return MaxNamespaces 最大命名空间个数
     */
    public Long getMaxNamespaces() {
        return this.MaxNamespaces;
    }

    /**
     * Set 最大命名空间个数
     * @param MaxNamespaces 最大命名空间个数
     */
    public void setMaxNamespaces(Long MaxNamespaces) {
        this.MaxNamespaces = MaxNamespaces;
    }

    /**
     * Get 可以创建的最大主题数 
     * @return MaxTopics 可以创建的最大主题数
     */
    public Long getMaxTopics() {
        return this.MaxTopics;
    }

    /**
     * Set 可以创建的最大主题数
     * @param MaxTopics 可以创建的最大主题数
     */
    public void setMaxTopics(Long MaxTopics) {
        this.MaxTopics = MaxTopics;
    }

    /**
     * Get 规格外弹性TPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalableTps 规格外弹性TPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScalableTps() {
        return this.ScalableTps;
    }

    /**
     * Set 规格外弹性TPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalableTps 规格外弹性TPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalableTps(Long ScalableTps) {
        this.ScalableTps = ScalableTps;
    }

    /**
     * Get 32或者128
当前集群topic的最大分区数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxPartitions 32或者128
当前集群topic的最大分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxPartitions() {
        return this.MaxPartitions;
    }

    /**
     * Set 32或者128
当前集群topic的最大分区数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxPartitions 32或者128
当前集群topic的最大分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxPartitions(Long MaxPartitions) {
        this.MaxPartitions = MaxPartitions;
    }

    /**
     * Get 最大延迟消息数量。0代表没有限制	 
     * @return MaxDelayedMessages 最大延迟消息数量。0代表没有限制	
     */
    public Long getMaxDelayedMessages() {
        return this.MaxDelayedMessages;
    }

    /**
     * Set 最大延迟消息数量。0代表没有限制	
     * @param MaxDelayedMessages 最大延迟消息数量。0代表没有限制	
     */
    public void setMaxDelayedMessages(Long MaxDelayedMessages) {
        this.MaxDelayedMessages = MaxDelayedMessages;
    }

    /**
     * Get 可以创建的最大主题分区数 
     * @return MaxTopicsPartitioned 可以创建的最大主题分区数
     */
    public Long getMaxTopicsPartitioned() {
        return this.MaxTopicsPartitioned;
    }

    /**
     * Set 可以创建的最大主题分区数
     * @param MaxTopicsPartitioned 可以创建的最大主题分区数
     */
    public void setMaxTopicsPartitioned(Long MaxTopicsPartitioned) {
        this.MaxTopicsPartitioned = MaxTopicsPartitioned;
    }

    /**
     * Get 单broker最大链接数 
     * @return BrokerMaxConnections 单broker最大链接数
     */
    public Long getBrokerMaxConnections() {
        return this.BrokerMaxConnections;
    }

    /**
     * Set 单broker最大链接数
     * @param BrokerMaxConnections 单broker最大链接数
     */
    public void setBrokerMaxConnections(Long BrokerMaxConnections) {
        this.BrokerMaxConnections = BrokerMaxConnections;
    }

    /**
     * Get 单IP最大链接数 
     * @return BrokerMaxConnectionsPerIp 单IP最大链接数
     */
    public Long getBrokerMaxConnectionsPerIp() {
        return this.BrokerMaxConnectionsPerIp;
    }

    /**
     * Set 单IP最大链接数
     * @param BrokerMaxConnectionsPerIp 单IP最大链接数
     */
    public void setBrokerMaxConnectionsPerIp(Long BrokerMaxConnectionsPerIp) {
        this.BrokerMaxConnectionsPerIp = BrokerMaxConnectionsPerIp;
    }

    /**
     * Get 弹性存储集群最大存储规格；固定存储该值为0 
     * @return MaximumElasticStorage 弹性存储集群最大存储规格；固定存储该值为0
     */
    public Long getMaximumElasticStorage() {
        return this.MaximumElasticStorage;
    }

    /**
     * Set 弹性存储集群最大存储规格；固定存储该值为0
     * @param MaximumElasticStorage 弹性存储集群最大存储规格；固定存储该值为0
     */
    public void setMaximumElasticStorage(Long MaximumElasticStorage) {
        this.MaximumElasticStorage = MaximumElasticStorage;
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

    }
}

