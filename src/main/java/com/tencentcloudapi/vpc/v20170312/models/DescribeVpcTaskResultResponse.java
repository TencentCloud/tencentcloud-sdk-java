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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcTaskResultResponse extends AbstractModel {

    /**
    * 异步任务执行结果。结果：SUCCESS、FAILED、RUNNING。3者其中之一。其中SUCCESS表示任务执行成功，FAILED表示任务执行失败，RUNNING表示任务执行中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 异步任务执行输出。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 异步任务详细结果。只用于特殊场景，如批量删除弹性网卡时查询成功的网卡列表和失败的列表。
    */
    @SerializedName("Result")
    @Expose
    private VpcTaskResultDetailInfo [] Result;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 异步任务执行结果。结果：SUCCESS、FAILED、RUNNING。3者其中之一。其中SUCCESS表示任务执行成功，FAILED表示任务执行失败，RUNNING表示任务执行中。 
     * @return Status 异步任务执行结果。结果：SUCCESS、FAILED、RUNNING。3者其中之一。其中SUCCESS表示任务执行成功，FAILED表示任务执行失败，RUNNING表示任务执行中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 异步任务执行结果。结果：SUCCESS、FAILED、RUNNING。3者其中之一。其中SUCCESS表示任务执行成功，FAILED表示任务执行失败，RUNNING表示任务执行中。
     * @param Status 异步任务执行结果。结果：SUCCESS、FAILED、RUNNING。3者其中之一。其中SUCCESS表示任务执行成功，FAILED表示任务执行失败，RUNNING表示任务执行中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 异步任务执行输出。 
     * @return Output 异步任务执行输出。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 异步任务执行输出。
     * @param Output 异步任务执行输出。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 异步任务详细结果。只用于特殊场景，如批量删除弹性网卡时查询成功的网卡列表和失败的列表。 
     * @return Result 异步任务详细结果。只用于特殊场景，如批量删除弹性网卡时查询成功的网卡列表和失败的列表。
     */
    public VpcTaskResultDetailInfo [] getResult() {
        return this.Result;
    }

    /**
     * Set 异步任务详细结果。只用于特殊场景，如批量删除弹性网卡时查询成功的网卡列表和失败的列表。
     * @param Result 异步任务详细结果。只用于特殊场景，如批量删除弹性网卡时查询成功的网卡列表和失败的列表。
     */
    public void setResult(VpcTaskResultDetailInfo [] Result) {
        this.Result = Result;
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

    public DescribeVpcTaskResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcTaskResultResponse(DescribeVpcTaskResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.Result != null) {
            this.Result = new VpcTaskResultDetailInfo[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new VpcTaskResultDetailInfo(source.Result[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

