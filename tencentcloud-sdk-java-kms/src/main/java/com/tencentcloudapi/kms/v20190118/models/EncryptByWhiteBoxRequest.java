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

public class EncryptByWhiteBoxRequest extends AbstractModel{

    /**
    * 白盒密钥的全局唯一标识符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 待加密的文本， base64编码，文本的原始长度最大不超过4KB
    */
    @SerializedName("PlainText")
    @Expose
    private String PlainText;

    /**
    * 初始化向量，大小为 16 Bytes，加密算法会使用到, base64编码；如果不传，则由后端服务随机生成。用户需要自行保存该值，作为解密的参数。
    */
    @SerializedName("InitializationVector")
    @Expose
    private String InitializationVector;

    /**
     * Get 白盒密钥的全局唯一标识符 
     * @return KeyId 白盒密钥的全局唯一标识符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 白盒密钥的全局唯一标识符
     * @param KeyId 白盒密钥的全局唯一标识符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 待加密的文本， base64编码，文本的原始长度最大不超过4KB 
     * @return PlainText 待加密的文本， base64编码，文本的原始长度最大不超过4KB
     */
    public String getPlainText() {
        return this.PlainText;
    }

    /**
     * Set 待加密的文本， base64编码，文本的原始长度最大不超过4KB
     * @param PlainText 待加密的文本， base64编码，文本的原始长度最大不超过4KB
     */
    public void setPlainText(String PlainText) {
        this.PlainText = PlainText;
    }

    /**
     * Get 初始化向量，大小为 16 Bytes，加密算法会使用到, base64编码；如果不传，则由后端服务随机生成。用户需要自行保存该值，作为解密的参数。 
     * @return InitializationVector 初始化向量，大小为 16 Bytes，加密算法会使用到, base64编码；如果不传，则由后端服务随机生成。用户需要自行保存该值，作为解密的参数。
     */
    public String getInitializationVector() {
        return this.InitializationVector;
    }

    /**
     * Set 初始化向量，大小为 16 Bytes，加密算法会使用到, base64编码；如果不传，则由后端服务随机生成。用户需要自行保存该值，作为解密的参数。
     * @param InitializationVector 初始化向量，大小为 16 Bytes，加密算法会使用到, base64编码；如果不传，则由后端服务随机生成。用户需要自行保存该值，作为解密的参数。
     */
    public void setInitializationVector(String InitializationVector) {
        this.InitializationVector = InitializationVector;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PlainText", this.PlainText);
        this.setParamSimple(map, prefix + "InitializationVector", this.InitializationVector);

    }
}

