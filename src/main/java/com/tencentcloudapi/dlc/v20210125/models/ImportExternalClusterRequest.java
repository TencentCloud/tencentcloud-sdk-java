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

public class ImportExternalClusterRequest extends AbstractModel {

    /**
    * <p>资源池对应的分区名称。</p>
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * <p>集群类型。TKE：直接导入裸 TKE 集群，ClusterId 填 TKE 集群 ID（如 cls-xxxxxxxx）；EMR：通过 EMR 集群导入，ClusterId 填 EMR 集群 ID（如 emr-xxxxxxxx）。</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集群 ID。ClusterType=TKE 时填 TKE 集群 ID（如 cls-xxxxxxxx）；ClusterType=EMR 时填 EMR 集群 ID（如 emr-xxxxxxxx）。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的节点。</p>
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
    * <p>目标账号 AppId（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p>
    */
    @SerializedName("TargetAppId")
    @Expose
    private Long TargetAppId;

    /**
    * <p>目标账号 UIN（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p>
    */
    @SerializedName("TargetUin")
    @Expose
    private String TargetUin;

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
     * Get <p>集群类型。TKE：直接导入裸 TKE 集群，ClusterId 填 TKE 集群 ID（如 cls-xxxxxxxx）；EMR：通过 EMR 集群导入，ClusterId 填 EMR 集群 ID（如 emr-xxxxxxxx）。</p> 
     * @return ClusterType <p>集群类型。TKE：直接导入裸 TKE 集群，ClusterId 填 TKE 集群 ID（如 cls-xxxxxxxx）；EMR：通过 EMR 集群导入，ClusterId 填 EMR 集群 ID（如 emr-xxxxxxxx）。</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型。TKE：直接导入裸 TKE 集群，ClusterId 填 TKE 集群 ID（如 cls-xxxxxxxx）；EMR：通过 EMR 集群导入，ClusterId 填 EMR 集群 ID（如 emr-xxxxxxxx）。</p>
     * @param ClusterType <p>集群类型。TKE：直接导入裸 TKE 集群，ClusterId 填 TKE 集群 ID（如 cls-xxxxxxxx）；EMR：通过 EMR 集群导入，ClusterId 填 EMR 集群 ID（如 emr-xxxxxxxx）。</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群 ID。ClusterType=TKE 时填 TKE 集群 ID（如 cls-xxxxxxxx）；ClusterType=EMR 时填 EMR 集群 ID（如 emr-xxxxxxxx）。</p> 
     * @return ClusterId <p>集群 ID。ClusterType=TKE 时填 TKE 集群 ID（如 cls-xxxxxxxx）；ClusterType=EMR 时填 EMR 集群 ID（如 emr-xxxxxxxx）。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID。ClusterType=TKE 时填 TKE 集群 ID（如 cls-xxxxxxxx）；ClusterType=EMR 时填 EMR 集群 ID（如 emr-xxxxxxxx）。</p>
     * @param ClusterId <p>集群 ID。ClusterType=TKE 时填 TKE 集群 ID（如 cls-xxxxxxxx）；ClusterType=EMR 时填 EMR 集群 ID（如 emr-xxxxxxxx）。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的节点。</p> 
     * @return NodeLabels <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的节点。</p>
     */
    public KVPair [] getNodeLabels() {
        return this.NodeLabels;
    }

    /**
     * Set <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的节点。</p>
     * @param NodeLabels <p>节点标签键值对（Key-Value 列表），用于将资源池调度限定到具备对应标签的节点。</p>
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

    /**
     * Get <p>目标账号 AppId（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p> 
     * @return TargetAppId <p>目标账号 AppId（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p>
     */
    public Long getTargetAppId() {
        return this.TargetAppId;
    }

    /**
     * Set <p>目标账号 AppId（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p>
     * @param TargetAppId <p>目标账号 AppId（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p>
     */
    public void setTargetAppId(Long TargetAppId) {
        this.TargetAppId = TargetAppId;
    }

    /**
     * Get <p>目标账号 UIN（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p> 
     * @return TargetUin <p>目标账号 UIN（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p>
     */
    public String getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set <p>目标账号 UIN（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p>
     * @param TargetUin <p>目标账号 UIN（跨账号导入时填写，不填则使用当前账号）。TargetAppId 和 TargetUin 必须同时填写或同时不填。</p>
     */
    public void setTargetUin(String TargetUin) {
        this.TargetUin = TargetUin;
    }

    public ImportExternalClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportExternalClusterRequest(ImportExternalClusterRequest source) {
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        if (source.NodeLabels != null) {
            this.NodeLabels = new KVPair[source.NodeLabels.length];
            for (int i = 0; i < source.NodeLabels.length; i++) {
                this.NodeLabels[i] = new KVPair(source.NodeLabels[i]);
            }
        }
        if (source.PartitionDescription != null) {
            this.PartitionDescription = new String(source.PartitionDescription);
        }
        if (source.TargetAppId != null) {
            this.TargetAppId = new Long(source.TargetAppId);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new String(source.TargetUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CosBucketId", this.CosBucketId);
        this.setParamSimple(map, prefix + "PrometheusInstanceId", this.PrometheusInstanceId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "NodeLabels.", this.NodeLabels);
        this.setParamSimple(map, prefix + "PartitionDescription", this.PartitionDescription);
        this.setParamSimple(map, prefix + "TargetAppId", this.TargetAppId);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);

    }
}

