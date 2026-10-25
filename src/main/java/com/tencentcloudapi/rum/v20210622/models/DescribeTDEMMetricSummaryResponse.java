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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMMetricSummaryResponse extends AbstractModel {

    /**
    * <p>单查指标。缺测指标不出现，禁止 null</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metrics")
    @Expose
    private FloatNameValue [] Metrics;

    /**
    * <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private MetricSummaryBatchItem [] Results;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>单查指标。缺测指标不出现，禁止 null</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metrics <p>单查指标。缺测指标不出现，禁止 null</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FloatNameValue [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>单查指标。缺测指标不出现，禁止 null</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metrics <p>单查指标。缺测指标不出现，禁止 null</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetrics(FloatNameValue [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricSummaryBatchItem [] getResults() {
        return this.Results;
    }

    /**
     * Set <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(MetricSummaryBatchItem [] Results) {
        this.Results = Results;
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

    public DescribeTDEMMetricSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMMetricSummaryResponse(DescribeTDEMMetricSummaryResponse source) {
        if (source.Metrics != null) {
            this.Metrics = new FloatNameValue[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new FloatNameValue(source.Metrics[i]);
            }
        }
        if (source.Results != null) {
            this.Results = new MetricSummaryBatchItem[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new MetricSummaryBatchItem(source.Results[i]);
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
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

