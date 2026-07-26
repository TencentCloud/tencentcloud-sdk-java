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

public class CreateBlockIgnoreRuleNewRequest extends AbstractModel {

    /**
    * 规则类型：1 IP 封禁，2 IP 放通，3 域名放通，4 情报放通，5 资产放通，6 自定义放通。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 待新增规则列表；可为空，空数组返回成功且不新增规则。
    */
    @SerializedName("Rules")
    @Expose
    private BanAndAllowRule [] Rules;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * 互斥列表冲突处理，仅 RuleType=1 或 2 生效。0 表示保留已有互斥规则并跳过冲突新增项；1 表示保留新增项并删除同 IP、同方向的互斥规则；省略时不处理互斥冲突。填写本字段时，同一请求内相同 Ioc 会合并为一项，DirectionList 按输入顺序合并，时间和备注采用首次出现项的值。已有同类型、同 Ioc 规则的方向会与本次方向合并，其它字段按本次请求更新。
    */
    @SerializedName("CoverDuplicate")
    @Expose
    private Long CoverDuplicate;

    /**
     * Get 规则类型：1 IP 封禁，2 IP 放通，3 域名放通，4 情报放通，5 资产放通，6 自定义放通。 
     * @return RuleType 规则类型：1 IP 封禁，2 IP 放通，3 域名放通，4 情报放通，5 资产放通，6 自定义放通。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：1 IP 封禁，2 IP 放通，3 域名放通，4 情报放通，5 资产放通，6 自定义放通。
     * @param RuleType 规则类型：1 IP 封禁，2 IP 放通，3 域名放通，4 情报放通，5 资产放通，6 自定义放通。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 待新增规则列表；可为空，空数组返回成功且不新增规则。 
     * @return Rules 待新增规则列表；可为空，空数组返回成功且不新增规则。
     */
    public BanAndAllowRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 待新增规则列表；可为空，空数组返回成功且不新增规则。
     * @param Rules 待新增规则列表；可为空，空数组返回成功且不新增规则。
     */
    public void setRules(BanAndAllowRule [] Rules) {
        this.Rules = Rules;
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
     * Get 互斥列表冲突处理，仅 RuleType=1 或 2 生效。0 表示保留已有互斥规则并跳过冲突新增项；1 表示保留新增项并删除同 IP、同方向的互斥规则；省略时不处理互斥冲突。填写本字段时，同一请求内相同 Ioc 会合并为一项，DirectionList 按输入顺序合并，时间和备注采用首次出现项的值。已有同类型、同 Ioc 规则的方向会与本次方向合并，其它字段按本次请求更新。 
     * @return CoverDuplicate 互斥列表冲突处理，仅 RuleType=1 或 2 生效。0 表示保留已有互斥规则并跳过冲突新增项；1 表示保留新增项并删除同 IP、同方向的互斥规则；省略时不处理互斥冲突。填写本字段时，同一请求内相同 Ioc 会合并为一项，DirectionList 按输入顺序合并，时间和备注采用首次出现项的值。已有同类型、同 Ioc 规则的方向会与本次方向合并，其它字段按本次请求更新。
     */
    public Long getCoverDuplicate() {
        return this.CoverDuplicate;
    }

    /**
     * Set 互斥列表冲突处理，仅 RuleType=1 或 2 生效。0 表示保留已有互斥规则并跳过冲突新增项；1 表示保留新增项并删除同 IP、同方向的互斥规则；省略时不处理互斥冲突。填写本字段时，同一请求内相同 Ioc 会合并为一项，DirectionList 按输入顺序合并，时间和备注采用首次出现项的值。已有同类型、同 Ioc 规则的方向会与本次方向合并，其它字段按本次请求更新。
     * @param CoverDuplicate 互斥列表冲突处理，仅 RuleType=1 或 2 生效。0 表示保留已有互斥规则并跳过冲突新增项；1 表示保留新增项并删除同 IP、同方向的互斥规则；省略时不处理互斥冲突。填写本字段时，同一请求内相同 Ioc 会合并为一项，DirectionList 按输入顺序合并，时间和备注采用首次出现项的值。已有同类型、同 Ioc 规则的方向会与本次方向合并，其它字段按本次请求更新。
     */
    public void setCoverDuplicate(Long CoverDuplicate) {
        this.CoverDuplicate = CoverDuplicate;
    }

    public CreateBlockIgnoreRuleNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlockIgnoreRuleNewRequest(CreateBlockIgnoreRuleNewRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Rules != null) {
            this.Rules = new BanAndAllowRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BanAndAllowRule(source.Rules[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
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
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "CoverDuplicate", this.CoverDuplicate);

    }
}

