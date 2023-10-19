/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceFirewallTemplateRuleRequest extends AbstractModel {

    /**
    * 防火墙模板ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 防火墙模板规则ID。
    */
    @SerializedName("TemplateRuleId")
    @Expose
    private String TemplateRuleId;

    /**
    * 替换后的防火墙模板规则。
    */
    @SerializedName("TemplateRule")
    @Expose
    private FirewallRule TemplateRule;

    /**
     * Get 防火墙模板ID。 
     * @return TemplateId 防火墙模板ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 防火墙模板ID。
     * @param TemplateId 防火墙模板ID。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 防火墙模板规则ID。 
     * @return TemplateRuleId 防火墙模板规则ID。
     */
    public String getTemplateRuleId() {
        return this.TemplateRuleId;
    }

    /**
     * Set 防火墙模板规则ID。
     * @param TemplateRuleId 防火墙模板规则ID。
     */
    public void setTemplateRuleId(String TemplateRuleId) {
        this.TemplateRuleId = TemplateRuleId;
    }

    /**
     * Get 替换后的防火墙模板规则。 
     * @return TemplateRule 替换后的防火墙模板规则。
     */
    public FirewallRule getTemplateRule() {
        return this.TemplateRule;
    }

    /**
     * Set 替换后的防火墙模板规则。
     * @param TemplateRule 替换后的防火墙模板规则。
     */
    public void setTemplateRule(FirewallRule TemplateRule) {
        this.TemplateRule = TemplateRule;
    }

    public ReplaceFirewallTemplateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceFirewallTemplateRuleRequest(ReplaceFirewallTemplateRuleRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateRuleId != null) {
            this.TemplateRuleId = new String(source.TemplateRuleId);
        }
        if (source.TemplateRule != null) {
            this.TemplateRule = new FirewallRule(source.TemplateRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateRuleId", this.TemplateRuleId);
        this.setParamObj(map, prefix + "TemplateRule.", this.TemplateRule);

    }
}

