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

public class OpenAuditServiceRequest extends AbstractModel {

    /**
    * CDB实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
90 - 三个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * 审计规则（该参数已废弃，不再生效）。
    */
    @SerializedName("AuditRuleFilters")
    @Expose
    private AuditRuleFilters [] AuditRuleFilters;

    /**
    * 规则模板ID。同AuditRuleFilters都不填是全审计。
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * 审计类型。true-全审计；默认false-规则审计。
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
     * Get CDB实例ID 
     * @return InstanceId CDB实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CDB实例ID
     * @param InstanceId CDB实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
90 - 三个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年； 
     * @return LogExpireDay 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
90 - 三个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
90 - 三个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     * @param LogExpireDay 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
90 - 三个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月； 
     * @return HighLogExpireDay 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
     * @param HighLogExpireDay 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get 审计规则（该参数已废弃，不再生效）。 
     * @return AuditRuleFilters 审计规则（该参数已废弃，不再生效）。
     */
    public AuditRuleFilters [] getAuditRuleFilters() {
        return this.AuditRuleFilters;
    }

    /**
     * Set 审计规则（该参数已废弃，不再生效）。
     * @param AuditRuleFilters 审计规则（该参数已废弃，不再生效）。
     */
    public void setAuditRuleFilters(AuditRuleFilters [] AuditRuleFilters) {
        this.AuditRuleFilters = AuditRuleFilters;
    }

    /**
     * Get 规则模板ID。同AuditRuleFilters都不填是全审计。 
     * @return RuleTemplateIds 规则模板ID。同AuditRuleFilters都不填是全审计。
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set 规则模板ID。同AuditRuleFilters都不填是全审计。
     * @param RuleTemplateIds 规则模板ID。同AuditRuleFilters都不填是全审计。
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get 审计类型。true-全审计；默认false-规则审计。 
     * @return AuditAll 审计类型。true-全审计；默认false-规则审计。
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set 审计类型。true-全审计；默认false-规则审计。
     * @param AuditAll 审计类型。true-全审计；默认false-规则审计。
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    public OpenAuditServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenAuditServiceRequest(OpenAuditServiceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
        if (source.AuditRuleFilters != null) {
            this.AuditRuleFilters = new AuditRuleFilters[source.AuditRuleFilters.length];
            for (int i = 0; i < source.AuditRuleFilters.length; i++) {
                this.AuditRuleFilters[i] = new AuditRuleFilters(source.AuditRuleFilters[i]);
            }
        }
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamArrayObj(map, prefix + "AuditRuleFilters.", this.AuditRuleFilters);
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);

    }
}

