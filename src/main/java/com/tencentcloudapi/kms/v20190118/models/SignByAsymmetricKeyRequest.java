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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignByAsymmetricKeyRequest extends AbstractModel {

    /**
    * <p>签名算法，支持的算法：SM2DSA，ECC_P256_R1，ECDSA384_SHA384，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256，RSA_PSS_SHA_384，RSA_PKCS1_SHA_384，RSA_PSS_SHA_512，RSA_PKCS1_SHA_512 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。</p>
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * <p>消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>密钥的唯一标识</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。</p>
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
     * Get <p>签名算法，支持的算法：SM2DSA，ECC_P256_R1，ECDSA384_SHA384，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256，RSA_PSS_SHA_384，RSA_PKCS1_SHA_384，RSA_PSS_SHA_512，RSA_PKCS1_SHA_512 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。</p> 
     * @return Algorithm <p>签名算法，支持的算法：SM2DSA，ECC_P256_R1，ECDSA384_SHA384，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256，RSA_PSS_SHA_384，RSA_PKCS1_SHA_384，RSA_PSS_SHA_512，RSA_PKCS1_SHA_512 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。</p>
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set <p>签名算法，支持的算法：SM2DSA，ECC_P256_R1，ECDSA384_SHA384，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256，RSA_PSS_SHA_384，RSA_PKCS1_SHA_384，RSA_PSS_SHA_512，RSA_PKCS1_SHA_512 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。</p>
     * @param Algorithm <p>签名算法，支持的算法：SM2DSA，ECC_P256_R1，ECDSA384_SHA384，RSA_PSS_SHA_256，RSA_PKCS1_SHA_256，RSA_PSS_SHA_384，RSA_PKCS1_SHA_384，RSA_PSS_SHA_512，RSA_PKCS1_SHA_512 等。更多支持的算法可通过 ListAlgorithms 接口进行查询。</p>
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get <p>消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节</p> 
     * @return Message <p>消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节</p>
     * @param Message <p>消息原文或消息摘要。如果提供的是消息原文，则消息原文的长度（Base64编码前的长度）不超过4096字节。如果提供的是消息摘要，消息摘要长度（Base64编码前的长度）必须等于32字节</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>密钥的唯一标识</p> 
     * @return KeyId <p>密钥的唯一标识</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>密钥的唯一标识</p>
     * @param KeyId <p>密钥的唯一标识</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。</p> 
     * @return MessageType <p>消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。</p>
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set <p>消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。</p>
     * @param MessageType <p>消息类型：RAW，DIGEST，如果不传，默认为RAW，表示消息原文。</p>
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

