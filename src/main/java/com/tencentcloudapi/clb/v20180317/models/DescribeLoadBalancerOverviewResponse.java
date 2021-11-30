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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancerOverviewResponse extends AbstractModel{

    /**
    * 负载均衡总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 运行中的负载均衡数目
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * 隔离中的负载均衡数目
    */
    @SerializedName("IsolationCount")
    @Expose
    private Long IsolationCount;

    /**
    * 即将到期的负载均衡数目
    */
    @SerializedName("WillExpireCount")
    @Expose
    private Long WillExpireCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 负载均衡总数 
     * @return TotalCount 负载均衡总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 负载均衡总数
     * @param TotalCount 负载均衡总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 运行中的负载均衡数目 
     * @return RunningCount 运行中的负载均衡数目
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set 运行中的负载均衡数目
     * @param RunningCount 运行中的负载均衡数目
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get 隔离中的负载均衡数目 
     * @return IsolationCount 隔离中的负载均衡数目
     */
    public Long getIsolationCount() {
        return this.IsolationCount;
    }

    /**
     * Set 隔离中的负载均衡数目
     * @param IsolationCount 隔离中的负载均衡数目
     */
    public void setIsolationCount(Long IsolationCount) {
        this.IsolationCount = IsolationCount;
    }

    /**
     * Get 即将到期的负载均衡数目 
     * @return WillExpireCount 即将到期的负载均衡数目
     */
    public Long getWillExpireCount() {
        return this.WillExpireCount;
    }

    /**
     * Set 即将到期的负载均衡数目
     * @param WillExpireCount 即将到期的负载均衡数目
     */
    public void setWillExpireCount(Long WillExpireCount) {
        this.WillExpireCount = WillExpireCount;
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

    public DescribeLoadBalancerOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancerOverviewResponse(DescribeLoadBalancerOverviewResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RunningCount != null) {
            this.RunningCount = new Long(source.RunningCount);
        }
        if (source.IsolationCount != null) {
            this.IsolationCount = new Long(source.IsolationCount);
        }
        if (source.WillExpireCount != null) {
            this.WillExpireCount = new Long(source.WillExpireCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "IsolationCount", this.IsolationCount);
        this.setParamSimple(map, prefix + "WillExpireCount", this.WillExpireCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

