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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPayRollAuthListResponse extends AbstractModel{

    /**
    * 核身结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private PayRollAuthResult [] Results;

    /**
    * 总记录条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 记录起始位置，该次请求资源的起始位置，请求中包含偏移量时应答消息返回相同偏移量，否则返回默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 本次返回条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 核身结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 核身结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PayRollAuthResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 核身结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 核身结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(PayRollAuthResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 总记录条数 
     * @return Total 总记录条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总记录条数
     * @param Total 总记录条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 记录起始位置，该次请求资源的起始位置，请求中包含偏移量时应答消息返回相同偏移量，否则返回默认值0 
     * @return Offset 记录起始位置，该次请求资源的起始位置，请求中包含偏移量时应答消息返回相同偏移量，否则返回默认值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录起始位置，该次请求资源的起始位置，请求中包含偏移量时应答消息返回相同偏移量，否则返回默认值0
     * @param Offset 记录起始位置，该次请求资源的起始位置，请求中包含偏移量时应答消息返回相同偏移量，否则返回默认值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 本次返回条数 
     * @return Limit 本次返回条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 本次返回条数
     * @param Limit 本次返回条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetPayRollAuthListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPayRollAuthListResponse(GetPayRollAuthListResponse source) {
        if (source.Results != null) {
            this.Results = new PayRollAuthResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new PayRollAuthResult(source.Results[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

