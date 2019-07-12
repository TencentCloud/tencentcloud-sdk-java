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

public class ClassicalHealth  extends AbstractModel{

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
    private Integer Port;

    /**
    * 负载均衡的监听端口
    */
    @SerializedName("ListenerPort")
    @Expose
    private Integer ListenerPort;

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
    private Integer HealthStatus;

    /**
     * 获取后端服务的内网 IP
     * @return IP 后端服务的内网 IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * 设置后端服务的内网 IP
     * @param IP 后端服务的内网 IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * 获取后端服务的端口
     * @return Port 后端服务的端口
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置后端服务的端口
     * @param Port 后端服务的端口
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取负载均衡的监听端口
     * @return ListenerPort 负载均衡的监听端口
     */
    public Integer getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * 设置负载均衡的监听端口
     * @param ListenerPort 负载均衡的监听端口
     */
    public void setListenerPort(Integer ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * 获取转发协议
     * @return Protocol 转发协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置转发协议
     * @param Protocol 转发协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取健康检查结果，1 表示健康，0 表示不健康
     * @return HealthStatus 健康检查结果，1 表示健康，0 表示不健康
     */
    public Integer getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * 设置健康检查结果，1 表示健康，0 表示不健康
     * @param HealthStatus 健康检查结果，1 表示健康，0 表示不健康
     */
    public void setHealthStatus(Integer HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);

    }
}

