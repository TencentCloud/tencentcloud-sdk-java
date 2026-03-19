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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendTemporaryScriptToAvatarRoomRequest extends AbstractModel {

    /**
    * 数字人直播间 ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 临时话术，最长不超过500字。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 数字人直播间 ID。 
     * @return RoomId 数字人直播间 ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 数字人直播间 ID。
     * @param RoomId 数字人直播间 ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 临时话术，最长不超过500字。 
     * @return Content 临时话术，最长不超过500字。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 临时话术，最长不超过500字。
     * @param Content 临时话术，最长不超过500字。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public SendTemporaryScriptToAvatarRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendTemporaryScriptToAvatarRoomRequest(SendTemporaryScriptToAvatarRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

