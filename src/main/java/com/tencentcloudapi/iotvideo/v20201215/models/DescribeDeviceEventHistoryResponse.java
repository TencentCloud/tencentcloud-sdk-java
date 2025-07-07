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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceEventHistoryResponse extends AbstractModel {

    /**
    * 搜索上下文, 用作查询游标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 搜索结果数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 搜索结果是否已经结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Listover")
    @Expose
    private Boolean Listover;

    /**
    * 搜集结果集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventHistory")
    @Expose
    private EventHistoryItem [] EventHistory;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 搜索上下文, 用作查询游标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Context 搜索上下文, 用作查询游标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 搜索上下文, 用作查询游标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Context 搜索上下文, 用作查询游标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 搜索结果数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 搜索结果数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 搜索结果数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 搜索结果数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 搜索结果是否已经结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Listover 搜索结果是否已经结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getListover() {
        return this.Listover;
    }

    /**
     * Set 搜索结果是否已经结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param Listover 搜索结果是否已经结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListover(Boolean Listover) {
        this.Listover = Listover;
    }

    /**
     * Get 搜集结果集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventHistory 搜集结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventHistoryItem [] getEventHistory() {
        return this.EventHistory;
    }

    /**
     * Set 搜集结果集
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventHistory 搜集结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventHistory(EventHistoryItem [] EventHistory) {
        this.EventHistory = EventHistory;
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

    public DescribeDeviceEventHistoryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceEventHistoryResponse(DescribeDeviceEventHistoryResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Listover != null) {
            this.Listover = new Boolean(source.Listover);
        }
        if (source.EventHistory != null) {
            this.EventHistory = new EventHistoryItem[source.EventHistory.length];
            for (int i = 0; i < source.EventHistory.length; i++) {
                this.EventHistory[i] = new EventHistoryItem(source.EventHistory[i]);
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
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Listover", this.Listover);
        this.setParamArrayObj(map, prefix + "EventHistory.", this.EventHistory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

