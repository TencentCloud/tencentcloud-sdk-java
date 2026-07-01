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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteAgentApiResponse extends AbstractModel {

    /**
    * <p>请求路径</p>
    */
    @SerializedName("RequestPath")
    @Expose
    private String RequestPath;

    /**
    * <p>返回的具体指</p>
    */
    @SerializedName("AgentData")
    @Expose
    private String AgentData;

    /**
    * <p>错误码信息</p>
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>请求路径</p> 
     * @return RequestPath <p>请求路径</p>
     */
    public String getRequestPath() {
        return this.RequestPath;
    }

    /**
     * Set <p>请求路径</p>
     * @param RequestPath <p>请求路径</p>
     */
    public void setRequestPath(String RequestPath) {
        this.RequestPath = RequestPath;
    }

    /**
     * Get <p>返回的具体指</p> 
     * @return AgentData <p>返回的具体指</p>
     */
    public String getAgentData() {
        return this.AgentData;
    }

    /**
     * Set <p>返回的具体指</p>
     * @param AgentData <p>返回的具体指</p>
     */
    public void setAgentData(String AgentData) {
        this.AgentData = AgentData;
    }

    /**
     * Get <p>错误码信息</p> 
     * @return ErrorMsg <p>错误码信息</p>
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set <p>错误码信息</p>
     * @param ErrorMsg <p>错误码信息</p>
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
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

    public ExecuteAgentApiResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteAgentApiResponse(ExecuteAgentApiResponse source) {
        if (source.RequestPath != null) {
            this.RequestPath = new String(source.RequestPath);
        }
        if (source.AgentData != null) {
            this.AgentData = new String(source.AgentData);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestPath", this.RequestPath);
        this.setParamSimple(map, prefix + "AgentData", this.AgentData);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

