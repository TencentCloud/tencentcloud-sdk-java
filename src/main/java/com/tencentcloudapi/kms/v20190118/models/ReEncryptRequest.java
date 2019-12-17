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

public class ReEncryptRequest extends AbstractModel{

    /**
    * 需要重新加密的密文
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * 重新加密使用的CMK，如果为空，则使用密文原有的CMK重新加密（若密钥没有轮换则密文不会刷新）
    */
    @SerializedName("DestinationKeyId")
    @Expose
    private String DestinationKeyId;

    /**
    * CiphertextBlob 密文加密时使用的key/value对的json字符串。如果加密时未使用，则为空
    */
    @SerializedName("SourceEncryptionContext")
    @Expose
    private String SourceEncryptionContext;

    /**
    * 重新加密使用的key/value对的json字符串，如果使用该字段，则返回的新密文在解密时需要填入相同的字符串
    */
    @SerializedName("DestinationEncryptionContext")
    @Expose
    private String DestinationEncryptionContext;

    /**
     * Get 需要重新加密的密文 
     * @return CiphertextBlob 需要重新加密的密文
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set 需要重新加密的密文
     * @param CiphertextBlob 需要重新加密的密文
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get 重新加密使用的CMK，如果为空，则使用密文原有的CMK重新加密（若密钥没有轮换则密文不会刷新） 
     * @return DestinationKeyId 重新加密使用的CMK，如果为空，则使用密文原有的CMK重新加密（若密钥没有轮换则密文不会刷新）
     */
    public String getDestinationKeyId() {
        return this.DestinationKeyId;
    }

    /**
     * Set 重新加密使用的CMK，如果为空，则使用密文原有的CMK重新加密（若密钥没有轮换则密文不会刷新）
     * @param DestinationKeyId 重新加密使用的CMK，如果为空，则使用密文原有的CMK重新加密（若密钥没有轮换则密文不会刷新）
     */
    public void setDestinationKeyId(String DestinationKeyId) {
        this.DestinationKeyId = DestinationKeyId;
    }

    /**
     * Get CiphertextBlob 密文加密时使用的key/value对的json字符串。如果加密时未使用，则为空 
     * @return SourceEncryptionContext CiphertextBlob 密文加密时使用的key/value对的json字符串。如果加密时未使用，则为空
     */
    public String getSourceEncryptionContext() {
        return this.SourceEncryptionContext;
    }

    /**
     * Set CiphertextBlob 密文加密时使用的key/value对的json字符串。如果加密时未使用，则为空
     * @param SourceEncryptionContext CiphertextBlob 密文加密时使用的key/value对的json字符串。如果加密时未使用，则为空
     */
    public void setSourceEncryptionContext(String SourceEncryptionContext) {
        this.SourceEncryptionContext = SourceEncryptionContext;
    }

    /**
     * Get 重新加密使用的key/value对的json字符串，如果使用该字段，则返回的新密文在解密时需要填入相同的字符串 
     * @return DestinationEncryptionContext 重新加密使用的key/value对的json字符串，如果使用该字段，则返回的新密文在解密时需要填入相同的字符串
     */
    public String getDestinationEncryptionContext() {
        return this.DestinationEncryptionContext;
    }

    /**
     * Set 重新加密使用的key/value对的json字符串，如果使用该字段，则返回的新密文在解密时需要填入相同的字符串
     * @param DestinationEncryptionContext 重新加密使用的key/value对的json字符串，如果使用该字段，则返回的新密文在解密时需要填入相同的字符串
     */
    public void setDestinationEncryptionContext(String DestinationEncryptionContext) {
        this.DestinationEncryptionContext = DestinationEncryptionContext;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "DestinationKeyId", this.DestinationKeyId);
        this.setParamSimple(map, prefix + "SourceEncryptionContext", this.SourceEncryptionContext);
        this.setParamSimple(map, prefix + "DestinationEncryptionContext", this.DestinationEncryptionContext);

    }
}

