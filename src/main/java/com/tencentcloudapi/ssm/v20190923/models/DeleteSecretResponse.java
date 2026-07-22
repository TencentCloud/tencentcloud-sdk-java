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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecretResponse extends AbstractModel {

    /**
    * <p>指定删除的凭据名称。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>凭据删除的日期，unix时间戳。</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * <p>异步删除任务 ID</p>
    */
    @SerializedName("FlowID")
    @Expose
    private Long FlowID;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>指定删除的凭据名称。</p> 
     * @return SecretName <p>指定删除的凭据名称。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>指定删除的凭据名称。</p>
     * @param SecretName <p>指定删除的凭据名称。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>凭据删除的日期，unix时间戳。</p> 
     * @return DeleteTime <p>凭据删除的日期，unix时间戳。</p>
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>凭据删除的日期，unix时间戳。</p>
     * @param DeleteTime <p>凭据删除的日期，unix时间戳。</p>
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <p>异步删除任务 ID</p> 
     * @return FlowID <p>异步删除任务 ID</p>
     */
    public Long getFlowID() {
        return this.FlowID;
    }

    /**
     * Set <p>异步删除任务 ID</p>
     * @param FlowID <p>异步删除任务 ID</p>
     */
    public void setFlowID(Long FlowID) {
        this.FlowID = FlowID;
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

    public DeleteSecretResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecretResponse(DeleteSecretResponse source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new Long(source.DeleteTime);
        }
        if (source.FlowID != null) {
            this.FlowID = new Long(source.FlowID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "FlowID", this.FlowID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

