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

public class RoomUser extends AbstractModel{

    /**
    * 房间id
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 房间里用户uin列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uins")
    @Expose
    private Long [] Uins;

    /**
    * 字符串房间id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrRoomId")
    @Expose
    private String StrRoomId;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uins 房间里用户uin列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getUins() {
        return this.Uins;
    }

    /**
     * Set 房间里用户uin列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uins 房间里用户uin列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUins(Long [] Uins) {
        this.Uins = Uins;
    }

    /**
     * Get 字符串房间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrRoomId 字符串房间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrRoomId() {
        return this.StrRoomId;
    }

    /**
     * Set 字符串房间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrRoomId 字符串房间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrRoomId(String StrRoomId) {
        this.StrRoomId = StrRoomId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArraySimple(map, prefix + "Uins.", this.Uins);
        this.setParamSimple(map, prefix + "StrRoomId", this.StrRoomId);

    }
}

