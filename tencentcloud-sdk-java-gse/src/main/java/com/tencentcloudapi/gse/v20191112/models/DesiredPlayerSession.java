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

public class DesiredPlayerSession extends AbstractModel{

    /**
    * 与玩家会话关联的唯一玩家标识
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 开发人员定义的玩家数据
    */
    @SerializedName("PlayerData")
    @Expose
    private String PlayerData;

    /**
     * Get 与玩家会话关联的唯一玩家标识 
     * @return PlayerId 与玩家会话关联的唯一玩家标识
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 与玩家会话关联的唯一玩家标识
     * @param PlayerId 与玩家会话关联的唯一玩家标识
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 开发人员定义的玩家数据 
     * @return PlayerData 开发人员定义的玩家数据
     */
    public String getPlayerData() {
        return this.PlayerData;
    }

    /**
     * Set 开发人员定义的玩家数据
     * @param PlayerData 开发人员定义的玩家数据
     */
    public void setPlayerData(String PlayerData) {
        this.PlayerData = PlayerData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerData", this.PlayerData);

    }
}

