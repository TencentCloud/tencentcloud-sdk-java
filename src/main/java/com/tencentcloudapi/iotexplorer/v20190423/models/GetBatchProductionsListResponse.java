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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetBatchProductionsListResponse extends AbstractModel{

    /**
    * 返回详情信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchProductions")
    @Expose
    private BatchProductionInfo [] BatchProductions;

    /**
    * 返回数量。
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回详情信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchProductions 返回详情信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BatchProductionInfo [] getBatchProductions() {
        return this.BatchProductions;
    }

    /**
     * Set 返回详情信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchProductions 返回详情信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchProductions(BatchProductionInfo [] BatchProductions) {
        this.BatchProductions = BatchProductions;
    }

    /**
     * Get 返回数量。 
     * @return TotalCnt 返回数量。
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 返回数量。
     * @param TotalCnt 返回数量。
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
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

    public GetBatchProductionsListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetBatchProductionsListResponse(GetBatchProductionsListResponse source) {
        if (source.BatchProductions != null) {
            this.BatchProductions = new BatchProductionInfo[source.BatchProductions.length];
            for (int i = 0; i < source.BatchProductions.length; i++) {
                this.BatchProductions[i] = new BatchProductionInfo(source.BatchProductions[i]);
            }
        }
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BatchProductions.", this.BatchProductions);
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

