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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHTTPServiceCachePurgeTaskResponse extends AbstractModel {

    /**
    * <p>任务列表</p>
    */
    @SerializedName("Tasks")
    @Expose
    private HTTPServiceCachePurgeTask [] Tasks;

    /**
    * <p>域名总数，分页查询使用总数判断是否已经拉取到所有数据</p>
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
     * Get <p>任务列表</p> 
     * @return Tasks <p>任务列表</p>
     */
    public HTTPServiceCachePurgeTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务列表</p>
     * @param Tasks <p>任务列表</p>
     */
    public void setTasks(HTTPServiceCachePurgeTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>域名总数，分页查询使用总数判断是否已经拉取到所有数据</p> 
     * @return TotalCount <p>域名总数，分页查询使用总数判断是否已经拉取到所有数据</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>域名总数，分页查询使用总数判断是否已经拉取到所有数据</p>
     * @param TotalCount <p>域名总数，分页查询使用总数判断是否已经拉取到所有数据</p>
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

    public DescribeHTTPServiceCachePurgeTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHTTPServiceCachePurgeTaskResponse(DescribeHTTPServiceCachePurgeTaskResponse source) {
        if (source.Tasks != null) {
            this.Tasks = new HTTPServiceCachePurgeTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new HTTPServiceCachePurgeTask(source.Tasks[i]);
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
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

