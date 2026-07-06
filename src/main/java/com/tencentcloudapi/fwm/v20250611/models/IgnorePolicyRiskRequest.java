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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IgnorePolicyRiskRequest extends AbstractModel {

    /**
    * 策略问题ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 成员Id
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
     * Get 策略问题ID 
     * @return RiskId 策略问题ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 策略问题ID
     * @param RiskId 策略问题ID
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 成员Id 
     * @return MemberId 成员Id
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 成员Id
     * @param MemberId 成员Id
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public IgnorePolicyRiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IgnorePolicyRiskRequest(IgnorePolicyRiskRequest source) {
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);

    }
}

