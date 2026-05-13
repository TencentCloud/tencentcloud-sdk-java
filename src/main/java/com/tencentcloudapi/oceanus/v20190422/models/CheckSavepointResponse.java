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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckSavepointResponse extends AbstractModel {

    /**
    * <p>资源 id</p>
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * <p>1=可用，2=不可用</p>
    */
    @SerializedName("SavepointStatus")
    @Expose
    private Long SavepointStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资源 id</p> 
     * @return SerialId <p>资源 id</p>
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set <p>资源 id</p>
     * @param SerialId <p>资源 id</p>
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get <p>1=可用，2=不可用</p> 
     * @return SavepointStatus <p>1=可用，2=不可用</p>
     */
    public Long getSavepointStatus() {
        return this.SavepointStatus;
    }

    /**
     * Set <p>1=可用，2=不可用</p>
     * @param SavepointStatus <p>1=可用，2=不可用</p>
     */
    public void setSavepointStatus(Long SavepointStatus) {
        this.SavepointStatus = SavepointStatus;
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

    public CheckSavepointResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckSavepointResponse(CheckSavepointResponse source) {
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.SavepointStatus != null) {
            this.SavepointStatus = new Long(source.SavepointStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "SavepointStatus", this.SavepointStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

