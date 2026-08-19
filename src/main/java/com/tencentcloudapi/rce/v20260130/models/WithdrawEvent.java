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

public class WithdrawEvent extends AbstractModel {

    /**
    * <p>提现金额</p>
    */
    @SerializedName("Amount")
    @Expose
    private Amount Amount;

    /**
    * <p>提现方式</p><p>枚举值：</p><ul><li>card： 银行卡</li><li>wallet： 电子钱包</li></ul>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>提现银行卡，当提现方式是card时必填</p>
    */
    @SerializedName("Card")
    @Expose
    private Card Card;

    /**
    * <p>提现数字钱包，当提现方式是wallet时必填</p>
    */
    @SerializedName("Wallet")
    @Expose
    private Wallet Wallet;

    /**
    * <p>提现结果</p>
    */
    @SerializedName("Result")
    @Expose
    private Result Result;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>提现金额</p> 
     * @return Amount <p>提现金额</p>
     */
    public Amount getAmount() {
        return this.Amount;
    }

    /**
     * Set <p>提现金额</p>
     * @param Amount <p>提现金额</p>
     */
    public void setAmount(Amount Amount) {
        this.Amount = Amount;
    }

    /**
     * Get <p>提现方式</p><p>枚举值：</p><ul><li>card： 银行卡</li><li>wallet： 电子钱包</li></ul> 
     * @return Method <p>提现方式</p><p>枚举值：</p><ul><li>card： 银行卡</li><li>wallet： 电子钱包</li></ul>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>提现方式</p><p>枚举值：</p><ul><li>card： 银行卡</li><li>wallet： 电子钱包</li></ul>
     * @param Method <p>提现方式</p><p>枚举值：</p><ul><li>card： 银行卡</li><li>wallet： 电子钱包</li></ul>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>提现银行卡，当提现方式是card时必填</p> 
     * @return Card <p>提现银行卡，当提现方式是card时必填</p>
     */
    public Card getCard() {
        return this.Card;
    }

    /**
     * Set <p>提现银行卡，当提现方式是card时必填</p>
     * @param Card <p>提现银行卡，当提现方式是card时必填</p>
     */
    public void setCard(Card Card) {
        this.Card = Card;
    }

    /**
     * Get <p>提现数字钱包，当提现方式是wallet时必填</p> 
     * @return Wallet <p>提现数字钱包，当提现方式是wallet时必填</p>
     */
    public Wallet getWallet() {
        return this.Wallet;
    }

    /**
     * Set <p>提现数字钱包，当提现方式是wallet时必填</p>
     * @param Wallet <p>提现数字钱包，当提现方式是wallet时必填</p>
     */
    public void setWallet(Wallet Wallet) {
        this.Wallet = Wallet;
    }

    /**
     * Get <p>提现结果</p> 
     * @return Result <p>提现结果</p>
     */
    public Result getResult() {
        return this.Result;
    }

    /**
     * Set <p>提现结果</p>
     * @param Result <p>提现结果</p>
     */
    public void setResult(Result Result) {
        this.Result = Result;
    }

    /**
     * Get <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public WithdrawEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WithdrawEvent(WithdrawEvent source) {
        if (source.Amount != null) {
            this.Amount = new Amount(source.Amount);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Card != null) {
            this.Card = new Card(source.Card);
        }
        if (source.Wallet != null) {
            this.Wallet = new Wallet(source.Wallet);
        }
        if (source.Result != null) {
            this.Result = new Result(source.Result);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Amount.", this.Amount);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamObj(map, prefix + "Card.", this.Card);
        this.setParamObj(map, prefix + "Wallet.", this.Wallet);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

