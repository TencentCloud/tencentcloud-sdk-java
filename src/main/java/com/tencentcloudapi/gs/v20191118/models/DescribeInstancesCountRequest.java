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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesCountRequest extends AbstractModel {

    /**
    * 游戏ID
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 实例分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 游戏区域
    */
    @SerializedName("GameRegion")
    @Expose
    private String GameRegion;

    /**
    * 游戏类型。
MOBILE：手游
PC：默认值，端游
    */
    @SerializedName("GameType")
    @Expose
    private String GameType;

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

    /**
     * Get 实例分组ID 
     * @return GroupId 实例分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 实例分组ID
     * @param GroupId 实例分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 游戏区域 
     * @return GameRegion 游戏区域
     */
    public String getGameRegion() {
        return this.GameRegion;
    }

    /**
     * Set 游戏区域
     * @param GameRegion 游戏区域
     */
    public void setGameRegion(String GameRegion) {
        this.GameRegion = GameRegion;
    }

    /**
     * Get 游戏类型。
MOBILE：手游
PC：默认值，端游 
     * @return GameType 游戏类型。
MOBILE：手游
PC：默认值，端游
     */
    public String getGameType() {
        return this.GameType;
    }

    /**
     * Set 游戏类型。
MOBILE：手游
PC：默认值，端游
     * @param GameType 游戏类型。
MOBILE：手游
PC：默认值，端游
     */
    public void setGameType(String GameType) {
        this.GameType = GameType;
    }

    public DescribeInstancesCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesCountRequest(DescribeInstancesCountRequest source) {
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GameRegion != null) {
            this.GameRegion = new String(source.GameRegion);
        }
        if (source.GameType != null) {
            this.GameType = new String(source.GameType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GameRegion", this.GameRegion);
        this.setParamSimple(map, prefix + "GameType", this.GameType);

    }
}

