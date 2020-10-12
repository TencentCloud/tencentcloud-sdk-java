/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcex.v20200727.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvocationResultResponse extends AbstractModel{

    /**
    * 服务的调用结果
    */
    @SerializedName("Results")
    @Expose
    private AlgorithmResult [] Results;

    /**
    * 0:获取结果失败
1：结果还没有生成，继续轮询
2：获取结果成功
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务的调用结果 
     * @return Results 服务的调用结果
     */
    public AlgorithmResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 服务的调用结果
     * @param Results 服务的调用结果
     */
    public void setResults(AlgorithmResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 0:获取结果失败
1：结果还没有生成，继续轮询
2：获取结果成功 
     * @return Status 0:获取结果失败
1：结果还没有生成，继续轮询
2：获取结果成功
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0:获取结果失败
1：结果还没有生成，继续轮询
2：获取结果成功
     * @param Status 0:获取结果失败
1：结果还没有生成，继续轮询
2：获取结果成功
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

