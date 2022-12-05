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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserMicStatusRequest extends AbstractModel{

    /**
    * 来自 [腾讯云控制台](https://console.cloud.tencent.com/gamegme) 的 GME 服务提供的 AppID，获取请参考 [语音服务开通指引](https://cloud.tencent.com/document/product/607/10782#.E9.87.8D.E7.82.B9.E5.8F.82.E6.95.B0)。
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 实时语音房间号。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 需要操作的房间内用户以及该用户的目标麦克风状态。
    */
    @SerializedName("Users")
    @Expose
    private UserMicStatus [] Users;

    /**
     * Get 来自 [腾讯云控制台](https://console.cloud.tencent.com/gamegme) 的 GME 服务提供的 AppID，获取请参考 [语音服务开通指引](https://cloud.tencent.com/document/product/607/10782#.E9.87.8D.E7.82.B9.E5.8F.82.E6.95.B0)。 
     * @return BizId 来自 [腾讯云控制台](https://console.cloud.tencent.com/gamegme) 的 GME 服务提供的 AppID，获取请参考 [语音服务开通指引](https://cloud.tencent.com/document/product/607/10782#.E9.87.8D.E7.82.B9.E5.8F.82.E6.95.B0)。
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 来自 [腾讯云控制台](https://console.cloud.tencent.com/gamegme) 的 GME 服务提供的 AppID，获取请参考 [语音服务开通指引](https://cloud.tencent.com/document/product/607/10782#.E9.87.8D.E7.82.B9.E5.8F.82.E6.95.B0)。
     * @param BizId 来自 [腾讯云控制台](https://console.cloud.tencent.com/gamegme) 的 GME 服务提供的 AppID，获取请参考 [语音服务开通指引](https://cloud.tencent.com/document/product/607/10782#.E9.87.8D.E7.82.B9.E5.8F.82.E6.95.B0)。
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 实时语音房间号。 
     * @return RoomId 实时语音房间号。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 实时语音房间号。
     * @param RoomId 实时语音房间号。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 需要操作的房间内用户以及该用户的目标麦克风状态。 
     * @return Users 需要操作的房间内用户以及该用户的目标麦克风状态。
     */
    public UserMicStatus [] getUsers() {
        return this.Users;
    }

    /**
     * Set 需要操作的房间内用户以及该用户的目标麦克风状态。
     * @param Users 需要操作的房间内用户以及该用户的目标麦克风状态。
     */
    public void setUsers(UserMicStatus [] Users) {
        this.Users = Users;
    }

    public ModifyUserMicStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserMicStatusRequest(ModifyUserMicStatusRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.Users != null) {
            this.Users = new UserMicStatus[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new UserMicStatus(source.Users[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);

    }
}

