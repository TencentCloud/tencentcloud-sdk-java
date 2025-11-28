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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterMaintenanceWindowAndExclusionsResponse extends AbstractModel {

    /**
    * 维护时间窗口和排除项
    */
    @SerializedName("MaintenanceWindowAndExclusions")
    @Expose
    private MaintenanceWindowAndExclusion [] MaintenanceWindowAndExclusions;

    /**
    * 总条目数
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
     * Get 维护时间窗口和排除项 
     * @return MaintenanceWindowAndExclusions 维护时间窗口和排除项
     */
    public MaintenanceWindowAndExclusion [] getMaintenanceWindowAndExclusions() {
        return this.MaintenanceWindowAndExclusions;
    }

    /**
     * Set 维护时间窗口和排除项
     * @param MaintenanceWindowAndExclusions 维护时间窗口和排除项
     */
    public void setMaintenanceWindowAndExclusions(MaintenanceWindowAndExclusion [] MaintenanceWindowAndExclusions) {
        this.MaintenanceWindowAndExclusions = MaintenanceWindowAndExclusions;
    }

    /**
     * Get 总条目数 
     * @return TotalCount 总条目数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条目数
     * @param TotalCount 总条目数
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

    public DescribeClusterMaintenanceWindowAndExclusionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterMaintenanceWindowAndExclusionsResponse(DescribeClusterMaintenanceWindowAndExclusionsResponse source) {
        if (source.MaintenanceWindowAndExclusions != null) {
            this.MaintenanceWindowAndExclusions = new MaintenanceWindowAndExclusion[source.MaintenanceWindowAndExclusions.length];
            for (int i = 0; i < source.MaintenanceWindowAndExclusions.length; i++) {
                this.MaintenanceWindowAndExclusions[i] = new MaintenanceWindowAndExclusion(source.MaintenanceWindowAndExclusions[i]);
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
        this.setParamArrayObj(map, prefix + "MaintenanceWindowAndExclusions.", this.MaintenanceWindowAndExclusions);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

