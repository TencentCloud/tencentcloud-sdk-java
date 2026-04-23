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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OauthConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TokenURL")
    @Expose
    private String TokenURL;

    /**
    * 
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 
    */
    @SerializedName("ClientSecret")
    @Expose
    private String ClientSecret;

    /**
     * Get  
     * @return TokenURL 
     */
    public String getTokenURL() {
        return this.TokenURL;
    }

    /**
     * Set 
     * @param TokenURL 
     */
    public void setTokenURL(String TokenURL) {
        this.TokenURL = TokenURL;
    }

    /**
     * Get  
     * @return ClientId 
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 
     * @param ClientId 
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get  
     * @return ClientSecret 
     */
    public String getClientSecret() {
        return this.ClientSecret;
    }

    /**
     * Set 
     * @param ClientSecret 
     */
    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    public OauthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OauthConfig(OauthConfig source) {
        if (source.TokenURL != null) {
            this.TokenURL = new String(source.TokenURL);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientSecret != null) {
            this.ClientSecret = new String(source.ClientSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenURL", this.TokenURL);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientSecret", this.ClientSecret);

    }
}

