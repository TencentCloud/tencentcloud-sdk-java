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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignByAsymmetricKeyRequest extends AbstractModel{

    /**
    * 签名算法，支持的算法：SM2DSA，ECC_P256_R1，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * 消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 密钥的唯一标识
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
     * Get 签名算法，支持的算法：SM2DSA，ECC_P256_R1，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。 
     * @return Algorithm 签名算法，支持的算法：SM2DSA，ECC_P256_R1，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 签名算法，支持的算法：SM2DSA，ECC_P256_R1，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。
     * @param Algorithm 签名算法，支持的算法：SM2DSA，ECC_P256_R1，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get 消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节 
     * @return Message 消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节
     * @param Message 消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 密钥的唯一标识 
     * @return KeyId 密钥的唯一标识
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥的唯一标识
     * @param KeyId 密钥的唯一标识
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。 
     * @return MessageType 消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set 消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。
     * @param MessageType 消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    public SignByAsymmetricKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignByAsymmetricKeyRequest(SignByAsymmetricKeyRequest source) {
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);

    }
}

