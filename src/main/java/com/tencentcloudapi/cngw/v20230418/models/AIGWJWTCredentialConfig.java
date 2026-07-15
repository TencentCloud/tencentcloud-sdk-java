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

public class AIGWJWTCredentialConfig extends AbstractModel {

    /**
    * <p>JWT 消费者标识，iss claim</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>签名算法，取值：HS256 HS384 HS512 RS256 RS384 RS512 ES256 ES384 ES512</p>
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * <p>HS 对称密钥，仅 Algorithm 为 HS256/HS384/HS512 时必填；RS/ES* 时留空</p>
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * <p>RS/ES PEM 格式公钥，仅 Algorithm 为 RS256/RS384/RS512/ES256/ES384/ES512 时必填；HS* 时留空</p>
    */
    @SerializedName("RSAPublicKey")
    @Expose
    private String RSAPublicKey;

    /**
     * Get <p>JWT 消费者标识，iss claim</p> 
     * @return Key <p>JWT 消费者标识，iss claim</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>JWT 消费者标识，iss claim</p>
     * @param Key <p>JWT 消费者标识，iss claim</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>签名算法，取值：HS256 HS384 HS512 RS256 RS384 RS512 ES256 ES384 ES512</p> 
     * @return Algorithm <p>签名算法，取值：HS256 HS384 HS512 RS256 RS384 RS512 ES256 ES384 ES512</p>
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set <p>签名算法，取值：HS256 HS384 HS512 RS256 RS384 RS512 ES256 ES384 ES512</p>
     * @param Algorithm <p>签名算法，取值：HS256 HS384 HS512 RS256 RS384 RS512 ES256 ES384 ES512</p>
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get <p>HS 对称密钥，仅 Algorithm 为 HS256/HS384/HS512 时必填；RS/ES* 时留空</p> 
     * @return Secret <p>HS 对称密钥，仅 Algorithm 为 HS256/HS384/HS512 时必填；RS/ES* 时留空</p>
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set <p>HS 对称密钥，仅 Algorithm 为 HS256/HS384/HS512 时必填；RS/ES* 时留空</p>
     * @param Secret <p>HS 对称密钥，仅 Algorithm 为 HS256/HS384/HS512 时必填；RS/ES* 时留空</p>
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get <p>RS/ES PEM 格式公钥，仅 Algorithm 为 RS256/RS384/RS512/ES256/ES384/ES512 时必填；HS* 时留空</p> 
     * @return RSAPublicKey <p>RS/ES PEM 格式公钥，仅 Algorithm 为 RS256/RS384/RS512/ES256/ES384/ES512 时必填；HS* 时留空</p>
     */
    public String getRSAPublicKey() {
        return this.RSAPublicKey;
    }

    /**
     * Set <p>RS/ES PEM 格式公钥，仅 Algorithm 为 RS256/RS384/RS512/ES256/ES384/ES512 时必填；HS* 时留空</p>
     * @param RSAPublicKey <p>RS/ES PEM 格式公钥，仅 Algorithm 为 RS256/RS384/RS512/ES256/ES384/ES512 时必填；HS* 时留空</p>
     */
    public void setRSAPublicKey(String RSAPublicKey) {
        this.RSAPublicKey = RSAPublicKey;
    }

    public AIGWJWTCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWJWTCredentialConfig(AIGWJWTCredentialConfig source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
        if (source.RSAPublicKey != null) {
            this.RSAPublicKey = new String(source.RSAPublicKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamSimple(map, prefix + "RSAPublicKey", this.RSAPublicKey);

    }
}

