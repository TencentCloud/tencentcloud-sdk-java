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

public class CreateFirewallTemplateRequest extends AbstractModel {

    /**
    * 模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 防火墙规则列表。
    */
    @SerializedName("TemplateRules")
    @Expose
    private FirewallRule [] TemplateRules;

    /**
     * Get 模板名称。 
     * @return TemplateName 模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
     * @param TemplateName 模板名称。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 防火墙规则列表。 
     * @return TemplateRules 防火墙规则列表。
     */
    public FirewallRule [] getTemplateRules() {
        return this.TemplateRules;
    }

    /**
     * Set 防火墙规则列表。
     * @param TemplateRules 防火墙规则列表。
     */
    public void setTemplateRules(FirewallRule [] TemplateRules) {
        this.TemplateRules = TemplateRules;
    }

    public CreateFirewallTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFirewallTemplateRequest(CreateFirewallTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateRules != null) {
            this.TemplateRules = new FirewallRule[source.TemplateRules.length];
            for (int i = 0; i < source.TemplateRules.length; i++) {
                this.TemplateRules[i] = new FirewallRule(source.TemplateRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "TemplateRules.", this.TemplateRules);

    }
}

