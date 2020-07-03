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

public class JoinGameServerSessionRequest extends AbstractModel{

    /**
    * 游戏服务器会话ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 玩家ID
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 玩家自定义信息
    */
    @SerializedName("PlayerData")
    @Expose
    private String PlayerData;

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
     * Get 玩家ID 
     * @return PlayerId 玩家ID
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 玩家ID
     * @param PlayerId 玩家ID
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 玩家自定义信息 
     * @return PlayerData 玩家自定义信息
     */
    public String getPlayerData() {
        return this.PlayerData;
    }

    /**
     * Set 玩家自定义信息
     * @param PlayerData 玩家自定义信息
     */
    public void setPlayerData(String PlayerData) {
        this.PlayerData = PlayerData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerData", this.PlayerData);

    }
}

