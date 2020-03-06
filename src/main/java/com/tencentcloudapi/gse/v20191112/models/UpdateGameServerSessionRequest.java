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

public class UpdateGameServerSessionRequest extends AbstractModel{

    /**
    * 游戏服务器会话ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 最大玩家数量
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * 游戏服务器会话名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 玩家会话创建策略（ACCEPT_ALL,DENY_ALL）
    */
    @SerializedName("PlayerSessionCreationPolicy")
    @Expose
    private String PlayerSessionCreationPolicy;

    /**
    * 保护策略(NoProtection,TimeLimitProtection,FullProtection)
    */
    @SerializedName("ProtectionPolicy")
    @Expose
    private String ProtectionPolicy;

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
     * Get 玩家会话创建策略（ACCEPT_ALL,DENY_ALL） 
     * @return PlayerSessionCreationPolicy 玩家会话创建策略（ACCEPT_ALL,DENY_ALL）
     */
    public String getPlayerSessionCreationPolicy() {
        return this.PlayerSessionCreationPolicy;
    }

    /**
     * Set 玩家会话创建策略（ACCEPT_ALL,DENY_ALL）
     * @param PlayerSessionCreationPolicy 玩家会话创建策略（ACCEPT_ALL,DENY_ALL）
     */
    public void setPlayerSessionCreationPolicy(String PlayerSessionCreationPolicy) {
        this.PlayerSessionCreationPolicy = PlayerSessionCreationPolicy;
    }

    /**
     * Get 保护策略(NoProtection,TimeLimitProtection,FullProtection) 
     * @return ProtectionPolicy 保护策略(NoProtection,TimeLimitProtection,FullProtection)
     */
    public String getProtectionPolicy() {
        return this.ProtectionPolicy;
    }

    /**
     * Set 保护策略(NoProtection,TimeLimitProtection,FullProtection)
     * @param ProtectionPolicy 保护策略(NoProtection,TimeLimitProtection,FullProtection)
     */
    public void setProtectionPolicy(String ProtectionPolicy) {
        this.ProtectionPolicy = ProtectionPolicy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PlayerSessionCreationPolicy", this.PlayerSessionCreationPolicy);
        this.setParamSimple(map, prefix + "ProtectionPolicy", this.ProtectionPolicy);

    }
}

