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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRecordItem extends AbstractModel{

    /**
    * 录制文件自增ID
    */
    @SerializedName("IntID")
    @Expose
    private Long IntID;

    /**
    * 直播频道ID
    */
    @SerializedName("LiveChannelId")
    @Expose
    private String LiveChannelId;

    /**
    * 过期时间
    */
    @SerializedName("ExpectDeleteTime")
    @Expose
    private Long ExpectDeleteTime;

    /**
    * 录制时长
    */
    @SerializedName("RecordTimeLen")
    @Expose
    private Long RecordTimeLen;

    /**
    * 文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 录制文件url
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 录制计划ID
    */
    @SerializedName("RecordPlanId")
    @Expose
    private String RecordPlanId;

    /**
    * 录制开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 录制结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 录制文件自增ID 
     * @return IntID 录制文件自增ID
     */
    public Long getIntID() {
        return this.IntID;
    }

    /**
     * Set 录制文件自增ID
     * @param IntID 录制文件自增ID
     */
    public void setIntID(Long IntID) {
        this.IntID = IntID;
    }

    /**
     * Get 直播频道ID 
     * @return LiveChannelId 直播频道ID
     */
    public String getLiveChannelId() {
        return this.LiveChannelId;
    }

    /**
     * Set 直播频道ID
     * @param LiveChannelId 直播频道ID
     */
    public void setLiveChannelId(String LiveChannelId) {
        this.LiveChannelId = LiveChannelId;
    }

    /**
     * Get 过期时间 
     * @return ExpectDeleteTime 过期时间
     */
    public Long getExpectDeleteTime() {
        return this.ExpectDeleteTime;
    }

    /**
     * Set 过期时间
     * @param ExpectDeleteTime 过期时间
     */
    public void setExpectDeleteTime(Long ExpectDeleteTime) {
        this.ExpectDeleteTime = ExpectDeleteTime;
    }

    /**
     * Get 录制时长 
     * @return RecordTimeLen 录制时长
     */
    public Long getRecordTimeLen() {
        return this.RecordTimeLen;
    }

    /**
     * Set 录制时长
     * @param RecordTimeLen 录制时长
     */
    public void setRecordTimeLen(Long RecordTimeLen) {
        this.RecordTimeLen = RecordTimeLen;
    }

    /**
     * Get 文件大小 
     * @return FileSize 文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
     * @param FileSize 文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 录制文件url 
     * @return VideoUrl 录制文件url
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 录制文件url
     * @param VideoUrl 录制文件url
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 录制计划ID 
     * @return RecordPlanId 录制计划ID
     */
    public String getRecordPlanId() {
        return this.RecordPlanId;
    }

    /**
     * Set 录制计划ID
     * @param RecordPlanId 录制计划ID
     */
    public void setRecordPlanId(String RecordPlanId) {
        this.RecordPlanId = RecordPlanId;
    }

    /**
     * Get 录制开始时间 
     * @return StartTime 录制开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 录制开始时间
     * @param StartTime 录制开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 录制结束时间 
     * @return EndTime 录制结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 录制结束时间
     * @param EndTime 录制结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public LiveRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordItem(LiveRecordItem source) {
        if (source.IntID != null) {
            this.IntID = new Long(source.IntID);
        }
        if (source.LiveChannelId != null) {
            this.LiveChannelId = new String(source.LiveChannelId);
        }
        if (source.ExpectDeleteTime != null) {
            this.ExpectDeleteTime = new Long(source.ExpectDeleteTime);
        }
        if (source.RecordTimeLen != null) {
            this.RecordTimeLen = new Long(source.RecordTimeLen);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.RecordPlanId != null) {
            this.RecordPlanId = new String(source.RecordPlanId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntID", this.IntID);
        this.setParamSimple(map, prefix + "LiveChannelId", this.LiveChannelId);
        this.setParamSimple(map, prefix + "ExpectDeleteTime", this.ExpectDeleteTime);
        this.setParamSimple(map, prefix + "RecordTimeLen", this.RecordTimeLen);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "RecordPlanId", this.RecordPlanId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

