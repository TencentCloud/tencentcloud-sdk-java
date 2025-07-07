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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductEventListResponse extends AbstractModel {

    /**
    * 事件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Events")
    @Expose
    private DescribeProductEventListEvents [] Events;

    /**
    * 事件统计
    */
    @SerializedName("OverView")
    @Expose
    private DescribeProductEventListOverView OverView;

    /**
    * 事件总数
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 事件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Events 事件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeProductEventListEvents [] getEvents() {
        return this.Events;
    }

    /**
     * Set 事件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Events 事件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvents(DescribeProductEventListEvents [] Events) {
        this.Events = Events;
    }

    /**
     * Get 事件统计 
     * @return OverView 事件统计
     */
    public DescribeProductEventListOverView getOverView() {
        return this.OverView;
    }

    /**
     * Set 事件统计
     * @param OverView 事件统计
     */
    public void setOverView(DescribeProductEventListOverView OverView) {
        this.OverView = OverView;
    }

    /**
     * Get 事件总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 事件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 事件总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 事件总数
注意：此字段可能返回 null，表示取不到有效值。
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

    public DescribeProductEventListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductEventListResponse(DescribeProductEventListResponse source) {
        if (source.Events != null) {
            this.Events = new DescribeProductEventListEvents[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new DescribeProductEventListEvents(source.Events[i]);
            }
        }
        if (source.OverView != null) {
            this.OverView = new DescribeProductEventListOverView(source.OverView);
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
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamObj(map, prefix + "OverView.", this.OverView);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

