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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckAddressByPrometheusResponse extends AbstractModel {

    /**
    * <p>实际探测的地址</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>探测是否成功</p>
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * <p>探测失败时返回错误信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实际探测的地址</p> 
     * @return Target <p>实际探测的地址</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>实际探测的地址</p>
     * @param Target <p>实际探测的地址</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>探测是否成功</p> 
     * @return Success <p>探测是否成功</p>
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set <p>探测是否成功</p>
     * @param Success <p>探测是否成功</p>
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get <p>探测失败时返回错误信息</p> 
     * @return Message <p>探测失败时返回错误信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>探测失败时返回错误信息</p>
     * @param Message <p>探测失败时返回错误信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
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

    public CheckAddressByPrometheusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAddressByPrometheusResponse(CheckAddressByPrometheusResponse source) {
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

