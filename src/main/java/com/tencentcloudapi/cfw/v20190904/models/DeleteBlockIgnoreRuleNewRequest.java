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
    * <p>是否删除全部</p>
    */
    @SerializedName("DeleteAll")
    @Expose
    private Long DeleteAll;

    /**
    * <p>blocklist 封禁列表 whitelist 白名单列表</p>
    */
    @SerializedName("ShowType")
    @Expose
    private String ShowType;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>规则列表</p>
    */
    @SerializedName("Rules")
    @Expose
    private BanAndAllowRuleDel [] Rules;

    /**
    * <p>封禁：1，放通：100，<br>主要用于全部删除时区分列表类型</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
     * Get <p>是否删除全部</p> 
     * @return DeleteAll <p>是否删除全部</p>
     */
    public Long getDeleteAll() {
        return this.DeleteAll;
    }

    /**
     * Set <p>是否删除全部</p>
     * @param DeleteAll <p>是否删除全部</p>
     */
    public void setDeleteAll(Long DeleteAll) {
        this.DeleteAll = DeleteAll;
    }

    /**
     * Get <p>blocklist 封禁列表 whitelist 白名单列表</p> 
     * @return ShowType <p>blocklist 封禁列表 whitelist 白名单列表</p>
     */
    public String getShowType() {
        return this.ShowType;
    }

    /**
     * Set <p>blocklist 封禁列表 whitelist 白名单列表</p>
     * @param ShowType <p>blocklist 封禁列表 whitelist 白名单列表</p>
     */
    public void setShowType(String ShowType) {
        this.ShowType = ShowType;
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
     * Get <p>规则列表</p> 
     * @return Rules <p>规则列表</p>
     */
    public BanAndAllowRuleDel [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>规则列表</p>
     * @param Rules <p>规则列表</p>
     */
    public void setRules(BanAndAllowRuleDel [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>封禁：1，放通：100，<br>主要用于全部删除时区分列表类型</p> 
     * @return RuleType <p>封禁：1，放通：100，<br>主要用于全部删除时区分列表类型</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>封禁：1，放通：100，<br>主要用于全部删除时区分列表类型</p>
     * @param RuleType <p>封禁：1，放通：100，<br>主要用于全部删除时区分列表类型</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
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
        if (source.ShowType != null) {
            this.ShowType = new String(source.ShowType);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.Rules != null) {
            this.Rules = new BanAndAllowRuleDel[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BanAndAllowRuleDel(source.Rules[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeleteAll", this.DeleteAll);
        this.setParamSimple(map, prefix + "ShowType", this.ShowType);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

