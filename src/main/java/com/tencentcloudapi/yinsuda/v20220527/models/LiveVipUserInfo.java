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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveVipUserInfo extends AbstractModel{

    /**
    * 房间标识。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 直播会员结束时间。
    */
    @SerializedName("LiveVipEndTime")
    @Expose
    private String LiveVipEndTime;

    /**
    * 会员生效状态
<li>Valid：生效</li><li>Invalid：无效</li>
    */
    @SerializedName("LiveVipStatus")
    @Expose
    private String LiveVipStatus;

    /**
     * Get 房间标识。 
     * @return RoomId 房间标识。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间标识。
     * @param RoomId 房间标识。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 直播会员结束时间。 
     * @return LiveVipEndTime 直播会员结束时间。
     */
    public String getLiveVipEndTime() {
        return this.LiveVipEndTime;
    }

    /**
     * Set 直播会员结束时间。
     * @param LiveVipEndTime 直播会员结束时间。
     */
    public void setLiveVipEndTime(String LiveVipEndTime) {
        this.LiveVipEndTime = LiveVipEndTime;
    }

    /**
     * Get 会员生效状态
<li>Valid：生效</li><li>Invalid：无效</li> 
     * @return LiveVipStatus 会员生效状态
<li>Valid：生效</li><li>Invalid：无效</li>
     */
    public String getLiveVipStatus() {
        return this.LiveVipStatus;
    }

    /**
     * Set 会员生效状态
<li>Valid：生效</li><li>Invalid：无效</li>
     * @param LiveVipStatus 会员生效状态
<li>Valid：生效</li><li>Invalid：无效</li>
     */
    public void setLiveVipStatus(String LiveVipStatus) {
        this.LiveVipStatus = LiveVipStatus;
    }

    public LiveVipUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveVipUserInfo(LiveVipUserInfo source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.LiveVipEndTime != null) {
            this.LiveVipEndTime = new String(source.LiveVipEndTime);
        }
        if (source.LiveVipStatus != null) {
            this.LiveVipStatus = new String(source.LiveVipStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "LiveVipEndTime", this.LiveVipEndTime);
        this.setParamSimple(map, prefix + "LiveVipStatus", this.LiveVipStatus);

    }
}

