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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillDays extends AbstractModel {

    /**
    * 日期：结算日期
    */
    @SerializedName("BillDay")
    @Expose
    private String BillDay;

    /**
     * Get 日期：结算日期 
     * @return BillDay 日期：结算日期
     */
    public String getBillDay() {
        return this.BillDay;
    }

    /**
     * Set 日期：结算日期
     * @param BillDay 日期：结算日期
     */
    public void setBillDay(String BillDay) {
        this.BillDay = BillDay;
    }

    public BillDays() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillDays(BillDays source) {
        if (source.BillDay != null) {
            this.BillDay = new String(source.BillDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillDay", this.BillDay);

    }
}

