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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageResponse extends AbstractModel {

    /**
    * 检索出相关使用详情总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 查询 key，作为翻页查询入参
    */
    @SerializedName("QueryKey")
    @Expose
    private String QueryKey;

    /**
    * 使用时长详情
    */
    @SerializedName("UsageSet")
    @Expose
    private Usage [] UsageSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检索出相关使用详情总数 
     * @return Total 检索出相关使用详情总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 检索出相关使用详情总数
     * @param Total 检索出相关使用详情总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 查询 key，作为翻页查询入参 
     * @return QueryKey 查询 key，作为翻页查询入参
     */
    public String getQueryKey() {
        return this.QueryKey;
    }

    /**
     * Set 查询 key，作为翻页查询入参
     * @param QueryKey 查询 key，作为翻页查询入参
     */
    public void setQueryKey(String QueryKey) {
        this.QueryKey = QueryKey;
    }

    /**
     * Get 使用时长详情 
     * @return UsageSet 使用时长详情
     */
    public Usage [] getUsageSet() {
        return this.UsageSet;
    }

    /**
     * Set 使用时长详情
     * @param UsageSet 使用时长详情
     */
    public void setUsageSet(Usage [] UsageSet) {
        this.UsageSet = UsageSet;
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

    public DescribeUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageResponse(DescribeUsageResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.QueryKey != null) {
            this.QueryKey = new String(source.QueryKey);
        }
        if (source.UsageSet != null) {
            this.UsageSet = new Usage[source.UsageSet.length];
            for (int i = 0; i < source.UsageSet.length; i++) {
                this.UsageSet[i] = new Usage(source.UsageSet[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "QueryKey", this.QueryKey);
        this.setParamArrayObj(map, prefix + "UsageSet.", this.UsageSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

