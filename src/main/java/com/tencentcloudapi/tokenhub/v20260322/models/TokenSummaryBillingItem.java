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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenSummaryBillingItem extends AbstractModel {

    /**
    * 计费项。取值：input（输入 Token）、output（输出 Token）、cache（缓存 Token）、call_count（调用次数）。
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * 该计费项在周期内的原始用量汇总，单位：tokens。
    */
    @SerializedName("TotalQty")
    @Expose
    private Long TotalQty;

    /**
     * Get 计费项。取值：input（输入 Token）、output（输出 Token）、cache（缓存 Token）、call_count（调用次数）。 
     * @return BillingItem 计费项。取值：input（输入 Token）、output（输出 Token）、cache（缓存 Token）、call_count（调用次数）。
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set 计费项。取值：input（输入 Token）、output（输出 Token）、cache（缓存 Token）、call_count（调用次数）。
     * @param BillingItem 计费项。取值：input（输入 Token）、output（输出 Token）、cache（缓存 Token）、call_count（调用次数）。
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get 该计费项在周期内的原始用量汇总，单位：tokens。 
     * @return TotalQty 该计费项在周期内的原始用量汇总，单位：tokens。
     */
    public Long getTotalQty() {
        return this.TotalQty;
    }

    /**
     * Set 该计费项在周期内的原始用量汇总，单位：tokens。
     * @param TotalQty 该计费项在周期内的原始用量汇总，单位：tokens。
     */
    public void setTotalQty(Long TotalQty) {
        this.TotalQty = TotalQty;
    }

    public TokenSummaryBillingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenSummaryBillingItem(TokenSummaryBillingItem source) {
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.TotalQty != null) {
            this.TotalQty = new Long(source.TotalQty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "TotalQty", this.TotalQty);

    }
}

