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

public class CreateWhiteBoxKeyResponse extends AbstractModel{

    /**
    * 用于加密的密钥，base64编码
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * 用于解密的密钥，base64编码
    */
    @SerializedName("DecryptKey")
    @Expose
    private String DecryptKey;

    /**
    * 白盒密钥的全局唯一标识符
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
     * Get 用于加密的密钥，base64编码 
     * @return EncryptKey 用于加密的密钥，base64编码
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set 用于加密的密钥，base64编码
     * @param EncryptKey 用于加密的密钥，base64编码
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
    }

    /**
     * Get 用于解密的密钥，base64编码 
     * @return DecryptKey 用于解密的密钥，base64编码
     */
    public String getDecryptKey() {
        return this.DecryptKey;
    }

    /**
     * Set 用于解密的密钥，base64编码
     * @param DecryptKey 用于解密的密钥，base64编码
     */
    public void setDecryptKey(String DecryptKey) {
        this.DecryptKey = DecryptKey;
    }

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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptKey", this.EncryptKey);
        this.setParamSimple(map, prefix + "DecryptKey", this.DecryptKey);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

