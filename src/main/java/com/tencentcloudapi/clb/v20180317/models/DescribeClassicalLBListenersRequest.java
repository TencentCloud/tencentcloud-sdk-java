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

public class DescribeClassicalLBListenersRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器ID列表
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * 负载均衡监听的协议, 'TCP', 'UDP', 'HTTP', 'HTTPS'
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 负载均衡监听端口， 范围[1-65535]
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * 监听器的状态，0 表示创建中，1 表示运行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 负载均衡监听器ID列表 
     * @return ListenerIds 负载均衡监听器ID列表
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set 负载均衡监听器ID列表
     * @param ListenerIds 负载均衡监听器ID列表
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get 负载均衡监听的协议, 'TCP', 'UDP', 'HTTP', 'HTTPS' 
     * @return Protocol 负载均衡监听的协议, 'TCP', 'UDP', 'HTTP', 'HTTPS'
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 负载均衡监听的协议, 'TCP', 'UDP', 'HTTP', 'HTTPS'
     * @param Protocol 负载均衡监听的协议, 'TCP', 'UDP', 'HTTP', 'HTTPS'
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 负载均衡监听端口， 范围[1-65535] 
     * @return ListenerPort 负载均衡监听端口， 范围[1-65535]
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set 负载均衡监听端口， 范围[1-65535]
     * @param ListenerPort 负载均衡监听端口， 范围[1-65535]
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get 监听器的状态，0 表示创建中，1 表示运行中 
     * @return Status 监听器的状态，0 表示创建中，1 表示运行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 监听器的状态，0 表示创建中，1 表示运行中
     * @param Status 监听器的状态，0 表示创建中，1 表示运行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

