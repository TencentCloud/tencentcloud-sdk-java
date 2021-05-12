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

public class DescribeBillListResponse extends AbstractModel{

    /**
    * 收支明细列表
    */
    @SerializedName("TransactionList")
    @Expose
    private BillTransactionInfo [] TransactionList;

    /**
    * 总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 退费总额，单位（分）
    */
    @SerializedName("ReturnAmount")
    @Expose
    private Float ReturnAmount;

    /**
    * 充值总额，单位（分）
    */
    @SerializedName("RechargeAmount")
    @Expose
    private Float RechargeAmount;

    /**
    * 冻结总额，单位（分）
    */
    @SerializedName("BlockAmount")
    @Expose
    private Float BlockAmount;

    /**
    * 解冻总额，单位（分）
    */
    @SerializedName("UnblockAmount")
    @Expose
    private Float UnblockAmount;

    /**
    * 扣费总额，单位（分）
    */
    @SerializedName("DeductAmount")
    @Expose
    private Float DeductAmount;

    /**
    * 资金转入总额，单位（分）
    */
    @SerializedName("AgentInAmount")
    @Expose
    private Float AgentInAmount;

    /**
    * 垫付充值总额，单位（分）
    */
    @SerializedName("AdvanceRechargeAmount")
    @Expose
    private Float AdvanceRechargeAmount;

    /**
    * 提现扣减总额，单位（分）
    */
    @SerializedName("WithdrawAmount")
    @Expose
    private Float WithdrawAmount;

    /**
    * 资金转出总额，单位（分）
    */
    @SerializedName("AgentOutAmount")
    @Expose
    private Float AgentOutAmount;

    /**
    * 还垫付总额，单位（分）
    */
    @SerializedName("AdvancePayAmount")
    @Expose
    private Float AdvancePayAmount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 收支明细列表 
     * @return TransactionList 收支明细列表
     */
    public BillTransactionInfo [] getTransactionList() {
        return this.TransactionList;
    }

    /**
     * Set 收支明细列表
     * @param TransactionList 收支明细列表
     */
    public void setTransactionList(BillTransactionInfo [] TransactionList) {
        this.TransactionList = TransactionList;
    }

    /**
     * Get 总条数 
     * @return Total 总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条数
     * @param Total 总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 退费总额，单位（分） 
     * @return ReturnAmount 退费总额，单位（分）
     */
    public Float getReturnAmount() {
        return this.ReturnAmount;
    }

    /**
     * Set 退费总额，单位（分）
     * @param ReturnAmount 退费总额，单位（分）
     */
    public void setReturnAmount(Float ReturnAmount) {
        this.ReturnAmount = ReturnAmount;
    }

    /**
     * Get 充值总额，单位（分） 
     * @return RechargeAmount 充值总额，单位（分）
     */
    public Float getRechargeAmount() {
        return this.RechargeAmount;
    }

    /**
     * Set 充值总额，单位（分）
     * @param RechargeAmount 充值总额，单位（分）
     */
    public void setRechargeAmount(Float RechargeAmount) {
        this.RechargeAmount = RechargeAmount;
    }

    /**
     * Get 冻结总额，单位（分） 
     * @return BlockAmount 冻结总额，单位（分）
     */
    public Float getBlockAmount() {
        return this.BlockAmount;
    }

    /**
     * Set 冻结总额，单位（分）
     * @param BlockAmount 冻结总额，单位（分）
     */
    public void setBlockAmount(Float BlockAmount) {
        this.BlockAmount = BlockAmount;
    }

    /**
     * Get 解冻总额，单位（分） 
     * @return UnblockAmount 解冻总额，单位（分）
     */
    public Float getUnblockAmount() {
        return this.UnblockAmount;
    }

    /**
     * Set 解冻总额，单位（分）
     * @param UnblockAmount 解冻总额，单位（分）
     */
    public void setUnblockAmount(Float UnblockAmount) {
        this.UnblockAmount = UnblockAmount;
    }

    /**
     * Get 扣费总额，单位（分） 
     * @return DeductAmount 扣费总额，单位（分）
     */
    public Float getDeductAmount() {
        return this.DeductAmount;
    }

    /**
     * Set 扣费总额，单位（分）
     * @param DeductAmount 扣费总额，单位（分）
     */
    public void setDeductAmount(Float DeductAmount) {
        this.DeductAmount = DeductAmount;
    }

    /**
     * Get 资金转入总额，单位（分） 
     * @return AgentInAmount 资金转入总额，单位（分）
     */
    public Float getAgentInAmount() {
        return this.AgentInAmount;
    }

