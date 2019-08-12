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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KickOutUserRequest  extends AbstractModel{

    /**
    * TRTC的SDKAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 房间号。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 要踢的用户列表，最多10个。
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * 获取TRTC的SDKAppId。
     * @return SdkAppId TRTC的SDKAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * 设置TRTC的SDKAppId。
     * @param SdkAppId TRTC的SDKAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * 获取房间号。
     * @return RoomId 房间号。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * 设置房间号。
     * @param RoomId 房间号。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * 获取要踢的用户列表，最多10个。
     * @return UserIds 要踢的用户列表，最多10个。
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * 设置要踢的用户列表，最多10个。
     * @param UserIds 要踢的用户列表，最多10个。
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

