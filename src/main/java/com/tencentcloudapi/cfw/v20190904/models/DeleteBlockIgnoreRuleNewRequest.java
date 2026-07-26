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

public class DeleteBlockIgnoreRuleNewRequest extends AbstractModel {

    /**
    * 删除模式，必传且只接受整数 0 或 1。0 表示按 Rules 中的 RuleType 与 Ioc 删除匹配记录；1 表示按 ShowType 清空对应列表，其中 blocklist 删除全部 RuleType=1 记录，whitelist 删除全部 RuleType>=2 记录，风险极高。
    */
    @SerializedName("DeleteAll")
    @Expose
    private Long DeleteAll;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * 可省略。当前处理逻辑不读取该顶层字段；传入值不参与精确删除或整表删除的目标选择。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 待删除规则列表。DeleteAll=0 时必填，每项删除所有与 RuleType、Ioc 匹配的记录；DirectionList 不参与目标匹配，但 RuleType=1、2、3 时必须使用 DescribeBlockIgnoreList 返回的完整方向列表。同一请求混合 RuleType 时，引擎更新使用最后一项的 RuleType。DeleteAll=1 时省略。
    */
    @SerializedName("Rules")
    @Expose
    private BanAndAllowRuleDel [] Rules;

    /**
    * 列表类型，处理时必传且只接受 blocklist 或 whitelist。DeleteAll=1 时，blocklist 选择全部 RuleType=1 记录，whitelist 选择全部 RuleType>=2 记录；DeleteAll=0 时该字段仅校验取值，不限制 Rules 指定的删除目标。
    */
    @SerializedName("ShowType")
    @Expose
    private String ShowType;

    /**
     * Get 删除模式，必传且只接受整数 0 或 1。0 表示按 Rules 中的 RuleType 与 Ioc 删除匹配记录；1 表示按 ShowType 清空对应列表，其中 blocklist 删除全部 RuleType=1 记录，whitelist 删除全部 RuleType>=2 记录，风险极高。 
     * @return DeleteAll 删除模式，必传且只接受整数 0 或 1。0 表示按 Rules 中的 RuleType 与 Ioc 删除匹配记录；1 表示按 ShowType 清空对应列表，其中 blocklist 删除全部 RuleType=1 记录，whitelist 删除全部 RuleType>=2 记录，风险极高。
     */
    public Long getDeleteAll() {
        return this.DeleteAll;
    }

    /**
     * Set 删除模式，必传且只接受整数 0 或 1。0 表示按 Rules 中的 RuleType 与 Ioc 删除匹配记录；1 表示按 ShowType 清空对应列表，其中 blocklist 删除全部 RuleType=1 记录，whitelist 删除全部 RuleType>=2 记录，风险极高。
     * @param DeleteAll 删除模式，必传且只接受整数 0 或 1。0 表示按 Rules 中的 RuleType 与 Ioc 删除匹配记录；1 表示按 ShowType 清空对应列表，其中 blocklist 删除全部 RuleType=1 记录，whitelist 删除全部 RuleType>=2 记录，风险极高。
     */
    public void setDeleteAll(Long DeleteAll) {
        this.DeleteAll = DeleteAll;
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
     * Get 可省略。当前处理逻辑不读取该顶层字段；传入值不参与精确删除或整表删除的目标选择。 
     * @return RuleType 可省略。当前处理逻辑不读取该顶层字段；传入值不参与精确删除或整表删除的目标选择。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 可省略。当前处理逻辑不读取该顶层字段；传入值不参与精确删除或整表删除的目标选择。
     * @param RuleType 可省略。当前处理逻辑不读取该顶层字段；传入值不参与精确删除或整表删除的目标选择。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 待删除规则列表。DeleteAll=0 时必填，每项删除所有与 RuleType、Ioc 匹配的记录；DirectionList 不参与目标匹配，但 RuleType=1、2、3 时必须使用 DescribeBlockIgnoreList 返回的完整方向列表。同一请求混合 RuleType 时，引擎更新使用最后一项的 RuleType。DeleteAll=1 时省略。 
     * @return Rules 待删除规则列表。DeleteAll=0 时必填，每项删除所有与 RuleType、Ioc 匹配的记录；DirectionList 不参与目标匹配，但 RuleType=1、2、3 时必须使用 DescribeBlockIgnoreList 返回的完整方向列表。同一请求混合 RuleType 时，引擎更新使用最后一项的 RuleType。DeleteAll=1 时省略。
     */
    public BanAndAllowRuleDel [] getRules() {
        return this.Rules;
    }

    /**
     * Set 待删除规则列表。DeleteAll=0 时必填，每项删除所有与 RuleType、Ioc 匹配的记录；DirectionList 不参与目标匹配，但 RuleType=1、2、3 时必须使用 DescribeBlockIgnoreList 返回的完整方向列表。同一请求混合 RuleType 时，引擎更新使用最后一项的 RuleType。DeleteAll=1 时省略。
     * @param Rules 待删除规则列表。DeleteAll=0 时必填，每项删除所有与 RuleType、Ioc 匹配的记录；DirectionList 不参与目标匹配，但 RuleType=1、2、3 时必须使用 DescribeBlockIgnoreList 返回的完整方向列表。同一请求混合 RuleType 时，引擎更新使用最后一项的 RuleType。DeleteAll=1 时省略。
     */
    public void setRules(BanAndAllowRuleDel [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 列表类型，处理时必传且只接受 blocklist 或 whitelist。DeleteAll=1 时，blocklist 选择全部 RuleType=1 记录，whitelist 选择全部 RuleType>=2 记录；DeleteAll=0 时该字段仅校验取值，不限制 Rules 指定的删除目标。 
     * @return ShowType 列表类型，处理时必传且只接受 blocklist 或 whitelist。DeleteAll=1 时，blocklist 选择全部 RuleType=1 记录，whitelist 选择全部 RuleType>=2 记录；DeleteAll=0 时该字段仅校验取值，不限制 Rules 指定的删除目标。
     */
    public String getShowType() {
        return this.ShowType;
    }

    /**
     * Set 列表类型，处理时必传且只接受 blocklist 或 whitelist。DeleteAll=1 时，blocklist 选择全部 RuleType=1 记录，whitelist 选择全部 RuleType>=2 记录；DeleteAll=0 时该字段仅校验取值，不限制 Rules 指定的删除目标。
     * @param ShowType 列表类型，处理时必传且只接受 blocklist 或 whitelist。DeleteAll=1 时，blocklist 选择全部 RuleType=1 记录，whitelist 选择全部 RuleType>=2 记录；DeleteAll=0 时该字段仅校验取值，不限制 Rules 指定的删除目标。
     */
    public void setShowType(String ShowType) {
        this.ShowType = ShowType;
    }

    public DeleteBlockIgnoreRuleNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBlockIgnoreRuleNewRequest(DeleteBlockIgnoreRuleNewRequest source) {
        if (source.DeleteAll != null) {
            this.DeleteAll = new Long(source.DeleteAll);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Rules != null) {
            this.Rules = new BanAndAllowRuleDel[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BanAndAllowRuleDel(source.Rules[i]);
            }
        }
        if (source.ShowType != null) {
            this.ShowType = new String(source.ShowType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeleteAll", this.DeleteAll);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ShowType", this.ShowType);

    }
}

