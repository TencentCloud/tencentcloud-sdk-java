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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGatewayLoadBalancerResponse extends AbstractModel {

    /**
    * <p>由网关负载均衡实例唯一 ID 组成的数组。<br>存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过<a href="https://cloud.tencent.com/document/api/1782/111700">DescribeTaskStatus</a>接口查询创建的资源ID。</p>
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * <p>订单号。</p>
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>由网关负载均衡实例唯一 ID 组成的数组。<br>存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过<a href="https://cloud.tencent.com/document/api/1782/111700">DescribeTaskStatus</a>接口查询创建的资源ID。</p> 
     * @return LoadBalancerIds <p>由网关负载均衡实例唯一 ID 组成的数组。<br>存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过<a href="https://cloud.tencent.com/document/api/1782/111700">DescribeTaskStatus</a>接口查询创建的资源ID。</p>
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set <p>由网关负载均衡实例唯一 ID 组成的数组。<br>存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过<a href="https://cloud.tencent.com/document/api/1782/111700">DescribeTaskStatus</a>接口查询创建的资源ID。</p>
     * @param LoadBalancerIds <p>由网关负载均衡实例唯一 ID 组成的数组。<br>存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过<a href="https://cloud.tencent.com/document/api/1782/111700">DescribeTaskStatus</a>接口查询创建的资源ID。</p>
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get <p>订单号。</p> 
     * @return DealName <p>订单号。</p>
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set <p>订单号。</p>
     * @param DealName <p>订单号。</p>
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
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

    public CreateGatewayLoadBalancerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGatewayLoadBalancerResponse(CreateGatewayLoadBalancerResponse source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

