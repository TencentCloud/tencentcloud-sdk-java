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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackConfig extends AbstractModel {

    /**
    * <p>回调AESKey</p>
    */
    @SerializedName("CallbackAesKey")
    @Expose
    private String CallbackAesKey;

    /**
    * <p>回调Token</p>
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
    * <p>回调URL</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get <p>回调AESKey</p> 
     * @return CallbackAesKey <p>回调AESKey</p>
     */
    public String getCallbackAesKey() {
        return this.CallbackAesKey;
    }

    /**
     * Set <p>回调AESKey</p>
     * @param CallbackAesKey <p>回调AESKey</p>
     */
    public void setCallbackAesKey(String CallbackAesKey) {
        this.CallbackAesKey = CallbackAesKey;
    }

    /**
     * Get <p>回调Token</p> 
     * @return CallbackToken <p>回调Token</p>
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set <p>回调Token</p>
     * @param CallbackToken <p>回调Token</p>
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
    }

    /**
     * Get <p>回调URL</p> 
     * @return CallbackUrl <p>回调URL</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调URL</p>
     * @param CallbackUrl <p>回调URL</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public CallbackConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallbackConfig(CallbackConfig source) {
        if (source.CallbackAesKey != null) {
            this.CallbackAesKey = new String(source.CallbackAesKey);
        }
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackAesKey", this.CallbackAesKey);
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

