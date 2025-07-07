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

public class ModifyVpnGatewaySslServerRequest extends AbstractModel {

    /**
    * SSL-VPN SERVER 实例ID
    */
    @SerializedName("SslVpnServerId")
    @Expose
    private String SslVpnServerId;

    /**
    * SSL-VPN SERVER NAME
    */
    @SerializedName("SslVpnServerName")
    @Expose
    private String SslVpnServerName;

    /**
    * 本端地址
    */
    @SerializedName("LocalAddress")
    @Expose
    private String [] LocalAddress;

    /**
    * 客户端地址
    */
    @SerializedName("RemoteAddress")
    @Expose
    private String RemoteAddress;

    /**
    * SSL VPN服务端监听协议。当前仅支持 UDP。默认UDP
    */
    @SerializedName("SslVpnProtocol")
    @Expose
    private String SslVpnProtocol;

    /**
    * SSL VPN服务端监听协议端口。
    */
    @SerializedName("SslVpnPort")
    @Expose
    private Long SslVpnPort;

    /**
    * 加密算法。可选 'AES-128-CBC','AES-192-CBC', 'AES-256-CBC', 默认AES-128-CBC。
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * 认证算法。可选 'SHA1'，默认SHA1。
    */
    @SerializedName("IntegrityAlgorithm")
    @Expose
    private String IntegrityAlgorithm;

    /**
    * 是否支持压缩。当前不支持压缩。默认False。
    */
    @SerializedName("Compress")
    @Expose
    private Boolean Compress;

    /**
    * 是否开启SSO认证。默认为False。该功能当前需要申请开白使用。
    */
    @SerializedName("SsoEnabled")
    @Expose
    private Boolean SsoEnabled;

    /**
    * SAML-DATA
    */
    @SerializedName("SamlData")
    @Expose
    private String SamlData;

    /**
     * Get SSL-VPN SERVER 实例ID 
     * @return SslVpnServerId SSL-VPN SERVER 实例ID
     */
    public String getSslVpnServerId() {
        return this.SslVpnServerId;
    }

    /**
     * Set SSL-VPN SERVER 实例ID
     * @param SslVpnServerId SSL-VPN SERVER 实例ID
     */
    public void setSslVpnServerId(String SslVpnServerId) {
        this.SslVpnServerId = SslVpnServerId;
    }

    /**
     * Get SSL-VPN SERVER NAME 
     * @return SslVpnServerName SSL-VPN SERVER NAME
     */
    public String getSslVpnServerName() {
        return this.SslVpnServerName;
    }

    /**
     * Set SSL-VPN SERVER NAME
     * @param SslVpnServerName SSL-VPN SERVER NAME
     */
    public void setSslVpnServerName(String SslVpnServerName) {
        this.SslVpnServerName = SslVpnServerName;
    }

    /**
     * Get 本端地址 
     * @return LocalAddress 本端地址
     */
    public String [] getLocalAddress() {
        return this.LocalAddress;
    }

