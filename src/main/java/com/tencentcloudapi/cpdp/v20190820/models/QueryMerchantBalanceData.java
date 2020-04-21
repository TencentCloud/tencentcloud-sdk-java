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

public class QueryMerchantBalanceData extends AbstractModel{

    /**
    * 余额币种
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 账户余额
    */
    @SerializedName("Balance")
    @Expose
    private String Balance;

    /**
    * 商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
     * Get 余额币种 
     * @return Currency 余额币种
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 余额币种
     * @param Currency 余额币种
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 账户余额 
     * @return Balance 账户余额
     */
    public String getBalance() {
        return this.Balance;
    }

    /**
     * Set 账户余额
     * @param Balance 账户余额
     */
    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 商户ID 
     * @return MerchantId 商户ID
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户ID
     * @param MerchantId 商户ID
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);

    }
}

