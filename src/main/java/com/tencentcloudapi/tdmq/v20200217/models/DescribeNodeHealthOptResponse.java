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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNodeHealthOptResponse extends AbstractModel{

    /**
    * 0-异常；1-正常
    */
    @SerializedName("NodeState")
    @Expose
    private Long NodeState;

    /**
    * 最近一次健康检查的时间
    */
    @SerializedName("LatestHealthCheckTime")
    @Expose
    private String LatestHealthCheckTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0-异常；1-正常 
     * @return NodeState 0-异常；1-正常
     */
    public Long getNodeState() {
        return this.NodeState;
    }

    /**
     * Set 0-异常；1-正常
     * @param NodeState 0-异常；1-正常
     */
    public void setNodeState(Long NodeState) {
        this.NodeState = NodeState;
    }

    /**
     * Get 最近一次健康检查的时间 
     * @return LatestHealthCheckTime 最近一次健康检查的时间
     */
    public String getLatestHealthCheckTime() {
        return this.LatestHealthCheckTime;
    }

    /**
     * Set 最近一次健康检查的时间
     * @param LatestHealthCheckTime 最近一次健康检查的时间
     */
    public void setLatestHealthCheckTime(String LatestHealthCheckTime) {
        this.LatestHealthCheckTime = LatestHealthCheckTime;
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

    public DescribeNodeHealthOptResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeHealthOptResponse(DescribeNodeHealthOptResponse source) {
        if (source.NodeState != null) {
            this.NodeState = new Long(source.NodeState);
        }
        if (source.LatestHealthCheckTime != null) {
            this.LatestHealthCheckTime = new String(source.LatestHealthCheckTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeState", this.NodeState);
        this.setParamSimple(map, prefix + "LatestHealthCheckTime", this.LatestHealthCheckTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

