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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Credentials extends AbstractModel{

    /**
    * token。token长度和绑定的策略有关，最长不超过4096字节。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 临时证书密钥ID。最长不超过1024字节。
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时证书密钥Key。最长不超过1024字节。
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
     * Get token。token长度和绑定的策略有关，最长不超过4096字节。 
     * @return Token token。token长度和绑定的策略有关，最长不超过4096字节。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set token。token长度和绑定的策略有关，最长不超过4096字节。
     * @param Token token。token长度和绑定的策略有关，最长不超过4096字节。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 临时证书密钥ID。最长不超过1024字节。 
     * @return TmpSecretId 临时证书密钥ID。最长不超过1024字节。
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时证书密钥ID。最长不超过1024字节。
     * @param TmpSecretId 临时证书密钥ID。最长不超过1024字节。
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时证书密钥Key。最长不超过1024字节。 
     * @return TmpSecretKey 临时证书密钥Key。最长不超过1024字节。
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时证书密钥Key。最长不超过1024字节。
     * @param TmpSecretKey 临时证书密钥Key。最长不超过1024字节。
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);

    }
}

