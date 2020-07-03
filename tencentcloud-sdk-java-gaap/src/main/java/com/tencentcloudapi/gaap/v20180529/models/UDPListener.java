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

public class UDPListener extends AbstractModel{

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
    * 监听器转发源站端口，仅V1版本通道或通道组监听器有效
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
    * 监听器协议， UDP
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
    * 监听器源站访问策略
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 监听器绑定源站状态， 0表示正常，1表示IP异常，2表示域名解析异常
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
     * Get 监听器转发源站端口，仅V1版本通道或通道组监听器有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealServerPort 监听器转发源站端口，仅V1版本通道或通道组监听器有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set 监听器转发源站端口，仅V1版本通道或通道组监听器有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealServerPort 监听器转发源站端口，仅V1版本通道或通道组监听器有效
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
     * Get 监听器协议， UDP 
     * @return Protocol 监听器协议， UDP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议， UDP
     * @param Protocol 监听器协议， UDP
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
     * Get 监听器源站访问策略 
     * @return Scheduler 监听器源站访问策略
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器源站访问策略
     * @param Scheduler 监听器源站访问策略
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 监听器绑定源站状态， 0表示正常，1表示IP异常，2表示域名解析异常 
     * @return BindStatus 监听器绑定源站状态， 0表示正常，1表示IP异常，2表示域名解析异常
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 监听器绑定源站状态， 0表示正常，1表示IP异常，2表示域名解析异常
     * @param BindStatus 监听器绑定源站状态， 0表示正常，1表示IP异常，2表示域名解析异常
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
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

