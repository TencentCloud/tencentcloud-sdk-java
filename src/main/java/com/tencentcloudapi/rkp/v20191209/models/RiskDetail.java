/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.rkp.v20191209.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDetail extends AbstractModel{

    /**
    * 风险码
    */
    @SerializedName("RiskCode")
    @Expose
    private Long RiskCode;

    /**
    * 风险详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCodeValue")
    @Expose
    private String RiskCodeValue;

    /**
     * Get 风险码 
     * @return RiskCode 风险码
     */
    public Long getRiskCode() {
        return this.RiskCode;
    }

    /**
     * Set 风险码
     * @param RiskCode 风险码
     */
    public void setRiskCode(Long RiskCode) {
        this.RiskCode = RiskCode;
    }

    /**
     * Get 风险详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCodeValue 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskCodeValue() {
        return this.RiskCodeValue;
    }

    /**
     * Set 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCodeValue 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCodeValue(String RiskCodeValue) {
        this.RiskCodeValue = RiskCodeValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskCode", this.RiskCode);
        this.setParamSimple(map, prefix + "RiskCodeValue", this.RiskCodeValue);

    }
}

