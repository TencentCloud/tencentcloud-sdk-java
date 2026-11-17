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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGPUResourceGroupsResponse extends AbstractModel {

    /**
    * 匹配的资源组列表；无匹配时为 []。
    */
    @SerializedName("ResourceGroups")
    @Expose
    private GPUResourceGroup [] ResourceGroups;

    /**
    * 匹配的资源组总数，分页前计算。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 匹配的资源组列表；无匹配时为 []。 
     * @return ResourceGroups 匹配的资源组列表；无匹配时为 []。
     */
    public GPUResourceGroup [] getResourceGroups() {
        return this.ResourceGroups;
    }

    /**
     * Set 匹配的资源组列表；无匹配时为 []。
     * @param ResourceGroups 匹配的资源组列表；无匹配时为 []。
     */
    public void setResourceGroups(GPUResourceGroup [] ResourceGroups) {
        this.ResourceGroups = ResourceGroups;
    }

    /**
     * Get 匹配的资源组总数，分页前计算。 
     * @return TotalCount 匹配的资源组总数，分页前计算。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 匹配的资源组总数，分页前计算。
     * @param TotalCount 匹配的资源组总数，分页前计算。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeGPUResourceGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGPUResourceGroupsResponse(DescribeGPUResourceGroupsResponse source) {
        if (source.ResourceGroups != null) {
            this.ResourceGroups = new GPUResourceGroup[source.ResourceGroups.length];
            for (int i = 0; i < source.ResourceGroups.length; i++) {
                this.ResourceGroups[i] = new GPUResourceGroup(source.ResourceGroups[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResourceGroups.", this.ResourceGroups);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

