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

public class StopGameServerSessionPlacementRequest extends AbstractModel{

    /**
    * 游戏服务器会话放置的唯一标识符
    */
    @SerializedName("PlacementId")
    @Expose
    private String PlacementId;

    /**
     * Get 游戏服务器会话放置的唯一标识符 
     * @return PlacementId 游戏服务器会话放置的唯一标识符
     */
    public String getPlacementId() {
        return this.PlacementId;
    }

    /**
     * Set 游戏服务器会话放置的唯一标识符
     * @param PlacementId 游戏服务器会话放置的唯一标识符
     */
    public void setPlacementId(String PlacementId) {
        this.PlacementId = PlacementId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlacementId", this.PlacementId);

    }
}

