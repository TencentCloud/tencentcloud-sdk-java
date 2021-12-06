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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeduceQuotaRequest extends AbstractModel{

    /**
    * 主播ID
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
    * 提现金额，单位为"分"
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 外部业务订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * Get 主播ID 
     * @return AnchorId 主播ID
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播ID
     * @param AnchorId 主播ID
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

    /**
     * Get 提现金额，单位为"分" 
     * @return Amount 提现金额，单位为"分"
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 提现金额，单位为"分"
     * @param Amount 提现金额，单位为"分"
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 外部业务订单号 
     * @return OrderId 外部业务订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 外部业务订单号
     * @param OrderId 外部业务订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public DeduceQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeduceQuotaRequest(DeduceQuotaRequest source) {
        if (source.AnchorId != null) {
            this.AnchorId = new String(source.AnchorId);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

