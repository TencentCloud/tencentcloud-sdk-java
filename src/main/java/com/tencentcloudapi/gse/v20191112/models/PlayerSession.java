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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayerSession extends AbstractModel {

    /**
    * 玩家会话创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 游戏服务器会话运行的DNS标识
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
    * 游戏服务器会话ID，最小长度1个ASCII字符，最大长度不超过256个ASCII字符
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 游戏服务器会话运行的CVM地址
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 玩家自定义数据，最大长度2048个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayerData")
    @Expose
    private String PlayerData;

    /**
    * 玩家ID，最大长度1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 玩家会话ID
    */
    @SerializedName("PlayerSessionId")
    @Expose
    private String PlayerSessionId;

    /**
    * 端口号，最小值不小于1，最大值不超过60000
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 玩家会话的状态（RESERVED = 1,ACTIVE = 2,COMPLETED = 3,TIMEDOUT = 4）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 玩家会话终止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerminationTime")
    @Expose
    private String TerminationTime;

    /**
     * Get 玩家会话创建时间 
     * @return CreationTime 玩家会话创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 玩家会话创建时间
     * @param CreationTime 玩家会话创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 游戏服务器会话运行的DNS标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DnsName 游戏服务器会话运行的DNS标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set 游戏服务器会话运行的DNS标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DnsName 游戏服务器会话运行的DNS标识
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
     * Get 游戏服务器会话ID，最小长度1个ASCII字符，最大长度不超过256个ASCII字符 
     * @return GameServerSessionId 游戏服务器会话ID，最小长度1个ASCII字符，最大长度不超过256个ASCII字符
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set 游戏服务器会话ID，最小长度1个ASCII字符，最大长度不超过256个ASCII字符
     * @param GameServerSessionId 游戏服务器会话ID，最小长度1个ASCII字符，最大长度不超过256个ASCII字符
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get 游戏服务器会话运行的CVM地址 
     * @return IpAddress 游戏服务器会话运行的CVM地址
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 游戏服务器会话运行的CVM地址
     * @param IpAddress 游戏服务器会话运行的CVM地址
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 玩家自定义数据，最大长度2048个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayerData 玩家自定义数据，最大长度2048个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlayerData() {
        return this.PlayerData;
    }

    /**
     * Set 玩家自定义数据，最大长度2048个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayerData 玩家自定义数据，最大长度2048个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayerData(String PlayerData) {
        this.PlayerData = PlayerData;
    }

    /**
     * Get 玩家ID，最大长度1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayerId 玩家ID，最大长度1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 玩家ID，最大长度1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayerId 玩家ID，最大长度1024个ASCII字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 玩家会话ID 
     * @return PlayerSessionId 玩家会话ID
     */
    public String getPlayerSessionId() {
        return this.PlayerSessionId;
    }

    /**
     * Set 玩家会话ID
     * @param PlayerSessionId 玩家会话ID
     */
    public void setPlayerSessionId(String PlayerSessionId) {
        this.PlayerSessionId = PlayerSessionId;
    }

    /**
     * Get 端口号，最小值不小于1，最大值不超过60000 
     * @return Port 端口号，最小值不小于1，最大值不超过60000
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口号，最小值不小于1，最大值不超过60000
     * @param Port 端口号，最小值不小于1，最大值不超过60000
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 玩家会话的状态（RESERVED = 1,ACTIVE = 2,COMPLETED = 3,TIMEDOUT = 4） 
     * @return Status 玩家会话的状态（RESERVED = 1,ACTIVE = 2,COMPLETED = 3,TIMEDOUT = 4）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 玩家会话的状态（RESERVED = 1,ACTIVE = 2,COMPLETED = 3,TIMEDOUT = 4）
     * @param Status 玩家会话的状态（RESERVED = 1,ACTIVE = 2,COMPLETED = 3,TIMEDOUT = 4）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 玩家会话终止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerminationTime 玩家会话终止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTerminationTime() {
        return this.TerminationTime;
    }

    /**
     * Set 玩家会话终止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerminationTime 玩家会话终止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerminationTime(String TerminationTime) {
        this.TerminationTime = TerminationTime;
    }

    public PlayerSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayerSession(PlayerSession source) {
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.DnsName != null) {
            this.DnsName = new String(source.DnsName);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.PlayerData != null) {
            this.PlayerData = new String(source.PlayerData);
        }
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
        if (source.PlayerSessionId != null) {
            this.PlayerSessionId = new String(source.PlayerSessionId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TerminationTime != null) {
            this.TerminationTime = new String(source.TerminationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "PlayerData", this.PlayerData);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerSessionId", this.PlayerSessionId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TerminationTime", this.TerminationTime);

    }
}

