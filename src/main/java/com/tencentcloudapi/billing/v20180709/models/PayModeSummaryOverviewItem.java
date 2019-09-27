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

public class PayModeSummaryOverviewItem  extends AbstractModel{

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 付费模式名称
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * 实际花费
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 费用所占百分比，两位小数
    */
    @SerializedName("RealTotalCostRatio")
    @Expose
    private String RealTotalCostRatio;

    /**
    * 按交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型汇总消费详情
    */
    @SerializedName("Detail")
    @Expose
    private ActionSummaryOverviewItem [] Detail;

    /**
    * 现金金额
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 赠送金金额
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 代金券金额
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
     * 获取付费模式
     * @return PayMode 付费模式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取付费模式名称
     * @return PayModeName 付费模式名称
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * 设置付费模式名称
     * @param PayModeName 付费模式名称
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * 获取实际花费
     * @return RealTotalCost 实际花费
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * 设置实际花费
     * @param RealTotalCost 实际花费
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * 获取费用所占百分比，两位小数
     * @return RealTotalCostRatio 费用所占百分比，两位小数
     */
    public String getRealTotalCostRatio() {
        return this.RealTotalCostRatio;
    }

    /**
     * 设置费用所占百分比，两位小数
     * @param RealTotalCostRatio 费用所占百分比，两位小数
     */
    public void setRealTotalCostRatio(String RealTotalCostRatio) {
        this.RealTotalCostRatio = RealTotalCostRatio;
    }

    /**
     * 获取按交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型汇总消费详情
     * @return Detail 按交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型汇总消费详情
     */
    public ActionSummaryOverviewItem [] getDetail() {
        return this.Detail;
    }

    /**
     * 设置按交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型汇总消费详情
     * @param Detail 按交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型汇总消费详情
     */
    public void setDetail(ActionSummaryOverviewItem [] Detail) {
        this.Detail = Detail;
    }

    /**
     * 获取现金金额
     * @return CashPayAmount 现金金额
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * 设置现金金额
     * @param CashPayAmount 现金金额
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * 获取赠送金金额
     * @return IncentivePayAmount 赠送金金额
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * 设置赠送金金额
     * @param IncentivePayAmount 赠送金金额
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * 获取代金券金额
     * @return VoucherPayAmount 代金券金额
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * 设置代金券金额
     * @param VoucherPayAmount 代金券金额
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "RealTotalCostRatio", this.RealTotalCostRatio);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);

    }
}

