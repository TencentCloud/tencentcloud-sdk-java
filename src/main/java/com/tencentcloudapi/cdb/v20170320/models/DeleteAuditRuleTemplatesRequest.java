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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAuditRuleTemplatesRequest extends AbstractModel {

    /**
    * 审计规则模板 ID，可通过 [DescribeAuditRuleTemplates](https://cloud.tencent.com/document/api/236/101811) 接口获取，单次允许最多删除5个规则模板。
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
     * Get 审计规则模板 ID，可通过 [DescribeAuditRuleTemplates](https://cloud.tencent.com/document/api/236/101811) 接口获取，单次允许最多删除5个规则模板。 
     * @return RuleTemplateIds 审计规则模板 ID，可通过 [DescribeAuditRuleTemplates](https://cloud.tencent.com/document/api/236/101811) 接口获取，单次允许最多删除5个规则模板。
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set 审计规则模板 ID，可通过 [DescribeAuditRuleTemplates](https://cloud.tencent.com/document/api/236/101811) 接口获取，单次允许最多删除5个规则模板。
     * @param RuleTemplateIds 审计规则模板 ID，可通过 [DescribeAuditRuleTemplates](https://cloud.tencent.com/document/api/236/101811) 接口获取，单次允许最多删除5个规则模板。
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    public DeleteAuditRuleTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAuditRuleTemplatesRequest(DeleteAuditRuleTemplatesRequest source) {
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);

    }
}

