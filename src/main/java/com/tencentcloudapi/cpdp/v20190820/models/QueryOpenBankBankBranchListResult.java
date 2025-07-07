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

public class QueryOpenBankBankBranchListResult extends AbstractModel {

    /**
    * 支行列表。
    */
    @SerializedName("BankBranchList")
    @Expose
    private BankBranchInfo [] BankBranchList;

    /**
    * 列表总数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 支行列表。 
     * @return BankBranchList 支行列表。
     */
    public BankBranchInfo [] getBankBranchList() {
        return this.BankBranchList;
    }

    /**
     * Set 支行列表。
     * @param BankBranchList 支行列表。
     */
    public void setBankBranchList(BankBranchInfo [] BankBranchList) {
        this.BankBranchList = BankBranchList;
    }

    /**
     * Get 列表总数。 
     * @return Count 列表总数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 列表总数。
     * @param Count 列表总数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public QueryOpenBankBankBranchListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankBankBranchListResult(QueryOpenBankBankBranchListResult source) {
        if (source.BankBranchList != null) {
            this.BankBranchList = new BankBranchInfo[source.BankBranchList.length];
            for (int i = 0; i < source.BankBranchList.length; i++) {
                this.BankBranchList[i] = new BankBranchInfo(source.BankBranchList[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BankBranchList.", this.BankBranchList);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

