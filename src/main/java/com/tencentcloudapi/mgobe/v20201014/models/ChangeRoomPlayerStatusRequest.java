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

public class ChangeRoomPlayerStatusRequest extends AbstractModel{

    /**
    * 游戏资源Id。
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 玩家自定义状态。
    */
    @SerializedName("CustomStatus")
    @Expose
    private Long CustomStatus;

    /**
    * 玩家id。
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

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
     * Get 玩家自定义状态。 
     * @return CustomStatus 玩家自定义状态。
     */
    public Long getCustomStatus() {
        return this.CustomStatus;
    }

    /**
     * Set 玩家自定义状态。
     * @param CustomStatus 玩家自定义状态。
     */
    public void setCustomStatus(Long CustomStatus) {
        this.CustomStatus = CustomStatus;
    }

    /**
     * Get 玩家id。 
     * @return PlayerId 玩家id。
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 玩家id。
     * @param PlayerId 玩家id。
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    public ChangeRoomPlayerStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeRoomPlayerStatusRequest(ChangeRoomPlayerStatusRequest source) {
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
        if (source.CustomStatus != null) {
            this.CustomStatus = new Long(source.CustomStatus);
        }
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "CustomStatus", this.CustomStatus);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);

    }
}

