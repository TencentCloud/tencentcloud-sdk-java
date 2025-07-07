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
package com.tencentcloudapi.af.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDetail extends AbstractModel {

    /**
    * 风险码 参数详细定义请加微信：TYXGJ-01
    */
    @SerializedName("RiskCode")
    @Expose
    private Long RiskCode;

    /**
     * Get 风险码 参数详细定义请加微信：TYXGJ-01 
     * @return RiskCode 风险码 参数详细定义请加微信：TYXGJ-01
     */
    public Long getRiskCode() {
        return this.RiskCode;
    }

    /**
     * Set 风险码 参数详细定义请加微信：TYXGJ-01
     * @param RiskCode 风险码 参数详细定义请加微信：TYXGJ-01
     */
    public void setRiskCode(Long RiskCode) {
        this.RiskCode = RiskCode;
    }

    public RiskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDetail(RiskDetail source) {
        if (source.RiskCode != null) {
            this.RiskCode = new Long(source.RiskCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskCode", this.RiskCode);

    }
}

