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

public class AsymmetricRsaDecryptRequest extends AbstractModel{

    /**
    * CMK的唯一标识
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 使用PublicKey加密的密文，Base64编码
    */
    @SerializedName("Ciphertext")
    @Expose
    private String Ciphertext;

    /**
    * 在使用公钥加密时对应的算法：当前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
     * Get CMK的唯一标识 
     * @return KeyId CMK的唯一标识
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的唯一标识
     * @param KeyId CMK的唯一标识
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 使用PublicKey加密的密文，Base64编码 
     * @return Ciphertext 使用PublicKey加密的密文，Base64编码
     */
    public String getCiphertext() {
        return this.Ciphertext;
    }

    /**
     * Set 使用PublicKey加密的密文，Base64编码
     * @param Ciphertext 使用PublicKey加密的密文，Base64编码
     */
    public void setCiphertext(String Ciphertext) {
        this.Ciphertext = Ciphertext;
    }

    /**
     * Get 在使用公钥加密时对应的算法：当前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256 
     * @return Algorithm 在使用公钥加密时对应的算法：当前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 在使用公钥加密时对应的算法：当前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256
     * @param Algorithm 在使用公钥加密时对应的算法：当前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Ciphertext", this.Ciphertext);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);

    }
}

