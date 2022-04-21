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

public class UpstreamInfo extends AbstractModel{

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
    * 请求重试次数
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * 后端节点
    */
    @SerializedName("Nodes")
    @Expose
    private UpstreamNode [] Nodes;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthChecker")
    @Expose
    private UpstreamHealthChecker HealthChecker;

    /**
    * 后端的类型，取值范围：IP_PORT, K8S
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * K8S容器服务配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K8sServices")
    @Expose
    private K8sService [] K8sServices;

    /**
    * 网关转发给后端的Host请求头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

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
     * Get 请求重试次数 
     * @return Retries 请求重试次数
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set 请求重试次数
     * @param Retries 请求重试次数
     */
    public void setRetries(Long Retries) {
        this.Retries = Retries;
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
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthChecker 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamHealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthChecker 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthChecker(UpstreamHealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get 后端的类型，取值范围：IP_PORT, K8S 
     * @return UpstreamType 后端的类型，取值范围：IP_PORT, K8S
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set 后端的类型，取值范围：IP_PORT, K8S
     * @param UpstreamType 后端的类型，取值范围：IP_PORT, K8S
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get K8S容器服务配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K8sServices K8S容器服务配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public K8sService [] getK8sServices() {
        return this.K8sServices;
    }

    /**
     * Set K8S容器服务配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param K8sServices K8S容器服务配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK8sServices(K8sService [] K8sServices) {
        this.K8sServices = K8sServices;
    }

    /**
     * Get 网关转发给后端的Host请求头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamHost 网关转发给后端的Host请求头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set 网关转发给后端的Host请求头
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamHost 网关转发给后端的Host请求头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    public UpstreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamInfo(UpstreamInfo source) {
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
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Retries != null) {
            this.Retries = new Long(source.Retries);
        }
        if (source.Nodes != null) {
            this.Nodes = new UpstreamNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new UpstreamNode(source.Nodes[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HealthChecker != null) {
            this.HealthChecker = new UpstreamHealthChecker(source.HealthChecker);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.K8sServices != null) {
            this.K8sServices = new K8sService[source.K8sServices.length];
            for (int i = 0; i < source.K8sServices.length; i++) {
                this.K8sServices[i] = new K8sService(source.K8sServices[i]);
            }
        }
        if (source.UpstreamHost != null) {
            this.UpstreamHost = new String(source.UpstreamHost);
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
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "HealthChecker.", this.HealthChecker);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamArrayObj(map, prefix + "K8sServices.", this.K8sServices);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);

    }
}

