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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyListenerRequest extends AbstractModel {

    /**
    * 全球加速实例ID。
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * 监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 名称，最大长度不能超过60个字节。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述信息，最大长度不能超过100个字节。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 连接空闲等待时间。
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * 是否开启会话保持。
    */
    @SerializedName("ClientAffinity")
    @Expose
    private String ClientAffinity;

    /**
    * 会话保持时间。
    */
    @SerializedName("ClientAffinityTime")
    @Expose
    private Long ClientAffinityTime;

    /**
    * 请求超时时间。
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * 是否打开七层获取源IP方式。
    */
    @SerializedName("XForwardedForRealIp")
    @Expose
    private Boolean XForwardedForRealIp;

    /**
    * 解析方式。UNIDIRECTIONAL：双向。MUTUAL：单向。
    */
    @SerializedName("CertificationType")
    @Expose
    private String CertificationType;

    /**
    * 加密算法套件。
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * 服务器证书。
    */
    @SerializedName("ServerCertificates")
    @Expose
    private String [] ServerCertificates;

    /**
    * 客户端证书。
    */
    @SerializedName("ClientCaCertificates")
    @Expose
    private String [] ClientCaCertificates;

    /**
    * 四层获取源IP方式。
    */
    @SerializedName("GetRealIpType")
    @Expose
    private String GetRealIpType;

    /**
     * Get 全球加速实例ID。 
     * @return GlobalAcceleratorId 全球加速实例ID。
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set 全球加速实例ID。
     * @param GlobalAcceleratorId 全球加速实例ID。
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get 监听器ID。 
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 名称，最大长度不能超过60个字节。 
     * @return Name 名称，最大长度不能超过60个字节。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称，最大长度不能超过60个字节。
     * @param Name 名称，最大长度不能超过60个字节。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述信息，最大长度不能超过100个字节。 
     * @return Description 描述信息，最大长度不能超过100个字节。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息，最大长度不能超过100个字节。
     * @param Description 描述信息，最大长度不能超过100个字节。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 连接空闲等待时间。 
     * @return IdleTimeout 连接空闲等待时间。
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 连接空闲等待时间。
     * @param IdleTimeout 连接空闲等待时间。
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get 是否开启会话保持。 
     * @return ClientAffinity 是否开启会话保持。
     */
    public String getClientAffinity() {
        return this.ClientAffinity;
    }

    /**
     * Set 是否开启会话保持。
     * @param ClientAffinity 是否开启会话保持。
     */
    public void setClientAffinity(String ClientAffinity) {
        this.ClientAffinity = ClientAffinity;
    }

    /**
     * Get 会话保持时间。 
     * @return ClientAffinityTime 会话保持时间。
     */
    public Long getClientAffinityTime() {
        return this.ClientAffinityTime;
    }

    /**
     * Set 会话保持时间。
     * @param ClientAffinityTime 会话保持时间。
     */
    public void setClientAffinityTime(Long ClientAffinityTime) {
        this.ClientAffinityTime = ClientAffinityTime;
    }

    /**
     * Get 请求超时时间。 
     * @return RequestTimeout 请求超时时间。
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set 请求超时时间。
     * @param RequestTimeout 请求超时时间。
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get 是否打开七层获取源IP方式。 
     * @return XForwardedForRealIp 是否打开七层获取源IP方式。
     */
    public Boolean getXForwardedForRealIp() {
        return this.XForwardedForRealIp;
    }

    /**
     * Set 是否打开七层获取源IP方式。
     * @param XForwardedForRealIp 是否打开七层获取源IP方式。
     */
    public void setXForwardedForRealIp(Boolean XForwardedForRealIp) {
        this.XForwardedForRealIp = XForwardedForRealIp;
    }

    /**
     * Get 解析方式。UNIDIRECTIONAL：双向。MUTUAL：单向。 
     * @return CertificationType 解析方式。UNIDIRECTIONAL：双向。MUTUAL：单向。
     */
    public String getCertificationType() {
        return this.CertificationType;
    }

    /**
     * Set 解析方式。UNIDIRECTIONAL：双向。MUTUAL：单向。
     * @param CertificationType 解析方式。UNIDIRECTIONAL：双向。MUTUAL：单向。
     */
    public void setCertificationType(String CertificationType) {
        this.CertificationType = CertificationType;
    }

    /**
     * Get 加密算法套件。 
     * @return CipherPolicyId 加密算法套件。
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set 加密算法套件。
     * @param CipherPolicyId 加密算法套件。
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get 服务器证书。 
     * @return ServerCertificates 服务器证书。
     */
    public String [] getServerCertificates() {
        return this.ServerCertificates;
    }

    /**
     * Set 服务器证书。
     * @param ServerCertificates 服务器证书。
     */
    public void setServerCertificates(String [] ServerCertificates) {
        this.ServerCertificates = ServerCertificates;
    }

    /**
     * Get 客户端证书。 
     * @return ClientCaCertificates 客户端证书。
     */
    public String [] getClientCaCertificates() {
        return this.ClientCaCertificates;
    }

    /**
     * Set 客户端证书。
     * @param ClientCaCertificates 客户端证书。
     */
    public void setClientCaCertificates(String [] ClientCaCertificates) {
        this.ClientCaCertificates = ClientCaCertificates;
    }

    /**
     * Get 四层获取源IP方式。 
     * @return GetRealIpType 四层获取源IP方式。
     */
    public String getGetRealIpType() {
        return this.GetRealIpType;
    }

    /**
     * Set 四层获取源IP方式。
     * @param GetRealIpType 四层获取源IP方式。
     */
    public void setGetRealIpType(String GetRealIpType) {
        this.GetRealIpType = GetRealIpType;
    }

    public ModifyListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyListenerRequest(ModifyListenerRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.ClientAffinity != null) {
            this.ClientAffinity = new String(source.ClientAffinity);
        }
        if (source.ClientAffinityTime != null) {
            this.ClientAffinityTime = new Long(source.ClientAffinityTime);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.XForwardedForRealIp != null) {
            this.XForwardedForRealIp = new Boolean(source.XForwardedForRealIp);
        }
        if (source.CertificationType != null) {
            this.CertificationType = new String(source.CertificationType);
        }
        if (source.CipherPolicyId != null) {
            this.CipherPolicyId = new String(source.CipherPolicyId);
        }
        if (source.ServerCertificates != null) {
            this.ServerCertificates = new String[source.ServerCertificates.length];
            for (int i = 0; i < source.ServerCertificates.length; i++) {
                this.ServerCertificates[i] = new String(source.ServerCertificates[i]);
            }
        }
        if (source.ClientCaCertificates != null) {
            this.ClientCaCertificates = new String[source.ClientCaCertificates.length];
            for (int i = 0; i < source.ClientCaCertificates.length; i++) {
                this.ClientCaCertificates[i] = new String(source.ClientCaCertificates[i]);
            }
        }
        if (source.GetRealIpType != null) {
            this.GetRealIpType = new String(source.GetRealIpType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ClientAffinity", this.ClientAffinity);
        this.setParamSimple(map, prefix + "ClientAffinityTime", this.ClientAffinityTime);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "XForwardedForRealIp", this.XForwardedForRealIp);
        this.setParamSimple(map, prefix + "CertificationType", this.CertificationType);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamArraySimple(map, prefix + "ServerCertificates.", this.ServerCertificates);
        this.setParamArraySimple(map, prefix + "ClientCaCertificates.", this.ClientCaCertificates);
        this.setParamSimple(map, prefix + "GetRealIpType", this.GetRealIpType);

    }
}

