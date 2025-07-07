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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirewallTemplateRuleInfo extends AbstractModel {

    /**
    * 防火墙模板规则ID。
    */
    @SerializedName("TemplateRuleId")
    @Expose
    private String TemplateRuleId;

    /**
    * 防火墙规则信息。
    */
    @SerializedName("FirewallRuleInfo")
    @Expose
    private FirewallRuleInfo FirewallRuleInfo;

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
     * Get 防火墙规则信息。 
     * @return FirewallRuleInfo 防火墙规则信息。
     */
    public FirewallRuleInfo getFirewallRuleInfo() {
        return this.FirewallRuleInfo;
    }

    /**
     * Set 防火墙规则信息。
     * @param FirewallRuleInfo 防火墙规则信息。
     */
    public void setFirewallRuleInfo(FirewallRuleInfo FirewallRuleInfo) {
        this.FirewallRuleInfo = FirewallRuleInfo;
    }

    public FirewallTemplateRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirewallTemplateRuleInfo(FirewallTemplateRuleInfo source) {
        if (source.TemplateRuleId != null) {
            this.TemplateRuleId = new String(source.TemplateRuleId);
        }
        if (source.FirewallRuleInfo != null) {
            this.FirewallRuleInfo = new FirewallRuleInfo(source.FirewallRuleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateRuleId", this.TemplateRuleId);
        this.setParamObj(map, prefix + "FirewallRuleInfo.", this.FirewallRuleInfo);

    }
}

