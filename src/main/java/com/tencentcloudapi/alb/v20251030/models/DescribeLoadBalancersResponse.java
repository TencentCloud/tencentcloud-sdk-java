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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersResponse extends AbstractModel {

    /**
    * <p>应用型负载均衡实例列表。</p>
    */
    @SerializedName("LoadBalancers")
    @Expose
    private LoadBalancer [] LoadBalancers;

    /**
    * <p>分批次查询时每次显示的条目数。</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>如果<strong>NextToken</strong>为空表示没有下一次查询。</li><li>如果<strong>NextToken</strong>有返回值，该取值表示下一次查询开始的令牌。</li></ul>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <p>列表条目数。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>应用型负载均衡实例列表。</p> 
     * @return LoadBalancers <p>应用型负载均衡实例列表。</p>
     */
    public LoadBalancer [] getLoadBalancers() {
        return this.LoadBalancers;
    }

    /**
     * Set <p>应用型负载均衡实例列表。</p>
     * @param LoadBalancers <p>应用型负载均衡实例列表。</p>
     */
    public void setLoadBalancers(LoadBalancer [] LoadBalancers) {
        this.LoadBalancers = LoadBalancers;
    }

    /**
     * Get <p>分批次查询时每次显示的条目数。</p> 
     * @return MaxResults <p>分批次查询时每次显示的条目数。</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>分批次查询时每次显示的条目数。</p>
     * @param MaxResults <p>分批次查询时每次显示的条目数。</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>如果<strong>NextToken</strong>为空表示没有下一次查询。</li><li>如果<strong>NextToken</strong>有返回值，该取值表示下一次查询开始的令牌。</li></ul> 
     * @return NextToken <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>如果<strong>NextToken</strong>为空表示没有下一次查询。</li><li>如果<strong>NextToken</strong>有返回值，该取值表示下一次查询开始的令牌。</li></ul>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>如果<strong>NextToken</strong>为空表示没有下一次查询。</li><li>如果<strong>NextToken</strong>有返回值，该取值表示下一次查询开始的令牌。</li></ul>
     * @param NextToken <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>如果<strong>NextToken</strong>为空表示没有下一次查询。</li><li>如果<strong>NextToken</strong>有返回值，该取值表示下一次查询开始的令牌。</li></ul>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <p>列表条目数。</p> 
     * @return TotalCount <p>列表条目数。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>列表条目数。</p>
     * @param TotalCount <p>列表条目数。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeLoadBalancersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersResponse(DescribeLoadBalancersResponse source) {
        if (source.LoadBalancers != null) {
            this.LoadBalancers = new LoadBalancer[source.LoadBalancers.length];
            for (int i = 0; i < source.LoadBalancers.length; i++) {
                this.LoadBalancers[i] = new LoadBalancer(source.LoadBalancers[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LoadBalancers.", this.LoadBalancers);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