    /**
     * Set 资金转入总额，单位（分）
     * @param AgentInAmount 资金转入总额，单位（分）
     */
    public void setAgentInAmount(Float AgentInAmount) {
        this.AgentInAmount = AgentInAmount;
    }

    /**
     * Get 垫付充值总额，单位（分） 
     * @return AdvanceRechargeAmount 垫付充值总额，单位（分）
     */
    public Float getAdvanceRechargeAmount() {
        return this.AdvanceRechargeAmount;
    }

    /**
     * Set 垫付充值总额，单位（分）
     * @param AdvanceRechargeAmount 垫付充值总额，单位（分）
     */
    public void setAdvanceRechargeAmount(Float AdvanceRechargeAmount) {
        this.AdvanceRechargeAmount = AdvanceRechargeAmount;
    }

    /**
     * Get 提现扣减总额，单位（分） 
     * @return WithdrawAmount 提现扣减总额，单位（分）
     */
    public Float getWithdrawAmount() {
        return this.WithdrawAmount;
    }

    /**
     * Set 提现扣减总额，单位（分）
     * @param WithdrawAmount 提现扣减总额，单位（分）
     */
    public void setWithdrawAmount(Float WithdrawAmount) {
        this.WithdrawAmount = WithdrawAmount;
    }

    /**
     * Get 资金转出总额，单位（分） 
     * @return AgentOutAmount 资金转出总额，单位（分）
     */
    public Float getAgentOutAmount() {
        return this.AgentOutAmount;
    }

    /**
     * Set 资金转出总额，单位（分）
     * @param AgentOutAmount 资金转出总额，单位（分）
     */
    public void setAgentOutAmount(Float AgentOutAmount) {
        this.AgentOutAmount = AgentOutAmount;
    }

    /**
     * Get 还垫付总额，单位（分） 
     * @return AdvancePayAmount 还垫付总额，单位（分）
     */
    public Float getAdvancePayAmount() {
        return this.AdvancePayAmount;
    }

    /**
     * Set 还垫付总额，单位（分）
     * @param AdvancePayAmount 还垫付总额，单位（分）
     */
    public void setAdvancePayAmount(Float AdvancePayAmount) {
        this.AdvancePayAmount = AdvancePayAmount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBillListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillListResponse(DescribeBillListResponse source) {
        if (source.TransactionList != null) {
            this.TransactionList = new BillTransactionInfo[source.TransactionList.length];
            for (int i = 0; i < source.TransactionList.length; i++) {
                this.TransactionList[i] = new BillTransactionInfo(source.TransactionList[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ReturnAmount != null) {
            this.ReturnAmount = new Float(source.ReturnAmount);
        }
        if (source.RechargeAmount != null) {
            this.RechargeAmount = new Float(source.RechargeAmount);
        }
        if (source.BlockAmount != null) {
            this.BlockAmount = new Float(source.BlockAmount);
        }
        if (source.UnblockAmount != null) {
            this.UnblockAmount = new Float(source.UnblockAmount);
        }
        if (source.DeductAmount != null) {
            this.DeductAmount = new Float(source.DeductAmount);
        }
        if (source.AgentInAmount != null) {
            this.AgentInAmount = new Float(source.AgentInAmount);
        }
        if (source.AdvanceRechargeAmount != null) {
            this.AdvanceRechargeAmount = new Float(source.AdvanceRechargeAmount);
        }
        if (source.WithdrawAmount != null) {
            this.WithdrawAmount = new Float(source.WithdrawAmount);
        }
        if (source.AgentOutAmount != null) {
            this.AgentOutAmount = new Float(source.AgentOutAmount);
        }
        if (source.AdvancePayAmount != null) {
            this.AdvancePayAmount = new Float(source.AdvancePayAmount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TransactionList.", this.TransactionList);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ReturnAmount", this.ReturnAmount);
        this.setParamSimple(map, prefix + "RechargeAmount", this.RechargeAmount);
        this.setParamSimple(map, prefix + "BlockAmount", this.BlockAmount);
        this.setParamSimple(map, prefix + "UnblockAmount", this.UnblockAmount);
        this.setParamSimple(map, prefix + "DeductAmount", this.DeductAmount);
        this.setParamSimple(map, prefix + "AgentInAmount", this.AgentInAmount);
        this.setParamSimple(map, prefix + "AdvanceRechargeAmount", this.AdvanceRechargeAmount);
        this.setParamSimple(map, prefix + "WithdrawAmount", this.WithdrawAmount);
        this.setParamSimple(map, prefix + "AgentOutAmount", this.AgentOutAmount);
        this.setParamSimple(map, prefix + "AdvancePayAmount", this.AdvancePayAmount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

