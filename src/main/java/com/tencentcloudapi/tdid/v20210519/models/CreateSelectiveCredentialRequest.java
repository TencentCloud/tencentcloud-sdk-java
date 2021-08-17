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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSelectiveCredentialRequest extends AbstractModel{

    /**
    * 参数集合
    */
    @SerializedName("FunctionArg")
    @Expose
    private VerifyFunctionArg FunctionArg;

    /**
    * 批露策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get 参数集合 
     * @return FunctionArg 参数集合
     */
    public VerifyFunctionArg getFunctionArg() {
        return this.FunctionArg;
    }

    /**
     * Set 参数集合
     * @param FunctionArg 参数集合
     */
    public void setFunctionArg(VerifyFunctionArg FunctionArg) {
        this.FunctionArg = FunctionArg;
    }

    /**
     * Get 批露策略id 
     * @return PolicyId 批露策略id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 批露策略id
     * @param PolicyId 批露策略id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public CreateSelectiveCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSelectiveCredentialRequest(CreateSelectiveCredentialRequest source) {
        if (source.FunctionArg != null) {
            this.FunctionArg = new VerifyFunctionArg(source.FunctionArg);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FunctionArg.", this.FunctionArg);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

