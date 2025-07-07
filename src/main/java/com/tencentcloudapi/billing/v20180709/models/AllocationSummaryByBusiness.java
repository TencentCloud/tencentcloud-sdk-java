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

public class AllocationSummaryByBusiness extends AbstractModel {

    /**
    * 分账单元唯一标识
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * 分账单元名称
    */
    @SerializedName("TreeNodeUniqKeyName")
    @Expose
    private String TreeNodeUniqKeyName;

    /**
    * 日期：结算日期
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
    * 归集费用(现金)：基于归集规则直接归集到分账单元的现金
    */
    @SerializedName("GatherCashPayAmount")
    @Expose
    private String GatherCashPayAmount;

    /**
    * 归集费用(优惠券)：基于归集规则直接归集到分账单元的资源优惠券
    */
    @SerializedName("GatherVoucherPayAmount")
    @Expose
    private String GatherVoucherPayAmount;

    /**
    * 归集费用(赠送金)：基于归集规则直接归集到分账单元的资源赠送金
    */
    @SerializedName("GatherIncentivePayAmount")
    @Expose
    private String GatherIncentivePayAmount;

    /**
    * 归集费用(分成金)：基于归集规则直接归集到分账单元的资源分成金
    */
    @SerializedName("GatherTransferPayAmount")
    @Expose
    private String GatherTransferPayAmount;

    /**
    * 分摊费用(现金)：基于分摊规则分摊到分账单元的资源现金
    */
    @SerializedName("AllocateCashPayAmount")
    @Expose
    private String AllocateCashPayAmount;

    /**
    * 分摊费用(优惠券)：基于分摊规则分摊到分账单元的资源优惠券
    */
    @SerializedName("AllocateVoucherPayAmount")
    @Expose
    private String AllocateVoucherPayAmount;

    /**
    * 分摊费用(赠送金)：基于分摊规则分摊到分账单元的资源赠送金
    */
    @SerializedName("AllocateIncentivePayAmount")
    @Expose
    private String AllocateIncentivePayAmount;

    /**
    * 分摊费用(分成金)：基于分摊规则分摊到分账单元的资源分成金
    */
    @SerializedName("AllocateTransferPayAmount")
    @Expose
    private String AllocateTransferPayAmount;

    /**
    * 合计费用(现金)：分账单元总费用，归集费用(现金) + 分摊费用(现金)
    */
    @SerializedName("TotalCashPayAmount")
    @Expose
    private String TotalCashPayAmount;

    /**
    * 合计费用(优惠券)：分账单元总费用，归集费用(优惠券) + 分摊费用(优惠券)
    */
    @SerializedName("TotalVoucherPayAmount")
    @Expose
    private String TotalVoucherPayAmount;

    /**
    * 合计费用(赠送金)：分账单元总费用，归集费用(赠送金) + 分摊费用(赠送金)
    */
    @SerializedName("TotalIncentivePayAmount")
    @Expose
    private String TotalIncentivePayAmount;

    /**
    * 合计费用(分成金)：分账单元总费用，归集费用(分成金)+分摊费用(分成金)
    */
    @SerializedName("TotalTransferPayAmount")
    @Expose
    private String TotalTransferPayAmount;

    /**
    * 归集费用(折后总额)：基于归集规则直接归集到分账单元的资源优惠后总价
    */
    @SerializedName("GatherRealCost")
    @Expose
    private String GatherRealCost;

    /**
    * 分摊费用(折后总额)：基于分摊规则分摊到分账单元的资源优惠后总价
    */
    @SerializedName("AllocateRealCost")
    @Expose
    private String AllocateRealCost;

    /**
    * 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 占比(折后总额)：本分账单元合计费用(折后总额)/合计费用(折后总额)*100%
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * 环比(折后总额)：[本月分账单元合计费用(折后总额) - 上月分账单元合计费用(折后总额)] / 上月分账单元合计费用(折后总额) * 100%
    */
    @SerializedName("Trend")
    @Expose
    private String Trend;

    /**
    * 环比箭头
upward -上升
downward - 下降
none - 平稳
    */
    @SerializedName("TrendType")
    @Expose
    private String TrendType;

