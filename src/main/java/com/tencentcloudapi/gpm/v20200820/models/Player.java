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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Player extends AbstractModel{

    /**
    * 玩家 PlayerId 长度 128 [a-zA-Z\d-\._]*
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 玩家昵称，长度 128
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 玩家匹配属性，最多 10 条
    */
    @SerializedName("MatchAttributes")
    @Expose
    private MatchAttribute [] MatchAttributes;

    /**
    * 队伍名，可以传递不同队伍名，长度 128 [a-zA-Z0-9-\.]*
    */
    @SerializedName("Team")
    @Expose
    private String Team;

    /**
    * 自定义玩家状态 透传参数 [0, 99999]
    */
    @SerializedName("CustomPlayerStatus")
    @Expose
    private Long CustomPlayerStatus;

    /**
    * 自定义玩家信息 透传参数 长度 1024
    */
    @SerializedName("CustomProfile")
    @Expose
    private String CustomProfile;

    /**
    * 各区域延迟，最多 20 条
    */
    @SerializedName("RegionLatencies")
    @Expose
    private RegionLatency [] RegionLatencies;

    /**
     * Get 玩家 PlayerId 长度 128 [a-zA-Z\d-\._]* 
     * @return Id 玩家 PlayerId 长度 128 [a-zA-Z\d-\._]*
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 玩家 PlayerId 长度 128 [a-zA-Z\d-\._]*
     * @param Id 玩家 PlayerId 长度 128 [a-zA-Z\d-\._]*
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 玩家昵称，长度 128 
     * @return Name 玩家昵称，长度 128
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 玩家昵称，长度 128
     * @param Name 玩家昵称，长度 128
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 玩家匹配属性，最多 10 条 
     * @return MatchAttributes 玩家匹配属性，最多 10 条
     */
    public MatchAttribute [] getMatchAttributes() {
        return this.MatchAttributes;
    }

    /**
     * Set 玩家匹配属性，最多 10 条
     * @param MatchAttributes 玩家匹配属性，最多 10 条
     */
    public void setMatchAttributes(MatchAttribute [] MatchAttributes) {
        this.MatchAttributes = MatchAttributes;
    }

    /**
     * Get 队伍名，可以传递不同队伍名，长度 128 [a-zA-Z0-9-\.]* 
     * @return Team 队伍名，可以传递不同队伍名，长度 128 [a-zA-Z0-9-\.]*
     */
    public String getTeam() {
        return this.Team;
    }

    /**
     * Set 队伍名，可以传递不同队伍名，长度 128 [a-zA-Z0-9-\.]*
     * @param Team 队伍名，可以传递不同队伍名，长度 128 [a-zA-Z0-9-\.]*
     */
    public void setTeam(String Team) {
        this.Team = Team;
    }

    /**
     * Get 自定义玩家状态 透传参数 [0, 99999] 
     * @return CustomPlayerStatus 自定义玩家状态 透传参数 [0, 99999]
     */
    public Long getCustomPlayerStatus() {
        return this.CustomPlayerStatus;
    }

    /**
     * Set 自定义玩家状态 透传参数 [0, 99999]
     * @param CustomPlayerStatus 自定义玩家状态 透传参数 [0, 99999]
     */
    public void setCustomPlayerStatus(Long CustomPlayerStatus) {
        this.CustomPlayerStatus = CustomPlayerStatus;
    }

    /**
     * Get 自定义玩家信息 透传参数 长度 1024 
     * @return CustomProfile 自定义玩家信息 透传参数 长度 1024
     */
    public String getCustomProfile() {
        return this.CustomProfile;
    }

    /**
     * Set 自定义玩家信息 透传参数 长度 1024
     * @param CustomProfile 自定义玩家信息 透传参数 长度 1024
     */
    public void setCustomProfile(String CustomProfile) {
        this.CustomProfile = CustomProfile;
    }

    /**
     * Get 各区域延迟，最多 20 条 
     * @return RegionLatencies 各区域延迟，最多 20 条
     */
    public RegionLatency [] getRegionLatencies() {
        return this.RegionLatencies;
    }

    /**
     * Set 各区域延迟，最多 20 条
     * @param RegionLatencies 各区域延迟，最多 20 条
     */
    public void setRegionLatencies(RegionLatency [] RegionLatencies) {
        this.RegionLatencies = RegionLatencies;
    }

    public Player() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Player(Player source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MatchAttributes != null) {
            this.MatchAttributes = new MatchAttribute[source.MatchAttributes.length];
            for (int i = 0; i < source.MatchAttributes.length; i++) {
                this.MatchAttributes[i] = new MatchAttribute(source.MatchAttributes[i]);
            }
        }
        if (source.Team != null) {
            this.Team = new String(source.Team);
        }
        if (source.CustomPlayerStatus != null) {
            this.CustomPlayerStatus = new Long(source.CustomPlayerStatus);
        }
        if (source.CustomProfile != null) {
            this.CustomProfile = new String(source.CustomProfile);
        }
        if (source.RegionLatencies != null) {
            this.RegionLatencies = new RegionLatency[source.RegionLatencies.length];
            for (int i = 0; i < source.RegionLatencies.length; i++) {
                this.RegionLatencies[i] = new RegionLatency(source.RegionLatencies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "MatchAttributes.", this.MatchAttributes);
        this.setParamSimple(map, prefix + "Team", this.Team);
        this.setParamSimple(map, prefix + "CustomPlayerStatus", this.CustomPlayerStatus);
        this.setParamSimple(map, prefix + "CustomProfile", this.CustomProfile);
        this.setParamArrayObj(map, prefix + "RegionLatencies.", this.RegionLatencies);

    }
}

