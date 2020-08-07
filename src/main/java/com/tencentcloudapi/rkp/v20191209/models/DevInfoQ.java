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

public class DevInfoQ extends AbstractModel{

    /**
    * devid
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 风险值
    */
    @SerializedName("RiskScore")
    @Expose
    private Long RiskScore;

    /**
    * 风险详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskInfo")
    @Expose
    private RiskDetail [] RiskInfo;

    /**
    * 概率值
    */
    @SerializedName("Probability")
    @Expose
    private Float Probability;

    /**
     * Get devid 
     * @return OpenId devid
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set devid
     * @param OpenId devid
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 风险值 
     * @return RiskScore 风险值
     */
    public Long getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set 风险值
     * @param RiskScore 风险值
     */
    public void setRiskScore(Long RiskScore) {
        this.RiskScore = RiskScore;
    }

    /**
     * Get 风险详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskInfo 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskDetail [] getRiskInfo() {
        return this.RiskInfo;
    }

    /**
     * Set 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskInfo 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskInfo(RiskDetail [] RiskInfo) {
        this.RiskInfo = RiskInfo;
    }

    /**
     * Get 概率值 
     * @return Probability 概率值
     */
    public Float getProbability() {
        return this.Probability;
    }

    /**
     * Set 概率值
     * @param Probability 概率值
     */
    public void setProbability(Float Probability) {
        this.Probability = Probability;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);
        this.setParamArrayObj(map, prefix + "RiskInfo.", this.RiskInfo);
        this.setParamSimple(map, prefix + "Probability", this.Probability);

    }
}

