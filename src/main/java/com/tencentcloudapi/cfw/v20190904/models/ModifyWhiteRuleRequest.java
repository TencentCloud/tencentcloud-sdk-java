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

public class ModifyWhiteRuleRequest extends AbstractModel {

    /**
    * JSON object，提交完整策略。将 DescribeWhiteRule.Data[].WhiteId 写入 Rule.Info.WhiteId；RuleName、FwType、EndTime、Comment、Info 按本次请求整体保存，Id 和 IdsRuleName 由服务端管理。
    */
    @SerializedName("Rule")
    @Expose
    private IdsWhiteRule Rule;

    /**
    * 使用 JSON integer，沿用 DescribeWhiteRule.Data[].RuleType：
- 2 精确外部 IP：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 3 域名。
- 4 威胁情报。
- 5 资产：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 6 IPS 自定义：Rule.Info.IdsRuleId 必填，Rule.Info.SrcIP、Rule.Info.DstIP 至少一项为具体 IP；Rule.FwType=16 时目的 IPv4 可带端口；Rule.FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rule.Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：Rule.FwType=16，Rule.Info 至少包含一个 NDR 专属条件；搭配 IdsRuleId 时同时填写 Rule.Info.SrcIP 或 Rule.Info.DstIP。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁；1 表示删除同 IP、同方向冲突封禁后保存，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。
    */
    @SerializedName("CoverDuplicate")
    @Expose
    private Long CoverDuplicate;

    /**
     * Get JSON object，提交完整策略。将 DescribeWhiteRule.Data[].WhiteId 写入 Rule.Info.WhiteId；RuleName、FwType、EndTime、Comment、Info 按本次请求整体保存，Id 和 IdsRuleName 由服务端管理。 
     * @return Rule JSON object，提交完整策略。将 DescribeWhiteRule.Data[].WhiteId 写入 Rule.Info.WhiteId；RuleName、FwType、EndTime、Comment、Info 按本次请求整体保存，Id 和 IdsRuleName 由服务端管理。
     */
    public IdsWhiteRule getRule() {
        return this.Rule;
    }

    /**
     * Set JSON object，提交完整策略。将 DescribeWhiteRule.Data[].WhiteId 写入 Rule.Info.WhiteId；RuleName、FwType、EndTime、Comment、Info 按本次请求整体保存，Id 和 IdsRuleName 由服务端管理。
     * @param Rule JSON object，提交完整策略。将 DescribeWhiteRule.Data[].WhiteId 写入 Rule.Info.WhiteId；RuleName、FwType、EndTime、Comment、Info 按本次请求整体保存，Id 和 IdsRuleName 由服务端管理。
     */
    public void setRule(IdsWhiteRule Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 使用 JSON integer，沿用 DescribeWhiteRule.Data[].RuleType：
- 2 精确外部 IP：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 3 域名。
- 4 威胁情报。
- 5 资产：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 6 IPS 自定义：Rule.Info.IdsRuleId 必填，Rule.Info.SrcIP、Rule.Info.DstIP 至少一项为具体 IP；Rule.FwType=16 时目的 IPv4 可带端口；Rule.FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rule.Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：Rule.FwType=16，Rule.Info 至少包含一个 NDR 专属条件；搭配 IdsRuleId 时同时填写 Rule.Info.SrcIP 或 Rule.Info.DstIP。 
     * @return RuleType 使用 JSON integer，沿用 DescribeWhiteRule.Data[].RuleType：
- 2 精确外部 IP：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 3 域名。
- 4 威胁情报。
- 5 资产：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 6 IPS 自定义：Rule.Info.IdsRuleId 必填，Rule.Info.SrcIP、Rule.Info.DstIP 至少一项为具体 IP；Rule.FwType=16 时目的 IPv4 可带端口；Rule.FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rule.Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：Rule.FwType=16，Rule.Info 至少包含一个 NDR 专属条件；搭配 IdsRuleId 时同时填写 Rule.Info.SrcIP 或 Rule.Info.DstIP。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 使用 JSON integer，沿用 DescribeWhiteRule.Data[].RuleType：
- 2 精确外部 IP：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 3 域名。
- 4 威胁情报。
- 5 资产：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 6 IPS 自定义：Rule.Info.IdsRuleId 必填，Rule.Info.SrcIP、Rule.Info.DstIP 至少一项为具体 IP；Rule.FwType=16 时目的 IPv4 可带端口；Rule.FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rule.Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：Rule.FwType=16，Rule.Info 至少包含一个 NDR 专属条件；搭配 IdsRuleId 时同时填写 Rule.Info.SrcIP 或 Rule.Info.DstIP。
     * @param RuleType 使用 JSON integer，沿用 DescribeWhiteRule.Data[].RuleType：
- 2 精确外部 IP：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 3 域名。
- 4 威胁情报。
- 5 资产：Rule.Info.SrcIP、Rule.Info.DstIP 两个字段中恰好填写一个。
- 6 IPS 自定义：Rule.Info.IdsRuleId 必填，Rule.Info.SrcIP、Rule.Info.DstIP 至少一项为具体 IP；Rule.FwType=16 时目的 IPv4 可带端口；Rule.FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rule.Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：Rule.FwType=16，Rule.Info 至少包含一个 NDR 专属条件；搭配 IdsRuleId 时同时填写 Rule.Info.SrcIP 或 Rule.Info.DstIP。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁；1 表示删除同 IP、同方向冲突封禁后保存，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。 
     * @return CoverDuplicate 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁；1 表示删除同 IP、同方向冲突封禁后保存，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。
     */
    public Long getCoverDuplicate() {
        return this.CoverDuplicate;
    }

    /**
     * Set 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁；1 表示删除同 IP、同方向冲突封禁后保存，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。
     * @param CoverDuplicate 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁；1 表示删除同 IP、同方向冲突封禁后保存，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。
     */
    public void setCoverDuplicate(Long CoverDuplicate) {
        this.CoverDuplicate = CoverDuplicate;
    }

    public ModifyWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWhiteRuleRequest(ModifyWhiteRuleRequest source) {
        if (source.Rule != null) {
            this.Rule = new IdsWhiteRule(source.Rule);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.CoverDuplicate != null) {
            this.CoverDuplicate = new Long(source.CoverDuplicate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "CoverDuplicate", this.CoverDuplicate);

    }
}

