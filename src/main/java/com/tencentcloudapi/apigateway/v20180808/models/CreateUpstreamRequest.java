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

public class CreateUpstreamRequest extends AbstractModel{

    /**
    * 后端协议，HTTP, HTTPS其中之一
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 负载均衡算法目前支持ROUND_ROBIN
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
    * VPC通道名字
    */
    @SerializedName("UpstreamName")
    @Expose
    private String UpstreamName;

    /**
    * VPC通道描述
    */
    @SerializedName("UpstreamDescription")
    @Expose
    private String UpstreamDescription;

    /**
    * 请求重试次数，默认3次
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * 请求到后端的，host头
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
    * 后端节点
    */
    @SerializedName("Nodes")
    @Expose
    private UpstreamNode [] Nodes;

    /**
    * k8s服务的配置
    */
    @SerializedName("K8sService")
    @Expose
    private K8sService [] K8sService;

    /**
     * Get 后端协议，HTTP, HTTPS其中之一 
     * @return Scheme 后端协议，HTTP, HTTPS其中之一
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 后端协议，HTTP, HTTPS其中之一
     * @param Scheme 后端协议，HTTP, HTTPS其中之一
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 负载均衡算法目前支持ROUND_ROBIN 
     * @return Algorithm 负载均衡算法目前支持ROUND_ROBIN
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 负载均衡算法目前支持ROUND_ROBIN
     * @param Algorithm 负载均衡算法目前支持ROUND_ROBIN
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
     * Get VPC通道名字 
     * @return UpstreamName VPC通道名字
     */
    public String getUpstreamName() {
        return this.UpstreamName;
    }

    /**
     * Set VPC通道名字
     * @param UpstreamName VPC通道名字
     */
    public void setUpstreamName(String UpstreamName) {
        this.UpstreamName = UpstreamName;
    }

    /**
     * Get VPC通道描述 
     * @return UpstreamDescription VPC通道描述
     */
    public String getUpstreamDescription() {
        return this.UpstreamDescription;
    }

    /**
     * Set VPC通道描述
     * @param UpstreamDescription VPC通道描述
     */
    public void setUpstreamDescription(String UpstreamDescription) {
        this.UpstreamDescription = UpstreamDescription;
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
     * Get 请求到后端的，host头 
     * @return UpstreamHost 请求到后端的，host头
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set 请求到后端的，host头
     * @param UpstreamHost 请求到后端的，host头
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    /**
     * Get 后端节点 
     * @return Nodes 后端节点
     */
    public UpstreamNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 后端节点
     * @param Nodes 后端节点
     */
    public void setNodes(UpstreamNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get k8s服务的配置 
     * @return K8sService k8s服务的配置
     */
    public K8sService [] getK8sService() {
        return this.K8sService;
    }

    /**
     * Set k8s服务的配置
     * @param K8sService k8s服务的配置
     */
    public void setK8sService(K8sService [] K8sService) {
        this.K8sService = K8sService;
    }

    public CreateUpstreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUpstreamRequest(CreateUpstreamRequest source) {
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UpstreamName != null) {
            this.UpstreamName = new String(source.UpstreamName);
        }
        if (source.UpstreamDescription != null) {
            this.UpstreamDescription = new String(source.UpstreamDescription);
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
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UpstreamName", this.UpstreamName);
        this.setParamSimple(map, prefix + "UpstreamDescription", this.UpstreamDescription);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArrayObj(map, prefix + "K8sService.", this.K8sService);

    }
}

