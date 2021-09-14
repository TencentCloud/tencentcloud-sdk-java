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
package com.tencentcloudapi.af.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiFraudRequest extends AbstractModel{

    /**
    * 原始业务入参(二选一）
    */
    @SerializedName("BusinessSecurityData")
    @Expose
    private FinanceAntiFraudFilter BusinessSecurityData;

    /**
    * 密文业务入参(二选一）
    */
    @SerializedName("BusinessCryptoData")
    @Expose
    private FinanceAntiFraudCryptoFilter BusinessCryptoData;

    /**
     * Get 原始业务入参(二选一） 
     * @return BusinessSecurityData 原始业务入参(二选一）
     */
    public FinanceAntiFraudFilter getBusinessSecurityData() {
        return this.BusinessSecurityData;
    }

    /**
     * Set 原始业务入参(二选一）
     * @param BusinessSecurityData 原始业务入参(二选一）
     */
    public void setBusinessSecurityData(FinanceAntiFraudFilter BusinessSecurityData) {
        this.BusinessSecurityData = BusinessSecurityData;
    }

    /**
     * Get 密文业务入参(二选一） 
     * @return BusinessCryptoData 密文业务入参(二选一）
     */
    public FinanceAntiFraudCryptoFilter getBusinessCryptoData() {
        return this.BusinessCryptoData;
    }

    /**
     * Set 密文业务入参(二选一）
     * @param BusinessCryptoData 密文业务入参(二选一）
     */
    public void setBusinessCryptoData(FinanceAntiFraudCryptoFilter BusinessCryptoData) {
        this.BusinessCryptoData = BusinessCryptoData;
    }

    public DescribeAntiFraudRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiFraudRequest(DescribeAntiFraudRequest source) {
        if (source.BusinessSecurityData != null) {
            this.BusinessSecurityData = new FinanceAntiFraudFilter(source.BusinessSecurityData);
        }
        if (source.BusinessCryptoData != null) {
            this.BusinessCryptoData = new FinanceAntiFraudCryptoFilter(source.BusinessCryptoData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BusinessSecurityData.", this.BusinessSecurityData);
        this.setParamObj(map, prefix + "BusinessCryptoData.", this.BusinessCryptoData);

    }
}

