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

public class Listener extends AbstractModel{

    /**
    * 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器的创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 监听器的会话类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
     * Get 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerId 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerId 负载均衡监听器 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 监听器协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 监听器协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 监听器端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 监听器端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheck 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheck 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheduler 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheduler 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionExpireTime 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionExpireTime 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerName 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerName 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器的创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 监听器的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 监听器的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 监听器的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 监听器的会话类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionType 监听器的会话类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set 监听器的会话类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionType 监听器的会话类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPort 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPort 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    public Listener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Listener(Listener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.EndPort != null) {
            this.EndPort = new Long(source.EndPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);

    }
}

