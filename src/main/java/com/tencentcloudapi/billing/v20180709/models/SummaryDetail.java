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

public class SummaryDetail extends AbstractModel {

    /**
    * 账单维度编码
    */
    @SerializedName("GroupKey")
    @Expose
    private String GroupKey;

    /**
    * 账单维度值
    */
    @SerializedName("GroupValue")
    @Expose
    private String GroupValue;

    /**
    * 原价，单位为元。TotalCost字段自账单3.0（即2021-05）之后开始生效，账单3.0之前返回"-"。合同价的情况下，TotalCost字段与官网价格存在差异，也返回“-”。
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

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
    * 产品汇总信息
    */
    @SerializedName("Business")
    @Expose
    private BusinessSummaryInfo [] Business;

    /**
     * Get 账单维度编码 
     * @return GroupKey 账单维度编码
     */
    public String getGroupKey() {
        return this.GroupKey;
    }

    /**
     * Set 账单维度编码
     * @param GroupKey 账单维度编码
     */
    public void setGroupKey(String GroupKey) {
        this.GroupKey = GroupKey;
    }

    /**
     * Get 账单维度值 
     * @return GroupValue 账单维度值
     */
    public String getGroupValue() {
        return this.GroupValue;
    }

    /**
     * Set 账单维度值
     * @param GroupValue 账单维度值
     */
    public void setGroupValue(String GroupValue) {
        this.GroupValue = GroupValue;
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
     * Get 产品汇总信息 
     * @return Business 产品汇总信息
     */
    public BusinessSummaryInfo [] getBusiness() {
        return this.Business;
    }

    /**
     * Set 产品汇总信息
     * @param Business 产品汇总信息
     */
    public void setBusiness(BusinessSummaryInfo [] Business) {
        this.Business = Business;
    }

    public SummaryDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryDetail(SummaryDetail source) {
        if (source.GroupKey != null) {
            this.GroupKey = new String(source.GroupKey);
        }
        if (source.GroupValue != null) {
            this.GroupValue = new String(source.GroupValue);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
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
        if (source.Business != null) {
            this.Business = new BusinessSummaryInfo[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new BusinessSummaryInfo(source.Business[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupKey", this.GroupKey);
        this.setParamSimple(map, prefix + "GroupValue", this.GroupValue);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamArrayObj(map, prefix + "Business.", this.Business);

    }
}

