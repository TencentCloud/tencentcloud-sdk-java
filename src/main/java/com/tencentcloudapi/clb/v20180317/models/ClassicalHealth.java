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

public class ClassicalHealth extends AbstractModel{

    /**
    * 后端服务的内网 IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 后端服务的端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 负载均衡的监听端口
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * 转发协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 健康检查结果，1 表示健康，0 表示不健康
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long HealthStatus;

    /**
     * Get 后端服务的内网 IP 
     * @return IP 后端服务的内网 IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 后端服务的内网 IP
     * @param IP 后端服务的内网 IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 后端服务的端口 
     * @return Port 后端服务的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 后端服务的端口
     * @param Port 后端服务的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 负载均衡的监听端口 
     * @return ListenerPort 负载均衡的监听端口
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set 负载均衡的监听端口
     * @param ListenerPort 负载均衡的监听端口
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get 转发协议 
     * @return Protocol 转发协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 转发协议
     * @param Protocol 转发协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 健康检查结果，1 表示健康，0 表示不健康 
     * @return HealthStatus 健康检查结果，1 表示健康，0 表示不健康
     */
    public Long getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 健康检查结果，1 表示健康，0 表示不健康
     * @param HealthStatus 健康检查结果，1 表示健康，0 表示不健康
     */
    public void setHealthStatus(Long HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);

    }
}

