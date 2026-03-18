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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>描述任务名称，指定后可根据名称筛选</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>媒资文件ID</p>
    */
    @SerializedName("MediaId")
    @Expose
    private String MediaId;

    /**
    * <p>任务执行状态</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>任务进度，范围为[0，100]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskProgress")
    @Expose
    private Float TaskProgress;

    /**
    * <p>任务执行时间</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTimeCost")
    @Expose
    private Long TaskTimeCost;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * <p>任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * <p>任务失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * <p>任务执行时指定的先验知识</p>
    */
    @SerializedName("MediaPreknownInfo")
    @Expose
    private MediaPreknownInfo MediaPreknownInfo;

    /**
    * <p>媒资文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>媒资自定义标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>任务分析完成后的后调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

    /**
    * <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioMetadata")
    @Expose
    private AudioMetadata AudioMetadata;

    /**
    * <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageMetadata")
    @Expose
    private ImageMetadata ImageMetadata;

    /**
    * <p>任务对应的媒资文件元信息，仅在MediaType为Text时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextMetadata")
    @Expose
    private TextMetadata TextMetadata;

    /**
    * <p>任务对应的媒资文件元信息，仅在MediaType为Video时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private MediaMetadata Metadata;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>描述任务名称，指定后可根据名称筛选</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>描述任务名称，指定后可根据名称筛选</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>描述任务名称，指定后可根据名称筛选</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>描述任务名称，指定后可根据名称筛选</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>媒资文件ID</p> 
     * @return MediaId <p>媒资文件ID</p>
     */
    public String getMediaId() {
        return this.MediaId;
    }

    /**
     * Set <p>媒资文件ID</p>
     * @param MediaId <p>媒资文件ID</p>
     */
    public void setMediaId(String MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get <p>任务执行状态</p> 
     * @return TaskStatus <p>任务执行状态</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务执行状态</p>
     * @param TaskStatus <p>任务执行状态</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>任务进度，范围为[0，100]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskProgress <p>任务进度，范围为[0，100]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskProgress() {
        return this.TaskProgress;
    }

    /**
     * Set <p>任务进度，范围为[0，100]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskProgress <p>任务进度，范围为[0，100]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskProgress(Float TaskProgress) {
        this.TaskProgress = TaskProgress;
    }

    /**
     * Get <p>任务执行时间</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTimeCost <p>任务执行时间</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTimeCost() {
        return this.TaskTimeCost;
    }

    /**
     * Set <p>任务执行时间</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTimeCost <p>任务执行时间</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTimeCost(Long TaskTimeCost) {
        this.TaskTimeCost = TaskTimeCost;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return TaskCreateTime <p>任务创建时间</p>
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param TaskCreateTime <p>任务创建时间</p>
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get <p>任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStartTime <p>任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set <p>任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStartTime <p>任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
    }

    /**
     * Get <p>任务失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedReason <p>任务失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set <p>任务失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedReason <p>任务失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get <p>任务执行时指定的先验知识</p> 
     * @return MediaPreknownInfo <p>任务执行时指定的先验知识</p>
     */
    public MediaPreknownInfo getMediaPreknownInfo() {
        return this.MediaPreknownInfo;
    }

    /**
     * Set <p>任务执行时指定的先验知识</p>
     * @param MediaPreknownInfo <p>任务执行时指定的先验知识</p>
     */
    public void setMediaPreknownInfo(MediaPreknownInfo MediaPreknownInfo) {
        this.MediaPreknownInfo = MediaPreknownInfo;
    }

    /**
     * Get <p>媒资文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaName <p>媒资文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>媒资文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaName <p>媒资文件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>媒资自定义标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label <p>媒资自定义标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>媒资自定义标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label <p>媒资自定义标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>任务分析完成后的后调地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackURL <p>任务分析完成后的后调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set <p>任务分析完成后的后调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackURL <p>任务分析完成后的后调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    /**
     * Get <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioMetadata <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioMetadata getAudioMetadata() {
        return this.AudioMetadata;
    }

    /**
     * Set <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioMetadata <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioMetadata(AudioMetadata AudioMetadata) {
        this.AudioMetadata = AudioMetadata;
    }

    /**
     * Get <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageMetadata <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageMetadata getImageMetadata() {
        return this.ImageMetadata;
    }

    /**
     * Set <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageMetadata <p>任务对应的媒资文件元信息，仅在MediaType为Audio时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageMetadata(ImageMetadata ImageMetadata) {
        this.ImageMetadata = ImageMetadata;
    }

    /**
     * Get <p>任务对应的媒资文件元信息，仅在MediaType为Text时有效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextMetadata <p>任务对应的媒资文件元信息，仅在MediaType为Text时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextMetadata getTextMetadata() {
        return this.TextMetadata;
    }

    /**
     * Set <p>任务对应的媒资文件元信息，仅在MediaType为Text时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextMetadata <p>任务对应的媒资文件元信息，仅在MediaType为Text时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextMetadata(TextMetadata TextMetadata) {
        this.TextMetadata = TextMetadata;
    }

    /**
     * Get <p>任务对应的媒资文件元信息，仅在MediaType为Video时有效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata <p>任务对应的媒资文件元信息，仅在MediaType为Video时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>任务对应的媒资文件元信息，仅在MediaType为Video时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata <p>任务对应的媒资文件元信息，仅在MediaType为Video时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(MediaMetadata Metadata) {
        this.Metadata = Metadata;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.MediaId != null) {
            this.MediaId = new String(source.MediaId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskProgress != null) {
            this.TaskProgress = new Float(source.TaskProgress);
        }
        if (source.TaskTimeCost != null) {
            this.TaskTimeCost = new Long(source.TaskTimeCost);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.MediaPreknownInfo != null) {
            this.MediaPreknownInfo = new MediaPreknownInfo(source.MediaPreknownInfo);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
        if (source.AudioMetadata != null) {
            this.AudioMetadata = new AudioMetadata(source.AudioMetadata);
        }
        if (source.ImageMetadata != null) {
            this.ImageMetadata = new ImageMetadata(source.ImageMetadata);
        }
        if (source.TextMetadata != null) {
            this.TextMetadata = new TextMetadata(source.TextMetadata);
        }
        if (source.Metadata != null) {
            this.Metadata = new MediaMetadata(source.Metadata);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskProgress", this.TaskProgress);
        this.setParamSimple(map, prefix + "TaskTimeCost", this.TaskTimeCost);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamObj(map, prefix + "MediaPreknownInfo.", this.MediaPreknownInfo);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);
        this.setParamObj(map, prefix + "AudioMetadata.", this.AudioMetadata);
        this.setParamObj(map, prefix + "ImageMetadata.", this.ImageMetadata);
        this.setParamObj(map, prefix + "TextMetadata.", this.TextMetadata);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);

    }
}

