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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoomUser extends AbstractModel {

    /**
    * 房间id
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 房间里用户uin列表
    */
    @SerializedName("Uins")
    @Expose
    private Long [] Uins;

    /**
    * 字符串房间id
    */
    @SerializedName("StrRoomId")
    @Expose
    private String StrRoomId;

    /**
    * 房间里用户字符串uin列表
    */
    @SerializedName("StrUins")
    @Expose
    private String [] StrUins;

    /**
     * Get 房间id 
     * @return RoomId 房间id
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间id
     * @param RoomId 房间id
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 房间里用户uin列表 
     * @return Uins 房间里用户uin列表
     */
    public Long [] getUins() {
        return this.Uins;
    }

    /**
     * Set 房间里用户uin列表
     * @param Uins 房间里用户uin列表
     */
    public void setUins(Long [] Uins) {
        this.Uins = Uins;
    }

    /**
     * Get 字符串房间id 
     * @return StrRoomId 字符串房间id
     */
    public String getStrRoomId() {
        return this.StrRoomId;
    }

    /**
     * Set 字符串房间id
     * @param StrRoomId 字符串房间id
     */
    public void setStrRoomId(String StrRoomId) {
        this.StrRoomId = StrRoomId;
    }

    /**
     * Get 房间里用户字符串uin列表 
     * @return StrUins 房间里用户字符串uin列表
     */
    public String [] getStrUins() {
        return this.StrUins;
    }

    /**
     * Set 房间里用户字符串uin列表
     * @param StrUins 房间里用户字符串uin列表
     */
    public void setStrUins(String [] StrUins) {
        this.StrUins = StrUins;
    }

    public RoomUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoomUser(RoomUser source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.Uins != null) {
            this.Uins = new Long[source.Uins.length];
            for (int i = 0; i < source.Uins.length; i++) {
                this.Uins[i] = new Long(source.Uins[i]);
            }
        }
        if (source.StrRoomId != null) {
            this.StrRoomId = new String(source.StrRoomId);
        }
        if (source.StrUins != null) {
            this.StrUins = new String[source.StrUins.length];
            for (int i = 0; i < source.StrUins.length; i++) {
                this.StrUins[i] = new String(source.StrUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArraySimple(map, prefix + "Uins.", this.Uins);
        this.setParamSimple(map, prefix + "StrRoomId", this.StrRoomId);
        this.setParamArraySimple(map, prefix + "StrUins.", this.StrUins);

    }
}

