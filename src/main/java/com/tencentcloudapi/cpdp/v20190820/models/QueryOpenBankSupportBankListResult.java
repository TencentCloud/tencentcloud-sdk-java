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

public class QueryOpenBankSupportBankListResult extends AbstractModel{

    /**
    * 支持的银行列表
    */
    @SerializedName("SupportBankList")
    @Expose
    private SupportBankInfo [] SupportBankList;

    /**
     * Get 支持的银行列表 
     * @return SupportBankList 支持的银行列表
     */
    public SupportBankInfo [] getSupportBankList() {
        return this.SupportBankList;
    }

    /**
     * Set 支持的银行列表
     * @param SupportBankList 支持的银行列表
     */
    public void setSupportBankList(SupportBankInfo [] SupportBankList) {
        this.SupportBankList = SupportBankList;
    }

    public QueryOpenBankSupportBankListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankSupportBankListResult(QueryOpenBankSupportBankListResult source) {
        if (source.SupportBankList != null) {
            this.SupportBankList = new SupportBankInfo[source.SupportBankList.length];
            for (int i = 0; i < source.SupportBankList.length; i++) {
                this.SupportBankList[i] = new SupportBankInfo(source.SupportBankList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SupportBankList.", this.SupportBankList);

    }
}

