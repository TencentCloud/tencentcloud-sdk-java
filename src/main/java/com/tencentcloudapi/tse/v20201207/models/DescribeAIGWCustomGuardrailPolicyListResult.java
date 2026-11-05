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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIGWCustomGuardrailPolicyListResult extends AbstractModel {

    /**
    * <p>符合条件的策略总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>策略列表</p>
    */
    @SerializedName("DataList")
    @Expose
    private CustomGuardrailPolicy [] DataList;

    /**
     * Get <p>符合条件的策略总数</p> 
     * @return TotalCount <p>符合条件的策略总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>符合条件的策略总数</p>
     * @param TotalCount <p>符合条件的策略总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>策略列表</p> 
     * @return DataList <p>策略列表</p>
     */
    public CustomGuardrailPolicy [] getDataList() {
        return this.DataList;
    }

    /**
     * Set <p>策略列表</p>
     * @param DataList <p>策略列表</p>
     */
    public void setDataList(CustomGuardrailPolicy [] DataList) {
        this.DataList = DataList;
    }

    public DescribeAIGWCustomGuardrailPolicyListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIGWCustomGuardrailPolicyListResult(DescribeAIGWCustomGuardrailPolicyListResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DataList != null) {
            this.DataList = new CustomGuardrailPolicy[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new CustomGuardrailPolicy(source.DataList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);

    }
}

