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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveEnterpriseSecurityGroupRuleRequest extends AbstractModel {

    /**
    * <p>必填的删除类型，只使用 0 或 1。0 表示删除 RuleUuid 指定的单条规则；1 表示删除当前账号的全部可操作企业安全组规则，风险极高。</p>
    */
    @SerializedName("RemoveType")
    @Expose
    private Long RemoveType;

    /**
    * <p>必填的规则数值 ID。RemoveType=0 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=&lt;数值 RuleUuid&gt;，并使用返回的 rules[].uuid；规则不存在时返回 ResourceNotFound。RemoveType=1 时传 0，删除当前账号的全部可操作企业安全组规则。成功响应回显请求中的 RuleUuid。</p>
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
     * Get <p>必填的删除类型，只使用 0 或 1。0 表示删除 RuleUuid 指定的单条规则；1 表示删除当前账号的全部可操作企业安全组规则，风险极高。</p> 
     * @return RemoveType <p>必填的删除类型，只使用 0 或 1。0 表示删除 RuleUuid 指定的单条规则；1 表示删除当前账号的全部可操作企业安全组规则，风险极高。</p>
     */
    public Long getRemoveType() {
        return this.RemoveType;
    }

    /**
     * Set <p>必填的删除类型，只使用 0 或 1。0 表示删除 RuleUuid 指定的单条规则；1 表示删除当前账号的全部可操作企业安全组规则，风险极高。</p>
     * @param RemoveType <p>必填的删除类型，只使用 0 或 1。0 表示删除 RuleUuid 指定的单条规则；1 表示删除当前账号的全部可操作企业安全组规则，风险极高。</p>
     */
    public void setRemoveType(Long RemoveType) {
        this.RemoveType = RemoveType;
    }

    /**
     * Get <p>必填的规则数值 ID。RemoveType=0 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=&lt;数值 RuleUuid&gt;，并使用返回的 rules[].uuid；规则不存在时返回 ResourceNotFound。RemoveType=1 时传 0，删除当前账号的全部可操作企业安全组规则。成功响应回显请求中的 RuleUuid。</p> 
     * @return RuleUuid <p>必填的规则数值 ID。RemoveType=0 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=&lt;数值 RuleUuid&gt;，并使用返回的 rules[].uuid；规则不存在时返回 ResourceNotFound。RemoveType=1 时传 0，删除当前账号的全部可操作企业安全组规则。成功响应回显请求中的 RuleUuid。</p>
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set <p>必填的规则数值 ID。RemoveType=0 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=&lt;数值 RuleUuid&gt;，并使用返回的 rules[].uuid；规则不存在时返回 ResourceNotFound。RemoveType=1 时传 0，删除当前账号的全部可操作企业安全组规则。成功响应回显请求中的 RuleUuid。</p>
     * @param RuleUuid <p>必填的规则数值 ID。RemoveType=0 时，调用 DescribeCfwRules，传 RuleType=enterprise_sg、RuleId=&lt;数值 RuleUuid&gt;，并使用返回的 rules[].uuid；规则不存在时返回 ResourceNotFound。RemoveType=1 时传 0，删除当前账号的全部可操作企业安全组规则。成功响应回显请求中的 RuleUuid。</p>
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    public RemoveEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveEnterpriseSecurityGroupRuleRequest(RemoveEnterpriseSecurityGroupRuleRequest source) {
        if (source.RemoveType != null) {
            this.RemoveType = new Long(source.RemoveType);
        }
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemoveType", this.RemoveType);
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);

    }
}

