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

public class IKEOptionsSpecification extends AbstractModel {

    /**
    * <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;，&#39;SM4&#39;, 默认为3DES-CBC</p>
    */
    @SerializedName("PropoEncryAlgorithm")
    @Expose
    private String PropoEncryAlgorithm;

    /**
    * <p>认证算法：可选值：&#39;MD5&#39;，&#39;SHA&#39;，&#39;SHA-256&#39;，&#39;SHA-512&#39;， 默认为SHA。</p>
    */
    @SerializedName("PropoAuthenAlgorithm")
    @Expose
    private String PropoAuthenAlgorithm;

    /**
    * <p>协商模式：可选值：&#39;AGGRESSIVE&#39;， &#39;MAIN&#39;，默认为MAIN。</p>
    */
    @SerializedName("ExchangeMode")
    @Expose
    private String ExchangeMode;

    /**
    * <p>本端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p>
    */
    @SerializedName("LocalIdentity")
    @Expose
    private String LocalIdentity;

    /**
    * <p>对端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p>
    */
    @SerializedName("RemoteIdentity")
    @Expose
    private String RemoteIdentity;

    /**
    * <p>本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP</p>
    */
    @SerializedName("LocalAddress")
    @Expose
    private String LocalAddress;

    /**
    * <p>对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填</p>
    */
    @SerializedName("RemoteAddress")
    @Expose
    private String RemoteAddress;

    /**
    * <p>本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填</p>
    */
    @SerializedName("LocalFqdnName")
    @Expose
    private String LocalFqdnName;

    /**
    * <p>对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填</p>
    */
    @SerializedName("RemoteFqdnName")
    @Expose
    private String RemoteFqdnName;

    /**
    * <p>DH group，指定IKE交换密钥时使用的DH组，可选值：&#39;GROUP1&#39;, &#39;GROUP2&#39;, &#39;GROUP5&#39;, &#39;GROUP14&#39;, &#39;GROUP15&#39;, &#39;GROUP16&#39;, &#39;GROUP19&#39;, &#39;GROUP20&#39;, &#39;GROUP21&#39;, &#39;GROUP24&#39;，默认是GROUP1。</p>
    */
    @SerializedName("DhGroupName")
    @Expose
    private String DhGroupName;

    /**
    * <p>IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800</p>
    */
    @SerializedName("IKESaLifetimeSeconds")
    @Expose
    private Long IKESaLifetimeSeconds;

    /**
    * <p>IKE版本</p>
    */
    @SerializedName("IKEVersion")
    @Expose
    private String IKEVersion;

    /**
     * Get <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;，&#39;SM4&#39;, 默认为3DES-CBC</p> 
     * @return PropoEncryAlgorithm <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;，&#39;SM4&#39;, 默认为3DES-CBC</p>
     */
    public String getPropoEncryAlgorithm() {
        return this.PropoEncryAlgorithm;
    }

    /**
     * Set <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;，&#39;SM4&#39;, 默认为3DES-CBC</p>
     * @param PropoEncryAlgorithm <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;，&#39;SM4&#39;, 默认为3DES-CBC</p>
     */
    public void setPropoEncryAlgorithm(String PropoEncryAlgorithm) {
        this.PropoEncryAlgorithm = PropoEncryAlgorithm;
    }

    /**
     * Get <p>认证算法：可选值：&#39;MD5&#39;，&#39;SHA&#39;，&#39;SHA-256&#39;，&#39;SHA-512&#39;， 默认为SHA。</p> 
     * @return PropoAuthenAlgorithm <p>认证算法：可选值：&#39;MD5&#39;，&#39;SHA&#39;，&#39;SHA-256&#39;，&#39;SHA-512&#39;， 默认为SHA。</p>
     */
    public String getPropoAuthenAlgorithm() {
        return this.PropoAuthenAlgorithm;
    }

    /**
     * Set <p>认证算法：可选值：&#39;MD5&#39;，&#39;SHA&#39;，&#39;SHA-256&#39;，&#39;SHA-512&#39;， 默认为SHA。</p>
     * @param PropoAuthenAlgorithm <p>认证算法：可选值：&#39;MD5&#39;，&#39;SHA&#39;，&#39;SHA-256&#39;，&#39;SHA-512&#39;， 默认为SHA。</p>
     */
    public void setPropoAuthenAlgorithm(String PropoAuthenAlgorithm) {
        this.PropoAuthenAlgorithm = PropoAuthenAlgorithm;
    }

