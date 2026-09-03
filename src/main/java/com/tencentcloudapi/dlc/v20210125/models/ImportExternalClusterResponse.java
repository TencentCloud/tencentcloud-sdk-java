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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportExternalClusterResponse extends AbstractModel {

    /**
    * <p>已落库的 resource_pool 主行 ID。</p>
    */
    @SerializedName("ResourcePoolId")
    @Expose
    private Long ResourcePoolId;

    /**
    * <p>资源池唯一编码。</p>
    */
    @SerializedName("ResourcePoolCode")
    @Expose
    private String ResourcePoolCode;

    /**
    * <p>注册工作流 ID，可用于查询进度。</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private Long WorkflowId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>已落库的 resource_pool 主行 ID。</p> 
     * @return ResourcePoolId <p>已落库的 resource_pool 主行 ID。</p>
     */
    public Long getResourcePoolId() {
        return this.ResourcePoolId;
    }

    /**
     * Set <p>已落库的 resource_pool 主行 ID。</p>
     * @param ResourcePoolId <p>已落库的 resource_pool 主行 ID。</p>
     */
    public void setResourcePoolId(Long ResourcePoolId) {
        this.ResourcePoolId = ResourcePoolId;
    }

    /**
     * Get <p>资源池唯一编码。</p> 
     * @return ResourcePoolCode <p>资源池唯一编码。</p>
     */
    public String getResourcePoolCode() {
        return this.ResourcePoolCode;
    }

    /**
     * Set <p>资源池唯一编码。</p>
     * @param ResourcePoolCode <p>资源池唯一编码。</p>
     */
    public void setResourcePoolCode(String ResourcePoolCode) {
        this.ResourcePoolCode = ResourcePoolCode;
    }

    /**
     * Get <p>注册工作流 ID，可用于查询进度。</p> 
     * @return WorkflowId <p>注册工作流 ID，可用于查询进度。</p>
     */
    public Long getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>注册工作流 ID，可用于查询进度。</p>
     * @param WorkflowId <p>注册工作流 ID，可用于查询进度。</p>
     */
    public void setWorkflowId(Long WorkflowId) {
        this.WorkflowId = WorkflowId;
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

    public ImportExternalClusterResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportExternalClusterResponse(ImportExternalClusterResponse source) {
        if (source.ResourcePoolId != null) {
            this.ResourcePoolId = new Long(source.ResourcePoolId);
        }
        if (source.ResourcePoolCode != null) {
            this.ResourcePoolCode = new String(source.ResourcePoolCode);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new Long(source.WorkflowId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourcePoolId", this.ResourcePoolId);
        this.setParamSimple(map, prefix + "ResourcePoolCode", this.ResourcePoolCode);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

