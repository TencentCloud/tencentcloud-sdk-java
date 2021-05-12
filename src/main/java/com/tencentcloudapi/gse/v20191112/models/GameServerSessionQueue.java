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

public class GameServerSessionQueue extends AbstractModel{

    /**
    * 服务部署组名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务部署组资源
    */
    @SerializedName("GameServerSessionQueueArn")
    @Expose
    private String GameServerSessionQueueArn;

    /**
    * 目的fleet（可为别名）列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destinations")
    @Expose
    private GameServerSessionQueueDestination [] Destinations;

    /**
    * 延迟策略集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayerLatencyPolicies")
    @Expose
    private PlayerLatencyPolicy [] PlayerLatencyPolicies;

    /**
    * 超时时间
    */
    @SerializedName("TimeoutInSeconds")
    @Expose
    private Long TimeoutInSeconds;

    /**
    * 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 服务部署组名字 
     * @return Name 服务部署组名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务部署组名字
     * @param Name 服务部署组名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务部署组资源 
     * @return GameServerSessionQueueArn 服务部署组资源
     */
    public String getGameServerSessionQueueArn() {
        return this.GameServerSessionQueueArn;
    }

    /**
     * Set 服务部署组资源
     * @param GameServerSessionQueueArn 服务部署组资源
     */
    public void setGameServerSessionQueueArn(String GameServerSessionQueueArn) {
        this.GameServerSessionQueueArn = GameServerSessionQueueArn;
    }

    /**
     * Get 目的fleet（可为别名）列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destinations 目的fleet（可为别名）列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GameServerSessionQueueDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set 目的fleet（可为别名）列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destinations 目的fleet（可为别名）列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinations(GameServerSessionQueueDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get 延迟策略集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayerLatencyPolicies 延迟策略集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PlayerLatencyPolicy [] getPlayerLatencyPolicies() {
        return this.PlayerLatencyPolicies;
    }

    /**
     * Set 延迟策略集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayerLatencyPolicies 延迟策略集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayerLatencyPolicies(PlayerLatencyPolicy [] PlayerLatencyPolicies) {
        this.PlayerLatencyPolicies = PlayerLatencyPolicies;
    }

    /**
     * Get 超时时间 
     * @return TimeoutInSeconds 超时时间
     */
    public Long getTimeoutInSeconds() {
        return this.TimeoutInSeconds;
    }

    /**
     * Set 超时时间
     * @param TimeoutInSeconds 超时时间
     */
    public void setTimeoutInSeconds(Long TimeoutInSeconds) {
        this.TimeoutInSeconds = TimeoutInSeconds;
    }

    /**
     * Get 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public GameServerSessionQueue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GameServerSessionQueue(GameServerSessionQueue source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GameServerSessionQueueArn != null) {
            this.GameServerSessionQueueArn = new String(source.GameServerSessionQueueArn);
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
        this.setParamSimple(map, prefix + "GameServerSessionQueueArn", this.GameServerSessionQueueArn);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamArrayObj(map, prefix + "PlayerLatencyPolicies.", this.PlayerLatencyPolicies);
        this.setParamSimple(map, prefix + "TimeoutInSeconds", this.TimeoutInSeconds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

