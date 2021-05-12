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
package com.tencentcloudapi.mgobe.v20201014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Player extends AbstractModel{

    /**
    * 玩家 OpenId。最长不超过64个字符。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 玩家昵称。最长不超过32个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 队伍 ID。最长不超过16个字符。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * 是否为机器人。
    */
    @SerializedName("IsRobot")
    @Expose
    private Boolean IsRobot;

    /**
    * 玩家 PlayerId。出参使用，由后端返回。
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 自定义玩家状态。非负数，最大不超过4294967295。默认为0。
    */
    @SerializedName("CustomPlayerStatus")
    @Expose
    private Long CustomPlayerStatus;

    /**
    * 自定义玩家属性。最长不超过256个字符。默认为空字符串。
    */
    @SerializedName("CustomProfile")
    @Expose
    private String CustomProfile;

    /**
     * Get 玩家 OpenId。最长不超过64个字符。 
     * @return OpenId 玩家 OpenId。最长不超过64个字符。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 玩家 OpenId。最长不超过64个字符。
     * @param OpenId 玩家 OpenId。最长不超过64个字符。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 玩家昵称。最长不超过32个字符。 
     * @return Name 玩家昵称。最长不超过32个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 玩家昵称。最长不超过32个字符。
     * @param Name 玩家昵称。最长不超过32个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 队伍 ID。最长不超过16个字符。 
     * @return TeamId 队伍 ID。最长不超过16个字符。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 队伍 ID。最长不超过16个字符。
     * @param TeamId 队伍 ID。最长不超过16个字符。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get 是否为机器人。 
     * @return IsRobot 是否为机器人。
     */
    public Boolean getIsRobot() {
        return this.IsRobot;
    }

    /**
     * Set 是否为机器人。
     * @param IsRobot 是否为机器人。
     */
    public void setIsRobot(Boolean IsRobot) {
        this.IsRobot = IsRobot;
    }

    /**
     * Get 玩家 PlayerId。出参使用，由后端返回。 
     * @return PlayerId 玩家 PlayerId。出参使用，由后端返回。
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 玩家 PlayerId。出参使用，由后端返回。
     * @param PlayerId 玩家 PlayerId。出参使用，由后端返回。
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 自定义玩家状态。非负数，最大不超过4294967295。默认为0。 
     * @return CustomPlayerStatus 自定义玩家状态。非负数，最大不超过4294967295。默认为0。
     */
    public Long getCustomPlayerStatus() {
        return this.CustomPlayerStatus;
    }

    /**
     * Set 自定义玩家状态。非负数，最大不超过4294967295。默认为0。
     * @param CustomPlayerStatus 自定义玩家状态。非负数，最大不超过4294967295。默认为0。
     */
    public void setCustomPlayerStatus(Long CustomPlayerStatus) {
        this.CustomPlayerStatus = CustomPlayerStatus;
    }

    /**
     * Get 自定义玩家属性。最长不超过256个字符。默认为空字符串。 
     * @return CustomProfile 自定义玩家属性。最长不超过256个字符。默认为空字符串。
     */
    public String getCustomProfile() {
        return this.CustomProfile;
    }

    /**
     * Set 自定义玩家属性。最长不超过256个字符。默认为空字符串。
     * @param CustomProfile 自定义玩家属性。最长不超过256个字符。默认为空字符串。
     */
    public void setCustomProfile(String CustomProfile) {
        this.CustomProfile = CustomProfile;
    }

    public Player() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Player(Player source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.IsRobot != null) {
            this.IsRobot = new Boolean(source.IsRobot);
        }
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
        if (source.CustomPlayerStatus != null) {
            this.CustomPlayerStatus = new Long(source.CustomPlayerStatus);
        }
        if (source.CustomProfile != null) {
            this.CustomProfile = new String(source.CustomProfile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "IsRobot", this.IsRobot);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "CustomPlayerStatus", this.CustomPlayerStatus);
        this.setParamSimple(map, prefix + "CustomProfile", this.CustomProfile);

    }
}

