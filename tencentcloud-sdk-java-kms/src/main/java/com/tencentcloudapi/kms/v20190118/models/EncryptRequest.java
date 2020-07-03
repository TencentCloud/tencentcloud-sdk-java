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

public class EncryptRequest extends AbstractModel{

    /**
    * 调用CreateKey生成的CMK全局唯一标识符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K
    */
    @SerializedName("Plaintext")
    @Expose
    private String Plaintext;

    /**
    * key/value对的json字符串，如果指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024个字符
    */
    @SerializedName("EncryptionContext")
    @Expose
    private String EncryptionContext;

    /**
     * Get 调用CreateKey生成的CMK全局唯一标识符 
     * @return KeyId 调用CreateKey生成的CMK全局唯一标识符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 调用CreateKey生成的CMK全局唯一标识符
     * @param KeyId 调用CreateKey生成的CMK全局唯一标识符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K 
     * @return Plaintext 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K
     */
    public String getPlaintext() {
        return this.Plaintext;
    }

    /**
     * Set 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K
     * @param Plaintext 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K
     */
    public void setPlaintext(String Plaintext) {
        this.Plaintext = Plaintext;
    }

    /**
     * Get key/value对的json字符串，如果指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024个字符 
     * @return EncryptionContext key/value对的json字符串，如果指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024个字符
     */
    public String getEncryptionContext() {
        return this.EncryptionContext;
    }

    /**
     * Set key/value对的json字符串，如果指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024个字符
     * @param EncryptionContext key/value对的json字符串，如果指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024个字符
     */
    public void setEncryptionContext(String EncryptionContext) {
        this.EncryptionContext = EncryptionContext;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Plaintext", this.Plaintext);
        this.setParamSimple(map, prefix + "EncryptionContext", this.EncryptionContext);

    }
}

