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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxACLRuleContentItem extends AbstractModel {

    /**
    * 目标（IP/端口）匹配规则
    */
    @SerializedName("DstRule")
    @Expose
    private TrafficSandboxACLDstRule DstRule;

    /**
    * URL/协议/方法匹配规则
    */
    @SerializedName("URLRule")
    @Expose
    private TrafficSandboxACLURLRule URLRule;

    /**
     * Get 目标（IP/端口）匹配规则 
     * @return DstRule 目标（IP/端口）匹配规则
     */
    public TrafficSandboxACLDstRule getDstRule() {
        return this.DstRule;
    }

    /**
     * Set 目标（IP/端口）匹配规则
     * @param DstRule 目标（IP/端口）匹配规则
     */
    public void setDstRule(TrafficSandboxACLDstRule DstRule) {
        this.DstRule = DstRule;
    }

    /**
     * Get URL/协议/方法匹配规则 
     * @return URLRule URL/协议/方法匹配规则
     */
    public TrafficSandboxACLURLRule getURLRule() {
        return this.URLRule;
    }

    /**
     * Set URL/协议/方法匹配规则
     * @param URLRule URL/协议/方法匹配规则
     */
    public void setURLRule(TrafficSandboxACLURLRule URLRule) {
        this.URLRule = URLRule;
    }

    public TrafficSandboxACLRuleContentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxACLRuleContentItem(TrafficSandboxACLRuleContentItem source) {
        if (source.DstRule != null) {
            this.DstRule = new TrafficSandboxACLDstRule(source.DstRule);
        }
        if (source.URLRule != null) {
            this.URLRule = new TrafficSandboxACLURLRule(source.URLRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DstRule.", this.DstRule);
        this.setParamObj(map, prefix + "URLRule.", this.URLRule);

    }
}

