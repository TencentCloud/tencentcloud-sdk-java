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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetConversationResponse extends AbstractModel {

    /**
    * <p>重置时间，单位为ms</p>
    */
    @SerializedName("ResetTime")
    @Expose
    private String ResetTime;

    /**
    * <p>重置前的最后一条记录的recordId</p>
    */
    @SerializedName("ResetThroughRecordId")
    @Expose
    private String ResetThroughRecordId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>重置时间，单位为ms</p> 
     * @return ResetTime <p>重置时间，单位为ms</p>
     */
    public String getResetTime() {
        return this.ResetTime;
    }

    /**
     * Set <p>重置时间，单位为ms</p>
     * @param ResetTime <p>重置时间，单位为ms</p>
     */
    public void setResetTime(String ResetTime) {
        this.ResetTime = ResetTime;
    }

    /**
     * Get <p>重置前的最后一条记录的recordId</p> 
     * @return ResetThroughRecordId <p>重置前的最后一条记录的recordId</p>
     */
    public String getResetThroughRecordId() {
        return this.ResetThroughRecordId;
    }

    /**
     * Set <p>重置前的最后一条记录的recordId</p>
     * @param ResetThroughRecordId <p>重置前的最后一条记录的recordId</p>
     */
    public void setResetThroughRecordId(String ResetThroughRecordId) {
        this.ResetThroughRecordId = ResetThroughRecordId;
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

    public ResetConversationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetConversationResponse(ResetConversationResponse source) {
        if (source.ResetTime != null) {
            this.ResetTime = new String(source.ResetTime);
        }
        if (source.ResetThroughRecordId != null) {
            this.ResetThroughRecordId = new String(source.ResetThroughRecordId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResetTime", this.ResetTime);
        this.setParamSimple(map, prefix + "ResetThroughRecordId", this.ResetThroughRecordId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

