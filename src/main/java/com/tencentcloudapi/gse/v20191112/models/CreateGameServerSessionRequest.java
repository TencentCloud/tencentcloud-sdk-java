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
    * 最大玩家数量，最小值不小于0
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * 别名ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * 创建者ID，最大长度不超过1024个ASCII字符
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 舰队ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 游戏属性，最大长度不超过16组
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * 游戏服务器会话属性详情，最大长度不超过4096个ASCII字符
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * 游戏服务器会话自定义ID，最大长度不超过4096个ASCII字符
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 幂等token，最大长度不超过48个ASCII字符
    */
    @SerializedName("IdempotencyToken")
    @Expose
    private String IdempotencyToken;

    /**
    * 游戏服务器会话名称，最大长度不超过1024个ASCII字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 最大玩家数量，最小值不小于0 
     * @return MaximumPlayerSessionCount 最大玩家数量，最小值不小于0
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set 最大玩家数量，最小值不小于0
     * @param MaximumPlayerSessionCount 最大玩家数量，最小值不小于0
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    /**
     * Get 别名ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID 
     * @return AliasId 别名ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set 别名ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID
     * @param AliasId 别名ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get 创建者ID，最大长度不超过1024个ASCII字符 
     * @return CreatorId 创建者ID，最大长度不超过1024个ASCII字符
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建者ID，最大长度不超过1024个ASCII字符
     * @param CreatorId 创建者ID，最大长度不超过1024个ASCII字符
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get 舰队ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID 
     * @return FleetId 舰队ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 舰队ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID
     * @param FleetId 舰队ID。每个请求需要指定别名ID 或者舰队 ID，如果两个同时指定时，优先选择舰队 ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 游戏属性，最大长度不超过16组 
     * @return GameProperties 游戏属性，最大长度不超过16组
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set 游戏属性，最大长度不超过16组
     * @param GameProperties 游戏属性，最大长度不超过16组
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get 游戏服务器会话属性详情，最大长度不超过4096个ASCII字符 
     * @return GameServerSessionData 游戏服务器会话属性详情，最大长度不超过4096个ASCII字符
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set 游戏服务器会话属性详情，最大长度不超过4096个ASCII字符
     * @param GameServerSessionData 游戏服务器会话属性详情，最大长度不超过4096个ASCII字符
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get 游戏服务器会话自定义ID，最大长度不超过4096个ASCII字符 
     * @return GameServerSessionId 游戏服务器会话自定义ID，最大长度不超过4096个ASCII字符
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set 游戏服务器会话自定义ID，最大长度不超过4096个ASCII字符
     * @param GameServerSessionId 游戏服务器会话自定义ID，最大长度不超过4096个ASCII字符
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get 幂等token，最大长度不超过48个ASCII字符 
     * @return IdempotencyToken 幂等token，最大长度不超过48个ASCII字符
     */
    public String getIdempotencyToken() {
        return this.IdempotencyToken;
    }

    /**
     * Set 幂等token，最大长度不超过48个ASCII字符
     * @param IdempotencyToken 幂等token，最大长度不超过48个ASCII字符
     */
    public void setIdempotencyToken(String IdempotencyToken) {
        this.IdempotencyToken = IdempotencyToken;
    }

    /**
     * Get 游戏服务器会话名称，最大长度不超过1024个ASCII字符 
     * @return Name 游戏服务器会话名称，最大长度不超过1024个ASCII字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 游戏服务器会话名称，最大长度不超过1024个ASCII字符
     * @param Name 游戏服务器会话名称，最大长度不超过1024个ASCII字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CreateGameServerSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGameServerSessionRequest(CreateGameServerSessionRequest source) {
        if (source.MaximumPlayerSessionCount != null) {
            this.MaximumPlayerSessionCount = new Long(source.MaximumPlayerSessionCount);
        }
        if (source.AliasId != null) {
            this.AliasId = new String(source.AliasId);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
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
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.IdempotencyToken != null) {
            this.IdempotencyToken = new String(source.IdempotencyToken);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
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

