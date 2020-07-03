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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

