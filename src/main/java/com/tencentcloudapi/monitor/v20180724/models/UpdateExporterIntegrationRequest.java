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

public class UpdateExporterIntegrationRequest extends AbstractModel {

    /**
    * Prometheus 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 类型(可通过 DescribeExporterIntegrations 获取对应集成的 Kind)
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 配置内容(可通过 DescribeExporterIntegrations 接口获取对应集成的 Content，并在此基础上做修改)
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Kubernetes 集群类型，可不填。取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群(EKS) </li>
<li> 3= Prometheus管理的弹性集群(MEKS) </li>
    */
    @SerializedName("KubeType")
    @Expose
    private Long KubeType;

    /**
    * 集群 ID，可不填
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
     * Get 类型(可通过 DescribeExporterIntegrations 获取对应集成的 Kind) 
     * @return Kind 类型(可通过 DescribeExporterIntegrations 获取对应集成的 Kind)
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 类型(可通过 DescribeExporterIntegrations 获取对应集成的 Kind)
     * @param Kind 类型(可通过 DescribeExporterIntegrations 获取对应集成的 Kind)
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 配置内容(可通过 DescribeExporterIntegrations 接口获取对应集成的 Content，并在此基础上做修改) 
     * @return Content 配置内容(可通过 DescribeExporterIntegrations 接口获取对应集成的 Content，并在此基础上做修改)
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 配置内容(可通过 DescribeExporterIntegrations 接口获取对应集成的 Content，并在此基础上做修改)
     * @param Content 配置内容(可通过 DescribeExporterIntegrations 接口获取对应集成的 Content，并在此基础上做修改)
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Kubernetes 集群类型，可不填。取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群(EKS) </li>
<li> 3= Prometheus管理的弹性集群(MEKS) </li> 
     * @return KubeType Kubernetes 集群类型，可不填。取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群(EKS) </li>
<li> 3= Prometheus管理的弹性集群(MEKS) </li>
     */
    public Long getKubeType() {
        return this.KubeType;
    }

    /**
     * Set Kubernetes 集群类型，可不填。取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群(EKS) </li>
<li> 3= Prometheus管理的弹性集群(MEKS) </li>
     * @param KubeType Kubernetes 集群类型，可不填。取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群(EKS) </li>
<li> 3= Prometheus管理的弹性集群(MEKS) </li>
     */
    public void setKubeType(Long KubeType) {
        this.KubeType = KubeType;
    }

    /**
     * Get 集群 ID，可不填 
     * @return ClusterId 集群 ID，可不填
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID，可不填
     * @param ClusterId 集群 ID，可不填
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public UpdateExporterIntegrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateExporterIntegrationRequest(UpdateExporterIntegrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.KubeType != null) {
            this.KubeType = new Long(source.KubeType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "KubeType", this.KubeType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

