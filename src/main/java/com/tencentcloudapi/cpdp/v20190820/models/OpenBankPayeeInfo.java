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

public class OpenBankPayeeInfo extends AbstractModel{

    /**
    * 收款方唯一标识。
当渠道为TENPAY，付款方式为EBANK_PAYMENT，必填，上送收款方入驻云企付商户ID；
付款方式为OPENBANK_PAYMENT时，非必填，输入外部收款方的标识ID
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送微信OPEN_ID；
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 支行名称。
    */
    @SerializedName("BankBranchName")
    @Expose
    private String BankBranchName;

    /**
    * 银行账号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选
    */
    @SerializedName("BankAccountNumber")
    @Expose
    private String BankAccountNumber;

    /**
    * 收款方名称。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，上送收款方入驻云企付的商户名称；
渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选，上送收款方账户名称；
渠道为ALIPAY，付款方式为SAFT_ISV时，收款账户标识类型为ALIPAY_LOGON_ID时必传，上送收款方真实姓名。
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送收款人姓名。
    */
    @SerializedName("PayeeName")
    @Expose
    private String PayeeName;

    /**
    * 联行号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选
    */
    @SerializedName("BankBranchId")
    @Expose
    private String BankBranchId;

    /**
    * 收款方绑卡序列号。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，必填，上送收款方入驻云企付平台时，下发的绑卡序列号；当渠道为ALIPAY，付款方式为SAFT_ISV时，必填，根据收款账户标识类型上送。
    */
    @SerializedName("BindSerialNo")
    @Expose
    private String BindSerialNo;

    /**
    * 收款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID
ALIPAY_USER_ID：支付宝的会员ID
ALIPAY_LOGON_ID：支付宝登录号。
付款方式为SAFT_ISV时，必填。
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
     * Get 收款方唯一标识。
当渠道为TENPAY，付款方式为EBANK_PAYMENT，必填，上送收款方入驻云企付商户ID；
付款方式为OPENBANK_PAYMENT时，非必填，输入外部收款方的标识ID
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送微信OPEN_ID； 
     * @return PayeeId 收款方唯一标识。
当渠道为TENPAY，付款方式为EBANK_PAYMENT，必填，上送收款方入驻云企付商户ID；
付款方式为OPENBANK_PAYMENT时，非必填，输入外部收款方的标识ID
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送微信OPEN_ID；
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款方唯一标识。
当渠道为TENPAY，付款方式为EBANK_PAYMENT，必填，上送收款方入驻云企付商户ID；
付款方式为OPENBANK_PAYMENT时，非必填，输入外部收款方的标识ID
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送微信OPEN_ID；
     * @param PayeeId 收款方唯一标识。
当渠道为TENPAY，付款方式为EBANK_PAYMENT，必填，上送收款方入驻云企付商户ID；
付款方式为OPENBANK_PAYMENT时，非必填，输入外部收款方的标识ID
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送微信OPEN_ID；
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 支行名称。 
     * @return BankBranchName 支行名称。
     */
    public String getBankBranchName() {
        return this.BankBranchName;
    }

    /**
     * Set 支行名称。
     * @param BankBranchName 支行名称。
     */
    public void setBankBranchName(String BankBranchName) {
        this.BankBranchName = BankBranchName;
    }

    /**
     * Get 银行账号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选 
     * @return BankAccountNumber 银行账号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选
     */
    public String getBankAccountNumber() {
        return this.BankAccountNumber;
    }

    /**
     * Set 银行账号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选
     * @param BankAccountNumber 银行账号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选
     */
    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    /**
     * Get 收款方名称。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，上送收款方入驻云企付的商户名称；
渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选，上送收款方账户名称；
渠道为ALIPAY，付款方式为SAFT_ISV时，收款账户标识类型为ALIPAY_LOGON_ID时必传，上送收款方真实姓名。
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送收款人姓名。 
     * @return PayeeName 收款方名称。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，上送收款方入驻云企付的商户名称；
渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选，上送收款方账户名称；
渠道为ALIPAY，付款方式为SAFT_ISV时，收款账户标识类型为ALIPAY_LOGON_ID时必传，上送收款方真实姓名。
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送收款人姓名。
     */
    public String getPayeeName() {
        return this.PayeeName;
    }

