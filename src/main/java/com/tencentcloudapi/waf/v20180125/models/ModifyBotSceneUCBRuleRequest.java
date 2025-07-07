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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBotSceneUCBRuleRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 1.BOT全局白名单处调用时，传"global";2.BOT场景配置时，传具体的场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 规则内容, 增加编码SceneId信息,1.BOT全局白名单处调用时，SceneId为"global", RuleType传10, Action为"permit";2.BOT场景配置时，SceneId为场景ID
    */
    @SerializedName("Rule")
    @Expose
    private InOutputBotUCBRule Rule;

    /**
    * 530改批量操作
    */
    @SerializedName("BatchRules")
    @Expose
    private InOutputBotUCBRule [] BatchRules;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 1.BOT全局白名单处调用时，传"global";2.BOT场景配置时，传具体的场景ID 
     * @return SceneId 1.BOT全局白名单处调用时，传"global";2.BOT场景配置时，传具体的场景ID
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 1.BOT全局白名单处调用时，传"global";2.BOT场景配置时，传具体的场景ID
     * @param SceneId 1.BOT全局白名单处调用时，传"global";2.BOT场景配置时，传具体的场景ID
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 规则内容, 增加编码SceneId信息,1.BOT全局白名单处调用时，SceneId为"global", RuleType传10, Action为"permit";2.BOT场景配置时，SceneId为场景ID 
     * @return Rule 规则内容, 增加编码SceneId信息,1.BOT全局白名单处调用时，SceneId为"global", RuleType传10, Action为"permit";2.BOT场景配置时，SceneId为场景ID
     */
    public InOutputBotUCBRule getRule() {
        return this.Rule;
    }

    /**
     * Set 规则内容, 增加编码SceneId信息,1.BOT全局白名单处调用时，SceneId为"global", RuleType传10, Action为"permit";2.BOT场景配置时，SceneId为场景ID
     * @param Rule 规则内容, 增加编码SceneId信息,1.BOT全局白名单处调用时，SceneId为"global", RuleType传10, Action为"permit";2.BOT场景配置时，SceneId为场景ID
     */
    public void setRule(InOutputBotUCBRule Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 530改批量操作 
     * @return BatchRules 530改批量操作
     */
    public InOutputBotUCBRule [] getBatchRules() {
        return this.BatchRules;
    }

    /**
     * Set 530改批量操作
     * @param BatchRules 530改批量操作
     */
    public void setBatchRules(InOutputBotUCBRule [] BatchRules) {
        this.BatchRules = BatchRules;
    }

    public ModifyBotSceneUCBRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBotSceneUCBRuleRequest(ModifyBotSceneUCBRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.Rule != null) {
            this.Rule = new InOutputBotUCBRule(source.Rule);
        }
        if (source.BatchRules != null) {
            this.BatchRules = new InOutputBotUCBRule[source.BatchRules.length];
            for (int i = 0; i < source.BatchRules.length; i++) {
                this.BatchRules[i] = new InOutputBotUCBRule(source.BatchRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamArrayObj(map, prefix + "BatchRules.", this.BatchRules);

    }
}

