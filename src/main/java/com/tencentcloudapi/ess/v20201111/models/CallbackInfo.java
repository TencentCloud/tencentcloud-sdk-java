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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackInfo extends AbstractModel{

    /**
    * 回调url
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 回调加密key，已废弃
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 回调加密key
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * 回调验签token
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
     * Get 回调url 
     * @return CallbackUrl 回调url
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调url
     * @param CallbackUrl 回调url
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 回调加密key，已废弃 
     * @return Token 回调加密key，已废弃
     * @deprecated
     */
    @Deprecated
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 回调加密key，已废弃
     * @param Token 回调加密key，已废弃
     * @deprecated
     */
    @Deprecated
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 回调加密key 
     * @return CallbackKey 回调加密key
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 回调加密key
     * @param CallbackKey 回调加密key
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get 回调验签token 
     * @return CallbackToken 回调验签token
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set 回调验签token
     * @param CallbackToken 回调验签token
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
    }

    public CallbackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallbackInfo(CallbackInfo source) {
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);

    }
}

