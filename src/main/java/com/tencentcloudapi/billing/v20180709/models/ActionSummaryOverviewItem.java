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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionSummaryOverviewItem extends AbstractModel {

    /**
    * 交易类型编码
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * 费用所占百分比，两位小数
    */
    @SerializedName("RealTotalCostRatio")
    @Expose
    private String RealTotalCostRatio;

    /**
    * 优惠后总价
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 现金账户支出：通过现金账户支付的金额
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 赠送账户支出：使用赠送金支付的金额
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 分成金账户支出：通过分成金账户支付的金额
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * 账单月份，格式2019-08
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * 原价，单位为元。TotalCost字段自账单3.0（即2021-05）之后开始生效，账单3.0之前返回"-"。合同价的情况下，TotalCost字段与官网价格存在差异，也返回“-”。
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get 交易类型编码 
     * @return ActionType 交易类型编码
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 交易类型编码
     * @param ActionType 交易类型编码
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型 
     * @return ActionTypeName 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型
     * @param ActionTypeName 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get 费用所占百分比，两位小数 
     * @return RealTotalCostRatio 费用所占百分比，两位小数
     */
    public String getRealTotalCostRatio() {
        return this.RealTotalCostRatio;
    }

    /**
     * Set 费用所占百分比，两位小数
     * @param RealTotalCostRatio 费用所占百分比，两位小数
     */
    public void setRealTotalCostRatio(String RealTotalCostRatio) {
        this.RealTotalCostRatio = RealTotalCostRatio;
    }

    /**
     * Get 优惠后总价 
     * @return RealTotalCost 优惠后总价
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 优惠后总价
     * @param RealTotalCost 优惠后总价
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 现金账户支出：通过现金账户支付的金额 
     * @return CashPayAmount 现金账户支出：通过现金账户支付的金额
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金账户支出：通过现金账户支付的金额
     * @param CashPayAmount 现金账户支出：通过现金账户支付的金额
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 赠送账户支出：使用赠送金支付的金额 
     * @return IncentivePayAmount 赠送账户支出：使用赠送金支付的金额
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送账户支出：使用赠送金支付的金额
     * @param IncentivePayAmount 赠送账户支出：使用赠送金支付的金额
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额 
     * @return VoucherPayAmount 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额
     * @param VoucherPayAmount 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 分成金账户支出：通过分成金账户支付的金额 
     * @return TransferPayAmount 分成金账户支出：通过分成金账户支付的金额
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set 分成金账户支出：通过分成金账户支付的金额
     * @param TransferPayAmount 分成金账户支出：通过分成金账户支付的金额
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get 账单月份，格式2019-08 
     * @return BillMonth 账单月份，格式2019-08
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set 账单月份，格式2019-08
     * @param BillMonth 账单月份，格式2019-08
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
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

    public ActionSummaryOverviewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionSummaryOverviewItem(ActionSummaryOverviewItem source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
        if (source.RealTotalCostRatio != null) {
            this.RealTotalCostRatio = new String(source.RealTotalCostRatio);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "RealTotalCostRatio", this.RealTotalCostRatio);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}