    /**
    * 产品编码
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 产品名称：用户所采购的各类云产品
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
    */
    @SerializedName("RICost")
    @Expose
    private String RICost;

    /**
    * 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
    */
    @SerializedName("SPCost")
    @Expose
    private String SPCost;

    /**
    * 现金账户支出(元)：通过现金账户支付的金额
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额

    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 赠送账户支出(元)：使用赠送金支付的金额
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 分成账户支出(元)：通过分成金账户支付的金额
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
    */
    @SerializedName("AllocationRealTotalCost")
    @Expose
    private String AllocationRealTotalCost;

    /**
     * Get 分账单元唯一标识 
     * @return TreeNodeUniqKey 分账单元唯一标识
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set 分账单元唯一标识
     * @param TreeNodeUniqKey 分账单元唯一标识
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get 分账单元名称 
     * @return TreeNodeUniqKeyName 分账单元名称
     */
    public String getTreeNodeUniqKeyName() {
        return this.TreeNodeUniqKeyName;
    }

    /**
     * Set 分账单元名称
     * @param TreeNodeUniqKeyName 分账单元名称
     */
    public void setTreeNodeUniqKeyName(String TreeNodeUniqKeyName) {
        this.TreeNodeUniqKeyName = TreeNodeUniqKeyName;
    }

    /**
     * Get 日期：结算日期 
     * @return BillDate 日期：结算日期
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 日期：结算日期
     * @param BillDate 日期：结算日期
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    /**
     * Get 归集费用(现金)：基于归集规则直接归集到分账单元的现金 
     * @return GatherCashPayAmount 归集费用(现金)：基于归集规则直接归集到分账单元的现金
     */
    public String getGatherCashPayAmount() {
        return this.GatherCashPayAmount;
    }

    /**
     * Set 归集费用(现金)：基于归集规则直接归集到分账单元的现金
     * @param GatherCashPayAmount 归集费用(现金)：基于归集规则直接归集到分账单元的现金
     */
    public void setGatherCashPayAmount(String GatherCashPayAmount) {
        this.GatherCashPayAmount = GatherCashPayAmount;
    }

    /**
     * Get 归集费用(优惠券)：基于归集规则直接归集到分账单元的资源优惠券 
     * @return GatherVoucherPayAmount 归集费用(优惠券)：基于归集规则直接归集到分账单元的资源优惠券
     */
    public String getGatherVoucherPayAmount() {
        return this.GatherVoucherPayAmount;
    }

    /**
     * Set 归集费用(优惠券)：基于归集规则直接归集到分账单元的资源优惠券
     * @param GatherVoucherPayAmount 归集费用(优惠券)：基于归集规则直接归集到分账单元的资源优惠券
     */
    public void setGatherVoucherPayAmount(String GatherVoucherPayAmount) {
        this.GatherVoucherPayAmount = GatherVoucherPayAmount;
    }

    /**
     * Get 归集费用(赠送金)：基于归集规则直接归集到分账单元的资源赠送金 
     * @return GatherIncentivePayAmount 归集费用(赠送金)：基于归集规则直接归集到分账单元的资源赠送金
     */
    public String getGatherIncentivePayAmount() {
        return this.GatherIncentivePayAmount;
    }

    /**
     * Set 归集费用(赠送金)：基于归集规则直接归集到分账单元的资源赠送金
     * @param GatherIncentivePayAmount 归集费用(赠送金)：基于归集规则直接归集到分账单元的资源赠送金
     */
    public void setGatherIncentivePayAmount(String GatherIncentivePayAmount) {
        this.GatherIncentivePayAmount = GatherIncentivePayAmount;
    }

    /**
     * Get 归集费用(分成金)：基于归集规则直接归集到分账单元的资源分成金 
     * @return GatherTransferPayAmount 归集费用(分成金)：基于归集规则直接归集到分账单元的资源分成金
     */
    public String getGatherTransferPayAmount() {
        return this.GatherTransferPayAmount;
    }

    /**
     * Set 归集费用(分成金)：基于归集规则直接归集到分账单元的资源分成金
     * @param GatherTransferPayAmount 归集费用(分成金)：基于归集规则直接归集到分账单元的资源分成金
     */
    public void setGatherTransferPayAmount(String GatherTransferPayAmount) {
        this.GatherTransferPayAmount = GatherTransferPayAmount;
    }

