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
    * 游戏服务器会话ID，最小长度1个ASCII字符，最大长度不超过256个ASCII字符
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 最大玩家数量，最小值不小于0
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * 游戏服务器会话名称，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 玩家会话创建策略，包括允许所有玩家加入和禁止所有玩家加入（ACCEPT_ALL,DENY_ALL）
    */
    @SerializedName("PlayerSessionCreationPolicy")
    @Expose
    private String PlayerSessionCreationPolicy;

    /**
    * 保护策略，包括不保护、时限保护和完全保护(NoProtection,TimeLimitProtection,FullProtection)
    */
    @SerializedName("ProtectionPolicy")
    @Expose
    private String ProtectionPolicy;

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
     * Get 游戏服务器会话名称，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符 
     * @return Name 游戏服务器会话名称，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 游戏服务器会话名称，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
     * @param Name 游戏服务器会话名称，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 玩家会话创建策略，包括允许所有玩家加入和禁止所有玩家加入（ACCEPT_ALL,DENY_ALL） 
     * @return PlayerSessionCreationPolicy 玩家会话创建策略，包括允许所有玩家加入和禁止所有玩家加入（ACCEPT_ALL,DENY_ALL）
     */
    public String getPlayerSessionCreationPolicy() {
        return this.PlayerSessionCreationPolicy;
    }

    /**
     * Set 玩家会话创建策略，包括允许所有玩家加入和禁止所有玩家加入（ACCEPT_ALL,DENY_ALL）
     * @param PlayerSessionCreationPolicy 玩家会话创建策略，包括允许所有玩家加入和禁止所有玩家加入（ACCEPT_ALL,DENY_ALL）
     */
    public void setPlayerSessionCreationPolicy(String PlayerSessionCreationPolicy) {
        this.PlayerSessionCreationPolicy = PlayerSessionCreationPolicy;
    }

    /**
     * Get 保护策略，包括不保护、时限保护和完全保护(NoProtection,TimeLimitProtection,FullProtection) 
     * @return ProtectionPolicy 保护策略，包括不保护、时限保护和完全保护(NoProtection,TimeLimitProtection,FullProtection)
     */
    public String getProtectionPolicy() {
        return this.ProtectionPolicy;
    }

    /**
     * Set 保护策略，包括不保护、时限保护和完全保护(NoProtection,TimeLimitProtection,FullProtection)
     * @param ProtectionPolicy 保护策略，包括不保护、时限保护和完全保护(NoProtection,TimeLimitProtection,FullProtection)
     */
    public void setProtectionPolicy(String ProtectionPolicy) {
        this.ProtectionPolicy = ProtectionPolicy;
    }

    public UpdateGameServerSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGameServerSessionRequest(UpdateGameServerSessionRequest source) {
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.MaximumPlayerSessionCount != null) {
            this.MaximumPlayerSessionCount = new Long(source.MaximumPlayerSessionCount);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PlayerSessionCreationPolicy != null) {
            this.PlayerSessionCreationPolicy = new String(source.PlayerSessionCreationPolicy);
        }
        if (source.ProtectionPolicy != null) {
            this.ProtectionPolicy = new String(source.ProtectionPolicy);
        }
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

