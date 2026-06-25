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

public class DeleteExporterIntegrationRequest extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>类型(可通过 DescribeExporterIntegrations获取)</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Kubernetes 集群类型，取值如下：</p><li> 1= 容器集群(TKE) </li><li> 2=弹性集群(EKS) </li><li> 3= Prometheus管理的弹性集群(MEKS) </li>
    */
    @SerializedName("KubeType")
    @Expose
    private Long KubeType;

    /**
    * <p>集群 ID，可不填</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>类型(可通过 DescribeExporterIntegrations获取)</p> 
     * @return Kind <p>类型(可通过 DescribeExporterIntegrations获取)</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>类型(可通过 DescribeExporterIntegrations获取)</p>
     * @param Kind <p>类型(可通过 DescribeExporterIntegrations获取)</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>名字</p> 
     * @return Name <p>名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名字</p>
     * @param Name <p>名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Kubernetes 集群类型，取值如下：</p><li> 1= 容器集群(TKE) </li><li> 2=弹性集群(EKS) </li><li> 3= Prometheus管理的弹性集群(MEKS) </li> 
     * @return KubeType <p>Kubernetes 集群类型，取值如下：</p><li> 1= 容器集群(TKE) </li><li> 2=弹性集群(EKS) </li><li> 3= Prometheus管理的弹性集群(MEKS) </li>
     */
    public Long getKubeType() {
        return this.KubeType;
    }

    /**
     * Set <p>Kubernetes 集群类型，取值如下：</p><li> 1= 容器集群(TKE) </li><li> 2=弹性集群(EKS) </li><li> 3= Prometheus管理的弹性集群(MEKS) </li>
     * @param KubeType <p>Kubernetes 集群类型，取值如下：</p><li> 1= 容器集群(TKE) </li><li> 2=弹性集群(EKS) </li><li> 3= Prometheus管理的弹性集群(MEKS) </li>
     */
    public void setKubeType(Long KubeType) {
        this.KubeType = KubeType;
    }

    /**
     * Get <p>集群 ID，可不填</p> 
     * @return ClusterId <p>集群 ID，可不填</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID，可不填</p>
     * @param ClusterId <p>集群 ID，可不填</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DeleteExporterIntegrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteExporterIntegrationRequest(DeleteExporterIntegrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KubeType", this.KubeType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

