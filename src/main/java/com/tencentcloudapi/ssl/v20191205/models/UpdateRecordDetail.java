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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordDetail extends AbstractModel{

    /**
    * 详情记录id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 新证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 旧证书ID
    */
    @SerializedName("OldCertId")
    @Expose
    private String OldCertId;

    /**
    * 部署域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 部署资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 部署地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 部署状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 部署错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 部署时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后一次更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 部署实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 部署实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 部署监听器ID（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 部署监听器名称（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 是否开启SNI（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * bucket名称（COS专用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 命名空间（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * secret名称（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 环境ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * TCB部署类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TCBType")
    @Expose
    private String TCBType;

    /**
     * Get 详情记录id 
     * @return Id 详情记录id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 详情记录id
     * @param Id 详情记录id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 新证书ID 
     * @return CertId 新证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 新证书ID
     * @param CertId 新证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 旧证书ID 
     * @return OldCertId 旧证书ID
     */
    public String getOldCertId() {
        return this.OldCertId;
    }

    /**
     * Set 旧证书ID
     * @param OldCertId 旧证书ID
     */
    public void setOldCertId(String OldCertId) {
        this.OldCertId = OldCertId;
    }

    /**
     * Get 部署域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domains 部署域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 部署域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domains 部署域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
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

    /**
     * Get 部署地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 部署地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 部署地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 部署地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 部署错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 部署错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 部署错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 部署时间 
     * @return CreateTime 部署时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 部署时间
     * @param CreateTime 部署时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后一次更新时间 
     * @return UpdateTime 最后一次更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后一次更新时间
     * @param UpdateTime 最后一次更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 部署实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 部署实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 部署实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 部署实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 部署实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 部署实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 部署实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 部署实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 部署监听器ID（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerId 部署监听器ID（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 部署监听器ID（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerId 部署监听器ID（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 部署监听器名称（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerName 部署监听器名称（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 部署监听器名称（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerName 部署监听器名称（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 是否开启SNI（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SniSwitch 是否开启SNI（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set 是否开启SNI（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SniSwitch 是否开启SNI（CLB专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get bucket名称（COS专用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket bucket名称（COS专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set bucket名称（COS专用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket bucket名称（COS专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
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
     * Get 命名空间（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get secret名称（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretName secret名称（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set secret名称（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretName secret名称（TKE专用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 环境ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get TCB部署类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TCBType TCB部署类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTCBType() {
        return this.TCBType;
    }

    /**
     * Set TCB部署类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TCBType TCB部署类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTCBType(String TCBType) {
        this.TCBType = TCBType;
    }

    public UpdateRecordDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordDetail(UpdateRecordDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.OldCertId != null) {
            this.OldCertId = new String(source.OldCertId);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.TCBType != null) {
            this.TCBType = new String(source.TCBType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "OldCertId", this.OldCertId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "TCBType", this.TCBType);

    }
}

