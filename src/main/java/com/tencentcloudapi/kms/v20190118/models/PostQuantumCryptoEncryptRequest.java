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

public class PostQuantumCryptoEncryptRequest extends AbstractModel{

    /**
    * 调用CreateKey生成的CMK全局唯一标识符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K
    */
    @SerializedName("PlainText")
    @Expose
    private String PlainText;

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
     * @return PlainText 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K
     */
    public String getPlainText() {
        return this.PlainText;
    }

    /**
     * Set 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K
     * @param PlainText 被加密的明文数据，该字段必须使用base64编码，原文最大长度支持4K
     */
    public void setPlainText(String PlainText) {
        this.PlainText = PlainText;
    }

    public PostQuantumCryptoEncryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostQuantumCryptoEncryptRequest(PostQuantumCryptoEncryptRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.PlainText != null) {
            this.PlainText = new String(source.PlainText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PlainText", this.PlainText);

    }
}

