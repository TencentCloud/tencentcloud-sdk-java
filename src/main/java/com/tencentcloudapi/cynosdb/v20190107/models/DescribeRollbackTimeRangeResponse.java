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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRollbackTimeRangeResponse extends AbstractModel{

    /**
    * 有效回归时间范围开始时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeRangeStart")
    @Expose
    private String TimeRangeStart;

    /**
    * 有效回归时间范围结束时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * 可回档时间范围
    */
    @SerializedName("RollbackTimeRanges")
    @Expose
    private RollbackTimeRange [] RollbackTimeRanges;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 有效回归时间范围开始时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeRangeStart 有效回归时间范围开始时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeRangeStart() {
        return this.TimeRangeStart;
    }

    /**
     * Set 有效回归时间范围开始时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeRangeStart 有效回归时间范围开始时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeRangeStart(String TimeRangeStart) {
        this.TimeRangeStart = TimeRangeStart;
    }

    /**
     * Get 有效回归时间范围结束时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeRangeEnd 有效回归时间范围结束时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set 有效回归时间范围结束时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeRangeEnd 有效回归时间范围结束时间点（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get 可回档时间范围 
     * @return RollbackTimeRanges 可回档时间范围
     */
    public RollbackTimeRange [] getRollbackTimeRanges() {
        return this.RollbackTimeRanges;
    }

    /**
     * Set 可回档时间范围
     * @param RollbackTimeRanges 可回档时间范围
     */
    public void setRollbackTimeRanges(RollbackTimeRange [] RollbackTimeRanges) {
        this.RollbackTimeRanges = RollbackTimeRanges;
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

    public DescribeRollbackTimeRangeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackTimeRangeResponse(DescribeRollbackTimeRangeResponse source) {
        if (source.TimeRangeStart != null) {
            this.TimeRangeStart = new String(source.TimeRangeStart);
        }
        if (source.TimeRangeEnd != null) {
            this.TimeRangeEnd = new String(source.TimeRangeEnd);
        }
        if (source.RollbackTimeRanges != null) {
            this.RollbackTimeRanges = new RollbackTimeRange[source.RollbackTimeRanges.length];
            for (int i = 0; i < source.RollbackTimeRanges.length; i++) {
                this.RollbackTimeRanges[i] = new RollbackTimeRange(source.RollbackTimeRanges[i]);
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
        this.setParamSimple(map, prefix + "TimeRangeStart", this.TimeRangeStart);
        this.setParamSimple(map, prefix + "TimeRangeEnd", this.TimeRangeEnd);
        this.setParamArrayObj(map, prefix + "RollbackTimeRanges.", this.RollbackTimeRanges);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