    /**
     * Get 分摊费用(现金)：基于分摊规则分摊到分账单元的资源现金 
     * @return AllocateCashPayAmount 分摊费用(现金)：基于分摊规则分摊到分账单元的资源现金
     */
    public String getAllocateCashPayAmount() {
        return this.AllocateCashPayAmount;
    }

    /**
     * Set 分摊费用(现金)：基于分摊规则分摊到分账单元的资源现金
     * @param AllocateCashPayAmount 分摊费用(现金)：基于分摊规则分摊到分账单元的资源现金
     */
    public void setAllocateCashPayAmount(String AllocateCashPayAmount) {
        this.AllocateCashPayAmount = AllocateCashPayAmount;
    }

    /**
     * Get 分摊费用(优惠券)：基于分摊规则分摊到分账单元的资源优惠券 
     * @return AllocateVoucherPayAmount 分摊费用(优惠券)：基于分摊规则分摊到分账单元的资源优惠券
     */
    public String getAllocateVoucherPayAmount() {
        return this.AllocateVoucherPayAmount;
    }

    /**
     * Set 分摊费用(优惠券)：基于分摊规则分摊到分账单元的资源优惠券
     * @param AllocateVoucherPayAmount 分摊费用(优惠券)：基于分摊规则分摊到分账单元的资源优惠券
     */
    public void setAllocateVoucherPayAmount(String AllocateVoucherPayAmount) {
        this.AllocateVoucherPayAmount = AllocateVoucherPayAmount;
    }

    /**
     * Get 分摊费用(赠送金)：基于分摊规则分摊到分账单元的资源赠送金 
     * @return AllocateIncentivePayAmount 分摊费用(赠送金)：基于分摊规则分摊到分账单元的资源赠送金
     */
    public String getAllocateIncentivePayAmount() {
        return this.AllocateIncentivePayAmount;
    }

    /**
     * Set 分摊费用(赠送金)：基于分摊规则分摊到分账单元的资源赠送金
     * @param AllocateIncentivePayAmount 分摊费用(赠送金)：基于分摊规则分摊到分账单元的资源赠送金
     */
    public void setAllocateIncentivePayAmount(String AllocateIncentivePayAmount) {
        this.AllocateIncentivePayAmount = AllocateIncentivePayAmount;
    }

    /**
     * Get 分摊费用(分成金)：基于分摊规则分摊到分账单元的资源分成金 
     * @return AllocateTransferPayAmount 分摊费用(分成金)：基于分摊规则分摊到分账单元的资源分成金
     */
    public String getAllocateTransferPayAmount() {
        return this.AllocateTransferPayAmount;
    }

    /**
     * Set 分摊费用(分成金)：基于分摊规则分摊到分账单元的资源分成金
     * @param AllocateTransferPayAmount 分摊费用(分成金)：基于分摊规则分摊到分账单元的资源分成金
     */
    public void setAllocateTransferPayAmount(String AllocateTransferPayAmount) {
        this.AllocateTransferPayAmount = AllocateTransferPayAmount;
    }

    /**
     * Get 合计费用(现金)：分账单元总费用，归集费用(现金) + 分摊费用(现金) 
     * @return TotalCashPayAmount 合计费用(现金)：分账单元总费用，归集费用(现金) + 分摊费用(现金)
     */
    public String getTotalCashPayAmount() {
        return this.TotalCashPayAmount;
    }

    /**
     * Set 合计费用(现金)：分账单元总费用，归集费用(现金) + 分摊费用(现金)
     * @param TotalCashPayAmount 合计费用(现金)：分账单元总费用，归集费用(现金) + 分摊费用(现金)
     */
    public void setTotalCashPayAmount(String TotalCashPayAmount) {
        this.TotalCashPayAmount = TotalCashPayAmount;
    }

    /**
     * Get 合计费用(优惠券)：分账单元总费用，归集费用(优惠券) + 分摊费用(优惠券) 
     * @return TotalVoucherPayAmount 合计费用(优惠券)：分账单元总费用，归集费用(优惠券) + 分摊费用(优惠券)
     */
    public String getTotalVoucherPayAmount() {
        return this.TotalVoucherPayAmount;
    }

