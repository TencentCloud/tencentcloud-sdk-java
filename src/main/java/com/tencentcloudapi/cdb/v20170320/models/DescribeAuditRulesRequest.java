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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditRulesRequest extends AbstractModel{

    /**
    * 审计规则 ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 审计规则名称。支持按审计规则名称进行模糊匹配查询。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 分页大小参数。默认值为 20，最小值为 1，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量。默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 审计规则 ID。 
     * @return RuleId 审计规则 ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 审计规则 ID。
     * @param RuleId 审计规则 ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 审计规则名称。支持按审计规则名称进行模糊匹配查询。 
     * @return RuleName 审计规则名称。支持按审计规则名称进行模糊匹配查询。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 审计规则名称。支持按审计规则名称进行模糊匹配查询。
     * @param RuleName 审计规则名称。支持按审计规则名称进行模糊匹配查询。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 分页大小参数。默认值为 20，最小值为 1，最大值为 100。 
     * @return Limit 分页大小参数。默认值为 20，最小值为 1，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小参数。默认值为 20，最小值为 1，最大值为 100。
     * @param Limit 分页大小参数。默认值为 20，最小值为 1，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量。默认值为0。 
     * @return Offset 分页偏移量。默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。默认值为0。
     * @param Offset 分页偏移量。默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAuditRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditRulesRequest(DescribeAuditRulesRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
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
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

