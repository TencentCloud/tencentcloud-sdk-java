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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisClusterOverviewResponse extends AbstractModel {

    /**
    * 资源包总数
    */
    @SerializedName("TotalBundle")
    @Expose
    private Long TotalBundle;

    /**
    * 资源包总内存大小，单位：GB
    */
    @SerializedName("TotalMemory")
    @Expose
    private Long TotalMemory;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源包总数 
     * @return TotalBundle 资源包总数
     */
    public Long getTotalBundle() {
        return this.TotalBundle;
    }

    /**
     * Set 资源包总数
     * @param TotalBundle 资源包总数
     */
    public void setTotalBundle(Long TotalBundle) {
        this.TotalBundle = TotalBundle;
    }

    /**
     * Get 资源包总内存大小，单位：GB 
     * @return TotalMemory 资源包总内存大小，单位：GB
     */
    public Long getTotalMemory() {
        return this.TotalMemory;
    }

    /**
     * Set 资源包总内存大小，单位：GB
     * @param TotalMemory 资源包总内存大小，单位：GB
     */
    public void setTotalMemory(Long TotalMemory) {
        this.TotalMemory = TotalMemory;
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

    public DescribeRedisClusterOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisClusterOverviewResponse(DescribeRedisClusterOverviewResponse source) {
        if (source.TotalBundle != null) {
            this.TotalBundle = new Long(source.TotalBundle);
        }
        if (source.TotalMemory != null) {
            this.TotalMemory = new Long(source.TotalMemory);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalBundle", this.TotalBundle);
        this.setParamSimple(map, prefix + "TotalMemory", this.TotalMemory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