    /**
     * Set 合计费用(优惠券)：分账单元总费用，归集费用(优惠券) + 分摊费用(优惠券)
     * @param TotalVoucherPayAmount 合计费用(优惠券)：分账单元总费用，归集费用(优惠券) + 分摊费用(优惠券)
     */
    public void setTotalVoucherPayAmount(String TotalVoucherPayAmount) {
        this.TotalVoucherPayAmount = TotalVoucherPayAmount;
    }

    /**
     * Get 合计费用(赠送金)：分账单元总费用，归集费用(赠送金) + 分摊费用(赠送金) 
     * @return TotalIncentivePayAmount 合计费用(赠送金)：分账单元总费用，归集费用(赠送金) + 分摊费用(赠送金)
     */
    public String getTotalIncentivePayAmount() {
        return this.TotalIncentivePayAmount;
    }

    /**
     * Set 合计费用(赠送金)：分账单元总费用，归集费用(赠送金) + 分摊费用(赠送金)
     * @param TotalIncentivePayAmount 合计费用(赠送金)：分账单元总费用，归集费用(赠送金) + 分摊费用(赠送金)
     */
    public void setTotalIncentivePayAmount(String TotalIncentivePayAmount) {
        this.TotalIncentivePayAmount = TotalIncentivePayAmount;
    }

    /**
     * Get 合计费用(分成金)：分账单元总费用，归集费用(分成金)+分摊费用(分成金) 
     * @return TotalTransferPayAmount 合计费用(分成金)：分账单元总费用，归集费用(分成金)+分摊费用(分成金)
     */
    public String getTotalTransferPayAmount() {
        return this.TotalTransferPayAmount;
    }

    /**
     * Set 合计费用(分成金)：分账单元总费用，归集费用(分成金)+分摊费用(分成金)
     * @param TotalTransferPayAmount 合计费用(分成金)：分账单元总费用，归集费用(分成金)+分摊费用(分成金)
     */
    public void setTotalTransferPayAmount(String TotalTransferPayAmount) {
        this.TotalTransferPayAmount = TotalTransferPayAmount;
    }

    /**
     * Get 归集费用(折后总额)：基于归集规则直接归集到分账单元的资源优惠后总价 
     * @return GatherRealCost 归集费用(折后总额)：基于归集规则直接归集到分账单元的资源优惠后总价
     */
    public String getGatherRealCost() {
        return this.GatherRealCost;
    }

    /**
     * Set 归集费用(折后总额)：基于归集规则直接归集到分账单元的资源优惠后总价
     * @param GatherRealCost 归集费用(折后总额)：基于归集规则直接归集到分账单元的资源优惠后总价
     */
    public void setGatherRealCost(String GatherRealCost) {
        this.GatherRealCost = GatherRealCost;
    }

    /**
     * Get 分摊费用(折后总额)：基于分摊规则分摊到分账单元的资源优惠后总价 
     * @return AllocateRealCost 分摊费用(折后总额)：基于分摊规则分摊到分账单元的资源优惠后总价
     */
    public String getAllocateRealCost() {
        return this.AllocateRealCost;
    }

    /**
     * Set 分摊费用(折后总额)：基于分摊规则分摊到分账单元的资源优惠后总价
     * @param AllocateRealCost 分摊费用(折后总额)：基于分摊规则分摊到分账单元的资源优惠后总价
     */
    public void setAllocateRealCost(String AllocateRealCost) {
        this.AllocateRealCost = AllocateRealCost;
    }

    /**
     * Get 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额) 
     * @return RealTotalCost 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
     * @param RealTotalCost 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 占比(折后总额)：本分账单元合计费用(折后总额)/合计费用(折后总额)*100% 
     * @return Ratio 占比(折后总额)：本分账单元合计费用(折后总额)/合计费用(折后总额)*100%
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set 占比(折后总额)：本分账单元合计费用(折后总额)/合计费用(折后总额)*100%
     * @param Ratio 占比(折后总额)：本分账单元合计费用(折后总额)/合计费用(折后总额)*100%
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get 环比(折后总额)：[本月分账单元合计费用(折后总额) - 上月分账单元合计费用(折后总额)] / 上月分账单元合计费用(折后总额) * 100% 
     * @return Trend 环比(折后总额)：[本月分账单元合计费用(折后总额) - 上月分账单元合计费用(折后总额)] / 上月分账单元合计费用(折后总额) * 100%
     */
    public String getTrend() {
        return this.Trend;
    }

