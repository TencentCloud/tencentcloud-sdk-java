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

public class ActivityResItem extends AbstractModel {

    /**
    * <p>转码任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeTask")
    @Expose
    private MediaProcessTaskTranscodeResult TranscodeTask;

    /**
    * <p>转动图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask;

    /**
    * <p>时间点截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask;

    /**
    * <p>采样截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SampleSnapshotTask;

    /**
    * <p>雪碧图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private MediaProcessTaskImageSpriteResult ImageSpriteTask;

    /**
    * <p>自适应码流任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
    * <p>识别任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecognitionTask")
    @Expose
    private ScheduleRecognitionTaskResult RecognitionTask;

    /**
    * <p>审核任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewTask")
    @Expose
    private ScheduleReviewTaskResult ReviewTask;

    /**
    * <p>分析任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisTask")
    @Expose
    private ScheduleAnalysisTaskResult AnalysisTask;

    /**
    * <p>媒体质检任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityControlTask")
    @Expose
    private ScheduleQualityControlTaskResult QualityControlTask;

    /**
    * <p>条件判断任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecRuleTask")
    @Expose
    private ScheduleExecRuleTaskResult ExecRuleTask;

    /**
    * <p>智能字幕任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private ScheduleSmartSubtitleTaskResult SmartSubtitlesTask;

    /**
    * <p>智能擦除任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private SmartEraseTaskResult SmartEraseTask;

    /**
    * <p>AI配音任务输出。</p>
    */
    @SerializedName("AIDubbingTask")
    @Expose
    private AIDubbingTaskResult AIDubbingTask;

    /**
     * Get <p>转码任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeTask <p>转码任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set <p>转码任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeTask <p>转码任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeTask(MediaProcessTaskTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get <p>转动图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnimatedGraphicTask <p>转动图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskAnimatedGraphicResult getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set <p>转动图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnimatedGraphicTask <p>转动图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnimatedGraphicTask(MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get <p>时间点截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetTask <p>时间点截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskSnapshotByTimeOffsetResult getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set <p>时间点截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetTask <p>时间点截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetTask(MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get <p>采样截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleSnapshotTask <p>采样截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskSampleSnapshotResult getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set <p>采样截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSnapshotTask <p>采样截图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSnapshotTask(MediaProcessTaskSampleSnapshotResult SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get <p>雪碧图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSpriteTask <p>雪碧图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskImageSpriteResult getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set <p>雪碧图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteTask <p>雪碧图任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteTask(MediaProcessTaskImageSpriteResult ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get <p>自适应码流任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdaptiveDynamicStreamingTask <p>自适应码流任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set <p>自适应码流任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingTask <p>自适应码流任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingTask(MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get <p>识别任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecognitionTask <p>识别任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleRecognitionTaskResult getRecognitionTask() {
        return this.RecognitionTask;
    }

    /**
     * Set <p>识别任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecognitionTask <p>识别任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecognitionTask(ScheduleRecognitionTaskResult RecognitionTask) {
        this.RecognitionTask = RecognitionTask;
    }

    /**
     * Get <p>审核任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewTask <p>审核任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleReviewTaskResult getReviewTask() {
        return this.ReviewTask;
    }

    /**
     * Set <p>审核任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewTask <p>审核任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewTask(ScheduleReviewTaskResult ReviewTask) {
        this.ReviewTask = ReviewTask;
    }

    /**
     * Get <p>分析任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisTask <p>分析任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleAnalysisTaskResult getAnalysisTask() {
        return this.AnalysisTask;
    }

    /**
     * Set <p>分析任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisTask <p>分析任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisTask(ScheduleAnalysisTaskResult AnalysisTask) {
        this.AnalysisTask = AnalysisTask;
    }

    /**
     * Get <p>媒体质检任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityControlTask <p>媒体质检任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleQualityControlTaskResult getQualityControlTask() {
        return this.QualityControlTask;
    }

    /**
     * Set <p>媒体质检任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityControlTask <p>媒体质检任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityControlTask(ScheduleQualityControlTaskResult QualityControlTask) {
        this.QualityControlTask = QualityControlTask;
    }

    /**
     * Get <p>条件判断任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecRuleTask <p>条件判断任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleExecRuleTaskResult getExecRuleTask() {
        return this.ExecRuleTask;
    }

    /**
     * Set <p>条件判断任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecRuleTask <p>条件判断任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecRuleTask(ScheduleExecRuleTaskResult ExecRuleTask) {
        this.ExecRuleTask = ExecRuleTask;
    }

    /**
     * Get <p>智能字幕任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartSubtitlesTask <p>智能字幕任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleSmartSubtitleTaskResult getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set <p>智能字幕任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartSubtitlesTask <p>智能字幕任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartSubtitlesTask(ScheduleSmartSubtitleTaskResult SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get <p>智能擦除任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartEraseTask <p>智能擦除任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartEraseTaskResult getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set <p>智能擦除任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartEraseTask <p>智能擦除任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartEraseTask(SmartEraseTaskResult SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
    }

    /**
     * Get <p>AI配音任务输出。</p> 
     * @return AIDubbingTask <p>AI配音任务输出。</p>
     */
    public AIDubbingTaskResult getAIDubbingTask() {
        return this.AIDubbingTask;
    }

