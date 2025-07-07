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

public class ScaleInfomation extends AbstractModel {

    /**
    * 每天开始的时间
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 房间人数，用户重复进入同一个房间为1次
    */
    @SerializedName("UserNumber")
    @Expose
    private Long UserNumber;

    /**
    * 房间人次，用户每次进入房间为一次
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * sdkappid下一天内的房间数
    */
    @SerializedName("RoomNumbers")
    @Expose
    private Long RoomNumbers;

    /**
     * Get 每天开始的时间 
     * @return Time 每天开始的时间
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 每天开始的时间
     * @param Time 每天开始的时间
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 房间人数，用户重复进入同一个房间为1次 
     * @return UserNumber 房间人数，用户重复进入同一个房间为1次
     */
    public Long getUserNumber() {
        return this.UserNumber;
    }

    /**
     * Set 房间人数，用户重复进入同一个房间为1次
     * @param UserNumber 房间人数，用户重复进入同一个房间为1次
     */
    public void setUserNumber(Long UserNumber) {
        this.UserNumber = UserNumber;
    }

    /**
     * Get 房间人次，用户每次进入房间为一次 
     * @return UserCount 房间人次，用户每次进入房间为一次
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 房间人次，用户每次进入房间为一次
     * @param UserCount 房间人次，用户每次进入房间为一次
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get sdkappid下一天内的房间数 
     * @return RoomNumbers sdkappid下一天内的房间数
     */
    public Long getRoomNumbers() {
        return this.RoomNumbers;
    }

    /**
     * Set sdkappid下一天内的房间数
     * @param RoomNumbers sdkappid下一天内的房间数
     */
    public void setRoomNumbers(Long RoomNumbers) {
        this.RoomNumbers = RoomNumbers;
    }

    public ScaleInfomation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleInfomation(ScaleInfomation source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.UserNumber != null) {
            this.UserNumber = new Long(source.UserNumber);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.RoomNumbers != null) {
            this.RoomNumbers = new Long(source.RoomNumbers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "UserNumber", this.UserNumber);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "RoomNumbers", this.RoomNumbers);

    }
}

