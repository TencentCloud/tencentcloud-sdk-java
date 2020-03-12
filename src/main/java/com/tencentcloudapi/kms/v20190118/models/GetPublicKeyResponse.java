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

public class GetPublicKeyResponse extends AbstractModel{

    /**
    * CMK的唯一标识。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 经过base64编码的公钥内容。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * PEM格式的公钥内容。
    */
    @SerializedName("PublicKeyPem")
    @Expose
    private String PublicKeyPem;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CMK的唯一标识。 
     * @return KeyId CMK的唯一标识。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的唯一标识。
     * @param KeyId CMK的唯一标识。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 经过base64编码的公钥内容。 
     * @return PublicKey 经过base64编码的公钥内容。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 经过base64编码的公钥内容。
     * @param PublicKey 经过base64编码的公钥内容。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get PEM格式的公钥内容。 
     * @return PublicKeyPem PEM格式的公钥内容。
     */
    public String getPublicKeyPem() {
        return this.PublicKeyPem;
    }

    /**
     * Set PEM格式的公钥内容。
     * @param PublicKeyPem PEM格式的公钥内容。
     */
    public void setPublicKeyPem(String PublicKeyPem) {
        this.PublicKeyPem = PublicKeyPem;
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
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PublicKeyPem", this.PublicKeyPem);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

