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

public class DescribeFleetUtilizationResponse extends AbstractModel{

    /**
    * 服务器舰队利用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetUtilization")
    @Expose
    private FleetUtilization [] FleetUtilization;

    /**
    * 总数，最小值0
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
     * Get 服务器舰队利用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetUtilization 服务器舰队利用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FleetUtilization [] getFleetUtilization() {
        return this.FleetUtilization;
    }

    /**
     * Set 服务器舰队利用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetUtilization 服务器舰队利用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetUtilization(FleetUtilization [] FleetUtilization) {
        this.FleetUtilization = FleetUtilization;
    }

    /**
     * Get 总数，最小值0 
     * @return TotalCount 总数，最小值0
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数，最小值0
     * @param TotalCount 总数，最小值0
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

    public DescribeFleetUtilizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFleetUtilizationResponse(DescribeFleetUtilizationResponse source) {
        if (source.FleetUtilization != null) {
            this.FleetUtilization = new FleetUtilization[source.FleetUtilization.length];
            for (int i = 0; i < source.FleetUtilization.length; i++) {
                this.FleetUtilization[i] = new FleetUtilization(source.FleetUtilization[i]);
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
        this.setParamArrayObj(map, prefix + "FleetUtilization.", this.FleetUtilization);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

