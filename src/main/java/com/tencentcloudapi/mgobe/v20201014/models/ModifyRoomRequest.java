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

public class ModifyRoomRequest extends AbstractModel{

    /**
    * 游戏资源Id。
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 房间ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 发起者的PlayerId。
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 需要修改的房间选项，0表示房间名称，1表示房主，2表示是否允许观战，3表示是否支持邀请码/密码，4表示是否私有，5表示是否自定义房间属性，6表示是否禁止加人。
    */
    @SerializedName("ChangeRoomOptionList")
    @Expose
    private Long [] ChangeRoomOptionList;

    /**
    * 房间名称。
    */
    @SerializedName("RoomName")
    @Expose
    private String RoomName;

    /**
    * 变更房主。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 是否支持观战。
    */
    @SerializedName("IsViewed")
    @Expose
    private Boolean IsViewed;

    /**
    * 是否支持邀请码/密码。
    */
    @SerializedName("IsInvited")
    @Expose
    private Boolean IsInvited;

    /**
    * 是否私有。
    */
    @SerializedName("IsPrivate")
    @Expose
    private Boolean IsPrivate;

    /**
    * 自定义房间属性。
    */
    @SerializedName("CustomProperties")
    @Expose
    private String CustomProperties;

    /**
    * 房间是否禁止加人。
    */
    @SerializedName("IsForbidJoin")
    @Expose
    private Boolean IsForbidJoin;

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
     * Get 房间ID。 
     * @return RoomId 房间ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID。
     * @param RoomId 房间ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 发起者的PlayerId。 
     * @return PlayerId 发起者的PlayerId。
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 发起者的PlayerId。
     * @param PlayerId 发起者的PlayerId。
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 需要修改的房间选项，0表示房间名称，1表示房主，2表示是否允许观战，3表示是否支持邀请码/密码，4表示是否私有，5表示是否自定义房间属性，6表示是否禁止加人。 
     * @return ChangeRoomOptionList 需要修改的房间选项，0表示房间名称，1表示房主，2表示是否允许观战，3表示是否支持邀请码/密码，4表示是否私有，5表示是否自定义房间属性，6表示是否禁止加人。
     */
    public Long [] getChangeRoomOptionList() {
        return this.ChangeRoomOptionList;
    }

    /**
     * Set 需要修改的房间选项，0表示房间名称，1表示房主，2表示是否允许观战，3表示是否支持邀请码/密码，4表示是否私有，5表示是否自定义房间属性，6表示是否禁止加人。
     * @param ChangeRoomOptionList 需要修改的房间选项，0表示房间名称，1表示房主，2表示是否允许观战，3表示是否支持邀请码/密码，4表示是否私有，5表示是否自定义房间属性，6表示是否禁止加人。
     */
    public void setChangeRoomOptionList(Long [] ChangeRoomOptionList) {
        this.ChangeRoomOptionList = ChangeRoomOptionList;
    }

    /**
     * Get 房间名称。 
     * @return RoomName 房间名称。
     */
    public String getRoomName() {
        return this.RoomName;
    }

    /**
     * Set 房间名称。
     * @param RoomName 房间名称。
     */
    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }

    /**
     * Get 变更房主。 
     * @return Owner 变更房主。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 变更房主。
     * @param Owner 变更房主。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 是否支持观战。 
     * @return IsViewed 是否支持观战。
     */
    public Boolean getIsViewed() {
        return this.IsViewed;
    }

    /**
     * Set 是否支持观战。
     * @param IsViewed 是否支持观战。
     */
    public void setIsViewed(Boolean IsViewed) {
        this.IsViewed = IsViewed;
    }

    /**
     * Get 是否支持邀请码/密码。 
     * @return IsInvited 是否支持邀请码/密码。
     */
    public Boolean getIsInvited() {
        return this.IsInvited;
    }

    /**
     * Set 是否支持邀请码/密码。
     * @param IsInvited 是否支持邀请码/密码。
     */
    public void setIsInvited(Boolean IsInvited) {
        this.IsInvited = IsInvited;
    }

    /**
     * Get 是否私有。 
     * @return IsPrivate 是否私有。
     */
    public Boolean getIsPrivate() {
        return this.IsPrivate;
    }

    /**
     * Set 是否私有。
     * @param IsPrivate 是否私有。
     */
    public void setIsPrivate(Boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
    }

    /**
     * Get 自定义房间属性。 
     * @return CustomProperties 自定义房间属性。
     */
    public String getCustomProperties() {
        return this.CustomProperties;
    }

    /**
     * Set 自定义房间属性。
     * @param CustomProperties 自定义房间属性。
     */
    public void setCustomProperties(String CustomProperties) {
        this.CustomProperties = CustomProperties;
    }

    /**
     * Get 房间是否禁止加人。 
     * @return IsForbidJoin 房间是否禁止加人。
     */
    public Boolean getIsForbidJoin() {
        return this.IsForbidJoin;
    }

    /**
     * Set 房间是否禁止加人。
     * @param IsForbidJoin 房间是否禁止加人。
     */
    public void setIsForbidJoin(Boolean IsForbidJoin) {
        this.IsForbidJoin = IsForbidJoin;
    }

    public ModifyRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoomRequest(ModifyRoomRequest source) {
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
        if (source.ChangeRoomOptionList != null) {
            this.ChangeRoomOptionList = new Long[source.ChangeRoomOptionList.length];
            for (int i = 0; i < source.ChangeRoomOptionList.length; i++) {
                this.ChangeRoomOptionList[i] = new Long(source.ChangeRoomOptionList[i]);
            }
        }
        if (source.RoomName != null) {
            this.RoomName = new String(source.RoomName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.IsViewed != null) {
            this.IsViewed = new Boolean(source.IsViewed);
        }
        if (source.IsInvited != null) {
            this.IsInvited = new Boolean(source.IsInvited);
        }
        if (source.IsPrivate != null) {
            this.IsPrivate = new Boolean(source.IsPrivate);
        }
        if (source.CustomProperties != null) {
            this.CustomProperties = new String(source.CustomProperties);
        }
        if (source.IsForbidJoin != null) {
            this.IsForbidJoin = new Boolean(source.IsForbidJoin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamArraySimple(map, prefix + "ChangeRoomOptionList.", this.ChangeRoomOptionList);
        this.setParamSimple(map, prefix + "RoomName", this.RoomName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "IsViewed", this.IsViewed);
        this.setParamSimple(map, prefix + "IsInvited", this.IsInvited);
        this.setParamSimple(map, prefix + "IsPrivate", this.IsPrivate);
        this.setParamSimple(map, prefix + "CustomProperties", this.CustomProperties);
        this.setParamSimple(map, prefix + "IsForbidJoin", this.IsForbidJoin);

    }
}

