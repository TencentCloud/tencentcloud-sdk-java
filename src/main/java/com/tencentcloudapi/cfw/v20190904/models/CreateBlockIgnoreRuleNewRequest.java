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
    * <p>非自定义类型规则列表</p>
    */
    @SerializedName("Rules")
    @Expose
    private BanAndAllowRule [] Rules;

    /**
    * <p>RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>删除白名单冲突地址并继续添加/删除封禁列表冲突地址并继续添加；表示是否覆盖重复数据，1为覆盖，非1不覆盖，跳过重复数据</p>
    */
    @SerializedName("CoverDuplicate")
    @Expose
    private Long CoverDuplicate;

    /**
     * Get <p>非自定义类型规则列表</p> 
     * @return Rules <p>非自定义类型规则列表</p>
     */
    public BanAndAllowRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>非自定义类型规则列表</p>
     * @param Rules <p>非自定义类型规则列表</p>
     */
    public void setRules(BanAndAllowRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则</p> 
     * @return RuleType <p>RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则</p>
     * @param RuleType <p>RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul> 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>删除白名单冲突地址并继续添加/删除封禁列表冲突地址并继续添加；表示是否覆盖重复数据，1为覆盖，非1不覆盖，跳过重复数据</p> 
     * @return CoverDuplicate <p>删除白名单冲突地址并继续添加/删除封禁列表冲突地址并继续添加；表示是否覆盖重复数据，1为覆盖，非1不覆盖，跳过重复数据</p>
     */
    public Long getCoverDuplicate() {
        return this.CoverDuplicate;
    }

    /**
     * Set <p>删除白名单冲突地址并继续添加/删除封禁列表冲突地址并继续添加；表示是否覆盖重复数据，1为覆盖，非1不覆盖，跳过重复数据</p>
     * @param CoverDuplicate <p>删除白名单冲突地址并继续添加/删除封禁列表冲突地址并继续添加；表示是否覆盖重复数据，1为覆盖，非1不覆盖，跳过重复数据</p>
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
        if (source.Rules != null) {
            this.Rules = new BanAndAllowRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BanAndAllowRule(source.Rules[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
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
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "CoverDuplicate", this.CoverDuplicate);

    }
}

