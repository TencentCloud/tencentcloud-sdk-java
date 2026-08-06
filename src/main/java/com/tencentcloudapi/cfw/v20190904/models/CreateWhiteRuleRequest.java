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

public class CreateWhiteRuleRequest extends AbstractModel {

    /**
    * 使用 JSON integer 表示白名单类型，一次请求使用一种：
- 2 精确外部 IP：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个。
- 3 域名：填写 Rules[].Info.Ioc。
- 4 威胁情报：填写 Rules[].Info.Ioc，FwType=1。
- 5 资产：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个，值取 DescribeCfwAssets 的 instance_id。
- 6 IPS 自定义：Rules[].Info.IdsRuleId 必填，Rules[].Info.SrcIP、Rules[].Info.DstIP 至少一项为具体 IP；FwType=16 时目的 IPv4 可带端口；FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rules[].Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：FwType=16，Rules[].Info 至少填写一个 UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5；可组合 SrcIP、DstIP，搭配 IdsRuleId 时同时填写 SrcIP 或 DstIP。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * JSON object 数组，至少一项；每项填写 1–50 个字符的 RuleName，且同一请求内名称唯一。列表内共用一个 RuleType，不同类型分次调用。Rules[].Info 多值字段按笛卡尔积展开，一次请求展开后最多 100 条。WhiteId 由服务端生成，Id 和 IdsRuleName 由服务端管理。
    */
    @SerializedName("Rules")
    @Expose
    private IdsWhiteRule [] Rules;

    /**
    * 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁并跳过冲突项；1 表示删除同 IP、同方向冲突封禁后创建白名单，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。
    */
    @SerializedName("CoverDuplicate")
    @Expose
    private Long CoverDuplicate;

