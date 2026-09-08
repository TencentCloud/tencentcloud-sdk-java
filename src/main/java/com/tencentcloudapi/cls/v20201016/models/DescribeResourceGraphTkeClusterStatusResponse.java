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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceGraphTkeClusterStatusResponse extends AbstractModel {

    /**
    * <p>已接入的tke集群信息</p>
    */
    @SerializedName("ConnectedClusterInfos")
    @Expose
    private ResourceGraphTkeClusterInfo [] ConnectedClusterInfos;

    /**
    * <p>未接入的tke集群id</p>
    */
    @SerializedName("UnconnectedClusterIds")
    @Expose
    private String [] UnconnectedClusterIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>已接入的tke集群信息</p> 
     * @return ConnectedClusterInfos <p>已接入的tke集群信息</p>
     */
    public ResourceGraphTkeClusterInfo [] getConnectedClusterInfos() {
        return this.ConnectedClusterInfos;
    }

    /**
     * Set <p>已接入的tke集群信息</p>
     * @param ConnectedClusterInfos <p>已接入的tke集群信息</p>
     */
    public void setConnectedClusterInfos(ResourceGraphTkeClusterInfo [] ConnectedClusterInfos) {
        this.ConnectedClusterInfos = ConnectedClusterInfos;
    }

    /**
     * Get <p>未接入的tke集群id</p> 
     * @return UnconnectedClusterIds <p>未接入的tke集群id</p>
     */
    public String [] getUnconnectedClusterIds() {
        return this.UnconnectedClusterIds;
    }

    /**
     * Set <p>未接入的tke集群id</p>
     * @param UnconnectedClusterIds <p>未接入的tke集群id</p>
     */
    public void setUnconnectedClusterIds(String [] UnconnectedClusterIds) {
        this.UnconnectedClusterIds = UnconnectedClusterIds;
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

    public DescribeResourceGraphTkeClusterStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphTkeClusterStatusResponse(DescribeResourceGraphTkeClusterStatusResponse source) {
        if (source.ConnectedClusterInfos != null) {
            this.ConnectedClusterInfos = new ResourceGraphTkeClusterInfo[source.ConnectedClusterInfos.length];
            for (int i = 0; i < source.ConnectedClusterInfos.length; i++) {
                this.ConnectedClusterInfos[i] = new ResourceGraphTkeClusterInfo(source.ConnectedClusterInfos[i]);
            }
        }
        if (source.UnconnectedClusterIds != null) {
            this.UnconnectedClusterIds = new String[source.UnconnectedClusterIds.length];
            for (int i = 0; i < source.UnconnectedClusterIds.length; i++) {
                this.UnconnectedClusterIds[i] = new String(source.UnconnectedClusterIds[i]);
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
        this.setParamArrayObj(map, prefix + "ConnectedClusterInfos.", this.ConnectedClusterInfos);
        this.setParamArraySimple(map, prefix + "UnconnectedClusterIds.", this.UnconnectedClusterIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

