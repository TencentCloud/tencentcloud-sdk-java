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

public class DescribeDetailEventRequest extends AbstractModel{

    /**
    * 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位s）。通过 DescribeRoomInformation（查询房间列表）接口获取。（链接：https://cloud.tencent.com/document/product/647/44050）
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * 查询开始时间，5天内。本地unix时间戳（1588031999s）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间，本地unix时间戳（1588031999s）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 用户id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 房间号
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位s）。通过 DescribeRoomInformation（查询房间列表）接口获取。（链接：https://cloud.tencent.com/document/product/647/44050） 
     * @return CommId 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位s）。通过 DescribeRoomInformation（查询房间列表）接口获取。（链接：https://cloud.tencent.com/document/product/647/44050）
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位s）。通过 DescribeRoomInformation（查询房间列表）接口获取。（链接：https://cloud.tencent.com/document/product/647/44050）
     * @param CommId 通话 ID（唯一标识一次通话）： sdkappid_roomgString（房间号_createTime（房间创建时间，unix时间戳，单位s）。通过 DescribeRoomInformation（查询房间列表）接口获取。（链接：https://cloud.tencent.com/document/product/647/44050）
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    /**
     * Get 查询开始时间，5天内。本地unix时间戳（1588031999s） 
     * @return StartTime 查询开始时间，5天内。本地unix时间戳（1588031999s）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，5天内。本地unix时间戳（1588031999s）
     * @param StartTime 查询开始时间，5天内。本地unix时间戳（1588031999s）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，本地unix时间戳（1588031999s） 
     * @return EndTime 查询结束时间，本地unix时间戳（1588031999s）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，本地unix时间戳（1588031999s）
     * @param EndTime 查询结束时间，本地unix时间戳（1588031999s）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 用户id 
     * @return UserId 用户id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
     * @param UserId 用户id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 房间号 
     * @return RoomId 房间号
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间号
     * @param RoomId 房间号
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommId", this.CommId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

