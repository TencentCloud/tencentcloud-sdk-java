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

public class ListConfigRuleEvaluationResultsRequest extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * 偏移量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 当前页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * 评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规
    */
    @SerializedName("ComplianceType")
    @Expose
    private String [] ComplianceType;

    /**
     * Get 规则ID 
     * @return ConfigRuleId 规则ID
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set 规则ID
     * @param ConfigRuleId 规则ID
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get 偏移量 
     * @return Limit 偏移量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 偏移量
     * @param Limit 偏移量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 当前页 
     * @return Offset 当前页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 当前页
     * @param Offset 当前页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 类型 
     * @return ResourceType 类型
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 类型
     * @param ResourceType 类型
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规 
     * @return ComplianceType 评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规
     */
    public String [] getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set 评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规
     * @param ComplianceType 评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规
     */
    public void setComplianceType(String [] ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    public ListConfigRuleEvaluationResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConfigRuleEvaluationResultsRequest(ListConfigRuleEvaluationResultsRequest source) {
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new String[source.ComplianceType.length];
            for (int i = 0; i < source.ComplianceType.length; i++) {
                this.ComplianceType[i] = new String(source.ComplianceType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ComplianceType.", this.ComplianceType);

    }
}

