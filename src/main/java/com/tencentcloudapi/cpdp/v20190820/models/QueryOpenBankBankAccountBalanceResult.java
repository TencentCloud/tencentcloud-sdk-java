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

public class QueryOpenBankBankAccountBalanceResult extends AbstractModel{

    /**
    * 总余额，单位分
    */
    @SerializedName("TotalBalance")
    @Expose
    private String TotalBalance;

    /**
    * 昨日余额，单位分
    */
    @SerializedName("YesterdayBalance")
    @Expose
    private String YesterdayBalance;

    /**
     * Get 总余额，单位分 
     * @return TotalBalance 总余额，单位分
     */
    public String getTotalBalance() {
        return this.TotalBalance;
    }

    /**
     * Set 总余额，单位分
     * @param TotalBalance 总余额，单位分
     */
    public void setTotalBalance(String TotalBalance) {
        this.TotalBalance = TotalBalance;
    }

    /**
     * Get 昨日余额，单位分 
     * @return YesterdayBalance 昨日余额，单位分
     */
    public String getYesterdayBalance() {
        return this.YesterdayBalance;
    }

    /**
     * Set 昨日余额，单位分
     * @param YesterdayBalance 昨日余额，单位分
     */
    public void setYesterdayBalance(String YesterdayBalance) {
        this.YesterdayBalance = YesterdayBalance;
    }

    public QueryOpenBankBankAccountBalanceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankBankAccountBalanceResult(QueryOpenBankBankAccountBalanceResult source) {
        if (source.TotalBalance != null) {
            this.TotalBalance = new String(source.TotalBalance);
        }
        if (source.YesterdayBalance != null) {
            this.YesterdayBalance = new String(source.YesterdayBalance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalBalance", this.TotalBalance);
        this.setParamSimple(map, prefix + "YesterdayBalance", this.YesterdayBalance);

    }
}

