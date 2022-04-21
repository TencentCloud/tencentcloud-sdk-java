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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUpstreamRequest extends AbstractModel{

    /**
    * 后端通道唯一ID
    */
    @SerializedName("UpstreamId")
    @Expose
    private String UpstreamId;

    /**
    * 后端通道名字
    */
    @SerializedName("UpstreamName")
    @Expose
    private String UpstreamName;

    /**
    * 后端通道描述
    */
    @SerializedName("UpstreamDescription")
    @Expose
    private String UpstreamDescription;

    /**
    * 后端协议，取值范围：HTTP, HTTPS
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 后端访问类型，取值范围：IP_PORT, K8S
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * 负载均衡算法，取值范围：ROUND_ROBIN
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * VPC唯一ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 请求重试次数，默认3次
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * 网关转发到后端的 Host 请求头
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
    * 后端节点列表
    */
    @SerializedName("Nodes")
    @Expose
    private UpstreamNode [] Nodes;

    /**
    * 健康检查配置，目前只支持VPC通道
    */
    @SerializedName("HealthChecker")
    @Expose
    private UpstreamHealthChecker HealthChecker;

    /**
    * 容器服务配置
    */
    @SerializedName("K8sService")
    @Expose
    private K8sService [] K8sService;

    /**
     * Get 后端通道唯一ID 
     * @return UpstreamId 后端通道唯一ID
     */
    public String getUpstreamId() {
        return this.UpstreamId;
    }

    /**
     * Set 后端通道唯一ID
     * @param UpstreamId 后端通道唯一ID
     */
    public void setUpstreamId(String UpstreamId) {
        this.UpstreamId = UpstreamId;
    }

    /**
     * Get 后端通道名字 
     * @return UpstreamName 后端通道名字
     */
    public String getUpstreamName() {
        return this.UpstreamName;
    }

    /**
     * Set 后端通道名字
     * @param UpstreamName 后端通道名字
     */
    public void setUpstreamName(String UpstreamName) {
        this.UpstreamName = UpstreamName;
    }

    /**
     * Get 后端通道描述 
     * @return UpstreamDescription 后端通道描述
     */
    public String getUpstreamDescription() {
        return this.UpstreamDescription;
    }

    /**
     * Set 后端通道描述
     * @param UpstreamDescription 后端通道描述
     */
    public void setUpstreamDescription(String UpstreamDescription) {
        this.UpstreamDescription = UpstreamDescription;
    }

    /**
     * Get 后端协议，取值范围：HTTP, HTTPS 
     * @return Scheme 后端协议，取值范围：HTTP, HTTPS
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 后端协议，取值范围：HTTP, HTTPS
     * @param Scheme 后端协议，取值范围：HTTP, HTTPS
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 后端访问类型，取值范围：IP_PORT, K8S 
     * @return UpstreamType 后端访问类型，取值范围：IP_PORT, K8S
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set 后端访问类型，取值范围：IP_PORT, K8S
     * @param UpstreamType 后端访问类型，取值范围：IP_PORT, K8S
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get 负载均衡算法，取值范围：ROUND_ROBIN 
     * @return Algorithm 负载均衡算法，取值范围：ROUND_ROBIN
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 负载均衡算法，取值范围：ROUND_ROBIN
     * @param Algorithm 负载均衡算法，取值范围：ROUND_ROBIN
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get VPC唯一ID 
     * @return UniqVpcId VPC唯一ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC唯一ID
     * @param UniqVpcId VPC唯一ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 请求重试次数，默认3次 
     * @return Retries 请求重试次数，默认3次
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set 请求重试次数，默认3次
     * @param Retries 请求重试次数，默认3次
     */
    public void setRetries(Long Retries) {
        this.Retries = Retries;
    }

    /**
     * Get 网关转发到后端的 Host 请求头 
     * @return UpstreamHost 网关转发到后端的 Host 请求头
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set 网关转发到后端的 Host 请求头
     * @param UpstreamHost 网关转发到后端的 Host 请求头
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    /**
     * Get 后端节点列表 
     * @return Nodes 后端节点列表
     */
    public UpstreamNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 后端节点列表
     * @param Nodes 后端节点列表
     */
    public void setNodes(UpstreamNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 健康检查配置，目前只支持VPC通道 
     * @return HealthChecker 健康检查配置，目前只支持VPC通道
     */
    public UpstreamHealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set 健康检查配置，目前只支持VPC通道
     * @param HealthChecker 健康检查配置，目前只支持VPC通道
     */
    public void setHealthChecker(UpstreamHealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get 容器服务配置 
     * @return K8sService 容器服务配置
     */
    public K8sService [] getK8sService() {
        return this.K8sService;
    }

    /**
     * Set 容器服务配置
     * @param K8sService 容器服务配置
     */
    public void setK8sService(K8sService [] K8sService) {
        this.K8sService = K8sService;
    }

    public ModifyUpstreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUpstreamRequest(ModifyUpstreamRequest source) {
        if (source.UpstreamId != null) {
            this.UpstreamId = new String(source.UpstreamId);
        }
        if (source.UpstreamName != null) {
            this.UpstreamName = new String(source.UpstreamName);
        }
        if (source.UpstreamDescription != null) {
            this.UpstreamDescription = new String(source.UpstreamDescription);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Retries != null) {
            this.Retries = new Long(source.Retries);
        }
        if (source.UpstreamHost != null) {
            this.UpstreamHost = new String(source.UpstreamHost);
        }
        if (source.Nodes != null) {
            this.Nodes = new UpstreamNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new UpstreamNode(source.Nodes[i]);
            }
        }
        if (source.HealthChecker != null) {
            this.HealthChecker = new UpstreamHealthChecker(source.HealthChecker);
        }
        if (source.K8sService != null) {
            this.K8sService = new K8sService[source.K8sService.length];
            for (int i = 0; i < source.K8sService.length; i++) {
                this.K8sService[i] = new K8sService(source.K8sService[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpstreamId", this.UpstreamId);
        this.setParamSimple(map, prefix + "UpstreamName", this.UpstreamName);
        this.setParamSimple(map, prefix + "UpstreamDescription", this.UpstreamDescription);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamObj(map, prefix + "HealthChecker.", this.HealthChecker);
        this.setParamArrayObj(map, prefix + "K8sService.", this.K8sService);

    }
}

