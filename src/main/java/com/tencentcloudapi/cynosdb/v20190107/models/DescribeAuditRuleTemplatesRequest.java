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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditRuleTemplatesRequest extends AbstractModel{

    /**
    * 规则模版ID。
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * 规则模版名称
    */
    @SerializedName("RuleTemplateNames")
    @Expose
    private String [] RuleTemplateNames;

    /**
    * 单次请求返回的数量。默认值20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认值为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 规则模版ID。 
     * @return RuleTemplateIds 规则模版ID。
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set 规则模版ID。
     * @param RuleTemplateIds 规则模版ID。
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get 规则模版名称 
     * @return RuleTemplateNames 规则模版名称
     */
    public String [] getRuleTemplateNames() {
        return this.RuleTemplateNames;
    }

    /**
     * Set 规则模版名称
     * @param RuleTemplateNames 规则模版名称
     */
    public void setRuleTemplateNames(String [] RuleTemplateNames) {
        this.RuleTemplateNames = RuleTemplateNames;
    }

    /**
     * Get 单次请求返回的数量。默认值20。 
     * @return Limit 单次请求返回的数量。默认值20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量。默认值20。
     * @param Limit 单次请求返回的数量。默认值20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认值为 0。 
     * @return Offset 偏移量，默认值为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为 0。
     * @param Offset 偏移量，默认值为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAuditRuleTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditRuleTemplatesRequest(DescribeAuditRuleTemplatesRequest source) {
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
        if (source.RuleTemplateNames != null) {
            this.RuleTemplateNames = new String[source.RuleTemplateNames.length];
            for (int i = 0; i < source.RuleTemplateNames.length; i++) {
                this.RuleTemplateNames[i] = new String(source.RuleTemplateNames[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamArraySimple(map, prefix + "RuleTemplateNames.", this.RuleTemplateNames);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

