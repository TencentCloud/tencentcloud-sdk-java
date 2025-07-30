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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLifecyclePoliciesResponse extends AbstractModel {

    /**
    * 列表的分页页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每个分页包含的生命周期管理策略个数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 生命周期管理策略总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 生命周期管理策略列表
    */
    @SerializedName("LifecyclePolicies")
    @Expose
    private LifecyclePolicy [] LifecyclePolicies;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 列表的分页页码 
     * @return PageNumber 列表的分页页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 列表的分页页码
     * @param PageNumber 列表的分页页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每个分页包含的生命周期管理策略个数 
     * @return PageSize 每个分页包含的生命周期管理策略个数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每个分页包含的生命周期管理策略个数
     * @param PageSize 每个分页包含的生命周期管理策略个数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 生命周期管理策略总数 
     * @return TotalCount 生命周期管理策略总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 生命周期管理策略总数
     * @param TotalCount 生命周期管理策略总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 生命周期管理策略列表 
     * @return LifecyclePolicies 生命周期管理策略列表
     */
    public LifecyclePolicy [] getLifecyclePolicies() {
        return this.LifecyclePolicies;
    }

    /**
     * Set 生命周期管理策略列表
     * @param LifecyclePolicies 生命周期管理策略列表
     */
    public void setLifecyclePolicies(LifecyclePolicy [] LifecyclePolicies) {
        this.LifecyclePolicies = LifecyclePolicies;
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

    public DescribeLifecyclePoliciesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLifecyclePoliciesResponse(DescribeLifecyclePoliciesResponse source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.LifecyclePolicies != null) {
            this.LifecyclePolicies = new LifecyclePolicy[source.LifecyclePolicies.length];
            for (int i = 0; i < source.LifecyclePolicies.length; i++) {
                this.LifecyclePolicies[i] = new LifecyclePolicy(source.LifecyclePolicies[i]);
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "LifecyclePolicies.", this.LifecyclePolicies);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

