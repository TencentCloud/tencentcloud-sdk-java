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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWOAuthCredentialConfig extends AbstractModel {

    /**
    * <p>OAuth2 client_id</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>OAuth2 client_secret</p>
    */
    @SerializedName("ClientSecret")
    @Expose
    private String ClientSecret;

    /**
     * Get <p>OAuth2 client_id</p> 
     * @return ClientId <p>OAuth2 client_id</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>OAuth2 client_id</p>
     * @param ClientId <p>OAuth2 client_id</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>OAuth2 client_secret</p> 
     * @return ClientSecret <p>OAuth2 client_secret</p>
     */
    public String getClientSecret() {
        return this.ClientSecret;
    }

    /**
     * Set <p>OAuth2 client_secret</p>
     * @param ClientSecret <p>OAuth2 client_secret</p>
     */
    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    public AIGWOAuthCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWOAuthCredentialConfig(AIGWOAuthCredentialConfig source) {
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
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientSecret", this.ClientSecret);

    }
}