    /**
     * Set 环比(折后总额)：[本月分账单元合计费用(折后总额) - 上月分账单元合计费用(折后总额)] / 上月分账单元合计费用(折后总额) * 100%
     * @param Trend 环比(折后总额)：[本月分账单元合计费用(折后总额) - 上月分账单元合计费用(折后总额)] / 上月分账单元合计费用(折后总额) * 100%
     */
    public void setTrend(String Trend) {
        this.Trend = Trend;
    }

    /**
     * Get 环比箭头
upward -上升
downward - 下降
none - 平稳 
     * @return TrendType 环比箭头
upward -上升
downward - 下降
none - 平稳
     */
    public String getTrendType() {
        return this.TrendType;
    }

    /**
     * Set 环比箭头
upward -上升
downward - 下降
none - 平稳
     * @param TrendType 环比箭头
upward -上升
downward - 下降
none - 平稳
     */
    public void setTrendType(String TrendType) {
        this.TrendType = TrendType;
    }

    /**
     * Get 产品编码 
     * @return BusinessCode 产品编码
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 产品编码
     * @param BusinessCode 产品编码
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 产品名称：用户所采购的各类云产品 
     * @return BusinessCodeName 产品名称：用户所采购的各类云产品
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set 产品名称：用户所采购的各类云产品
     * @param BusinessCodeName 产品名称：用户所采购的各类云产品
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式 
     * @return TotalCost 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
     * @param TotalCost 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额 
     * @return RICost 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
     */
    public String getRICost() {
        return this.RICost;
    }

    /**
     * Set 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
     * @param RICost 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
     */
    public void setRICost(String RICost) {
        this.RICost = RICost;
    }

    /**
     * Get 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率 
     * @return SPCost 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
     */
    public String getSPCost() {
        return this.SPCost;
    }

    /**
     * Set 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
     * @param SPCost 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
     */
    public void setSPCost(String SPCost) {
        this.SPCost = SPCost;
    }

    /**
     * Get 现金账户支出(元)：通过现金账户支付的金额 
     * @return CashPayAmount 现金账户支出(元)：通过现金账户支付的金额
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金账户支出(元)：通过现金账户支付的金额
     * @param CashPayAmount 现金账户支出(元)：通过现金账户支付的金额
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额
 
     * @return VoucherPayAmount 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额

     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额

     * @param VoucherPayAmount 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额

     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 赠送账户支出(元)：使用赠送金支付的金额 
     * @return IncentivePayAmount 赠送账户支出(元)：使用赠送金支付的金额
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送账户支出(元)：使用赠送金支付的金额
     * @param IncentivePayAmount 赠送账户支出(元)：使用赠送金支付的金额
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 分成账户支出(元)：通过分成金账户支付的金额 
     * @return TransferPayAmount 分成账户支出(元)：通过分成金账户支付的金额
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set 分成账户支出(元)：通过分成金账户支付的金额
     * @param TransferPayAmount 分成账户支出(元)：通过分成金账户支付的金额
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率 
     * @return AllocationRealTotalCost 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
     */
    public String getAllocationRealTotalCost() {
        return this.AllocationRealTotalCost;
    }

    /**
     * Set 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
     * @param AllocationRealTotalCost 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
     */
    public void setAllocationRealTotalCost(String AllocationRealTotalCost) {
        this.AllocationRealTotalCost = AllocationRealTotalCost;
    }

