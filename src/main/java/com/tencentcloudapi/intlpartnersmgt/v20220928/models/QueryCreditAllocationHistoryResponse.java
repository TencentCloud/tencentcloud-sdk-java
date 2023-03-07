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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCreditAllocationHistoryResponse extends AbstractModel{

    /**
    * 历史信息总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 历史信息详细列表数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("History")
    @Expose
    private QueryCreditAllocationHistoryData [] History;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 历史信息总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 历史信息总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 历史信息总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 历史信息总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 历史信息详细列表数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return History 历史信息详细列表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QueryCreditAllocationHistoryData [] getHistory() {
        return this.History;
    }

    /**
     * Set 历史信息详细列表数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param History 历史信息详细列表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistory(QueryCreditAllocationHistoryData [] History) {
        this.History = History;
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

    public QueryCreditAllocationHistoryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCreditAllocationHistoryResponse(QueryCreditAllocationHistoryResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.History != null) {
            this.History = new QueryCreditAllocationHistoryData[source.History.length];
            for (int i = 0; i < source.History.length; i++) {
                this.History[i] = new QueryCreditAllocationHistoryData(source.History[i]);
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
        this.setParamArrayObj(map, prefix + "History.", this.History);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

