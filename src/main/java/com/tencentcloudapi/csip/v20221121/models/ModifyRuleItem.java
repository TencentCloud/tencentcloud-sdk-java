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

public class ModifyRuleItem extends AbstractModel {

    /**
    * 规则类型
枚举值：
dimension：维度级规则
category：子项级规则
severity：等级级规则
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 维度ID
    */
    @SerializedName("DimensionId")
    @Expose
    private String DimensionId;

    /**
    * 子项ID，category和severity级别必填
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * 等级，severity级别必填
枚举值：
critical：严重
high：高危
medium：中危
low：低危
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * 扣分上限
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * 单次扣分
    */
    @SerializedName("DeductPerItem")
    @Expose
    private Long DeductPerItem;

    /**
     * Get 规则类型
枚举值：
dimension：维度级规则
category：子项级规则
severity：等级级规则 
     * @return RuleType 规则类型
枚举值：
dimension：维度级规则
category：子项级规则
severity：等级级规则
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型
枚举值：
dimension：维度级规则
category：子项级规则
severity：等级级规则
     * @param RuleType 规则类型
枚举值：
dimension：维度级规则
category：子项级规则
severity：等级级规则
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 维度ID 
     * @return DimensionId 维度ID
     */
    public String getDimensionId() {
        return this.DimensionId;
    }

    /**
     * Set 维度ID
     * @param DimensionId 维度ID
     */
    public void setDimensionId(String DimensionId) {
        this.DimensionId = DimensionId;
    }

    /**
     * Get 子项ID，category和severity级别必填 
     * @return CategoryId 子项ID，category和severity级别必填
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 子项ID，category和severity级别必填
     * @param CategoryId 子项ID，category和severity级别必填
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 等级，severity级别必填
枚举值：
critical：严重
high：高危
medium：中危
low：低危 
     * @return Severity 等级，severity级别必填
枚举值：
critical：严重
high：高危
medium：中危
low：低危
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 等级，severity级别必填
枚举值：
critical：严重
high：高危
medium：中危
low：低危
     * @param Severity 等级，severity级别必填
枚举值：
critical：严重
high：高危
medium：中危
low：低危
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 扣分上限 
     * @return MaxDeductScore 扣分上限
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set 扣分上限
     * @param MaxDeductScore 扣分上限
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get 单次扣分 
     * @return DeductPerItem 单次扣分
     */
    public Long getDeductPerItem() {
        return this.DeductPerItem;
    }

    /**
     * Set 单次扣分
     * @param DeductPerItem 单次扣分
     */
    public void setDeductPerItem(Long DeductPerItem) {
        this.DeductPerItem = DeductPerItem;
    }

    public ModifyRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleItem(ModifyRuleItem source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.DimensionId != null) {
            this.DimensionId = new String(source.DimensionId);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductPerItem != null) {
            this.DeductPerItem = new Long(source.DeductPerItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "DimensionId", this.DimensionId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductPerItem", this.DeductPerItem);

    }
}

