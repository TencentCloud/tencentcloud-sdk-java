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

public class LineChannelConfig extends AbstractModel {

    /**
    * <p>LINE Channel Access Token</p>
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * <p>LINE回调地址</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>LINE Channel Secret</p>
    */
    @SerializedName("ChannelSecret")
    @Expose
    private String ChannelSecret;

    /**
     * Get <p>LINE Channel Access Token</p> 
     * @return AccessToken <p>LINE Channel Access Token</p>
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set <p>LINE Channel Access Token</p>
     * @param AccessToken <p>LINE Channel Access Token</p>
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get <p>LINE回调地址</p> 
     * @return CallbackUrl <p>LINE回调地址</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>LINE回调地址</p>
     * @param CallbackUrl <p>LINE回调地址</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>LINE Channel Secret</p> 
     * @return ChannelSecret <p>LINE Channel Secret</p>
     */
    public String getChannelSecret() {
        return this.ChannelSecret;
    }

    /**
     * Set <p>LINE Channel Secret</p>
     * @param ChannelSecret <p>LINE Channel Secret</p>
     */
    public void setChannelSecret(String ChannelSecret) {
        this.ChannelSecret = ChannelSecret;
    }

    public LineChannelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineChannelConfig(LineChannelConfig source) {
        if (source.AccessToken != null) {
            this.AccessToken = new String(source.AccessToken);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ChannelSecret != null) {
            this.ChannelSecret = new String(source.ChannelSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ChannelSecret", this.ChannelSecret);

    }
}

