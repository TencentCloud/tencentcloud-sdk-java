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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnblockKickedUserRequest extends AbstractModel {

    /**
    * 低代码平台的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 课堂Id。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 需要解禁踢出的成员Id。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

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
     * Get 课堂Id。 
     * @return RoomId 课堂Id。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 课堂Id。
     * @param RoomId 课堂Id。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 需要解禁踢出的成员Id。 
     * @return UserId 需要解禁踢出的成员Id。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 需要解禁踢出的成员Id。
     * @param UserId 需要解禁踢出的成员Id。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public UnblockKickedUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnblockKickedUserRequest(UnblockKickedUserRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

