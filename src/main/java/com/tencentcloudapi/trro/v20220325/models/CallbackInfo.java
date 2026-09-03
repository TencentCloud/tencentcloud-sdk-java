/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackInfo extends AbstractModel {

    /**
    * <p>回调地址</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>回调签名密钥，用于回调请求的签名校验</p>
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
     * Get <p>回调地址</p> 
     * @return Url <p>回调地址</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>回调地址</p>
     * @param Url <p>回调地址</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>回调签名密钥，用于回调请求的签名校验</p> 
     * @return Secret <p>回调签名密钥，用于回调请求的签名校验</p>
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set <p>回调签名密钥，用于回调请求的签名校验</p>
     * @param Secret <p>回调签名密钥，用于回调请求的签名校验</p>
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    public CallbackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallbackInfo(CallbackInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Secret", this.Secret);

    }
}

