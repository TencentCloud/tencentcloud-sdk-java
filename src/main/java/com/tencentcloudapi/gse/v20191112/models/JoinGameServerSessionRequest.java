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
    * 游戏服务器会话ID，最小长度1个ASCII字符，最大长度不超过256个ASCII字符
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 玩家ID，最大长度1024个ASCII字符
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 玩家自定义数据，最大长度2048个ASCII字符
    */
    @SerializedName("PlayerData")
    @Expose
    private String PlayerData;

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
     * Get 玩家ID，最大长度1024个ASCII字符 
     * @return PlayerId 玩家ID，最大长度1024个ASCII字符
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 玩家ID，最大长度1024个ASCII字符
     * @param PlayerId 玩家ID，最大长度1024个ASCII字符
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 玩家自定义数据，最大长度2048个ASCII字符 
     * @return PlayerData 玩家自定义数据，最大长度2048个ASCII字符
     */
    public String getPlayerData() {
        return this.PlayerData;
    }

    /**
     * Set 玩家自定义数据，最大长度2048个ASCII字符
     * @param PlayerData 玩家自定义数据，最大长度2048个ASCII字符
     */
    public void setPlayerData(String PlayerData) {
        this.PlayerData = PlayerData;
    }

    public JoinGameServerSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinGameServerSessionRequest(JoinGameServerSessionRequest source) {
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
        if (source.PlayerData != null) {
            this.PlayerData = new String(source.PlayerData);
        }
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

