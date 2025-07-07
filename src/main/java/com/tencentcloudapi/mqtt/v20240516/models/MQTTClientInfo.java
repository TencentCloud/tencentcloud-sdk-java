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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTClientInfo extends AbstractModel {

    /**
    * 客户端ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 客户端网络地址
    */
    @SerializedName("ClientAddress")
    @Expose
    private String ClientAddress;

    /**
    * MQTT 协议版本
3：表示MQTT 3.1版本
4：表示 MQTT 3.1.1
5：表示MQTT 5.0协议
    */
    @SerializedName("ProtocolVersion")
    @Expose
    private Long ProtocolVersion;

    /**
    * 保持连接时间，单位：秒
    */
    @SerializedName("Keepalive")
    @Expose
    private Long Keepalive;

    /**
    * 连接状态，CONNECTED 已连接，DISCONNECTED 未连接
    */
    @SerializedName("ConnectionStatus")
    @Expose
    private String ConnectionStatus;

    /**
    * 客户端创建时间，毫秒级时间戳 。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 上次建立连接时间，毫秒级时间戳 。
    */
    @SerializedName("ConnectTime")
    @Expose
    private Long ConnectTime;

    /**
    * 上次断开连接时间，仅对持久会话（cleanSession=false）并且客户端当前未连接时有意义，毫秒级时间戳 。
    */
    @SerializedName("DisconnectTime")
    @Expose
    private Long DisconnectTime;

    /**
    * 客户端的订阅列表
    */
    @SerializedName("MQTTClientSubscriptions")
    @Expose
    private MQTTClientSubscription [] MQTTClientSubscriptions;

    /**
     * Get 客户端ID 
     * @return ClientId 客户端ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID
     * @param ClientId 客户端ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 客户端网络地址 
     * @return ClientAddress 客户端网络地址
     */
    public String getClientAddress() {
        return this.ClientAddress;
    }

    /**
     * Set 客户端网络地址
     * @param ClientAddress 客户端网络地址
     */
    public void setClientAddress(String ClientAddress) {
        this.ClientAddress = ClientAddress;
    }

    /**
     * Get MQTT 协议版本
3：表示MQTT 3.1版本
4：表示 MQTT 3.1.1
5：表示MQTT 5.0协议 
     * @return ProtocolVersion MQTT 协议版本
3：表示MQTT 3.1版本
4：表示 MQTT 3.1.1
5：表示MQTT 5.0协议
     */
    public Long getProtocolVersion() {
        return this.ProtocolVersion;
    }

    /**
     * Set MQTT 协议版本
3：表示MQTT 3.1版本
4：表示 MQTT 3.1.1
5：表示MQTT 5.0协议
     * @param ProtocolVersion MQTT 协议版本
3：表示MQTT 3.1版本
4：表示 MQTT 3.1.1
5：表示MQTT 5.0协议
     */
    public void setProtocolVersion(Long ProtocolVersion) {
        this.ProtocolVersion = ProtocolVersion;
    }

    /**
     * Get 保持连接时间，单位：秒 
     * @return Keepalive 保持连接时间，单位：秒
     */
    public Long getKeepalive() {
        return this.Keepalive;
    }

    /**
     * Set 保持连接时间，单位：秒
     * @param Keepalive 保持连接时间，单位：秒
     */
    public void setKeepalive(Long Keepalive) {
        this.Keepalive = Keepalive;
    }

    /**
     * Get 连接状态，CONNECTED 已连接，DISCONNECTED 未连接 
     * @return ConnectionStatus 连接状态，CONNECTED 已连接，DISCONNECTED 未连接
     */
    public String getConnectionStatus() {
        return this.ConnectionStatus;
    }

    /**
     * Set 连接状态，CONNECTED 已连接，DISCONNECTED 未连接
     * @param ConnectionStatus 连接状态，CONNECTED 已连接，DISCONNECTED 未连接
     */
    public void setConnectionStatus(String ConnectionStatus) {
        this.ConnectionStatus = ConnectionStatus;
    }

    /**
     * Get 客户端创建时间，毫秒级时间戳 。 
     * @return CreateTime 客户端创建时间，毫秒级时间戳 。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 客户端创建时间，毫秒级时间戳 。
     * @param CreateTime 客户端创建时间，毫秒级时间戳 。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 上次建立连接时间，毫秒级时间戳 。 
     * @return ConnectTime 上次建立连接时间，毫秒级时间戳 。
     */
    public Long getConnectTime() {
        return this.ConnectTime;
    }

    /**
     * Set 上次建立连接时间，毫秒级时间戳 。
     * @param ConnectTime 上次建立连接时间，毫秒级时间戳 。
     */
    public void setConnectTime(Long ConnectTime) {
        this.ConnectTime = ConnectTime;
    }

    /**
     * Get 上次断开连接时间，仅对持久会话（cleanSession=false）并且客户端当前未连接时有意义，毫秒级时间戳 。 
     * @return DisconnectTime 上次断开连接时间，仅对持久会话（cleanSession=false）并且客户端当前未连接时有意义，毫秒级时间戳 。
     */
    public Long getDisconnectTime() {
        return this.DisconnectTime;
    }

    /**
     * Set 上次断开连接时间，仅对持久会话（cleanSession=false）并且客户端当前未连接时有意义，毫秒级时间戳 。
     * @param DisconnectTime 上次断开连接时间，仅对持久会话（cleanSession=false）并且客户端当前未连接时有意义，毫秒级时间戳 。
     */
    public void setDisconnectTime(Long DisconnectTime) {
        this.DisconnectTime = DisconnectTime;
    }

    /**
     * Get 客户端的订阅列表 
     * @return MQTTClientSubscriptions 客户端的订阅列表
     */
    public MQTTClientSubscription [] getMQTTClientSubscriptions() {
        return this.MQTTClientSubscriptions;
    }

    /**
     * Set 客户端的订阅列表
     * @param MQTTClientSubscriptions 客户端的订阅列表
     */
    public void setMQTTClientSubscriptions(MQTTClientSubscription [] MQTTClientSubscriptions) {
        this.MQTTClientSubscriptions = MQTTClientSubscriptions;
    }

    public MQTTClientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTClientInfo(MQTTClientInfo source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientAddress != null) {
            this.ClientAddress = new String(source.ClientAddress);
        }
        if (source.ProtocolVersion != null) {
            this.ProtocolVersion = new Long(source.ProtocolVersion);
        }
        if (source.Keepalive != null) {
            this.Keepalive = new Long(source.Keepalive);
        }
        if (source.ConnectionStatus != null) {
            this.ConnectionStatus = new String(source.ConnectionStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ConnectTime != null) {
            this.ConnectTime = new Long(source.ConnectTime);
        }
        if (source.DisconnectTime != null) {
            this.DisconnectTime = new Long(source.DisconnectTime);
        }
        if (source.MQTTClientSubscriptions != null) {
            this.MQTTClientSubscriptions = new MQTTClientSubscription[source.MQTTClientSubscriptions.length];
            for (int i = 0; i < source.MQTTClientSubscriptions.length; i++) {
                this.MQTTClientSubscriptions[i] = new MQTTClientSubscription(source.MQTTClientSubscriptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientAddress", this.ClientAddress);
        this.setParamSimple(map, prefix + "ProtocolVersion", this.ProtocolVersion);
        this.setParamSimple(map, prefix + "Keepalive", this.Keepalive);
        this.setParamSimple(map, prefix + "ConnectionStatus", this.ConnectionStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ConnectTime", this.ConnectTime);
        this.setParamSimple(map, prefix + "DisconnectTime", this.DisconnectTime);
        this.setParamArrayObj(map, prefix + "MQTTClientSubscriptions.", this.MQTTClientSubscriptions);

    }
}

