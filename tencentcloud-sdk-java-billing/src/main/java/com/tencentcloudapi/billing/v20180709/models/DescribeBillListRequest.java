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

public class DescribeBillListRequest extends AbstractModel{

    /**
    * 查询范围的起始时间（包含）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询范围的结束时间（包含）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 翻页偏移量，初始值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页的限制数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 交易类型： all所有交易类型，recharge充值，return退款，unblock解冻，agentin资金转入，advanced垫付，cash提现，deduct扣费，block冻结，agentout资金转出，repay垫付回款，repayment还款(仅国际信用账户)，adj_refund调增(仅国际信用账户)，adj_deduct调减(仅国际信用账户)
    */
    @SerializedName("PayType")
    @Expose
    private String [] PayType;

    /**
    * 扣费模式，当所选的交易类型中包含扣费deduct时有意义： all所有扣费类型，trade预付费支付，hour_h按量小时结，hour_d按量日结，hour_m按量月结，decompensate调账扣费，other其他扣费
    */
    @SerializedName("SubPayType")
    @Expose
    private String [] SubPayType;

    /**
    * 是否返回0元交易金额的交易项，取值：0-不返回，1-返回。不传该参数则不返回
    */
    @SerializedName("WithZeroAmount")
    @Expose
    private Long WithZeroAmount;

    /**
     * Get 查询范围的起始时间（包含） 
     * @return StartTime 查询范围的起始时间（包含）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询范围的起始时间（包含）
     * @param StartTime 查询范围的起始时间（包含）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询范围的结束时间（包含） 
     * @return EndTime 查询范围的结束时间（包含）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询范围的结束时间（包含）
     * @param EndTime 查询范围的结束时间（包含）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 翻页偏移量，初始值为0 
     * @return Offset 翻页偏移量，初始值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量，初始值为0
     * @param Offset 翻页偏移量，初始值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页的限制数量 
     * @return Limit 每页的限制数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页的限制数量
     * @param Limit 每页的限制数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 交易类型： all所有交易类型，recharge充值，return退款，unblock解冻，agentin资金转入，advanced垫付，cash提现，deduct扣费，block冻结，agentout资金转出，repay垫付回款，repayment还款(仅国际信用账户)，adj_refund调增(仅国际信用账户)，adj_deduct调减(仅国际信用账户) 
     * @return PayType 交易类型： all所有交易类型，recharge充值，return退款，unblock解冻，agentin资金转入，advanced垫付，cash提现，deduct扣费，block冻结，agentout资金转出，repay垫付回款，repayment还款(仅国际信用账户)，adj_refund调增(仅国际信用账户)，adj_deduct调减(仅国际信用账户)
     */
    public String [] getPayType() {
        return this.PayType;
    }

    /**
     * Set 交易类型： all所有交易类型，recharge充值，return退款，unblock解冻，agentin资金转入，advanced垫付，cash提现，deduct扣费，block冻结，agentout资金转出，repay垫付回款，repayment还款(仅国际信用账户)，adj_refund调增(仅国际信用账户)，adj_deduct调减(仅国际信用账户)
     * @param PayType 交易类型： all所有交易类型，recharge充值，return退款，unblock解冻，agentin资金转入，advanced垫付，cash提现，deduct扣费，block冻结，agentout资金转出，repay垫付回款，repayment还款(仅国际信用账户)，adj_refund调增(仅国际信用账户)，adj_deduct调减(仅国际信用账户)
     */
    public void setPayType(String [] PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 扣费模式，当所选的交易类型中包含扣费deduct时有意义： all所有扣费类型，trade预付费支付，hour_h按量小时结，hour_d按量日结，hour_m按量月结，decompensate调账扣费，other其他扣费 
     * @return SubPayType 扣费模式，当所选的交易类型中包含扣费deduct时有意义： all所有扣费类型，trade预付费支付，hour_h按量小时结，hour_d按量日结，hour_m按量月结，decompensate调账扣费，other其他扣费
     */
    public String [] getSubPayType() {
        return this.SubPayType;
    }

    /**
     * Set 扣费模式，当所选的交易类型中包含扣费deduct时有意义： all所有扣费类型，trade预付费支付，hour_h按量小时结，hour_d按量日结，hour_m按量月结，decompensate调账扣费，other其他扣费
     * @param SubPayType 扣费模式，当所选的交易类型中包含扣费deduct时有意义： all所有扣费类型，trade预付费支付，hour_h按量小时结，hour_d按量日结，hour_m按量月结，decompensate调账扣费，other其他扣费
     */
    public void setSubPayType(String [] SubPayType) {
        this.SubPayType = SubPayType;
    }

    /**
     * Get 是否返回0元交易金额的交易项，取值：0-不返回，1-返回。不传该参数则不返回 
     * @return WithZeroAmount 是否返回0元交易金额的交易项，取值：0-不返回，1-返回。不传该参数则不返回
     */
    public Long getWithZeroAmount() {
        return this.WithZeroAmount;
    }

    /**
     * Set 是否返回0元交易金额的交易项，取值：0-不返回，1-返回。不传该参数则不返回
     * @param WithZeroAmount 是否返回0元交易金额的交易项，取值：0-不返回，1-返回。不传该参数则不返回
     */
    public void setWithZeroAmount(Long WithZeroAmount) {
        this.WithZeroAmount = WithZeroAmount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "PayType.", this.PayType);
        this.setParamArraySimple(map, prefix + "SubPayType.", this.SubPayType);
        this.setParamSimple(map, prefix + "WithZeroAmount", this.WithZeroAmount);

    }
}

