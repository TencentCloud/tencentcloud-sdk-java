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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaProcessTaskResult extends AbstractModel{

    /**
    * 编辑处理任务ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 编辑处理任务类型，取值：
MediaEditing：视频编辑（待上线）；
MediaCutting：视频剪切；
MediaJoining：视频拼接。
MediaRecognition：媒体识别；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 处理进度，范围：[0,100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 任务状态：
1100：等待中；
1200：执行中；
2000：成功；
5000：失败。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务错误码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 任务错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 剪切任务处理结果，当Type=MediaCutting时才有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaCuttingTaskResult")
    @Expose
    private MediaCuttingTaskResult MediaCuttingTaskResult;

    /**
    * 拼接任务处理结果，当Type=MediaJoining时才有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaJoiningTaskResult")
    @Expose
    private MediaJoiningTaskResult MediaJoiningTaskResult;

    /**
    * 媒体识别任务处理结果，当Type=MediaRecognition时才有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaRecognitionTaskResult")
    @Expose
    private MediaRecognitionTaskResult MediaRecognitionTaskResult;

    /**
     * Get 编辑处理任务ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 编辑处理任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 编辑处理任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 编辑处理任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 编辑处理任务类型，取值：
MediaEditing：视频编辑（待上线）；
MediaCutting：视频剪切；
MediaJoining：视频拼接。
MediaRecognition：媒体识别；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 编辑处理任务类型，取值：
MediaEditing：视频编辑（待上线）；
MediaCutting：视频剪切；
MediaJoining：视频拼接。
MediaRecognition：媒体识别；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 编辑处理任务类型，取值：
MediaEditing：视频编辑（待上线）；
MediaCutting：视频剪切；
MediaJoining：视频拼接。
MediaRecognition：媒体识别；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 编辑处理任务类型，取值：
MediaEditing：视频编辑（待上线）；
MediaCutting：视频剪切；
MediaJoining：视频拼接。
MediaRecognition：媒体识别；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 处理进度，范围：[0,100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 处理进度，范围：[0,100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 处理进度，范围：[0,100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 处理进度，范围：[0,100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务状态：
1100：等待中；
1200：执行中；
2000：成功；
5000：失败。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态：
1100：等待中；
1200：执行中；
2000：成功；
5000：失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态：
1100：等待中；
1200：执行中；
2000：成功；
5000：失败。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态：
1100：等待中；
1200：执行中；
2000：成功；
5000：失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务错误码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode 任务错误码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 任务错误码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 任务错误码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 任务错误信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 任务错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 任务错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 任务错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 剪切任务处理结果，当Type=MediaCutting时才有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaCuttingTaskResult 剪切任务处理结果，当Type=MediaCutting时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaCuttingTaskResult getMediaCuttingTaskResult() {
        return this.MediaCuttingTaskResult;
    }

    /**
     * Set 剪切任务处理结果，当Type=MediaCutting时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaCuttingTaskResult 剪切任务处理结果，当Type=MediaCutting时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaCuttingTaskResult(MediaCuttingTaskResult MediaCuttingTaskResult) {
        this.MediaCuttingTaskResult = MediaCuttingTaskResult;
    }

    /**
     * Get 拼接任务处理结果，当Type=MediaJoining时才有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaJoiningTaskResult 拼接任务处理结果，当Type=MediaJoining时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaJoiningTaskResult getMediaJoiningTaskResult() {
        return this.MediaJoiningTaskResult;
    }

    /**
     * Set 拼接任务处理结果，当Type=MediaJoining时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaJoiningTaskResult 拼接任务处理结果，当Type=MediaJoining时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaJoiningTaskResult(MediaJoiningTaskResult MediaJoiningTaskResult) {
        this.MediaJoiningTaskResult = MediaJoiningTaskResult;
    }

    /**
     * Get 媒体识别任务处理结果，当Type=MediaRecognition时才有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaRecognitionTaskResult 媒体识别任务处理结果，当Type=MediaRecognition时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaRecognitionTaskResult getMediaRecognitionTaskResult() {
        return this.MediaRecognitionTaskResult;
    }

    /**
     * Set 媒体识别任务处理结果，当Type=MediaRecognition时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaRecognitionTaskResult 媒体识别任务处理结果，当Type=MediaRecognition时才有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaRecognitionTaskResult(MediaRecognitionTaskResult MediaRecognitionTaskResult) {
        this.MediaRecognitionTaskResult = MediaRecognitionTaskResult;
    }

    public MediaProcessTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaProcessTaskResult(MediaProcessTaskResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.MediaCuttingTaskResult != null) {
            this.MediaCuttingTaskResult = new MediaCuttingTaskResult(source.MediaCuttingTaskResult);
        }
        if (source.MediaJoiningTaskResult != null) {
            this.MediaJoiningTaskResult = new MediaJoiningTaskResult(source.MediaJoiningTaskResult);
        }
        if (source.MediaRecognitionTaskResult != null) {
            this.MediaRecognitionTaskResult = new MediaRecognitionTaskResult(source.MediaRecognitionTaskResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamObj(map, prefix + "MediaCuttingTaskResult.", this.MediaCuttingTaskResult);
        this.setParamObj(map, prefix + "MediaJoiningTaskResult.", this.MediaJoiningTaskResult);
        this.setParamObj(map, prefix + "MediaRecognitionTaskResult.", this.MediaRecognitionTaskResult);

    }
}

