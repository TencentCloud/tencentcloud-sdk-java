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

public class DescribeBillSummaryByProductResponse extends AbstractModel {

    /**
    * <p>数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）</p>
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * <p>总花费详情</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryTotal")
    @Expose
    private BusinessSummaryTotal SummaryTotal;

    /**
    * <p>各产品花费分布</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryOverview")
    @Expose
    private BusinessSummaryOverviewItem [] SummaryOverview;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）</p> 
     * @return Ready <p>数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）</p>
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set <p>数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）</p>
     * @param Ready <p>数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）</p>
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get <p>总花费详情</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummaryTotal <p>总花费详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinessSummaryTotal getSummaryTotal() {
        return this.SummaryTotal;
    }

    /**
     * Set <p>总花费详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryTotal <p>总花费详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryTotal(BusinessSummaryTotal SummaryTotal) {
        this.SummaryTotal = SummaryTotal;
    }

    /**
     * Get <p>各产品花费分布</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummaryOverview <p>各产品花费分布</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinessSummaryOverviewItem [] getSummaryOverview() {
        return this.SummaryOverview;
    }

    /**
     * Set <p>各产品花费分布</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryOverview <p>各产品花费分布</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryOverview(BusinessSummaryOverviewItem [] SummaryOverview) {
        this.SummaryOverview = SummaryOverview;
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

    public DescribeBillSummaryByProductResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryByProductResponse(DescribeBillSummaryByProductResponse source) {
        if (source.Ready != null) {
            this.Ready = new Long(source.Ready);
        }
        if (source.SummaryTotal != null) {
            this.SummaryTotal = new BusinessSummaryTotal(source.SummaryTotal);
        }
        if (source.SummaryOverview != null) {
            this.SummaryOverview = new BusinessSummaryOverviewItem[source.SummaryOverview.length];
            for (int i = 0; i < source.SummaryOverview.length; i++) {
                this.SummaryOverview[i] = new BusinessSummaryOverviewItem(source.SummaryOverview[i]);
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
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamObj(map, prefix + "SummaryTotal.", this.SummaryTotal);
        this.setParamArrayObj(map, prefix + "SummaryOverview.", this.SummaryOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

