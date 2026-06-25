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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLLMTokenUsageListResult extends AbstractModel {

    /**
    * <p>Token用量明细返回结果列表</p>
    */
    @SerializedName("DataList")
    @Expose
    private AIGWLLMTokenUsageItem [] DataList;

    /**
    * <p>结果总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get <p>Token用量明细返回结果列表</p> 
     * @return DataList <p>Token用量明细返回结果列表</p>
     */
    public AIGWLLMTokenUsageItem [] getDataList() {
        return this.DataList;
    }

    /**
     * Set <p>Token用量明细返回结果列表</p>
     * @param DataList <p>Token用量明细返回结果列表</p>
     */
    public void setDataList(AIGWLLMTokenUsageItem [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get <p>结果总数</p> 
     * @return TotalCount <p>结果总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>结果总数</p>
     * @param TotalCount <p>结果总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public AIGWLLMTokenUsageListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLLMTokenUsageListResult(AIGWLLMTokenUsageListResult source) {
        if (source.DataList != null) {
            this.DataList = new AIGWLLMTokenUsageItem[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new AIGWLLMTokenUsageItem(source.DataList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

