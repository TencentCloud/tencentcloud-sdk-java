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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpnGatewaySslClientResponse extends AbstractModel {

    /**
    * <p>异步任务ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>SSL VPN客户端唯一ID</p>
    */
    @SerializedName("SslVpnClientId")
    @Expose
    private String SslVpnClientId;

    /**
    * <p>SSL VPN客户端唯一ID</p><p>仅批量场景返回</p>
    */
    @SerializedName("SslVpnClientIds")
    @Expose
    private String [] SslVpnClientIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>异步任务ID。</p> 
     * @return TaskId <p>异步任务ID。</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>异步任务ID。</p>
     * @param TaskId <p>异步任务ID。</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>SSL VPN客户端唯一ID</p> 
     * @return SslVpnClientId <p>SSL VPN客户端唯一ID</p>
     */
    public String getSslVpnClientId() {
        return this.SslVpnClientId;
    }

    /**
     * Set <p>SSL VPN客户端唯一ID</p>
     * @param SslVpnClientId <p>SSL VPN客户端唯一ID</p>
     */
    public void setSslVpnClientId(String SslVpnClientId) {
        this.SslVpnClientId = SslVpnClientId;
    }

    /**
     * Get <p>SSL VPN客户端唯一ID</p><p>仅批量场景返回</p> 
     * @return SslVpnClientIds <p>SSL VPN客户端唯一ID</p><p>仅批量场景返回</p>
     */
    public String [] getSslVpnClientIds() {
        return this.SslVpnClientIds;
    }

    /**
     * Set <p>SSL VPN客户端唯一ID</p><p>仅批量场景返回</p>
     * @param SslVpnClientIds <p>SSL VPN客户端唯一ID</p><p>仅批量场景返回</p>
     */
    public void setSslVpnClientIds(String [] SslVpnClientIds) {
        this.SslVpnClientIds = SslVpnClientIds;
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

    public CreateVpnGatewaySslClientResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpnGatewaySslClientResponse(CreateVpnGatewaySslClientResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.SslVpnClientId != null) {
            this.SslVpnClientId = new String(source.SslVpnClientId);
        }
        if (source.SslVpnClientIds != null) {
            this.SslVpnClientIds = new String[source.SslVpnClientIds.length];
            for (int i = 0; i < source.SslVpnClientIds.length; i++) {
                this.SslVpnClientIds[i] = new String(source.SslVpnClientIds[i]);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SslVpnClientId", this.SslVpnClientId);
        this.setParamArraySimple(map, prefix + "SslVpnClientIds.", this.SslVpnClientIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

