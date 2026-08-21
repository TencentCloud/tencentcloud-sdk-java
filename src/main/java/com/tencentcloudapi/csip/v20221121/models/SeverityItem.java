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

public class SeverityItem extends AbstractModel {

    /**
    * 风险等级
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
    * 等级中文名
    */
    @SerializedName("SeverityName")
    @Expose
    private String SeverityName;

    /**
    * 该等级风险数量
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 单次扣分
    */
    @SerializedName("DeductPerItem")
    @Expose
    private Long DeductPerItem;

    /**
    * 等级扣分上限
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * 实际扣分
    */
    @SerializedName("DeductScore")
    @Expose
    private Long DeductScore;

    /**
     * Get 风险等级
枚举值：
critical：严重
high：高危
medium：中危
low：低危 
     * @return Severity 风险等级
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
     * Set 风险等级
枚举值：
critical：严重
high：高危
medium：中危
low：低危
     * @param Severity 风险等级
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
     * Get 等级中文名 
     * @return SeverityName 等级中文名
     */
    public String getSeverityName() {
        return this.SeverityName;
    }

    /**
     * Set 等级中文名
     * @param SeverityName 等级中文名
     */
    public void setSeverityName(String SeverityName) {
        this.SeverityName = SeverityName;
    }

    /**
     * Get 该等级风险数量 
     * @return RiskCount 该等级风险数量
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 该等级风险数量
     * @param RiskCount 该等级风险数量
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
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

    /**
     * Get 等级扣分上限 
     * @return MaxDeductScore 等级扣分上限
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set 等级扣分上限
     * @param MaxDeductScore 等级扣分上限
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get 实际扣分 
     * @return DeductScore 实际扣分
     */
    public Long getDeductScore() {
        return this.DeductScore;
    }

    /**
     * Set 实际扣分
     * @param DeductScore 实际扣分
     */
    public void setDeductScore(Long DeductScore) {
        this.DeductScore = DeductScore;
    }

    public SeverityItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeverityItem(SeverityItem source) {
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.SeverityName != null) {
            this.SeverityName = new String(source.SeverityName);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.DeductPerItem != null) {
            this.DeductPerItem = new Long(source.DeductPerItem);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductScore != null) {
            this.DeductScore = new Long(source.DeductScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "SeverityName", this.SeverityName);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "DeductPerItem", this.DeductPerItem);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductScore", this.DeductScore);

    }
}

