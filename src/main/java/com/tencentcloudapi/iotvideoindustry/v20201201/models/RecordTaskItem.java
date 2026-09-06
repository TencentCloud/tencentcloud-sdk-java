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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordTaskItem extends AbstractModel {

    /**
    * <p>录像任务ID</p>
    */
    @SerializedName("RecordTaskId")
    @Expose
    private String RecordTaskId;

    /**
    * <p>录制计划ID</p>
    */
    @SerializedName("RecordPlanId")
    @Expose
    private String RecordPlanId;

    /**
    * <p>本录制片段开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>本录制片段结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>录制模式</p>
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * <p>本录制片段对应的录制文件URL</p>
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * <p>本录制片段当前的录制状态</p>
    */
    @SerializedName("RecordStatus")
    @Expose
    private Long RecordStatus;

    /**
    * <p>场景ID</p>
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * <p>告警ID</p>
    */
    @SerializedName("WarnId")
    @Expose
    private Long WarnId;

    /**
    * <p>录制id，NVR下属设备有效</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>视频自增ID</p>
    */
    @SerializedName("InitID")
    @Expose
    private Long InitID;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpectDeleteTime")
    @Expose
    private Long ExpectDeleteTime;

    /**
    * <p>录制时长</p>
    */
    @SerializedName("RecordTimeLen")
    @Expose
    private Long RecordTimeLen;

    /**
    * <p>文件大小</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
     * Get <p>录像任务ID</p> 
     * @return RecordTaskId <p>录像任务ID</p>
     */
    public String getRecordTaskId() {
        return this.RecordTaskId;
    }

    /**
     * Set <p>录像任务ID</p>
     * @param RecordTaskId <p>录像任务ID</p>
     */
    public void setRecordTaskId(String RecordTaskId) {
        this.RecordTaskId = RecordTaskId;
    }

    /**
     * Get <p>录制计划ID</p> 
     * @return RecordPlanId <p>录制计划ID</p>
     */
    public String getRecordPlanId() {
        return this.RecordPlanId;
    }

    /**
     * Set <p>录制计划ID</p>
     * @param RecordPlanId <p>录制计划ID</p>
     */
    public void setRecordPlanId(String RecordPlanId) {
        this.RecordPlanId = RecordPlanId;
    }

    /**
     * Get <p>本录制片段开始时间</p> 
     * @return StartTime <p>本录制片段开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>本录制片段开始时间</p>
     * @param StartTime <p>本录制片段开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>本录制片段结束时间</p> 
     * @return EndTime <p>本录制片段结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>本录制片段结束时间</p>
     * @param EndTime <p>本录制片段结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>录制模式</p> 
     * @return EventId <p>录制模式</p>
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>录制模式</p>
     * @param EventId <p>录制模式</p>
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>本录制片段对应的录制文件URL</p> 
     * @return VideoUrl <p>本录制片段对应的录制文件URL</p>
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set <p>本录制片段对应的录制文件URL</p>
     * @param VideoUrl <p>本录制片段对应的录制文件URL</p>
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get <p>本录制片段当前的录制状态</p> 
     * @return RecordStatus <p>本录制片段当前的录制状态</p>
     */
    public Long getRecordStatus() {
        return this.RecordStatus;
    }

    /**
     * Set <p>本录制片段当前的录制状态</p>
     * @param RecordStatus <p>本录制片段当前的录制状态</p>
     */
    public void setRecordStatus(Long RecordStatus) {
        this.RecordStatus = RecordStatus;
    }

    /**
     * Get <p>场景ID</p> 
     * @return SceneId <p>场景ID</p>
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set <p>场景ID</p>
     * @param SceneId <p>场景ID</p>
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get <p>告警ID</p> 
     * @return WarnId <p>告警ID</p>
     */
    public Long getWarnId() {
        return this.WarnId;
    }

    /**
     * Set <p>告警ID</p>
     * @param WarnId <p>告警ID</p>
     */
    public void setWarnId(Long WarnId) {
        this.WarnId = WarnId;
    }

    /**
     * Get <p>录制id，NVR下属设备有效</p> 
     * @return RecordId <p>录制id，NVR下属设备有效</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>录制id，NVR下属设备有效</p>
     * @param RecordId <p>录制id，NVR下属设备有效</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>视频自增ID</p> 
     * @return InitID <p>视频自增ID</p>
     */
    public Long getInitID() {
        return this.InitID;
    }

    /**
     * Set <p>视频自增ID</p>
     * @param InitID <p>视频自增ID</p>
     */
    public void setInitID(Long InitID) {
        this.InitID = InitID;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpectDeleteTime <p>过期时间</p>
     */
    public Long getExpectDeleteTime() {
        return this.ExpectDeleteTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpectDeleteTime <p>过期时间</p>
     */
    public void setExpectDeleteTime(Long ExpectDeleteTime) {
        this.ExpectDeleteTime = ExpectDeleteTime;
    }

    /**
     * Get <p>录制时长</p> 
     * @return RecordTimeLen <p>录制时长</p>
     */
    public Long getRecordTimeLen() {
        return this.RecordTimeLen;
    }

    /**
     * Set <p>录制时长</p>
     * @param RecordTimeLen <p>录制时长</p>
     */
    public void setRecordTimeLen(Long RecordTimeLen) {
        this.RecordTimeLen = RecordTimeLen;
    }

    /**
     * Get <p>文件大小</p> 
     * @return FileSize <p>文件大小</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小</p>
     * @param FileSize <p>文件大小</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    public RecordTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordTaskItem(RecordTaskItem source) {
        if (source.RecordTaskId != null) {
            this.RecordTaskId = new String(source.RecordTaskId);
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
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.RecordStatus != null) {
            this.RecordStatus = new Long(source.RecordStatus);
        }
        if (source.SceneId != null) {
            this.SceneId = new Long(source.SceneId);
        }
        if (source.WarnId != null) {
            this.WarnId = new Long(source.WarnId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.InitID != null) {
            this.InitID = new Long(source.InitID);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordTaskId", this.RecordTaskId);
        this.setParamSimple(map, prefix + "RecordPlanId", this.RecordPlanId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "RecordStatus", this.RecordStatus);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "WarnId", this.WarnId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "InitID", this.InitID);
        this.setParamSimple(map, prefix + "ExpectDeleteTime", this.ExpectDeleteTime);
        this.setParamSimple(map, prefix + "RecordTimeLen", this.RecordTimeLen);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

