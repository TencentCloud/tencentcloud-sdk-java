/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlacedPlayerSession extends AbstractModel {

    /**
    * 玩家Id
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 玩家会话Id
    */
    @SerializedName("PlayerSessionId")
    @Expose
    private String PlayerSessionId;

    /**
     * Get 玩家Id 
     * @return PlayerId 玩家Id
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 玩家Id
     * @param PlayerId 玩家Id
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 玩家会话Id 
     * @return PlayerSessionId 玩家会话Id
     */
    public String getPlayerSessionId() {
        return this.PlayerSessionId;
    }

    /**
     * Set 玩家会话Id
     * @param PlayerSessionId 玩家会话Id
     */
    public void setPlayerSessionId(String PlayerSessionId) {
        this.PlayerSessionId = PlayerSessionId;
    }

    public PlacedPlayerSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlacedPlayerSession(PlacedPlayerSession source) {
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
        if (source.PlayerSessionId != null) {
            this.PlayerSessionId = new String(source.PlayerSessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerSessionId", this.PlayerSessionId);

    }
}

