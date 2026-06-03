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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMDetectionReport extends AbstractModel {

    /**
    * <p>检测结果数量。</p>
    */
    @SerializedName("ResultCount")
    @Expose
    private Long ResultCount;

    /**
    * <p>各检测项结果列表。</p>
    */
    @SerializedName("ResultSet")
    @Expose
    private LLMDetectionResultItem [] ResultSet;

    /**
     * Get <p>检测结果数量。</p> 
     * @return ResultCount <p>检测结果数量。</p>
     */
    public Long getResultCount() {
        return this.ResultCount;
    }

    /**
     * Set <p>检测结果数量。</p>
     * @param ResultCount <p>检测结果数量。</p>
     */
    public void setResultCount(Long ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * Get <p>各检测项结果列表。</p> 
     * @return ResultSet <p>各检测项结果列表。</p>
     */
    public LLMDetectionResultItem [] getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set <p>各检测项结果列表。</p>
     * @param ResultSet <p>各检测项结果列表。</p>
     */
    public void setResultSet(LLMDetectionResultItem [] ResultSet) {
        this.ResultSet = ResultSet;
    }

    public LLMDetectionReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMDetectionReport(LLMDetectionReport source) {
        if (source.ResultCount != null) {
            this.ResultCount = new Long(source.ResultCount);
        }
        if (source.ResultSet != null) {
            this.ResultSet = new LLMDetectionResultItem[source.ResultSet.length];
            for (int i = 0; i < source.ResultSet.length; i++) {
                this.ResultSet[i] = new LLMDetectionResultItem(source.ResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultCount", this.ResultCount);
        this.setParamArrayObj(map, prefix + "ResultSet.", this.ResultSet);

    }
}

