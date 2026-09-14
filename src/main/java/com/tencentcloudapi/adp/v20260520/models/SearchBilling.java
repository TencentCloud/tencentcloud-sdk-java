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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchBilling extends AbstractModel {

    /**
    * <p>计费标签列表</p>
    */
    @SerializedName("BillingTagList")
    @Expose
    private KVPair [] BillingTagList;

    /**
    * <p>计费子业务类型</p>
    */
    @SerializedName("FinanceSubBusinessType")
    @Expose
    private String FinanceSubBusinessType;

    /**
     * Get <p>计费标签列表</p> 
     * @return BillingTagList <p>计费标签列表</p>
     */
    public KVPair [] getBillingTagList() {
        return this.BillingTagList;
    }

    /**
     * Set <p>计费标签列表</p>
     * @param BillingTagList <p>计费标签列表</p>
     */
    public void setBillingTagList(KVPair [] BillingTagList) {
        this.BillingTagList = BillingTagList;
    }

    /**
     * Get <p>计费子业务类型</p> 
     * @return FinanceSubBusinessType <p>计费子业务类型</p>
     */
    public String getFinanceSubBusinessType() {
        return this.FinanceSubBusinessType;
    }

    /**
     * Set <p>计费子业务类型</p>
     * @param FinanceSubBusinessType <p>计费子业务类型</p>
     */
    public void setFinanceSubBusinessType(String FinanceSubBusinessType) {
        this.FinanceSubBusinessType = FinanceSubBusinessType;
    }

    public SearchBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchBilling(SearchBilling source) {
        if (source.BillingTagList != null) {
            this.BillingTagList = new KVPair[source.BillingTagList.length];
            for (int i = 0; i < source.BillingTagList.length; i++) {
                this.BillingTagList[i] = new KVPair(source.BillingTagList[i]);
            }
        }
        if (source.FinanceSubBusinessType != null) {
            this.FinanceSubBusinessType = new String(source.FinanceSubBusinessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BillingTagList.", this.BillingTagList);
        this.setParamSimple(map, prefix + "FinanceSubBusinessType", this.FinanceSubBusinessType);

    }
}

