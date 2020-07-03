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

public class GetParametersForImportRequest extends AbstractModel{

    /**
    * CMK的唯一标识，获取密钥参数的CMK必须是EXTERNAL类型，即在CreateKey时指定Type=2 类型的CMK。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 指定加密密钥材料的算法，目前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256
    */
    @SerializedName("WrappingAlgorithm")
    @Expose
    private String WrappingAlgorithm;

    /**
    * 指定加密密钥材料的类型，目前只支持RSA_2048
    */
    @SerializedName("WrappingKeySpec")
    @Expose
    private String WrappingKeySpec;

    /**
     * Get CMK的唯一标识，获取密钥参数的CMK必须是EXTERNAL类型，即在CreateKey时指定Type=2 类型的CMK。 
     * @return KeyId CMK的唯一标识，获取密钥参数的CMK必须是EXTERNAL类型，即在CreateKey时指定Type=2 类型的CMK。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的唯一标识，获取密钥参数的CMK必须是EXTERNAL类型，即在CreateKey时指定Type=2 类型的CMK。
     * @param KeyId CMK的唯一标识，获取密钥参数的CMK必须是EXTERNAL类型，即在CreateKey时指定Type=2 类型的CMK。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 指定加密密钥材料的算法，目前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256 
     * @return WrappingAlgorithm 指定加密密钥材料的算法，目前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256
     */
    public String getWrappingAlgorithm() {
        return this.WrappingAlgorithm;
    }

    /**
     * Set 指定加密密钥材料的算法，目前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256
     * @param WrappingAlgorithm 指定加密密钥材料的算法，目前支持RSAES_PKCS1_V1_5、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256
     */
    public void setWrappingAlgorithm(String WrappingAlgorithm) {
        this.WrappingAlgorithm = WrappingAlgorithm;
    }

    /**
     * Get 指定加密密钥材料的类型，目前只支持RSA_2048 
     * @return WrappingKeySpec 指定加密密钥材料的类型，目前只支持RSA_2048
     */
    public String getWrappingKeySpec() {
        return this.WrappingKeySpec;
    }

    /**
     * Set 指定加密密钥材料的类型，目前只支持RSA_2048
     * @param WrappingKeySpec 指定加密密钥材料的类型，目前只支持RSA_2048
     */
    public void setWrappingKeySpec(String WrappingKeySpec) {
        this.WrappingKeySpec = WrappingKeySpec;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "WrappingAlgorithm", this.WrappingAlgorithm);
        this.setParamSimple(map, prefix + "WrappingKeySpec", this.WrappingKeySpec);

    }
}

