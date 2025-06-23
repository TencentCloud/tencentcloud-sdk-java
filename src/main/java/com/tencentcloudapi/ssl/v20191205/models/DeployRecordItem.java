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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployRecordItem extends AbstractModel {

    /**
    * 部署记录详情ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 原绑定证书ID
    */
    @SerializedName("OldCertId")
    @Expose
    private String OldCertId;

    /**
    * 部署实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 部署实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 部署监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 部署域名列表
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 部署监听器协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 部署状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 部署错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 部署记录详情创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 部署记录详情最后一次更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 部署监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 是否开启SNI
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * COS存储桶名称
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * secret名称
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 部署的TCB地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * 部署资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 部署记录详情ID 
     * @return Id 部署记录详情ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 部署记录详情ID
     * @param Id 部署记录详情ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 原绑定证书ID 
     * @return OldCertId 原绑定证书ID
     */
    public String getOldCertId() {
        return this.OldCertId;
    }

    /**
     * Set 原绑定证书ID
     * @param OldCertId 原绑定证书ID
     */
    public void setOldCertId(String OldCertId) {
        this.OldCertId = OldCertId;
    }

    /**
     * Get 部署实例ID 
     * @return InstanceId 部署实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 部署实例ID
     * @param InstanceId 部署实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 部署实例名称 
     * @return InstanceName 部署实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 部署实例名称
     * @param InstanceName 部署实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 部署监听器ID 
     * @return ListenerId 部署监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 部署监听器ID
     * @param ListenerId 部署监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 部署域名列表 
     * @return Domains 部署域名列表
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 部署域名列表
     * @param Domains 部署域名列表
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 部署监听器协议 
     * @return Protocol 部署监听器协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 部署监听器协议
     * @param Protocol 部署监听器协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 部署状态 
     * @return Status 部署状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 部署状态
     * @param Status 部署状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 部署错误信息 
     * @return ErrorMsg 部署错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 部署错误信息
     * @param ErrorMsg 部署错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 部署记录详情创建时间 
     * @return CreateTime 部署记录详情创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 部署记录详情创建时间
     * @param CreateTime 部署记录详情创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 部署记录详情最后一次更新时间 
     * @return UpdateTime 部署记录详情最后一次更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 部署记录详情最后一次更新时间
     * @param UpdateTime 部署记录详情最后一次更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 部署监听器名称 
     * @return ListenerName 部署监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 部署监听器名称
     * @param ListenerName 部署监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 是否开启SNI 
     * @return SniSwitch 是否开启SNI
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set 是否开启SNI
     * @param SniSwitch 是否开启SNI
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get COS存储桶名称 
     * @return Bucket COS存储桶名称
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS存储桶名称
     * @param Bucket COS存储桶名称
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 命名空间名称 
     * @return Namespace 命名空间名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称
     * @param Namespace 命名空间名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get secret名称 
     * @return SecretName secret名称
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set secret名称
     * @param SecretName secret名称
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 部署的TCB地域 
     * @return Region 部署的TCB地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 部署的TCB地域
     * @param Region 部署的TCB地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡 
     * @return Forward 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡
     * @param Forward 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证 
     * @return SSLMode 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
     * @param SSLMode 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get 部署资源类型 
     * @return ResourceType 部署资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 部署资源类型
     * @param ResourceType 部署资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public DeployRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployRecordItem(DeployRecordItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OldCertId != null) {
            this.OldCertId = new String(source.OldCertId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OldCertId", this.OldCertId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

