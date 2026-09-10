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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFunctionCodeResponse extends AbstractModel {

    /**
    * <p>调用scf返回的错误码</p>
    */
    @SerializedName("SCFErrorCode")
    @Expose
    private String SCFErrorCode;

    /**
    * <p>错误码对应的描述信息</p>
    */
    @SerializedName("SCFErrorMsg")
    @Expose
    private String SCFErrorMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>调用scf返回的错误码</p> 
     * @return SCFErrorCode <p>调用scf返回的错误码</p>
     */
    public String getSCFErrorCode() {
        return this.SCFErrorCode;
    }

    /**
     * Set <p>调用scf返回的错误码</p>
     * @param SCFErrorCode <p>调用scf返回的错误码</p>
     */
    public void setSCFErrorCode(String SCFErrorCode) {
        this.SCFErrorCode = SCFErrorCode;
    }

    /**
     * Get <p>错误码对应的描述信息</p> 
     * @return SCFErrorMsg <p>错误码对应的描述信息</p>
     */
    public String getSCFErrorMsg() {
        return this.SCFErrorMsg;
    }

    /**
     * Set <p>错误码对应的描述信息</p>
     * @param SCFErrorMsg <p>错误码对应的描述信息</p>
     */
    public void setSCFErrorMsg(String SCFErrorMsg) {
        this.SCFErrorMsg = SCFErrorMsg;
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

    public UpdateFunctionCodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFunctionCodeResponse(UpdateFunctionCodeResponse source) {
        if (source.SCFErrorCode != null) {
            this.SCFErrorCode = new String(source.SCFErrorCode);
        }
        if (source.SCFErrorMsg != null) {
            this.SCFErrorMsg = new String(source.SCFErrorMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SCFErrorCode", this.SCFErrorCode);
        this.setParamSimple(map, prefix + "SCFErrorMsg", this.SCFErrorMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

