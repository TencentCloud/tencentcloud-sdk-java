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

public class Room extends AbstractModel{

    /**
    * 表示房间名称。最长不超过32个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 表示房间最大玩家数量。最大不超过100人。
    */
    @SerializedName("MaxPlayers")
    @Expose
    private Long MaxPlayers;

    /**
    * 表示房主OpenId。最长不超过16个字符。
    */
    @SerializedName("OwnerOpenId")
    @Expose
    private String OwnerOpenId;

    /**
    * 表示是否私有，私有指的是不允许其他玩家通过匹配加入房间。
    */
    @SerializedName("IsPrivate")
    @Expose
    private Boolean IsPrivate;

    /**
    * 表示玩家详情列表。
    */
    @SerializedName("Players")
    @Expose
    private Player [] Players;

    /**
    * 表示团队属性列表。
    */
    @SerializedName("Teams")
    @Expose
    private Team [] Teams;

    /**
    * 表示房间 ID。出参用，由后端返回。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 表示房间类型。最长不超过32个字符。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 表示创建方式：0.单人主动发起创建房间请求；1.多人在线匹配请求分配房间；2. 直接创建满员房间。调用云API的创房请求默认为3，目前通过云API调用只支持第3种方式。
    */
    @SerializedName("CreateType")
    @Expose
    private Long CreateType;

    /**
    * 表示自定义房间属性，不传为空字符串。最长不超过1024个字符。
    */
    @SerializedName("CustomProperties")
    @Expose
    private String CustomProperties;

    /**
    * 表示房间帧同步状态。0表示未开始帧同步，1表示已开始帧同步，用于出参。
    */
    @SerializedName("FrameSyncState")
    @Expose
    private Long FrameSyncState;

    /**
    * 表示帧率。由控制台设置，用于出参。
    */
    @SerializedName("FrameRate")
    @Expose
    private Long FrameRate;

    /**
    * 表示路由ID。用于出参。
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * 表示房间创建的时间戳（单位：秒）。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 表示开始帧同步时的时间戳（单位：秒）,未开始帧同步时返回为0。
    */
    @SerializedName("StartGameTime")
    @Expose
    private Long StartGameTime;

    /**
    * 表示是否禁止加入房间。出参使用，默认为False，通过SDK的ChangeRoom接口可以修改。
    */
    @SerializedName("IsForbidJoin")
    @Expose
    private Boolean IsForbidJoin;

    /**
    * 表示房主PlayerId。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
     * Get 表示房间名称。最长不超过32个字符。 
     * @return Name 表示房间名称。最长不超过32个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表示房间名称。最长不超过32个字符。
     * @param Name 表示房间名称。最长不超过32个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 表示房间最大玩家数量。最大不超过100人。 
     * @return MaxPlayers 表示房间最大玩家数量。最大不超过100人。
     */
    public Long getMaxPlayers() {
        return this.MaxPlayers;
    }

    /**
     * Set 表示房间最大玩家数量。最大不超过100人。
     * @param MaxPlayers 表示房间最大玩家数量。最大不超过100人。
     */
    public void setMaxPlayers(Long MaxPlayers) {
        this.MaxPlayers = MaxPlayers;
    }

    /**
     * Get 表示房主OpenId。最长不超过16个字符。 
     * @return OwnerOpenId 表示房主OpenId。最长不超过16个字符。
     */
    public String getOwnerOpenId() {
        return this.OwnerOpenId;
    }

    /**
     * Set 表示房主OpenId。最长不超过16个字符。
     * @param OwnerOpenId 表示房主OpenId。最长不超过16个字符。
     */
    public void setOwnerOpenId(String OwnerOpenId) {
        this.OwnerOpenId = OwnerOpenId;
    }

    /**
     * Get 表示是否私有，私有指的是不允许其他玩家通过匹配加入房间。 
     * @return IsPrivate 表示是否私有，私有指的是不允许其他玩家通过匹配加入房间。
     */
    public Boolean getIsPrivate() {
        return this.IsPrivate;
    }

    /**
     * Set 表示是否私有，私有指的是不允许其他玩家通过匹配加入房间。
     * @param IsPrivate 表示是否私有，私有指的是不允许其他玩家通过匹配加入房间。
     */
    public void setIsPrivate(Boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
    }

