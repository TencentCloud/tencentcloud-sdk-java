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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWJWTAuthPluginConfig extends AbstractModel {

    /**
    * <p>签名的header名称列表</p>
    */
    @SerializedName("HeaderNames")
    @Expose
    private String [] HeaderNames;

    /**
    * <p>签名的cookie名称列表</p>
    */
    @SerializedName("CookieNames")
    @Expose
    private String [] CookieNames;

    /**
    * <p>签名的URL参数名称列表</p>
    */
    @SerializedName("URIParamNames")
    @Expose
    private String [] URIParamNames;

    /**
    * <p>消费者标识</p>
    */
    @SerializedName("KeyClaimName")
    @Expose
    private String KeyClaimName;

    /**
    * <p>标准消费者校验</p><p>枚举值：</p><ul><li>exp： exp</li><li>nbf： nbf</li></ul>
    */
    @SerializedName("ClaimsToVerify")
    @Expose
    private String [] ClaimsToVerify;

    /**
    * <p>最大有效期</p>
    */
    @SerializedName("MaximumExpiration")
    @Expose
    private Long MaximumExpiration;

    /**
    * <p>是否Base64编码</p>
    */
    @SerializedName("SecretIsBase64")
    @Expose
    private Boolean SecretIsBase64;

    /**
    * <p>CORS预检验证</p>
    */
    @SerializedName("RunOnPreFlight")
    @Expose
    private Boolean RunOnPreFlight;

    /**
     * Get <p>签名的header名称列表</p> 
     * @return HeaderNames <p>签名的header名称列表</p>
     */
    public String [] getHeaderNames() {
        return this.HeaderNames;
    }

    /**
     * Set <p>签名的header名称列表</p>
     * @param HeaderNames <p>签名的header名称列表</p>
     */
    public void setHeaderNames(String [] HeaderNames) {
        this.HeaderNames = HeaderNames;
    }

    /**
     * Get <p>签名的cookie名称列表</p> 
     * @return CookieNames <p>签名的cookie名称列表</p>
     */
    public String [] getCookieNames() {
        return this.CookieNames;
    }

    /**
     * Set <p>签名的cookie名称列表</p>
     * @param CookieNames <p>签名的cookie名称列表</p>
     */
    public void setCookieNames(String [] CookieNames) {
        this.CookieNames = CookieNames;
    }

    /**
     * Get <p>签名的URL参数名称列表</p> 
     * @return URIParamNames <p>签名的URL参数名称列表</p>
     */
    public String [] getURIParamNames() {
        return this.URIParamNames;
    }

    /**
     * Set <p>签名的URL参数名称列表</p>
     * @param URIParamNames <p>签名的URL参数名称列表</p>
     */
    public void setURIParamNames(String [] URIParamNames) {
        this.URIParamNames = URIParamNames;
    }

    /**
     * Get <p>消费者标识</p> 
     * @return KeyClaimName <p>消费者标识</p>
     */
    public String getKeyClaimName() {
        return this.KeyClaimName;
    }

    /**
     * Set <p>消费者标识</p>
     * @param KeyClaimName <p>消费者标识</p>
     */
    public void setKeyClaimName(String KeyClaimName) {
        this.KeyClaimName = KeyClaimName;
    }

    /**
     * Get <p>标准消费者校验</p><p>枚举值：</p><ul><li>exp： exp</li><li>nbf： nbf</li></ul> 
     * @return ClaimsToVerify <p>标准消费者校验</p><p>枚举值：</p><ul><li>exp： exp</li><li>nbf： nbf</li></ul>
     */
    public String [] getClaimsToVerify() {
        return this.ClaimsToVerify;
    }

    /**
     * Set <p>标准消费者校验</p><p>枚举值：</p><ul><li>exp： exp</li><li>nbf： nbf</li></ul>
     * @param ClaimsToVerify <p>标准消费者校验</p><p>枚举值：</p><ul><li>exp： exp</li><li>nbf： nbf</li></ul>
     */
    public void setClaimsToVerify(String [] ClaimsToVerify) {
        this.ClaimsToVerify = ClaimsToVerify;
    }

    /**
     * Get <p>最大有效期</p> 
     * @return MaximumExpiration <p>最大有效期</p>
     */
    public Long getMaximumExpiration() {
        return this.MaximumExpiration;
    }

    /**
     * Set <p>最大有效期</p>
     * @param MaximumExpiration <p>最大有效期</p>
     */
    public void setMaximumExpiration(Long MaximumExpiration) {
        this.MaximumExpiration = MaximumExpiration;
    }

    /**
     * Get <p>是否Base64编码</p> 
     * @return SecretIsBase64 <p>是否Base64编码</p>
     */
    public Boolean getSecretIsBase64() {
        return this.SecretIsBase64;
    }

    /**
     * Set <p>是否Base64编码</p>
     * @param SecretIsBase64 <p>是否Base64编码</p>
     */
    public void setSecretIsBase64(Boolean SecretIsBase64) {
        this.SecretIsBase64 = SecretIsBase64;
    }

    /**
     * Get <p>CORS预检验证</p> 
     * @return RunOnPreFlight <p>CORS预检验证</p>
     */
    public Boolean getRunOnPreFlight() {
        return this.RunOnPreFlight;
    }

    /**
     * Set <p>CORS预检验证</p>
     * @param RunOnPreFlight <p>CORS预检验证</p>
     */
    public void setRunOnPreFlight(Boolean RunOnPreFlight) {
        this.RunOnPreFlight = RunOnPreFlight;
    }

    public AIGWJWTAuthPluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWJWTAuthPluginConfig(AIGWJWTAuthPluginConfig source) {
        if (source.HeaderNames != null) {
            this.HeaderNames = new String[source.HeaderNames.length];
            for (int i = 0; i < source.HeaderNames.length; i++) {
                this.HeaderNames[i] = new String(source.HeaderNames[i]);
            }
        }
        if (source.CookieNames != null) {
            this.CookieNames = new String[source.CookieNames.length];
            for (int i = 0; i < source.CookieNames.length; i++) {
                this.CookieNames[i] = new String(source.CookieNames[i]);
            }
        }
        if (source.URIParamNames != null) {
            this.URIParamNames = new String[source.URIParamNames.length];
            for (int i = 0; i < source.URIParamNames.length; i++) {
                this.URIParamNames[i] = new String(source.URIParamNames[i]);
            }
        }
        if (source.KeyClaimName != null) {
            this.KeyClaimName = new String(source.KeyClaimName);
        }
        if (source.ClaimsToVerify != null) {
            this.ClaimsToVerify = new String[source.ClaimsToVerify.length];
            for (int i = 0; i < source.ClaimsToVerify.length; i++) {
                this.ClaimsToVerify[i] = new String(source.ClaimsToVerify[i]);
            }
        }
        if (source.MaximumExpiration != null) {
            this.MaximumExpiration = new Long(source.MaximumExpiration);
        }
        if (source.SecretIsBase64 != null) {
            this.SecretIsBase64 = new Boolean(source.SecretIsBase64);
        }
        if (source.RunOnPreFlight != null) {
            this.RunOnPreFlight = new Boolean(source.RunOnPreFlight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HeaderNames.", this.HeaderNames);
        this.setParamArraySimple(map, prefix + "CookieNames.", this.CookieNames);
        this.setParamArraySimple(map, prefix + "URIParamNames.", this.URIParamNames);
        this.setParamSimple(map, prefix + "KeyClaimName", this.KeyClaimName);
        this.setParamArraySimple(map, prefix + "ClaimsToVerify.", this.ClaimsToVerify);
        this.setParamSimple(map, prefix + "MaximumExpiration", this.MaximumExpiration);
        this.setParamSimple(map, prefix + "SecretIsBase64", this.SecretIsBase64);
        this.setParamSimple(map, prefix + "RunOnPreFlight", this.RunOnPreFlight);

    }
}

