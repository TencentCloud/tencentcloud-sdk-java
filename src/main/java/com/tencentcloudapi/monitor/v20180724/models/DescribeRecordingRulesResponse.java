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

public class DescribeRecordingRulesResponse extends AbstractModel {

    /**
    * <p>规则组数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>规则组详情</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordingRuleSet")
    @Expose
    private RecordingRuleSet [] RecordingRuleSet;

    /**
    * <p>预聚合规则数</p>
    */
    @SerializedName("TotalRuleCount")
    @Expose
    private Long TotalRuleCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>规则组数量</p> 
     * @return TotalCount <p>规则组数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>规则组数量</p>
     * @param TotalCount <p>规则组数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>规则组详情</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordingRuleSet <p>规则组详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordingRuleSet [] getRecordingRuleSet() {
        return this.RecordingRuleSet;
    }

    /**
     * Set <p>规则组详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordingRuleSet <p>规则组详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordingRuleSet(RecordingRuleSet [] RecordingRuleSet) {
        this.RecordingRuleSet = RecordingRuleSet;
    }

    /**
     * Get <p>预聚合规则数</p> 
     * @return TotalRuleCount <p>预聚合规则数</p>
     */
    public Long getTotalRuleCount() {
        return this.TotalRuleCount;
    }

    /**
     * Set <p>预聚合规则数</p>
     * @param TotalRuleCount <p>预聚合规则数</p>
     */
    public void setTotalRuleCount(Long TotalRuleCount) {
        this.TotalRuleCount = TotalRuleCount;
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

    public DescribeRecordingRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordingRulesResponse(DescribeRecordingRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RecordingRuleSet != null) {
            this.RecordingRuleSet = new RecordingRuleSet[source.RecordingRuleSet.length];
            for (int i = 0; i < source.RecordingRuleSet.length; i++) {
                this.RecordingRuleSet[i] = new RecordingRuleSet(source.RecordingRuleSet[i]);
            }
        }
        if (source.TotalRuleCount != null) {
            this.TotalRuleCount = new Long(source.TotalRuleCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RecordingRuleSet.", this.RecordingRuleSet);
        this.setParamSimple(map, prefix + "TotalRuleCount", this.TotalRuleCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

