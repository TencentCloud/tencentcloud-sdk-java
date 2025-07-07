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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceProviderAccountBalanceResult extends AbstractModel {

    /**
    * 服务商账户余额
    */
    @SerializedName("Balance")
    @Expose
    private String Balance;

    /**
     * Get 服务商账户余额 
     * @return Balance 服务商账户余额
     */
    public String getBalance() {
        return this.Balance;
    }

    /**
     * Set 服务商账户余额
     * @param Balance 服务商账户余额
     */
    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    public ServiceProviderAccountBalanceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceProviderAccountBalanceResult(ServiceProviderAccountBalanceResult source) {
        if (source.Balance != null) {
            this.Balance = new String(source.Balance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Balance", this.Balance);

    }
}

