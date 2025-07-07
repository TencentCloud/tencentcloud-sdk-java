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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTraceCodeByIdResponse extends AbstractModel {

    /**
    * 无
    */
    @SerializedName("TraceCode")
    @Expose
    private TraceCode TraceCode;

    /**
    * 码路径，如level是2，则为 [1级, 2级]
    */
    @SerializedName("CodePath")
    @Expose
    private String [] CodePath;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 无 
     * @return TraceCode 无
     */
    public TraceCode getTraceCode() {
        return this.TraceCode;
    }

    /**
     * Set 无
     * @param TraceCode 无
     */
    public void setTraceCode(TraceCode TraceCode) {
        this.TraceCode = TraceCode;
    }

    /**
     * Get 码路径，如level是2，则为 [1级, 2级] 
     * @return CodePath 码路径，如level是2，则为 [1级, 2级]
     */
    public String [] getCodePath() {
        return this.CodePath;
    }

    /**
     * Set 码路径，如level是2，则为 [1级, 2级]
     * @param CodePath 码路径，如level是2，则为 [1级, 2级]
     */
    public void setCodePath(String [] CodePath) {
        this.CodePath = CodePath;
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

    public DescribeTraceCodeByIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTraceCodeByIdResponse(DescribeTraceCodeByIdResponse source) {
        if (source.TraceCode != null) {
            this.TraceCode = new TraceCode(source.TraceCode);
        }
        if (source.CodePath != null) {
            this.CodePath = new String[source.CodePath.length];
            for (int i = 0; i < source.CodePath.length; i++) {
                this.CodePath[i] = new String(source.CodePath[i]);
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
        this.setParamObj(map, prefix + "TraceCode.", this.TraceCode);
        this.setParamArraySimple(map, prefix + "CodePath.", this.CodePath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

