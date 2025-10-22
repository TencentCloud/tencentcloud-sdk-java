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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FinancialLLMViolationDetail extends AbstractModel {

    /**
    * 违规点
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 处置建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 违规原因列表
    */
    @SerializedName("Reasons")
    @Expose
    private FinancialLLMViolationReason [] Reasons;

    /**
     * Get 违规点 
     * @return Label 违规点
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 违规点
     * @param Label 违规点
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 处置建议 
     * @return Suggestion 处置建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 处置建议
     * @param Suggestion 处置建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 违规原因列表 
     * @return Reasons 违规原因列表
     */
    public FinancialLLMViolationReason [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set 违规原因列表
     * @param Reasons 违规原因列表
     */
    public void setReasons(FinancialLLMViolationReason [] Reasons) {
        this.Reasons = Reasons;
    }

    public FinancialLLMViolationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinancialLLMViolationDetail(FinancialLLMViolationDetail source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Reasons != null) {
            this.Reasons = new FinancialLLMViolationReason[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new FinancialLLMViolationReason(source.Reasons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArrayObj(map, prefix + "Reasons.", this.Reasons);

    }
}

