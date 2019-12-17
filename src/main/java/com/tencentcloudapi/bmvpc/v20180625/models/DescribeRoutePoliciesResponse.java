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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoutePoliciesResponse extends AbstractModel{

    /**
    * 路由策略数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 路由策略列表
    */
    @SerializedName("RoutePolicySet")
    @Expose
    private RoutePolicy [] RoutePolicySet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 路由策略数 
     * @return TotalCount 路由策略数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 路由策略数
     * @param TotalCount 路由策略数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 路由策略列表 
     * @return RoutePolicySet 路由策略列表
     */
    public RoutePolicy [] getRoutePolicySet() {
        return this.RoutePolicySet;
    }

    /**
     * Set 路由策略列表
     * @param RoutePolicySet 路由策略列表
     */
    public void setRoutePolicySet(RoutePolicy [] RoutePolicySet) {
        this.RoutePolicySet = RoutePolicySet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RoutePolicySet.", this.RoutePolicySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

