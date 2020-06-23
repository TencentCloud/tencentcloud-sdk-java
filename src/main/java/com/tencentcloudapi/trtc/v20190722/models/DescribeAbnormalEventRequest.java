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

public class DescribeAbnormalEventRequest extends AbstractModel{

    /**
    * 用户SDKAppID，查询SDKAppID下任意20条异常体验事件（可能不同房间）
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 房间号，查询房间内任意20条以内异常体验事件
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get 用户SDKAppID，查询SDKAppID下任意20条异常体验事件（可能不同房间） 
     * @return SdkAppId 用户SDKAppID，查询SDKAppID下任意20条异常体验事件（可能不同房间）
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 用户SDKAppID，查询SDKAppID下任意20条异常体验事件（可能不同房间）
     * @param SdkAppId 用户SDKAppID，查询SDKAppID下任意20条异常体验事件（可能不同房间）
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 查询开始时间 
     * @return StartTime 查询开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 房间号，查询房间内任意20条以内异常体验事件 
     * @return RoomId 房间号，查询房间内任意20条以内异常体验事件
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间号，查询房间内任意20条以内异常体验事件
     * @param RoomId 房间号，查询房间内任意20条以内异常体验事件
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

