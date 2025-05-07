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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenersRequest extends AbstractModel {

    /**
    * 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685) 接口获取。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 要查询的负载均衡监听器 ID 数组，最大为100个，可以通过 [DescribeListeners](https://cloud.tencent.com/document/api/214/30686) 接口获取。
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 要查询的监听器的端口，端口范围：1-65535
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685) 接口获取。 
     * @return LoadBalancerId 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685) 接口获取。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685) 接口获取。
     * @param LoadBalancerId 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685) 接口获取。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 要查询的负载均衡监听器 ID 数组，最大为100个，可以通过 [DescribeListeners](https://cloud.tencent.com/document/api/214/30686) 接口获取。 
     * @return ListenerIds 要查询的负载均衡监听器 ID 数组，最大为100个，可以通过 [DescribeListeners](https://cloud.tencent.com/document/api/214/30686) 接口获取。
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set 要查询的负载均衡监听器 ID 数组，最大为100个，可以通过 [DescribeListeners](https://cloud.tencent.com/document/api/214/30686) 接口获取。
     * @param ListenerIds 要查询的负载均衡监听器 ID 数组，最大为100个，可以通过 [DescribeListeners](https://cloud.tencent.com/document/api/214/30686) 接口获取。
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。 
     * @return Protocol 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。
     * @param Protocol 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 要查询的监听器的端口，端口范围：1-65535 
     * @return Port 要查询的监听器的端口，端口范围：1-65535
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 要查询的监听器的端口，端口范围：1-65535
     * @param Port 要查询的监听器的端口，端口范围：1-65535
     */
    public void setPort(Long Port) {
        this.Port = Port;
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
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

