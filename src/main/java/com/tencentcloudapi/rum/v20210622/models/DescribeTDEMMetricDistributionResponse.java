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

public class DescribeTDEMMetricDistributionResponse extends AbstractModel {

    /**
    * <p>单查分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private MetricDistributionItem [] Items;

    /**
    * <p>单查合计，批量为空时省略</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private MetricDistributionBatchItem [] Results;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>单查分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items <p>单查分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricDistributionItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>单查分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items <p>单查分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(MetricDistributionItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>单查合计，批量为空时省略</p> 
     * @return Total <p>单查合计，批量为空时省略</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>单查合计，批量为空时省略</p>
     * @param Total <p>单查合计，批量为空时省略</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricDistributionBatchItem [] getResults() {
        return this.Results;
    }

    /**
     * Set <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results <p>批量结果，Queries 非空时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(MetricDistributionBatchItem [] Results) {
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

    public DescribeTDEMMetricDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMMetricDistributionResponse(DescribeTDEMMetricDistributionResponse source) {
        if (source.Items != null) {
            this.Items = new MetricDistributionItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new MetricDistributionItem(source.Items[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Results != null) {
            this.Results = new MetricDistributionBatchItem[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new MetricDistributionBatchItem(source.Results[i]);
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
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

