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

public class DescribeSavingPlanDeductResponse extends AbstractModel {

    /**
    * 查询命中的节省计划抵扣明细数据总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 查询命中的节省计划抵扣明细数据明细
    */
    @SerializedName("Deducts")
    @Expose
    private SavingPlanDeductDetail [] Deducts;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询命中的节省计划抵扣明细数据总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 查询命中的节省计划抵扣明细数据总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 查询命中的节省计划抵扣明细数据总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 查询命中的节省计划抵扣明细数据总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 查询命中的节省计划抵扣明细数据明细 
     * @return Deducts 查询命中的节省计划抵扣明细数据明细
     */
    public SavingPlanDeductDetail [] getDeducts() {
        return this.Deducts;
    }

    /**
     * Set 查询命中的节省计划抵扣明细数据明细
     * @param Deducts 查询命中的节省计划抵扣明细数据明细
     */
    public void setDeducts(SavingPlanDeductDetail [] Deducts) {
        this.Deducts = Deducts;
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

    public DescribeSavingPlanDeductResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSavingPlanDeductResponse(DescribeSavingPlanDeductResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Deducts != null) {
            this.Deducts = new SavingPlanDeductDetail[source.Deducts.length];
            for (int i = 0; i < source.Deducts.length; i++) {
                this.Deducts[i] = new SavingPlanDeductDetail(source.Deducts[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Deducts.", this.Deducts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

