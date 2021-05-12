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

public class EncryptResponse extends AbstractModel{

    /**
    * 加密后的密文，base64编码。注意：本字段中打包了密文和密钥的相关信息，不是对明文的直接加密结果，只有将该字段作为Decrypt接口的输入参数，才可以解密出原文。
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * 加密使用的CMK的全局唯一标识
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加密后的密文，base64编码。注意：本字段中打包了密文和密钥的相关信息，不是对明文的直接加密结果，只有将该字段作为Decrypt接口的输入参数，才可以解密出原文。 
     * @return CiphertextBlob 加密后的密文，base64编码。注意：本字段中打包了密文和密钥的相关信息，不是对明文的直接加密结果，只有将该字段作为Decrypt接口的输入参数，才可以解密出原文。
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set 加密后的密文，base64编码。注意：本字段中打包了密文和密钥的相关信息，不是对明文的直接加密结果，只有将该字段作为Decrypt接口的输入参数，才可以解密出原文。
     * @param CiphertextBlob 加密后的密文，base64编码。注意：本字段中打包了密文和密钥的相关信息，不是对明文的直接加密结果，只有将该字段作为Decrypt接口的输入参数，才可以解密出原文。
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get 加密使用的CMK的全局唯一标识 
     * @return KeyId 加密使用的CMK的全局唯一标识
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 加密使用的CMK的全局唯一标识
     * @param KeyId 加密使用的CMK的全局唯一标识
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public EncryptResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptResponse(EncryptResponse source) {
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

