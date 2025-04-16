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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCPListener extends AbstractModel {

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 监听器转发源站端口，仅对版本为1.0的通道有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealServerPort")
    @Expose
    private Long RealServerPort;

    /**
    * 监听器绑定源站类型
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * 监听器协议， TCP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。
    */
    @SerializedName("ListenerStatus")
    @Expose
    private Long ListenerStatus;

    /**
    * 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 源站健康检查响应超时时间，单位：秒
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * 源站健康检查时间间隔，单位：秒
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * 监听器是否开启健康检查，其中：
0表示关闭；
1表示开启
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * 监听器绑定的源站状态， 其中：
0表示异常；
1表示正常。
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * 监听器绑定的源站信息
    */
    @SerializedName("RealServerSet")
    @Expose
    private BindRealServer [] RealServerSet;

    /**
    * 监听器创建时间，Unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 监听器获取客户端 IP 的方式，0表示TOA, 1表示Proxy Protocol
    */
    @SerializedName("ClientIPMethod")
    @Expose
    private Long ClientIPMethod;

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
    * 是否开启会话保持选项：0关闭， 非0开启，非0值为会话保持时间
    */
    @SerializedName("SessionPersist")
    @Expose
    private Long SessionPersist;

    /**
    * 监听器的通道ID，如果监听器属于通道组，则为null
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 监听器的通道组ID，如果监听器属于通道，则为null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

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
     * Get 监听器端口 
     * @return Port 监听器端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口
     * @param Port 监听器端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 监听器转发源站端口，仅对版本为1.0的通道有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealServerPort 监听器转发源站端口，仅对版本为1.0的通道有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set 监听器转发源站端口，仅对版本为1.0的通道有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealServerPort 监听器转发源站端口，仅对版本为1.0的通道有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealServerPort(Long RealServerPort) {
        this.RealServerPort = RealServerPort;
    }

    /**
     * Get 监听器绑定源站类型 
     * @return RealServerType 监听器绑定源站类型
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set 监听器绑定源站类型
     * @param RealServerType 监听器绑定源站类型
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get 监听器协议， TCP 
     * @return Protocol 监听器协议， TCP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议， TCP
     * @param Protocol 监听器协议， TCP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。 
     * @return ListenerStatus 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。
     */
    public Long getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。
     * @param ListenerStatus 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。
     */
    public void setListenerStatus(Long ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
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
     * Get 源站健康检查响应超时时间，单位：秒 
     * @return ConnectTimeout 源站健康检查响应超时时间，单位：秒
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set 源站健康检查响应超时时间，单位：秒
     * @param ConnectTimeout 源站健康检查响应超时时间，单位：秒
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get 源站健康检查时间间隔，单位：秒 
     * @return DelayLoop 源站健康检查时间间隔，单位：秒
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set 源站健康检查时间间隔，单位：秒
     * @param DelayLoop 源站健康检查时间间隔，单位：秒
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get 监听器是否开启健康检查，其中：
0表示关闭；
1表示开启 
     * @return HealthCheck 监听器是否开启健康检查，其中：
0表示关闭；
1表示开启
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 监听器是否开启健康检查，其中：
0表示关闭；
1表示开启
     * @param HealthCheck 监听器是否开启健康检查，其中：
0表示关闭；
1表示开启
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 监听器绑定的源站状态， 其中：
0表示异常；
1表示正常。 
     * @return BindStatus 监听器绑定的源站状态， 其中：
0表示异常；
1表示正常。
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 监听器绑定的源站状态， 其中：
0表示异常；
1表示正常。
     * @param BindStatus 监听器绑定的源站状态， 其中：
0表示异常；
1表示正常。
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get 监听器绑定的源站信息 
     * @return RealServerSet 监听器绑定的源站信息
     */
    public BindRealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * Set 监听器绑定的源站信息
     * @param RealServerSet 监听器绑定的源站信息
     */
    public void setRealServerSet(BindRealServer [] RealServerSet) {
        this.RealServerSet = RealServerSet;
    }

    /**
     * Get 监听器创建时间，Unix时间戳 
     * @return CreateTime 监听器创建时间，Unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 监听器创建时间，Unix时间戳
     * @param CreateTime 监听器创建时间，Unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 监听器获取客户端 IP 的方式，0表示TOA, 1表示Proxy Protocol 
     * @return ClientIPMethod 监听器获取客户端 IP 的方式，0表示TOA, 1表示Proxy Protocol
     */
    public Long getClientIPMethod() {
        return this.ClientIPMethod;
    }

    /**
     * Set 监听器获取客户端 IP 的方式，0表示TOA, 1表示Proxy Protocol
     * @param ClientIPMethod 监听器获取客户端 IP 的方式，0表示TOA, 1表示Proxy Protocol
     */
    public void setClientIPMethod(Long ClientIPMethod) {
        this.ClientIPMethod = ClientIPMethod;
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
     * Get 是否开启会话保持选项：0关闭， 非0开启，非0值为会话保持时间 
     * @return SessionPersist 是否开启会话保持选项：0关闭， 非0开启，非0值为会话保持时间
     */
    public Long getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set 是否开启会话保持选项：0关闭， 非0开启，非0值为会话保持时间
     * @param SessionPersist 是否开启会话保持选项：0关闭， 非0开启，非0值为会话保持时间
     */
    public void setSessionPersist(Long SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get 监听器的通道ID，如果监听器属于通道组，则为null 
     * @return ProxyId 监听器的通道ID，如果监听器属于通道组，则为null
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 监听器的通道ID，如果监听器属于通道组，则为null
     * @param ProxyId 监听器的通道ID，如果监听器属于通道组，则为null
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 监听器的通道组ID，如果监听器属于通道，则为null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 监听器的通道组ID，如果监听器属于通道，则为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 监听器的通道组ID，如果监听器属于通道，则为null
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 监听器的通道组ID，如果监听器属于通道，则为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public TCPListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCPListener(TCPListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.RealServerPort != null) {
            this.RealServerPort = new Long(source.RealServerPort);
        }
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ListenerStatus != null) {
            this.ListenerStatus = new Long(source.ListenerStatus);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Long(source.BindStatus);
        }
        if (source.RealServerSet != null) {
            this.RealServerSet = new BindRealServer[source.RealServerSet.length];
            for (int i = 0; i < source.RealServerSet.length; i++) {
                this.RealServerSet[i] = new BindRealServer(source.RealServerSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ClientIPMethod != null) {
            this.ClientIPMethod = new Long(source.ClientIPMethod);
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
        if (source.SessionPersist != null) {
            this.SessionPersist = new Long(source.SessionPersist);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "RealServerPort", this.RealServerPort);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ClientIPMethod", this.ClientIPMethod);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);
        this.setParamSimple(map, prefix + "FailoverSwitch", this.FailoverSwitch);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

