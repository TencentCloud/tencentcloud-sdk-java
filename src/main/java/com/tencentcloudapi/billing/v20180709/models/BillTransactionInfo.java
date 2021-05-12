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

public class BillTransactionInfo extends AbstractModel{

    /**
    * 收支类型：deduct 扣费, recharge 充值, return 退费， block 冻结, unblock 解冻
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 流水金额，单位（分）；正数表示入账，负数表示出账
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 可用余额，单位（分）；正数表示入账，负数表示出账
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * 流水号，如20190131020000236005203583326401
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * 描述信息
    */
    @SerializedName("OperationInfo")
    @Expose
    private String OperationInfo;

    /**
    * 操作时间"2019-01-31 23:35:10.000"
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
    * 现金账户余额，单位（分）
    */
    @SerializedName("Cash")
    @Expose
    private Long Cash;

    /**
    * 赠送金余额，单位（分）
    */
    @SerializedName("Incentive")
    @Expose
    private Long Incentive;

    /**
    * 冻结余额，单位（分）
    */
    @SerializedName("Freezing")
    @Expose
    private Long Freezing;

    /**
    * 交易渠道
    */
    @SerializedName("PayChannel")
    @Expose
    private String PayChannel;

    /**
    * 扣费模式：trade 包年包月(预付费)，hourh  按量-小时结，hourd 按量-日结，hourm 按量-月结，month 按量-月结
    */
    @SerializedName("DeductMode")
    @Expose
    private String DeductMode;

    /**
     * Get 收支类型：deduct 扣费, recharge 充值, return 退费， block 冻结, unblock 解冻 
     * @return ActionType 收支类型：deduct 扣费, recharge 充值, return 退费， block 冻结, unblock 解冻
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 收支类型：deduct 扣费, recharge 充值, return 退费， block 冻结, unblock 解冻
     * @param ActionType 收支类型：deduct 扣费, recharge 充值, return 退费， block 冻结, unblock 解冻
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 流水金额，单位（分）；正数表示入账，负数表示出账 
     * @return Amount 流水金额，单位（分）；正数表示入账，负数表示出账
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 流水金额，单位（分）；正数表示入账，负数表示出账
     * @param Amount 流水金额，单位（分）；正数表示入账，负数表示出账
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 可用余额，单位（分）；正数表示入账，负数表示出账 
     * @return Balance 可用余额，单位（分）；正数表示入账，负数表示出账
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set 可用余额，单位（分）；正数表示入账，负数表示出账
     * @param Balance 可用余额，单位（分）；正数表示入账，负数表示出账
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 流水号，如20190131020000236005203583326401 
     * @return BillId 流水号，如20190131020000236005203583326401
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set 流水号，如20190131020000236005203583326401
     * @param BillId 流水号，如20190131020000236005203583326401
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get 描述信息 
     * @return OperationInfo 描述信息
     */
    public String getOperationInfo() {
        return this.OperationInfo;
    }

    /**
     * Set 描述信息
     * @param OperationInfo 描述信息
     */
    public void setOperationInfo(String OperationInfo) {
        this.OperationInfo = OperationInfo;
    }

    /**
     * Get 操作时间"2019-01-31 23:35:10.000" 
     * @return OperationTime 操作时间"2019-01-31 23:35:10.000"
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set 操作时间"2019-01-31 23:35:10.000"
     * @param OperationTime 操作时间"2019-01-31 23:35:10.000"
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    /**
     * Get 现金账户余额，单位（分） 
     * @return Cash 现金账户余额，单位（分）
     */
    public Long getCash() {
        return this.Cash;
    }

    /**
     * Set 现金账户余额，单位（分）
     * @param Cash 现金账户余额，单位（分）
     */
    public void setCash(Long Cash) {
        this.Cash = Cash;
    }

    /**
     * Get 赠送金余额，单位（分） 
     * @return Incentive 赠送金余额，单位（分）
     */
    public Long getIncentive() {
        return this.Incentive;
    }

    /**
     * Set 赠送金余额，单位（分）
     * @param Incentive 赠送金余额，单位（分）
     */
    public void setIncentive(Long Incentive) {
        this.Incentive = Incentive;
    }

    /**
     * Get 冻结余额，单位（分） 
     * @return Freezing 冻结余额，单位（分）
     */
    public Long getFreezing() {
        return this.Freezing;
    }

    /**
     * Set 冻结余额，单位（分）
     * @param Freezing 冻结余额，单位（分）
     */
    public void setFreezing(Long Freezing) {
        this.Freezing = Freezing;
    }

    /**
     * Get 交易渠道 
     * @return PayChannel 交易渠道
     */
    public String getPayChannel() {
        return this.PayChannel;
    }

    /**
     * Set 交易渠道
     * @param PayChannel 交易渠道
     */
    public void setPayChannel(String PayChannel) {
        this.PayChannel = PayChannel;
    }

    /**
     * Get 扣费模式：trade 包年包月(预付费)，hourh  按量-小时结，hourd 按量-日结，hourm 按量-月结，month 按量-月结 
     * @return DeductMode 扣费模式：trade 包年包月(预付费)，hourh  按量-小时结，hourd 按量-日结，hourm 按量-月结，month 按量-月结
     */
    public String getDeductMode() {
        return this.DeductMode;
    }

    /**
     * Set 扣费模式：trade 包年包月(预付费)，hourh  按量-小时结，hourd 按量-日结，hourm 按量-月结，month 按量-月结
     * @param DeductMode 扣费模式：trade 包年包月(预付费)，hourh  按量-小时结，hourd 按量-日结，hourm 按量-月结，month 按量-月结
     */
    public void setDeductMode(String DeductMode) {
        this.DeductMode = DeductMode;
    }

    public BillTransactionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillTransactionInfo(BillTransactionInfo source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.Balance != null) {
            this.Balance = new Long(source.Balance);
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.OperationInfo != null) {
            this.OperationInfo = new String(source.OperationInfo);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
        if (source.Cash != null) {
            this.Cash = new Long(source.Cash);
        }
        if (source.Incentive != null) {
            this.Incentive = new Long(source.Incentive);
        }
        if (source.Freezing != null) {
            this.Freezing = new Long(source.Freezing);
        }
        if (source.PayChannel != null) {
            this.PayChannel = new String(source.PayChannel);
        }
        if (source.DeductMode != null) {
            this.DeductMode = new String(source.DeductMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "OperationInfo", this.OperationInfo);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);
        this.setParamSimple(map, prefix + "Cash", this.Cash);
        this.setParamSimple(map, prefix + "Incentive", this.Incentive);
        this.setParamSimple(map, prefix + "Freezing", this.Freezing);
        this.setParamSimple(map, prefix + "PayChannel", this.PayChannel);
        this.setParamSimple(map, prefix + "DeductMode", this.DeductMode);

    }
}

