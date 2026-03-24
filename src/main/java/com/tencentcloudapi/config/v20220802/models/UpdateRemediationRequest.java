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

public class UpdateRemediationRequest extends AbstractModel {

    /**
    * 修正设置 ID
    */
    @SerializedName("RemediationId")
    @Expose
    private String RemediationId;

    /**
    * 修正类型。取值： SCF：函数计算（自定义修正）。
    */
    @SerializedName("RemediationType")
    @Expose
    private String RemediationType;

    /**
    * 修正模板 ID
    */
    @SerializedName("RemediationTemplateId")
    @Expose
    private String RemediationTemplateId;

    /**
    * 修正执行方式。取值：  NON_EXECUTION：不执行。  AUTO_EXECUTION：自动执行。  MANUAL_EXECUTION：手动执行。  NOT_CONFIG：未设置。
    */
    @SerializedName("InvokeType")
    @Expose
    private String InvokeType;

    /**
    * 执行修正来源
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
     * Get 修正设置 ID 
     * @return RemediationId 修正设置 ID
     */
    public String getRemediationId() {
        return this.RemediationId;
    }

    /**
     * Set 修正设置 ID
     * @param RemediationId 修正设置 ID
     */
    public void setRemediationId(String RemediationId) {
        this.RemediationId = RemediationId;
    }

    /**
     * Get 修正类型。取值： SCF：函数计算（自定义修正）。 
     * @return RemediationType 修正类型。取值： SCF：函数计算（自定义修正）。
     */
    public String getRemediationType() {
        return this.RemediationType;
    }

    /**
     * Set 修正类型。取值： SCF：函数计算（自定义修正）。
     * @param RemediationType 修正类型。取值： SCF：函数计算（自定义修正）。
     */
    public void setRemediationType(String RemediationType) {
        this.RemediationType = RemediationType;
    }

    /**
     * Get 修正模板 ID 
     * @return RemediationTemplateId 修正模板 ID
     */
    public String getRemediationTemplateId() {
        return this.RemediationTemplateId;
    }

    /**
     * Set 修正模板 ID
     * @param RemediationTemplateId 修正模板 ID
     */
    public void setRemediationTemplateId(String RemediationTemplateId) {
        this.RemediationTemplateId = RemediationTemplateId;
    }

    /**
     * Get 修正执行方式。取值：  NON_EXECUTION：不执行。  AUTO_EXECUTION：自动执行。  MANUAL_EXECUTION：手动执行。  NOT_CONFIG：未设置。 
     * @return InvokeType 修正执行方式。取值：  NON_EXECUTION：不执行。  AUTO_EXECUTION：自动执行。  MANUAL_EXECUTION：手动执行。  NOT_CONFIG：未设置。
     */
    public String getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set 修正执行方式。取值：  NON_EXECUTION：不执行。  AUTO_EXECUTION：自动执行。  MANUAL_EXECUTION：手动执行。  NOT_CONFIG：未设置。
     * @param InvokeType 修正执行方式。取值：  NON_EXECUTION：不执行。  AUTO_EXECUTION：自动执行。  MANUAL_EXECUTION：手动执行。  NOT_CONFIG：未设置。
     */
    public void setInvokeType(String InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get 执行修正来源 
     * @return SourceType 执行修正来源
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 执行修正来源
     * @param SourceType 执行修正来源
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    public UpdateRemediationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRemediationRequest(UpdateRemediationRequest source) {
        if (source.RemediationId != null) {
            this.RemediationId = new String(source.RemediationId);
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
        this.setParamSimple(map, prefix + "RemediationId", this.RemediationId);
        this.setParamSimple(map, prefix + "RemediationType", this.RemediationType);
        this.setParamSimple(map, prefix + "RemediationTemplateId", this.RemediationTemplateId);
        this.setParamSimple(map, prefix + "InvokeType", this.InvokeType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

