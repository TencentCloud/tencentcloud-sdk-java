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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JWTConfig extends AbstractModel {

    /**
    * 密钥信息
    */
    @SerializedName("SecretInfo")
    @Expose
    private SecretInfo SecretInfo;

    /**
    * Payload校验规则集合
    */
    @SerializedName("PayloadRule")
    @Expose
    private TokenRuleEntry [] PayloadRule;

    /**
     * Get 密钥信息 
     * @return SecretInfo 密钥信息
     */
    public SecretInfo getSecretInfo() {
        return this.SecretInfo;
    }

    /**
     * Set 密钥信息
     * @param SecretInfo 密钥信息
     */
    public void setSecretInfo(SecretInfo SecretInfo) {
        this.SecretInfo = SecretInfo;
    }

    /**
     * Get Payload校验规则集合 
     * @return PayloadRule Payload校验规则集合
     */
    public TokenRuleEntry [] getPayloadRule() {
        return this.PayloadRule;
    }

    /**
     * Set Payload校验规则集合
     * @param PayloadRule Payload校验规则集合
     */
    public void setPayloadRule(TokenRuleEntry [] PayloadRule) {
        this.PayloadRule = PayloadRule;
    }

    public JWTConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JWTConfig(JWTConfig source) {
        if (source.SecretInfo != null) {
            this.SecretInfo = new SecretInfo(source.SecretInfo);
        }
        if (source.PayloadRule != null) {
            this.PayloadRule = new TokenRuleEntry[source.PayloadRule.length];
            for (int i = 0; i < source.PayloadRule.length; i++) {
                this.PayloadRule[i] = new TokenRuleEntry(source.PayloadRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecretInfo.", this.SecretInfo);
        this.setParamArrayObj(map, prefix + "PayloadRule.", this.PayloadRule);

    }
}

