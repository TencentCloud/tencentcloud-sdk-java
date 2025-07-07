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

public class DescribeAuditRuleTemplatesRequest extends AbstractModel {

    /**
    * 规则模板ID。
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * 规则模板名称。
    */
    @SerializedName("RuleTemplateNames")
    @Expose
    private String [] RuleTemplateNames;

    /**
    * 单次请求返回的数量。默认值20，最大值为1000。
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
    * 告警等级。1-低风险，2-中风险，3-高风险。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警策略。0-不告警，1-告警。
    */
    @SerializedName("AlarmPolicy")
    @Expose
    private Long AlarmPolicy;

    /**
     * Get 规则模板ID。 
     * @return RuleTemplateIds 规则模板ID。
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set 规则模板ID。
     * @param RuleTemplateIds 规则模板ID。
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get 规则模板名称。 
     * @return RuleTemplateNames 规则模板名称。
     */
    public String [] getRuleTemplateNames() {
        return this.RuleTemplateNames;
    }

    /**
     * Set 规则模板名称。
     * @param RuleTemplateNames 规则模板名称。
     */
    public void setRuleTemplateNames(String [] RuleTemplateNames) {
        this.RuleTemplateNames = RuleTemplateNames;
    }

    /**
     * Get 单次请求返回的数量。默认值20，最大值为1000。 
     * @return Limit 单次请求返回的数量。默认值20，最大值为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量。默认值20，最大值为1000。
     * @param Limit 单次请求返回的数量。默认值20，最大值为1000。
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

    /**
     * Get 告警等级。1-低风险，2-中风险，3-高风险。 
     * @return AlarmLevel 告警等级。1-低风险，2-中风险，3-高风险。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警等级。1-低风险，2-中风险，3-高风险。
     * @param AlarmLevel 告警等级。1-低风险，2-中风险，3-高风险。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警策略。0-不告警，1-告警。 
     * @return AlarmPolicy 告警策略。0-不告警，1-告警。
     */
    public Long getAlarmPolicy() {
        return this.AlarmPolicy;
    }

    /**
     * Set 告警策略。0-不告警，1-告警。
     * @param AlarmPolicy 告警策略。0-不告警，1-告警。
     */
    public void setAlarmPolicy(Long AlarmPolicy) {
        this.AlarmPolicy = AlarmPolicy;
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
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new Long(source.AlarmPolicy);
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
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmPolicy", this.AlarmPolicy);

    }
}

