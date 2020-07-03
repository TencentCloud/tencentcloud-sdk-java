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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUDPListenersRequest extends AbstractModel{

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口列表
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 监听器对应源站类型，支持IP或者DOMAIN类型
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 源站端口列表，该参数仅支持v1版本监听器和通道组监听器
    */
    @SerializedName("RealServerPorts")
    @Expose
    private Long [] RealServerPorts;

    /**
     * Get 监听器名称 
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器端口列表 
     * @return Ports 监听器端口列表
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 监听器端口列表
     * @param Ports 监听器端口列表
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc） 
     * @return Scheduler 监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）
     * @param Scheduler 监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 监听器对应源站类型，支持IP或者DOMAIN类型 
     * @return RealServerType 监听器对应源站类型，支持IP或者DOMAIN类型
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set 监听器对应源站类型，支持IP或者DOMAIN类型
     * @param RealServerType 监听器对应源站类型，支持IP或者DOMAIN类型
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。 
     * @return ProxyId 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     * @param ProxyId 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。 
     * @return GroupId 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     * @param GroupId 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 源站端口列表，该参数仅支持v1版本监听器和通道组监听器 
     * @return RealServerPorts 源站端口列表，该参数仅支持v1版本监听器和通道组监听器
     */
    public Long [] getRealServerPorts() {
        return this.RealServerPorts;
    }

    /**
     * Set 源站端口列表，该参数仅支持v1版本监听器和通道组监听器
     * @param RealServerPorts 源站端口列表，该参数仅支持v1版本监听器和通道组监听器
     */
    public void setRealServerPorts(Long [] RealServerPorts) {
        this.RealServerPorts = RealServerPorts;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "RealServerPorts.", this.RealServerPorts);

    }
}

