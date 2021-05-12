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

public class ChangeRoomPlayerProfileRequest extends AbstractModel{

    /**
    * 游戏资源Id。
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 发起修改的玩家Id。
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 需要修改的玩家自定义属性。
    */
    @SerializedName("CustomProfile")
    @Expose
    private String CustomProfile;

    /**
     * Get 游戏资源Id。 
     * @return GameId 游戏资源Id。
     */
    public String getGameId() {
        return this.GameId;
    }

    /**
     * Set 游戏资源Id。
     * @param GameId 游戏资源Id。
     */
    public void setGameId(String GameId) {
        this.GameId = GameId;
    }

    /**
     * Get 发起修改的玩家Id。 
     * @return PlayerId 发起修改的玩家Id。
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 发起修改的玩家Id。
     * @param PlayerId 发起修改的玩家Id。
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 需要修改的玩家自定义属性。 
     * @return CustomProfile 需要修改的玩家自定义属性。
     */
    public String getCustomProfile() {
        return this.CustomProfile;
    }

    /**
     * Set 需要修改的玩家自定义属性。
     * @param CustomProfile 需要修改的玩家自定义属性。
     */
    public void setCustomProfile(String CustomProfile) {
        this.CustomProfile = CustomProfile;
    }

    public ChangeRoomPlayerProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeRoomPlayerProfileRequest(ChangeRoomPlayerProfileRequest source) {
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
        if (source.CustomProfile != null) {
            this.CustomProfile = new String(source.CustomProfile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "CustomProfile", this.CustomProfile);

    }
}

