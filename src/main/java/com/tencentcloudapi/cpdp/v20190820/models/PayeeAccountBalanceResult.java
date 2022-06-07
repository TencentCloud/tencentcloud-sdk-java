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

public class PayeeAccountBalanceResult extends AbstractModel{

    /**
    * 账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 收入类型
LABOR:劳务所得
OCCASION:偶然所得
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncomeType")
    @Expose
    private Long IncomeType;

    /**
    * 总余额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Balance")
    @Expose
    private String Balance;

    /**
    * 系统冻结余额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemFreezeBalance")
    @Expose
    private String SystemFreezeBalance;

    /**
    * 人工冻结余额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualFreezeBalance")
    @Expose
    private String ManualFreezeBalance;

    /**
    * 可提现余额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayableBalance")
    @Expose
    private String PayableBalance;

    /**
    * 已提现余额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaidBalance")
    @Expose
    private String PaidBalance;

    /**
    * 提现中余额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InPayBalance")
    @Expose
    private String InPayBalance;

    /**
     * Get 账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountId 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountId 账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 收入类型
LABOR:劳务所得
OCCASION:偶然所得
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncomeType 收入类型
LABOR:劳务所得
OCCASION:偶然所得
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIncomeType() {
        return this.IncomeType;
    }

    /**
     * Set 收入类型
LABOR:劳务所得
OCCASION:偶然所得
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncomeType 收入类型
LABOR:劳务所得
OCCASION:偶然所得
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncomeType(Long IncomeType) {
        this.IncomeType = IncomeType;
    }

    /**
     * Get 总余额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Balance 总余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBalance() {
        return this.Balance;
    }

    /**
     * Set 总余额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Balance 总余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 系统冻结余额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemFreezeBalance 系统冻结余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSystemFreezeBalance() {
        return this.SystemFreezeBalance;
    }

    /**
     * Set 系统冻结余额
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemFreezeBalance 系统冻结余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemFreezeBalance(String SystemFreezeBalance) {
        this.SystemFreezeBalance = SystemFreezeBalance;
    }

    /**
     * Get 人工冻结余额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualFreezeBalance 人工冻结余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManualFreezeBalance() {
        return this.ManualFreezeBalance;
    }

    /**
     * Set 人工冻结余额
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualFreezeBalance 人工冻结余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualFreezeBalance(String ManualFreezeBalance) {
        this.ManualFreezeBalance = ManualFreezeBalance;
    }

    /**
     * Get 可提现余额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayableBalance 可提现余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayableBalance() {
        return this.PayableBalance;
    }

    /**
     * Set 可提现余额
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayableBalance 可提现余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayableBalance(String PayableBalance) {
        this.PayableBalance = PayableBalance;
    }

    /**
     * Get 已提现余额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaidBalance 已提现余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaidBalance() {
        return this.PaidBalance;
    }

    /**
     * Set 已提现余额
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaidBalance 已提现余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaidBalance(String PaidBalance) {
        this.PaidBalance = PaidBalance;
    }

    /**
     * Get 提现中余额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InPayBalance 提现中余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInPayBalance() {
        return this.InPayBalance;
    }

    /**
     * Set 提现中余额
注意：此字段可能返回 null，表示取不到有效值。
     * @param InPayBalance 提现中余额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInPayBalance(String InPayBalance) {
        this.InPayBalance = InPayBalance;
    }

    public PayeeAccountBalanceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayeeAccountBalanceResult(PayeeAccountBalanceResult source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.IncomeType != null) {
            this.IncomeType = new Long(source.IncomeType);
        }
        if (source.Balance != null) {
            this.Balance = new String(source.Balance);
        }
        if (source.SystemFreezeBalance != null) {
            this.SystemFreezeBalance = new String(source.SystemFreezeBalance);
        }
        if (source.ManualFreezeBalance != null) {
            this.ManualFreezeBalance = new String(source.ManualFreezeBalance);
        }
        if (source.PayableBalance != null) {
            this.PayableBalance = new String(source.PayableBalance);
        }
        if (source.PaidBalance != null) {
            this.PaidBalance = new String(source.PaidBalance);
        }
        if (source.InPayBalance != null) {
            this.InPayBalance = new String(source.InPayBalance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "IncomeType", this.IncomeType);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "SystemFreezeBalance", this.SystemFreezeBalance);
        this.setParamSimple(map, prefix + "ManualFreezeBalance", this.ManualFreezeBalance);
        this.setParamSimple(map, prefix + "PayableBalance", this.PayableBalance);
        this.setParamSimple(map, prefix + "PaidBalance", this.PaidBalance);
        this.setParamSimple(map, prefix + "InPayBalance", this.InPayBalance);

    }
}

