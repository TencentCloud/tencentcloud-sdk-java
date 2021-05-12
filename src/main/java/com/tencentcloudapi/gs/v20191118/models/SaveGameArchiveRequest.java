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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveGameArchiveRequest extends AbstractModel{

    /**
    * 游戏用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 游戏ID
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
     * Get 游戏用户ID 
     * @return UserId 游戏用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 游戏用户ID
     * @param UserId 游戏用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 游戏ID 
     * @return GameId 游戏ID
     */
    public String getGameId() {
        return this.GameId;
    }

    /**
     * Set 游戏ID
     * @param GameId 游戏ID
     */
    public void setGameId(String GameId) {
        this.GameId = GameId;
    }

    public SaveGameArchiveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveGameArchiveRequest(SaveGameArchiveRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "GameId", this.GameId);

    }
}

