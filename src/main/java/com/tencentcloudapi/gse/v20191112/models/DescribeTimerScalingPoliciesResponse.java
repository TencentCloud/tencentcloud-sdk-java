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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimerScalingPoliciesResponse extends AbstractModel {

    /**
    * 定时器扩缩容策略配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerScalingPolicies")
    @Expose
    private TimerScalingPolicy [] TimerScalingPolicies;

    /**
    * 定时器总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 定时器扩缩容策略配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerScalingPolicies 定时器扩缩容策略配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimerScalingPolicy [] getTimerScalingPolicies() {
        return this.TimerScalingPolicies;
    }

    /**
     * Set 定时器扩缩容策略配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerScalingPolicies 定时器扩缩容策略配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerScalingPolicies(TimerScalingPolicy [] TimerScalingPolicies) {
        this.TimerScalingPolicies = TimerScalingPolicies;
    }

    /**
     * Get 定时器总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 定时器总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 定时器总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 定时器总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeTimerScalingPoliciesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimerScalingPoliciesResponse(DescribeTimerScalingPoliciesResponse source) {
        if (source.TimerScalingPolicies != null) {
            this.TimerScalingPolicies = new TimerScalingPolicy[source.TimerScalingPolicies.length];
            for (int i = 0; i < source.TimerScalingPolicies.length; i++) {
                this.TimerScalingPolicies[i] = new TimerScalingPolicy(source.TimerScalingPolicies[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TimerScalingPolicies.", this.TimerScalingPolicies);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

