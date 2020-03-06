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

public class DescribePlayerSessionsRequest extends AbstractModel{

    /**
    * 游戏服务器会话ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 单次查询记录数上限
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页偏移，用于查询下一页
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 玩家ID
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
    * 玩家会话状态（RESERVED,ACTIVE,COMPLETED,TIMEDOUT）
    */
    @SerializedName("PlayerSessionStatusFilter")
    @Expose
    private String PlayerSessionStatusFilter;

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
     * Get 单次查询记录数上限 
     * @return Limit 单次查询记录数上限
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次查询记录数上限
     * @param Limit 单次查询记录数上限
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页偏移，用于查询下一页 
     * @return NextToken 页偏移，用于查询下一页
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 页偏移，用于查询下一页
     * @param NextToken 页偏移，用于查询下一页
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
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
     * Get 玩家会话状态（RESERVED,ACTIVE,COMPLETED,TIMEDOUT） 
     * @return PlayerSessionStatusFilter 玩家会话状态（RESERVED,ACTIVE,COMPLETED,TIMEDOUT）
     */
    public String getPlayerSessionStatusFilter() {
        return this.PlayerSessionStatusFilter;
    }

    /**
     * Set 玩家会话状态（RESERVED,ACTIVE,COMPLETED,TIMEDOUT）
     * @param PlayerSessionStatusFilter 玩家会话状态（RESERVED,ACTIVE,COMPLETED,TIMEDOUT）
     */
    public void setPlayerSessionStatusFilter(String PlayerSessionStatusFilter) {
        this.PlayerSessionStatusFilter = PlayerSessionStatusFilter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerSessionId", this.PlayerSessionId);
        this.setParamSimple(map, prefix + "PlayerSessionStatusFilter", this.PlayerSessionStatusFilter);

    }
}

