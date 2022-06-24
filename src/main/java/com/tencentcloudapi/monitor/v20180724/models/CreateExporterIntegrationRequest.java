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

public class CreateExporterIntegrationRequest extends AbstractModel{

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Kubernetes 集群类型，取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群<EKS> </li>
<li> 3= Prometheus管理的弹性集群<MEKS> </li>
    */
    @SerializedName("KubeType")
    @Expose
    private Long KubeType;

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 集成配置
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Kubernetes 集群类型，取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群<EKS> </li>
<li> 3= Prometheus管理的弹性集群<MEKS> </li> 
     * @return KubeType Kubernetes 集群类型，取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群<EKS> </li>
<li> 3= Prometheus管理的弹性集群<MEKS> </li>
     */
    public Long getKubeType() {
        return this.KubeType;
    }

    /**
     * Set Kubernetes 集群类型，取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群<EKS> </li>
<li> 3= Prometheus管理的弹性集群<MEKS> </li>
     * @param KubeType Kubernetes 集群类型，取值如下：
<li> 1= 容器集群(TKE) </li>
<li> 2=弹性集群<EKS> </li>
<li> 3= Prometheus管理的弹性集群<MEKS> </li>
     */
    public void setKubeType(Long KubeType) {
        this.KubeType = KubeType;
    }

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 类型 
     * @return Kind 类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 类型
     * @param Kind 类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 集成配置 
     * @return Content 集成配置
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 集成配置
     * @param Content 集成配置
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CreateExporterIntegrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExporterIntegrationRequest(CreateExporterIntegrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KubeType != null) {
            this.KubeType = new Long(source.KubeType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KubeType", this.KubeType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

