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

public class QueryOpenBankExternalSubMerchantBankAccountData extends AbstractModel{

    /**
    * 开户银行。
    */
    @SerializedName("AccountBank")
    @Expose
    private String AccountBank;

    /**
    * 绑卡序列号。
    */
    @SerializedName("BindSerialNo")
    @Expose
    private String BindSerialNo;

    /**
    * 账号类型。
__COLLECT_MONEY__: 收款卡
__PAYMENT__: 付款卡
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 支行号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankBranchId")
    @Expose
    private String BankBranchId;

    /**
    * 银行卡卡后四位。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountNumberLastFour")
    @Expose
    private String AccountNumberLastFour;

    /**
     * Get 开户银行。 
     * @return AccountBank 开户银行。
     */
    public String getAccountBank() {
        return this.AccountBank;
    }

    /**
     * Set 开户银行。
     * @param AccountBank 开户银行。
     */
    public void setAccountBank(String AccountBank) {
        this.AccountBank = AccountBank;
    }

    /**
     * Get 绑卡序列号。 
     * @return BindSerialNo 绑卡序列号。
     */
    public String getBindSerialNo() {
        return this.BindSerialNo;
    }

    /**
     * Set 绑卡序列号。
     * @param BindSerialNo 绑卡序列号。
     */
    public void setBindSerialNo(String BindSerialNo) {
        this.BindSerialNo = BindSerialNo;
    }

    /**
     * Get 账号类型。
__COLLECT_MONEY__: 收款卡
__PAYMENT__: 付款卡 
     * @return AccountType 账号类型。
__COLLECT_MONEY__: 收款卡
__PAYMENT__: 付款卡
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账号类型。
__COLLECT_MONEY__: 收款卡
__PAYMENT__: 付款卡
     * @param AccountType 账号类型。
__COLLECT_MONEY__: 收款卡
__PAYMENT__: 付款卡
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 支行号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankBranchId 支行号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankBranchId() {
        return this.BankBranchId;
    }

    /**
     * Set 支行号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankBranchId 支行号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankBranchId(String BankBranchId) {
        this.BankBranchId = BankBranchId;
    }

    /**
     * Get 银行卡卡后四位。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountNumberLastFour 银行卡卡后四位。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountNumberLastFour() {
        return this.AccountNumberLastFour;
    }

    /**
     * Set 银行卡卡后四位。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountNumberLastFour 银行卡卡后四位。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountNumberLastFour(String AccountNumberLastFour) {
        this.AccountNumberLastFour = AccountNumberLastFour;
    }

    public QueryOpenBankExternalSubMerchantBankAccountData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankExternalSubMerchantBankAccountData(QueryOpenBankExternalSubMerchantBankAccountData source) {
        if (source.AccountBank != null) {
            this.AccountBank = new String(source.AccountBank);
        }
        if (source.BindSerialNo != null) {
            this.BindSerialNo = new String(source.BindSerialNo);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.BankBranchId != null) {
            this.BankBranchId = new String(source.BankBranchId);
        }
        if (source.AccountNumberLastFour != null) {
            this.AccountNumberLastFour = new String(source.AccountNumberLastFour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountBank", this.AccountBank);
        this.setParamSimple(map, prefix + "BindSerialNo", this.BindSerialNo);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "BankBranchId", this.BankBranchId);
        this.setParamSimple(map, prefix + "AccountNumberLastFour", this.AccountNumberLastFour);

    }
}

