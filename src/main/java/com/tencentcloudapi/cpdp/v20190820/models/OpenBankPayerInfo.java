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

public class OpenBankPayerInfo extends AbstractModel{

    /**
    * 付款方唯一标识。当TENPAY时，必填上送
付款方入驻云企付商户ID。
    */
    @SerializedName("PayerId")
    @Expose
    private String PayerId;

    /**
    * 付款方名称。当TENPAY上送付款方入驻云企付的商户名称。
    */
    @SerializedName("PayerName")
    @Expose
    private String PayerName;

    /**
    * 付款方付款账户标识。
当付款方式为OPENBANK_PAYMENT时，必输表示企业账户ID；当付款方式为SAFT_ISV时，必须上送付款方的渠道电子记账本ID；当付款方式为ONLINEBANK，上送付款方银行编号BankId。
    */
    @SerializedName("BindSerialNo")
    @Expose
    private String BindSerialNo;

    /**
    * 付款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID。
当付款方式为SAFT_ISV时，必须上送类型为ACCOUNT_BOOK_ID。
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 付款卡类型。汇付渠道必填。
DEBIT_CARD：借记卡
CREDIT_CARD：信用卡
    */
    @SerializedName("BankCardType")
    @Expose
    private String BankCardType;

    /**
     * Get 付款方唯一标识。当TENPAY时，必填上送
付款方入驻云企付商户ID。 
     * @return PayerId 付款方唯一标识。当TENPAY时，必填上送
付款方入驻云企付商户ID。
     */
    public String getPayerId() {
        return this.PayerId;
    }

    /**
     * Set 付款方唯一标识。当TENPAY时，必填上送
付款方入驻云企付商户ID。
     * @param PayerId 付款方唯一标识。当TENPAY时，必填上送
付款方入驻云企付商户ID。
     */
    public void setPayerId(String PayerId) {
        this.PayerId = PayerId;
    }

    /**
     * Get 付款方名称。当TENPAY上送付款方入驻云企付的商户名称。 
     * @return PayerName 付款方名称。当TENPAY上送付款方入驻云企付的商户名称。
     */
    public String getPayerName() {
        return this.PayerName;
    }

    /**
     * Set 付款方名称。当TENPAY上送付款方入驻云企付的商户名称。
     * @param PayerName 付款方名称。当TENPAY上送付款方入驻云企付的商户名称。
     */
    public void setPayerName(String PayerName) {
        this.PayerName = PayerName;
    }

    /**
     * Get 付款方付款账户标识。
当付款方式为OPENBANK_PAYMENT时，必输表示企业账户ID；当付款方式为SAFT_ISV时，必须上送付款方的渠道电子记账本ID；当付款方式为ONLINEBANK，上送付款方银行编号BankId。 
     * @return BindSerialNo 付款方付款账户标识。
当付款方式为OPENBANK_PAYMENT时，必输表示企业账户ID；当付款方式为SAFT_ISV时，必须上送付款方的渠道电子记账本ID；当付款方式为ONLINEBANK，上送付款方银行编号BankId。
     */
    public String getBindSerialNo() {
        return this.BindSerialNo;
    }

    /**
     * Set 付款方付款账户标识。
当付款方式为OPENBANK_PAYMENT时，必输表示企业账户ID；当付款方式为SAFT_ISV时，必须上送付款方的渠道电子记账本ID；当付款方式为ONLINEBANK，上送付款方银行编号BankId。
     * @param BindSerialNo 付款方付款账户标识。
当付款方式为OPENBANK_PAYMENT时，必输表示企业账户ID；当付款方式为SAFT_ISV时，必须上送付款方的渠道电子记账本ID；当付款方式为ONLINEBANK，上送付款方银行编号BankId。
     */
    public void setBindSerialNo(String BindSerialNo) {
        this.BindSerialNo = BindSerialNo;
    }

    /**
     * Get 付款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID。
当付款方式为SAFT_ISV时，必须上送类型为ACCOUNT_BOOK_ID。 
     * @return AccountType 付款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID。
当付款方式为SAFT_ISV时，必须上送类型为ACCOUNT_BOOK_ID。
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 付款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID。
当付款方式为SAFT_ISV时，必须上送类型为ACCOUNT_BOOK_ID。
     * @param AccountType 付款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID。
当付款方式为SAFT_ISV时，必须上送类型为ACCOUNT_BOOK_ID。
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 付款卡类型。汇付渠道必填。
DEBIT_CARD：借记卡
CREDIT_CARD：信用卡 
     * @return BankCardType 付款卡类型。汇付渠道必填。
DEBIT_CARD：借记卡
CREDIT_CARD：信用卡
     */
    public String getBankCardType() {
        return this.BankCardType;
    }

    /**
     * Set 付款卡类型。汇付渠道必填。
DEBIT_CARD：借记卡
CREDIT_CARD：信用卡
     * @param BankCardType 付款卡类型。汇付渠道必填。
DEBIT_CARD：借记卡
CREDIT_CARD：信用卡
     */
    public void setBankCardType(String BankCardType) {
        this.BankCardType = BankCardType;
    }

    public OpenBankPayerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankPayerInfo(OpenBankPayerInfo source) {
        if (source.PayerId != null) {
            this.PayerId = new String(source.PayerId);
        }
        if (source.PayerName != null) {
            this.PayerName = new String(source.PayerName);
        }
        if (source.BindSerialNo != null) {
            this.BindSerialNo = new String(source.BindSerialNo);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.BankCardType != null) {
            this.BankCardType = new String(source.BankCardType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerId", this.PayerId);
        this.setParamSimple(map, prefix + "PayerName", this.PayerName);
        this.setParamSimple(map, prefix + "BindSerialNo", this.BindSerialNo);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "BankCardType", this.BankCardType);

    }
}