    /**
     * Set <p>AI配音任务输出。</p>
     * @param AIDubbingTask <p>AI配音任务输出。</p>
     */
    public void setAIDubbingTask(AIDubbingTaskResult AIDubbingTask) {
        this.AIDubbingTask = AIDubbingTask;
    }

    public ActivityResItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityResItem(ActivityResItem source) {
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new MediaProcessTaskTranscodeResult(source.TranscodeTask);
        }
        if (source.AnimatedGraphicTask != null) {
            this.AnimatedGraphicTask = new MediaProcessTaskAnimatedGraphicResult(source.AnimatedGraphicTask);
        }
        if (source.SnapshotByTimeOffsetTask != null) {
            this.SnapshotByTimeOffsetTask = new MediaProcessTaskSnapshotByTimeOffsetResult(source.SnapshotByTimeOffsetTask);
        }
        if (source.SampleSnapshotTask != null) {
            this.SampleSnapshotTask = new MediaProcessTaskSampleSnapshotResult(source.SampleSnapshotTask);
        }
        if (source.ImageSpriteTask != null) {
            this.ImageSpriteTask = new MediaProcessTaskImageSpriteResult(source.ImageSpriteTask);
        }
        if (source.AdaptiveDynamicStreamingTask != null) {
            this.AdaptiveDynamicStreamingTask = new MediaProcessTaskAdaptiveDynamicStreamingResult(source.AdaptiveDynamicStreamingTask);
        }
        if (source.RecognitionTask != null) {
            this.RecognitionTask = new ScheduleRecognitionTaskResult(source.RecognitionTask);
        }
        if (source.ReviewTask != null) {
            this.ReviewTask = new ScheduleReviewTaskResult(source.ReviewTask);
        }
        if (source.AnalysisTask != null) {
            this.AnalysisTask = new ScheduleAnalysisTaskResult(source.AnalysisTask);
        }
        if (source.QualityControlTask != null) {
            this.QualityControlTask = new ScheduleQualityControlTaskResult(source.QualityControlTask);
        }
        if (source.ExecRuleTask != null) {
            this.ExecRuleTask = new ScheduleExecRuleTaskResult(source.ExecRuleTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new ScheduleSmartSubtitleTaskResult(source.SmartSubtitlesTask);
        }
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new SmartEraseTaskResult(source.SmartEraseTask);
        }
        if (source.AIDubbingTask != null) {
            this.AIDubbingTask = new AIDubbingTaskResult(source.AIDubbingTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "AnimatedGraphicTask.", this.AnimatedGraphicTask);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetTask.", this.SnapshotByTimeOffsetTask);
        this.setParamObj(map, prefix + "SampleSnapshotTask.", this.SampleSnapshotTask);
        this.setParamObj(map, prefix + "ImageSpriteTask.", this.ImageSpriteTask);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingTask.", this.AdaptiveDynamicStreamingTask);
        this.setParamObj(map, prefix + "RecognitionTask.", this.RecognitionTask);
        this.setParamObj(map, prefix + "ReviewTask.", this.ReviewTask);
        this.setParamObj(map, prefix + "AnalysisTask.", this.AnalysisTask);
        this.setParamObj(map, prefix + "QualityControlTask.", this.QualityControlTask);
        this.setParamObj(map, prefix + "ExecRuleTask.", this.ExecRuleTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);
        this.setParamObj(map, prefix + "AIDubbingTask.", this.AIDubbingTask);

    }
}

