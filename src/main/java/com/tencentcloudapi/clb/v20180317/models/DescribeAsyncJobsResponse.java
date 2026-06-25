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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncJobsResponse extends AbstractModel {

    /**
    * <p>异步任务列表</p>
    */
    @SerializedName("Jobs")
    @Expose
    private Job [] Jobs;

    /**
    * <p>分页游标</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <p>本次查询最大数量</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>本次查询总数</p>
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
     * Get <p>异步任务列表</p> 
     * @return Jobs <p>异步任务列表</p>
     */
    public Job [] getJobs() {
        return this.Jobs;
    }

    /**
     * Set <p>异步任务列表</p>
     * @param Jobs <p>异步任务列表</p>
     */
    public void setJobs(Job [] Jobs) {
        this.Jobs = Jobs;
    }

    /**
     * Get <p>分页游标</p> 
     * @return NextToken <p>分页游标</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>分页游标</p>
     * @param NextToken <p>分页游标</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <p>本次查询最大数量</p> 
     * @return MaxResults <p>本次查询最大数量</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>本次查询最大数量</p>
     * @param MaxResults <p>本次查询最大数量</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>本次查询总数</p> 
     * @return TotalCount <p>本次查询总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>本次查询总数</p>
     * @param TotalCount <p>本次查询总数</p>
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

    public DescribeAsyncJobsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncJobsResponse(DescribeAsyncJobsResponse source) {
        if (source.Jobs != null) {
            this.Jobs = new Job[source.Jobs.length];
            for (int i = 0; i < source.Jobs.length; i++) {
                this.Jobs[i] = new Job(source.Jobs[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
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
        this.setParamArrayObj(map, prefix + "Jobs.", this.Jobs);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

