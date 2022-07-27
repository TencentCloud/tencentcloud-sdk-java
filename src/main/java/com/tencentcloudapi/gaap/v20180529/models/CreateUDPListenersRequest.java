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
    * 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

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
    * 源站端口列表，该参数仅支持v1版本监听器和通道组监听器
    */
    @SerializedName("RealServerPorts")
    @Expose
    private Long [] RealServerPorts;

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
    * 源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启
    */
    @SerializedName("FailoverSwitch")
    @Expose
    private Long FailoverSwitch;

    /**
    * 源站是否开启健康检查：1开启，0关闭。
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * UDP源站健康类型。PORT表示检查端口，PING表示PING。
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * UDP源站健康检查探测端口。
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * UDP源站健康检查端口探测报文类型：TEXT表示文本。仅在健康检查类型为PORT时使用。
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * UDP源站健康检查端口探测发送报文。仅在健康检查类型为PORT时使用。
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * UDP源站健康检查端口探测接收报文。仅在健康检查类型为PORT时使用。
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

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
     * Get 源站是否开启健康检查：1开启，0关闭。 
     * @return HealthCheck 源站是否开启健康检查：1开启，0关闭。
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 源站是否开启健康检查：1开启，0关闭。
     * @param HealthCheck 源站是否开启健康检查：1开启，0关闭。
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get UDP源站健康类型。PORT表示检查端口，PING表示PING。 
     * @return CheckType UDP源站健康类型。PORT表示检查端口，PING表示PING。
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set UDP源站健康类型。PORT表示检查端口，PING表示PING。
     * @param CheckType UDP源站健康类型。PORT表示检查端口，PING表示PING。
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get UDP源站健康检查探测端口。 
     * @return CheckPort UDP源站健康检查探测端口。
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set UDP源站健康检查探测端口。
     * @param CheckPort UDP源站健康检查探测端口。
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get UDP源站健康检查端口探测报文类型：TEXT表示文本。仅在健康检查类型为PORT时使用。 
     * @return ContextType UDP源站健康检查端口探测报文类型：TEXT表示文本。仅在健康检查类型为PORT时使用。
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set UDP源站健康检查端口探测报文类型：TEXT表示文本。仅在健康检查类型为PORT时使用。
     * @param ContextType UDP源站健康检查端口探测报文类型：TEXT表示文本。仅在健康检查类型为PORT时使用。
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get UDP源站健康检查端口探测发送报文。仅在健康检查类型为PORT时使用。 
     * @return SendContext UDP源站健康检查端口探测发送报文。仅在健康检查类型为PORT时使用。
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set UDP源站健康检查端口探测发送报文。仅在健康检查类型为PORT时使用。
     * @param SendContext UDP源站健康检查端口探测发送报文。仅在健康检查类型为PORT时使用。
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get UDP源站健康检查端口探测接收报文。仅在健康检查类型为PORT时使用。 
     * @return RecvContext UDP源站健康检查端口探测接收报文。仅在健康检查类型为PORT时使用。
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set UDP源站健康检查端口探测接收报文。仅在健康检查类型为PORT时使用。
     * @param RecvContext UDP源站健康检查端口探测接收报文。仅在健康检查类型为PORT时使用。
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    public CreateUDPListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUDPListenersRequest(CreateUDPListenersRequest source) {
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
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.RealServerPorts != null) {
            this.RealServerPorts = new Long[source.RealServerPorts.length];
            for (int i = 0; i < source.RealServerPorts.length; i++) {
                this.RealServerPorts[i] = new Long(source.RealServerPorts[i]);
            }
        }
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.HealthyThreshold != null) {
            this.HealthyThreshold = new Long(source.HealthyThreshold);
        }
        if (source.UnhealthyThreshold != null) {
            this.UnhealthyThreshold = new Long(source.UnhealthyThreshold);
        }
        if (source.FailoverSwitch != null) {
            this.FailoverSwitch = new Long(source.FailoverSwitch);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.CheckPort != null) {
            this.CheckPort = new Long(source.CheckPort);
        }
        if (source.ContextType != null) {
            this.ContextType = new String(source.ContextType);
        }
        if (source.SendContext != null) {
            this.SendContext = new String(source.SendContext);
        }
        if (source.RecvContext != null) {
            this.RecvContext = new String(source.RecvContext);
        }
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
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);
        this.setParamSimple(map, prefix + "FailoverSwitch", this.FailoverSwitch);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);

    }
}

