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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Remediation extends AbstractModel {

    /**
    * 修正模板 ID。
    */
    @SerializedName("RemediationTemplateId")
    @Expose
    private String RemediationTemplateId;

    /**
    * 修正设置 ID。
    */
    @SerializedName("RemediationId")
    @Expose
    private String RemediationId;

    /**
    * 执行修正的模板来源
    */
    @SerializedName("RemediationSourceType")
    @Expose
    private String RemediationSourceType;

    /**
    * 修正类型。取值：
SCF：函数计算（自定义修正）。
    */
    @SerializedName("RemediationType")
    @Expose
    private String RemediationType;

    /**
    * 账号ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 修正执行方式。取值：
MANUAL_EXECUTION：手动执行。
    */
    @SerializedName("InvokeType")
    @Expose
    private String InvokeType;

    /**
    * 规则 ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 修正模板 ID。 
     * @return RemediationTemplateId 修正模板 ID。
     */
    public String getRemediationTemplateId() {
        return this.RemediationTemplateId;
    }

    /**
     * Set 修正模板 ID。
     * @param RemediationTemplateId 修正模板 ID。
     */
    public void setRemediationTemplateId(String RemediationTemplateId) {
        this.RemediationTemplateId = RemediationTemplateId;
    }

    /**
     * Get 修正设置 ID。 
     * @return RemediationId 修正设置 ID。
     */
    public String getRemediationId() {
        return this.RemediationId;
    }

    /**
     * Set 修正设置 ID。
     * @param RemediationId 修正设置 ID。
     */
    public void setRemediationId(String RemediationId) {
        this.RemediationId = RemediationId;
    }

    /**
     * Get 执行修正的模板来源 
     * @return RemediationSourceType 执行修正的模板来源
     */
    public String getRemediationSourceType() {
        return this.RemediationSourceType;
    }

    /**
     * Set 执行修正的模板来源
     * @param RemediationSourceType 执行修正的模板来源
     */
    public void setRemediationSourceType(String RemediationSourceType) {
        this.RemediationSourceType = RemediationSourceType;
    }

    /**
     * Get 修正类型。取值：
SCF：函数计算（自定义修正）。 
     * @return RemediationType 修正类型。取值：
SCF：函数计算（自定义修正）。
     */
    public String getRemediationType() {
        return this.RemediationType;
    }

    /**
     * Set 修正类型。取值：
SCF：函数计算（自定义修正）。
     * @param RemediationType 修正类型。取值：
SCF：函数计算（自定义修正）。
     */
    public void setRemediationType(String RemediationType) {
        this.RemediationType = RemediationType;
    }

    /**
     * Get 账号ID 
     * @return OwnerUin 账号ID
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 账号ID
     * @param OwnerUin 账号ID
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 修正执行方式。取值：
MANUAL_EXECUTION：手动执行。 
     * @return InvokeType 修正执行方式。取值：
MANUAL_EXECUTION：手动执行。
     */
    public String getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set 修正执行方式。取值：
MANUAL_EXECUTION：手动执行。
     * @param InvokeType 修正执行方式。取值：
MANUAL_EXECUTION：手动执行。
     */
    public void setInvokeType(String InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get 规则 ID。 
     * @return RuleId 规则 ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID。
     * @param RuleId 规则 ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public Remediation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Remediation(Remediation source) {
        if (source.RemediationTemplateId != null) {
            this.RemediationTemplateId = new String(source.RemediationTemplateId);
        }
        if (source.RemediationId != null) {
            this.RemediationId = new String(source.RemediationId);
        }
        if (source.RemediationSourceType != null) {
            this.RemediationSourceType = new String(source.RemediationSourceType);
        }
        if (source.RemediationType != null) {
            this.RemediationType = new String(source.RemediationType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.InvokeType != null) {
            this.InvokeType = new String(source.InvokeType);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemediationTemplateId", this.RemediationTemplateId);
        this.setParamSimple(map, prefix + "RemediationId", this.RemediationId);
        this.setParamSimple(map, prefix + "RemediationSourceType", this.RemediationSourceType);
        this.setParamSimple(map, prefix + "RemediationType", this.RemediationType);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "InvokeType", this.InvokeType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

