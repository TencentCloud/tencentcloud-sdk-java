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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpnGatewaySslServerRequest extends AbstractModel {

    /**
    * <p>VPN网关实例ID。</p>
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * <p>SSL-VPN-SERVER 实例名称，长度不超过60个字节。</p>
    */
    @SerializedName("SslVpnServerName")
    @Expose
    private String SslVpnServerName;

    /**
    * <p>客户端地址网段。</p>
    */
    @SerializedName("RemoteAddress")
    @Expose
    private String RemoteAddress;

    /**
    * <p>云端地址（CIDR）列表。</p>
    */
    @SerializedName("LocalAddress")
    @Expose
    private String [] LocalAddress;

    /**
    * <p>SSL VPN服务端监听协议。当前仅支持 UDP，默认UDP。</p>
    */
    @SerializedName("SslVpnProtocol")
    @Expose
    private String SslVpnProtocol;

    /**
    * <p>SSL VPN服务端监听协议端口，默认9798。</p>
    */
    @SerializedName("SslVpnPort")
    @Expose
    private Long SslVpnPort;

    /**
    * <p>认证算法。可选 &#39;SHA1&#39;, &#39;SHA224&#39;, &#39;SHA256&#39;, &#39;SHA384&#39;, &#39;SHA512&#39; 默认SHA1。</p>
    */
    @SerializedName("IntegrityAlgorithm")
    @Expose
    private String IntegrityAlgorithm;

    /**
    * <p>加密算法。可选 &#39;AES-128-CBC&#39;,&#39;AES-192-CBC&#39;, &#39;AES-256-CBC&#39;, &#39;AES-128-GCM&#39;, &#39;AES-192-GCM&#39;, &#39;AES-256-GCM&#39;。</p><p>默认值：AES-128-CBC</p>
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * <p>是否支持压缩。当前不支持压缩，默认False。</p>
    */
    @SerializedName("Compress")
    @Expose
    private Boolean Compress;

    /**
    * <p>是否开启SSO认证。默认为False。该功能当前需要申请开白使用。</p>
    */
    @SerializedName("SsoEnabled")
    @Expose
    private Boolean SsoEnabled;

    /**
    * <p>是否开启策略访问控制。默认为False</p>
    */
    @SerializedName("AccessPolicyEnabled")
    @Expose
    private Boolean AccessPolicyEnabled;

    /**
    * <p>SAML-DATA，开启SSO时传。</p>
    */
    @SerializedName("SamlData")
    @Expose
    private String SamlData;

    /**
    * <p>指定绑定的标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>DNS Server 地址</p>
    */
    @SerializedName("DnsServers")
    @Expose
    private DnsServers DnsServers;

    /**
     * Get <p>VPN网关实例ID。</p> 
     * @return VpnGatewayId <p>VPN网关实例ID。</p>
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set <p>VPN网关实例ID。</p>
     * @param VpnGatewayId <p>VPN网关实例ID。</p>
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get <p>SSL-VPN-SERVER 实例名称，长度不超过60个字节。</p> 
     * @return SslVpnServerName <p>SSL-VPN-SERVER 实例名称，长度不超过60个字节。</p>
     */
    public String getSslVpnServerName() {
        return this.SslVpnServerName;
    }

    /**
     * Set <p>SSL-VPN-SERVER 实例名称，长度不超过60个字节。</p>
     * @param SslVpnServerName <p>SSL-VPN-SERVER 实例名称，长度不超过60个字节。</p>
     */
    public void setSslVpnServerName(String SslVpnServerName) {
        this.SslVpnServerName = SslVpnServerName;
    }

    /**
     * Get <p>客户端地址网段。</p> 
     * @return RemoteAddress <p>客户端地址网段。</p>
     */
    public String getRemoteAddress() {
        return this.RemoteAddress;
    }

    /**
     * Set <p>客户端地址网段。</p>
     * @param RemoteAddress <p>客户端地址网段。</p>
     */
    public void setRemoteAddress(String RemoteAddress) {
        this.RemoteAddress = RemoteAddress;
    }

    /**
     * Get <p>云端地址（CIDR）列表。</p> 
     * @return LocalAddress <p>云端地址（CIDR）列表。</p>
     */
    public String [] getLocalAddress() {
        return this.LocalAddress;
    }

    /**
     * Set <p>云端地址（CIDR）列表。</p>
     * @param LocalAddress <p>云端地址（CIDR）列表。</p>
     */
    public void setLocalAddress(String [] LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    /**
     * Get <p>SSL VPN服务端监听协议。当前仅支持 UDP，默认UDP。</p> 
     * @return SslVpnProtocol <p>SSL VPN服务端监听协议。当前仅支持 UDP，默认UDP。</p>
     */
    public String getSslVpnProtocol() {
        return this.SslVpnProtocol;
    }

    /**
     * Set <p>SSL VPN服务端监听协议。当前仅支持 UDP，默认UDP。</p>
     * @param SslVpnProtocol <p>SSL VPN服务端监听协议。当前仅支持 UDP，默认UDP。</p>
     */
    public void setSslVpnProtocol(String SslVpnProtocol) {
        this.SslVpnProtocol = SslVpnProtocol;
    }

    /**
     * Get <p>SSL VPN服务端监听协议端口，默认9798。</p> 
     * @return SslVpnPort <p>SSL VPN服务端监听协议端口，默认9798。</p>
     */
    public Long getSslVpnPort() {
        return this.SslVpnPort;
    }

    /**
     * Set <p>SSL VPN服务端监听协议端口，默认9798。</p>
     * @param SslVpnPort <p>SSL VPN服务端监听协议端口，默认9798。</p>
     */
    public void setSslVpnPort(Long SslVpnPort) {
        this.SslVpnPort = SslVpnPort;
    }

    /**
     * Get <p>认证算法。可选 &#39;SHA1&#39;, &#39;SHA224&#39;, &#39;SHA256&#39;, &#39;SHA384&#39;, &#39;SHA512&#39; 默认SHA1。</p> 
     * @return IntegrityAlgorithm <p>认证算法。可选 &#39;SHA1&#39;, &#39;SHA224&#39;, &#39;SHA256&#39;, &#39;SHA384&#39;, &#39;SHA512&#39; 默认SHA1。</p>
     */
    public String getIntegrityAlgorithm() {
        return this.IntegrityAlgorithm;
    }

    /**
     * Set <p>认证算法。可选 &#39;SHA1&#39;, &#39;SHA224&#39;, &#39;SHA256&#39;, &#39;SHA384&#39;, &#39;SHA512&#39; 默认SHA1。</p>
     * @param IntegrityAlgorithm <p>认证算法。可选 &#39;SHA1&#39;, &#39;SHA224&#39;, &#39;SHA256&#39;, &#39;SHA384&#39;, &#39;SHA512&#39; 默认SHA1。</p>
     */
    public void setIntegrityAlgorithm(String IntegrityAlgorithm) {
        this.IntegrityAlgorithm = IntegrityAlgorithm;
    }

    /**
     * Get <p>加密算法。可选 &#39;AES-128-CBC&#39;,&#39;AES-192-CBC&#39;, &#39;AES-256-CBC&#39;, &#39;AES-128-GCM&#39;, &#39;AES-192-GCM&#39;, &#39;AES-256-GCM&#39;。</p><p>默认值：AES-128-CBC</p> 
     * @return EncryptAlgorithm <p>加密算法。可选 &#39;AES-128-CBC&#39;,&#39;AES-192-CBC&#39;, &#39;AES-256-CBC&#39;, &#39;AES-128-GCM&#39;, &#39;AES-192-GCM&#39;, &#39;AES-256-GCM&#39;。</p><p>默认值：AES-128-CBC</p>
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set <p>加密算法。可选 &#39;AES-128-CBC&#39;,&#39;AES-192-CBC&#39;, &#39;AES-256-CBC&#39;, &#39;AES-128-GCM&#39;, &#39;AES-192-GCM&#39;, &#39;AES-256-GCM&#39;。</p><p>默认值：AES-128-CBC</p>
     * @param EncryptAlgorithm <p>加密算法。可选 &#39;AES-128-CBC&#39;,&#39;AES-192-CBC&#39;, &#39;AES-256-CBC&#39;, &#39;AES-128-GCM&#39;, &#39;AES-192-GCM&#39;, &#39;AES-256-GCM&#39;。</p><p>默认值：AES-128-CBC</p>
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get <p>是否支持压缩。当前不支持压缩，默认False。</p> 
     * @return Compress <p>是否支持压缩。当前不支持压缩，默认False。</p>
     */
    public Boolean getCompress() {
        return this.Compress;
    }

    /**
     * Set <p>是否支持压缩。当前不支持压缩，默认False。</p>
     * @param Compress <p>是否支持压缩。当前不支持压缩，默认False。</p>
     */
    public void setCompress(Boolean Compress) {
        this.Compress = Compress;
    }

    /**
     * Get <p>是否开启SSO认证。默认为False。该功能当前需要申请开白使用。</p> 
     * @return SsoEnabled <p>是否开启SSO认证。默认为False。该功能当前需要申请开白使用。</p>
     */
    public Boolean getSsoEnabled() {
        return this.SsoEnabled;
    }

    /**
     * Set <p>是否开启SSO认证。默认为False。该功能当前需要申请开白使用。</p>
     * @param SsoEnabled <p>是否开启SSO认证。默认为False。该功能当前需要申请开白使用。</p>
     */
    public void setSsoEnabled(Boolean SsoEnabled) {
        this.SsoEnabled = SsoEnabled;
    }

    /**
     * Get <p>是否开启策略访问控制。默认为False</p> 
     * @return AccessPolicyEnabled <p>是否开启策略访问控制。默认为False</p>
     */
    public Boolean getAccessPolicyEnabled() {
        return this.AccessPolicyEnabled;
    }

    /**
     * Set <p>是否开启策略访问控制。默认为False</p>
     * @param AccessPolicyEnabled <p>是否开启策略访问控制。默认为False</p>
     */
    public void setAccessPolicyEnabled(Boolean AccessPolicyEnabled) {
        this.AccessPolicyEnabled = AccessPolicyEnabled;
    }

    /**
     * Get <p>SAML-DATA，开启SSO时传。</p> 
     * @return SamlData <p>SAML-DATA，开启SSO时传。</p>
     */
    public String getSamlData() {
        return this.SamlData;
    }

    /**
     * Set <p>SAML-DATA，开启SSO时传。</p>
     * @param SamlData <p>SAML-DATA，开启SSO时传。</p>
     */
    public void setSamlData(String SamlData) {
        this.SamlData = SamlData;
    }

    /**
     * Get <p>指定绑定的标签列表</p> 
     * @return Tags <p>指定绑定的标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>指定绑定的标签列表</p>
     * @param Tags <p>指定绑定的标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>DNS Server 地址</p> 
     * @return DnsServers <p>DNS Server 地址</p>
     */
    public DnsServers getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set <p>DNS Server 地址</p>
     * @param DnsServers <p>DNS Server 地址</p>
     */
    public void setDnsServers(DnsServers DnsServers) {
        this.DnsServers = DnsServers;
    }

    public CreateVpnGatewaySslServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpnGatewaySslServerRequest(CreateVpnGatewaySslServerRequest source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.SslVpnServerName != null) {
            this.SslVpnServerName = new String(source.SslVpnServerName);
        }
        if (source.RemoteAddress != null) {
            this.RemoteAddress = new String(source.RemoteAddress);
        }
        if (source.LocalAddress != null) {
            this.LocalAddress = new String[source.LocalAddress.length];
            for (int i = 0; i < source.LocalAddress.length; i++) {
                this.LocalAddress[i] = new String(source.LocalAddress[i]);
            }
        }
        if (source.SslVpnProtocol != null) {
            this.SslVpnProtocol = new String(source.SslVpnProtocol);
        }
        if (source.SslVpnPort != null) {
            this.SslVpnPort = new Long(source.SslVpnPort);
        }
        if (source.IntegrityAlgorithm != null) {
            this.IntegrityAlgorithm = new String(source.IntegrityAlgorithm);
        }
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.Compress != null) {
            this.Compress = new Boolean(source.Compress);
        }
        if (source.SsoEnabled != null) {
            this.SsoEnabled = new Boolean(source.SsoEnabled);
        }
        if (source.AccessPolicyEnabled != null) {
            this.AccessPolicyEnabled = new Boolean(source.AccessPolicyEnabled);
        }
        if (source.SamlData != null) {
            this.SamlData = new String(source.SamlData);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DnsServers != null) {
            this.DnsServers = new DnsServers(source.DnsServers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "SslVpnServerName", this.SslVpnServerName);
        this.setParamSimple(map, prefix + "RemoteAddress", this.RemoteAddress);
        this.setParamArraySimple(map, prefix + "LocalAddress.", this.LocalAddress);
        this.setParamSimple(map, prefix + "SslVpnProtocol", this.SslVpnProtocol);
        this.setParamSimple(map, prefix + "SslVpnPort", this.SslVpnPort);
        this.setParamSimple(map, prefix + "IntegrityAlgorithm", this.IntegrityAlgorithm);
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamSimple(map, prefix + "SsoEnabled", this.SsoEnabled);
        this.setParamSimple(map, prefix + "AccessPolicyEnabled", this.AccessPolicyEnabled);
        this.setParamSimple(map, prefix + "SamlData", this.SamlData);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "DnsServers.", this.DnsServers);

    }
}

