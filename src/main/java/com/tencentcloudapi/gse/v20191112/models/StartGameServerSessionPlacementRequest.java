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

public class StartGameServerSessionPlacementRequest extends AbstractModel{

    /**
    * 开始部署游戏服务器会话的唯一标识符，最大值48个ASCII字符，模式：[a-zA-Z0-9-]+
    */
    @SerializedName("PlacementId")
    @Expose
    private String PlacementId;

    /**
    * 游戏服务器会话队列名称
    */
    @SerializedName("GameServerSessionQueueName")
    @Expose
    private String GameServerSessionQueueName;

    /**
    * 游戏服务器允许同时连接到游戏会话的最大玩家数量，最小值1，最大值为玩家会话最大限额
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * 玩家游戏会话信息
    */
    @SerializedName("DesiredPlayerSessions")
    @Expose
    private DesiredPlayerSession [] DesiredPlayerSessions;

    /**
    * 玩家游戏会话属性
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * 游戏服务器会话数据，最大长度不超过4096个ASCII字符
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * 游戏服务器会话名称，最大长度不超过4096个ASCII字符
    */
    @SerializedName("GameServerSessionName")
    @Expose
    private String GameServerSessionName;

    /**
    * 玩家延迟
    */
    @SerializedName("PlayerLatencies")
    @Expose
    private PlayerLatency [] PlayerLatencies;

    /**
     * Get 开始部署游戏服务器会话的唯一标识符，最大值48个ASCII字符，模式：[a-zA-Z0-9-]+ 
     * @return PlacementId 开始部署游戏服务器会话的唯一标识符，最大值48个ASCII字符，模式：[a-zA-Z0-9-]+
     */
    public String getPlacementId() {
        return this.PlacementId;
    }

    /**
     * Set 开始部署游戏服务器会话的唯一标识符，最大值48个ASCII字符，模式：[a-zA-Z0-9-]+
     * @param PlacementId 开始部署游戏服务器会话的唯一标识符，最大值48个ASCII字符，模式：[a-zA-Z0-9-]+
     */
    public void setPlacementId(String PlacementId) {
        this.PlacementId = PlacementId;
    }

    /**
     * Get 游戏服务器会话队列名称 
     * @return GameServerSessionQueueName 游戏服务器会话队列名称
     */
    public String getGameServerSessionQueueName() {
        return this.GameServerSessionQueueName;
    }

    /**
     * Set 游戏服务器会话队列名称
     * @param GameServerSessionQueueName 游戏服务器会话队列名称
     */
    public void setGameServerSessionQueueName(String GameServerSessionQueueName) {
        this.GameServerSessionQueueName = GameServerSessionQueueName;
    }

    /**
     * Get 游戏服务器允许同时连接到游戏会话的最大玩家数量，最小值1，最大值为玩家会话最大限额 
     * @return MaximumPlayerSessionCount 游戏服务器允许同时连接到游戏会话的最大玩家数量，最小值1，最大值为玩家会话最大限额
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set 游戏服务器允许同时连接到游戏会话的最大玩家数量，最小值1，最大值为玩家会话最大限额
     * @param MaximumPlayerSessionCount 游戏服务器允许同时连接到游戏会话的最大玩家数量，最小值1，最大值为玩家会话最大限额
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    /**
     * Get 玩家游戏会话信息 
     * @return DesiredPlayerSessions 玩家游戏会话信息
     */
    public DesiredPlayerSession [] getDesiredPlayerSessions() {
        return this.DesiredPlayerSessions;
    }

    /**
     * Set 玩家游戏会话信息
     * @param DesiredPlayerSessions 玩家游戏会话信息
     */
    public void setDesiredPlayerSessions(DesiredPlayerSession [] DesiredPlayerSessions) {
        this.DesiredPlayerSessions = DesiredPlayerSessions;
    }

    /**
     * Get 玩家游戏会话属性 
     * @return GameProperties 玩家游戏会话属性
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set 玩家游戏会话属性
     * @param GameProperties 玩家游戏会话属性
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get 游戏服务器会话数据，最大长度不超过4096个ASCII字符 
     * @return GameServerSessionData 游戏服务器会话数据，最大长度不超过4096个ASCII字符
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set 游戏服务器会话数据，最大长度不超过4096个ASCII字符
     * @param GameServerSessionData 游戏服务器会话数据，最大长度不超过4096个ASCII字符
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get 游戏服务器会话名称，最大长度不超过4096个ASCII字符 
     * @return GameServerSessionName 游戏服务器会话名称，最大长度不超过4096个ASCII字符
     */
    public String getGameServerSessionName() {
        return this.GameServerSessionName;
    }

    /**
     * Set 游戏服务器会话名称，最大长度不超过4096个ASCII字符
     * @param GameServerSessionName 游戏服务器会话名称，最大长度不超过4096个ASCII字符
     */
    public void setGameServerSessionName(String GameServerSessionName) {
        this.GameServerSessionName = GameServerSessionName;
    }

    /**
     * Get 玩家延迟 
     * @return PlayerLatencies 玩家延迟
     */
    public PlayerLatency [] getPlayerLatencies() {
        return this.PlayerLatencies;
    }

    /**
     * Set 玩家延迟
     * @param PlayerLatencies 玩家延迟
     */
    public void setPlayerLatencies(PlayerLatency [] PlayerLatencies) {
        this.PlayerLatencies = PlayerLatencies;
    }

    public StartGameServerSessionPlacementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartGameServerSessionPlacementRequest(StartGameServerSessionPlacementRequest source) {
        if (source.PlacementId != null) {
            this.PlacementId = new String(source.PlacementId);
        }
        if (source.GameServerSessionQueueName != null) {
            this.GameServerSessionQueueName = new String(source.GameServerSessionQueueName);
        }
        if (source.MaximumPlayerSessionCount != null) {
            this.MaximumPlayerSessionCount = new Long(source.MaximumPlayerSessionCount);
        }
        if (source.DesiredPlayerSessions != null) {
            this.DesiredPlayerSessions = new DesiredPlayerSession[source.DesiredPlayerSessions.length];
            for (int i = 0; i < source.DesiredPlayerSessions.length; i++) {
                this.DesiredPlayerSessions[i] = new DesiredPlayerSession(source.DesiredPlayerSessions[i]);
            }
        }
        if (source.GameProperties != null) {
            this.GameProperties = new GameProperty[source.GameProperties.length];
            for (int i = 0; i < source.GameProperties.length; i++) {
                this.GameProperties[i] = new GameProperty(source.GameProperties[i]);
            }
        }
        if (source.GameServerSessionData != null) {
            this.GameServerSessionData = new String(source.GameServerSessionData);
        }
        if (source.GameServerSessionName != null) {
            this.GameServerSessionName = new String(source.GameServerSessionName);
        }
        if (source.PlayerLatencies != null) {
            this.PlayerLatencies = new PlayerLatency[source.PlayerLatencies.length];
            for (int i = 0; i < source.PlayerLatencies.length; i++) {
                this.PlayerLatencies[i] = new PlayerLatency(source.PlayerLatencies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlacementId", this.PlacementId);
        this.setParamSimple(map, prefix + "GameServerSessionQueueName", this.GameServerSessionQueueName);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamArrayObj(map, prefix + "DesiredPlayerSessions.", this.DesiredPlayerSessions);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "GameServerSessionData", this.GameServerSessionData);
        this.setParamSimple(map, prefix + "GameServerSessionName", this.GameServerSessionName);
        this.setParamArrayObj(map, prefix + "PlayerLatencies.", this.PlayerLatencies);

    }
}

