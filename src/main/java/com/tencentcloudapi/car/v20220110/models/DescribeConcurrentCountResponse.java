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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrentCountResponse extends AbstractModel {

    /**
    * 并发总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 并发运行数，包括预启动中的、已连接的、等待重连、清理恢复等所有非空闲的并发数，所以刷新项目或断开并发包的用户连接，都会影响到该值
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 并发总数 
     * @return Total 并发总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 并发总数
     * @param Total 并发总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 并发运行数，包括预启动中的、已连接的、等待重连、清理恢复等所有非空闲的并发数，所以刷新项目或断开并发包的用户连接，都会影响到该值 
     * @return Running 并发运行数，包括预启动中的、已连接的、等待重连、清理恢复等所有非空闲的并发数，所以刷新项目或断开并发包的用户连接，都会影响到该值
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set 并发运行数，包括预启动中的、已连接的、等待重连、清理恢复等所有非空闲的并发数，所以刷新项目或断开并发包的用户连接，都会影响到该值
     * @param Running 并发运行数，包括预启动中的、已连接的、等待重连、清理恢复等所有非空闲的并发数，所以刷新项目或断开并发包的用户连接，都会影响到该值
     */
    public void setRunning(Long Running) {
        this.Running = Running;
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

    public DescribeConcurrentCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrentCountResponse(DescribeConcurrentCountResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Running != null) {
            this.Running = new Long(source.Running);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

