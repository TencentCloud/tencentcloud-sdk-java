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
    * <p>规则的uuid，可通过查询规则列表获取</p>
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * <p>删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可</p>
    */
    @SerializedName("RemoveType")
    @Expose
    private Long RemoveType;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
     * Get <p>规则的uuid，可通过查询规则列表获取</p> 
     * @return RuleUuid <p>规则的uuid，可通过查询规则列表获取</p>
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set <p>规则的uuid，可通过查询规则列表获取</p>
     * @param RuleUuid <p>规则的uuid，可通过查询规则列表获取</p>
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get <p>删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可</p> 
     * @return RemoveType <p>删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可</p>
     */
    public Long getRemoveType() {
        return this.RemoveType;
    }

    /**
     * Set <p>删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可</p>
     * @param RemoveType <p>删除类型，0是单条删除，RuleUuid填写删除规则id，1为全部删除，RuleUuid填0即可</p>
     */
    public void setRemoveType(Long RemoveType) {
        this.RemoveType = RemoveType;
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

    public RemoveEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveEnterpriseSecurityGroupRuleRequest(RemoveEnterpriseSecurityGroupRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.RemoveType != null) {
            this.RemoveType = new Long(source.RemoveType);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "RemoveType", this.RemoveType);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);

    }
}

