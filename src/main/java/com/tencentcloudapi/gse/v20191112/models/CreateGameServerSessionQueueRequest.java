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

public class CreateGameServerSessionQueueRequest extends AbstractModel{

    /**
    * 游戏服务器会话队列名称，长度1~128
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 目的服务器舰队（可为别名）列表
    */
    @SerializedName("Destinations")
    @Expose
    private GameServerSessionQueueDestination [] Destinations;

    /**
    * 延迟策略集合
    */
    @SerializedName("PlayerLatencyPolicies")
    @Expose
    private PlayerLatencyPolicy [] PlayerLatencyPolicies;

    /**
    * 超时时间（单位秒，默认值为600秒）
    */
    @SerializedName("TimeoutInSeconds")
    @Expose
    private Long TimeoutInSeconds;

    /**
    * 标签列表，最大长度50组
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 游戏服务器会话队列名称，长度1~128 
     * @return Name 游戏服务器会话队列名称，长度1~128
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 游戏服务器会话队列名称，长度1~128
     * @param Name 游戏服务器会话队列名称，长度1~128
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 目的服务器舰队（可为别名）列表 
     * @return Destinations 目的服务器舰队（可为别名）列表
     */
    public GameServerSessionQueueDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set 目的服务器舰队（可为别名）列表
     * @param Destinations 目的服务器舰队（可为别名）列表
     */
    public void setDestinations(GameServerSessionQueueDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get 延迟策略集合 
     * @return PlayerLatencyPolicies 延迟策略集合
     */
    public PlayerLatencyPolicy [] getPlayerLatencyPolicies() {
        return this.PlayerLatencyPolicies;
    }

    /**
     * Set 延迟策略集合
     * @param PlayerLatencyPolicies 延迟策略集合
     */
    public void setPlayerLatencyPolicies(PlayerLatencyPolicy [] PlayerLatencyPolicies) {
        this.PlayerLatencyPolicies = PlayerLatencyPolicies;
    }

    /**
     * Get 超时时间（单位秒，默认值为600秒） 
     * @return TimeoutInSeconds 超时时间（单位秒，默认值为600秒）
     */
    public Long getTimeoutInSeconds() {
        return this.TimeoutInSeconds;
    }

    /**
     * Set 超时时间（单位秒，默认值为600秒）
     * @param TimeoutInSeconds 超时时间（单位秒，默认值为600秒）
     */
    public void setTimeoutInSeconds(Long TimeoutInSeconds) {
        this.TimeoutInSeconds = TimeoutInSeconds;
    }

    /**
     * Get 标签列表，最大长度50组 
     * @return Tags 标签列表，最大长度50组
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表，最大长度50组
     * @param Tags 标签列表，最大长度50组
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateGameServerSessionQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGameServerSessionQueueRequest(CreateGameServerSessionQueueRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Destinations != null) {
            this.Destinations = new GameServerSessionQueueDestination[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new GameServerSessionQueueDestination(source.Destinations[i]);
            }
        }
        if (source.PlayerLatencyPolicies != null) {
            this.PlayerLatencyPolicies = new PlayerLatencyPolicy[source.PlayerLatencyPolicies.length];
            for (int i = 0; i < source.PlayerLatencyPolicies.length; i++) {
                this.PlayerLatencyPolicies[i] = new PlayerLatencyPolicy(source.PlayerLatencyPolicies[i]);
            }
        }
        if (source.TimeoutInSeconds != null) {
            this.TimeoutInSeconds = new Long(source.TimeoutInSeconds);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamArrayObj(map, prefix + "PlayerLatencyPolicies.", this.PlayerLatencyPolicies);
        this.setParamSimple(map, prefix + "TimeoutInSeconds", this.TimeoutInSeconds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

