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

public class BindOpenBankProfitSharePayeeResult extends AbstractModel{

    /**
    * 账户ID。受益人ID
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 账户号，通联渠道指客户银行账号
    */
    @SerializedName("AccountNo")
    @Expose
    private String AccountNo;

    /**
    * 账户货币。参考附录“币种类型”。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get 账户ID。受益人ID 
     * @return AccountId 账户ID。受益人ID
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 账户ID。受益人ID
     * @param AccountId 账户ID。受益人ID
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 账户号，通联渠道指客户银行账号 
     * @return AccountNo 账户号，通联渠道指客户银行账号
     */
    public String getAccountNo() {
        return this.AccountNo;
    }

    /**
     * Set 账户号，通联渠道指客户银行账号
     * @param AccountNo 账户号，通联渠道指客户银行账号
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * Get 账户货币。参考附录“币种类型”。 
     * @return Currency 账户货币。参考附录“币种类型”。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 账户货币。参考附录“币种类型”。
     * @param Currency 账户货币。参考附录“币种类型”。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public BindOpenBankProfitSharePayeeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindOpenBankProfitSharePayeeResult(BindOpenBankProfitSharePayeeResult source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.AccountNo != null) {
            this.AccountNo = new String(source.AccountNo);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AccountNo", this.AccountNo);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