    /**
     * Set 收款方名称。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，上送收款方入驻云企付的商户名称；
渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选，上送收款方账户名称；
渠道为ALIPAY，付款方式为SAFT_ISV时，收款账户标识类型为ALIPAY_LOGON_ID时必传，上送收款方真实姓名。
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送收款人姓名。
     * @param PayeeName 收款方名称。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，上送收款方入驻云企付的商户名称；
渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选，上送收款方账户名称；
渠道为ALIPAY，付款方式为SAFT_ISV时，收款账户标识类型为ALIPAY_LOGON_ID时必传，上送收款方真实姓名。
渠道为WECHAT，付款方式为TRANS_TO_CHANGE时，上送收款人姓名。
     */
    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    /**
     * Get 联行号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选 
     * @return BankBranchId 联行号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选
     */
    public String getBankBranchId() {
        return this.BankBranchId;
    }

    /**
     * Set 联行号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选
     * @param BankBranchId 联行号。渠道为TENPAY，付款方式为OPENBANK_PAYMENT时必选
     */
    public void setBankBranchId(String BankBranchId) {
        this.BankBranchId = BankBranchId;
    }

    /**
     * Get 收款方绑卡序列号。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，必填，上送收款方入驻云企付平台时，下发的绑卡序列号；当渠道为ALIPAY，付款方式为SAFT_ISV时，必填，根据收款账户标识类型上送。 
     * @return BindSerialNo 收款方绑卡序列号。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，必填，上送收款方入驻云企付平台时，下发的绑卡序列号；当渠道为ALIPAY，付款方式为SAFT_ISV时，必填，根据收款账户标识类型上送。
     */
    public String getBindSerialNo() {
        return this.BindSerialNo;
    }

    /**
     * Set 收款方绑卡序列号。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，必填，上送收款方入驻云企付平台时，下发的绑卡序列号；当渠道为ALIPAY，付款方式为SAFT_ISV时，必填，根据收款账户标识类型上送。
     * @param BindSerialNo 收款方绑卡序列号。
当渠道为TENPAY，付款方式为EBANK_PAYMENT时，必填，上送收款方入驻云企付平台时，下发的绑卡序列号；当渠道为ALIPAY，付款方式为SAFT_ISV时，必填，根据收款账户标识类型上送。
     */
    public void setBindSerialNo(String BindSerialNo) {
        this.BindSerialNo = BindSerialNo;
    }

    /**
     * Get 收款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID
ALIPAY_USER_ID：支付宝的会员ID
ALIPAY_LOGON_ID：支付宝登录号。
付款方式为SAFT_ISV时，必填。 
     * @return AccountType 收款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID
ALIPAY_USER_ID：支付宝的会员ID
ALIPAY_LOGON_ID：支付宝登录号。
付款方式为SAFT_ISV时，必填。
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 收款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID
ALIPAY_USER_ID：支付宝的会员ID
ALIPAY_LOGON_ID：支付宝登录号。
付款方式为SAFT_ISV时，必填。
     * @param AccountType 收款账户标识类型
BANK_ACCOUNT：绑定银行账户
ACCOUNT_BOOK_ID：电子记账本ID
ALIPAY_USER_ID：支付宝的会员ID
ALIPAY_LOGON_ID：支付宝登录号。
付款方式为SAFT_ISV时，必填。
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public OpenBankPayeeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankPayeeInfo(OpenBankPayeeInfo source) {
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.BankBranchName != null) {
            this.BankBranchName = new String(source.BankBranchName);
        }
        if (source.BankAccountNumber != null) {
            this.BankAccountNumber = new String(source.BankAccountNumber);
        }
        if (source.PayeeName != null) {
            this.PayeeName = new String(source.PayeeName);
        }
        if (source.BankBranchId != null) {
            this.BankBranchId = new String(source.BankBranchId);
        }
        if (source.BindSerialNo != null) {
            this.BindSerialNo = new String(source.BindSerialNo);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "BankBranchName", this.BankBranchName);
        this.setParamSimple(map, prefix + "BankAccountNumber", this.BankAccountNumber);
        this.setParamSimple(map, prefix + "PayeeName", this.PayeeName);
        this.setParamSimple(map, prefix + "BankBranchId", this.BankBranchId);
        this.setParamSimple(map, prefix + "BindSerialNo", this.BindSerialNo);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);

    }
}

