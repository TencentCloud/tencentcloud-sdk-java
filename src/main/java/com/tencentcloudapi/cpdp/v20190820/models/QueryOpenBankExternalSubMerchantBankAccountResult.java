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

public class QueryOpenBankExternalSubMerchantBankAccountResult extends AbstractModel{

    /**
    * 第三方渠道子商户查询银行账户返回。
    */
    @SerializedName("AccountList")
    @Expose
    private QueryOpenBankExternalSubMerchantBankAccountData [] AccountList;

    /**
     * Get 第三方渠道子商户查询银行账户返回。 
     * @return AccountList 第三方渠道子商户查询银行账户返回。
     */
    public QueryOpenBankExternalSubMerchantBankAccountData [] getAccountList() {
        return this.AccountList;
    }

    /**
     * Set 第三方渠道子商户查询银行账户返回。
     * @param AccountList 第三方渠道子商户查询银行账户返回。
     */
    public void setAccountList(QueryOpenBankExternalSubMerchantBankAccountData [] AccountList) {
        this.AccountList = AccountList;
    }

    public QueryOpenBankExternalSubMerchantBankAccountResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankExternalSubMerchantBankAccountResult(QueryOpenBankExternalSubMerchantBankAccountResult source) {
        if (source.AccountList != null) {
            this.AccountList = new QueryOpenBankExternalSubMerchantBankAccountData[source.AccountList.length];
            for (int i = 0; i < source.AccountList.length; i++) {
                this.AccountList[i] = new QueryOpenBankExternalSubMerchantBankAccountData(source.AccountList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccountList.", this.AccountList);

    }
}

