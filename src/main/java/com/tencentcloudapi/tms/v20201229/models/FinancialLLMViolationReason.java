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

public class FinancialLLMViolationReason extends AbstractModel {

    /**
    * 违规原文片段
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * 违规原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 违规原文片段 
     * @return TargetText 违规原文片段
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 违规原文片段
     * @param TargetText 违规原文片段
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get 违规原因 
     * @return Reason 违规原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 违规原因
     * @param Reason 违规原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public FinancialLLMViolationReason() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinancialLLMViolationReason(FinancialLLMViolationReason source) {
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

