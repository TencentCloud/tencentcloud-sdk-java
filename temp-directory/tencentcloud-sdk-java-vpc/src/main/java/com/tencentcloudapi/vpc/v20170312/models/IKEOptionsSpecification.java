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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IKEOptionsSpecification extends AbstractModel {

    /**
    * 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，'SM4', 默认为3DES-CBC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropoEncryAlgorithm")
    @Expose
    private String PropoEncryAlgorithm;

    /**
    * 认证算法：可选值：'MD5', 'SHA1'，'SHA-256' 默认为MD5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropoAuthenAlgorithm")
    @Expose
    private String PropoAuthenAlgorithm;

    /**
    * 协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExchangeMode")
    @Expose
    private String ExchangeMode;

    /**
    * 本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalIdentity")
    @Expose
    private String LocalIdentity;

    /**
    * 对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteIdentity")
    @Expose
    private String RemoteIdentity;

    /**
    * 本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalAddress")
    @Expose
    private String LocalAddress;

    /**
    * 对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteAddress")
    @Expose
    private String RemoteAddress;

    /**
    * 本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalFqdnName")
    @Expose
    private String LocalFqdnName;

    /**
    * 对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteFqdnName")
    @Expose
    private String RemoteFqdnName;

    /**
    * DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DhGroupName")
    @Expose
    private String DhGroupName;

    /**
    * IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IKESaLifetimeSeconds")
    @Expose
    private Long IKESaLifetimeSeconds;

    /**
    * IKE版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IKEVersion")
    @Expose
    private String IKEVersion;

    /**
     * Get 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，'SM4', 默认为3DES-CBC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropoEncryAlgorithm 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，'SM4', 默认为3DES-CBC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropoEncryAlgorithm() {
        return this.PropoEncryAlgorithm;
    }

    /**
     * Set 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，'SM4', 默认为3DES-CBC
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropoEncryAlgorithm 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBS-192', 'AES-CBC-256', 'DES-CBC'，'SM4', 默认为3DES-CBC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropoEncryAlgorithm(String PropoEncryAlgorithm) {
        this.PropoEncryAlgorithm = PropoEncryAlgorithm;
    }

    /**
     * Get 认证算法：可选值：'MD5', 'SHA1'，'SHA-256' 默认为MD5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropoAuthenAlgorithm 认证算法：可选值：'MD5', 'SHA1'，'SHA-256' 默认为MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropoAuthenAlgorithm() {
        return this.PropoAuthenAlgorithm;
    }

    /**
     * Set 认证算法：可选值：'MD5', 'SHA1'，'SHA-256' 默认为MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropoAuthenAlgorithm 认证算法：可选值：'MD5', 'SHA1'，'SHA-256' 默认为MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropoAuthenAlgorithm(String PropoAuthenAlgorithm) {
        this.PropoAuthenAlgorithm = PropoAuthenAlgorithm;
    }

    /**
     * Get 协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExchangeMode 协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExchangeMode() {
        return this.ExchangeMode;
    }

    /**
     * Set 协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExchangeMode 协商模式：可选值：'AGGRESSIVE', 'MAIN'，默认为MAIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExchangeMode(String ExchangeMode) {
        this.ExchangeMode = ExchangeMode;
    }

    /**
     * Get 本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalIdentity 本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalIdentity() {
        return this.LocalIdentity;
    }

    /**
     * Set 本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalIdentity 本端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalIdentity(String LocalIdentity) {
        this.LocalIdentity = LocalIdentity;
    }

    /**
     * Get 对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteIdentity 对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteIdentity() {
        return this.RemoteIdentity;
    }

    /**
     * Set 对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteIdentity 对端标识类型：可选值：'ADDRESS', 'FQDN'，默认为ADDRESS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteIdentity(String RemoteIdentity) {
        this.RemoteIdentity = RemoteIdentity;
    }

    /**
     * Get 本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalAddress 本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalAddress() {
        return this.LocalAddress;
    }

    /**
     * Set 本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalAddress 本端标识，当LocalIdentity选为ADDRESS时，LocalAddress必填。localAddress默认为vpn网关公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalAddress(String LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    /**
     * Get 对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteAddress 对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteAddress() {
        return this.RemoteAddress;
    }

    /**
     * Set 对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteAddress 对端标识，当RemoteIdentity选为ADDRESS时，RemoteAddress必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteAddress(String RemoteAddress) {
        this.RemoteAddress = RemoteAddress;
    }

    /**
     * Get 本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalFqdnName 本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalFqdnName() {
        return this.LocalFqdnName;
    }

    /**
     * Set 本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalFqdnName 本端标识，当LocalIdentity选为FQDN时，LocalFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalFqdnName(String LocalFqdnName) {
        this.LocalFqdnName = LocalFqdnName;
    }

    /**
     * Get 对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteFqdnName 对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteFqdnName() {
        return this.RemoteFqdnName;
    }

    /**
     * Set 对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteFqdnName 对端标识，当remoteIdentity选为FQDN时，RemoteFqdnName必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteFqdnName(String RemoteFqdnName) {
        this.RemoteFqdnName = RemoteFqdnName;
    }

    /**
     * Get DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DhGroupName DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDhGroupName() {
        return this.DhGroupName;
    }

    /**
     * Set DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
注意：此字段可能返回 null，表示取不到有效值。
     * @param DhGroupName DH group，指定IKE交换密钥时使用的DH组，可选值：'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', 'GROUP24'，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDhGroupName(String DhGroupName) {
        this.DhGroupName = DhGroupName;
    }

    /**
     * Get IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IKESaLifetimeSeconds IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIKESaLifetimeSeconds() {
        return this.IKESaLifetimeSeconds;
    }

    /**
     * Set IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
注意：此字段可能返回 null，表示取不到有效值。
     * @param IKESaLifetimeSeconds IKE SA Lifetime，单位：秒，设置IKE SA的生存周期，取值范围：60-604800
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIKESaLifetimeSeconds(Long IKESaLifetimeSeconds) {
        this.IKESaLifetimeSeconds = IKESaLifetimeSeconds;
    }

    /**
     * Get IKE版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IKEVersion IKE版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIKEVersion() {
        return this.IKEVersion;
    }

    /**
     * Set IKE版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param IKEVersion IKE版本
注意：此字段可能返回 null，表示取不到有效值。
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

