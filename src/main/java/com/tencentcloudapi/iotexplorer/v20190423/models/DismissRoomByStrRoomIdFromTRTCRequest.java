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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DismissRoomByStrRoomIdFromTRTCRequest extends AbstractModel {

    /**
    * 房间id
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get 房间id 
     * @return RoomId 房间id
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间id
     * @param RoomId 房间id
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DismissRoomByStrRoomIdFromTRTCRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DismissRoomByStrRoomIdFromTRTCRequest(DismissRoomByStrRoomIdFromTRTCRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

