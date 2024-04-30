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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewPlanRequest extends AbstractModel {

    /**
    * 套餐 ID，形如 edgeone-2unuvzjmmn2q。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 续费套餐的时长，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。
    */
    @SerializedName("AutoUseVoucher")
    @Expose
    private String AutoUseVoucher;

    /**
     * Get 套餐 ID，形如 edgeone-2unuvzjmmn2q。 
     * @return PlanId 套餐 ID，形如 edgeone-2unuvzjmmn2q。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 套餐 ID，形如 edgeone-2unuvzjmmn2q。
     * @param PlanId 套餐 ID，形如 edgeone-2unuvzjmmn2q。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 续费套餐的时长，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。 
     * @return Period 续费套餐的时长，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 续费套餐的时长，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。
     * @param Period 续费套餐的时长，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。 
     * @return AutoUseVoucher 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。
     */
    public String getAutoUseVoucher() {
        return this.AutoUseVoucher;
    }

    /**
     * Set 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。
     * @param AutoUseVoucher 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。
     */
    public void setAutoUseVoucher(String AutoUseVoucher) {
        this.AutoUseVoucher = AutoUseVoucher;
    }

    public RenewPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewPlanRequest(RenewPlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoUseVoucher != null) {
            this.AutoUseVoucher = new String(source.AutoUseVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoUseVoucher", this.AutoUseVoucher);

    }
}

