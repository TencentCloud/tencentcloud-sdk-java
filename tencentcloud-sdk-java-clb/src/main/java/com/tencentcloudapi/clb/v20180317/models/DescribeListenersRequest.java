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

public class DescribeListenersRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 要查询的负载均衡监听器 ID数组
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 要查询的监听器的端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 负载均衡实例 ID 
     * @return LoadBalancerId 负载均衡实例 ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID
     * @param LoadBalancerId 负载均衡实例 ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 要查询的负载均衡监听器 ID数组 
     * @return ListenerIds 要查询的负载均衡监听器 ID数组
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set 要查询的负载均衡监听器 ID数组
     * @param ListenerIds 要查询的负载均衡监听器 ID数组
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL 
     * @return Protocol 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL
     * @param Protocol 要查询的监听器协议类型，取值 TCP | UDP | HTTP | HTTPS | TCP_SSL
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 要查询的监听器的端口 
     * @return Port 要查询的监听器的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 要查询的监听器的端口
     * @param Port 要查询的监听器的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
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

