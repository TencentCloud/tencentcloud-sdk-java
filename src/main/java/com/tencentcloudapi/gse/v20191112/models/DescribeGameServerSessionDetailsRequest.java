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

public class DescribeGameServerSessionDetailsRequest extends AbstractModel {

    /**
    * 别名ID
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * 舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 游戏服务器会话ID，最小长度不小于1个ASCII字符，最大长度不超过48个ASCII字符
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * 单次查询记录数上限
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页偏移，用于查询下一页，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 游戏服务器会话状态(ACTIVE,ACTIVATING,TERMINATED,TERMINATING,ERROR)
    */
    @SerializedName("StatusFilter")
    @Expose
    private String StatusFilter;

    /**
     * Get 别名ID 
     * @return AliasId 别名ID
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set 别名ID
     * @param AliasId 别名ID
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get 舰队ID 
     * @return FleetId 舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 舰队ID
     * @param FleetId 舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 游戏服务器会话ID，最小长度不小于1个ASCII字符，最大长度不超过48个ASCII字符 
     * @return GameServerSessionId 游戏服务器会话ID，最小长度不小于1个ASCII字符，最大长度不超过48个ASCII字符
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set 游戏服务器会话ID，最小长度不小于1个ASCII字符，最大长度不超过48个ASCII字符
     * @param GameServerSessionId 游戏服务器会话ID，最小长度不小于1个ASCII字符，最大长度不超过48个ASCII字符
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get 单次查询记录数上限 
     * @return Limit 单次查询记录数上限
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次查询记录数上限
     * @param Limit 单次查询记录数上限
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页偏移，用于查询下一页，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符 
     * @return NextToken 页偏移，用于查询下一页，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 页偏移，用于查询下一页，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
     * @param NextToken 页偏移，用于查询下一页，最小长度不小于1个ASCII字符，最大长度不超过1024个ASCII字符
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 游戏服务器会话状态(ACTIVE,ACTIVATING,TERMINATED,TERMINATING,ERROR) 
     * @return StatusFilter 游戏服务器会话状态(ACTIVE,ACTIVATING,TERMINATED,TERMINATING,ERROR)
     */
    public String getStatusFilter() {
        return this.StatusFilter;
    }

    /**
     * Set 游戏服务器会话状态(ACTIVE,ACTIVATING,TERMINATED,TERMINATING,ERROR)
     * @param StatusFilter 游戏服务器会话状态(ACTIVE,ACTIVATING,TERMINATED,TERMINATING,ERROR)
     */
    public void setStatusFilter(String StatusFilter) {
        this.StatusFilter = StatusFilter;
    }

    public DescribeGameServerSessionDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGameServerSessionDetailsRequest(DescribeGameServerSessionDetailsRequest source) {
        if (source.AliasId != null) {
            this.AliasId = new String(source.AliasId);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.StatusFilter != null) {
            this.StatusFilter = new String(source.StatusFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "StatusFilter", this.StatusFilter);

    }
}

