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

public class JoinGameServerSessionBatchRequest extends AbstractModel{

    /**
    * 游戏服务器会话ID，最小长度1个ASCII字符，最大长度不超过256个ASCII字符
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 玩家ID列表，最小1组，最大25组
    */
    @SerializedName("PlayerIds")
    @Expose
    private String [] PlayerIds;

    /**
    * 玩家自定义数据
    */
    @SerializedName("PlayerDataMap")
    @Expose
    private PlayerDataMap PlayerDataMap;

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
     * Get 玩家ID列表，最小1组，最大25组 
     * @return PlayerIds 玩家ID列表，最小1组，最大25组
     */
    public String [] getPlayerIds() {
        return this.PlayerIds;
    }

    /**
     * Set 玩家ID列表，最小1组，最大25组
     * @param PlayerIds 玩家ID列表，最小1组，最大25组
     */
    public void setPlayerIds(String [] PlayerIds) {
        this.PlayerIds = PlayerIds;
    }

    /**
     * Get 玩家自定义数据 
     * @return PlayerDataMap 玩家自定义数据
     */
    public PlayerDataMap getPlayerDataMap() {
        return this.PlayerDataMap;
    }

    /**
     * Set 玩家自定义数据
     * @param PlayerDataMap 玩家自定义数据
     */
    public void setPlayerDataMap(PlayerDataMap PlayerDataMap) {
        this.PlayerDataMap = PlayerDataMap;
    }

    public JoinGameServerSessionBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinGameServerSessionBatchRequest(JoinGameServerSessionBatchRequest source) {
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.PlayerIds != null) {
            this.PlayerIds = new String[source.PlayerIds.length];
            for (int i = 0; i < source.PlayerIds.length; i++) {
                this.PlayerIds[i] = new String(source.PlayerIds[i]);
            }
        }
        if (source.PlayerDataMap != null) {
            this.PlayerDataMap = new PlayerDataMap(source.PlayerDataMap);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamArraySimple(map, prefix + "PlayerIds.", this.PlayerIds);
        this.setParamObj(map, prefix + "PlayerDataMap.", this.PlayerDataMap);

    }
}

