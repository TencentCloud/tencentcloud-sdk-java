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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveUserByStrRoomIdRequest extends AbstractModel {

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
    private String RoomId;

    /**
    * 要移出的用户列表，最多10个。
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get TRTC的SDKAppId。 
     * @return SdkAppId TRTC的SDKAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的SDKAppId。
     * @param SdkAppId TRTC的SDKAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 房间号。 
     * @return RoomId 房间号。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间号。
     * @param RoomId 房间号。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 要移出的用户列表，最多10个。 
     * @return UserIds 要移出的用户列表，最多10个。
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 要移出的用户列表，最多10个。
     * @param UserIds 要移出的用户列表，最多10个。
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public RemoveUserByStrRoomIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveUserByStrRoomIdRequest(RemoveUserByStrRoomIdRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

