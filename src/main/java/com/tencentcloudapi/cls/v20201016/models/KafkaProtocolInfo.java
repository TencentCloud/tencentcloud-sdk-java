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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaProtocolInfo extends AbstractModel {

    /**
    * <p>协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。</p><ul><li>当IsEncryptionAddr为true时，Protocol必填。</li><li>支持的协议类型如下：<ul><li>plaintext：纯文本无加密协议</li><li>sasl_ssl：SASL 认证 + SSL 加密</li><li>ssl：纯 SSL/TLS 加密协议</li><li>sasl_plaintext：SASL 认证 + 非加密通道</li></ul></li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。</p><ul><li>当Protocol为  <code>sasl_plaintext</code> 或 <code>sasl_ssl</code> 时 Mechanism 必填。</li><li>支持加密类型如下<ul><li>PLAIN：明文认证</li><li>SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法</li><li>SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法</li></ul></li></ul>
    */
    @SerializedName("Mechanism")
    @Expose
    private String Mechanism;

    /**
    * <p>用户名。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>用户密码。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>是否开启客户端证书验证</p>
    */
    @SerializedName("EnableClientCertificate")
    @Expose
    private Long EnableClientCertificate;

    /**
    * <p>是否开启服务端证书验证</p>
    */
    @SerializedName("EnableServerCertificate")
    @Expose
    private Long EnableServerCertificate;

    /**
    * <p>云托管CA证书id</p>
    */
    @SerializedName("CACertificateId")
    @Expose
    private String CACertificateId;

    /**
    * <p>云托管服务端证书id</p>
    */
    @SerializedName("SVRCertificateId")
    @Expose
    private String SVRCertificateId;

    /**
     * Get <p>协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。</p><ul><li>当IsEncryptionAddr为true时，Protocol必填。</li><li>支持的协议类型如下：<ul><li>plaintext：纯文本无加密协议</li><li>sasl_ssl：SASL 认证 + SSL 加密</li><li>ssl：纯 SSL/TLS 加密协议</li><li>sasl_plaintext：SASL 认证 + 非加密通道</li></ul></li></ul> 
     * @return Protocol <p>协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。</p><ul><li>当IsEncryptionAddr为true时，Protocol必填。</li><li>支持的协议类型如下：<ul><li>plaintext：纯文本无加密协议</li><li>sasl_ssl：SASL 认证 + SSL 加密</li><li>ssl：纯 SSL/TLS 加密协议</li><li>sasl_plaintext：SASL 认证 + 非加密通道</li></ul></li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。</p><ul><li>当IsEncryptionAddr为true时，Protocol必填。</li><li>支持的协议类型如下：<ul><li>plaintext：纯文本无加密协议</li><li>sasl_ssl：SASL 认证 + SSL 加密</li><li>ssl：纯 SSL/TLS 加密协议</li><li>sasl_plaintext：SASL 认证 + 非加密通道</li></ul></li></ul>
     * @param Protocol <p>协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。</p><ul><li>当IsEncryptionAddr为true时，Protocol必填。</li><li>支持的协议类型如下：<ul><li>plaintext：纯文本无加密协议</li><li>sasl_ssl：SASL 认证 + SSL 加密</li><li>ssl：纯 SSL/TLS 加密协议</li><li>sasl_plaintext：SASL 认证 + 非加密通道</li></ul></li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。</p><ul><li>当Protocol为  <code>sasl_plaintext</code> 或 <code>sasl_ssl</code> 时 Mechanism 必填。</li><li>支持加密类型如下<ul><li>PLAIN：明文认证</li><li>SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法</li><li>SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法</li></ul></li></ul> 
     * @return Mechanism <p>加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。</p><ul><li>当Protocol为  <code>sasl_plaintext</code> 或 <code>sasl_ssl</code> 时 Mechanism 必填。</li><li>支持加密类型如下<ul><li>PLAIN：明文认证</li><li>SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法</li><li>SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法</li></ul></li></ul>
     */
    public String getMechanism() {
        return this.Mechanism;
    }

    /**
     * Set <p>加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。</p><ul><li>当Protocol为  <code>sasl_plaintext</code> 或 <code>sasl_ssl</code> 时 Mechanism 必填。</li><li>支持加密类型如下<ul><li>PLAIN：明文认证</li><li>SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法</li><li>SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法</li></ul></li></ul>
     * @param Mechanism <p>加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。</p><ul><li>当Protocol为  <code>sasl_plaintext</code> 或 <code>sasl_ssl</code> 时 Mechanism 必填。</li><li>支持加密类型如下<ul><li>PLAIN：明文认证</li><li>SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法</li><li>SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法</li></ul></li></ul>
     */
    public void setMechanism(String Mechanism) {
        this.Mechanism = Mechanism;
    }

    /**
     * Get <p>用户名。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p> 
     * @return UserName <p>用户名。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p>
     * @param UserName <p>用户名。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>用户密码。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p> 
     * @return Password <p>用户密码。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>用户密码。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p>
     * @param Password <p>用户密码。<br>当Protocol为sasl_plaintext或sasl_ssl时必填</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>是否开启客户端证书验证</p> 
     * @return EnableClientCertificate <p>是否开启客户端证书验证</p>
     */
    public Long getEnableClientCertificate() {
        return this.EnableClientCertificate;
    }

    /**
     * Set <p>是否开启客户端证书验证</p>
     * @param EnableClientCertificate <p>是否开启客户端证书验证</p>
     */
    public void setEnableClientCertificate(Long EnableClientCertificate) {
        this.EnableClientCertificate = EnableClientCertificate;
    }

    /**
     * Get <p>是否开启服务端证书验证</p> 
     * @return EnableServerCertificate <p>是否开启服务端证书验证</p>
     */
    public Long getEnableServerCertificate() {
        return this.EnableServerCertificate;
    }

    /**
     * Set <p>是否开启服务端证书验证</p>
     * @param EnableServerCertificate <p>是否开启服务端证书验证</p>
     */
    public void setEnableServerCertificate(Long EnableServerCertificate) {
        this.EnableServerCertificate = EnableServerCertificate;
    }

    /**
     * Get <p>云托管CA证书id</p> 
     * @return CACertificateId <p>云托管CA证书id</p>
     */
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    /**
     * Set <p>云托管CA证书id</p>
     * @param CACertificateId <p>云托管CA证书id</p>
     */
    public void setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
    }

    /**
     * Get <p>云托管服务端证书id</p> 
     * @return SVRCertificateId <p>云托管服务端证书id</p>
     */
    public String getSVRCertificateId() {
        return this.SVRCertificateId;
    }

    /**
     * Set <p>云托管服务端证书id</p>
     * @param SVRCertificateId <p>云托管服务端证书id</p>
     */
    public void setSVRCertificateId(String SVRCertificateId) {
        this.SVRCertificateId = SVRCertificateId;
    }

    public KafkaProtocolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaProtocolInfo(KafkaProtocolInfo source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Mechanism != null) {
            this.Mechanism = new String(source.Mechanism);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EnableClientCertificate != null) {
            this.EnableClientCertificate = new Long(source.EnableClientCertificate);
        }
        if (source.EnableServerCertificate != null) {
            this.EnableServerCertificate = new Long(source.EnableServerCertificate);
        }
        if (source.CACertificateId != null) {
            this.CACertificateId = new String(source.CACertificateId);
        }
        if (source.SVRCertificateId != null) {
            this.SVRCertificateId = new String(source.SVRCertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Mechanism", this.Mechanism);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EnableClientCertificate", this.EnableClientCertificate);
        this.setParamSimple(map, prefix + "EnableServerCertificate", this.EnableServerCertificate);
        this.setParamSimple(map, prefix + "CACertificateId", this.CACertificateId);
        this.setParamSimple(map, prefix + "SVRCertificateId", this.SVRCertificateId);

    }
}

