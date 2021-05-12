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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFleetStatisticSummaryResponse extends AbstractModel{

    /**
    * 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUsedTimeSeconds")
    @Expose
    private String TotalUsedTimeSeconds;

    /**
    * 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUsedFlowMegaBytes")
    @Expose
    private Float TotalUsedFlowMegaBytes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUsedTimeSeconds 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalUsedTimeSeconds() {
        return this.TotalUsedTimeSeconds;
    }

    /**
     * Set 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUsedTimeSeconds 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUsedTimeSeconds(String TotalUsedTimeSeconds) {
        this.TotalUsedTimeSeconds = TotalUsedTimeSeconds;
    }

    /**
     * Get 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUsedFlowMegaBytes 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalUsedFlowMegaBytes() {
        return this.TotalUsedFlowMegaBytes;
    }

    /**
     * Set 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUsedFlowMegaBytes 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUsedFlowMegaBytes(Float TotalUsedFlowMegaBytes) {
        this.TotalUsedFlowMegaBytes = TotalUsedFlowMegaBytes;
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

    public DescribeFleetStatisticSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFleetStatisticSummaryResponse(DescribeFleetStatisticSummaryResponse source) {
        if (source.TotalUsedTimeSeconds != null) {
            this.TotalUsedTimeSeconds = new String(source.TotalUsedTimeSeconds);
        }
        if (source.TotalUsedFlowMegaBytes != null) {
            this.TotalUsedFlowMegaBytes = new Float(source.TotalUsedFlowMegaBytes);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalUsedTimeSeconds", this.TotalUsedTimeSeconds);
        this.setParamSimple(map, prefix + "TotalUsedFlowMegaBytes", this.TotalUsedFlowMegaBytes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

