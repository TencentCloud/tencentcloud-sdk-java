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

public class LoginUserWithRoomRequest extends AbstractModel {

    /**
    * <p>注册获取的用户id。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>课堂 ID</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
     * Get <p>注册获取的用户id。</p> 
     * @return UserId <p>注册获取的用户id。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>注册获取的用户id。</p>
     * @param UserId <p>注册获取的用户id。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>课堂 ID</p> 
     * @return RoomId <p>课堂 ID</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>课堂 ID</p>
     * @param RoomId <p>课堂 ID</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    public LoginUserWithRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginUserWithRoomRequest(LoginUserWithRoomRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

