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

public class DismissRoomRequest extends AbstractModel{

    /**
    * 表示游戏资源唯一 ID, 由后台自动分配, 无法修改。
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 表示游戏房间唯一ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get 表示游戏资源唯一 ID, 由后台自动分配, 无法修改。 
     * @return GameId 表示游戏资源唯一 ID, 由后台自动分配, 无法修改。
     */
    public String getGameId() {
        return this.GameId;
    }

    /**
     * Set 表示游戏资源唯一 ID, 由后台自动分配, 无法修改。
     * @param GameId 表示游戏资源唯一 ID, 由后台自动分配, 无法修改。
     */
    public void setGameId(String GameId) {
        this.GameId = GameId;
    }

    /**
     * Get 表示游戏房间唯一ID。 
     * @return RoomId 表示游戏房间唯一ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 表示游戏房间唯一ID。
     * @param RoomId 表示游戏房间唯一ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

