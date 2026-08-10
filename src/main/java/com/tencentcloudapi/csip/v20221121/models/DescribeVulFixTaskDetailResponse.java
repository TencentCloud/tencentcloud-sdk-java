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

public class DescribeVulFixTaskDetailResponse extends AbstractModel {

    /**
    * <p>任务明细列表</p>
    */
    @SerializedName("Data")
    @Expose
    private VulFixTaskDetailItem [] Data;

    /**
    * <p>总数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>任务概要信息</p>
    */
    @SerializedName("TaskInfo")
    @Expose
    private VulFixTaskInfo TaskInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务明细列表</p> 
     * @return Data <p>任务明细列表</p>
     */
    public VulFixTaskDetailItem [] getData() {
        return this.Data;
    }

    /**
     * Set <p>任务明细列表</p>
     * @param Data <p>任务明细列表</p>
     */
    public void setData(VulFixTaskDetailItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>总数量</p> 
     * @return TotalCount <p>总数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数量</p>
     * @param TotalCount <p>总数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>任务概要信息</p> 
     * @return TaskInfo <p>任务概要信息</p>
     */
    public VulFixTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set <p>任务概要信息</p>
     * @param TaskInfo <p>任务概要信息</p>
     */
    public void setTaskInfo(VulFixTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
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

    public DescribeVulFixTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixTaskDetailResponse(DescribeVulFixTaskDetailResponse source) {
        if (source.Data != null) {
            this.Data = new VulFixTaskDetailItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new VulFixTaskDetailItem(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new VulFixTaskInfo(source.TaskInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

