/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.svp.v20240125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSavingPlanOverviewResponse extends AbstractModel {

    /**
    * 节省计划总览明细数据	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Overviews")
    @Expose
    private SavingPlanOverviewDetail [] Overviews;

    /**
    * 查询命中的节省计划总览明细数据总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 节省计划总览明细数据	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Overviews 节省计划总览明细数据	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SavingPlanOverviewDetail [] getOverviews() {
        return this.Overviews;
    }

    /**
     * Set 节省计划总览明细数据	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Overviews 节省计划总览明细数据	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverviews(SavingPlanOverviewDetail [] Overviews) {
        this.Overviews = Overviews;
    }

    /**
     * Get 查询命中的节省计划总览明细数据总条数 
     * @return Total 查询命中的节省计划总览明细数据总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 查询命中的节省计划总览明细数据总条数
     * @param Total 查询命中的节省计划总览明细数据总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeSavingPlanOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSavingPlanOverviewResponse(DescribeSavingPlanOverviewResponse source) {
        if (source.Overviews != null) {
            this.Overviews = new SavingPlanOverviewDetail[source.Overviews.length];
            for (int i = 0; i < source.Overviews.length; i++) {
                this.Overviews[i] = new SavingPlanOverviewDetail(source.Overviews[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Overviews.", this.Overviews);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

