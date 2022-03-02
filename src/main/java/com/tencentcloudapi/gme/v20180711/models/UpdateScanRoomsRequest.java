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

public class UpdateScanRoomsRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 需要送检的所有房间号。多个房间号之间用","分隔。示例："0001,0002,0003"
    */
    @SerializedName("RoomIdString")
    @Expose
    private String RoomIdString;

    /**
    * 符合此正则表达式规则的房间号将被送检。示例：["^6.*"] 表示所有以6开头的房间号将被送检
    */
    @SerializedName("RoomIdRegex")
    @Expose
    private String [] RoomIdRegex;

    /**
     * Get 应用ID 
     * @return BizId 应用ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID
     * @param BizId 应用ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 需要送检的所有房间号。多个房间号之间用","分隔。示例："0001,0002,0003" 
     * @return RoomIdString 需要送检的所有房间号。多个房间号之间用","分隔。示例："0001,0002,0003"
     */
    public String getRoomIdString() {
        return this.RoomIdString;
    }

    /**
     * Set 需要送检的所有房间号。多个房间号之间用","分隔。示例："0001,0002,0003"
     * @param RoomIdString 需要送检的所有房间号。多个房间号之间用","分隔。示例："0001,0002,0003"
     */
    public void setRoomIdString(String RoomIdString) {
        this.RoomIdString = RoomIdString;
    }

    /**
     * Get 符合此正则表达式规则的房间号将被送检。示例：["^6.*"] 表示所有以6开头的房间号将被送检 
     * @return RoomIdRegex 符合此正则表达式规则的房间号将被送检。示例：["^6.*"] 表示所有以6开头的房间号将被送检
     */
    public String [] getRoomIdRegex() {
        return this.RoomIdRegex;
    }

    /**
     * Set 符合此正则表达式规则的房间号将被送检。示例：["^6.*"] 表示所有以6开头的房间号将被送检
     * @param RoomIdRegex 符合此正则表达式规则的房间号将被送检。示例：["^6.*"] 表示所有以6开头的房间号将被送检
     */
    public void setRoomIdRegex(String [] RoomIdRegex) {
        this.RoomIdRegex = RoomIdRegex;
    }

    public UpdateScanRoomsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateScanRoomsRequest(UpdateScanRoomsRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.RoomIdString != null) {
            this.RoomIdString = new String(source.RoomIdString);
        }
        if (source.RoomIdRegex != null) {
            this.RoomIdRegex = new String[source.RoomIdRegex.length];
            for (int i = 0; i < source.RoomIdRegex.length; i++) {
                this.RoomIdRegex[i] = new String(source.RoomIdRegex[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "RoomIdString", this.RoomIdString);
        this.setParamArraySimple(map, prefix + "RoomIdRegex.", this.RoomIdRegex);

    }
}

