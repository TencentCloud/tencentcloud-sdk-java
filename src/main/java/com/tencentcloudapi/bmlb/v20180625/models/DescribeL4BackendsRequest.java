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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL4BackendsRequest extends AbstractModel {

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡四层监听器ID，可通过接口DescribeL4Listeners查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 待查询的主机信息。
    */
    @SerializedName("BackendSet")
    @Expose
    private DescribeL4Backend [] BackendSet;

    /**
     * Get 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。 
     * @return LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @param LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡四层监听器ID，可通过接口DescribeL4Listeners查询。 
     * @return ListenerId 负载均衡四层监听器ID，可通过接口DescribeL4Listeners查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡四层监听器ID，可通过接口DescribeL4Listeners查询。
     * @param ListenerId 负载均衡四层监听器ID，可通过接口DescribeL4Listeners查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 待查询的主机信息。 
     * @return BackendSet 待查询的主机信息。
     */
    public DescribeL4Backend [] getBackendSet() {
        return this.BackendSet;
    }

    /**
     * Set 待查询的主机信息。
     * @param BackendSet 待查询的主机信息。
     */
    public void setBackendSet(DescribeL4Backend [] BackendSet) {
        this.BackendSet = BackendSet;
    }

    public DescribeL4BackendsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL4BackendsRequest(DescribeL4BackendsRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.BackendSet != null) {
            this.BackendSet = new DescribeL4Backend[source.BackendSet.length];
            for (int i = 0; i < source.BackendSet.length; i++) {
                this.BackendSet[i] = new DescribeL4Backend(source.BackendSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "BackendSet.", this.BackendSet);

    }
}

