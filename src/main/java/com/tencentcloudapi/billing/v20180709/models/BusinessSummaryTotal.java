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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BusinessSummaryTotal extends AbstractModel{

    /**
    * 总花费
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 代金券金额
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 赠送金金额
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 现金金额
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 原价，单位为元。TotalCost字段自账单3.0（即2021-05）之后开始生效，账单3.0之前返回"-"。合同价的情况下，TotalCost字段与官网价格存在差异，也返回“-”。
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get 总花费 
     * @return RealTotalCost 总花费
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 总花费
     * @param RealTotalCost 总花费
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 代金券金额 
     * @return VoucherPayAmount 代金券金额
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 代金券金额
     * @param VoucherPayAmount 代金券金额
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 赠送金金额 
     * @return IncentivePayAmount 赠送金金额
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送金金额
     * @param IncentivePayAmount 赠送金金额
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 现金金额 
     * @return CashPayAmount 现金金额
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金金额
     * @param CashPayAmount 现金金额
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 原价，单位为元。TotalCost字段自账单3.0（即2021-05）之后开始生效，账单3.0之前返回"-"。合同价的情况下，TotalCost字段与官网价格存在差异，也返回“-”。 
     * @return TotalCost 原价，单位为元。TotalCost字段自账单3.0（即2021-05）之后开始生效，账单3.0之前返回"-"。合同价的情况下，TotalCost字段与官网价格存在差异，也返回“-”。
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 原价，单位为元。TotalCost字段自账单3.0（即2021-05）之后开始生效，账单3.0之前返回"-"。合同价的情况下，TotalCost字段与官网价格存在差异，也返回“-”。
     * @param TotalCost 原价，单位为元。TotalCost字段自账单3.0（即2021-05）之后开始生效，账单3.0之前返回"-"。合同价的情况下，TotalCost字段与官网价格存在差异，也返回“-”。
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public BusinessSummaryTotal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessSummaryTotal(BusinessSummaryTotal source) {
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}

