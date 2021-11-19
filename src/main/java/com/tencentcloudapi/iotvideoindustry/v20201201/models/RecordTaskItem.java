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

public class RecordTaskItem extends AbstractModel{

    /**
    * 录像任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordTaskId")
    @Expose
    private String RecordTaskId;

    /**
    * 录制计划ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordPlanId")
    @Expose
    private String RecordPlanId;

    /**
    * 本录制片段开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 本录制片段结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 录制模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 本录制片段对应的录制文件URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 本录制片段当前的录制状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordStatus")
    @Expose
    private Long RecordStatus;

    /**
    * 场景ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * 告警ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnId")
    @Expose
    private Long WarnId;

    /**
    * 录制id，NVR下属设备有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
     * Get 录像任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordTaskId 录像任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordTaskId() {
        return this.RecordTaskId;
    }

    /**
     * Set 录像任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordTaskId 录像任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordTaskId(String RecordTaskId) {
        this.RecordTaskId = RecordTaskId;
    }

    /**
     * Get 录制计划ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordPlanId 录制计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordPlanId() {
        return this.RecordPlanId;
    }

    /**
     * Set 录制计划ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordPlanId 录制计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordPlanId(String RecordPlanId) {
        this.RecordPlanId = RecordPlanId;
    }

    /**
     * Get 本录制片段开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 本录制片段开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 本录制片段开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 本录制片段开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 本录制片段结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 本录制片段结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 本录制片段结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 本录制片段结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 录制模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId 录制模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 录制模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId 录制模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 本录制片段对应的录制文件URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoUrl 本录制片段对应的录制文件URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 本录制片段对应的录制文件URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoUrl 本录制片段对应的录制文件URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 本录制片段当前的录制状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordStatus 本录制片段当前的录制状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordStatus() {
        return this.RecordStatus;
    }

    /**
     * Set 本录制片段当前的录制状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordStatus 本录制片段当前的录制状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordStatus(Long RecordStatus) {
        this.RecordStatus = RecordStatus;
    }

    /**
     * Get 场景ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneId 场景ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneId 场景ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 告警ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnId 告警ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarnId() {
        return this.WarnId;
    }

    /**
     * Set 告警ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnId 告警ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnId(Long WarnId) {
        this.WarnId = WarnId;
    }

    /**
     * Get 录制id，NVR下属设备有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 录制id，NVR下属设备有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 录制id，NVR下属设备有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 录制id，NVR下属设备有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
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

    }
}

