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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportTkeClusterRequest extends AbstractModel {

    /**
    * <p>资源池对应的分区名称。</p>
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * <p>EMR 集群 ID（注意：不是 TKE 集群 ID）。</p>
    */
    @SerializedName("EmrClusterId")
    @Expose
    private String EmrClusterId;

    /**
    * <p>COS Bucket 名称（含 AppId 后缀），例如 my-bucket-1250000000。</p>
    */
    @SerializedName("CosBucketId")
    @Expose
    private String CosBucketId;

    /**
    * <p>Prometheus 托管实例 ID，例如 prom-xxxxxxxx。</p>
    */
    @SerializedName("PrometheusInstanceId")
    @Expose
    private String PrometheusInstanceId;

    /**
    * <p>负载均衡实例 ID，例如 lb-xxxxxxxx。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>容器日志 CLS 日志主题 ID。</p>
    */
    @SerializedName("ContainerLogTopicId")
    @Expose
    private String ContainerLogTopicId;

    /**
    * <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的 EMR-TKE 节点。</p>
    */
    @SerializedName("NodeLabels")
    @Expose
    private KVPair [] NodeLabels;

    /**
    * <p>资源池对应的默认分区描述，透传给下游 ResourceManager 用于分区创建。</p>
    */
    @SerializedName("PartitionDescription")
    @Expose
    private String PartitionDescription;

    /**
     * Get <p>资源池对应的分区名称。</p> 
     * @return PartitionName <p>资源池对应的分区名称。</p>
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set <p>资源池对应的分区名称。</p>
     * @param PartitionName <p>资源池对应的分区名称。</p>
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get <p>EMR 集群 ID（注意：不是 TKE 集群 ID）。</p> 
     * @return EmrClusterId <p>EMR 集群 ID（注意：不是 TKE 集群 ID）。</p>
     */
    public String getEmrClusterId() {
        return this.EmrClusterId;
    }

    /**
     * Set <p>EMR 集群 ID（注意：不是 TKE 集群 ID）。</p>
     * @param EmrClusterId <p>EMR 集群 ID（注意：不是 TKE 集群 ID）。</p>
     */
    public void setEmrClusterId(String EmrClusterId) {
        this.EmrClusterId = EmrClusterId;
    }

    /**
     * Get <p>COS Bucket 名称（含 AppId 后缀），例如 my-bucket-1250000000。</p> 
     * @return CosBucketId <p>COS Bucket 名称（含 AppId 后缀），例如 my-bucket-1250000000。</p>
     */
    public String getCosBucketId() {
        return this.CosBucketId;
    }

    /**
     * Set <p>COS Bucket 名称（含 AppId 后缀），例如 my-bucket-1250000000。</p>
     * @param CosBucketId <p>COS Bucket 名称（含 AppId 后缀），例如 my-bucket-1250000000。</p>
     */
    public void setCosBucketId(String CosBucketId) {
        this.CosBucketId = CosBucketId;
    }

    /**
     * Get <p>Prometheus 托管实例 ID，例如 prom-xxxxxxxx。</p> 
     * @return PrometheusInstanceId <p>Prometheus 托管实例 ID，例如 prom-xxxxxxxx。</p>
     */
    public String getPrometheusInstanceId() {
        return this.PrometheusInstanceId;
    }

    /**
     * Set <p>Prometheus 托管实例 ID，例如 prom-xxxxxxxx。</p>
     * @param PrometheusInstanceId <p>Prometheus 托管实例 ID，例如 prom-xxxxxxxx。</p>
     */
    public void setPrometheusInstanceId(String PrometheusInstanceId) {
        this.PrometheusInstanceId = PrometheusInstanceId;
    }

    /**
     * Get <p>负载均衡实例 ID，例如 lb-xxxxxxxx。</p> 
     * @return LoadBalancerId <p>负载均衡实例 ID，例如 lb-xxxxxxxx。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡实例 ID，例如 lb-xxxxxxxx。</p>
     * @param LoadBalancerId <p>负载均衡实例 ID，例如 lb-xxxxxxxx。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>容器日志 CLS 日志主题 ID。</p> 
     * @return ContainerLogTopicId <p>容器日志 CLS 日志主题 ID。</p>
     */
    public String getContainerLogTopicId() {
        return this.ContainerLogTopicId;
    }

    /**
     * Set <p>容器日志 CLS 日志主题 ID。</p>
     * @param ContainerLogTopicId <p>容器日志 CLS 日志主题 ID。</p>
     */
    public void setContainerLogTopicId(String ContainerLogTopicId) {
        this.ContainerLogTopicId = ContainerLogTopicId;
    }

    /**
     * Get <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的 EMR-TKE 节点。</p> 
     * @return NodeLabels <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的 EMR-TKE 节点。</p>
     */
    public KVPair [] getNodeLabels() {
        return this.NodeLabels;
    }

    /**
     * Set <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的 EMR-TKE 节点。</p>
     * @param NodeLabels <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的 EMR-TKE 节点。</p>
     */
    public void setNodeLabels(KVPair [] NodeLabels) {
        this.NodeLabels = NodeLabels;
    }

    /**
     * Get <p>资源池对应的默认分区描述，透传给下游 ResourceManager 用于分区创建。</p> 
     * @return PartitionDescription <p>资源池对应的默认分区描述，透传给下游 ResourceManager 用于分区创建。</p>
     */
    public String getPartitionDescription() {
        return this.PartitionDescription;
    }

    /**
     * Set <p>资源池对应的默认分区描述，透传给下游 ResourceManager 用于分区创建。</p>
     * @param PartitionDescription <p>资源池对应的默认分区描述，透传给下游 ResourceManager 用于分区创建。</p>
     */
    public void setPartitionDescription(String PartitionDescription) {
        this.PartitionDescription = PartitionDescription;
    }

    public ImportTkeClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportTkeClusterRequest(ImportTkeClusterRequest source) {
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.EmrClusterId != null) {
            this.EmrClusterId = new String(source.EmrClusterId);
        }
        if (source.CosBucketId != null) {
            this.CosBucketId = new String(source.CosBucketId);
        }
        if (source.PrometheusInstanceId != null) {
            this.PrometheusInstanceId = new String(source.PrometheusInstanceId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ContainerLogTopicId != null) {
            this.ContainerLogTopicId = new String(source.ContainerLogTopicId);
        }
        if (source.NodeLabels != null) {
            this.NodeLabels = new KVPair[source.NodeLabels.length];
            for (int i = 0; i < source.NodeLabels.length; i++) {
                this.NodeLabels[i] = new KVPair(source.NodeLabels[i]);
            }
        }
        if (source.PartitionDescription != null) {
            this.PartitionDescription = new String(source.PartitionDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "EmrClusterId", this.EmrClusterId);
        this.setParamSimple(map, prefix + "CosBucketId", this.CosBucketId);
        this.setParamSimple(map, prefix + "PrometheusInstanceId", this.PrometheusInstanceId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ContainerLogTopicId", this.ContainerLogTopicId);
        this.setParamArrayObj(map, prefix + "NodeLabels.", this.NodeLabels);
        this.setParamSimple(map, prefix + "PartitionDescription", this.PartitionDescription);

    }
}

