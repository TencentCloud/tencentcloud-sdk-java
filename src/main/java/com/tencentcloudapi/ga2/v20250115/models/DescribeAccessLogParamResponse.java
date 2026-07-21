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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessLogParamResponse extends AbstractModel {

    /**
    * <p>七层可选参数</p>
    */
    @SerializedName("L7Param")
    @Expose
    private String [] L7Param;

    /**
    * <p>四层可选参数</p>
    */
    @SerializedName("L4Param")
    @Expose
    private String [] L4Param;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>七层可选参数</p> 
     * @return L7Param <p>七层可选参数</p>
     */
    public String [] getL7Param() {
        return this.L7Param;
    }

    /**
     * Set <p>七层可选参数</p>
     * @param L7Param <p>七层可选参数</p>
     */
    public void setL7Param(String [] L7Param) {
        this.L7Param = L7Param;
    }

    /**
     * Get <p>四层可选参数</p> 
     * @return L4Param <p>四层可选参数</p>
     */
    public String [] getL4Param() {
        return this.L4Param;
    }

    /**
     * Set <p>四层可选参数</p>
     * @param L4Param <p>四层可选参数</p>
     */
    public void setL4Param(String [] L4Param) {
        this.L4Param = L4Param;
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

    public DescribeAccessLogParamResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessLogParamResponse(DescribeAccessLogParamResponse source) {
        if (source.L7Param != null) {
            this.L7Param = new String[source.L7Param.length];
            for (int i = 0; i < source.L7Param.length; i++) {
                this.L7Param[i] = new String(source.L7Param[i]);
            }
        }
        if (source.L4Param != null) {
            this.L4Param = new String[source.L4Param.length];
            for (int i = 0; i < source.L4Param.length; i++) {
                this.L4Param[i] = new String(source.L4Param[i]);
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
        this.setParamArraySimple(map, prefix + "L7Param.", this.L7Param);
        this.setParamArraySimple(map, prefix + "L4Param.", this.L4Param);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

