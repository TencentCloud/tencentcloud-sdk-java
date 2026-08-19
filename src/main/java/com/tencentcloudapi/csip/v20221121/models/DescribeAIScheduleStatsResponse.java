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

public class DescribeAIScheduleStatsResponse extends AbstractModel {

    /**
    * <p>定时任务总数。</p>
    */
    @SerializedName("ScheduleCount")
    @Expose
    private Long ScheduleCount;

    /**
    * <p>当前运行中的任务数量。</p>
    */
    @SerializedName("RunningTaskCount")
    @Expose
    private Long RunningTaskCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>定时任务总数。</p> 
     * @return ScheduleCount <p>定时任务总数。</p>
     */
    public Long getScheduleCount() {
        return this.ScheduleCount;
    }

    /**
     * Set <p>定时任务总数。</p>
     * @param ScheduleCount <p>定时任务总数。</p>
     */
    public void setScheduleCount(Long ScheduleCount) {
        this.ScheduleCount = ScheduleCount;
    }

    /**
     * Get <p>当前运行中的任务数量。</p> 
     * @return RunningTaskCount <p>当前运行中的任务数量。</p>
     */
    public Long getRunningTaskCount() {
        return this.RunningTaskCount;
    }

    /**
     * Set <p>当前运行中的任务数量。</p>
     * @param RunningTaskCount <p>当前运行中的任务数量。</p>
     */
    public void setRunningTaskCount(Long RunningTaskCount) {
        this.RunningTaskCount = RunningTaskCount;
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

    public DescribeAIScheduleStatsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIScheduleStatsResponse(DescribeAIScheduleStatsResponse source) {
        if (source.ScheduleCount != null) {
            this.ScheduleCount = new Long(source.ScheduleCount);
        }
        if (source.RunningTaskCount != null) {
            this.RunningTaskCount = new Long(source.RunningTaskCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleCount", this.ScheduleCount);
        this.setParamSimple(map, prefix + "RunningTaskCount", this.RunningTaskCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