    /**
     * Get 表示玩家详情列表。 
     * @return Players 表示玩家详情列表。
     */
    public Player [] getPlayers() {
        return this.Players;
    }

    /**
     * Set 表示玩家详情列表。
     * @param Players 表示玩家详情列表。
     */
    public void setPlayers(Player [] Players) {
        this.Players = Players;
    }

    /**
     * Get 表示团队属性列表。 
     * @return Teams 表示团队属性列表。
     */
    public Team [] getTeams() {
        return this.Teams;
    }

    /**
     * Set 表示团队属性列表。
     * @param Teams 表示团队属性列表。
     */
    public void setTeams(Team [] Teams) {
        this.Teams = Teams;
    }

    /**
     * Get 表示房间 ID。出参用，由后端返回。 
     * @return Id 表示房间 ID。出参用，由后端返回。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 表示房间 ID。出参用，由后端返回。
     * @param Id 表示房间 ID。出参用，由后端返回。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 表示房间类型。最长不超过32个字符。 
     * @return Type 表示房间类型。最长不超过32个字符。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 表示房间类型。最长不超过32个字符。
     * @param Type 表示房间类型。最长不超过32个字符。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 表示创建方式：0.单人主动发起创建房间请求；1.多人在线匹配请求分配房间；2. 直接创建满员房间。调用云API的创房请求默认为3，目前通过云API调用只支持第3种方式。 
     * @return CreateType 表示创建方式：0.单人主动发起创建房间请求；1.多人在线匹配请求分配房间；2. 直接创建满员房间。调用云API的创房请求默认为3，目前通过云API调用只支持第3种方式。
     */
    public Long getCreateType() {
        return this.CreateType;
    }

    /**
     * Set 表示创建方式：0.单人主动发起创建房间请求；1.多人在线匹配请求分配房间；2. 直接创建满员房间。调用云API的创房请求默认为3，目前通过云API调用只支持第3种方式。
     * @param CreateType 表示创建方式：0.单人主动发起创建房间请求；1.多人在线匹配请求分配房间；2. 直接创建满员房间。调用云API的创房请求默认为3，目前通过云API调用只支持第3种方式。
     */
    public void setCreateType(Long CreateType) {
        this.CreateType = CreateType;
    }

    /**
     * Get 表示自定义房间属性，不传为空字符串。最长不超过1024个字符。 
     * @return CustomProperties 表示自定义房间属性，不传为空字符串。最长不超过1024个字符。
     */
    public String getCustomProperties() {
        return this.CustomProperties;
    }

    /**
     * Set 表示自定义房间属性，不传为空字符串。最长不超过1024个字符。
     * @param CustomProperties 表示自定义房间属性，不传为空字符串。最长不超过1024个字符。
     */
    public void setCustomProperties(String CustomProperties) {
        this.CustomProperties = CustomProperties;
    }

    /**
     * Get 表示房间帧同步状态。0表示未开始帧同步，1表示已开始帧同步，用于出参。 
     * @return FrameSyncState 表示房间帧同步状态。0表示未开始帧同步，1表示已开始帧同步，用于出参。
     */
    public Long getFrameSyncState() {
        return this.FrameSyncState;
    }

    /**
     * Set 表示房间帧同步状态。0表示未开始帧同步，1表示已开始帧同步，用于出参。
     * @param FrameSyncState 表示房间帧同步状态。0表示未开始帧同步，1表示已开始帧同步，用于出参。
     */
    public void setFrameSyncState(Long FrameSyncState) {
        this.FrameSyncState = FrameSyncState;
    }

