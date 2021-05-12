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

public class DescribePlayerRequest extends AbstractModel{

    /**
    * 游戏资源Id。
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 玩家OpenId。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 玩家PlayerId，由后台分配，当OpenId不传的时候，PlayerId必传，传入PlayerId可以查询当前PlayerId的玩家信息，当OpenId传入的时候，PlayerId可不传，按照OpenId查询玩家信息。
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
     * Get 玩家OpenId。 
     * @return OpenId 玩家OpenId。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 玩家OpenId。
     * @param OpenId 玩家OpenId。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 玩家PlayerId，由后台分配，当OpenId不传的时候，PlayerId必传，传入PlayerId可以查询当前PlayerId的玩家信息，当OpenId传入的时候，PlayerId可不传，按照OpenId查询玩家信息。 
     * @return PlayerId 玩家PlayerId，由后台分配，当OpenId不传的时候，PlayerId必传，传入PlayerId可以查询当前PlayerId的玩家信息，当OpenId传入的时候，PlayerId可不传，按照OpenId查询玩家信息。
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 玩家PlayerId，由后台分配，当OpenId不传的时候，PlayerId必传，传入PlayerId可以查询当前PlayerId的玩家信息，当OpenId传入的时候，PlayerId可不传，按照OpenId查询玩家信息。
     * @param PlayerId 玩家PlayerId，由后台分配，当OpenId不传的时候，PlayerId必传，传入PlayerId可以查询当前PlayerId的玩家信息，当OpenId传入的时候，PlayerId可不传，按照OpenId查询玩家信息。
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    public DescribePlayerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlayerRequest(DescribePlayerRequest source) {
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
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
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);

    }
}

