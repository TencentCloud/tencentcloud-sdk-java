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

public class UpdateFleetAttributesRequest extends AbstractModel{

    /**
    * 服务器舰队 Id
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 服务器舰队描述，最小长度0，最大长度100
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 服务器舰队名称，最小长度1，最大长度50
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection
    */
    @SerializedName("NewGameSessionProtectionPolicy")
    @Expose
    private String NewGameSessionProtectionPolicy;

    /**
    * 资源创建限制策略
    */
    @SerializedName("ResourceCreationLimitPolicy")
    @Expose
    private ResourceCreationLimitPolicy ResourceCreationLimitPolicy;

    /**
    * 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效
    */
    @SerializedName("GameServerSessionProtectionTimeLimit")
    @Expose
    private Long GameServerSessionProtectionTimeLimit;

    /**
     * Get 服务器舰队 Id 
     * @return FleetId 服务器舰队 Id
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队 Id
     * @param FleetId 服务器舰队 Id
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 服务器舰队描述，最小长度0，最大长度100 
     * @return Description 服务器舰队描述，最小长度0，最大长度100
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 服务器舰队描述，最小长度0，最大长度100
     * @param Description 服务器舰队描述，最小长度0，最大长度100
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 服务器舰队名称，最小长度1，最大长度50 
     * @return Name 服务器舰队名称，最小长度1，最大长度50
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务器舰队名称，最小长度1，最大长度50
     * @param Name 服务器舰队名称，最小长度1，最大长度50
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection 
     * @return NewGameSessionProtectionPolicy 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection
     */
    public String getNewGameSessionProtectionPolicy() {
        return this.NewGameSessionProtectionPolicy;
    }

    /**
     * Set 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection
     * @param NewGameSessionProtectionPolicy 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection
     */
    public void setNewGameSessionProtectionPolicy(String NewGameSessionProtectionPolicy) {
        this.NewGameSessionProtectionPolicy = NewGameSessionProtectionPolicy;
    }

    /**
     * Get 资源创建限制策略 
     * @return ResourceCreationLimitPolicy 资源创建限制策略
     */
    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.ResourceCreationLimitPolicy;
    }

    /**
     * Set 资源创建限制策略
     * @param ResourceCreationLimitPolicy 资源创建限制策略
     */
    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy ResourceCreationLimitPolicy) {
        this.ResourceCreationLimitPolicy = ResourceCreationLimitPolicy;
    }

    /**
     * Get 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效 
     * @return GameServerSessionProtectionTimeLimit 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效
     */
    public Long getGameServerSessionProtectionTimeLimit() {
        return this.GameServerSessionProtectionTimeLimit;
    }

    /**
     * Set 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效
     * @param GameServerSessionProtectionTimeLimit 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效
     */
    public void setGameServerSessionProtectionTimeLimit(Long GameServerSessionProtectionTimeLimit) {
        this.GameServerSessionProtectionTimeLimit = GameServerSessionProtectionTimeLimit;
    }

    public UpdateFleetAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFleetAttributesRequest(UpdateFleetAttributesRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NewGameSessionProtectionPolicy != null) {
            this.NewGameSessionProtectionPolicy = new String(source.NewGameSessionProtectionPolicy);
        }
        if (source.ResourceCreationLimitPolicy != null) {
            this.ResourceCreationLimitPolicy = new ResourceCreationLimitPolicy(source.ResourceCreationLimitPolicy);
        }
        if (source.GameServerSessionProtectionTimeLimit != null) {
            this.GameServerSessionProtectionTimeLimit = new Long(source.GameServerSessionProtectionTimeLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NewGameSessionProtectionPolicy", this.NewGameSessionProtectionPolicy);
        this.setParamObj(map, prefix + "ResourceCreationLimitPolicy.", this.ResourceCreationLimitPolicy);
        this.setParamSimple(map, prefix + "GameServerSessionProtectionTimeLimit", this.GameServerSessionProtectionTimeLimit);

    }
}

