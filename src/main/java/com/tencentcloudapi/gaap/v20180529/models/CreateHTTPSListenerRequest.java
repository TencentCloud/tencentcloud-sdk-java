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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHTTPSListenerRequest extends AbstractModel {

    /**
    * <p>监听器名称</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>服务器证书ID</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * <p>加速通道转发到源站的协议类型：HTTP | HTTPS</p>
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * <p>通道ID，与GroupId之间只能设置一个。表示创建通道的监听器。</p>
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * <p>认证类型，其中：0，单向认证；1，双向认证。默认使用单向认证。</p>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数</p>
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * <p>新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数</p>
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

    /**
    * <p>通道组ID，与ProxyId之间只能设置一个。表示创建通道组的监听器。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。该功能的启停无法在监听器创建完毕后再修改。</p>
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get <p>监听器名称</p> 
     * @return ListenerName <p>监听器名称</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>监听器名称</p>
     * @param ListenerName <p>监听器名称</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p> 
     * @return Port <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p>
     * @param Port <p>监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>服务器证书ID</p> 
     * @return CertificateId <p>服务器证书ID</p>
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>服务器证书ID</p>
     * @param CertificateId <p>服务器证书ID</p>
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get <p>加速通道转发到源站的协议类型：HTTP | HTTPS</p> 
     * @return ForwardProtocol <p>加速通道转发到源站的协议类型：HTTP | HTTPS</p>
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set <p>加速通道转发到源站的协议类型：HTTP | HTTPS</p>
     * @param ForwardProtocol <p>加速通道转发到源站的协议类型：HTTP | HTTPS</p>
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get <p>通道ID，与GroupId之间只能设置一个。表示创建通道的监听器。</p> 
     * @return ProxyId <p>通道ID，与GroupId之间只能设置一个。表示创建通道的监听器。</p>
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set <p>通道ID，与GroupId之间只能设置一个。表示创建通道的监听器。</p>
     * @param ProxyId <p>通道ID，与GroupId之间只能设置一个。表示创建通道的监听器。</p>
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get <p>认证类型，其中：0，单向认证；1，双向认证。默认使用单向认证。</p> 
     * @return AuthType <p>认证类型，其中：0，单向认证；1，双向认证。默认使用单向认证。</p>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>认证类型，其中：0，单向认证；1，双向认证。默认使用单向认证。</p>
     * @param AuthType <p>认证类型，其中：0，单向认证；1，双向认证。默认使用单向认证。</p>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数</p> 
     * @return ClientCertificateId <p>客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数</p>
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set <p>客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数</p>
     * @param ClientCertificateId <p>客户端CA单证书ID，仅当双向认证时设置该参数或PolyClientCertificateIds参数</p>
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get <p>新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数</p> 
     * @return PolyClientCertificateIds <p>新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数</p>
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set <p>新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数</p>
     * @param PolyClientCertificateIds <p>新的客户端多CA证书ID，仅当双向认证时设置该参数或设置ClientCertificateId参数</p>
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    /**
     * Get <p>通道组ID，与ProxyId之间只能设置一个。表示创建通道组的监听器。</p> 
     * @return GroupId <p>通道组ID，与ProxyId之间只能设置一个。表示创建通道组的监听器。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>通道组ID，与ProxyId之间只能设置一个。表示创建通道组的监听器。</p>
     * @param GroupId <p>通道组ID，与ProxyId之间只能设置一个。表示创建通道组的监听器。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。该功能的启停无法在监听器创建完毕后再修改。</p> 
     * @return Http3Supported <p>支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。该功能的启停无法在监听器创建完毕后再修改。</p>
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set <p>支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。该功能的启停无法在监听器创建完毕后再修改。</p>
     * @param Http3Supported <p>支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。该功能的启停无法在监听器创建完毕后再修改。</p>
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public CreateHTTPSListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHTTPSListenerRequest(CreateHTTPSListenerRequest source) {
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.ClientCertificateId != null) {
            this.ClientCertificateId = new String(source.ClientCertificateId);
        }
        if (source.PolyClientCertificateIds != null) {
            this.PolyClientCertificateIds = new String[source.PolyClientCertificateIds.length];
            for (int i = 0; i < source.PolyClientCertificateIds.length; i++) {
                this.PolyClientCertificateIds[i] = new String(source.PolyClientCertificateIds[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

