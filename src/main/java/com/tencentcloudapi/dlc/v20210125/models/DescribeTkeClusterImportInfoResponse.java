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

public class DescribeTkeClusterImportInfoResponse extends AbstractModel {

    /**
    * <p>分区名称。</p>
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * <p>EMR 集群 ID。</p>
    */
    @SerializedName("EmrClusterId")
    @Expose
    private String EmrClusterId;

    /**
    * <p>COS Bucket 名称。</p>
    */
    @SerializedName("CosBucketId")
    @Expose
    private String CosBucketId;

    /**
    * <p>Prometheus 托管实例 ID。</p>
    */
    @SerializedName("PrometheusInstanceId")
    @Expose
    private String PrometheusInstanceId;

    /**
    * <p>Prometheus 托管实例名称；查询失败或未命中返回空字符串。</p>
    */
    @SerializedName("PrometheusInstanceName")
    @Expose
    private String PrometheusInstanceName;

    /**
    * <p>负载均衡实例 ID。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>负载均衡实例名称；查询失败或未命中返回空字符串。</p>
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * <p>容器日志 CLS 日志主题 ID。</p>
    */
    @SerializedName("ContainerLogTopicId")
    @Expose
    private String ContainerLogTopicId;

    /**
    * <p>容器日志 CLS 日志主题名称；查询失败或未命中返回空字符串。</p>
    */
    @SerializedName("ContainerLogTopicName")
    @Expose
    private String ContainerLogTopicName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>分区名称。</p> 
     * @return PartitionName <p>分区名称。</p>
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set <p>分区名称。</p>
     * @param PartitionName <p>分区名称。</p>
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get <p>EMR 集群 ID。</p> 
     * @return EmrClusterId <p>EMR 集群 ID。</p>
     */
    public String getEmrClusterId() {
        return this.EmrClusterId;
    }

    /**
     * Set <p>EMR 集群 ID。</p>
     * @param EmrClusterId <p>EMR 集群 ID。</p>
     */
    public void setEmrClusterId(String EmrClusterId) {
        this.EmrClusterId = EmrClusterId;
    }

    /**
     * Get <p>COS Bucket 名称。</p> 
     * @return CosBucketId <p>COS Bucket 名称。</p>
     */
    public String getCosBucketId() {
        return this.CosBucketId;
    }

    /**
     * Set <p>COS Bucket 名称。</p>
     * @param CosBucketId <p>COS Bucket 名称。</p>
     */
    public void setCosBucketId(String CosBucketId) {
        this.CosBucketId = CosBucketId;
    }

    /**
     * Get <p>Prometheus 托管实例 ID。</p> 
     * @return PrometheusInstanceId <p>Prometheus 托管实例 ID。</p>
     */
    public String getPrometheusInstanceId() {
        return this.PrometheusInstanceId;
    }

    /**
     * Set <p>Prometheus 托管实例 ID。</p>
     * @param PrometheusInstanceId <p>Prometheus 托管实例 ID。</p>
     */
    public void setPrometheusInstanceId(String PrometheusInstanceId) {
        this.PrometheusInstanceId = PrometheusInstanceId;
    }

    /**
     * Get <p>Prometheus 托管实例名称；查询失败或未命中返回空字符串。</p> 
     * @return PrometheusInstanceName <p>Prometheus 托管实例名称；查询失败或未命中返回空字符串。</p>
     */
    public String getPrometheusInstanceName() {
        return this.PrometheusInstanceName;
    }

    /**
     * Set <p>Prometheus 托管实例名称；查询失败或未命中返回空字符串。</p>
     * @param PrometheusInstanceName <p>Prometheus 托管实例名称；查询失败或未命中返回空字符串。</p>
     */
    public void setPrometheusInstanceName(String PrometheusInstanceName) {
        this.PrometheusInstanceName = PrometheusInstanceName;
    }

    /**
     * Get <p>负载均衡实例 ID。</p> 
     * @return LoadBalancerId <p>负载均衡实例 ID。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡实例 ID。</p>
     * @param LoadBalancerId <p>负载均衡实例 ID。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>负载均衡实例名称；查询失败或未命中返回空字符串。</p> 
     * @return LoadBalancerName <p>负载均衡实例名称；查询失败或未命中返回空字符串。</p>
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set <p>负载均衡实例名称；查询失败或未命中返回空字符串。</p>
     * @param LoadBalancerName <p>负载均衡实例名称；查询失败或未命中返回空字符串。</p>
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
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
     * Get <p>容器日志 CLS 日志主题名称；查询失败或未命中返回空字符串。</p> 
     * @return ContainerLogTopicName <p>容器日志 CLS 日志主题名称；查询失败或未命中返回空字符串。</p>
     */
    public String getContainerLogTopicName() {
        return this.ContainerLogTopicName;
    }

    /**
     * Set <p>容器日志 CLS 日志主题名称；查询失败或未命中返回空字符串。</p>
     * @param ContainerLogTopicName <p>容器日志 CLS 日志主题名称；查询失败或未命中返回空字符串。</p>
     */
    public void setContainerLogTopicName(String ContainerLogTopicName) {
        this.ContainerLogTopicName = ContainerLogTopicName;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTkeClusterImportInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTkeClusterImportInfoResponse(DescribeTkeClusterImportInfoResponse source) {
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
        if (source.PrometheusInstanceName != null) {
            this.PrometheusInstanceName = new String(source.PrometheusInstanceName);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.ContainerLogTopicId != null) {
            this.ContainerLogTopicId = new String(source.ContainerLogTopicId);
        }
        if (source.ContainerLogTopicName != null) {
            this.ContainerLogTopicName = new String(source.ContainerLogTopicName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "PrometheusInstanceName", this.PrometheusInstanceName);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "ContainerLogTopicId", this.ContainerLogTopicId);
        this.setParamSimple(map, prefix + "ContainerLogTopicName", this.ContainerLogTopicName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

