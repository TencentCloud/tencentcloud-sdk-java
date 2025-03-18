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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRuleAction extends AbstractModel {

    /**
    * 托管规则组下的具体项，用于改写此单条规则项配置的内容，具体参考产品文档。	
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * RuleId 中指定托管规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get 托管规则组下的具体项，用于改写此单条规则项配置的内容，具体参考产品文档。	 
     * @return RuleId 托管规则组下的具体项，用于改写此单条规则项配置的内容，具体参考产品文档。	
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 托管规则组下的具体项，用于改写此单条规则项配置的内容，具体参考产品文档。	
     * @param RuleId 托管规则组下的具体项，用于改写此单条规则项配置的内容，具体参考产品文档。	
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get RuleId 中指定托管规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li> 
     * @return Action RuleId 中指定托管规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set RuleId 中指定托管规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li>
     * @param Action RuleId 中指定托管规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public ManagedRuleAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleAction(ManagedRuleAction source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

