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

public class GameServerSessionPlacement extends AbstractModel{

    /**
    * 部署Id
    */
    @SerializedName("PlacementId")
    @Expose
    private String PlacementId;

    /**
    * 服务部署组名称
    */
    @SerializedName("GameServerSessionQueueName")
    @Expose
    private String GameServerSessionQueueName;

    /**
    * 玩家延迟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayerLatencies")
    @Expose
    private PlayerLatency [] PlayerLatencies;

    /**
    * 服务部署状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 分配给正在运行游戏会话的实例的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
    * 游戏会话Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 游戏会话名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameServerSessionName")
    @Expose
    private String GameServerSessionName;

    /**
    * 服务部署区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameServerSessionRegion")
    @Expose
    private String GameServerSessionRegion;

    /**
    * 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * 最大玩家数量
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * 游戏会话数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * 运行游戏会话的实例的IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 运行游戏会话的实例的端口号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 游戏匹配数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchmakerData")
    @Expose
    private String MatchmakerData;

    /**
    * 部署的玩家游戏数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlacedPlayerSessions")
    @Expose
    private PlacedPlayerSession [] PlacedPlayerSessions;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 部署Id 
     * @return PlacementId 部署Id
     */
    public String getPlacementId() {
        return this.PlacementId;
    }

    /**
     * Set 部署Id
     * @param PlacementId 部署Id
     */
    public void setPlacementId(String PlacementId) {
        this.PlacementId = PlacementId;
    }

    /**
     * Get 服务部署组名称 
     * @return GameServerSessionQueueName 服务部署组名称
     */
    public String getGameServerSessionQueueName() {
        return this.GameServerSessionQueueName;
    }

    /**
     * Set 服务部署组名称
     * @param GameServerSessionQueueName 服务部署组名称
     */
    public void setGameServerSessionQueueName(String GameServerSessionQueueName) {
        this.GameServerSessionQueueName = GameServerSessionQueueName;
    }

    /**
     * Get 玩家延迟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayerLatencies 玩家延迟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PlayerLatency [] getPlayerLatencies() {
        return this.PlayerLatencies;
    }

    /**
     * Set 玩家延迟
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayerLatencies 玩家延迟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayerLatencies(PlayerLatency [] PlayerLatencies) {
        this.PlayerLatencies = PlayerLatencies;
    }

    /**
     * Get 服务部署状态 
     * @return Status 服务部署状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 服务部署状态
     * @param Status 服务部署状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 分配给正在运行游戏会话的实例的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DnsName 分配给正在运行游戏会话的实例的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set 分配给正在运行游戏会话的实例的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。
     * @param DnsName 分配给正在运行游戏会话的实例的DNS标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDnsName(String DnsName) {
        this.DnsName = DnsName;
    }

    /**
     * Get 游戏会话Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameServerSessionId 游戏会话Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set 游戏会话Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameServerSessionId 游戏会话Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get 游戏会话名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameServerSessionName 游戏会话名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGameServerSessionName() {
        return this.GameServerSessionName;
    }

    /**
     * Set 游戏会话名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameServerSessionName 游戏会话名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameServerSessionName(String GameServerSessionName) {
        this.GameServerSessionName = GameServerSessionName;
    }

    /**
     * Get 服务部署区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameServerSessionRegion 服务部署区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGameServerSessionRegion() {
        return this.GameServerSessionRegion;
    }

    /**
     * Set 服务部署区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameServerSessionRegion 服务部署区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameServerSessionRegion(String GameServerSessionRegion) {
        this.GameServerSessionRegion = GameServerSessionRegion;
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
     * Get 游戏会话数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameServerSessionData 游戏会话数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set 游戏会话数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameServerSessionData 游戏会话数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get 运行游戏会话的实例的IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpAddress 运行游戏会话的实例的IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 运行游戏会话的实例的IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpAddress 运行游戏会话的实例的IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 运行游戏会话的实例的端口号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 运行游戏会话的实例的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 运行游戏会话的实例的端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 运行游戏会话的实例的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 游戏匹配数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchmakerData 游戏匹配数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchmakerData() {
        return this.MatchmakerData;
    }

    /**
     * Set 游戏匹配数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchmakerData 游戏匹配数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchmakerData(String MatchmakerData) {
        this.MatchmakerData = MatchmakerData;
    }

    /**
     * Get 部署的玩家游戏数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlacedPlayerSessions 部署的玩家游戏数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PlacedPlayerSession [] getPlacedPlayerSessions() {
        return this.PlacedPlayerSessions;
    }

    /**
     * Set 部署的玩家游戏数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlacedPlayerSessions 部署的玩家游戏数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlacedPlayerSessions(PlacedPlayerSession [] PlacedPlayerSessions) {
        this.PlacedPlayerSessions = PlacedPlayerSessions;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlacementId", this.PlacementId);
        this.setParamSimple(map, prefix + "GameServerSessionQueueName", this.GameServerSessionQueueName);
        this.setParamArrayObj(map, prefix + "PlayerLatencies.", this.PlayerLatencies);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "GameServerSessionName", this.GameServerSessionName);
        this.setParamSimple(map, prefix + "GameServerSessionRegion", this.GameServerSessionRegion);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamSimple(map, prefix + "GameServerSessionData", this.GameServerSessionData);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "MatchmakerData", this.MatchmakerData);
        this.setParamArrayObj(map, prefix + "PlacedPlayerSessions.", this.PlacedPlayerSessions);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

