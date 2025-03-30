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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleTemplateInfo extends AbstractModel {

    /**
    * 规则模板ID。
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private String RuleTemplateId;

    /**
    * 规则模板名称。
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * 规则内容。
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

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
    * 规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 规则模板ID。 
     * @return RuleTemplateId 规则模板ID。
     */
    public String getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set 规则模板ID。
     * @param RuleTemplateId 规则模板ID。
     */
    public void setRuleTemplateId(String RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get 规则模板名称。 
     * @return RuleTemplateName 规则模板名称。
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set 规则模板名称。
     * @param RuleTemplateName 规则模板名称。
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get 规则内容。 
     * @return RuleFilters 规则内容。
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set 规则内容。
     * @param RuleFilters 规则内容。
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
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

    /**
     * Get 规则描述。 
     * @return Description 规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。
     * @param Description 规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public RuleTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleTemplateInfo(RuleTemplateInfo source) {
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new String(source.RuleTemplateId);
        }
        if (source.RuleTemplateName != null) {
            this.RuleTemplateName = new String(source.RuleTemplateName);
        }
        if (source.RuleFilters != null) {
            this.RuleFilters = new RuleFilters[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new RuleFilters(source.RuleFilters[i]);
            }
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new Long(source.AlarmPolicy);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmPolicy", this.AlarmPolicy);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

