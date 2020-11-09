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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateServiceDiscoveryRequest extends AbstractModel{

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
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 服务发现配置信息
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
     * @return Type 服务发现类型，取值如下：
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 服务发现类型，取值如下：
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
     * @param Type 服务发现类型，取值如下：
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 服务发现配置信息 
     * @return Yaml 服务发现配置信息
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set 服务发现配置信息
     * @param Yaml 服务发现配置信息
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
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

