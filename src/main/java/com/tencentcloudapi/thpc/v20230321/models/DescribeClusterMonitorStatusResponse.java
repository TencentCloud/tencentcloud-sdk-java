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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterMonitorStatusResponse extends AbstractModel {

    /**
    * <p>集群监控状态</p>
    */
    @SerializedName("MonitorStatus")
    @Expose
    private String MonitorStatus;

    /**
    * <p>集群关联的prometheus实例ID</p>
    */
    @SerializedName("PrometheusId")
    @Expose
    private String PrometheusId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>集群监控状态</p> 
     * @return MonitorStatus <p>集群监控状态</p>
     */
    public String getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set <p>集群监控状态</p>
     * @param MonitorStatus <p>集群监控状态</p>
     */
    public void setMonitorStatus(String MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get <p>集群关联的prometheus实例ID</p> 
     * @return PrometheusId <p>集群关联的prometheus实例ID</p>
     */
    public String getPrometheusId() {
        return this.PrometheusId;
    }

    /**
     * Set <p>集群关联的prometheus实例ID</p>
     * @param PrometheusId <p>集群关联的prometheus实例ID</p>
     */
    public void setPrometheusId(String PrometheusId) {
        this.PrometheusId = PrometheusId;
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

    public DescribeClusterMonitorStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterMonitorStatusResponse(DescribeClusterMonitorStatusResponse source) {
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new String(source.MonitorStatus);
        }
        if (source.PrometheusId != null) {
            this.PrometheusId = new String(source.PrometheusId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "PrometheusId", this.PrometheusId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

