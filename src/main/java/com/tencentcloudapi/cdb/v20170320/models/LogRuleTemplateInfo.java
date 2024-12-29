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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogRuleTemplateInfo extends AbstractModel {

    /**
    * 模板ID。
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private String RuleTemplateId;

    /**
    * 规则模板名
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * 告警等级。1-低风险，2-中风险，3-高风险。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private String AlarmLevel;

    /**
    * 规则模板变更状态：0-未变更；1-已变更；2-已删除
    */
    @SerializedName("RuleTemplateStatus")
    @Expose
    private Long RuleTemplateStatus;

    /**
     * Get 模板ID。 
     * @return RuleTemplateId 模板ID。
     */
    public String getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set 模板ID。
     * @param RuleTemplateId 模板ID。
     */
    public void setRuleTemplateId(String RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get 规则模板名 
     * @return RuleTemplateName 规则模板名
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set 规则模板名
     * @param RuleTemplateName 规则模板名
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get 告警等级。1-低风险，2-中风险，3-高风险。 
     * @return AlarmLevel 告警等级。1-低风险，2-中风险，3-高风险。
     */
    public String getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警等级。1-低风险，2-中风险，3-高风险。
     * @param AlarmLevel 告警等级。1-低风险，2-中风险，3-高风险。
     */
    public void setAlarmLevel(String AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 规则模板变更状态：0-未变更；1-已变更；2-已删除 
     * @return RuleTemplateStatus 规则模板变更状态：0-未变更；1-已变更；2-已删除
     */
    public Long getRuleTemplateStatus() {
        return this.RuleTemplateStatus;
    }

    /**
     * Set 规则模板变更状态：0-未变更；1-已变更；2-已删除
     * @param RuleTemplateStatus 规则模板变更状态：0-未变更；1-已变更；2-已删除
     */
    public void setRuleTemplateStatus(Long RuleTemplateStatus) {
        this.RuleTemplateStatus = RuleTemplateStatus;
    }

    public LogRuleTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogRuleTemplateInfo(LogRuleTemplateInfo source) {
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new String(source.RuleTemplateId);
        }
        if (source.RuleTemplateName != null) {
            this.RuleTemplateName = new String(source.RuleTemplateName);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new String(source.AlarmLevel);
        }
        if (source.RuleTemplateStatus != null) {
            this.RuleTemplateStatus = new Long(source.RuleTemplateStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "RuleTemplateStatus", this.RuleTemplateStatus);

    }
}

