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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMRisks extends AbstractModel {

    /**
    * 分数
    */
    @SerializedName("Risks")
    @Expose
    private ClawRiskItem [] Risks;

    /**
     * Get 分数 
     * @return Risks 分数
     */
    public ClawRiskItem [] getRisks() {
        return this.Risks;
    }

    /**
     * Set 分数
     * @param Risks 分数
     */
    public void setRisks(ClawRiskItem [] Risks) {
        this.Risks = Risks;
    }

    public LLMRisks() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMRisks(LLMRisks source) {
        if (source.Risks != null) {
            this.Risks = new ClawRiskItem[source.Risks.length];
            for (int i = 0; i < source.Risks.length; i++) {
                this.Risks[i] = new ClawRiskItem(source.Risks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Risks.", this.Risks);

    }
}

