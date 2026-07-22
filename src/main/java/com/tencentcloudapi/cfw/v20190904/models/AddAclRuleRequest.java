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

public class AddAclRuleRequest extends AbstractModel {

    /**
    * 待添加的互联网边界规则列表，不能为空。每条规则都解析并校验方向、源目的、动作、范围、协议端口和模板；整个请求还会校验规则配额及可下发规则数量。批量覆盖的删除方向例外地只取首条规则。
    */
    @SerializedName("Rules")
    @Expose
    private CreateRuleItem [] Rules;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * 添加方式。省略或空字符串执行普通新增；insert_rule 标记为指定位置新增；batch_import 标记为批量导入；batch_import_cover 执行覆盖导入，在独立事务中先删除首条规则 Direction 对应的当前账号可操作分区旧规则，再插入 Rules；删除提交后，插入失败不会恢复旧规则。覆盖导入不会校验 Rules 的 Direction 全部相同，删除范围仍只由首条规则决定。其它字符串未由入口统一拒绝，但不属于本接口定义的支持合同，调用方不得依赖其行为。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get 待添加的互联网边界规则列表，不能为空。每条规则都解析并校验方向、源目的、动作、范围、协议端口和模板；整个请求还会校验规则配额及可下发规则数量。批量覆盖的删除方向例外地只取首条规则。 
     * @return Rules 待添加的互联网边界规则列表，不能为空。每条规则都解析并校验方向、源目的、动作、范围、协议端口和模板；整个请求还会校验规则配额及可下发规则数量。批量覆盖的删除方向例外地只取首条规则。
     */
    public CreateRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set 待添加的互联网边界规则列表，不能为空。每条规则都解析并校验方向、源目的、动作、范围、协议端口和模板；整个请求还会校验规则配额及可下发规则数量。批量覆盖的删除方向例外地只取首条规则。
     * @param Rules 待添加的互联网边界规则列表，不能为空。每条规则都解析并校验方向、源目的、动作、范围、协议端口和模板；整个请求还会校验规则配额及可下发规则数量。批量覆盖的删除方向例外地只取首条规则。
     */
    public void setRules(CreateRuleItem [] Rules) {
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
     * Get 添加方式。省略或空字符串执行普通新增；insert_rule 标记为指定位置新增；batch_import 标记为批量导入；batch_import_cover 执行覆盖导入，在独立事务中先删除首条规则 Direction 对应的当前账号可操作分区旧规则，再插入 Rules；删除提交后，插入失败不会恢复旧规则。覆盖导入不会校验 Rules 的 Direction 全部相同，删除范围仍只由首条规则决定。其它字符串未由入口统一拒绝，但不属于本接口定义的支持合同，调用方不得依赖其行为。 
     * @return From 添加方式。省略或空字符串执行普通新增；insert_rule 标记为指定位置新增；batch_import 标记为批量导入；batch_import_cover 执行覆盖导入，在独立事务中先删除首条规则 Direction 对应的当前账号可操作分区旧规则，再插入 Rules；删除提交后，插入失败不会恢复旧规则。覆盖导入不会校验 Rules 的 Direction 全部相同，删除范围仍只由首条规则决定。其它字符串未由入口统一拒绝，但不属于本接口定义的支持合同，调用方不得依赖其行为。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 添加方式。省略或空字符串执行普通新增；insert_rule 标记为指定位置新增；batch_import 标记为批量导入；batch_import_cover 执行覆盖导入，在独立事务中先删除首条规则 Direction 对应的当前账号可操作分区旧规则，再插入 Rules；删除提交后，插入失败不会恢复旧规则。覆盖导入不会校验 Rules 的 Direction 全部相同，删除范围仍只由首条规则决定。其它字符串未由入口统一拒绝，但不属于本接口定义的支持合同，调用方不得依赖其行为。
     * @param From 添加方式。省略或空字符串执行普通新增；insert_rule 标记为指定位置新增；batch_import 标记为批量导入；batch_import_cover 执行覆盖导入，在独立事务中先删除首条规则 Direction 对应的当前账号可操作分区旧规则，再插入 Rules；删除提交后，插入失败不会恢复旧规则。覆盖导入不会校验 Rules 的 Direction 全部相同，删除范围仍只由首条规则决定。其它字符串未由入口统一拒绝，但不属于本接口定义的支持合同，调用方不得依赖其行为。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    public AddAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAclRuleRequest(AddAclRuleRequest source) {
        if (source.Rules != null) {
            this.Rules = new CreateRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new CreateRuleItem(source.Rules[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "From", this.From);

    }
}