    /**
     * Set 本端地址
     * @param LocalAddress 本端地址
     */
    public void setLocalAddress(String [] LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    /**
     * Get 客户端地址 
     * @return RemoteAddress 客户端地址
     */
    public String getRemoteAddress() {
        return this.RemoteAddress;
    }

    /**
     * Set 客户端地址
     * @param RemoteAddress 客户端地址
     */
    public void setRemoteAddress(String RemoteAddress) {
        this.RemoteAddress = RemoteAddress;
    }

    /**
     * Get SSL VPN服务端监听协议。当前仅支持 UDP。默认UDP 
     * @return SslVpnProtocol SSL VPN服务端监听协议。当前仅支持 UDP。默认UDP
     */
    public String getSslVpnProtocol() {
        return this.SslVpnProtocol;
    }

    /**
     * Set SSL VPN服务端监听协议。当前仅支持 UDP。默认UDP
     * @param SslVpnProtocol SSL VPN服务端监听协议。当前仅支持 UDP。默认UDP
     */
    public void setSslVpnProtocol(String SslVpnProtocol) {
        this.SslVpnProtocol = SslVpnProtocol;
    }

    /**
     * Get SSL VPN服务端监听协议端口。 
     * @return SslVpnPort SSL VPN服务端监听协议端口。
     */
    public Long getSslVpnPort() {
        return this.SslVpnPort;
    }

    /**
     * Set SSL VPN服务端监听协议端口。
     * @param SslVpnPort SSL VPN服务端监听协议端口。
     */
    public void setSslVpnPort(Long SslVpnPort) {
        this.SslVpnPort = SslVpnPort;
    }

    /**
     * Get 加密算法。可选 'AES-128-CBC','AES-192-CBC', 'AES-256-CBC', 默认AES-128-CBC。 
     * @return EncryptAlgorithm 加密算法。可选 'AES-128-CBC','AES-192-CBC', 'AES-256-CBC', 默认AES-128-CBC。
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set 加密算法。可选 'AES-128-CBC','AES-192-CBC', 'AES-256-CBC', 默认AES-128-CBC。
     * @param EncryptAlgorithm 加密算法。可选 'AES-128-CBC','AES-192-CBC', 'AES-256-CBC', 默认AES-128-CBC。
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get 认证算法。可选 'SHA1'，默认SHA1。 
     * @return IntegrityAlgorithm 认证算法。可选 'SHA1'，默认SHA1。
     */
    public String getIntegrityAlgorithm() {
        return this.IntegrityAlgorithm;
    }

    /**
     * Set 认证算法。可选 'SHA1'，默认SHA1。
     * @param IntegrityAlgorithm 认证算法。可选 'SHA1'，默认SHA1。
     */
    public void setIntegrityAlgorithm(String IntegrityAlgorithm) {
        this.IntegrityAlgorithm = IntegrityAlgorithm;
    }

    /**
     * Get 是否支持压缩。当前不支持压缩。默认False。 
     * @return Compress 是否支持压缩。当前不支持压缩。默认False。
     */
    public Boolean getCompress() {
        return this.Compress;
    }

    /**
     * Set 是否支持压缩。当前不支持压缩。默认False。
     * @param Compress 是否支持压缩。当前不支持压缩。默认False。
     */
    public void setCompress(Boolean Compress) {
        this.Compress = Compress;
    }

    /**
     * Get 是否开启SSO认证。默认为False。该功能当前需要申请开白使用。 
     * @return SsoEnabled 是否开启SSO认证。默认为False。该功能当前需要申请开白使用。
     */
    public Boolean getSsoEnabled() {
        return this.SsoEnabled;
    }

    /**
     * Set 是否开启SSO认证。默认为False。该功能当前需要申请开白使用。
     * @param SsoEnabled 是否开启SSO认证。默认为False。该功能当前需要申请开白使用。
     */
    public void setSsoEnabled(Boolean SsoEnabled) {
        this.SsoEnabled = SsoEnabled;
    }

    /**
     * Get SAML-DATA 
     * @return SamlData SAML-DATA
     */
    public String getSamlData() {
        return this.SamlData;
    }

    /**
     * Set SAML-DATA
     * @param SamlData SAML-DATA
     */
    public void setSamlData(String SamlData) {
        this.SamlData = SamlData;
    }

    public ModifyVpnGatewaySslServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpnGatewaySslServerRequest(ModifyVpnGatewaySslServerRequest source) {
        if (source.SslVpnServerId != null) {
            this.SslVpnServerId = new String(source.SslVpnServerId);
        }
        if (source.SslVpnServerName != null) {
            this.SslVpnServerName = new String(source.SslVpnServerName);
        }
        if (source.LocalAddress != null) {
            this.LocalAddress = new String[source.LocalAddress.length];
            for (int i = 0; i < source.LocalAddress.length; i++) {
                this.LocalAddress[i] = new String(source.LocalAddress[i]);
            }
        }
        if (source.RemoteAddress != null) {
            this.RemoteAddress = new String(source.RemoteAddress);
        }
        if (source.SslVpnProtocol != null) {
            this.SslVpnProtocol = new String(source.SslVpnProtocol);
        }
        if (source.SslVpnPort != null) {
            this.SslVpnPort = new Long(source.SslVpnPort);
        }
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.IntegrityAlgorithm != null) {
            this.IntegrityAlgorithm = new String(source.IntegrityAlgorithm);
        }
        if (source.Compress != null) {
            this.Compress = new Boolean(source.Compress);
        }
        if (source.SsoEnabled != null) {
            this.SsoEnabled = new Boolean(source.SsoEnabled);
        }
        if (source.SamlData != null) {
            this.SamlData = new String(source.SamlData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SslVpnServerId", this.SslVpnServerId);
        this.setParamSimple(map, prefix + "SslVpnServerName", this.SslVpnServerName);
        this.setParamArraySimple(map, prefix + "LocalAddress.", this.LocalAddress);
        this.setParamSimple(map, prefix + "RemoteAddress", this.RemoteAddress);
        this.setParamSimple(map, prefix + "SslVpnProtocol", this.SslVpnProtocol);
        this.setParamSimple(map, prefix + "SslVpnPort", this.SslVpnPort);
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamSimple(map, prefix + "IntegrityAlgorithm", this.IntegrityAlgorithm);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamSimple(map, prefix + "SsoEnabled", this.SsoEnabled);
        this.setParamSimple(map, prefix + "SamlData", this.SamlData);

    }
}

