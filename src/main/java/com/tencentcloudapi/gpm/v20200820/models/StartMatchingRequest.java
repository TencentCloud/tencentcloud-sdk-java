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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartMatchingRequest extends AbstractModel{

    /**
    * 匹配 Code。
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * 玩家信息 最多 200 条。
    */
    @SerializedName("Players")
    @Expose
    private Player [] Players;

    /**
    * 匹配票据 ID 默认空字符串，为空则由 GPM 自动生成 长度 128，只能包含数字、字母、. 和 -
    */
    @SerializedName("MatchTicketId")
    @Expose
    private String MatchTicketId;

    /**
     * Get 匹配 Code。 
     * @return MatchCode 匹配 Code。
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set 匹配 Code。
     * @param MatchCode 匹配 Code。
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get 玩家信息 最多 200 条。 
     * @return Players 玩家信息 最多 200 条。
     */
    public Player [] getPlayers() {
        return this.Players;
    }

    /**
     * Set 玩家信息 最多 200 条。
     * @param Players 玩家信息 最多 200 条。
     */
    public void setPlayers(Player [] Players) {
        this.Players = Players;
    }

    /**
     * Get 匹配票据 ID 默认空字符串，为空则由 GPM 自动生成 长度 128，只能包含数字、字母、. 和 - 
     * @return MatchTicketId 匹配票据 ID 默认空字符串，为空则由 GPM 自动生成 长度 128，只能包含数字、字母、. 和 -
     */
    public String getMatchTicketId() {
        return this.MatchTicketId;
    }

    /**
     * Set 匹配票据 ID 默认空字符串，为空则由 GPM 自动生成 长度 128，只能包含数字、字母、. 和 -
     * @param MatchTicketId 匹配票据 ID 默认空字符串，为空则由 GPM 自动生成 长度 128，只能包含数字、字母、. 和 -
     */
    public void setMatchTicketId(String MatchTicketId) {
        this.MatchTicketId = MatchTicketId;
    }

    public StartMatchingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartMatchingRequest(StartMatchingRequest source) {
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
        if (source.Players != null) {
            this.Players = new Player[source.Players.length];
            for (int i = 0; i < source.Players.length; i++) {
                this.Players[i] = new Player(source.Players[i]);
            }
        }
        if (source.MatchTicketId != null) {
            this.MatchTicketId = new String(source.MatchTicketId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamArrayObj(map, prefix + "Players.", this.Players);
        this.setParamSimple(map, prefix + "MatchTicketId", this.MatchTicketId);

    }
}

