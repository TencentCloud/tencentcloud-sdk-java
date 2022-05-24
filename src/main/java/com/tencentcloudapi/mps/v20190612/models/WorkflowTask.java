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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTask extends AbstractModel{

    /**
    * 媒体处理任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 已弃用，请使用各个具体任务的 ErrCode。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 已弃用，请使用各个具体任务的 Message。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 媒体处理任务的执行状态与结果。
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * 视频内容审核任务的执行状态与结果。
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * 视频内容分析任务的执行状态与结果。
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * 视频内容识别任务的执行状态与结果。
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
     * Get 媒体处理任务 ID。 
     * @return TaskId 媒体处理任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 媒体处理任务 ID。
     * @param TaskId 媒体处理任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li> 
     * @return Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @param Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 已弃用，请使用各个具体任务的 ErrCode。 
     * @return ErrCode 已弃用，请使用各个具体任务的 ErrCode。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 已弃用，请使用各个具体任务的 ErrCode。
     * @param ErrCode 已弃用，请使用各个具体任务的 ErrCode。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 已弃用，请使用各个具体任务的 Message。 
     * @return Message 已弃用，请使用各个具体任务的 Message。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 已弃用，请使用各个具体任务的 Message。
     * @param Message 已弃用，请使用各个具体任务的 Message。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputInfo 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputInfo 媒体处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaData 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get 媒体处理任务的执行状态与结果。 
     * @return MediaProcessResultSet 媒体处理任务的执行状态与结果。
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set 媒体处理任务的执行状态与结果。
     * @param MediaProcessResultSet 媒体处理任务的执行状态与结果。
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get 视频内容审核任务的执行状态与结果。 
     * @return AiContentReviewResultSet 视频内容审核任务的执行状态与结果。
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * Set 视频内容审核任务的执行状态与结果。
     * @param AiContentReviewResultSet 视频内容审核任务的执行状态与结果。
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * Get 视频内容分析任务的执行状态与结果。 
     * @return AiAnalysisResultSet 视频内容分析任务的执行状态与结果。
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * Set 视频内容分析任务的执行状态与结果。
     * @param AiAnalysisResultSet 视频内容分析任务的执行状态与结果。
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * Get 视频内容识别任务的执行状态与结果。 
     * @return AiRecognitionResultSet 视频内容识别任务的执行状态与结果。
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * Set 视频内容识别任务的执行状态与结果。
     * @param AiRecognitionResultSet 视频内容识别任务的执行状态与结果。
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    public WorkflowTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTask(WorkflowTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.MediaProcessResultSet != null) {
            this.MediaProcessResultSet = new MediaProcessTaskResult[source.MediaProcessResultSet.length];
            for (int i = 0; i < source.MediaProcessResultSet.length; i++) {
                this.MediaProcessResultSet[i] = new MediaProcessTaskResult(source.MediaProcessResultSet[i]);
            }
        }
        if (source.AiContentReviewResultSet != null) {
            this.AiContentReviewResultSet = new AiContentReviewResult[source.AiContentReviewResultSet.length];
            for (int i = 0; i < source.AiContentReviewResultSet.length; i++) {
                this.AiContentReviewResultSet[i] = new AiContentReviewResult(source.AiContentReviewResultSet[i]);
            }
        }
        if (source.AiAnalysisResultSet != null) {
            this.AiAnalysisResultSet = new AiAnalysisResult[source.AiAnalysisResultSet.length];
            for (int i = 0; i < source.AiAnalysisResultSet.length; i++) {
                this.AiAnalysisResultSet[i] = new AiAnalysisResult(source.AiAnalysisResultSet[i]);
            }
        }
        if (source.AiRecognitionResultSet != null) {
            this.AiRecognitionResultSet = new AiRecognitionResult[source.AiRecognitionResultSet.length];
            for (int i = 0; i < source.AiRecognitionResultSet.length; i++) {
                this.AiRecognitionResultSet[i] = new AiRecognitionResult(source.AiRecognitionResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "MediaProcessResultSet.", this.MediaProcessResultSet);
        this.setParamArrayObj(map, prefix + "AiContentReviewResultSet.", this.AiContentReviewResultSet);
        this.setParamArrayObj(map, prefix + "AiAnalysisResultSet.", this.AiAnalysisResultSet);
        this.setParamArrayObj(map, prefix + "AiRecognitionResultSet.", this.AiRecognitionResultSet);

    }
}

