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

public class RemoveVpcAcRuleRequest extends AbstractModel {

    /**
    * <p>待删除规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=vpc 和目标 RuleUuid，并使用返回的 rules[].uuid。数组恰为 [-1] 时删除当前账号中 IpVersion 指定版本的全部可操作规则，风险极高；其它数组按 ID 批量删除。具体 ID 删除忽略 IpVersion；至少匹配一条即成功，全部未找到时返回 ResourceNotFound。成功响应回显请求中的 ID 列表。</p>
    */
    @SerializedName("RuleUuids")
    @Expose
    private Long [] RuleUuids;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>IP 版本，仅 RuleUuids 恰为 [-1] 时生效：1 表示 IPv6，0、省略或其它整数表示 IPv4。按具体规则 ID 删除时忽略。</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
     * Get <p>待删除规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=vpc 和目标 RuleUuid，并使用返回的 rules[].uuid。数组恰为 [-1] 时删除当前账号中 IpVersion 指定版本的全部可操作规则，风险极高；其它数组按 ID 批量删除。具体 ID 删除忽略 IpVersion；至少匹配一条即成功，全部未找到时返回 ResourceNotFound。成功响应回显请求中的 ID 列表。</p> 
     * @return RuleUuids <p>待删除规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=vpc 和目标 RuleUuid，并使用返回的 rules[].uuid。数组恰为 [-1] 时删除当前账号中 IpVersion 指定版本的全部可操作规则，风险极高；其它数组按 ID 批量删除。具体 ID 删除忽略 IpVersion；至少匹配一条即成功，全部未找到时返回 ResourceNotFound。成功响应回显请求中的 ID 列表。</p>
     */
    public Long [] getRuleUuids() {
        return this.RuleUuids;
    }

    /**
     * Set <p>待删除规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=vpc 和目标 RuleUuid，并使用返回的 rules[].uuid。数组恰为 [-1] 时删除当前账号中 IpVersion 指定版本的全部可操作规则，风险极高；其它数组按 ID 批量删除。具体 ID 删除忽略 IpVersion；至少匹配一条即成功，全部未找到时返回 ResourceNotFound。成功响应回显请求中的 ID 列表。</p>
     * @param RuleUuids <p>待删除规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=vpc 和目标 RuleUuid，并使用返回的 rules[].uuid。数组恰为 [-1] 时删除当前账号中 IpVersion 指定版本的全部可操作规则，风险极高；其它数组按 ID 批量删除。具体 ID 删除忽略 IpVersion；至少匹配一条即成功，全部未找到时返回 ResourceNotFound。成功响应回显请求中的 ID 列表。</p>
     */
    public void setRuleUuids(Long [] RuleUuids) {
        this.RuleUuids = RuleUuids;
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

    /**
     * Get <p>IP 版本，仅 RuleUuids 恰为 [-1] 时生效：1 表示 IPv6，0、省略或其它整数表示 IPv4。按具体规则 ID 删除时忽略。</p> 
     * @return IpVersion <p>IP 版本，仅 RuleUuids 恰为 [-1] 时生效：1 表示 IPv6，0、省略或其它整数表示 IPv4。按具体规则 ID 删除时忽略。</p>
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>IP 版本，仅 RuleUuids 恰为 [-1] 时生效：1 表示 IPv6，0、省略或其它整数表示 IPv4。按具体规则 ID 删除时忽略。</p>
     * @param IpVersion <p>IP 版本，仅 RuleUuids 恰为 [-1] 时生效：1 表示 IPv6，0、省略或其它整数表示 IPv4。按具体规则 ID 删除时忽略。</p>
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    public RemoveVpcAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveVpcAcRuleRequest(RemoveVpcAcRuleRequest source) {
        if (source.RuleUuids != null) {
            this.RuleUuids = new Long[source.RuleUuids.length];
            for (int i = 0; i < source.RuleUuids.length; i++) {
                this.RuleUuids[i] = new Long(source.RuleUuids[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleUuids.", this.RuleUuids);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

