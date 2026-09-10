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

public class ActivityPara extends AbstractModel {

    /**
    * <p>视频转码任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTaskInput TranscodeTask;

    /**
    * <p>视频转动图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private AnimatedGraphicTaskInput AnimatedGraphicTask;

    /**
    * <p>视频按时间点截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask;

    /**
    * <p>视频采样截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private SampleSnapshotTaskInput SampleSnapshotTask;

    /**
    * <p>视频截雪碧图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private ImageSpriteTaskInput ImageSpriteTask;

    /**
    * <p>转自适应码流任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask;

    /**
    * <p>视频内容审核类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * <p>视频内容分析类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>视频内容识别类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * <p>媒体质检任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityControlTask")
    @Expose
    private AiQualityControlTaskInput QualityControlTask;

    /**
    * <p>任务条件判断</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecRulesTask")
    @Expose
    private ExecRulesTask ExecRulesTask;

    /**
    * <p>智能字幕任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * <p>智能擦除任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private SmartEraseTaskInput SmartEraseTask;

    /**
    * <p>AI配音任务。</p>
    */
    @SerializedName("AIDubbingTask")
    @Expose
    private AIDubbingTaskInput AIDubbingTask;

    /**
     * Get <p>视频转码任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeTask <p>视频转码任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TranscodeTaskInput getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set <p>视频转码任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeTask <p>视频转码任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeTask(TranscodeTaskInput TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get <p>视频转动图任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnimatedGraphicTask <p>视频转动图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnimatedGraphicTaskInput getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set <p>视频转动图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnimatedGraphicTask <p>视频转动图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnimatedGraphicTask(AnimatedGraphicTaskInput AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get <p>视频按时间点截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetTask <p>视频按时间点截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotByTimeOffsetTaskInput getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set <p>视频按时间点截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetTask <p>视频按时间点截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get <p>视频采样截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleSnapshotTask <p>视频采样截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SampleSnapshotTaskInput getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set <p>视频采样截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSnapshotTask <p>视频采样截图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSnapshotTask(SampleSnapshotTaskInput SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get <p>视频截雪碧图任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSpriteTask <p>视频截雪碧图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageSpriteTaskInput getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set <p>视频截雪碧图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteTask <p>视频截雪碧图任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteTask(ImageSpriteTaskInput ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get <p>转自适应码流任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdaptiveDynamicStreamingTask <p>转自适应码流任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdaptiveDynamicStreamingTaskInput getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set <p>转自适应码流任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingTask <p>转自适应码流任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingTask(AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get <p>视频内容审核类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiContentReviewTask <p>视频内容审核类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set <p>视频内容审核类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiContentReviewTask <p>视频内容审核类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get <p>视频内容分析类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiAnalysisTask <p>视频内容分析类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>视频内容分析类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAnalysisTask <p>视频内容分析类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>视频内容识别类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiRecognitionTask <p>视频内容识别类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set <p>视频内容识别类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiRecognitionTask <p>视频内容识别类型任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get <p>媒体质检任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityControlTask <p>媒体质检任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiQualityControlTaskInput getQualityControlTask() {
        return this.QualityControlTask;
    }

    /**
     * Set <p>媒体质检任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityControlTask <p>媒体质检任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityControlTask(AiQualityControlTaskInput QualityControlTask) {
        this.QualityControlTask = QualityControlTask;
    }

    /**
     * Get <p>任务条件判断</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecRulesTask <p>任务条件判断</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExecRulesTask getExecRulesTask() {
        return this.ExecRulesTask;
    }

    /**
     * Set <p>任务条件判断</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecRulesTask <p>任务条件判断</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecRulesTask(ExecRulesTask ExecRulesTask) {
        this.ExecRulesTask = ExecRulesTask;
    }

    /**
     * Get <p>智能字幕任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartSubtitlesTask <p>智能字幕任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set <p>智能字幕任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartSubtitlesTask <p>智能字幕任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartSubtitlesTask(SmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get <p>智能擦除任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartEraseTask <p>智能擦除任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set <p>智能擦除任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartEraseTask <p>智能擦除任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartEraseTask(SmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
    }

    /**
     * Get <p>AI配音任务。</p> 
     * @return AIDubbingTask <p>AI配音任务。</p>
     */
    public AIDubbingTaskInput getAIDubbingTask() {
        return this.AIDubbingTask;
    }

    /**
     * Set <p>AI配音任务。</p>
     * @param AIDubbingTask <p>AI配音任务。</p>
     */
    public void setAIDubbingTask(AIDubbingTaskInput AIDubbingTask) {
        this.AIDubbingTask = AIDubbingTask;
    }

    public ActivityPara() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityPara(ActivityPara source) {
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new TranscodeTaskInput(source.TranscodeTask);
        }
        if (source.AnimatedGraphicTask != null) {
            this.AnimatedGraphicTask = new AnimatedGraphicTaskInput(source.AnimatedGraphicTask);
        }
        if (source.SnapshotByTimeOffsetTask != null) {
            this.SnapshotByTimeOffsetTask = new SnapshotByTimeOffsetTaskInput(source.SnapshotByTimeOffsetTask);
        }
        if (source.SampleSnapshotTask != null) {
            this.SampleSnapshotTask = new SampleSnapshotTaskInput(source.SampleSnapshotTask);
        }
        if (source.ImageSpriteTask != null) {
            this.ImageSpriteTask = new ImageSpriteTaskInput(source.ImageSpriteTask);
        }
        if (source.AdaptiveDynamicStreamingTask != null) {
            this.AdaptiveDynamicStreamingTask = new AdaptiveDynamicStreamingTaskInput(source.AdaptiveDynamicStreamingTask);
        }
        if (source.AiContentReviewTask != null) {
            this.AiContentReviewTask = new AiContentReviewTaskInput(source.AiContentReviewTask);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new AiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.QualityControlTask != null) {
            this.QualityControlTask = new AiQualityControlTaskInput(source.QualityControlTask);
        }
        if (source.ExecRulesTask != null) {
            this.ExecRulesTask = new ExecRulesTask(source.ExecRulesTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new SmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new SmartEraseTaskInput(source.SmartEraseTask);
        }
        if (source.AIDubbingTask != null) {
            this.AIDubbingTask = new AIDubbingTaskInput(source.AIDubbingTask);
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
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "QualityControlTask.", this.QualityControlTask);
        this.setParamObj(map, prefix + "ExecRulesTask.", this.ExecRulesTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);
        this.setParamObj(map, prefix + "AIDubbingTask.", this.AIDubbingTask);

    }
}

