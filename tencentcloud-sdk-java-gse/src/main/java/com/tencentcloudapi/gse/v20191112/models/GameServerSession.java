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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GameServerSession extends AbstractModel{

    /**
    * 游戏服务器会话创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 创建者ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 当前玩家数量
    */
    @SerializedName("CurrentPlayerSessionCount")
    @Expose
    private Long CurrentPlayerSessionCount;

    /**
    * CVM的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
    * 舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * 游戏服务器会话属性详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * 游戏服务器会话ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * CVM IP地址
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 对战进程详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchmakerData")
    @Expose
    private String MatchmakerData;

    /**
    * 最大玩家数量
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * 游戏服务器会话名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 玩家会话创建策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayerSessionCreationPolicy")
    @Expose
    private String PlayerSessionCreationPolicy;

    /**
    * 端口号
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 游戏服务器会话状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 游戏服务器会话状态附加信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * 终止的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerminationTime")
    @Expose
    private String TerminationTime;

    /**
    * 实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 当前自定义数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentCustomCount")
    @Expose
    private Long CurrentCustomCount;

    /**
    * 最大自定义数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxCustomCount")
    @Expose
    private Long MaxCustomCount;

    /**
    * 权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 会话可用性状态，是否被屏蔽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailabilityStatus")
    @Expose
    private String AvailabilityStatus;

    /**
     * Get 游戏服务器会话创建时间 
     * @return CreationTime 游戏服务器会话创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 游戏服务器会话创建时间
     * @param CreationTime 游戏服务器会话创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 创建者ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorId 创建者ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建者ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorId 创建者ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get 当前玩家数量 
     * @return CurrentPlayerSessionCount 当前玩家数量
     */
    public Long getCurrentPlayerSessionCount() {
        return this.CurrentPlayerSessionCount;
    }

    /**
     * Set 当前玩家数量
     * @param CurrentPlayerSessionCount 当前玩家数量
     */
    public void setCurrentPlayerSessionCount(Long CurrentPlayerSessionCount) {
        this.CurrentPlayerSessionCount = CurrentPlayerSessionCount;
    }

    /**
     * Get CVM的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DnsName CVM的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set CVM的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。
     * @param DnsName CVM的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDnsName(String DnsName) {
        this.DnsName = DnsName;
    }

    /**
     * Get 舰队ID 
     * @return FleetId 舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 舰队ID
     * @param FleetId 舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 游戏属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameProperties 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameProperties 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get 游戏服务器会话属性详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameServerSessionData 游戏服务器会话属性详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set 游戏服务器会话属性详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameServerSessionData 游戏服务器会话属性详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get 游戏服务器会话ID 
     * @return GameServerSessionId 游戏服务器会话ID
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set 游戏服务器会话ID
     * @param GameServerSessionId 游戏服务器会话ID
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get CVM IP地址 
     * @return IpAddress CVM IP地址
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set CVM IP地址
     * @param IpAddress CVM IP地址
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 对战进程详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchmakerData 对战进程详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchmakerData() {
        return this.MatchmakerData;
    }

    /**
     * Set 对战进程详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchmakerData 对战进程详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchmakerData(String MatchmakerData) {
        this.MatchmakerData = MatchmakerData;
    }

    /**
     * Get 最大玩家数量 
     * @return MaximumPlayerSessionCount 最大玩家数量
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set 最大玩家数量
     * @param MaximumPlayerSessionCount 最大玩家数量
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    /**
     * Get 游戏服务器会话名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 游戏服务器会话名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 游戏服务器会话名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 游戏服务器会话名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 玩家会话创建策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayerSessionCreationPolicy 玩家会话创建策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlayerSessionCreationPolicy() {
        return this.PlayerSessionCreationPolicy;
    }

    /**
     * Set 玩家会话创建策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayerSessionCreationPolicy 玩家会话创建策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayerSessionCreationPolicy(String PlayerSessionCreationPolicy) {
        this.PlayerSessionCreationPolicy = PlayerSessionCreationPolicy;
    }

    /**
     * Get 端口号 
     * @return Port 端口号
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口号
     * @param Port 端口号
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 游戏服务器会话状态 
     * @return Status 游戏服务器会话状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 游戏服务器会话状态
     * @param Status 游戏服务器会话状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 游戏服务器会话状态附加信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusReason 游戏服务器会话状态附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set 游戏服务器会话状态附加信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusReason 游戏服务器会话状态附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get 终止的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerminationTime 终止的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTerminationTime() {
        return this.TerminationTime;
    }

    /**
     * Set 终止的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerminationTime 终止的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerminationTime(String TerminationTime) {
        this.TerminationTime = TerminationTime;
    }

    /**
     * Get 实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 当前自定义数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentCustomCount 当前自定义数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentCustomCount() {
        return this.CurrentCustomCount;
    }

    /**
     * Set 当前自定义数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentCustomCount 当前自定义数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentCustomCount(Long CurrentCustomCount) {
        this.CurrentCustomCount = CurrentCustomCount;
    }

    /**
     * Get 最大自定义数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxCustomCount 最大自定义数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxCustomCount() {
        return this.MaxCustomCount;
    }

    /**
     * Set 最大自定义数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxCustomCount 最大自定义数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxCustomCount(Long MaxCustomCount) {
        this.MaxCustomCount = MaxCustomCount;
    }

    /**
     * Get 权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 会话可用性状态，是否被屏蔽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailabilityStatus 会话可用性状态，是否被屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvailabilityStatus() {
        return this.AvailabilityStatus;
    }

    /**
     * Set 会话可用性状态，是否被屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailabilityStatus 会话可用性状态，是否被屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailabilityStatus(String AvailabilityStatus) {
        this.AvailabilityStatus = AvailabilityStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "CurrentPlayerSessionCount", this.CurrentPlayerSessionCount);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "GameServerSessionData", this.GameServerSessionData);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "MatchmakerData", this.MatchmakerData);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PlayerSessionCreationPolicy", this.PlayerSessionCreationPolicy);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "TerminationTime", this.TerminationTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "CurrentCustomCount", this.CurrentCustomCount);
        this.setParamSimple(map, prefix + "MaxCustomCount", this.MaxCustomCount);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "AvailabilityStatus", this.AvailabilityStatus);

    }
}

