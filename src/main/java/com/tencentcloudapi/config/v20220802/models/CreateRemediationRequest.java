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

public class CreateRemediationRequest extends AbstractModel {

    /**
    * <p>规则 ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>修正类型取值：   SCF：云函数（自定义修正）。</p>
    */
    @SerializedName("RemediationType")
    @Expose
    private String RemediationType;

    /**
    * <p>修正模板 ID</p>
    */
    @SerializedName("RemediationTemplateId")
    @Expose
    private String RemediationTemplateId;

    /**
    * <p>修正执行方式。<br>取值：   MANUAL_EXECUTION：手动执行</p>
    */
    @SerializedName("InvokeType")
    @Expose
    private String InvokeType;

    /**
    * <p>执行修正的模板来源<br>CUSTOM：自定义模板。</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
     * Get <p>规则 ID</p> 
     * @return RuleId <p>规则 ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则 ID</p>
     * @param RuleId <p>规则 ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>修正类型取值：   SCF：云函数（自定义修正）。</p> 
     * @return RemediationType <p>修正类型取值：   SCF：云函数（自定义修正）。</p>
     */
    public String getRemediationType() {
        return this.RemediationType;
    }

    /**
     * Set <p>修正类型取值：   SCF：云函数（自定义修正）。</p>
     * @param RemediationType <p>修正类型取值：   SCF：云函数（自定义修正）。</p>
     */
    public void setRemediationType(String RemediationType) {
        this.RemediationType = RemediationType;
    }

    /**
     * Get <p>修正模板 ID</p> 
     * @return RemediationTemplateId <p>修正模板 ID</p>
     */
    public String getRemediationTemplateId() {
        return this.RemediationTemplateId;
    }

    /**
     * Set <p>修正模板 ID</p>
     * @param RemediationTemplateId <p>修正模板 ID</p>
     */
    public void setRemediationTemplateId(String RemediationTemplateId) {
        this.RemediationTemplateId = RemediationTemplateId;
    }

    /**
     * Get <p>修正执行方式。<br>取值：   MANUAL_EXECUTION：手动执行</p> 
     * @return InvokeType <p>修正执行方式。<br>取值：   MANUAL_EXECUTION：手动执行</p>
     */
    public String getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set <p>修正执行方式。<br>取值：   MANUAL_EXECUTION：手动执行</p>
     * @param InvokeType <p>修正执行方式。<br>取值：   MANUAL_EXECUTION：手动执行</p>
     */
    public void setInvokeType(String InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get <p>执行修正的模板来源<br>CUSTOM：自定义模板。</p> 
     * @return SourceType <p>执行修正的模板来源<br>CUSTOM：自定义模板。</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>执行修正的模板来源<br>CUSTOM：自定义模板。</p>
     * @param SourceType <p>执行修正的模板来源<br>CUSTOM：自定义模板。</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    public CreateRemediationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRemediationRequest(CreateRemediationRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RemediationType != null) {
            this.RemediationType = new String(source.RemediationType);
        }
        if (source.RemediationTemplateId != null) {
            this.RemediationTemplateId = new String(source.RemediationTemplateId);
        }
        if (source.InvokeType != null) {
            this.InvokeType = new String(source.InvokeType);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RemediationType", this.RemediationType);
        this.setParamSimple(map, prefix + "RemediationTemplateId", this.RemediationTemplateId);
        this.setParamSimple(map, prefix + "InvokeType", this.InvokeType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

