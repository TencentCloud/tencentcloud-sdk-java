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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHealthCheckPoliciesResponse extends AbstractModel {

    /**
    * 健康检测策略数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckPolicies")
    @Expose
    private HealthCheckPolicy [] HealthCheckPolicies;

    /**
    * 数组总数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 健康检测策略数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckPolicies 健康检测策略数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckPolicy [] getHealthCheckPolicies() {
        return this.HealthCheckPolicies;
    }

    /**
     * Set 健康检测策略数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckPolicies 健康检测策略数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckPolicies(HealthCheckPolicy [] HealthCheckPolicies) {
        this.HealthCheckPolicies = HealthCheckPolicies;
    }

    /**
     * Get 数组总数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 数组总数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数组总数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 数组总数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeHealthCheckPoliciesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHealthCheckPoliciesResponse(DescribeHealthCheckPoliciesResponse source) {
        if (source.HealthCheckPolicies != null) {
            this.HealthCheckPolicies = new HealthCheckPolicy[source.HealthCheckPolicies.length];
            for (int i = 0; i < source.HealthCheckPolicies.length; i++) {
                this.HealthCheckPolicies[i] = new HealthCheckPolicy(source.HealthCheckPolicies[i]);
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
        this.setParamArrayObj(map, prefix + "HealthCheckPolicies.", this.HealthCheckPolicies);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

