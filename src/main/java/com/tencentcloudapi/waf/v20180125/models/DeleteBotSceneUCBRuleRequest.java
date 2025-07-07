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

public class DeleteBotSceneUCBRuleRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 自定义规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 1.BOT全局白名单处调用时，传"global";2.BOT场景配置时，传具体的场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

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
     * Get 自定义规则ID 
     * @return RuleId 自定义规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 自定义规则ID
     * @param RuleId 自定义规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
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

    public DeleteBotSceneUCBRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBotSceneUCBRuleRequest(DeleteBotSceneUCBRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);

    }
}

