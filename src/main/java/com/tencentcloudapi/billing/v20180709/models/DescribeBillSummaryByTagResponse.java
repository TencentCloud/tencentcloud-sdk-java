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

public class DescribeBillSummaryByTagResponse extends AbstractModel {

    /**
    * 数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * 各标签值花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryOverview")
    @Expose
    private TagSummaryOverviewItem [] SummaryOverview;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryTotal")
    @Expose
    private SummaryTotal SummaryTotal;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可） 
     * @return Ready 数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set 数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）
     * @param Ready 数据是否准备好，0准备中，1已就绪。（Ready=0，为当前UIN首次进行初始化出账，预计需要5~10分钟出账，请于10分钟后重试即可）
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get 各标签值花费分布详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummaryOverview 各标签值花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSummaryOverviewItem [] getSummaryOverview() {
        return this.SummaryOverview;
    }

    /**
     * Set 各标签值花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryOverview 各标签值花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryOverview(TagSummaryOverviewItem [] SummaryOverview) {
        this.SummaryOverview = SummaryOverview;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummaryTotal 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SummaryTotal getSummaryTotal() {
        return this.SummaryTotal;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryTotal 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryTotal(SummaryTotal SummaryTotal) {
        this.SummaryTotal = SummaryTotal;
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

    public DescribeBillSummaryByTagResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryByTagResponse(DescribeBillSummaryByTagResponse source) {
        if (source.Ready != null) {
            this.Ready = new Long(source.Ready);
        }
        if (source.SummaryOverview != null) {
            this.SummaryOverview = new TagSummaryOverviewItem[source.SummaryOverview.length];
            for (int i = 0; i < source.SummaryOverview.length; i++) {
                this.SummaryOverview[i] = new TagSummaryOverviewItem(source.SummaryOverview[i]);
            }
        }
        if (source.SummaryTotal != null) {
            this.SummaryTotal = new SummaryTotal(source.SummaryTotal);
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
        this.setParamArrayObj(map, prefix + "SummaryOverview.", this.SummaryOverview);
        this.setParamObj(map, prefix + "SummaryTotal.", this.SummaryTotal);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

