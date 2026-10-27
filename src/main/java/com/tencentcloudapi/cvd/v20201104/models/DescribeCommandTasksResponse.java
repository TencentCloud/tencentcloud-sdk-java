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

public class DescribeCommandTasksResponse extends AbstractModel {

    /**
    * <p>拉取任务详情数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>任务描述</p>
    */
    @SerializedName("CommandDetails")
    @Expose
    private CommandDetail [] CommandDetails;

    /**
    * <p>任务状态，RUNNING -执行中；FINISHED-执行完成； STOPPED-终止任务</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>拉取任务详情数</p> 
     * @return Total <p>拉取任务详情数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>拉取任务详情数</p>
     * @param Total <p>拉取任务详情数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>任务描述</p> 
     * @return CommandDetails <p>任务描述</p>
     */
    public CommandDetail [] getCommandDetails() {
        return this.CommandDetails;
    }

    /**
     * Set <p>任务描述</p>
     * @param CommandDetails <p>任务描述</p>
     */
    public void setCommandDetails(CommandDetail [] CommandDetails) {
        this.CommandDetails = CommandDetails;
    }

    /**
     * Get <p>任务状态，RUNNING -执行中；FINISHED-执行完成； STOPPED-终止任务</p> 
     * @return Status <p>任务状态，RUNNING -执行中；FINISHED-执行完成； STOPPED-终止任务</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，RUNNING -执行中；FINISHED-执行完成； STOPPED-终止任务</p>
     * @param Status <p>任务状态，RUNNING -执行中；FINISHED-执行完成； STOPPED-终止任务</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public DescribeCommandTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCommandTasksResponse(DescribeCommandTasksResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CommandDetails != null) {
            this.CommandDetails = new CommandDetail[source.CommandDetails.length];
            for (int i = 0; i < source.CommandDetails.length; i++) {
                this.CommandDetails[i] = new CommandDetail(source.CommandDetails[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamArrayObj(map, prefix + "CommandDetails.", this.CommandDetails);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

