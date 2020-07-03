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

public class CreateGameServerSessionRequest extends AbstractModel{

    /**
    * 最大玩家数量
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * 别名ID
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * 创建者ID
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 游戏属性
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * 游戏服务器会话属性详情
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * 游戏服务器会话自定义ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 幂等token
    */
    @SerializedName("IdempotencyToken")
    @Expose
    private String IdempotencyToken;

    /**
    * 游戏服务器会话名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
     * Get 别名ID 
     * @return AliasId 别名ID
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set 别名ID
     * @param AliasId 别名ID
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get 创建者ID 
     * @return CreatorId 创建者ID
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建者ID
     * @param CreatorId 创建者ID
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
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
     * @return GameProperties 游戏属性
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set 游戏属性
     * @param GameProperties 游戏属性
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get 游戏服务器会话属性详情 
     * @return GameServerSessionData 游戏服务器会话属性详情
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set 游戏服务器会话属性详情
     * @param GameServerSessionData 游戏服务器会话属性详情
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get 游戏服务器会话自定义ID 
     * @return GameServerSessionId 游戏服务器会话自定义ID
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set 游戏服务器会话自定义ID
     * @param GameServerSessionId 游戏服务器会话自定义ID
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get 幂等token 
     * @return IdempotencyToken 幂等token
     */
    public String getIdempotencyToken() {
        return this.IdempotencyToken;
    }

    /**
     * Set 幂等token
     * @param IdempotencyToken 幂等token
     */
    public void setIdempotencyToken(String IdempotencyToken) {
        this.IdempotencyToken = IdempotencyToken;
    }

    /**
     * Get 游戏服务器会话名称 
     * @return Name 游戏服务器会话名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 游戏服务器会话名称
     * @param Name 游戏服务器会话名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "GameServerSessionData", this.GameServerSessionData);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "IdempotencyToken", this.IdempotencyToken);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

