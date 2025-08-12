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
    * 协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。

- 当IsEncryptionAddr为true时，Protocol必填。
- 支持的协议类型如下：
    - plaintext：纯文本无加密协议
    - sasl_ssl：SASL 认证 + SSL 加密
    - ssl：纯 SSL/TLS 加密协议
    - sasl_plaintext：SASL 认证 + 非加密通道

    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。

- 当Protocol为  `sasl_plaintext` 或 `sasl_ssl` 时 Mechanism 必填。
- 支持加密类型如下
    -  PLAIN：明文认证
    -  SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法
    -  SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法
    */
    @SerializedName("Mechanism")
    @Expose
    private String Mechanism;

    /**
    * 用户名。
当Protocol为sasl_plaintext或sasl_ssl时必填
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户密码。
当Protocol为sasl_plaintext或sasl_ssl时必填
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。

- 当IsEncryptionAddr为true时，Protocol必填。
- 支持的协议类型如下：
    - plaintext：纯文本无加密协议
    - sasl_ssl：SASL 认证 + SSL 加密
    - ssl：纯 SSL/TLS 加密协议
    - sasl_plaintext：SASL 认证 + 非加密通道
 
     * @return Protocol 协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。

- 当IsEncryptionAddr为true时，Protocol必填。
- 支持的协议类型如下：
    - plaintext：纯文本无加密协议
    - sasl_ssl：SASL 认证 + SSL 加密
    - ssl：纯 SSL/TLS 加密协议
    - sasl_plaintext：SASL 认证 + 非加密通道

     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。

- 当IsEncryptionAddr为true时，Protocol必填。
- 支持的协议类型如下：
    - plaintext：纯文本无加密协议
    - sasl_ssl：SASL 认证 + SSL 加密
    - ssl：纯 SSL/TLS 加密协议
    - sasl_plaintext：SASL 认证 + 非加密通道

     * @param Protocol 协议类型，支持的协议类型包括 plaintext、sasl_plaintext 或 sasl_ssl。建议使用 sasl_ssl，此协议会进行连接加密同时需要用户认证。

- 当IsEncryptionAddr为true时，Protocol必填。
- 支持的协议类型如下：
    - plaintext：纯文本无加密协议
    - sasl_ssl：SASL 认证 + SSL 加密
    - ssl：纯 SSL/TLS 加密协议
    - sasl_plaintext：SASL 认证 + 非加密通道

     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。

- 当Protocol为  `sasl_plaintext` 或 `sasl_ssl` 时 Mechanism 必填。
- 支持加密类型如下
    -  PLAIN：明文认证
    -  SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法
    -  SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法 
     * @return Mechanism 加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。

- 当Protocol为  `sasl_plaintext` 或 `sasl_ssl` 时 Mechanism 必填。
- 支持加密类型如下
    -  PLAIN：明文认证
    -  SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法
    -  SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法
     */
    public String getMechanism() {
        return this.Mechanism;
    }

    /**
     * Set 加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。

- 当Protocol为  `sasl_plaintext` 或 `sasl_ssl` 时 Mechanism 必填。
- 支持加密类型如下
    -  PLAIN：明文认证
    -  SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法
    -  SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法
     * @param Mechanism 加密类型，支持 PLAIN、SCRAM-SHA-256 或 SCRAM-SHA-512。

- 当Protocol为  `sasl_plaintext` 或 `sasl_ssl` 时 Mechanism 必填。
- 支持加密类型如下
    -  PLAIN：明文认证
    -  SCRAM-SHA-256：基于挑战-响应机制，使用PBKDF2-HMAC-SHA256算法
    -  SCRAM-SHA-512：增强版SCRAM，使用PBKDF2-HMAC-SHA512算法
     */
    public void setMechanism(String Mechanism) {
        this.Mechanism = Mechanism;
    }

    /**
     * Get 用户名。
当Protocol为sasl_plaintext或sasl_ssl时必填 
     * @return UserName 用户名。
当Protocol为sasl_plaintext或sasl_ssl时必填
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名。
当Protocol为sasl_plaintext或sasl_ssl时必填
     * @param UserName 用户名。
当Protocol为sasl_plaintext或sasl_ssl时必填
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户密码。
当Protocol为sasl_plaintext或sasl_ssl时必填 
     * @return Password 用户密码。
当Protocol为sasl_plaintext或sasl_ssl时必填
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 用户密码。
当Protocol为sasl_plaintext或sasl_ssl时必填
     * @param Password 用户密码。
当Protocol为sasl_plaintext或sasl_ssl时必填
     */
    public void setPassword(String Password) {
        this.Password = Password;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Mechanism", this.Mechanism);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

