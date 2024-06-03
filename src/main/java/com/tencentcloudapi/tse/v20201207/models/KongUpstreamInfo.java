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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongUpstreamInfo extends AbstractModel {

    /**
    * IP或域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 服务来源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceID")
    @Expose
    private String SourceID;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 服务（注册中心或Kubernetes中的服务）名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 服务后端类型是IPList时提供
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Targets")
    @Expose
    private KongTarget [] Targets;

    /**
    * 服务来源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * SCF函数类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfType")
    @Expose
    private String ScfType;

    /**
    * SCF函数命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfNamespace")
    @Expose
    private String ScfNamespace;

    /**
    * SCF函数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfLambdaName")
    @Expose
    private String ScfLambdaName;

    /**
    * SCF函数版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfLambdaQualifier")
    @Expose
    private String ScfLambdaQualifier;

    /**
    * 冷启动时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlowStart")
    @Expose
    private Long SlowStart;

    /**
    * 负载均衡算法，默认为 round-robin，还支持 least-connections，consisten_hashing
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * CVM弹性伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoScalingGroupID")
    @Expose
    private String AutoScalingGroupID;

    /**
    * CVM弹性伸缩组端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoScalingCvmPort")
    @Expose
    private Long AutoScalingCvmPort;

    /**
    * CVM弹性伸缩组使用的CVM TAT命令状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoScalingTatCmdStatus")
    @Expose
    private String AutoScalingTatCmdStatus;

    /**
    * CVM弹性伸缩组生命周期挂钩状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoScalingHookStatus")
    @Expose
    private String AutoScalingHookStatus;

    /**
    * 服务来源的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 精确的服务来源类型，新建服务来源时候传入的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealSourceType")
    @Expose
    private String RealSourceType;

    /**
    * upstream健康状态HEALTHY（健康）, UNHEALTHY（异常）, HEALTHCHECKS_OFF（未开启）和NONE（不支持健康检查）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthStatus")
    @Expose
    private String HealthStatus;

    /**
    * 云函数是否开启CAM鉴权，不填时默认为开启(true)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfCamAuthEnable")
    @Expose
    private Boolean ScfCamAuthEnable;

    /**
    * 云函数是否开启Base64编码，默认为false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfIsBase64Encoded")
    @Expose
    private Boolean ScfIsBase64Encoded;

    /**
    * 云函数是否开启响应集成，默认为false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfIsIntegratedResponse")
    @Expose
    private Boolean ScfIsIntegratedResponse;

    /**
     * Get IP或域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host IP或域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set IP或域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host IP或域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 服务来源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceID 服务来源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceID() {
        return this.SourceID;
    }

    /**
     * Set 服务来源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceID 服务来源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceID(String SourceID) {
        this.SourceID = SourceID;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 服务（注册中心或Kubernetes中的服务）名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 服务（注册中心或Kubernetes中的服务）名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务（注册中心或Kubernetes中的服务）名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 服务（注册中心或Kubernetes中的服务）名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 服务后端类型是IPList时提供
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Targets 服务后端类型是IPList时提供
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KongTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 服务后端类型是IPList时提供
注意：此字段可能返回 null，表示取不到有效值。
     * @param Targets 服务后端类型是IPList时提供
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargets(KongTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 服务来源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 服务来源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 服务来源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 服务来源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get SCF函数类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfType SCF函数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScfType() {
        return this.ScfType;
    }

    /**
     * Set SCF函数类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfType SCF函数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfType(String ScfType) {
        this.ScfType = ScfType;
    }

    /**
     * Get SCF函数命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfNamespace SCF函数命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScfNamespace() {
        return this.ScfNamespace;
    }

    /**
     * Set SCF函数命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfNamespace SCF函数命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfNamespace(String ScfNamespace) {
        this.ScfNamespace = ScfNamespace;
    }

    /**
     * Get SCF函数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfLambdaName SCF函数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScfLambdaName() {
        return this.ScfLambdaName;
    }

    /**
     * Set SCF函数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfLambdaName SCF函数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfLambdaName(String ScfLambdaName) {
        this.ScfLambdaName = ScfLambdaName;
    }

    /**
     * Get SCF函数版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfLambdaQualifier SCF函数版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScfLambdaQualifier() {
        return this.ScfLambdaQualifier;
    }

    /**
     * Set SCF函数版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfLambdaQualifier SCF函数版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfLambdaQualifier(String ScfLambdaQualifier) {
        this.ScfLambdaQualifier = ScfLambdaQualifier;
    }

    /**
     * Get 冷启动时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlowStart 冷启动时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSlowStart() {
        return this.SlowStart;
    }

    /**
     * Set 冷启动时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlowStart 冷启动时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlowStart(Long SlowStart) {
        this.SlowStart = SlowStart;
    }

    /**
     * Get 负载均衡算法，默认为 round-robin，还支持 least-connections，consisten_hashing
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Algorithm 负载均衡算法，默认为 round-robin，还支持 least-connections，consisten_hashing
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 负载均衡算法，默认为 round-robin，还支持 least-connections，consisten_hashing
注意：此字段可能返回 null，表示取不到有效值。
     * @param Algorithm 负载均衡算法，默认为 round-robin，还支持 least-connections，consisten_hashing
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get CVM弹性伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoScalingGroupID CVM弹性伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoScalingGroupID() {
        return this.AutoScalingGroupID;
    }

    /**
     * Set CVM弹性伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoScalingGroupID CVM弹性伸缩组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoScalingGroupID(String AutoScalingGroupID) {
        this.AutoScalingGroupID = AutoScalingGroupID;
    }

    /**
     * Get CVM弹性伸缩组端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoScalingCvmPort CVM弹性伸缩组端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoScalingCvmPort() {
        return this.AutoScalingCvmPort;
    }

    /**
     * Set CVM弹性伸缩组端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoScalingCvmPort CVM弹性伸缩组端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoScalingCvmPort(Long AutoScalingCvmPort) {
        this.AutoScalingCvmPort = AutoScalingCvmPort;
    }

    /**
     * Get CVM弹性伸缩组使用的CVM TAT命令状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoScalingTatCmdStatus CVM弹性伸缩组使用的CVM TAT命令状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoScalingTatCmdStatus() {
        return this.AutoScalingTatCmdStatus;
    }

    /**
     * Set CVM弹性伸缩组使用的CVM TAT命令状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoScalingTatCmdStatus CVM弹性伸缩组使用的CVM TAT命令状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoScalingTatCmdStatus(String AutoScalingTatCmdStatus) {
        this.AutoScalingTatCmdStatus = AutoScalingTatCmdStatus;
    }

    /**
     * Get CVM弹性伸缩组生命周期挂钩状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoScalingHookStatus CVM弹性伸缩组生命周期挂钩状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoScalingHookStatus() {
        return this.AutoScalingHookStatus;
    }

    /**
     * Set CVM弹性伸缩组生命周期挂钩状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoScalingHookStatus CVM弹性伸缩组生命周期挂钩状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoScalingHookStatus(String AutoScalingHookStatus) {
        this.AutoScalingHookStatus = AutoScalingHookStatus;
    }

    /**
     * Get 服务来源的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceName 服务来源的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 服务来源的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceName 服务来源的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 精确的服务来源类型，新建服务来源时候传入的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealSourceType 精确的服务来源类型，新建服务来源时候传入的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealSourceType() {
        return this.RealSourceType;
    }

    /**
     * Set 精确的服务来源类型，新建服务来源时候传入的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealSourceType 精确的服务来源类型，新建服务来源时候传入的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealSourceType(String RealSourceType) {
        this.RealSourceType = RealSourceType;
    }

    /**
     * Get upstream健康状态HEALTHY（健康）, UNHEALTHY（异常）, HEALTHCHECKS_OFF（未开启）和NONE（不支持健康检查）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthStatus upstream健康状态HEALTHY（健康）, UNHEALTHY（异常）, HEALTHCHECKS_OFF（未开启）和NONE（不支持健康检查）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set upstream健康状态HEALTHY（健康）, UNHEALTHY（异常）, HEALTHCHECKS_OFF（未开启）和NONE（不支持健康检查）
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthStatus upstream健康状态HEALTHY（健康）, UNHEALTHY（异常）, HEALTHCHECKS_OFF（未开启）和NONE（不支持健康检查）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get 云函数是否开启CAM鉴权，不填时默认为开启(true)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfCamAuthEnable 云函数是否开启CAM鉴权，不填时默认为开启(true)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScfCamAuthEnable() {
        return this.ScfCamAuthEnable;
    }

    /**
     * Set 云函数是否开启CAM鉴权，不填时默认为开启(true)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfCamAuthEnable 云函数是否开启CAM鉴权，不填时默认为开启(true)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfCamAuthEnable(Boolean ScfCamAuthEnable) {
        this.ScfCamAuthEnable = ScfCamAuthEnable;
    }

    /**
     * Get 云函数是否开启Base64编码，默认为false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfIsBase64Encoded 云函数是否开启Base64编码，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScfIsBase64Encoded() {
        return this.ScfIsBase64Encoded;
    }

    /**
     * Set 云函数是否开启Base64编码，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfIsBase64Encoded 云函数是否开启Base64编码，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfIsBase64Encoded(Boolean ScfIsBase64Encoded) {
        this.ScfIsBase64Encoded = ScfIsBase64Encoded;
    }

    /**
     * Get 云函数是否开启响应集成，默认为false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfIsIntegratedResponse 云函数是否开启响应集成，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScfIsIntegratedResponse() {
        return this.ScfIsIntegratedResponse;
    }

    /**
     * Set 云函数是否开启响应集成，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfIsIntegratedResponse 云函数是否开启响应集成，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfIsIntegratedResponse(Boolean ScfIsIntegratedResponse) {
        this.ScfIsIntegratedResponse = ScfIsIntegratedResponse;
    }

    public KongUpstreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongUpstreamInfo(KongUpstreamInfo source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.SourceID != null) {
            this.SourceID = new String(source.SourceID);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Targets != null) {
            this.Targets = new KongTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new KongTarget(source.Targets[i]);
            }
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.ScfType != null) {
            this.ScfType = new String(source.ScfType);
        }
        if (source.ScfNamespace != null) {
            this.ScfNamespace = new String(source.ScfNamespace);
        }
        if (source.ScfLambdaName != null) {
            this.ScfLambdaName = new String(source.ScfLambdaName);
        }
        if (source.ScfLambdaQualifier != null) {
            this.ScfLambdaQualifier = new String(source.ScfLambdaQualifier);
        }
        if (source.SlowStart != null) {
            this.SlowStart = new Long(source.SlowStart);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.AutoScalingGroupID != null) {
            this.AutoScalingGroupID = new String(source.AutoScalingGroupID);
        }
        if (source.AutoScalingCvmPort != null) {
            this.AutoScalingCvmPort = new Long(source.AutoScalingCvmPort);
        }
        if (source.AutoScalingTatCmdStatus != null) {
            this.AutoScalingTatCmdStatus = new String(source.AutoScalingTatCmdStatus);
        }
        if (source.AutoScalingHookStatus != null) {
            this.AutoScalingHookStatus = new String(source.AutoScalingHookStatus);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.RealSourceType != null) {
            this.RealSourceType = new String(source.RealSourceType);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new String(source.HealthStatus);
        }
        if (source.ScfCamAuthEnable != null) {
            this.ScfCamAuthEnable = new Boolean(source.ScfCamAuthEnable);
        }
        if (source.ScfIsBase64Encoded != null) {
            this.ScfIsBase64Encoded = new Boolean(source.ScfIsBase64Encoded);
        }
        if (source.ScfIsIntegratedResponse != null) {
            this.ScfIsIntegratedResponse = new Boolean(source.ScfIsIntegratedResponse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SourceID", this.SourceID);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ScfType", this.ScfType);
        this.setParamSimple(map, prefix + "ScfNamespace", this.ScfNamespace);
        this.setParamSimple(map, prefix + "ScfLambdaName", this.ScfLambdaName);
        this.setParamSimple(map, prefix + "ScfLambdaQualifier", this.ScfLambdaQualifier);
        this.setParamSimple(map, prefix + "SlowStart", this.SlowStart);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "AutoScalingGroupID", this.AutoScalingGroupID);
        this.setParamSimple(map, prefix + "AutoScalingCvmPort", this.AutoScalingCvmPort);
        this.setParamSimple(map, prefix + "AutoScalingTatCmdStatus", this.AutoScalingTatCmdStatus);
        this.setParamSimple(map, prefix + "AutoScalingHookStatus", this.AutoScalingHookStatus);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "RealSourceType", this.RealSourceType);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "ScfCamAuthEnable", this.ScfCamAuthEnable);
        this.setParamSimple(map, prefix + "ScfIsBase64Encoded", this.ScfIsBase64Encoded);
        this.setParamSimple(map, prefix + "ScfIsIntegratedResponse", this.ScfIsIntegratedResponse);

    }
}

