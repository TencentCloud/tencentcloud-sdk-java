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

public class DescribeTRTCRealTimeScaleMetricDataRequest extends AbstractModel{

    /**
    * 用户SdkAppId（如：1400xxxxxx）
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 开始时间，unix时间戳，单位：秒（查询时间范围根据监控仪表盘功能版本而定，基础版可查近3小时，进阶版可查近12小时）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，unix时间戳，单位：秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 房间ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get 用户SdkAppId（如：1400xxxxxx） 
     * @return SdkAppId 用户SdkAppId（如：1400xxxxxx）
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 用户SdkAppId（如：1400xxxxxx）
     * @param SdkAppId 用户SdkAppId（如：1400xxxxxx）
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 开始时间，unix时间戳，单位：秒（查询时间范围根据监控仪表盘功能版本而定，基础版可查近3小时，进阶版可查近12小时） 
     * @return StartTime 开始时间，unix时间戳，单位：秒（查询时间范围根据监控仪表盘功能版本而定，基础版可查近3小时，进阶版可查近12小时）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，unix时间戳，单位：秒（查询时间范围根据监控仪表盘功能版本而定，基础版可查近3小时，进阶版可查近12小时）
     * @param StartTime 开始时间，unix时间戳，单位：秒（查询时间范围根据监控仪表盘功能版本而定，基础版可查近3小时，进阶版可查近12小时）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，unix时间戳，单位：秒 
     * @return EndTime 结束时间，unix时间戳，单位：秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，unix时间戳，单位：秒
     * @param EndTime 结束时间，unix时间戳，单位：秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

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

    public DescribeTRTCRealTimeScaleMetricDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCRealTimeScaleMetricDataRequest(DescribeTRTCRealTimeScaleMetricDataRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
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

