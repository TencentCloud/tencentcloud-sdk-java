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

public class DescribeAccidentEventListResponse extends AbstractModel {

    /**
    * 平台事件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alarms")
    @Expose
    private DescribeAccidentEventListAlarms [] Alarms;

    /**
    * 平台事件的总数
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
     * Get 平台事件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alarms 平台事件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeAccidentEventListAlarms [] getAlarms() {
        return this.Alarms;
    }

    /**
     * Set 平台事件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alarms 平台事件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarms(DescribeAccidentEventListAlarms [] Alarms) {
        this.Alarms = Alarms;
    }

    /**
     * Get 平台事件的总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 平台事件的总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 平台事件的总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 平台事件的总数
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

    public DescribeAccidentEventListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccidentEventListResponse(DescribeAccidentEventListResponse source) {
        if (source.Alarms != null) {
            this.Alarms = new DescribeAccidentEventListAlarms[source.Alarms.length];
            for (int i = 0; i < source.Alarms.length; i++) {
                this.Alarms[i] = new DescribeAccidentEventListAlarms(source.Alarms[i]);
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
        this.setParamArrayObj(map, prefix + "Alarms.", this.Alarms);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

