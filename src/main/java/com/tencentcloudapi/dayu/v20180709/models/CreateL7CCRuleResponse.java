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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateL7CCRuleResponse extends AbstractModel{

    /**
    * 7层CC自定义规则参数，当没有开启CC自定义规则时，返回空数组
    */
    @SerializedName("RuleConfig")
    @Expose
    private CCRuleConfig [] RuleConfig;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 7层CC自定义规则参数，当没有开启CC自定义规则时，返回空数组 
     * @return RuleConfig 7层CC自定义规则参数，当没有开启CC自定义规则时，返回空数组
     */
    public CCRuleConfig [] getRuleConfig() {
        return this.RuleConfig;
    }

    /**
     * Set 7层CC自定义规则参数，当没有开启CC自定义规则时，返回空数组
     * @param RuleConfig 7层CC自定义规则参数，当没有开启CC自定义规则时，返回空数组
     */
    public void setRuleConfig(CCRuleConfig [] RuleConfig) {
        this.RuleConfig = RuleConfig;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleConfig.", this.RuleConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

