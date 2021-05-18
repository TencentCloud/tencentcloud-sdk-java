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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BalanceTransaction extends AbstractModel{

    /**
    * 账户类型：1-设备接入 2-云存。
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 账户变更类型：Rechareg-充值；CreateOrder-新购。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 流水ID。
    */
    @SerializedName("DealId")
    @Expose
    private String DealId;

    /**
    * 变更金额，单位：分（人民币）。
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 变更后账户余额，单位：分（人民币）。
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * 变更时间。
    */
    @SerializedName("OperationTime")
    @Expose
    private Long OperationTime;

    /**
     * Get 账户类型：1-设备接入 2-云存。 
     * @return AccountType 账户类型：1-设备接入 2-云存。
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账户类型：1-设备接入 2-云存。
     * @param AccountType 账户类型：1-设备接入 2-云存。
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 账户变更类型：Rechareg-充值；CreateOrder-新购。 
     * @return Operation 账户变更类型：Rechareg-充值；CreateOrder-新购。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 账户变更类型：Rechareg-充值；CreateOrder-新购。
     * @param Operation 账户变更类型：Rechareg-充值；CreateOrder-新购。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 流水ID。 
     * @return DealId 流水ID。
     */
    public String getDealId() {
        return this.DealId;
    }

    /**
     * Set 流水ID。
     * @param DealId 流水ID。
     */
    public void setDealId(String DealId) {
        this.DealId = DealId;
    }

    /**
     * Get 变更金额，单位：分（人民币）。 
     * @return Amount 变更金额，单位：分（人民币）。
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 变更金额，单位：分（人民币）。
     * @param Amount 变更金额，单位：分（人民币）。
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 变更后账户余额，单位：分（人民币）。 
     * @return Balance 变更后账户余额，单位：分（人民币）。
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set 变更后账户余额，单位：分（人民币）。
     * @param Balance 变更后账户余额，单位：分（人民币）。
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 变更时间。 
     * @return OperationTime 变更时间。
     */
    public Long getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set 变更时间。
     * @param OperationTime 变更时间。
     */
    public void setOperationTime(Long OperationTime) {
        this.OperationTime = OperationTime;
    }

    public BalanceTransaction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BalanceTransaction(BalanceTransaction source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.DealId != null) {
            this.DealId = new String(source.DealId);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.Balance != null) {
            this.Balance = new Long(source.Balance);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new Long(source.OperationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "DealId", this.DealId);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);

    }
}

