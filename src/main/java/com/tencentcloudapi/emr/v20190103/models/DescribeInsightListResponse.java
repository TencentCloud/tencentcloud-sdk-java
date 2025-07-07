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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInsightListResponse extends AbstractModel {

    /**
    * 总数，分页查询时使用
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 洞察结果数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultList")
    @Expose
    private InsightResult [] ResultList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数，分页查询时使用 
     * @return TotalCount 总数，分页查询时使用
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数，分页查询时使用
     * @param TotalCount 总数，分页查询时使用
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 洞察结果数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultList 洞察结果数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InsightResult [] getResultList() {
        return this.ResultList;
    }

    /**
     * Set 洞察结果数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultList 洞察结果数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultList(InsightResult [] ResultList) {
        this.ResultList = ResultList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInsightListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInsightListResponse(DescribeInsightListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ResultList != null) {
            this.ResultList = new InsightResult[source.ResultList.length];
            for (int i = 0; i < source.ResultList.length; i++) {
                this.ResultList[i] = new InsightResult(source.ResultList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ResultList.", this.ResultList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

