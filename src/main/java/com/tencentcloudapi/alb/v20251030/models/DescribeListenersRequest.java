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

public class DescribeListenersRequest extends AbstractModel {

    /**
    * 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 过滤条件列表，最大支持20个。支持以下几个字段
- **Protocol**: 协议类型
- **Tags**: 标签
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 监听器 ID 列表，ID 格式为 lst- 后接 8 位字母数字。
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * 本次读取的最大数据记录数量。
取值: 1~100。
默认值: 20
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 下一次查询的令牌（Token）。为空时查询第一页。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。 
     * @return LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     * @param LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 过滤条件列表，最大支持20个。支持以下几个字段
- **Protocol**: 协议类型
- **Tags**: 标签 
     * @return Filters 过滤条件列表，最大支持20个。支持以下几个字段
- **Protocol**: 协议类型
- **Tags**: 标签
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件列表，最大支持20个。支持以下几个字段
- **Protocol**: 协议类型
- **Tags**: 标签
     * @param Filters 过滤条件列表，最大支持20个。支持以下几个字段
- **Protocol**: 协议类型
- **Tags**: 标签
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 监听器 ID 列表，ID 格式为 lst- 后接 8 位字母数字。 
     * @return ListenerIds 监听器 ID 列表，ID 格式为 lst- 后接 8 位字母数字。
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set 监听器 ID 列表，ID 格式为 lst- 后接 8 位字母数字。
     * @param ListenerIds 监听器 ID 列表，ID 格式为 lst- 后接 8 位字母数字。
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get 本次读取的最大数据记录数量。
取值: 1~100。
默认值: 20 
     * @return MaxResults 本次读取的最大数据记录数量。
取值: 1~100。
默认值: 20
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 本次读取的最大数据记录数量。
取值: 1~100。
默认值: 20
     * @param MaxResults 本次读取的最大数据记录数量。
取值: 1~100。
默认值: 20
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 下一次查询的令牌（Token）。为空时查询第一页。 
     * @return NextToken 下一次查询的令牌（Token）。为空时查询第一页。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一次查询的令牌（Token）。为空时查询第一页。
     * @param NextToken 下一次查询的令牌（Token）。为空时查询第一页。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenersRequest(DescribeListenersRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

