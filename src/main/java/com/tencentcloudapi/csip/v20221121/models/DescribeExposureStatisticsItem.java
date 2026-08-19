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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExposureStatisticsItem extends AbstractModel {

    /**
    * 风险标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 风险等级
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * 风险类型
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 关联风险数量
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
     * Get 风险标题 
     * @return Title 风险标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 风险标题
     * @param Title 风险标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 风险等级 
     * @return Severity 风险等级
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 风险等级
     * @param Severity 风险等级
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 风险类型 
     * @return RuleType 风险类型
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 风险类型
     * @param RuleType 风险类型
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 关联风险数量 
     * @return RiskCount 关联风险数量
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 关联风险数量
     * @param RiskCount 关联风险数量
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    public DescribeExposureStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExposureStatisticsItem(DescribeExposureStatisticsItem source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);

    }
}

