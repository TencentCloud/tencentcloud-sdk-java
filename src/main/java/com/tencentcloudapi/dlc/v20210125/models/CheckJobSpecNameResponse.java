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

public class CheckJobSpecNameResponse extends AbstractModel {

    /**
    * <p>名称是否可用（未重名且不含保留字）</p>
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * <p>不可用时的原因；可用时为 null</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>名称是否可用（未重名且不含保留字）</p> 
     * @return Available <p>名称是否可用（未重名且不含保留字）</p>
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>名称是否可用（未重名且不含保留字）</p>
     * @param Available <p>名称是否可用（未重名且不含保留字）</p>
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get <p>不可用时的原因；可用时为 null</p> 
     * @return Reason <p>不可用时的原因；可用时为 null</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>不可用时的原因；可用时为 null</p>
     * @param Reason <p>不可用时的原因；可用时为 null</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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

    public CheckJobSpecNameResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckJobSpecNameResponse(CheckJobSpecNameResponse source) {
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

