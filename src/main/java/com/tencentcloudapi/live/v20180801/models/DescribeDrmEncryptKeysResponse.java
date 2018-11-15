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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDrmEncryptKeysResponse  extends AbstractModel{

    /**
    * base64加密后的EncryptKeys信息。
    */
    @SerializedName("EncryptKeys")
    @Expose
    private String EncryptKeys;

    /**
    * 使用公钥加密的sessionkey，用来使用aes-128 ecb模式解码encryptkeys中key和iv。
    */
    @SerializedName("SessionKey")
    @Expose
    private String SessionKey;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取base64加密后的EncryptKeys信息。
     * @return EncryptKeys base64加密后的EncryptKeys信息。
     */
    public String getEncryptKeys() {
        return this.EncryptKeys;
    }

    /**
     * 设置base64加密后的EncryptKeys信息。
     * @param EncryptKeys base64加密后的EncryptKeys信息。
     */
    public void setEncryptKeys(String EncryptKeys) {
        this.EncryptKeys = EncryptKeys;
    }

    /**
     * 获取使用公钥加密的sessionkey，用来使用aes-128 ecb模式解码encryptkeys中key和iv。
     * @return SessionKey 使用公钥加密的sessionkey，用来使用aes-128 ecb模式解码encryptkeys中key和iv。
     */
    public String getSessionKey() {
        return this.SessionKey;
    }

    /**
     * 设置使用公钥加密的sessionkey，用来使用aes-128 ecb模式解码encryptkeys中key和iv。
     * @param SessionKey 使用公钥加密的sessionkey，用来使用aes-128 ecb模式解码encryptkeys中key和iv。
     */
    public void setSessionKey(String SessionKey) {
        this.SessionKey = SessionKey;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptKeys", this.EncryptKeys);
        this.setParamSimple(map, prefix + "SessionKey", this.SessionKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

