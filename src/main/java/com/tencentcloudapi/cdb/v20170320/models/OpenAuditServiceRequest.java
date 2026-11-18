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

public class OpenAuditServiceRequest extends AbstractModel {

    /**
    * <p>CDB 实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>高频审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul><p>默认值：7</p><p>此项取值需小于等于 LogExpireDay。</p>
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * <p>审计规则（该参数已废弃，不再生效）。</p>
    */
    @SerializedName("AuditRuleFilters")
    @Expose
    private AuditRuleFilters [] AuditRuleFilters;

    /**
    * <p>规则模板 ID。</p>
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * <p>审计类型。true - 全审计；默认 false - 规则审计。</p>
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
     * Get <p>CDB 实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>CDB 实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>CDB 实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>CDB 实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul> 
     * @return LogExpireDay <p>审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul>
     * @param LogExpireDay <p>审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>高频审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul><p>默认值：7</p><p>此项取值需小于等于 LogExpireDay。</p> 
     * @return HighLogExpireDay <p>高频审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul><p>默认值：7</p><p>此项取值需小于等于 LogExpireDay。</p>
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set <p>高频审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul><p>默认值：7</p><p>此项取值需小于等于 LogExpireDay。</p>
     * @param HighLogExpireDay <p>高频审计日志保存时长。</p><p>枚举值：</p><ul><li>7： 一周</li><li>30： 一个月</li><li>90： 三个月</li><li>180： 六个月</li><li>365： 一年</li><li>1095： 三年</li><li>1825： 五年</li></ul><p>默认值：7</p><p>此项取值需小于等于 LogExpireDay。</p>
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get <p>审计规则（该参数已废弃，不再生效）。</p> 
     * @return AuditRuleFilters <p>审计规则（该参数已废弃，不再生效）。</p>
     * @deprecated
     */
    @Deprecated
    public AuditRuleFilters [] getAuditRuleFilters() {
        return this.AuditRuleFilters;
    }

    /**
     * Set <p>审计规则（该参数已废弃，不再生效）。</p>
     * @param AuditRuleFilters <p>审计规则（该参数已废弃，不再生效）。</p>
     * @deprecated
     */
    @Deprecated
    public void setAuditRuleFilters(AuditRuleFilters [] AuditRuleFilters) {
        this.AuditRuleFilters = AuditRuleFilters;
    }

    /**
     * Get <p>规则模板 ID。</p> 
     * @return RuleTemplateIds <p>规则模板 ID。</p>
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set <p>规则模板 ID。</p>
     * @param RuleTemplateIds <p>规则模板 ID。</p>
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get <p>审计类型。true - 全审计；默认 false - 规则审计。</p> 
     * @return AuditAll <p>审计类型。true - 全审计；默认 false - 规则审计。</p>
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set <p>审计类型。true - 全审计；默认 false - 规则审计。</p>
     * @param AuditAll <p>审计类型。true - 全审计；默认 false - 规则审计。</p>
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

