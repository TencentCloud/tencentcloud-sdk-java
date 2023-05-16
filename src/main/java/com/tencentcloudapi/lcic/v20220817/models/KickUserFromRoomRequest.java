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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KickUserFromRoomRequest extends AbstractModel{

    /**
    * 房间Id。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 低代码平台的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 需要踢出成员Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 踢出类型：
1：临时踢出，可以使用Duration参数指定污点时间，污点时间间隔内用户无法进入房间。
2：永久踢出
    */
    @SerializedName("KickType")
    @Expose
    private Long KickType;

    /**
    * 污点时间(单位秒)，KickType = 1时生效，默认为0
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 房间Id。 
     * @return RoomId 房间Id。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间Id。
     * @param RoomId 房间Id。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 低代码平台的SdkAppId。 
     * @return SdkAppId 低代码平台的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码平台的SdkAppId。
     * @param SdkAppId 低代码平台的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 需要踢出成员Id 
     * @return UserId 需要踢出成员Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 需要踢出成员Id
     * @param UserId 需要踢出成员Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 踢出类型：
1：临时踢出，可以使用Duration参数指定污点时间，污点时间间隔内用户无法进入房间。
2：永久踢出 
     * @return KickType 踢出类型：
1：临时踢出，可以使用Duration参数指定污点时间，污点时间间隔内用户无法进入房间。
2：永久踢出
     */
    public Long getKickType() {
        return this.KickType;
    }

    /**
     * Set 踢出类型：
1：临时踢出，可以使用Duration参数指定污点时间，污点时间间隔内用户无法进入房间。
2：永久踢出
     * @param KickType 踢出类型：
1：临时踢出，可以使用Duration参数指定污点时间，污点时间间隔内用户无法进入房间。
2：永久踢出
     */
    public void setKickType(Long KickType) {
        this.KickType = KickType;
    }

    /**
     * Get 污点时间(单位秒)，KickType = 1时生效，默认为0 
     * @return Duration 污点时间(单位秒)，KickType = 1时生效，默认为0
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 污点时间(单位秒)，KickType = 1时生效，默认为0
     * @param Duration 污点时间(单位秒)，KickType = 1时生效，默认为0
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public KickUserFromRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KickUserFromRoomRequest(KickUserFromRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.KickType != null) {
            this.KickType = new Long(source.KickType);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "KickType", this.KickType);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

