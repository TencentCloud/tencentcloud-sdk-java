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

public class BaselineRiskLevelStatistic extends AbstractModel {

    /**
    * <p>风险等级。取值：LOW（低危）、MEDIUM（中危）、HIGH（高危）、CRITICAL（严重）。</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>该风险等级下结果为 NOT_PASS 的检测项数量。</p>
    */
    @SerializedName("NotPassCount")
    @Expose
    private Long NotPassCount;

    /**
     * Get <p>风险等级。取值：LOW（低危）、MEDIUM（中危）、HIGH（高危）、CRITICAL（严重）。</p> 
     * @return RiskLevel <p>风险等级。取值：LOW（低危）、MEDIUM（中危）、HIGH（高危）、CRITICAL（严重）。</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级。取值：LOW（低危）、MEDIUM（中危）、HIGH（高危）、CRITICAL（严重）。</p>
     * @param RiskLevel <p>风险等级。取值：LOW（低危）、MEDIUM（中危）、HIGH（高危）、CRITICAL（严重）。</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>该风险等级下结果为 NOT_PASS 的检测项数量。</p> 
     * @return NotPassCount <p>该风险等级下结果为 NOT_PASS 的检测项数量。</p>
     */
    public Long getNotPassCount() {
        return this.NotPassCount;
    }

    /**
     * Set <p>该风险等级下结果为 NOT_PASS 的检测项数量。</p>
     * @param NotPassCount <p>该风险等级下结果为 NOT_PASS 的检测项数量。</p>
     */
    public void setNotPassCount(Long NotPassCount) {
        this.NotPassCount = NotPassCount;
    }

    public BaselineRiskLevelStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRiskLevelStatistic(BaselineRiskLevelStatistic source) {
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.NotPassCount != null) {
            this.NotPassCount = new Long(source.NotPassCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "NotPassCount", this.NotPassCount);

    }
}

