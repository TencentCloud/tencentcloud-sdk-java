/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PaymentMethod extends AbstractModel {

    /**
    * <p>支付方式</p><p>枚举值：</p><ul><li>cash： 现金</li><li>check： 支票</li><li>credit_card： 信用卡</li><li>debit_card： 借记卡</li><li>crypto_currency： 加密货币</li><li>digital_wallet： 数字钱包</li><li>gift_card： 礼品卡</li><li>points： 积分</li><li>in_app_purchase： APP内购买</li><li>electronic_fund_transfer： 电子资金转账</li><li>financing： 融资</li><li>invoice： 发票</li><li>prepaid_card： 预付卡</li><li>sepa_credit： SEPA信用转账</li></ul>
    */
    @SerializedName("PaymentType")
    @Expose
    private String PaymentType;

    /**
    * <p>支付渠道</p>
    */
    @SerializedName("PaymentChannel")
    @Expose
    private String PaymentChannel;

    /**
    * <p>银行卡信息，当用支付方式是credit_card、debit_card时必填</p>
    */
    @SerializedName("Card")
    @Expose
    private Card Card;

    /**
    * <p>SEPA直接借记授权</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("SEPADirectDebitMandate")
    @Expose
    private Boolean SEPADirectDebitMandate;

    /**
    * <p>数字钱包</p>
    */
    @SerializedName("DigitalWallet")
    @Expose
    private Wallet DigitalWallet;

    /**
     * Get <p>支付方式</p><p>枚举值：</p><ul><li>cash： 现金</li><li>check： 支票</li><li>credit_card： 信用卡</li><li>debit_card： 借记卡</li><li>crypto_currency： 加密货币</li><li>digital_wallet： 数字钱包</li><li>gift_card： 礼品卡</li><li>points： 积分</li><li>in_app_purchase： APP内购买</li><li>electronic_fund_transfer： 电子资金转账</li><li>financing： 融资</li><li>invoice： 发票</li><li>prepaid_card： 预付卡</li><li>sepa_credit： SEPA信用转账</li></ul> 
     * @return PaymentType <p>支付方式</p><p>枚举值：</p><ul><li>cash： 现金</li><li>check： 支票</li><li>credit_card： 信用卡</li><li>debit_card： 借记卡</li><li>crypto_currency： 加密货币</li><li>digital_wallet： 数字钱包</li><li>gift_card： 礼品卡</li><li>points： 积分</li><li>in_app_purchase： APP内购买</li><li>electronic_fund_transfer： 电子资金转账</li><li>financing： 融资</li><li>invoice： 发票</li><li>prepaid_card： 预付卡</li><li>sepa_credit： SEPA信用转账</li></ul>
     */
    public String getPaymentType() {
        return this.PaymentType;
    }

    /**
     * Set <p>支付方式</p><p>枚举值：</p><ul><li>cash： 现金</li><li>check： 支票</li><li>credit_card： 信用卡</li><li>debit_card： 借记卡</li><li>crypto_currency： 加密货币</li><li>digital_wallet： 数字钱包</li><li>gift_card： 礼品卡</li><li>points： 积分</li><li>in_app_purchase： APP内购买</li><li>electronic_fund_transfer： 电子资金转账</li><li>financing： 融资</li><li>invoice： 发票</li><li>prepaid_card： 预付卡</li><li>sepa_credit： SEPA信用转账</li></ul>
     * @param PaymentType <p>支付方式</p><p>枚举值：</p><ul><li>cash： 现金</li><li>check： 支票</li><li>credit_card： 信用卡</li><li>debit_card： 借记卡</li><li>crypto_currency： 加密货币</li><li>digital_wallet： 数字钱包</li><li>gift_card： 礼品卡</li><li>points： 积分</li><li>in_app_purchase： APP内购买</li><li>electronic_fund_transfer： 电子资金转账</li><li>financing： 融资</li><li>invoice： 发票</li><li>prepaid_card： 预付卡</li><li>sepa_credit： SEPA信用转账</li></ul>
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    /**
     * Get <p>支付渠道</p> 
     * @return PaymentChannel <p>支付渠道</p>
     */
    public String getPaymentChannel() {
        return this.PaymentChannel;
    }

    /**
     * Set <p>支付渠道</p>
     * @param PaymentChannel <p>支付渠道</p>
     */
    public void setPaymentChannel(String PaymentChannel) {
        this.PaymentChannel = PaymentChannel;
    }

    /**
     * Get <p>银行卡信息，当用支付方式是credit_card、debit_card时必填</p> 
     * @return Card <p>银行卡信息，当用支付方式是credit_card、debit_card时必填</p>
     */
    public Card getCard() {
        return this.Card;
    }

    /**
     * Set <p>银行卡信息，当用支付方式是credit_card、debit_card时必填</p>
     * @param Card <p>银行卡信息，当用支付方式是credit_card、debit_card时必填</p>
     */
    public void setCard(Card Card) {
        this.Card = Card;
    }

    /**
     * Get <p>SEPA直接借记授权</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return SEPADirectDebitMandate <p>SEPA直接借记授权</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getSEPADirectDebitMandate() {
        return this.SEPADirectDebitMandate;
    }

    /**
     * Set <p>SEPA直接借记授权</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param SEPADirectDebitMandate <p>SEPA直接借记授权</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setSEPADirectDebitMandate(Boolean SEPADirectDebitMandate) {
        this.SEPADirectDebitMandate = SEPADirectDebitMandate;
    }

    /**
     * Get <p>数字钱包</p> 
     * @return DigitalWallet <p>数字钱包</p>
     */
    public Wallet getDigitalWallet() {
        return this.DigitalWallet;
    }

    /**
     * Set <p>数字钱包</p>
     * @param DigitalWallet <p>数字钱包</p>
     */
    public void setDigitalWallet(Wallet DigitalWallet) {
        this.DigitalWallet = DigitalWallet;
    }

    public PaymentMethod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaymentMethod(PaymentMethod source) {
        if (source.PaymentType != null) {
            this.PaymentType = new String(source.PaymentType);
        }
        if (source.PaymentChannel != null) {
            this.PaymentChannel = new String(source.PaymentChannel);
        }
        if (source.Card != null) {
            this.Card = new Card(source.Card);
        }
        if (source.SEPADirectDebitMandate != null) {
            this.SEPADirectDebitMandate = new Boolean(source.SEPADirectDebitMandate);
        }
        if (source.DigitalWallet != null) {
            this.DigitalWallet = new Wallet(source.DigitalWallet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaymentType", this.PaymentType);
        this.setParamSimple(map, prefix + "PaymentChannel", this.PaymentChannel);
        this.setParamObj(map, prefix + "Card.", this.Card);
        this.setParamSimple(map, prefix + "SEPADirectDebitMandate", this.SEPADirectDebitMandate);
        this.setParamObj(map, prefix + "DigitalWallet.", this.DigitalWallet);

    }
}

