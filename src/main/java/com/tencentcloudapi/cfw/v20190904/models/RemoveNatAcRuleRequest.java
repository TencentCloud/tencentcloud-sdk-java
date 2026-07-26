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

public class RemoveNatAcRuleRequest extends AbstractModel {

    /**
    * <p>NAT 边界访问控制规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=nat 和目标 RuleUuid，并使用返回的 rules[].uuid。数组仅含 -1 时删除 Direction 指定方向下当前账号的全部可操作规则，风险极高；其它数组按 ID 删除。至少匹配一条即成功；具体 ID 删除不按 Direction 筛选。成功响应回显请求中的 ID 列表。</p>
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long [] RuleUuid;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>规则方向：1 表示入站，0 表示出站。仅 RuleUuid 恰好为 [-1] 时用于选择全删方向；按具体 ID 删除时可省略，Direction 不参与 ID 筛选。全删时必须使用 0 或 1。</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get <p>NAT 边界访问控制规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=nat 和目标 RuleUuid，并使用返回的 rules[].uuid。数组仅含 -1 时删除 Direction 指定方向下当前账号的全部可操作规则，风险极高；其它数组按 ID 删除。至少匹配一条即成功；具体 ID 删除不按 Direction 筛选。成功响应回显请求中的 ID 列表。</p> 
     * @return RuleUuid <p>NAT 边界访问控制规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=nat 和目标 RuleUuid，并使用返回的 rules[].uuid。数组仅含 -1 时删除 Direction 指定方向下当前账号的全部可操作规则，风险极高；其它数组按 ID 删除。至少匹配一条即成功；具体 ID 删除不按 Direction 筛选。成功响应回显请求中的 ID 列表。</p>
     */
    public Long [] getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set <p>NAT 边界访问控制规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=nat 和目标 RuleUuid，并使用返回的 rules[].uuid。数组仅含 -1 时删除 Direction 指定方向下当前账号的全部可操作规则，风险极高；其它数组按 ID 删除。至少匹配一条即成功；具体 ID 删除不按 Direction 筛选。成功响应回显请求中的 ID 列表。</p>
     * @param RuleUuid <p>NAT 边界访问控制规则 ID 列表。具体规则 ID 通过 DescribeCfwRules 查询 RuleType=nat 和目标 RuleUuid，并使用返回的 rules[].uuid。数组仅含 -1 时删除 Direction 指定方向下当前账号的全部可操作规则，风险极高；其它数组按 ID 删除。至少匹配一条即成功；具体 ID 删除不按 Direction 筛选。成功响应回显请求中的 ID 列表。</p>
     */
    public void setRuleUuid(Long [] RuleUuid) {
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

    /**
     * Get <p>规则方向：1 表示入站，0 表示出站。仅 RuleUuid 恰好为 [-1] 时用于选择全删方向；按具体 ID 删除时可省略，Direction 不参与 ID 筛选。全删时必须使用 0 或 1。</p> 
     * @return Direction <p>规则方向：1 表示入站，0 表示出站。仅 RuleUuid 恰好为 [-1] 时用于选择全删方向；按具体 ID 删除时可省略，Direction 不参与 ID 筛选。全删时必须使用 0 或 1。</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>规则方向：1 表示入站，0 表示出站。仅 RuleUuid 恰好为 [-1] 时用于选择全删方向；按具体 ID 删除时可省略，Direction 不参与 ID 筛选。全删时必须使用 0 或 1。</p>
     * @param Direction <p>规则方向：1 表示入站，0 表示出站。仅 RuleUuid 恰好为 [-1] 时用于选择全删方向；按具体 ID 删除时可省略，Direction 不参与 ID 筛选。全删时必须使用 0 或 1。</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public RemoveNatAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveNatAcRuleRequest(RemoveNatAcRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long[source.RuleUuid.length];
            for (int i = 0; i < source.RuleUuid.length; i++) {
                this.RuleUuid[i] = new Long(source.RuleUuid[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleUuid.", this.RuleUuid);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

