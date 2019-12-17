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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHTTPSListenerRequest extends AbstractModel{

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 服务器证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 加速通道转发到源站的协议类型：HTTP | HTTPS
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * 通道ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 认证类型，其中：
0，单向认证；
1，双向认证。
默认使用单向认证。
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * 新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

    /**
     * Get 监听器名称 
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复 
     * @return Port 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     * @param Port 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 服务器证书ID 
     * @return CertificateId 服务器证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 服务器证书ID
     * @param CertificateId 服务器证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 加速通道转发到源站的协议类型：HTTP | HTTPS 
     * @return ForwardProtocol 加速通道转发到源站的协议类型：HTTP | HTTPS
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set 加速通道转发到源站的协议类型：HTTP | HTTPS
     * @param ForwardProtocol 加速通道转发到源站的协议类型：HTTP | HTTPS
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get 通道ID 
     * @return ProxyId 通道ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID
     * @param ProxyId 通道ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 认证类型，其中：
0，单向认证；
1，双向认证。
默认使用单向认证。 
     * @return AuthType 认证类型，其中：
0，单向认证；
1，双向认证。
默认使用单向认证。
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证类型，其中：
0，单向认证；
1，双向认证。
默认使用单向认证。
     * @param AuthType 认证类型，其中：
0，单向认证；
1，双向认证。
默认使用单向认证。
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数 
     * @return ClientCertificateId 客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set 客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数
     * @param ClientCertificateId 客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get 新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数 
     * @return PolyClientCertificateIds 新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set 新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数
     * @param PolyClientCertificateIds 新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamArraySimple(map, prefix + "PolyClientCertificateIds.", this.PolyClientCertificateIds);

    }
}

