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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeChatBillDetail extends AbstractModel{

    /**
    * token
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
    * 本token收费次数
    */
    @SerializedName("ChargeCount")
    @Expose
    private Long ChargeCount;

    /**
    * 本token计费详情
    */
    @SerializedName("ChargeDetails")
    @Expose
    private ChargeDetail [] ChargeDetails;

    /**
    * 业务RuleId
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get token 
     * @return BizToken token
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set token
     * @param BizToken token
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    /**
     * Get 本token收费次数 
     * @return ChargeCount 本token收费次数
     */
    public Long getChargeCount() {
        return this.ChargeCount;
    }

    /**
     * Set 本token收费次数
     * @param ChargeCount 本token收费次数
     */
    public void setChargeCount(Long ChargeCount) {
        this.ChargeCount = ChargeCount;
    }

    /**
     * Get 本token计费详情 
     * @return ChargeDetails 本token计费详情
     */
    public ChargeDetail [] getChargeDetails() {
        return this.ChargeDetails;
    }

    /**
     * Set 本token计费详情
     * @param ChargeDetails 本token计费详情
     */
    public void setChargeDetails(ChargeDetail [] ChargeDetails) {
        this.ChargeDetails = ChargeDetails;
    }

    /**
     * Get 业务RuleId 
     * @return RuleId 业务RuleId
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 业务RuleId
     * @param RuleId 业务RuleId
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public WeChatBillDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeChatBillDetail(WeChatBillDetail source) {
        if (source.BizToken != null) {
            this.BizToken = new String(source.BizToken);
        }
        if (source.ChargeCount != null) {
            this.ChargeCount = new Long(source.ChargeCount);
        }
        if (source.ChargeDetails != null) {
            this.ChargeDetails = new ChargeDetail[source.ChargeDetails.length];
            for (int i = 0; i < source.ChargeDetails.length; i++) {
                this.ChargeDetails[i] = new ChargeDetail(source.ChargeDetails[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);
        this.setParamSimple(map, prefix + "ChargeCount", this.ChargeCount);
        this.setParamArrayObj(map, prefix + "ChargeDetails.", this.ChargeDetails);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

