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

public class DescribeListenerHealthStatusRequest extends AbstractModel {

    /**
    * 监听器 ID，格式为 lst- 后接 8 位字母数字。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 是否包含转发规则的健康检查结果。为false时只返回默认转发规则的健康状态，为true时返回全部规则的健康状态(包含默认规则)。
取值：
true：是。
false（默认值）：否。
    */
    @SerializedName("IncludeRule")
    @Expose
    private Boolean IncludeRule;

    /**
    * 本次读取的最大数据记录数量。
取值: 1~100。
默认值: 20
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 下一页查询的Token值。第一次查询时，无需填写。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get 监听器 ID，格式为 lst- 后接 8 位字母数字。 
     * @return ListenerId 监听器 ID，格式为 lst- 后接 8 位字母数字。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器 ID，格式为 lst- 后接 8 位字母数字。
     * @param ListenerId 监听器 ID，格式为 lst- 后接 8 位字母数字。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

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
     * Get 是否包含转发规则的健康检查结果。为false时只返回默认转发规则的健康状态，为true时返回全部规则的健康状态(包含默认规则)。
取值：
true：是。
false（默认值）：否。 
     * @return IncludeRule 是否包含转发规则的健康检查结果。为false时只返回默认转发规则的健康状态，为true时返回全部规则的健康状态(包含默认规则)。
取值：
true：是。
false（默认值）：否。
     */
    public Boolean getIncludeRule() {
        return this.IncludeRule;
    }

    /**
     * Set 是否包含转发规则的健康检查结果。为false时只返回默认转发规则的健康状态，为true时返回全部规则的健康状态(包含默认规则)。
取值：
true：是。
false（默认值）：否。
     * @param IncludeRule 是否包含转发规则的健康检查结果。为false时只返回默认转发规则的健康状态，为true时返回全部规则的健康状态(包含默认规则)。
取值：
true：是。
false（默认值）：否。
     */
    public void setIncludeRule(Boolean IncludeRule) {
        this.IncludeRule = IncludeRule;
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
     * Get 下一页查询的Token值。第一次查询时，无需填写。 
     * @return NextToken 下一页查询的Token值。第一次查询时，无需填写。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一页查询的Token值。第一次查询时，无需填写。
     * @param NextToken 下一页查询的Token值。第一次查询时，无需填写。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeListenerHealthStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenerHealthStatusRequest(DescribeListenerHealthStatusRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.IncludeRule != null) {
            this.IncludeRule = new Boolean(source.IncludeRule);
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
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "IncludeRule", this.IncludeRule);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

