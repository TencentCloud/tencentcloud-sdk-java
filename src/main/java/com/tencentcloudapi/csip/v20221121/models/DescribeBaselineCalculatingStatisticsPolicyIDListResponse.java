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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineCalculatingStatisticsPolicyIDListResponse extends AbstractModel {

    /**
    * <p>当前统计计算中的系统父分类 ID 列表。</p>
    */
    @SerializedName("SystemCategoryIDList")
    @Expose
    private Long [] SystemCategoryIDList;

    /**
    * <p>当前统计计算中的自定义策略 ID 列表。</p>
    */
    @SerializedName("SelfDefinedPolicyIDList")
    @Expose
    private Long [] SelfDefinedPolicyIDList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>当前统计计算中的系统父分类 ID 列表。</p> 
     * @return SystemCategoryIDList <p>当前统计计算中的系统父分类 ID 列表。</p>
     */
    public Long [] getSystemCategoryIDList() {
        return this.SystemCategoryIDList;
    }

    /**
     * Set <p>当前统计计算中的系统父分类 ID 列表。</p>
     * @param SystemCategoryIDList <p>当前统计计算中的系统父分类 ID 列表。</p>
     */
    public void setSystemCategoryIDList(Long [] SystemCategoryIDList) {
        this.SystemCategoryIDList = SystemCategoryIDList;
    }

    /**
     * Get <p>当前统计计算中的自定义策略 ID 列表。</p> 
     * @return SelfDefinedPolicyIDList <p>当前统计计算中的自定义策略 ID 列表。</p>
     */
    public Long [] getSelfDefinedPolicyIDList() {
        return this.SelfDefinedPolicyIDList;
    }

    /**
     * Set <p>当前统计计算中的自定义策略 ID 列表。</p>
     * @param SelfDefinedPolicyIDList <p>当前统计计算中的自定义策略 ID 列表。</p>
     */
    public void setSelfDefinedPolicyIDList(Long [] SelfDefinedPolicyIDList) {
        this.SelfDefinedPolicyIDList = SelfDefinedPolicyIDList;
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

    public DescribeBaselineCalculatingStatisticsPolicyIDListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineCalculatingStatisticsPolicyIDListResponse(DescribeBaselineCalculatingStatisticsPolicyIDListResponse source) {
        if (source.SystemCategoryIDList != null) {
            this.SystemCategoryIDList = new Long[source.SystemCategoryIDList.length];
            for (int i = 0; i < source.SystemCategoryIDList.length; i++) {
                this.SystemCategoryIDList[i] = new Long(source.SystemCategoryIDList[i]);
            }
        }
        if (source.SelfDefinedPolicyIDList != null) {
            this.SelfDefinedPolicyIDList = new Long[source.SelfDefinedPolicyIDList.length];
            for (int i = 0; i < source.SelfDefinedPolicyIDList.length; i++) {
                this.SelfDefinedPolicyIDList[i] = new Long(source.SelfDefinedPolicyIDList[i]);
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
        this.setParamArraySimple(map, prefix + "SystemCategoryIDList.", this.SystemCategoryIDList);
        this.setParamArraySimple(map, prefix + "SelfDefinedPolicyIDList.", this.SelfDefinedPolicyIDList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

