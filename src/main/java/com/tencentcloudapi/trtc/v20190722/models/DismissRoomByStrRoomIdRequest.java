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

public class DismissRoomByStrRoomIdRequest extends AbstractModel {

    /**
    * TRTC的SDKAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 字符串类型房间号。
本接口仅支持解散字符串类型房间号，如需解散数字类型房间号，请使用：DismissRoom
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

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
     * Get 字符串类型房间号。
本接口仅支持解散字符串类型房间号，如需解散数字类型房间号，请使用：DismissRoom 
     * @return RoomId 字符串类型房间号。
本接口仅支持解散字符串类型房间号，如需解散数字类型房间号，请使用：DismissRoom
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 字符串类型房间号。
本接口仅支持解散字符串类型房间号，如需解散数字类型房间号，请使用：DismissRoom
     * @param RoomId 字符串类型房间号。
本接口仅支持解散字符串类型房间号，如需解散数字类型房间号，请使用：DismissRoom
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DismissRoomByStrRoomIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DismissRoomByStrRoomIdRequest(DismissRoomByStrRoomIdRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

