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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpnGatewaySslServerRequest extends AbstractModel{

    /**
    * VPN实例ID
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * SSL_VPN_SERVER 实例名
    */
    @SerializedName("SslVpnServerName")
    @Expose
    private String SslVpnServerName;

    /**
    * 本端地址网段
    */
    @SerializedName("LocalAddress")
    @Expose
    private String [] LocalAddress;

    /**
    * 客户端地址网段
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
    * SSL VPN服务端监听协议端口。默认1194。
    */
    @SerializedName("SslVpnPort")
    @Expose
    private Long SslVpnPort;

    /**
    * 认证算法。可选 'SHA1', 'MD5', 'NONE'。默认NONE
    */
    @SerializedName("IntegrityAlgorithm")
    @Expose
    private String IntegrityAlgorithm;

    /**
    * 加密算法。可选 'AES-128-CBC', 'AES-192-CBC', 'AES-256-CBC', 'NONE'。默认NONE
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * 是否支持压缩。当前仅支持不支持压缩。默认False
    */
    @SerializedName("Compress")
    @Expose
    private Boolean Compress;

    /**
     * Get VPN实例ID 
     * @return VpnGatewayId VPN实例ID
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set VPN实例ID
     * @param VpnGatewayId VPN实例ID
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get SSL_VPN_SERVER 实例名 
     * @return SslVpnServerName SSL_VPN_SERVER 实例名
     */
    public String getSslVpnServerName() {
        return this.SslVpnServerName;
    }

    /**
     * Set SSL_VPN_SERVER 实例名
     * @param SslVpnServerName SSL_VPN_SERVER 实例名
     */
    public void setSslVpnServerName(String SslVpnServerName) {
        this.SslVpnServerName = SslVpnServerName;
    }

    /**
     * Get 本端地址网段 
     * @return LocalAddress 本端地址网段
     */
    public String [] getLocalAddress() {
        return this.LocalAddress;
    }

    /**
     * Set 本端地址网段
     * @param LocalAddress 本端地址网段
     */
    public void setLocalAddress(String [] LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    /**
     * Get 客户端地址网段 
     * @return RemoteAddress 客户端地址网段
     */
    public String getRemoteAddress() {
        return this.RemoteAddress;
    }

    /**
     * Set 客户端地址网段
     * @param RemoteAddress 客户端地址网段
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
     * Get SSL VPN服务端监听协议端口。默认1194。 
     * @return SslVpnPort SSL VPN服务端监听协议端口。默认1194。
     */
    public Long getSslVpnPort() {
        return this.SslVpnPort;
    }

    /**
     * Set SSL VPN服务端监听协议端口。默认1194。
     * @param SslVpnPort SSL VPN服务端监听协议端口。默认1194。
     */
    public void setSslVpnPort(Long SslVpnPort) {
        this.SslVpnPort = SslVpnPort;
    }

    /**
     * Get 认证算法。可选 'SHA1', 'MD5', 'NONE'。默认NONE 
     * @return IntegrityAlgorithm 认证算法。可选 'SHA1', 'MD5', 'NONE'。默认NONE
     */
    public String getIntegrityAlgorithm() {
        return this.IntegrityAlgorithm;
    }

    /**
     * Set 认证算法。可选 'SHA1', 'MD5', 'NONE'。默认NONE
     * @param IntegrityAlgorithm 认证算法。可选 'SHA1', 'MD5', 'NONE'。默认NONE
     */
    public void setIntegrityAlgorithm(String IntegrityAlgorithm) {
        this.IntegrityAlgorithm = IntegrityAlgorithm;
    }

    /**
     * Get 加密算法。可选 'AES-128-CBC', 'AES-192-CBC', 'AES-256-CBC', 'NONE'。默认NONE 
     * @return EncryptAlgorithm 加密算法。可选 'AES-128-CBC', 'AES-192-CBC', 'AES-256-CBC', 'NONE'。默认NONE
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set 加密算法。可选 'AES-128-CBC', 'AES-192-CBC', 'AES-256-CBC', 'NONE'。默认NONE
     * @param EncryptAlgorithm 加密算法。可选 'AES-128-CBC', 'AES-192-CBC', 'AES-256-CBC', 'NONE'。默认NONE
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get 是否支持压缩。当前仅支持不支持压缩。默认False 
     * @return Compress 是否支持压缩。当前仅支持不支持压缩。默认False
     */
    public Boolean getCompress() {
        return this.Compress;
    }

    /**
     * Set 是否支持压缩。当前仅支持不支持压缩。默认False
     * @param Compress 是否支持压缩。当前仅支持不支持压缩。默认False
     */
    public void setCompress(Boolean Compress) {
        this.Compress = Compress;
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
        if (source.IntegrityAlgorithm != null) {
            this.IntegrityAlgorithm = new String(source.IntegrityAlgorithm);
        }
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.Compress != null) {
            this.Compress = new Boolean(source.Compress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "SslVpnServerName", this.SslVpnServerName);
        this.setParamArraySimple(map, prefix + "LocalAddress.", this.LocalAddress);
        this.setParamSimple(map, prefix + "RemoteAddress", this.RemoteAddress);
        this.setParamSimple(map, prefix + "SslVpnProtocol", this.SslVpnProtocol);
        this.setParamSimple(map, prefix + "SslVpnPort", this.SslVpnPort);
        this.setParamSimple(map, prefix + "IntegrityAlgorithm", this.IntegrityAlgorithm);
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamSimple(map, prefix + "Compress", this.Compress);

    }
}

