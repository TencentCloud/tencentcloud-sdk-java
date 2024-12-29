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

public class AuditRuleTemplateInfo extends AbstractModel {

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
    * 规则模板的过滤条件。
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
    * 规则模板描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则模板创建时间。
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

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
    * 规则模板应用在哪些在实例。
    */
    @SerializedName("AffectedInstances")
    @Expose
    private String [] AffectedInstances;

    /**
    * 模板状态。0-无任务 ，1-修改中。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 模板更新时间。
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

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
     * Get 规则模板的过滤条件。 
     * @return RuleFilters 规则模板的过滤条件。
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set 规则模板的过滤条件。
     * @param RuleFilters 规则模板的过滤条件。
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get 规则模板描述。 
     * @return Description 规则模板描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则模板描述。
     * @param Description 规则模板描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则模板创建时间。 
     * @return CreateAt 规则模板创建时间。
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 规则模板创建时间。
     * @param CreateAt 规则模板创建时间。
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
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
     * Get 规则模板应用在哪些在实例。 
     * @return AffectedInstances 规则模板应用在哪些在实例。
     */
    public String [] getAffectedInstances() {
        return this.AffectedInstances;
    }

    /**
     * Set 规则模板应用在哪些在实例。
     * @param AffectedInstances 规则模板应用在哪些在实例。
     */
    public void setAffectedInstances(String [] AffectedInstances) {
        this.AffectedInstances = AffectedInstances;
    }

    /**
     * Get 模板状态。0-无任务 ，1-修改中。 
     * @return Status 模板状态。0-无任务 ，1-修改中。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 模板状态。0-无任务 ，1-修改中。
     * @param Status 模板状态。0-无任务 ，1-修改中。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 模板更新时间。 
     * @return UpdateAt 模板更新时间。
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set 模板更新时间。
     * @param UpdateAt 模板更新时间。
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    public AuditRuleTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditRuleTemplateInfo(AuditRuleTemplateInfo source) {
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new Long(source.AlarmPolicy);
        }
        if (source.AffectedInstances != null) {
            this.AffectedInstances = new String[source.AffectedInstances.length];
            for (int i = 0; i < source.AffectedInstances.length; i++) {
                this.AffectedInstances[i] = new String(source.AffectedInstances[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmPolicy", this.AlarmPolicy);
        this.setParamArraySimple(map, prefix + "AffectedInstances.", this.AffectedInstances);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);

    }
}

