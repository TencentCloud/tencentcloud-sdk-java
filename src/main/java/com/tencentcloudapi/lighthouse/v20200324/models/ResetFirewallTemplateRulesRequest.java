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

public class ResetFirewallTemplateRulesRequest extends AbstractModel {

    /**
    * 防火墙模板ID。可通过 [DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874) 接口返回值中的 TemplateId	获取。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 重置后的防火墙模板规则列表。每次请求批量防火墙规则的上限为 100。
    */
    @SerializedName("TemplateRules")
    @Expose
    private FirewallRule [] TemplateRules;

    /**
     * Get 防火墙模板ID。可通过 [DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874) 接口返回值中的 TemplateId	获取。 
     * @return TemplateId 防火墙模板ID。可通过 [DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874) 接口返回值中的 TemplateId	获取。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 防火墙模板ID。可通过 [DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874) 接口返回值中的 TemplateId	获取。
     * @param TemplateId 防火墙模板ID。可通过 [DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874) 接口返回值中的 TemplateId	获取。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 重置后的防火墙模板规则列表。每次请求批量防火墙规则的上限为 100。 
     * @return TemplateRules 重置后的防火墙模板规则列表。每次请求批量防火墙规则的上限为 100。
     */
    public FirewallRule [] getTemplateRules() {
        return this.TemplateRules;
    }

    /**
     * Set 重置后的防火墙模板规则列表。每次请求批量防火墙规则的上限为 100。
     * @param TemplateRules 重置后的防火墙模板规则列表。每次请求批量防火墙规则的上限为 100。
     */
    public void setTemplateRules(FirewallRule [] TemplateRules) {
        this.TemplateRules = TemplateRules;
    }

    public ResetFirewallTemplateRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetFirewallTemplateRulesRequest(ResetFirewallTemplateRulesRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
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
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "TemplateRules.", this.TemplateRules);

    }
}

