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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleInfomation extends AbstractModel{

    /**
    * 每天开始的时间
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 房间人数，用户重复进入同一个房间为1次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserNumber")
    @Expose
    private Long UserNumber;

    /**
    * 房间人次，用户每次进入房间为一次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * sdkappid下一天内的房间数
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserNumber 房间人数，用户重复进入同一个房间为1次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserNumber() {
        return this.UserNumber;
    }

    /**
     * Set 房间人数，用户重复进入同一个房间为1次
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserNumber 房间人数，用户重复进入同一个房间为1次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserNumber(Long UserNumber) {
        this.UserNumber = UserNumber;
    }

    /**
     * Get 房间人次，用户每次进入房间为一次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserCount 房间人次，用户每次进入房间为一次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 房间人次，用户每次进入房间为一次
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserCount 房间人次，用户每次进入房间为一次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get sdkappid下一天内的房间数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomNumbers sdkappid下一天内的房间数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoomNumbers() {
        return this.RoomNumbers;
    }

    /**
     * Set sdkappid下一天内的房间数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomNumbers sdkappid下一天内的房间数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomNumbers(Long RoomNumbers) {
        this.RoomNumbers = RoomNumbers;
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

