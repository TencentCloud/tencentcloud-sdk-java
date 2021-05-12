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

public class RemoveRoomPlayerRequest extends AbstractModel{

    /**
    * 游戏资源Id。
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 被踢出房间的玩家Id。
    */
    @SerializedName("RemovePlayerId")
    @Expose
    private String RemovePlayerId;

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
     * Get 被踢出房间的玩家Id。 
     * @return RemovePlayerId 被踢出房间的玩家Id。
     */
    public String getRemovePlayerId() {
        return this.RemovePlayerId;
    }

    /**
     * Set 被踢出房间的玩家Id。
     * @param RemovePlayerId 被踢出房间的玩家Id。
     */
    public void setRemovePlayerId(String RemovePlayerId) {
        this.RemovePlayerId = RemovePlayerId;
    }

    public RemoveRoomPlayerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveRoomPlayerRequest(RemoveRoomPlayerRequest source) {
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
        if (source.RemovePlayerId != null) {
            this.RemovePlayerId = new String(source.RemovePlayerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "RemovePlayerId", this.RemovePlayerId);

    }
}