    /**
     * Get 表示帧率。由控制台设置，用于出参。 
     * @return FrameRate 表示帧率。由控制台设置，用于出参。
     */
    public Long getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 表示帧率。由控制台设置，用于出参。
     * @param FrameRate 表示帧率。由控制台设置，用于出参。
     */
    public void setFrameRate(Long FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get 表示路由ID。用于出参。 
     * @return RouteId 表示路由ID。用于出参。
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 表示路由ID。用于出参。
     * @param RouteId 表示路由ID。用于出参。
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get 表示房间创建的时间戳（单位：秒）。 
     * @return CreateTime 表示房间创建的时间戳（单位：秒）。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 表示房间创建的时间戳（单位：秒）。
     * @param CreateTime 表示房间创建的时间戳（单位：秒）。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 表示开始帧同步时的时间戳（单位：秒）,未开始帧同步时返回为0。 
     * @return StartGameTime 表示开始帧同步时的时间戳（单位：秒）,未开始帧同步时返回为0。
     */
    public Long getStartGameTime() {
        return this.StartGameTime;
    }

    /**
     * Set 表示开始帧同步时的时间戳（单位：秒）,未开始帧同步时返回为0。
     * @param StartGameTime 表示开始帧同步时的时间戳（单位：秒）,未开始帧同步时返回为0。
     */
    public void setStartGameTime(Long StartGameTime) {
        this.StartGameTime = StartGameTime;
    }

    /**
     * Get 表示是否禁止加入房间。出参使用，默认为False，通过SDK的ChangeRoom接口可以修改。 
     * @return IsForbidJoin 表示是否禁止加入房间。出参使用，默认为False，通过SDK的ChangeRoom接口可以修改。
     */
    public Boolean getIsForbidJoin() {
        return this.IsForbidJoin;
    }

    /**
     * Set 表示是否禁止加入房间。出参使用，默认为False，通过SDK的ChangeRoom接口可以修改。
     * @param IsForbidJoin 表示是否禁止加入房间。出参使用，默认为False，通过SDK的ChangeRoom接口可以修改。
     */
    public void setIsForbidJoin(Boolean IsForbidJoin) {
        this.IsForbidJoin = IsForbidJoin;
    }

    /**
     * Get 表示房主PlayerId。 
     * @return Owner 表示房主PlayerId。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 表示房主PlayerId。
     * @param Owner 表示房主PlayerId。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public Room() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Room(Room source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MaxPlayers != null) {
            this.MaxPlayers = new Long(source.MaxPlayers);
        }
        if (source.OwnerOpenId != null) {
            this.OwnerOpenId = new String(source.OwnerOpenId);
        }
        if (source.IsPrivate != null) {
            this.IsPrivate = new Boolean(source.IsPrivate);
        }
        if (source.Players != null) {
            this.Players = new Player[source.Players.length];
            for (int i = 0; i < source.Players.length; i++) {
                this.Players[i] = new Player(source.Players[i]);
            }
        }
        if (source.Teams != null) {
            this.Teams = new Team[source.Teams.length];
            for (int i = 0; i < source.Teams.length; i++) {
                this.Teams[i] = new Team(source.Teams[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateType != null) {
            this.CreateType = new Long(source.CreateType);
        }
        if (source.CustomProperties != null) {
            this.CustomProperties = new String(source.CustomProperties);
        }
        if (source.FrameSyncState != null) {
            this.FrameSyncState = new Long(source.FrameSyncState);
        }
        if (source.FrameRate != null) {
            this.FrameRate = new Long(source.FrameRate);
        }
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.StartGameTime != null) {
            this.StartGameTime = new Long(source.StartGameTime);
        }
        if (source.IsForbidJoin != null) {
            this.IsForbidJoin = new Boolean(source.IsForbidJoin);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MaxPlayers", this.MaxPlayers);
        this.setParamSimple(map, prefix + "OwnerOpenId", this.OwnerOpenId);
        this.setParamSimple(map, prefix + "IsPrivate", this.IsPrivate);
        this.setParamArrayObj(map, prefix + "Players.", this.Players);
        this.setParamArrayObj(map, prefix + "Teams.", this.Teams);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateType", this.CreateType);
        this.setParamSimple(map, prefix + "CustomProperties", this.CustomProperties);
        this.setParamSimple(map, prefix + "FrameSyncState", this.FrameSyncState);
        this.setParamSimple(map, prefix + "FrameRate", this.FrameRate);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartGameTime", this.StartGameTime);
        this.setParamSimple(map, prefix + "IsForbidJoin", this.IsForbidJoin);
        this.setParamSimple(map, prefix + "Owner", this.Owner);

    }
}

