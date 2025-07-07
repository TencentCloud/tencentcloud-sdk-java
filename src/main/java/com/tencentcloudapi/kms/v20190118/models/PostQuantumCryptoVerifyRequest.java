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

public class PostQuantumCryptoVerifyRequest extends AbstractModel {

    /**
    * 密钥的唯一标识
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 签名值，通过调用KMS PostQuantumCryptoSign签名接口生成
    */
    @SerializedName("SignatureValue")
    @Expose
    private String SignatureValue;

    /**
    * Base64 编码的消息原文，消息原文的长度（Base64编码前的长度）不超过4096字节。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

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
     * Get 签名值，通过调用KMS PostQuantumCryptoSign签名接口生成 
     * @return SignatureValue 签名值，通过调用KMS PostQuantumCryptoSign签名接口生成
     */
    public String getSignatureValue() {
        return this.SignatureValue;
    }

    /**
     * Set 签名值，通过调用KMS PostQuantumCryptoSign签名接口生成
     * @param SignatureValue 签名值，通过调用KMS PostQuantumCryptoSign签名接口生成
     */
    public void setSignatureValue(String SignatureValue) {
        this.SignatureValue = SignatureValue;
    }

    /**
     * Get Base64 编码的消息原文，消息原文的长度（Base64编码前的长度）不超过4096字节。 
     * @return Message Base64 编码的消息原文，消息原文的长度（Base64编码前的长度）不超过4096字节。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Base64 编码的消息原文，消息原文的长度（Base64编码前的长度）不超过4096字节。
     * @param Message Base64 编码的消息原文，消息原文的长度（Base64编码前的长度）不超过4096字节。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public PostQuantumCryptoVerifyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostQuantumCryptoVerifyRequest(PostQuantumCryptoVerifyRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.SignatureValue != null) {
            this.SignatureValue = new String(source.SignatureValue);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "SignatureValue", this.SignatureValue);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

