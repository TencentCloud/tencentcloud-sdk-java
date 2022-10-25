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

public class QueryOpenBankSettleOrderResult extends AbstractModel{

    /**
    * 外部结算流水号
    */
    @SerializedName("OutSettleId")
    @Expose
    private String OutSettleId;

    /**
    * 渠道结算流水号
    */
    @SerializedName("ChannelSettleId")
    @Expose
    private String ChannelSettleId;

    /**
    * 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SettleStatus")
    @Expose
    private String SettleStatus;

    /**
    * 结算金额
    */
    @SerializedName("SettleAmount")
    @Expose
    private Long SettleAmount;

    /**
    * 结算日期，格式YYYYMMdd
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SettleDate")
    @Expose
    private String SettleDate;

    /**
    * 结算类型（T1/D1）
    */
    @SerializedName("SettleType")
    @Expose
    private String SettleType;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeFinish")
    @Expose
    private String TimeFinish;

    /**
    * 结算手续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SettleFee")
    @Expose
    private String SettleFee;

    /**
    * 账户货币。参考附录“币种类型”。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get 外部结算流水号 
     * @return OutSettleId 外部结算流水号
     */
    public String getOutSettleId() {
        return this.OutSettleId;
    }

    /**
     * Set 外部结算流水号
     * @param OutSettleId 外部结算流水号
     */
    public void setOutSettleId(String OutSettleId) {
        this.OutSettleId = OutSettleId;
    }

    /**
     * Get 渠道结算流水号 
     * @return ChannelSettleId 渠道结算流水号
     */
    public String getChannelSettleId() {
        return this.ChannelSettleId;
    }

    /**
     * Set 渠道结算流水号
     * @param ChannelSettleId 渠道结算流水号
     */
    public void setChannelSettleId(String ChannelSettleId) {
        this.ChannelSettleId = ChannelSettleId;
    }

    /**
     * Get 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SettleStatus 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSettleStatus() {
        return this.SettleStatus;
    }

    /**
     * Set 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
注意：此字段可能返回 null，表示取不到有效值。
     * @param SettleStatus 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSettleStatus(String SettleStatus) {
        this.SettleStatus = SettleStatus;
    }

    /**
     * Get 结算金额 
     * @return SettleAmount 结算金额
     */
    public Long getSettleAmount() {
        return this.SettleAmount;
    }

    /**
     * Set 结算金额
     * @param SettleAmount 结算金额
     */
    public void setSettleAmount(Long SettleAmount) {
        this.SettleAmount = SettleAmount;
    }

    /**
     * Get 结算日期，格式YYYYMMdd
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SettleDate 结算日期，格式YYYYMMdd
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSettleDate() {
        return this.SettleDate;
    }

    /**
     * Set 结算日期，格式YYYYMMdd
注意：此字段可能返回 null，表示取不到有效值。
     * @param SettleDate 结算日期，格式YYYYMMdd
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSettleDate(String SettleDate) {
        this.SettleDate = SettleDate;
    }

    /**
     * Get 结算类型（T1/D1） 
     * @return SettleType 结算类型（T1/D1）
     */
    public String getSettleType() {
        return this.SettleType;
    }

    /**
     * Set 结算类型（T1/D1）
     * @param SettleType 结算类型（T1/D1）
     */
    public void setSettleType(String SettleType) {
        this.SettleType = SettleType;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeFinish 完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeFinish() {
        return this.TimeFinish;
    }

    /**
     * Set 完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeFinish 完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeFinish(String TimeFinish) {
        this.TimeFinish = TimeFinish;
    }

    /**
     * Get 结算手续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SettleFee 结算手续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSettleFee() {
        return this.SettleFee;
    }

    /**
     * Set 结算手续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param SettleFee 结算手续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSettleFee(String SettleFee) {
        this.SettleFee = SettleFee;
    }

    /**
     * Get 账户货币。参考附录“币种类型”。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Currency 账户货币。参考附录“币种类型”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 账户货币。参考附录“币种类型”。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Currency 账户货币。参考附录“币种类型”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public QueryOpenBankSettleOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankSettleOrderResult(QueryOpenBankSettleOrderResult source) {
        if (source.OutSettleId != null) {
            this.OutSettleId = new String(source.OutSettleId);
        }
        if (source.ChannelSettleId != null) {
            this.ChannelSettleId = new String(source.ChannelSettleId);
        }
        if (source.SettleStatus != null) {
            this.SettleStatus = new String(source.SettleStatus);
        }
        if (source.SettleAmount != null) {
            this.SettleAmount = new Long(source.SettleAmount);
        }
        if (source.SettleDate != null) {
            this.SettleDate = new String(source.SettleDate);
        }
        if (source.SettleType != null) {
            this.SettleType = new String(source.SettleType);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.TimeFinish != null) {
            this.TimeFinish = new String(source.TimeFinish);
        }
        if (source.SettleFee != null) {
            this.SettleFee = new String(source.SettleFee);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutSettleId", this.OutSettleId);
        this.setParamSimple(map, prefix + "ChannelSettleId", this.ChannelSettleId);
        this.setParamSimple(map, prefix + "SettleStatus", this.SettleStatus);
        this.setParamSimple(map, prefix + "SettleAmount", this.SettleAmount);
        this.setParamSimple(map, prefix + "SettleDate", this.SettleDate);
        this.setParamSimple(map, prefix + "SettleType", this.SettleType);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "TimeFinish", this.TimeFinish);
        this.setParamSimple(map, prefix + "SettleFee", this.SettleFee);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

