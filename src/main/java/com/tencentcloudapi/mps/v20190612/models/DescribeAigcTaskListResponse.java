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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcTaskListResponse extends AbstractModel {

    /**
    * <p>当前任务待返回总数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>开始查询页</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>当前页要获取数据条目数</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>任务详情数据</p>
    */
    @SerializedName("Tasks")
    @Expose
    private AigcTaskListItem [] Tasks;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>当前任务待返回总数</p> 
     * @return Total <p>当前任务待返回总数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>当前任务待返回总数</p>
     * @param Total <p>当前任务待返回总数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>开始查询页</p> 
     * @return PageNum <p>开始查询页</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>开始查询页</p>
     * @param PageNum <p>开始查询页</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>当前页要获取数据条目数</p> 
     * @return PageSize <p>当前页要获取数据条目数</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>当前页要获取数据条目数</p>
     * @param PageSize <p>当前页要获取数据条目数</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>任务详情数据</p> 
     * @return Tasks <p>任务详情数据</p>
     */
    public AigcTaskListItem [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务详情数据</p>
     * @param Tasks <p>任务详情数据</p>
     */
    public void setTasks(AigcTaskListItem [] Tasks) {
        this.Tasks = Tasks;
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

    public DescribeAigcTaskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcTaskListResponse(DescribeAigcTaskListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Tasks != null) {
            this.Tasks = new AigcTaskListItem[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new AigcTaskListItem(source.Tasks[i]);
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
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