    /**
     * Get 使用 JSON integer 表示白名单类型，一次请求使用一种：
- 2 精确外部 IP：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个。
- 3 域名：填写 Rules[].Info.Ioc。
- 4 威胁情报：填写 Rules[].Info.Ioc，FwType=1。
- 5 资产：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个，值取 DescribeCfwAssets 的 instance_id。
- 6 IPS 自定义：Rules[].Info.IdsRuleId 必填，Rules[].Info.SrcIP、Rules[].Info.DstIP 至少一项为具体 IP；FwType=16 时目的 IPv4 可带端口；FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rules[].Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：FwType=16，Rules[].Info 至少填写一个 UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5；可组合 SrcIP、DstIP，搭配 IdsRuleId 时同时填写 SrcIP 或 DstIP。 
     * @return RuleType 使用 JSON integer 表示白名单类型，一次请求使用一种：
- 2 精确外部 IP：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个。
- 3 域名：填写 Rules[].Info.Ioc。
- 4 威胁情报：填写 Rules[].Info.Ioc，FwType=1。
- 5 资产：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个，值取 DescribeCfwAssets 的 instance_id。
- 6 IPS 自定义：Rules[].Info.IdsRuleId 必填，Rules[].Info.SrcIP、Rules[].Info.DstIP 至少一项为具体 IP；FwType=16 时目的 IPv4 可带端口；FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rules[].Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：FwType=16，Rules[].Info 至少填写一个 UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5；可组合 SrcIP、DstIP，搭配 IdsRuleId 时同时填写 SrcIP 或 DstIP。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 使用 JSON integer 表示白名单类型，一次请求使用一种：
- 2 精确外部 IP：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个。
- 3 域名：填写 Rules[].Info.Ioc。
- 4 威胁情报：填写 Rules[].Info.Ioc，FwType=1。
- 5 资产：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个，值取 DescribeCfwAssets 的 instance_id。
- 6 IPS 自定义：Rules[].Info.IdsRuleId 必填，Rules[].Info.SrcIP、Rules[].Info.DstIP 至少一项为具体 IP；FwType=16 时目的 IPv4 可带端口；FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rules[].Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：FwType=16，Rules[].Info 至少填写一个 UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5；可组合 SrcIP、DstIP，搭配 IdsRuleId 时同时填写 SrcIP 或 DstIP。
     * @param RuleType 使用 JSON integer 表示白名单类型，一次请求使用一种：
- 2 精确外部 IP：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个。
- 3 域名：填写 Rules[].Info.Ioc。
- 4 威胁情报：填写 Rules[].Info.Ioc，FwType=1。
- 5 资产：Rules[].Info.SrcIP、Rules[].Info.DstIP 两个字段中恰好填写一个，值取 DescribeCfwAssets 的 instance_id。
- 6 IPS 自定义：Rules[].Info.IdsRuleId 必填，Rules[].Info.SrcIP、Rules[].Info.DstIP 至少一项为具体 IP；FwType=16 时目的 IPv4 可带端口；FwType 包含 1 时具体 IP 至少一项属于当前账号资产。
- 8 IP 扩展：在 Rules[].Info 中填写 CIDR、端口或源/目的组合。
- 9 NDR 扩展：FwType=16，Rules[].Info 至少填写一个 UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5；可组合 SrcIP、DstIP，搭配 IdsRuleId 时同时填写 SrcIP 或 DstIP。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get JSON object 数组，至少一项；每项填写 1–50 个字符的 RuleName，且同一请求内名称唯一。列表内共用一个 RuleType，不同类型分次调用。Rules[].Info 多值字段按笛卡尔积展开，一次请求展开后最多 100 条。WhiteId 由服务端生成，Id 和 IdsRuleName 由服务端管理。 
     * @return Rules JSON object 数组，至少一项；每项填写 1–50 个字符的 RuleName，且同一请求内名称唯一。列表内共用一个 RuleType，不同类型分次调用。Rules[].Info 多值字段按笛卡尔积展开，一次请求展开后最多 100 条。WhiteId 由服务端生成，Id 和 IdsRuleName 由服务端管理。
     */
    public IdsWhiteRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set JSON object 数组，至少一项；每项填写 1–50 个字符的 RuleName，且同一请求内名称唯一。列表内共用一个 RuleType，不同类型分次调用。Rules[].Info 多值字段按笛卡尔积展开，一次请求展开后最多 100 条。WhiteId 由服务端生成，Id 和 IdsRuleName 由服务端管理。
     * @param Rules JSON object 数组，至少一项；每项填写 1–50 个字符的 RuleName，且同一请求内名称唯一。列表内共用一个 RuleType，不同类型分次调用。Rules[].Info 多值字段按笛卡尔积展开，一次请求展开后最多 100 条。WhiteId 由服务端生成，Id 和 IdsRuleName 由服务端管理。
     */
    public void setRules(IdsWhiteRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁并跳过冲突项；1 表示删除同 IP、同方向冲突封禁后创建白名单，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。 
     * @return CoverDuplicate 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁并跳过冲突项；1 表示删除同 IP、同方向冲突封禁后创建白名单，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。
     */
    public Long getCoverDuplicate() {
        return this.CoverDuplicate;
    }

    /**
     * Set 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁并跳过冲突项；1 表示删除同 IP、同方向冲突封禁后创建白名单，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。
     * @param CoverDuplicate 使用 JSON integer。仅 RuleType=2 使用：0 或省略表示保留冲突封禁并跳过冲突项；1 表示删除同 IP、同方向冲突封禁后创建白名单，选择 1 前先确认该删除操作。其它 RuleType 省略本参数。
     */
    public void setCoverDuplicate(Long CoverDuplicate) {
        this.CoverDuplicate = CoverDuplicate;
    }

    public CreateWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWhiteRuleRequest(CreateWhiteRuleRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Rules != null) {
            this.Rules = new IdsWhiteRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new IdsWhiteRule(source.Rules[i]);
            }
        }
        if (source.CoverDuplicate != null) {
            this.CoverDuplicate = new Long(source.CoverDuplicate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CoverDuplicate", this.CoverDuplicate);

    }
}

