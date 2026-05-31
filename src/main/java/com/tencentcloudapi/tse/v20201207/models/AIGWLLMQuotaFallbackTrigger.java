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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLLMQuotaFallbackTrigger extends AbstractModel {

    /**
    * <p>配额感知阈值百分比（RPM 与 TPM 共用）</p><p>取值范围：[0, 99]</p>
    */
    @SerializedName("ThresholdPercent")
    @Expose
    private Long ThresholdPercent;

    /**
    * <p>检查维度策略</p><p>枚举值：</p><ul><li>AnyInsufficient：  RPM 或 TPM 任一不足即触发</li><li>AllInsufficient： RPM 和 TPM 同时不足才触发</li></ul>
    */
    @SerializedName("CheckDimension")
    @Expose
    private String CheckDimension;

    /**
     * Get <p>配额感知阈值百分比（RPM 与 TPM 共用）</p><p>取值范围：[0, 99]</p> 
     * @return ThresholdPercent <p>配额感知阈值百分比（RPM 与 TPM 共用）</p><p>取值范围：[0, 99]</p>
     */
    public Long getThresholdPercent() {
        return this.ThresholdPercent;
    }

    /**
     * Set <p>配额感知阈值百分比（RPM 与 TPM 共用）</p><p>取值范围：[0, 99]</p>
     * @param ThresholdPercent <p>配额感知阈值百分比（RPM 与 TPM 共用）</p><p>取值范围：[0, 99]</p>
     */
    public void setThresholdPercent(Long ThresholdPercent) {
        this.ThresholdPercent = ThresholdPercent;
    }

    /**
     * Get <p>检查维度策略</p><p>枚举值：</p><ul><li>AnyInsufficient：  RPM 或 TPM 任一不足即触发</li><li>AllInsufficient： RPM 和 TPM 同时不足才触发</li></ul> 
     * @return CheckDimension <p>检查维度策略</p><p>枚举值：</p><ul><li>AnyInsufficient：  RPM 或 TPM 任一不足即触发</li><li>AllInsufficient： RPM 和 TPM 同时不足才触发</li></ul>
     */
    public String getCheckDimension() {
        return this.CheckDimension;
    }

    /**
     * Set <p>检查维度策略</p><p>枚举值：</p><ul><li>AnyInsufficient：  RPM 或 TPM 任一不足即触发</li><li>AllInsufficient： RPM 和 TPM 同时不足才触发</li></ul>
     * @param CheckDimension <p>检查维度策略</p><p>枚举值：</p><ul><li>AnyInsufficient：  RPM 或 TPM 任一不足即触发</li><li>AllInsufficient： RPM 和 TPM 同时不足才触发</li></ul>
     */
    public void setCheckDimension(String CheckDimension) {
        this.CheckDimension = CheckDimension;
    }

    public AIGWLLMQuotaFallbackTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLLMQuotaFallbackTrigger(AIGWLLMQuotaFallbackTrigger source) {
        if (source.ThresholdPercent != null) {
            this.ThresholdPercent = new Long(source.ThresholdPercent);
        }
        if (source.CheckDimension != null) {
            this.CheckDimension = new String(source.CheckDimension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThresholdPercent", this.ThresholdPercent);
        this.setParamSimple(map, prefix + "CheckDimension", this.CheckDimension);

    }
}

