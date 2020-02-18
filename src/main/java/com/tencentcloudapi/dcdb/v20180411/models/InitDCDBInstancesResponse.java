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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDCDBInstancesResponse extends AbstractModel{

    /**
    * 异步任务ID，可通过 DescribeFlow 查询任务状态。
    */
    @SerializedName("FlowIds")
    @Expose
    private Long [] FlowIds;

    /**
    * 透传入参。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 异步任务ID，可通过 DescribeFlow 查询任务状态。 
     * @return FlowIds 异步任务ID，可通过 DescribeFlow 查询任务状态。
     */
    public Long [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 异步任务ID，可通过 DescribeFlow 查询任务状态。
     * @param FlowIds 异步任务ID，可通过 DescribeFlow 查询任务状态。
     */
    public void setFlowIds(Long [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 透传入参。 
     * @return InstanceIds 透传入参。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 透传入参。
     * @param InstanceIds 透传入参。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
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
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

