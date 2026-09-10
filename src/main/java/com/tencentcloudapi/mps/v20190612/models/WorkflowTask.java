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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTask extends AbstractModel {

    /**
    * <p>媒体处理任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>源异常时返回对应异常Message，否则请使用各个具体任务的 Message。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>媒体处理的目标文件信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>原始视频的元信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * <p>媒体处理任务的执行状态与结果。</p>
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * <p>视频内容审核任务的执行状态与结果。</p>
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * <p>视频内容分析任务的执行状态与结果。</p>
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * <p>视频内容识别任务的执行状态与结果。</p>
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
    * <p>媒体质检任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiQualityControlTaskResult")
    @Expose
    private ScheduleQualityControlTaskResult AiQualityControlTaskResult;

    /**
    * <p>智能字幕任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartSubtitlesTaskResult")
    @Expose
    private SmartSubtitlesResult [] SmartSubtitlesTaskResult;

    /**
    * <p>智能擦除任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartEraseTaskResult")
    @Expose
    private SmartEraseTaskResult SmartEraseTaskResult;

    /**
    * <p>AI配音任务的执行结果。</p>
    */
    @SerializedName("AiDubbingTaskResult")
    @Expose
    private AIDubbingTaskResult AiDubbingTaskResult;

    /**
     * Get <p>媒体处理任务 ID。</p> 
     * @return TaskId <p>媒体处理任务 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>媒体处理任务 ID。</p>
     * @param TaskId <p>媒体处理任务 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li> 
     * @return Status <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     * @param Status <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。</p> 
     * @return ErrCode <p>源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。</p>
     * @param ErrCode <p>源异常时返回非0错误码，返回0 时请使用各个具体任务的 ErrCode。</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>源异常时返回对应异常Message，否则请使用各个具体任务的 Message。</p> 
     * @return Message <p>源异常时返回对应异常Message，否则请使用各个具体任务的 Message。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>源异常时返回对应异常Message，否则请使用各个具体任务的 Message。</p>
     * @param Message <p>源异常时返回对应异常Message，否则请使用各个具体任务的 Message。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>媒体处理的目标文件信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputInfo <p>媒体处理的目标文件信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>媒体处理的目标文件信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputInfo <p>媒体处理的目标文件信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>原始视频的元信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaData <p>原始视频的元信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>原始视频的元信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData <p>原始视频的元信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get <p>媒体处理任务的执行状态与结果。</p> 
     * @return MediaProcessResultSet <p>媒体处理任务的执行状态与结果。</p>
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set <p>媒体处理任务的执行状态与结果。</p>
     * @param MediaProcessResultSet <p>媒体处理任务的执行状态与结果。</p>
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get <p>视频内容审核任务的执行状态与结果。</p> 
     * @return AiContentReviewResultSet <p>视频内容审核任务的执行状态与结果。</p>
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * Set <p>视频内容审核任务的执行状态与结果。</p>
     * @param AiContentReviewResultSet <p>视频内容审核任务的执行状态与结果。</p>
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * Get <p>视频内容分析任务的执行状态与结果。</p> 
     * @return AiAnalysisResultSet <p>视频内容分析任务的执行状态与结果。</p>
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * Set <p>视频内容分析任务的执行状态与结果。</p>
     * @param AiAnalysisResultSet <p>视频内容分析任务的执行状态与结果。</p>
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * Get <p>视频内容识别任务的执行状态与结果。</p> 
     * @return AiRecognitionResultSet <p>视频内容识别任务的执行状态与结果。</p>
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * Set <p>视频内容识别任务的执行状态与结果。</p>
     * @param AiRecognitionResultSet <p>视频内容识别任务的执行状态与结果。</p>
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    /**
     * Get <p>媒体质检任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiQualityControlTaskResult <p>媒体质检任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleQualityControlTaskResult getAiQualityControlTaskResult() {
        return this.AiQualityControlTaskResult;
    }

    /**
     * Set <p>媒体质检任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiQualityControlTaskResult <p>媒体质检任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiQualityControlTaskResult(ScheduleQualityControlTaskResult AiQualityControlTaskResult) {
        this.AiQualityControlTaskResult = AiQualityControlTaskResult;
    }

    /**
     * Get <p>智能字幕任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartSubtitlesTaskResult <p>智能字幕任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartSubtitlesResult [] getSmartSubtitlesTaskResult() {
        return this.SmartSubtitlesTaskResult;
    }

    /**
     * Set <p>智能字幕任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartSubtitlesTaskResult <p>智能字幕任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartSubtitlesTaskResult(SmartSubtitlesResult [] SmartSubtitlesTaskResult) {
        this.SmartSubtitlesTaskResult = SmartSubtitlesTaskResult;
    }

    /**
     * Get <p>智能擦除任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartEraseTaskResult <p>智能擦除任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartEraseTaskResult getSmartEraseTaskResult() {
        return this.SmartEraseTaskResult;
    }

    /**
     * Set <p>智能擦除任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartEraseTaskResult <p>智能擦除任务的执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartEraseTaskResult(SmartEraseTaskResult SmartEraseTaskResult) {
        this.SmartEraseTaskResult = SmartEraseTaskResult;
    }

    /**
     * Get <p>AI配音任务的执行结果。</p> 
     * @return AiDubbingTaskResult <p>AI配音任务的执行结果。</p>
     */
    public AIDubbingTaskResult getAiDubbingTaskResult() {
        return this.AiDubbingTaskResult;
    }

    /**
     * Set <p>AI配音任务的执行结果。</p>
     * @param AiDubbingTaskResult <p>AI配音任务的执行结果。</p>
     */
    public void setAiDubbingTaskResult(AIDubbingTaskResult AiDubbingTaskResult) {
        this.AiDubbingTaskResult = AiDubbingTaskResult;
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
        if (source.AiQualityControlTaskResult != null) {
            this.AiQualityControlTaskResult = new ScheduleQualityControlTaskResult(source.AiQualityControlTaskResult);
        }
        if (source.SmartSubtitlesTaskResult != null) {
            this.SmartSubtitlesTaskResult = new SmartSubtitlesResult[source.SmartSubtitlesTaskResult.length];
            for (int i = 0; i < source.SmartSubtitlesTaskResult.length; i++) {
                this.SmartSubtitlesTaskResult[i] = new SmartSubtitlesResult(source.SmartSubtitlesTaskResult[i]);
            }
        }
        if (source.SmartEraseTaskResult != null) {
            this.SmartEraseTaskResult = new SmartEraseTaskResult(source.SmartEraseTaskResult);
        }
        if (source.AiDubbingTaskResult != null) {
            this.AiDubbingTaskResult = new AIDubbingTaskResult(source.AiDubbingTaskResult);
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
        this.setParamObj(map, prefix + "AiQualityControlTaskResult.", this.AiQualityControlTaskResult);
        this.setParamArrayObj(map, prefix + "SmartSubtitlesTaskResult.", this.SmartSubtitlesTaskResult);
        this.setParamObj(map, prefix + "SmartEraseTaskResult.", this.SmartEraseTaskResult);
        this.setParamObj(map, prefix + "AiDubbingTaskResult.", this.AiDubbingTaskResult);

    }
}