    /**
     * Get <p>协商模式：可选值：&#39;AGGRESSIVE&#39;， &#39;MAIN&#39;，默认为MAIN。</p> 
     * @return ExchangeMode <p>协商模式：可选值：&#39;AGGRESSIVE&#39;， &#39;MAIN&#39;，默认为MAIN。</p>
     */
    public String getExchangeMode() {
        return this.ExchangeMode;
    }

    /**
     * Set <p>协商模式：可选值：&#39;AGGRESSIVE&#39;， &#39;MAIN&#39;，默认为MAIN。</p>
     * @param ExchangeMode <p>协商模式：可选值：&#39;AGGRESSIVE&#39;， &#39;MAIN&#39;，默认为MAIN。</p>
     */
    public void setExchangeMode(String ExchangeMode) {
        this.ExchangeMode = ExchangeMode;
    }

    /**
     * Get <p>本端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p> 
     * @return LocalIdentity <p>本端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p>
     */
    public String getLocalIdentity() {
        return this.LocalIdentity;
    }

    /**
     * Set <p>本端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p>
     * @param LocalIdentity <p>本端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p>
     */
    public void setLocalIdentity(String LocalIdentity) {
        this.LocalIdentity = LocalIdentity;
    }

    /**
     * Get <p>对端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p> 
     * @return RemoteIdentity <p>对端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p>
     */
    public String getRemoteIdentity() {
        return this.RemoteIdentity;
    }

    /**
     * Set <p>对端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p>
     * @param RemoteIdentity <p>对端标识类型：可选值：&#39;ADDRESS&#39;, &#39;FQDN&#39;，默认为ADDRESS</p>
     */
    public void setRemoteIdentity(String RemoteIdentity) {
        this.RemoteIdentity = RemoteIdentity;
    }

    /**
     * Get <p>本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP</p> 
     * @return LocalAddress <p>本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP</p>
     */
    public String getLocalAddress() {
        return this.LocalAddress;
    }

