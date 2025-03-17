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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployCertificateInstanceResponse extends AbstractModel {

    /**
    * 云资源部署任务ID
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * 部署任务创建状态；1表示创建成功； 0表示当前存在部署中的任务，未创建新的部署任务；返回值DeployRecordId为部署中的任务ID
    */
    @SerializedName("DeployStatus")
    @Expose
    private Long DeployStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云资源部署任务ID 
     * @return DeployRecordId 云资源部署任务ID
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set 云资源部署任务ID
     * @param DeployRecordId 云资源部署任务ID
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get 部署任务创建状态；1表示创建成功； 0表示当前存在部署中的任务，未创建新的部署任务；返回值DeployRecordId为部署中的任务ID 
     * @return DeployStatus 部署任务创建状态；1表示创建成功； 0表示当前存在部署中的任务，未创建新的部署任务；返回值DeployRecordId为部署中的任务ID
     */
    public Long getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set 部署任务创建状态；1表示创建成功； 0表示当前存在部署中的任务，未创建新的部署任务；返回值DeployRecordId为部署中的任务ID
     * @param DeployStatus 部署任务创建状态；1表示创建成功； 0表示当前存在部署中的任务，未创建新的部署任务；返回值DeployRecordId为部署中的任务ID
     */
    public void setDeployStatus(Long DeployStatus) {
        this.DeployStatus = DeployStatus;
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

    public DeployCertificateInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployCertificateInstanceResponse(DeployCertificateInstanceResponse source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
        if (source.DeployStatus != null) {
            this.DeployStatus = new Long(source.DeployStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "DeployStatus", this.DeployStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

