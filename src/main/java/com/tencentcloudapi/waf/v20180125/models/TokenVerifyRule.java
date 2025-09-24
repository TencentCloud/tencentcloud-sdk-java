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

public class TokenVerifyRule extends AbstractModel {

    /**
    * JWS、JWE专用校验规则
    */
    @SerializedName("JWTRule")
    @Expose
    private JWTConfig JWTRule;

    /**
    * 其他会话有效性校验方式(contains、length、regex)的校验规则
    */
    @SerializedName("GeneralRule")
    @Expose
    private TokenRuleEntry GeneralRule;

    /**
     * Get JWS、JWE专用校验规则 
     * @return JWTRule JWS、JWE专用校验规则
     */
    public JWTConfig getJWTRule() {
        return this.JWTRule;
    }

    /**
     * Set JWS、JWE专用校验规则
     * @param JWTRule JWS、JWE专用校验规则
     */
    public void setJWTRule(JWTConfig JWTRule) {
        this.JWTRule = JWTRule;
    }

    /**
     * Get 其他会话有效性校验方式(contains、length、regex)的校验规则 
     * @return GeneralRule 其他会话有效性校验方式(contains、length、regex)的校验规则
     */
    public TokenRuleEntry getGeneralRule() {
        return this.GeneralRule;
    }

    /**
     * Set 其他会话有效性校验方式(contains、length、regex)的校验规则
     * @param GeneralRule 其他会话有效性校验方式(contains、length、regex)的校验规则
     */
    public void setGeneralRule(TokenRuleEntry GeneralRule) {
        this.GeneralRule = GeneralRule;
    }

    public TokenVerifyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenVerifyRule(TokenVerifyRule source) {
        if (source.JWTRule != null) {
            this.JWTRule = new JWTConfig(source.JWTRule);
        }
        if (source.GeneralRule != null) {
            this.GeneralRule = new TokenRuleEntry(source.GeneralRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "JWTRule.", this.JWTRule);
        this.setParamObj(map, prefix + "GeneralRule.", this.GeneralRule);

    }
}