    /**
     * Set <p>本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP</p>
     * @param LocalAddress <p>本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP</p>
     */
    public void setLocalAddress(String LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    /**
     * Get <p>对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填</p> 
     * @return RemoteAddress <p>对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填</p>
     */
    public String getRemoteAddress() {
        return this.RemoteAddress;
    }

    /**
     * Set <p>对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填</p>
     * @param RemoteAddress <p>对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填</p>
     */
    public void setRemoteAddress(String RemoteAddress) {
        this.RemoteAddress = RemoteAddress;
    }

    /**
     * Get <p>本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填</p> 
     * @return LocalFqdnName <p>本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填</p>
     */
    public String getLocalFqdnName() {
        return this.LocalFqdnName;
    }

    /**
     * Set <p>本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填</p>
     * @param LocalFqdnName <p>本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填</p>
     */
    public void setLocalFqdnName(String LocalFqdnName) {
        this.LocalFqdnName = LocalFqdnName;
    }

    /**
     * Get <p>对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填</p> 
     * @return RemoteFqdnName <p>对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填</p>
     */
    public String getRemoteFqdnName() {
        return this.RemoteFqdnName;
    }

    /**
     * Set <p>对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填</p>
     * @param RemoteFqdnName <p>对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填</p>
     */
    public void setRemoteFqdnName(String RemoteFqdnName) {
        this.RemoteFqdnName = RemoteFqdnName;
    }

    /**
     * Get <p>DH group，指定IKE交换密钥时使用的DH组，可选值：&#39;GROUP1&#39;, &#39;GROUP2&#39;, &#39;GROUP5&#39;, &#39;GROUP14&#39;, &#39;GROUP15&#39;, &#39;GROUP16&#39;, &#39;GROUP19&#39;, &#39;GROUP20&#39;, &#39;GROUP21&#39;, &#39;GROUP24&#39;，默认是GROUP1。</p> 
     * @return DhGroupName <p>DH group，指定IKE交换密钥时使用的DH组，可选值：&#39;GROUP1&#39;, &#39;GROUP2&#39;, &#39;GROUP5&#39;, &#39;GROUP14&#39;, &#39;GROUP15&#39;, &#39;GROUP16&#39;, &#39;GROUP19&#39;, &#39;GROUP20&#39;, &#39;GROUP21&#39;, &#39;GROUP24&#39;，默认是GROUP1。</p>
     */
    public String getDhGroupName() {
        return this.DhGroupName;
    }

    /**
     * Set <p>DH group，指定IKE交换密钥时使用的DH组，可选值：&#39;GROUP1&#39;, &#39;GROUP2&#39;, &#39;GROUP5&#39;, &#39;GROUP14&#39;, &#39;GROUP15&#39;, &#39;GROUP16&#39;, &#39;GROUP19&#39;, &#39;GROUP20&#39;, &#39;GROUP21&#39;, &#39;GROUP24&#39;，默认是GROUP1。</p>
     * @param DhGroupName <p>DH group，指定IKE交换密钥时使用的DH组，可选值：&#39;GROUP1&#39;, &#39;GROUP2&#39;, &#39;GROUP5&#39;, &#39;GROUP14&#39;, &#39;GROUP15&#39;, &#39;GROUP16&#39;, &#39;GROUP19&#39;, &#39;GROUP20&#39;, &#39;GROUP21&#39;, &#39;GROUP24&#39;，默认是GROUP1。</p>
     */
    public void setDhGroupName(String DhGroupName) {
        this.DhGroupName = DhGroupName;
    }

    /**
     * Get <p>IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800</p> 
     * @return IKESaLifetimeSeconds <p>IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800</p>
     */
    public Long getIKESaLifetimeSeconds() {
        return this.IKESaLifetimeSeconds;
    }

    /**
     * Set <p>IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800</p>
     * @param IKESaLifetimeSeconds <p>IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800</p>
     */
    public void setIKESaLifetimeSeconds(Long IKESaLifetimeSeconds) {
        this.IKESaLifetimeSeconds = IKESaLifetimeSeconds;
    }

    /**
     * Get <p>IKE版本</p> 
     * @return IKEVersion <p>IKE版本</p>
     */
    public String getIKEVersion() {
        return this.IKEVersion;
    }

    /**
     * Set <p>IKE版本</p>
     * @param IKEVersion <p>IKE版本</p>
     */
    public void setIKEVersion(String IKEVersion) {
        this.IKEVersion = IKEVersion;
    }

    public IKEOptionsSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IKEOptionsSpecification(IKEOptionsSpecification source) {
        if (source.PropoEncryAlgorithm != null) {
            this.PropoEncryAlgorithm = new String(source.PropoEncryAlgorithm);
        }
        if (source.PropoAuthenAlgorithm != null) {
            this.PropoAuthenAlgorithm = new String(source.PropoAuthenAlgorithm);
        }
        if (source.ExchangeMode != null) {
            this.ExchangeMode = new String(source.ExchangeMode);
        }
        if (source.LocalIdentity != null) {
            this.LocalIdentity = new String(source.LocalIdentity);
        }
        if (source.RemoteIdentity != null) {
            this.RemoteIdentity = new String(source.RemoteIdentity);
        }
        if (source.LocalAddress != null) {
            this.LocalAddress = new String(source.LocalAddress);
        }
        if (source.RemoteAddress != null) {
            this.RemoteAddress = new String(source.RemoteAddress);
        }
        if (source.LocalFqdnName != null) {
            this.LocalFqdnName = new String(source.LocalFqdnName);
        }
        if (source.RemoteFqdnName != null) {
            this.RemoteFqdnName = new String(source.RemoteFqdnName);
        }
        if (source.DhGroupName != null) {
            this.DhGroupName = new String(source.DhGroupName);
        }
        if (source.IKESaLifetimeSeconds != null) {
            this.IKESaLifetimeSeconds = new Long(source.IKESaLifetimeSeconds);
        }
        if (source.IKEVersion != null) {
            this.IKEVersion = new String(source.IKEVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropoEncryAlgorithm", this.PropoEncryAlgorithm);
        this.setParamSimple(map, prefix + "PropoAuthenAlgorithm", this.PropoAuthenAlgorithm);
        this.setParamSimple(map, prefix + "ExchangeMode", this.ExchangeMode);
        this.setParamSimple(map, prefix + "LocalIdentity", this.LocalIdentity);
        this.setParamSimple(map, prefix + "RemoteIdentity", this.RemoteIdentity);
        this.setParamSimple(map, prefix + "LocalAddress", this.LocalAddress);
        this.setParamSimple(map, prefix + "RemoteAddress", this.RemoteAddress);
        this.setParamSimple(map, prefix + "LocalFqdnName", this.LocalFqdnName);
        this.setParamSimple(map, prefix + "RemoteFqdnName", this.RemoteFqdnName);
        this.setParamSimple(map, prefix + "DhGroupName", this.DhGroupName);
        this.setParamSimple(map, prefix + "IKESaLifetimeSeconds", this.IKESaLifetimeSeconds);
        this.setParamSimple(map, prefix + "IKEVersion", this.IKEVersion);

    }
}

