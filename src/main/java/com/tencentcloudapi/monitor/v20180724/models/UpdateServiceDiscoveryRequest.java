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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateServiceDiscoveryRequest extends AbstractModel {

    /**
    * Prometheus 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <li>类型是 TKE，为对应的腾讯云容器服务集群 ID</li>
    */
    @SerializedName("KubeClusterId")
    @Expose
    private String KubeClusterId;

    /**
    * 用户 Kubernetes 集群类型：
<li> 1 = 容器服务集群(TKE) </li>
    */
    @SerializedName("KubeType")
    @Expose
    private Long KubeType;

    /**
    * 服务发现类型，取值如下：
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 服务发现配置信息，YAML 格式，[具体YAML参数内容请参考](https://cloud.tencent.com/document/product/1416/55995#service-monitor)
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
     * Get Prometheus 实例 ID 
     * @return InstanceId Prometheus 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus 实例 ID
     * @param InstanceId Prometheus 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <li>类型是 TKE，为对应的腾讯云容器服务集群 ID</li> 
     * @return KubeClusterId <li>类型是 TKE，为对应的腾讯云容器服务集群 ID</li>
     */
    public String getKubeClusterId() {
        return this.KubeClusterId;
    }

    /**
     * Set <li>类型是 TKE，为对应的腾讯云容器服务集群 ID</li>
     * @param KubeClusterId <li>类型是 TKE，为对应的腾讯云容器服务集群 ID</li>
     */
    public void setKubeClusterId(String KubeClusterId) {
        this.KubeClusterId = KubeClusterId;
    }

    /**
     * Get 用户 Kubernetes 集群类型：
<li> 1 = 容器服务集群(TKE) </li> 
     * @return KubeType 用户 Kubernetes 集群类型：
<li> 1 = 容器服务集群(TKE) </li>
     */
    public Long getKubeType() {
        return this.KubeType;
    }

    /**
     * Set 用户 Kubernetes 集群类型：
<li> 1 = 容器服务集群(TKE) </li>
     * @param KubeType 用户 Kubernetes 集群类型：
<li> 1 = 容器服务集群(TKE) </li>
     */
    public void setKubeType(Long KubeType) {
        this.KubeType = KubeType;
    }

    /**
     * Get 服务发现类型，取值如下：
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li> 
     * @return Type 服务发现类型，取值如下：
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 服务发现类型，取值如下：
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li>
     * @param Type 服务发现类型，取值如下：
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 服务发现配置信息，YAML 格式，[具体YAML参数内容请参考](https://cloud.tencent.com/document/product/1416/55995#service-monitor) 
     * @return Yaml 服务发现配置信息，YAML 格式，[具体YAML参数内容请参考](https://cloud.tencent.com/document/product/1416/55995#service-monitor)
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set 服务发现配置信息，YAML 格式，[具体YAML参数内容请参考](https://cloud.tencent.com/document/product/1416/55995#service-monitor)
     * @param Yaml 服务发现配置信息，YAML 格式，[具体YAML参数内容请参考](https://cloud.tencent.com/document/product/1416/55995#service-monitor)
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    public UpdateServiceDiscoveryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateServiceDiscoveryRequest(UpdateServiceDiscoveryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KubeClusterId != null) {
            this.KubeClusterId = new String(source.KubeClusterId);
        }
        if (source.KubeType != null) {
            this.KubeType = new Long(source.KubeType);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KubeClusterId", this.KubeClusterId);
        this.setParamSimple(map, prefix + "KubeType", this.KubeType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);

    }
}

