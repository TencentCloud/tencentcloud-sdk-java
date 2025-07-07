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

public class AllocationStat extends AbstractModel {

    /**
    * 费用平均信息
    */
    @SerializedName("Average")
    @Expose
    private AllocationAverageData Average;

    /**
     * Get 费用平均信息 
     * @return Average 费用平均信息
     */
    public AllocationAverageData getAverage() {
        return this.Average;
    }

    /**
     * Set 费用平均信息
     * @param Average 费用平均信息
     */
    public void setAverage(AllocationAverageData Average) {
        this.Average = Average;
    }

    public AllocationStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationStat(AllocationStat source) {
        if (source.Average != null) {
            this.Average = new AllocationAverageData(source.Average);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Average.", this.Average);

    }
}

