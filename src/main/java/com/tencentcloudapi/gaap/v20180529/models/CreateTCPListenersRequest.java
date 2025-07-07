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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTCPListenersRequest extends AbstractModel {

    /**
    * 监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口列表。
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * 监听器绑定源站类型。IP表示IP地址，DOMAIN表示域名。
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
    * 源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * 源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * 源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
    */
    @SerializedName("RealServerPorts")
    @Expose
    private Long [] RealServerPorts;

    /**
    * 监听器获取客户端 IP 的方式，0表示 TOA, 1表示Proxy Protocol
    */
    @SerializedName("ClientIPMethod")
    @Expose
    private Long ClientIPMethod;

    /**
    * 源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启
    */
    @SerializedName("FailoverSwitch")
    @Expose
    private Long FailoverSwitch;

    /**
    * 健康阈值，表示连续检查成功多少次后认定源站健康。范围为1到10
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * 不健康阈值，表示连续检查失败多少次数后认为源站不健康。范围为1到10
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
     * Get 监听器名称。 
     * @return ListenerName 监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称。
     * @param ListenerName 监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器端口列表。 
     * @return Ports 监听器端口列表。
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 监听器端口列表。
     * @param Ports 监听器端口列表。
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。 
     * @return Scheduler 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
     * @param Scheduler 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查 
     * @return HealthCheck 源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
     * @param HealthCheck 源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 监听器绑定源站类型。IP表示IP地址，DOMAIN表示域名。 
     * @return RealServerType 监听器绑定源站类型。IP表示IP地址，DOMAIN表示域名。
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set 监听器绑定源站类型。IP表示IP地址，DOMAIN表示域名。
     * @param RealServerType 监听器绑定源站类型。IP表示IP地址，DOMAIN表示域名。
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
     * Get 源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。 
     * @return DelayLoop 源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set 源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
     * @param DelayLoop 源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get 源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。 
     * @return ConnectTimeout 源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set 源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
     * @param ConnectTimeout 源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get 源站端口列表，该参数仅支持v1版本监听器和通道组监听器。 
     * @return RealServerPorts 源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
     */
    public Long [] getRealServerPorts() {
        return this.RealServerPorts;
    }

    /**
     * Set 源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
     * @param RealServerPorts 源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
     */
    public void setRealServerPorts(Long [] RealServerPorts) {
        this.RealServerPorts = RealServerPorts;
    }

    /**
     * Get 监听器获取客户端 IP 的方式，0表示 TOA, 1表示Proxy Protocol 
     * @return ClientIPMethod 监听器获取客户端 IP 的方式，0表示 TOA, 1表示Proxy Protocol
     */
    public Long getClientIPMethod() {
        return this.ClientIPMethod;
    }

    /**
     * Set 监听器获取客户端 IP 的方式，0表示 TOA, 1表示Proxy Protocol
     * @param ClientIPMethod 监听器获取客户端 IP 的方式，0表示 TOA, 1表示Proxy Protocol
     */
    public void setClientIPMethod(Long ClientIPMethod) {
        this.ClientIPMethod = ClientIPMethod;
    }

    /**
     * Get 源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启 
     * @return FailoverSwitch 源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启
     */
    public Long getFailoverSwitch() {
        return this.FailoverSwitch;
    }

    /**
     * Set 源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启
     * @param FailoverSwitch 源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启
     */
    public void setFailoverSwitch(Long FailoverSwitch) {
        this.FailoverSwitch = FailoverSwitch;
    }

    /**
     * Get 健康阈值，表示连续检查成功多少次后认定源站健康。范围为1到10 
     * @return HealthyThreshold 健康阈值，表示连续检查成功多少次后认定源站健康。范围为1到10
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set 健康阈值，表示连续检查成功多少次后认定源站健康。范围为1到10
     * @param HealthyThreshold 健康阈值，表示连续检查成功多少次后认定源站健康。范围为1到10
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get 不健康阈值，表示连续检查失败多少次数后认为源站不健康。范围为1到10 
     * @return UnhealthyThreshold 不健康阈值，表示连续检查失败多少次数后认为源站不健康。范围为1到10
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set 不健康阈值，表示连续检查失败多少次数后认为源站不健康。范围为1到10
     * @param UnhealthyThreshold 不健康阈值，表示连续检查失败多少次数后认为源站不健康。范围为1到10
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    public CreateTCPListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTCPListenersRequest(CreateTCPListenersRequest source) {
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
        }
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.RealServerPorts != null) {
            this.RealServerPorts = new Long[source.RealServerPorts.length];
            for (int i = 0; i < source.RealServerPorts.length; i++) {
                this.RealServerPorts[i] = new Long(source.RealServerPorts[i]);
            }
        }
        if (source.ClientIPMethod != null) {
            this.ClientIPMethod = new Long(source.ClientIPMethod);
        }
        if (source.FailoverSwitch != null) {
            this.FailoverSwitch = new Long(source.FailoverSwitch);
        }
        if (source.HealthyThreshold != null) {
            this.HealthyThreshold = new Long(source.HealthyThreshold);
        }
        if (source.UnhealthyThreshold != null) {
            this.UnhealthyThreshold = new Long(source.UnhealthyThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamArraySimple(map, prefix + "RealServerPorts.", this.RealServerPorts);
        this.setParamSimple(map, prefix + "ClientIPMethod", this.ClientIPMethod);
        this.setParamSimple(map, prefix + "FailoverSwitch", this.FailoverSwitch);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);

    }
}

