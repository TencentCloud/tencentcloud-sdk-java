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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateListenerRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 要将监听器创建到哪些端口，每个端口对应一个新的监听器
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 监听器协议： TCP | UDP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数
    */
    @SerializedName("ListenerNames")
    @Expose
    private String [] ListenerNames;

    /**
    * 健康检查相关参数
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * 批量端口段的结束端口，必须和Ports长度一样。
    */
    @SerializedName("EndPorts")
    @Expose
    private Long [] EndPorts;

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
     * Get 要将监听器创建到哪些端口，每个端口对应一个新的监听器 
     * @return Ports 要将监听器创建到哪些端口，每个端口对应一个新的监听器
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 要将监听器创建到哪些端口，每个端口对应一个新的监听器
     * @param Ports 要将监听器创建到哪些端口，每个端口对应一个新的监听器
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 监听器协议： TCP | UDP 
     * @return Protocol 监听器协议： TCP | UDP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议： TCP | UDP
     * @param Protocol 监听器协议： TCP | UDP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数 
     * @return ListenerNames 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数
     */
    public String [] getListenerNames() {
        return this.ListenerNames;
    }

    /**
     * Set 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数
     * @param ListenerNames 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数
     */
    public void setListenerNames(String [] ListenerNames) {
        this.ListenerNames = ListenerNames;
    }

    /**
     * Get 健康检查相关参数 
     * @return HealthCheck 健康检查相关参数
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查相关参数
     * @param HealthCheck 健康检查相关参数
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。 
     * @return SessionExpireTime 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
     * @param SessionExpireTime 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。 
     * @return Scheduler 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。
     * @param Scheduler 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。 
     * @return SessionType 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
     * @param SessionType 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get 批量端口段的结束端口，必须和Ports长度一样。 
     * @return EndPorts 批量端口段的结束端口，必须和Ports长度一样。
     */
    public Long [] getEndPorts() {
        return this.EndPorts;
    }

    /**
     * Set 批量端口段的结束端口，必须和Ports长度一样。
     * @param EndPorts 批量端口段的结束端口，必须和Ports长度一样。
     */
    public void setEndPorts(Long [] EndPorts) {
        this.EndPorts = EndPorts;
    }

    public CreateListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateListenerRequest(CreateListenerRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ListenerNames != null) {
            this.ListenerNames = new String[source.ListenerNames.length];
            for (int i = 0; i < source.ListenerNames.length; i++) {
                this.ListenerNames[i] = new String(source.ListenerNames[i]);
            }
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.EndPorts != null) {
            this.EndPorts = new Long[source.EndPorts.length];
            for (int i = 0; i < source.EndPorts.length; i++) {
                this.EndPorts[i] = new Long(source.EndPorts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "ListenerNames.", this.ListenerNames);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamArraySimple(map, prefix + "EndPorts.", this.EndPorts);

    }
}

