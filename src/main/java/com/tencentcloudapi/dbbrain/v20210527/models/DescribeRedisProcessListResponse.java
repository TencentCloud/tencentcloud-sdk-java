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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisProcessListResponse extends AbstractModel {

    /**
    * 该实例的Proxy节点数量，可用于分页查询。
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * 实时会话详情列表。
    */
    @SerializedName("Processes")
    @Expose
    private Process [] Processes;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该实例的Proxy节点数量，可用于分页查询。 
     * @return ProxyCount 该实例的Proxy节点数量，可用于分页查询。
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set 该实例的Proxy节点数量，可用于分页查询。
     * @param ProxyCount 该实例的Proxy节点数量，可用于分页查询。
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get 实时会话详情列表。 
     * @return Processes 实时会话详情列表。
     */
    public Process [] getProcesses() {
        return this.Processes;
    }

    /**
     * Set 实时会话详情列表。
     * @param Processes 实时会话详情列表。
     */
    public void setProcesses(Process [] Processes) {
        this.Processes = Processes;
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

    public DescribeRedisProcessListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisProcessListResponse(DescribeRedisProcessListResponse source) {
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.Processes != null) {
            this.Processes = new Process[source.Processes.length];
            for (int i = 0; i < source.Processes.length; i++) {
                this.Processes[i] = new Process(source.Processes[i]);
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
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamArrayObj(map, prefix + "Processes.", this.Processes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