    public AllocationSummaryByBusiness() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationSummaryByBusiness(AllocationSummaryByBusiness source) {
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.TreeNodeUniqKeyName != null) {
            this.TreeNodeUniqKeyName = new String(source.TreeNodeUniqKeyName);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.GatherCashPayAmount != null) {
            this.GatherCashPayAmount = new String(source.GatherCashPayAmount);
        }
        if (source.GatherVoucherPayAmount != null) {
            this.GatherVoucherPayAmount = new String(source.GatherVoucherPayAmount);
        }
        if (source.GatherIncentivePayAmount != null) {
            this.GatherIncentivePayAmount = new String(source.GatherIncentivePayAmount);
        }
        if (source.GatherTransferPayAmount != null) {
            this.GatherTransferPayAmount = new String(source.GatherTransferPayAmount);
        }
        if (source.AllocateCashPayAmount != null) {
            this.AllocateCashPayAmount = new String(source.AllocateCashPayAmount);
        }
        if (source.AllocateVoucherPayAmount != null) {
            this.AllocateVoucherPayAmount = new String(source.AllocateVoucherPayAmount);
        }
        if (source.AllocateIncentivePayAmount != null) {
            this.AllocateIncentivePayAmount = new String(source.AllocateIncentivePayAmount);
        }
        if (source.AllocateTransferPayAmount != null) {
            this.AllocateTransferPayAmount = new String(source.AllocateTransferPayAmount);
        }
        if (source.TotalCashPayAmount != null) {
            this.TotalCashPayAmount = new String(source.TotalCashPayAmount);
        }
        if (source.TotalVoucherPayAmount != null) {
            this.TotalVoucherPayAmount = new String(source.TotalVoucherPayAmount);
        }
        if (source.TotalIncentivePayAmount != null) {
            this.TotalIncentivePayAmount = new String(source.TotalIncentivePayAmount);
        }
        if (source.TotalTransferPayAmount != null) {
            this.TotalTransferPayAmount = new String(source.TotalTransferPayAmount);
        }
        if (source.GatherRealCost != null) {
            this.GatherRealCost = new String(source.GatherRealCost);
        }
        if (source.AllocateRealCost != null) {
            this.AllocateRealCost = new String(source.AllocateRealCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.Trend != null) {
            this.Trend = new String(source.Trend);
        }
        if (source.TrendType != null) {
            this.TrendType = new String(source.TrendType);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.RICost != null) {
            this.RICost = new String(source.RICost);
        }
        if (source.SPCost != null) {
            this.SPCost = new String(source.SPCost);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.AllocationRealTotalCost != null) {
            this.AllocationRealTotalCost = new String(source.AllocationRealTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "TreeNodeUniqKeyName", this.TreeNodeUniqKeyName);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "GatherCashPayAmount", this.GatherCashPayAmount);
        this.setParamSimple(map, prefix + "GatherVoucherPayAmount", this.GatherVoucherPayAmount);
        this.setParamSimple(map, prefix + "GatherIncentivePayAmount", this.GatherIncentivePayAmount);
        this.setParamSimple(map, prefix + "GatherTransferPayAmount", this.GatherTransferPayAmount);
        this.setParamSimple(map, prefix + "AllocateCashPayAmount", this.AllocateCashPayAmount);
        this.setParamSimple(map, prefix + "AllocateVoucherPayAmount", this.AllocateVoucherPayAmount);
        this.setParamSimple(map, prefix + "AllocateIncentivePayAmount", this.AllocateIncentivePayAmount);
        this.setParamSimple(map, prefix + "AllocateTransferPayAmount", this.AllocateTransferPayAmount);
        this.setParamSimple(map, prefix + "TotalCashPayAmount", this.TotalCashPayAmount);
        this.setParamSimple(map, prefix + "TotalVoucherPayAmount", this.TotalVoucherPayAmount);
        this.setParamSimple(map, prefix + "TotalIncentivePayAmount", this.TotalIncentivePayAmount);
        this.setParamSimple(map, prefix + "TotalTransferPayAmount", this.TotalTransferPayAmount);
        this.setParamSimple(map, prefix + "GatherRealCost", this.GatherRealCost);
        this.setParamSimple(map, prefix + "AllocateRealCost", this.AllocateRealCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Trend", this.Trend);
        this.setParamSimple(map, prefix + "TrendType", this.TrendType);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RICost", this.RICost);
        this.setParamSimple(map, prefix + "SPCost", this.SPCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "AllocationRealTotalCost", this.AllocationRealTotalCost);

    }
}

