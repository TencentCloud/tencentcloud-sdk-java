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

public class Team extends AbstractModel{

    /**
    * 队伍ID。最长不超过16个字符。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 队伍名称。最长不超过32个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 队伍最小人数。最大不超过100人。
    */
    @SerializedName("MinPlayers")
    @Expose
    private Long MinPlayers;

    /**
    * 队伍最大人数。最大不超过100人。
    */
    @SerializedName("MaxPlayers")
    @Expose
    private Long MaxPlayers;

    /**
     * Get 队伍ID。最长不超过16个字符。 
     * @return Id 队伍ID。最长不超过16个字符。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 队伍ID。最长不超过16个字符。
     * @param Id 队伍ID。最长不超过16个字符。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 队伍名称。最长不超过32个字符。 
     * @return Name 队伍名称。最长不超过32个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 队伍名称。最长不超过32个字符。
     * @param Name 队伍名称。最长不超过32个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 队伍最小人数。最大不超过100人。 
     * @return MinPlayers 队伍最小人数。最大不超过100人。
     */
    public Long getMinPlayers() {
        return this.MinPlayers;
    }

    /**
     * Set 队伍最小人数。最大不超过100人。
     * @param MinPlayers 队伍最小人数。最大不超过100人。
     */
    public void setMinPlayers(Long MinPlayers) {
        this.MinPlayers = MinPlayers;
    }

    /**
     * Get 队伍最大人数。最大不超过100人。 
     * @return MaxPlayers 队伍最大人数。最大不超过100人。
     */
    public Long getMaxPlayers() {
        return this.MaxPlayers;
    }

    /**
     * Set 队伍最大人数。最大不超过100人。
     * @param MaxPlayers 队伍最大人数。最大不超过100人。
     */
    public void setMaxPlayers(Long MaxPlayers) {
        this.MaxPlayers = MaxPlayers;
    }

    public Team() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Team(Team source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MinPlayers != null) {
            this.MinPlayers = new Long(source.MinPlayers);
        }
        if (source.MaxPlayers != null) {
            this.MaxPlayers = new Long(source.MaxPlayers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MinPlayers", this.MinPlayers);
        this.setParamSimple(map, prefix + "MaxPlayers", this.MaxPlayers);

    }
}

