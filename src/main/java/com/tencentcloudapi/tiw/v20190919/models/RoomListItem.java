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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoomListItem extends AbstractModel{

    /**
    * 房间ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 房间在查询时间段内最早出现的时间，Unix时间戳，单位毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 房间在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 房间里成员数
    */
    @SerializedName("UserNumber")
    @Expose
    private Long UserNumber;

    /**
     * Get 房间ID 
     * @return RoomId 房间ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID
     * @param RoomId 房间ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 房间在查询时间段内最早出现的时间，Unix时间戳，单位毫秒 
     * @return StartTime 房间在查询时间段内最早出现的时间，Unix时间戳，单位毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 房间在查询时间段内最早出现的时间，Unix时间戳，单位毫秒
     * @param StartTime 房间在查询时间段内最早出现的时间，Unix时间戳，单位毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 房间在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒 
     * @return EndTime 房间在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 房间在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒
     * @param EndTime 房间在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 房间里成员数 
     * @return UserNumber 房间里成员数
     */
    public Long getUserNumber() {
        return this.UserNumber;
    }

    /**
     * Set 房间里成员数
     * @param UserNumber 房间里成员数
     */
    public void setUserNumber(Long UserNumber) {
        this.UserNumber = UserNumber;
    }

    public RoomListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoomListItem(RoomListItem source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.UserNumber != null) {
            this.UserNumber = new Long(source.UserNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UserNumber", this.UserNumber);

    }
}

