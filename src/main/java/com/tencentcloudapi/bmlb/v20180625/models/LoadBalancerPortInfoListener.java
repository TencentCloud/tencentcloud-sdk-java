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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerPortInfoListener  extends AbstractModel{

    /**
    * 负载均衡监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器协议类型，可选值：http，https，tcp，udp。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器的监听端口。
    */
    @SerializedName("LoadBalancerPort")
    @Expose
    private Integer LoadBalancerPort;

    /**
    * 计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Integer Bandwidth;

    /**
    * 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 与监听器绑定的主机端口。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
     * 获取负载均衡监听器ID。
     * @return ListenerId 负载均衡监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置负载均衡监听器ID。
     * @param ListenerId 负载均衡监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取监听器名称。
     * @return ListenerName 监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置监听器名称。
     * @param ListenerName 监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取监听器协议类型，可选值：http，https，tcp，udp。
     * @return Protocol 监听器协议类型，可选值：http，https，tcp，udp。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置监听器协议类型，可选值：http，https，tcp，udp。
     * @param Protocol 监听器协议类型，可选值：http，https，tcp，udp。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取监听器的监听端口。
     * @return LoadBalancerPort 监听器的监听端口。
     */
    public Integer getLoadBalancerPort() {
        return this.LoadBalancerPort;
    }

    /**
     * 设置监听器的监听端口。
     * @param LoadBalancerPort 监听器的监听端口。
     */
    public void setLoadBalancerPort(Integer LoadBalancerPort) {
        this.LoadBalancerPort = LoadBalancerPort;
    }

    /**
     * 获取计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
     * @return Bandwidth 计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
     * @param Bandwidth 计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     * @return Status 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     * @param Status 监听器当前状态（0代表创建中，1代表正常运行，2代表创建失败，3代表删除中，4代表删除失败）。
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取与监听器绑定的主机端口。
     * @return Port 与监听器绑定的主机端口。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置与监听器绑定的主机端口。
     * @param Port 与监听器绑定的主机端口。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "LoadBalancerPort", this.LoadBalancerPort);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

