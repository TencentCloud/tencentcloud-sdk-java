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

public class AIGWOIDCCredentialConfig extends AbstractModel {

    /**
    * <p>IdP 注册的 client_id</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>IdP 注册的 client_secret</p>
    */
    @SerializedName("ClientSecret")
    @Expose
    private String ClientSecret;

    /**
    * <p>IdP Issuer URL</p>
    */
    @SerializedName("IssuerURL")
    @Expose
    private String IssuerURL;

    /**
    * <p>IdP 中该用户的 claim 值</p>
    */
    @SerializedName("ConsumerClaimValue")
    @Expose
    private String ConsumerClaimValue;

    /**
     * Get <p>IdP 注册的 client_id</p> 
     * @return ClientId <p>IdP 注册的 client_id</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>IdP 注册的 client_id</p>
     * @param ClientId <p>IdP 注册的 client_id</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>IdP 注册的 client_secret</p> 
     * @return ClientSecret <p>IdP 注册的 client_secret</p>
     */
    public String getClientSecret() {
        return this.ClientSecret;
    }

    /**
     * Set <p>IdP 注册的 client_secret</p>
     * @param ClientSecret <p>IdP 注册的 client_secret</p>
     */
    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    /**
     * Get <p>IdP Issuer URL</p> 
     * @return IssuerURL <p>IdP Issuer URL</p>
     */
    public String getIssuerURL() {
        return this.IssuerURL;
    }

    /**
     * Set <p>IdP Issuer URL</p>
     * @param IssuerURL <p>IdP Issuer URL</p>
     */
    public void setIssuerURL(String IssuerURL) {
        this.IssuerURL = IssuerURL;
    }

    /**
     * Get <p>IdP 中该用户的 claim 值</p> 
     * @return ConsumerClaimValue <p>IdP 中该用户的 claim 值</p>
     */
    public String getConsumerClaimValue() {
        return this.ConsumerClaimValue;
    }

    /**
     * Set <p>IdP 中该用户的 claim 值</p>
     * @param ConsumerClaimValue <p>IdP 中该用户的 claim 值</p>
     */
    public void setConsumerClaimValue(String ConsumerClaimValue) {
        this.ConsumerClaimValue = ConsumerClaimValue;
    }

    public AIGWOIDCCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWOIDCCredentialConfig(AIGWOIDCCredentialConfig source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientSecret != null) {
            this.ClientSecret = new String(source.ClientSecret);
        }
        if (source.IssuerURL != null) {
            this.IssuerURL = new String(source.IssuerURL);
        }
        if (source.ConsumerClaimValue != null) {
            this.ConsumerClaimValue = new String(source.ConsumerClaimValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientSecret", this.ClientSecret);
        this.setParamSimple(map, prefix + "IssuerURL", this.IssuerURL);
        this.setParamSimple(map, prefix + "ConsumerClaimValue", this.ConsumerClaimValue);

    }
}

