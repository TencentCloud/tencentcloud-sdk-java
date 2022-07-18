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

public class ActivityResItem extends AbstractModel{

    /**
    * 转码任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeTask")
    @Expose
    private MediaProcessTaskTranscodeResult TranscodeTask;

    /**
    * 转动图任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask;

    /**
    * 时间点截图任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SnapshotByTimeOffsetTask;

    /**
    * 采样截图任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SampleSnapshotTask;

    /**
    * 雪碧图任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private MediaProcessTaskImageSpriteResult ImageSpriteTask;

    /**
    * 自适应码流任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
    * 识别任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecognitionTask")
    @Expose
    private ScheduleRecognitionTaskResult RecognitionTask;

    /**
    * 审核任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewTask")
    @Expose
    private ScheduleReviewTaskResult ReviewTask;

    /**
    * 分析任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisTask")
    @Expose
    private ScheduleAnalysisTaskResult AnalysisTask;

    /**
     * Get 转码任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeTask 转码任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set 转码任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeTask 转码任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeTask(MediaProcessTaskTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get 转动图任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnimatedGraphicTask 转动图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskAnimatedGraphicResult getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set 转动图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnimatedGraphicTask 转动图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnimatedGraphicTask(MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get 时间点截图任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetTask 时间点截图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskSampleSnapshotResult getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set 时间点截图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetTask 时间点截图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetTask(MediaProcessTaskSampleSnapshotResult SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get 采样截图任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleSnapshotTask 采样截图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskSampleSnapshotResult getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set 采样截图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSnapshotTask 采样截图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSnapshotTask(MediaProcessTaskSampleSnapshotResult SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get 雪碧图任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSpriteTask 雪碧图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskImageSpriteResult getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set 雪碧图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteTask 雪碧图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteTask(MediaProcessTaskImageSpriteResult ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get 自适应码流任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdaptiveDynamicStreamingTask 自适应码流任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set 自适应码流任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingTask 自适应码流任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingTask(MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get 识别任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecognitionTask 识别任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleRecognitionTaskResult getRecognitionTask() {
        return this.RecognitionTask;
    }

    /**
     * Set 识别任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecognitionTask 识别任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecognitionTask(ScheduleRecognitionTaskResult RecognitionTask) {
        this.RecognitionTask = RecognitionTask;
    }

    /**
     * Get 审核任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewTask 审核任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleReviewTaskResult getReviewTask() {
        return this.ReviewTask;
    }

    /**
     * Set 审核任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewTask 审核任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewTask(ScheduleReviewTaskResult ReviewTask) {
        this.ReviewTask = ReviewTask;
    }

    /**
     * Get 分析任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisTask 分析任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleAnalysisTaskResult getAnalysisTask() {
        return this.AnalysisTask;
    }

    /**
     * Set 分析任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisTask 分析任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisTask(ScheduleAnalysisTaskResult AnalysisTask) {
        this.AnalysisTask = AnalysisTask;
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
            this.SnapshotByTimeOffsetTask = new MediaProcessTaskSampleSnapshotResult(source.SnapshotByTimeOffsetTask);
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

    }
}

